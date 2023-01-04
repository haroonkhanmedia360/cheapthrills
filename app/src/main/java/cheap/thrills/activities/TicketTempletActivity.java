package cheap.thrills.activities;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Timer;

import cheap.thrills.R;
import cheap.thrills.UniversalResortApplication;
import cheap.thrills.adapters.TicketViewAdapter;
import cheap.thrills.fonts.ButtonArialMedium;
import cheap.thrills.location.LocationService;
import cheap.thrills.location.Utils;
import cheap.thrills.models.Order;
import cheap.thrills.models.Profile;
import cheap.thrills.retrofit.RestClient;
import cheap.thrills.utils.UniversalOrlandoPreference;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TicketTempletActivity extends BaseActivity  {

    private static final String TAG = "TicketTempletActivity";
    private RecyclerView rvTickets;
    private List<Order> orderList;
    private TicketViewAdapter ticketViewAdapter;
    private ImageButton btnClose;
    private ButtonArialMedium btnViewTickets, btnLogout;
    Timer socketTimer;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_ticket_templet);

        orderList = UniversalOrlandoPreference.readList(this);
        rvTickets = findViewById(R.id.rvTickets);
        btnViewTickets = findViewById(R.id.btnViewTickets);
        btnLogout = findViewById(R.id.btnLogout);
        btnClose = findViewById(R.id.btnClose);

        rvTickets.setHasFixedSize(true);
        rvTickets.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        if (!(orderList == null)) {
            ticketViewAdapter = new TicketViewAdapter(orderList, TicketTempletActivity.this, UniversalOrlandoPreference.readString(TicketTempletActivity.this, UniversalOrlandoPreference.THEMEPARK_NAME, ""));
            rvTickets.setAdapter(ticketViewAdapter);
        }


        btnViewTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnViewTickets.setVisibility(View.GONE);
                btnLogout.setVisibility(View.GONE);
                rvTickets.setVisibility(View.VISIBLE);
                btnClose.setVisibility(View.VISIBLE);

                showProgressDialog(TicketTempletActivity.this);
                RestClient.get().ticketsList(UniversalOrlandoPreference.readString(TicketTempletActivity.this, UniversalOrlandoPreference.MOBILE, ""), UniversalOrlandoPreference.readString(TicketTempletActivity.this, UniversalOrlandoPreference.LOGIN_ID, "")).enqueue(new Callback<Profile>() {
                    @Override
                    public void onResponse(Call<Profile> call, Response<Profile> response) {
                        dismissProgressDailog();
                        if (response.isSuccessful()) {
                            orderList = response.body().getOrderDetails();
                            UniversalOrlandoPreference.writeString(TicketTempletActivity.this, UniversalOrlandoPreference.THEMEPARK_NAME, response.body().getThemeParkName());
                            if (!(orderList == null)) {
                                ticketViewAdapter = new TicketViewAdapter(orderList, TicketTempletActivity.this, UniversalOrlandoPreference.readString(TicketTempletActivity.this, UniversalOrlandoPreference.THEMEPARK_NAME, ""));
                                rvTickets.setAdapter(ticketViewAdapter);
                            }
                            ticketViewAdapter.notifyDataSetChanged();
                            if (Integer.valueOf(response.body().getStatus()) == 404) {
                                alertErrorDialog(TicketTempletActivity.this, response.body().getMessage());
                            } else if (Integer.valueOf(response.body().getStatus()) == 399) {
                                alertErrorDialog(TicketTempletActivity.this, response.body().getMessage());
                            } else if (Integer.valueOf(response.body().getStatus()) == 401) {
                                alertErrorDialog(TicketTempletActivity.this, response.body().getMessage());
                            }
                        } else {
                            showToastAlert(TicketTempletActivity.this, "Tickets are not found");
                        }
                    }

                    @Override
                    public void onFailure(Call<Profile> call, Throwable t) {

                    }
                });
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logOut(TicketTempletActivity.this);
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnViewTickets.setVisibility(View.VISIBLE);
                btnLogout.setVisibility(View.VISIBLE);
                rvTickets.setVisibility(View.GONE);
                btnClose.setVisibility(View.GONE);
            }
        });
    }

    public void logOut(Activity activity) {
        UniversalResortApplication.profile = null;
        SharedPreferences preferences = UniversalOrlandoPreference.getPreferences(activity);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(UniversalOrlandoPreference.IS_LOGIN,false).apply();
        Toast.makeText(activity, getString(R.string.signedOut), Toast.LENGTH_LONG).show();
        Intent i = new Intent(activity, OrderIdLoginActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(i);
        activity.finish();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (checkLocationPermission()) {
            Intent intent = new Intent(TicketTempletActivity.this, LocationService.class);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                getApplicationContext().startForegroundService(intent);
            } else getApplicationContext().startService(intent);
        }
        Log.d("testttting", "ticket template ");
    }

    private void showGPSAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("GPS OFF Alert");
        builder.setCancelable(false);
        builder.setMessage("Turn GPS on for location updates");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
                gpsLauncher.launch(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            }
        });
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
                showPermissionAlert();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private Boolean checkLocationPermission() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                permissionLauncher.launch(Manifest.permission.ACCESS_BACKGROUND_LOCATION);
            } else permissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION);
            return false;
        } else return true;

    }

    private ActivityResultLauncher<String> permissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
                if (!isGranted)
                    showPermissionAlert();
            });

    private ActivityResultLauncher<Intent> gpsLauncher =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
                if (Utils.INSTANCE.isLocationServiceEnabled(this)) {
                    onResume();
                } else {
                    showGPSAlert();
                }

            });

    private void showPermissionAlert() {
        String txt = "Your ticket only works when you are close to the main entrance.\n\n" +
                "You need to allow location ALWAYS, in order to view your tickets";

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Permission Mandatory!!");
        builder.setMessage(txt);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    permissionLauncher.launch(Manifest.permission.ACCESS_BACKGROUND_LOCATION);
                } else permissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION);
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();


    }



}
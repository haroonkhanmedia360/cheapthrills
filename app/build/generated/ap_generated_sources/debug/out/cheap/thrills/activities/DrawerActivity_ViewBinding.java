// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.drawerlayout.widget.DrawerLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialBold;
import cheap.thrills.fonts.TextViewGotham;
import com.google.android.material.navigation.NavigationView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DrawerActivity_ViewBinding implements Unbinder {
  private DrawerActivity target;

  private View view7f09010a;

  private View view7f090118;

  private View view7f09011b;

  private View view7f0900f5;

  private View view7f090102;

  private View view7f09010f;

  private View view7f09016c;

  private View view7f0900f3;

  private View view7f0900f1;

  private View view7f090112;

  private View view7f090106;

  private View view7f090110;

  private View view7f0900b6;

  private View view7f090114;

  private View view7f0900fb;

  private View view7f0900fa;

  private View view7f0900fe;

  private View view7f0900ff;

  private View view7f0900f0;

  private View view7f090107;

  private View view7f090111;

  private View view7f0900fd;

  private View view7f0900f7;

  private View view7f090119;

  private View view7f090121;

  private View view7f090104;

  private View view7f09011f;

  private View view7f090120;

  private View view7f090125;

  private View view7f09011e;

  private View view7f090117;

  private View view7f090103;

  private View view7f090122;

  private View view7f090123;

  private View view7f09010c;

  private View view7f090124;

  private View view7f0900f4;

  private View view7f090101;

  private View view7f090127;

  private View view7f09011a;

  private View view7f09010b;

  @UiThread
  public DrawerActivity_ViewBinding(DrawerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DrawerActivity_ViewBinding(final DrawerActivity target, View source) {
    this.target = target;

    View view;
    target.tvVirtual = Utils.findRequiredViewAsType(source, R.id.tvVirtual, "field 'tvVirtual'", TextView.class);
    target.ivVirtualLines = Utils.findRequiredViewAsType(source, R.id.ivVirtualLines, "field 'ivVirtualLines'", ImageView.class);
    target.tvHorrorNights = Utils.findRequiredViewAsType(source, R.id.tvHorrorNights, "field 'tvHorrorNights'", TextView.class);
    target.ivHalloween = Utils.findRequiredViewAsType(source, R.id.ivHalloweeen, "field 'ivHalloween'", ImageView.class);
    target.tvToolBarTittle = Utils.findRequiredViewAsType(source, R.id.tvToolBarTittle, "field 'tvToolBarTittle'", TextViewGotham.class);
    target.tvSignIn = Utils.findRequiredViewAsType(source, R.id.tvSignIn, "field 'tvSignIn'", TextView.class);
    target.tvPrivacyAndLegal = Utils.findRequiredViewAsType(source, R.id.tvPrivacyAndLegal, "field 'tvPrivacyAndLegal'", TextView.class);
    target.tvLostAndFound = Utils.findRequiredViewAsType(source, R.id.tvLostAndFound, "field 'tvLostAndFound'", TextView.class);
    target.ivThingsToDo = Utils.findRequiredViewAsType(source, R.id.ivThingsToDo, "field 'ivThingsToDo'", ImageView.class);
    target.ivBuyDownUp = Utils.findRequiredViewAsType(source, R.id.ivBuyDownUp, "field 'ivBuyDownUp'", ImageView.class);
    target.llRides = Utils.findRequiredViewAsType(source, R.id.llRides, "field 'llRides'", LinearLayout.class);
    target.llShows = Utils.findRequiredViewAsType(source, R.id.llShows, "field 'llShows'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.llOnsiteHotels, "field 'llOnsiteHotels' and method 'onClick'");
    target.llOnsiteHotels = Utils.castView(view, R.id.llOnsiteHotels, "field 'llOnsiteHotels'", LinearLayout.class);
    view7f09010a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llSignOut1, "field 'llSignOut' and method 'onClick'");
    target.llSignOut = Utils.castView(view, R.id.llSignOut1, "field 'llSignOut'", LinearLayout.class);
    view7f090118 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llThemePark, "field 'llThemePark' and method 'onClick'");
    target.llThemePark = Utils.castView(view, R.id.llThemePark, "field 'llThemePark'", LinearLayout.class);
    view7f09011b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llBuy, "field 'llBuy' and method 'onClick'");
    target.llBuy = Utils.castView(view, R.id.llBuy, "field 'llBuy'", LinearLayout.class);
    view7f0900f5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llHelp, "field 'llHelp' and method 'onClick'");
    target.llHelp = Utils.castView(view, R.id.llHelp, "field 'llHelp'", LinearLayout.class);
    view7f090102 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llPrivacy, "field 'llPrivacy' and method 'onClick'");
    target.llPrivacy = Utils.castView(view, R.id.llPrivacy, "field 'llPrivacy'", LinearLayout.class);
    view7f09010f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llEvents = Utils.findRequiredViewAsType(source, R.id.llEvents, "field 'llEvents'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.search, "field 'ivSearch' and method 'onClick'");
    target.ivSearch = Utils.castView(view, R.id.search, "field 'ivSearch'", ImageView.class);
    view7f09016c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llAmeletiesOptions = Utils.findRequiredViewAsType(source, R.id.llAmebitiesOptions, "field 'llAmeletiesOptions'", LinearLayout.class);
    target.ivAmenitiesDownUp = Utils.findRequiredViewAsType(source, R.id.ivAmenitiesDownUp, "field 'ivAmenitiesDownUp'", ImageView.class);
    target.ivGuestServiceDownUp = Utils.findRequiredViewAsType(source, R.id.ivGuestServiceDownUp, "field 'ivGuestServiceDownUp'", ImageView.class);
    target.llDining = Utils.findRequiredViewAsType(source, R.id.llDining, "field 'llDining'", LinearLayout.class);
    target.llShopping = Utils.findRequiredViewAsType(source, R.id.llShopping, "field 'llShopping'", LinearLayout.class);
    target.tryLinearSlide = Utils.findRequiredViewAsType(source, R.id.tryLinearSlide, "field 'tryLinearSlide'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.llAmexSpecialOffers, "field 'llAMEXSpecial' and method 'onClick'");
    target.llAMEXSpecial = Utils.castView(view, R.id.llAmexSpecialOffers, "field 'llAMEXSpecial'", LinearLayout.class);
    view7f0900f3 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llAmebities, "field 'llAmebities' and method 'onClick'");
    target.llAmebities = Utils.castView(view, R.id.llAmebities, "field 'llAmebities'", LinearLayout.class);
    view7f0900f1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llRestRoom, "field 'llRestRooms' and method 'onClick'");
    target.llRestRooms = Utils.castView(view, R.id.llRestRoom, "field 'llRestRooms'", LinearLayout.class);
    view7f090112 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llLockers, "field 'llLockers' and method 'onClick'");
    target.llLockers = Utils.castView(view, R.id.llLockers, "field 'llLockers'", LinearLayout.class);
    view7f090106 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llRentalServices, "field 'llRental' and method 'onClick'");
    target.llRental = Utils.castView(view, R.id.llRentalServices, "field 'llRental'", LinearLayout.class);
    view7f090110 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ivAlert, "field 'ivAlert' and method 'onClick'");
    target.ivAlert = Utils.castView(view, R.id.ivAlert, "field 'ivAlert'", ImageView.class);
    view7f0900b6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.nav_view = Utils.findRequiredViewAsType(source, R.id.nav_view, "field 'nav_view'", NavigationView.class);
    view = Utils.findRequiredView(source, R.id.llSettings, "field 'llSettings' and method 'onClick'");
    target.llSettings = Utils.castView(view, R.id.llSettings, "field 'llSettings'", LinearLayout.class);
    view7f090114 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llExtras, "field 'llExtras' and method 'onClick'");
    target.llExtras = Utils.castView(view, R.id.llExtras, "field 'llExtras'", LinearLayout.class);
    view7f0900fb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llExpress, "field 'llExpressPass' and method 'onClick'");
    target.llExpressPass = Utils.castView(view, R.id.llExpress, "field 'llExpressPass'", LinearLayout.class);
    view7f0900fa = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llGuestService, "field 'llGuestService' and method 'onClick'");
    target.llGuestService = Utils.castView(view, R.id.llGuestService, "field 'llGuestService'", LinearLayout.class);
    view7f0900fe = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llGuestServiceLocations, "field 'llGuestServiceLocations' and method 'onClick'");
    target.llGuestServiceLocations = Utils.castView(view, R.id.llGuestServiceLocations, "field 'llGuestServiceLocations'", LinearLayout.class);
    view7f0900ff = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llATMS, "field 'llATMS' and method 'onClick'");
    target.llATMS = Utils.castView(view, R.id.llATMS, "field 'llATMS'", LinearLayout.class);
    view7f0900f0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llLostFound, "field 'llLostFound' and method 'onClick'");
    target.llLostFound = Utils.castView(view, R.id.llLostFound, "field 'llLostFound'", LinearLayout.class);
    view7f090107 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llRestAreas, "field 'llServiceAnimal' and method 'onClick'");
    target.llServiceAnimal = Utils.castView(view, R.id.llRestAreas, "field 'llServiceAnimal'", LinearLayout.class);
    view7f090111 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llFirstAid, "field 'llFirstAid' and method 'onClick'");
    target.llFirstAid = Utils.castView(view, R.id.llFirstAid, "field 'llFirstAid'", LinearLayout.class);
    view7f0900fd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llContactGuest, "field 'llContacts' and method 'onClick'");
    target.llContacts = Utils.castView(view, R.id.llContactGuest, "field 'llContacts'", LinearLayout.class);
    view7f0900f7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llSmokingPermitted, "field 'llSmoking' and method 'onClick'");
    target.llSmoking = Utils.castView(view, R.id.llSmokingPermitted, "field 'llSmoking'", LinearLayout.class);
    view7f090119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llParkingReminder = Utils.findRequiredViewAsType(source, R.id.llParkingAmenities, "field 'llParkingReminder'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.llUniversalcityWalk, "field 'llUniversalCityWalk' and method 'onClick'");
    target.llUniversalCityWalk = Utils.castView(view, R.id.llUniversalcityWalk, "field 'llUniversalCityWalk'", LinearLayout.class);
    view7f090121 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llIslandOfAdventure, "field 'llIslandsOfAdventure' and method 'onClick'");
    target.llIslandsOfAdventure = Utils.castView(view, R.id.llIslandOfAdventure, "field 'llIslandsOfAdventure'", LinearLayout.class);
    view7f090104 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llUniversalStudios, "field 'llUniversalStudios' and method 'onClick'");
    target.llUniversalStudios = Utils.castView(view, R.id.llUniversalStudios, "field 'llUniversalStudios'", LinearLayout.class);
    view7f09011f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llUniversalVolcanos, "field 'llUniversalVolcano' and method 'onClick'");
    target.llUniversalVolcano = Utils.castView(view, R.id.llUniversalVolcanos, "field 'llUniversalVolcano'", LinearLayout.class);
    view7f090120 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llThingsToDoOption = Utils.findRequiredViewAsType(source, R.id.llThingsToDoOptions, "field 'llThingsToDoOption'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.llthingsToDo, "field 'llthingsToDo' and method 'onClick'");
    target.llthingsToDo = Utils.castView(view, R.id.llthingsToDo, "field 'llthingsToDo'", LinearLayout.class);
    view7f090125 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llTickets, "field 'llTickets' and method 'onClick'");
    target.llTickets = Utils.castView(view, R.id.llTickets, "field 'llTickets'", LinearLayout.class);
    view7f09011e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llSignIn, "field 'llSignIn' and method 'onClick'");
    target.llSignIn = Utils.castView(view, R.id.llSignIn, "field 'llSignIn'", LinearLayout.class);
    view7f090117 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llGuestServicesOption = Utils.findRequiredViewAsType(source, R.id.llGuestServicesOption, "field 'llGuestServicesOption'", LinearLayout.class);
    target.llThemeParksOptions = Utils.findRequiredViewAsType(source, R.id.llThemeParksOptions, "field 'llThemeParksOptions'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.llHome, "field 'llHome' and method 'onClick'");
    target.llHome = Utils.castView(view, R.id.llHome, "field 'llHome'", LinearLayout.class);
    view7f090103 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llWallet, "field 'llWallet' and method 'onClick'");
    target.llWallet = Utils.castView(view, R.id.llWallet, "field 'llWallet'", LinearLayout.class);
    view7f090122 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llfav, "field 'llFav' and method 'onClick'");
    target.llFav = Utils.castView(view, R.id.llfav, "field 'llFav'", LinearLayout.class);
    view7f090123 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llBuyOptions = Utils.findRequiredViewAsType(source, R.id.llBuyOptions, "field 'llBuyOptions'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.llParkNotification, "field 'llPark' and method 'onClick'");
    target.llPark = Utils.castView(view, R.id.llParkNotification, "field 'llPark'", LinearLayout.class);
    view7f09010c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llparkdirections, "field 'llDirections' and method 'onClick'");
    target.llDirections = Utils.castView(view, R.id.llparkdirections, "field 'llDirections'", LinearLayout.class);
    view7f090124 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llBlockOutDates, "field 'llDates' and method 'onClick'");
    target.llDates = Utils.castView(view, R.id.llBlockOutDates, "field 'llDates'", LinearLayout.class);
    view7f0900f4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llHalloween, "field 'llHalloween' and method 'onClick'");
    target.llHalloween = Utils.castView(view, R.id.llHalloween, "field 'llHalloween'", LinearLayout.class);
    view7f090101 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llvirtualLine, "field 'llvirtualLine' and method 'onClick'");
    target.llvirtualLine = Utils.castView(view, R.id.llvirtualLine, "field 'llvirtualLine'", LinearLayout.class);
    view7f090127 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llSpecialOffers, "field 'llSpecial' and method 'onClick'");
    target.llSpecial = Utils.castView(view, R.id.llSpecialOffers, "field 'llSpecial'", LinearLayout.class);
    view7f09011a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.llOrders, "field 'llOrder' and method 'onClick'");
    target.llOrder = Utils.castView(view, R.id.llOrders, "field 'llOrder'", LinearLayout.class);
    view7f09010b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.drawer = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawer'", DrawerLayout.class);
    target.ivBuyDownUpThemePark = Utils.findRequiredViewAsType(source, R.id.ivBuyDownUpThemePark, "field 'ivBuyDownUpThemePark'", ImageView.class);
    target.ivGuestService = Utils.findRequiredViewAsType(source, R.id.ivGuestService, "field 'ivGuestService'", ImageView.class);
    target.tvSignOut = Utils.findRequiredViewAsType(source, R.id.tvSignOut, "field 'tvSignOut'", TextViewArialBold.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DrawerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvVirtual = null;
    target.ivVirtualLines = null;
    target.tvHorrorNights = null;
    target.ivHalloween = null;
    target.tvToolBarTittle = null;
    target.tvSignIn = null;
    target.tvPrivacyAndLegal = null;
    target.tvLostAndFound = null;
    target.ivThingsToDo = null;
    target.ivBuyDownUp = null;
    target.llRides = null;
    target.llShows = null;
    target.llOnsiteHotels = null;
    target.llSignOut = null;
    target.llThemePark = null;
    target.llBuy = null;
    target.llHelp = null;
    target.llPrivacy = null;
    target.llEvents = null;
    target.ivSearch = null;
    target.llAmeletiesOptions = null;
    target.ivAmenitiesDownUp = null;
    target.ivGuestServiceDownUp = null;
    target.llDining = null;
    target.llShopping = null;
    target.tryLinearSlide = null;
    target.llAMEXSpecial = null;
    target.llAmebities = null;
    target.llRestRooms = null;
    target.llLockers = null;
    target.llRental = null;
    target.ivAlert = null;
    target.nav_view = null;
    target.llSettings = null;
    target.llExtras = null;
    target.llExpressPass = null;
    target.llGuestService = null;
    target.llGuestServiceLocations = null;
    target.llATMS = null;
    target.llLostFound = null;
    target.llServiceAnimal = null;
    target.llFirstAid = null;
    target.llContacts = null;
    target.llSmoking = null;
    target.llParkingReminder = null;
    target.llUniversalCityWalk = null;
    target.llIslandsOfAdventure = null;
    target.llUniversalStudios = null;
    target.llUniversalVolcano = null;
    target.llThingsToDoOption = null;
    target.llthingsToDo = null;
    target.llTickets = null;
    target.llSignIn = null;
    target.llGuestServicesOption = null;
    target.llThemeParksOptions = null;
    target.llHome = null;
    target.llWallet = null;
    target.llFav = null;
    target.llBuyOptions = null;
    target.llPark = null;
    target.llDirections = null;
    target.llDates = null;
    target.llHalloween = null;
    target.llvirtualLine = null;
    target.llSpecial = null;
    target.llOrder = null;
    target.drawer = null;
    target.ivBuyDownUpThemePark = null;
    target.ivGuestService = null;
    target.tvSignOut = null;

    view7f09010a.setOnClickListener(null);
    view7f09010a = null;
    view7f090118.setOnClickListener(null);
    view7f090118 = null;
    view7f09011b.setOnClickListener(null);
    view7f09011b = null;
    view7f0900f5.setOnClickListener(null);
    view7f0900f5 = null;
    view7f090102.setOnClickListener(null);
    view7f090102 = null;
    view7f09010f.setOnClickListener(null);
    view7f09010f = null;
    view7f09016c.setOnClickListener(null);
    view7f09016c = null;
    view7f0900f3.setOnClickListener(null);
    view7f0900f3 = null;
    view7f0900f1.setOnClickListener(null);
    view7f0900f1 = null;
    view7f090112.setOnClickListener(null);
    view7f090112 = null;
    view7f090106.setOnClickListener(null);
    view7f090106 = null;
    view7f090110.setOnClickListener(null);
    view7f090110 = null;
    view7f0900b6.setOnClickListener(null);
    view7f0900b6 = null;
    view7f090114.setOnClickListener(null);
    view7f090114 = null;
    view7f0900fb.setOnClickListener(null);
    view7f0900fb = null;
    view7f0900fa.setOnClickListener(null);
    view7f0900fa = null;
    view7f0900fe.setOnClickListener(null);
    view7f0900fe = null;
    view7f0900ff.setOnClickListener(null);
    view7f0900ff = null;
    view7f0900f0.setOnClickListener(null);
    view7f0900f0 = null;
    view7f090107.setOnClickListener(null);
    view7f090107 = null;
    view7f090111.setOnClickListener(null);
    view7f090111 = null;
    view7f0900fd.setOnClickListener(null);
    view7f0900fd = null;
    view7f0900f7.setOnClickListener(null);
    view7f0900f7 = null;
    view7f090119.setOnClickListener(null);
    view7f090119 = null;
    view7f090121.setOnClickListener(null);
    view7f090121 = null;
    view7f090104.setOnClickListener(null);
    view7f090104 = null;
    view7f09011f.setOnClickListener(null);
    view7f09011f = null;
    view7f090120.setOnClickListener(null);
    view7f090120 = null;
    view7f090125.setOnClickListener(null);
    view7f090125 = null;
    view7f09011e.setOnClickListener(null);
    view7f09011e = null;
    view7f090117.setOnClickListener(null);
    view7f090117 = null;
    view7f090103.setOnClickListener(null);
    view7f090103 = null;
    view7f090122.setOnClickListener(null);
    view7f090122 = null;
    view7f090123.setOnClickListener(null);
    view7f090123 = null;
    view7f09010c.setOnClickListener(null);
    view7f09010c = null;
    view7f090124.setOnClickListener(null);
    view7f090124 = null;
    view7f0900f4.setOnClickListener(null);
    view7f0900f4 = null;
    view7f090101.setOnClickListener(null);
    view7f090101 = null;
    view7f090127.setOnClickListener(null);
    view7f090127 = null;
    view7f09011a.setOnClickListener(null);
    view7f09011a = null;
    view7f09010b.setOnClickListener(null);
    view7f09010b = null;
  }
}

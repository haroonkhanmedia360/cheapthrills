// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialBold;
import cheap.thrills.fonts.TextViewGotham;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyWalletScreenActivity_ViewBinding implements Unbinder {
  private MyWalletScreenActivity target;

  private View view7f09015d;

  @UiThread
  public MyWalletScreenActivity_ViewBinding(MyWalletScreenActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyWalletScreenActivity_ViewBinding(final MyWalletScreenActivity target, View source) {
    this.target = target;

    View view;
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.rlMain, "field 'rlMain' and method 'onClick'");
    target.rlMain = Utils.castView(view, R.id.rlMain, "field 'rlMain'", LinearLayout.class);
    view7f09015d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.rlUsedTickets = Utils.findRequiredViewAsType(source, R.id.rlUsedTickets, "field 'rlUsedTickets'", RelativeLayout.class);
    target.tvToolBarTittle = Utils.findRequiredViewAsType(source, R.id.tvToolBarTittle, "field 'tvToolBarTittle'", TextViewGotham.class);
    target.profileToolBar = Utils.findRequiredViewAsType(source, R.id.profileToolBar, "field 'profileToolBar'", Toolbar.class);
    target.ivScan = Utils.findRequiredViewAsType(source, R.id.ivScan, "field 'ivScan'", ImageView.class);
    target.tvViewusedTicket = Utils.findRequiredViewAsType(source, R.id.tvViewusedTicket, "field 'tvViewusedTicket'", TextViewArialBold.class);
    target.tvContactGuest = Utils.findRequiredViewAsType(source, R.id.tvContactGuest, "field 'tvContactGuest'", TextViewArialBold.class);
    target.ll1 = Utils.findRequiredViewAsType(source, R.id.ll1, "field 'll1'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyWalletScreenActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.rlMain = null;
    target.rlUsedTickets = null;
    target.tvToolBarTittle = null;
    target.profileToolBar = null;
    target.ivScan = null;
    target.tvViewusedTicket = null;
    target.tvContactGuest = null;
    target.ll1 = null;

    view7f09015d.setOnClickListener(null);
    view7f09015d = null;
  }
}

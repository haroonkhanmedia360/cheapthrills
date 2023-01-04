// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialBold;
import cheap.thrills.fonts.TextViewArialDoubleBold;
import cheap.thrills.fonts.TextViewArialRegular;
import cheap.thrills.fonts.TextViewGotham;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletDetailsActivity_ViewBinding implements Unbinder {
  private WalletDetailsActivity target;

  private View view7f09015f;

  private View view7f0900b9;

  @UiThread
  public WalletDetailsActivity_ViewBinding(WalletDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletDetailsActivity_ViewBinding(final WalletDetailsActivity target, View source) {
    this.target = target;

    View view;
    target.tvProduct = Utils.findRequiredViewAsType(source, R.id.tvProduct, "field 'tvProduct'", TextViewArialRegular.class);
    target.llMain = Utils.findRequiredViewAsType(source, R.id.llMain, "field 'llMain'", LinearLayout.class);
    target.ll1 = Utils.findRequiredViewAsType(source, R.id.ll1, "field 'll1'", LinearLayout.class);
    target.ll2 = Utils.findRequiredViewAsType(source, R.id.ll2, "field 'll2'", LinearLayout.class);
    target.tvTicketOrderDetailsScreen = Utils.findRequiredViewAsType(source, R.id.tvTicketOrderDetailsScreen, "field 'tvTicketOrderDetailsScreen'", TextViewGotham.class);
    view = Utils.findRequiredView(source, R.id.rlViewDetails, "field 'rlViewDetails' and method 'onClick'");
    target.rlViewDetails = Utils.castView(view, R.id.rlViewDetails, "field 'rlViewDetails'", RelativeLayout.class);
    view7f09015f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvTicketNumber = Utils.findRequiredViewAsType(source, R.id.tvTicketNumber, "field 'tvTicketNumber'", TextViewArialRegular.class);
    target.tvCustomer = Utils.findRequiredViewAsType(source, R.id.tvCustomer, "field 'tvCustomer'", TextViewArialRegular.class);
    target.tvTicketOrder = Utils.findRequiredViewAsType(source, R.id.tvTicketOrder, "field 'tvTicketOrder'", TextViewArialDoubleBold.class);
    target.tvIssueddate = Utils.findRequiredViewAsType(source, R.id.tvIssuedDate, "field 'tvIssueddate'", TextViewArialRegular.class);
    view = Utils.findRequiredView(source, R.id.ivBack, "field 'ivBack' and method 'onClick'");
    target.ivBack = Utils.castView(view, R.id.ivBack, "field 'ivBack'", ImageView.class);
    view7f0900b9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvToolBarTittle = Utils.findRequiredViewAsType(source, R.id.tvToolBarTittle, "field 'tvToolBarTittle'", TextViewGotham.class);
    target.tvViewusedTicket = Utils.findRequiredViewAsType(source, R.id.tvViewusedTicket, "field 'tvViewusedTicket'", TextViewArialBold.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvProduct = null;
    target.llMain = null;
    target.ll1 = null;
    target.ll2 = null;
    target.tvTicketOrderDetailsScreen = null;
    target.rlViewDetails = null;
    target.tvTicketNumber = null;
    target.tvCustomer = null;
    target.tvTicketOrder = null;
    target.tvIssueddate = null;
    target.ivBack = null;
    target.tvToolBarTittle = null;
    target.tvViewusedTicket = null;

    view7f09015f.setOnClickListener(null);
    view7f09015f = null;
    view7f0900b9.setOnClickListener(null);
    view7f0900b9 = null;
  }
}

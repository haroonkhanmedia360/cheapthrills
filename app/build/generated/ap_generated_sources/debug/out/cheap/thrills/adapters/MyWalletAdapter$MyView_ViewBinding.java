// Generated code from Butter Knife. Do not modify!
package cheap.thrills.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialBold;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyWalletAdapter$MyView_ViewBinding implements Unbinder {
  private MyWalletAdapter.MyView target;

  private View view7f090105;

  @UiThread
  public MyWalletAdapter$MyView_ViewBinding(final MyWalletAdapter.MyView target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.llItem, "field 'llItem' and method 'onClick'");
    target.llItem = Utils.castView(view, R.id.llItem, "field 'llItem'", LinearLayout.class);
    view7f090105 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvTicketId = Utils.findRequiredViewAsType(source, R.id.tvTicketId, "field 'tvTicketId'", TextView.class);
    target.tvTicketSizes = Utils.findRequiredViewAsType(source, R.id.tvTicketSizes, "field 'tvTicketSizes'", TextViewArialBold.class);
    target.ticketType = Utils.findRequiredViewAsType(source, R.id.ticketType, "field 'ticketType'", TextViewArialBold.class);
    target.img_ticketType = Utils.findRequiredViewAsType(source, R.id.img_ticketType, "field 'img_ticketType'", ImageView.class);
    target.img_horrornights = Utils.findRequiredViewAsType(source, R.id.img_horrornights, "field 'img_horrornights'", ImageView.class);
    target.img_ticketType_logo = Utils.findRequiredViewAsType(source, R.id.img_ticketType_logo, "field 'img_ticketType_logo'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyWalletAdapter.MyView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.llItem = null;
    target.tvTicketId = null;
    target.tvTicketSizes = null;
    target.ticketType = null;
    target.img_ticketType = null;
    target.img_horrornights = null;
    target.img_ticketType_logo = null;

    view7f090105.setOnClickListener(null);
    view7f090105 = null;
  }
}

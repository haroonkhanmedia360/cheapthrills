// Generated code from Butter Knife. Do not modify!
package cheap.thrills.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialBold;
import cheap.thrills.fonts.TextViewArialRegular;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyWalletAdapter_ViewBinding implements Unbinder {
  private MyWalletAdapter target;

  @UiThread
  public MyWalletAdapter_ViewBinding(MyWalletAdapter target, View source) {
    this.target = target;

    target.tvTicketSizes = Utils.findRequiredViewAsType(source, R.id.tvTicketSizes, "field 'tvTicketSizes'", TextViewArialBold.class);
    target.tvTicketId = Utils.findRequiredViewAsType(source, R.id.tvTicketId, "field 'tvTicketId'", TextViewArialRegular.class);
    target.llItem = Utils.findRequiredViewAsType(source, R.id.llItem, "field 'llItem'", LinearLayout.class);
    target.ticketType = Utils.findRequiredViewAsType(source, R.id.ticketType, "field 'ticketType'", TextViewArialBold.class);
    target.img_ticketType = Utils.findRequiredViewAsType(source, R.id.img_ticketType, "field 'img_ticketType'", ImageView.class);
    target.img_ticketType_logo = Utils.findRequiredViewAsType(source, R.id.img_ticketType_logo, "field 'img_ticketType_logo'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyWalletAdapter target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTicketSizes = null;
    target.tvTicketId = null;
    target.llItem = null;
    target.ticketType = null;
    target.img_ticketType = null;
    target.img_ticketType_logo = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package cheap.thrills.fragments;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewGotham;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailsFragment_ViewBinding implements Unbinder {
  private DetailsFragment target;

  @UiThread
  public DetailsFragment_ViewBinding(DetailsFragment target, View source) {
    this.target = target;

    target.tvTicketOrder = Utils.findRequiredViewAsType(source, R.id.tvTicketOrder, "field 'tvTicketOrder'", TextViewGotham.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTicketOrder = null;
  }
}

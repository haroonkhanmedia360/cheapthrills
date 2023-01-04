// Generated code from Butter Knife. Do not modify!
package cheap.thrills.adapters;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialBold;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserAdapter$MyView_ViewBinding implements Unbinder {
  private UserAdapter.MyView target;

  private View view7f0900fc;

  @UiThread
  public UserAdapter$MyView_ViewBinding(final UserAdapter.MyView target, View source) {
    this.target = target;

    View view;
    target.radio_pirates = Utils.findRequiredViewAsType(source, R.id.radio_pirates, "field 'radio_pirates'", RadioButton.class);
    target.tvTextCheckBoxName = Utils.findRequiredViewAsType(source, R.id.tvTextCheckBoxName, "field 'tvTextCheckBoxName'", TextViewArialBold.class);
    view = Utils.findRequiredView(source, R.id.llFinalLayout, "field 'llFinalLayout' and method 'onClick'");
    target.llFinalLayout = Utils.castView(view, R.id.llFinalLayout, "field 'llFinalLayout'", LinearLayout.class);
    view7f0900fc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    UserAdapter.MyView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radio_pirates = null;
    target.tvTextCheckBoxName = null;
    target.llFinalLayout = null;

    view7f0900fc.setOnClickListener(null);
    view7f0900fc = null;
  }
}

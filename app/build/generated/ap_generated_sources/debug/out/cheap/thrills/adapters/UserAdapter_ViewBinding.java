// Generated code from Butter Knife. Do not modify!
package cheap.thrills.adapters;

import android.view.View;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialRegular;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserAdapter_ViewBinding implements Unbinder {
  private UserAdapter target;

  @UiThread
  public UserAdapter_ViewBinding(UserAdapter target, View source) {
    this.target = target;

    target.radioPirates = Utils.findRequiredViewAsType(source, R.id.radio_pirates, "field 'radioPirates'", RadioButton.class);
    target.tvTextCheckBoxName = Utils.findRequiredViewAsType(source, R.id.tvTextCheckBoxName, "field 'tvTextCheckBoxName'", TextViewArialRegular.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserAdapter target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radioPirates = null;
    target.tvTextCheckBoxName = null;
  }
}

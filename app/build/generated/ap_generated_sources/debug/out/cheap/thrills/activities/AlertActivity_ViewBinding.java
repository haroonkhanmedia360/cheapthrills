// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cheap.thrills.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlertActivity_ViewBinding implements Unbinder {
  private AlertActivity target;

  @UiThread
  public AlertActivity_ViewBinding(AlertActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlertActivity_ViewBinding(AlertActivity target, View source) {
    this.target = target;

    target.tbAlert = Utils.findRequiredViewAsType(source, R.id.tbAlert, "field 'tbAlert'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlertActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tbAlert = null;
  }
}

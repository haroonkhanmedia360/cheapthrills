// Generated code from Butter Knife. Do not modify!
package cheap.thrills.fragments;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cheap.thrills.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyProfileFragment_ViewBinding implements Unbinder {
  private MyProfileFragment target;

  @UiThread
  public MyProfileFragment_ViewBinding(MyProfileFragment target, View source) {
    this.target = target;

    target.tvNameField = Utils.findRequiredViewAsType(source, R.id.tvNameField, "field 'tvNameField'", TextView.class);
    target.tvEmailId = Utils.findRequiredViewAsType(source, R.id.tvEmailId, "field 'tvEmailId'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyProfileFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvNameField = null;
    target.tvEmailId = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialRegular;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SignInActivity_ViewBinding implements Unbinder {
  private SignInActivity target;

  private View view7f0901d8;

  private View view7f0901cd;

  private View view7f09004d;

  @UiThread
  public SignInActivity_ViewBinding(SignInActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SignInActivity_ViewBinding(final SignInActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tvForgotPassword, "field 'tvForgotPassword' and method 'onClick'");
    target.tvForgotPassword = Utils.castView(view, R.id.tvForgotPassword, "field 'tvForgotPassword'", TextView.class);
    view7f0901d8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tvCreateAccount, "field 'tvCreateAccount' and method 'onClick'");
    target.tvCreateAccount = Utils.castView(view, R.id.tvCreateAccount, "field 'tvCreateAccount'", TextView.class);
    view7f0901cd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.etEmailAddress = Utils.findRequiredViewAsType(source, R.id.etEmailAddress, "field 'etEmailAddress'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.etPassword, "field 'etPassword'", EditText.class);
    target.cbCheckRememberMe = Utils.findRequiredViewAsType(source, R.id.cbCheckBox, "field 'cbCheckRememberMe'", AppCompatCheckBox.class);
    target.tbSignIn = Utils.findRequiredViewAsType(source, R.id.tbSignIn, "field 'tbSignIn'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.btnSignIn, "field 'btnSignIn' and method 'onClick'");
    target.btnSignIn = Utils.castView(view, R.id.btnSignIn, "field 'btnSignIn'", Button.class);
    view7f09004d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvTextCheckBox = Utils.findRequiredViewAsType(source, R.id.tvTextCheckBox, "field 'tvTextCheckBox'", TextViewArialRegular.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SignInActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvForgotPassword = null;
    target.tvCreateAccount = null;
    target.etEmailAddress = null;
    target.etPassword = null;
    target.cbCheckRememberMe = null;
    target.tbSignIn = null;
    target.btnSignIn = null;
    target.tvTextCheckBox = null;

    view7f0901d8.setOnClickListener(null);
    view7f0901d8 = null;
    view7f0901cd.setOnClickListener(null);
    view7f0901cd = null;
    view7f09004d.setOnClickListener(null);
    view7f09004d = null;
  }
}

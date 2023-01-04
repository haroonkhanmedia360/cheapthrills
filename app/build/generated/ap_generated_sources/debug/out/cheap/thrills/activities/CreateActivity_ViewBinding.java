// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewArialBold;
import cheap.thrills.fonts.TextViewArialDoubleBold;
import cheap.thrills.fonts.TextViewArialRegular;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreateActivity_ViewBinding implements Unbinder {
  private CreateActivity target;

  private View view7f0901ea;

  private View view7f09004e;

  @UiThread
  public CreateActivity_ViewBinding(CreateActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreateActivity_ViewBinding(final CreateActivity target, View source) {
    this.target = target;

    View view;
    target.createToolBar = Utils.findRequiredViewAsType(source, R.id.createToolBar, "field 'createToolBar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.tvSignIn, "field 'tvSignIn' and method 'onClick'");
    target.tvSignIn = Utils.castView(view, R.id.tvSignIn, "field 'tvSignIn'", TextView.class);
    view7f0901ea = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvTextCheckBox = Utils.findRequiredViewAsType(source, R.id.tvTextCheckBox, "field 'tvTextCheckBox'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btnSignUp, "field 'btnSignUp' and method 'onClick'");
    target.btnSignUp = Utils.castView(view, R.id.btnSignUp, "field 'btnSignUp'", Button.class);
    view7f09004e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.cbUpdatesl = Utils.findRequiredViewAsType(source, R.id.cbCheckBoxUpdates, "field 'cbUpdatesl'", CheckBox.class);
    target.cbTermsService = Utils.findRequiredViewAsType(source, R.id.cbCheckBoxTerms, "field 'cbTermsService'", CheckBox.class);
    target.etEmail = Utils.findRequiredViewAsType(source, R.id.etEmailAddress, "field 'etEmail'", EditText.class);
    target.etFirstName = Utils.findRequiredViewAsType(source, R.id.etFirstName, "field 'etFirstName'", EditText.class);
    target.etLastname = Utils.findRequiredViewAsType(source, R.id.etLastname, "field 'etLastname'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.etPassword, "field 'etPassword'", EditText.class);
    target.tvToolBarTittle = Utils.findRequiredViewAsType(source, R.id.tvToolBarTittle, "field 'tvToolBarTittle'", TextViewArialDoubleBold.class);
    target.tvAlreadyAccount = Utils.findRequiredViewAsType(source, R.id.tvAlreadyAccount, "field 'tvAlreadyAccount'", TextViewArialBold.class);
    target.tvTextCheckBox2 = Utils.findRequiredViewAsType(source, R.id.tvTextCheckBox2, "field 'tvTextCheckBox2'", TextViewArialRegular.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.createToolBar = null;
    target.tvSignIn = null;
    target.tvTextCheckBox = null;
    target.btnSignUp = null;
    target.cbUpdatesl = null;
    target.cbTermsService = null;
    target.etEmail = null;
    target.etFirstName = null;
    target.etLastname = null;
    target.etPassword = null;
    target.tvToolBarTittle = null;
    target.tvAlreadyAccount = null;
    target.tvTextCheckBox2 = null;

    view7f0901ea.setOnClickListener(null);
    view7f0901ea = null;
    view7f09004e.setOnClickListener(null);
    view7f09004e = null;
  }
}

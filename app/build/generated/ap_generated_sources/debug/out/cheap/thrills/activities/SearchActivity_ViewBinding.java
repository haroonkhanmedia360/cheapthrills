// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchActivity_ViewBinding implements Unbinder {
  private SearchActivity target;

  private View view7f0900c0;

  private View view7f0900b9;

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchActivity_ViewBinding(final SearchActivity target, View source) {
    this.target = target;

    View view;
    target.etSearch = Utils.findRequiredViewAsType(source, R.id.etSearch, "field 'etSearch'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ivClose, "field 'ivClose' and method 'onClick'");
    target.ivClose = Utils.castView(view, R.id.ivClose, "field 'ivClose'", ImageView.class);
    view7f0900c0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ivBack, "field 'back' and method 'onClick'");
    target.back = Utils.castView(view, R.id.ivBack, "field 'back'", ImageView.class);
    view7f0900b9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.ivSearch = Utils.findRequiredViewAsType(source, R.id.ivSearch, "field 'ivSearch'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etSearch = null;
    target.ivClose = null;
    target.back = null;
    target.ivSearch = null;

    view7f0900c0.setOnClickListener(null);
    view7f0900c0 = null;
    view7f0900b9.setOnClickListener(null);
    view7f0900b9 = null;
  }
}

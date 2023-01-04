// Generated code from Butter Knife. Do not modify!
package cheap.thrills.adapters;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cheap.thrills.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SlidingImageAdapter_ViewBinding implements Unbinder {
  private SlidingImageAdapter target;

  @UiThread
  public SlidingImageAdapter_ViewBinding(SlidingImageAdapter target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.image, "field 'imageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SlidingImageAdapter target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
  }
}

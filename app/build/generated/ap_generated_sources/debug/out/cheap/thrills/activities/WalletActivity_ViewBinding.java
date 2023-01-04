// Generated code from Butter Knife. Do not modify!
package cheap.thrills.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import cheap.thrills.fonts.TextViewGotham;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletActivity_ViewBinding implements Unbinder {
  private WalletActivity target;

  private View view7f0900e6;

  private View view7f09015a;

  @UiThread
  public WalletActivity_ViewBinding(WalletActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletActivity_ViewBinding(final WalletActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.leftArrow, "field 'ivLeft' and method 'onClick'");
    target.ivLeft = Utils.castView(view, R.id.leftArrow, "field 'ivLeft'", ImageView.class);
    view7f0900e6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rightarrow, "field 'ivRight' and method 'onClick'");
    target.ivRight = Utils.castView(view, R.id.rightarrow, "field 'ivRight'", ImageView.class);
    view7f09015a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager.class);
    target.llContainer = Utils.findRequiredViewAsType(source, R.id.containerLL, "field 'llContainer'", LinearLayout.class);
    target.tbWallet = Utils.findRequiredViewAsType(source, R.id.tbWallet, "field 'tbWallet'", Toolbar.class);
    target.userRecycler = Utils.findRequiredViewAsType(source, R.id.userRecycler, "field 'userRecycler'", RecyclerView.class);
    target.tvToolBarTittle = Utils.findRequiredViewAsType(source, R.id.tvToolBarTittle, "field 'tvToolBarTittle'", TextViewGotham.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivLeft = null;
    target.ivRight = null;
    target.viewPager = null;
    target.llContainer = null;
    target.tbWallet = null;
    target.userRecycler = null;
    target.tvToolBarTittle = null;

    view7f0900e6.setOnClickListener(null);
    view7f0900e6 = null;
    view7f09015a.setOnClickListener(null);
    view7f09015a = null;
  }
}

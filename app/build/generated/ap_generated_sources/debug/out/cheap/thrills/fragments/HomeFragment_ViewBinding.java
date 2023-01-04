// Generated code from Butter Knife. Do not modify!
package cheap.thrills.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cheap.thrills.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.viewpagerindicator.CirclePageIndicator;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  private View view7f0900d8;

  private View view7f090096;

  @UiThread
  public HomeFragment_ViewBinding(final HomeFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ivSignIn, "field 'ivSignIn' and method 'onClick'");
    target.ivSignIn = Utils.castView(view, R.id.ivSignIn, "field 'ivSignIn'", ImageView.class);
    view7f0900d8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.firstLL = Utils.findRequiredViewAsType(source, R.id.firstLL, "field 'firstLL'", LinearLayout.class);
    target.secondLL = Utils.findRequiredViewAsType(source, R.id.secondLL, "field 'secondLL'", LinearLayout.class);
    target.thirdLL = Utils.findRequiredViewAsType(source, R.id.thirdLL, "field 'thirdLL'", LinearLayout.class);
    target.showsLL = Utils.findRequiredViewAsType(source, R.id.showsLL, "field 'showsLL'", LinearLayout.class);
    target.diningLL = Utils.findRequiredViewAsType(source, R.id.diningLL, "field 'diningLL'", LinearLayout.class);
    target.buyTicketsLL = Utils.findRequiredViewAsType(source, R.id.buyTicketsLL, "field 'buyTicketsLL'", LinearLayout.class);
    target.topParentLL = Utils.findRequiredViewAsType(source, R.id.topParentLL, "field 'topParentLL'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.floatingActionButton, "field 'floatingActionButton' and method 'onClick'");
    target.floatingActionButton = Utils.castView(view, R.id.floatingActionButton, "field 'floatingActionButton'", FloatingActionButton.class);
    view7f090096 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.txtLeftTV = Utils.findRequiredViewAsType(source, R.id.txtLeftTV, "field 'txtLeftTV'", TextView.class);
    target.txtRightTV = Utils.findRequiredViewAsType(source, R.id.txtRightTV, "field 'txtRightTV'", TextView.class);
    target.centerAnimLL = Utils.findRequiredViewAsType(source, R.id.centerAnimLL, "field 'centerAnimLL'", LinearLayout.class);
    target.rideLL = Utils.findRequiredViewAsType(source, R.id.rideLL, "field 'rideLL'", LinearLayout.class);
    target.slidingUpPanelLayout = Utils.findRequiredViewAsType(source, R.id.sliding_layout, "field 'slidingUpPanelLayout'", SlidingUpPanelLayout.class);
    target.layoutTopHeaderLL = Utils.findRequiredViewAsType(source, R.id.layoutTopHeaderLL, "field 'layoutTopHeaderLL'", RelativeLayout.class);
    target.llMap = Utils.findRequiredViewAsType(source, R.id.llMap, "field 'llMap'", LinearLayout.class);
    target.indicator = Utils.findRequiredViewAsType(source, R.id.indicator, "field 'indicator'", CirclePageIndicator.class);
    target.viewPager = Utils.findOptionalViewAsType(source, R.id.view_pager, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivSignIn = null;
    target.firstLL = null;
    target.secondLL = null;
    target.thirdLL = null;
    target.showsLL = null;
    target.diningLL = null;
    target.buyTicketsLL = null;
    target.topParentLL = null;
    target.floatingActionButton = null;
    target.txtLeftTV = null;
    target.txtRightTV = null;
    target.centerAnimLL = null;
    target.rideLL = null;
    target.slidingUpPanelLayout = null;
    target.layoutTopHeaderLL = null;
    target.llMap = null;
    target.indicator = null;
    target.viewPager = null;

    view7f0900d8.setOnClickListener(null);
    view7f0900d8 = null;
    view7f090096.setOnClickListener(null);
    view7f090096 = null;
  }
}

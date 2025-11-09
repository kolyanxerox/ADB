package o00000;

import OoooOOO.o0O00000;
import Ooooo0o.oo0o0O0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.tabs.TabLayout;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public final class OooOO0O extends LinearLayout {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f28975OooOo = 0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public ValueAnimator f28976OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TabLayout f28977OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(TabLayout tabLayout, Context context) {
        super(context);
        this.f28977OooOo0o = tabLayout;
        setWillNotDraw(false);
    }

    public final void OooO00o() {
        TabLayout tabLayout = this.f28977OooOo0o;
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        o0O00000 o0o00000 = tabLayout.f27855OoooOoo;
        Drawable drawable = tabLayout.f27838Oooo00O;
        o0o00000.getClass();
        RectF rectFOooO0oO = o0O00000.OooO0oO(tabLayout, childAt);
        drawable.setBounds((int) rectFOooO0oO.left, drawable.getBounds().top, (int) rectFOooO0oO.right, drawable.getBounds().bottom);
    }

    public final void OooO0O0(int i) {
        TabLayout tabLayout = this.f28977OooOo0o;
        Rect bounds = tabLayout.f27838Oooo00O.getBounds();
        tabLayout.f27838Oooo00O.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void OooO0OO(View view, View view2, float f) {
        TabLayout tabLayout = this.f28977OooOo0o;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f27838Oooo00O;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f27838Oooo00O.getBounds().bottom);
        } else {
            tabLayout.f27855OoooOoo.OooOO0o(tabLayout, view, view2, f, tabLayout.f27838Oooo00O);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final void OooO0Oo(int i, int i2, boolean z) {
        View childAt = getChildAt(this.f28977OooOo0o.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            OooO00o();
            return;
        }
        OooOO0 oooOO0 = new OooOO0(this, childAt, childAt2);
        if (!z) {
            this.f28976OooOo0O.removeAllUpdateListeners();
            this.f28976OooOo0O.addUpdateListener(oooOO0);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f28976OooOo0O = valueAnimator;
        valueAnimator.setInterpolator(oo0o0O0.f15016OooO0O0);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(oooOO0);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f28977OooOo0o;
        int iHeight = tabLayout.f27838Oooo00O.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f27838Oooo00O.getIntrinsicHeight();
        }
        int i = tabLayout.f27846OoooO;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f27838Oooo00O.getBounds().width() > 0) {
            Rect bounds = tabLayout.f27838Oooo00O.getBounds();
            tabLayout.f27838Oooo00O.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f27838Oooo00O.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f28976OooOo0O;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            OooO00o();
        } else {
            OooO0Oo(this.f28977OooOo0o.getSelectedTabPosition(), -1, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f28977OooOo0o;
        boolean z = true;
        if (tabLayout.f27847OoooO0 == 1 || tabLayout.f27850OoooOO0 == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) o0000oo.OooO0O0(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.f27847OoooO0 = 0;
                tabLayout.OooOOO0(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}

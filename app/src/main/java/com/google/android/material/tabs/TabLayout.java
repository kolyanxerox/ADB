package com.google.android.material.tabs;

import OoooOOO.o0O00000;
import Ooooo0o.oo0o0O0;
import Oooooo.o00Oo0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0038R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.github.superadb.R;
import java.util.ArrayList;
import java.util.Iterator;
import o00000.OooO;
import o00000.OooO00o;
import o00000.OooO0O0;
import o00000.OooO0OO;
import o00000.OooO0o;
import o00000.OooOO0O;
import o00000.OooOOO;
import o00000.OooOOO0;
import o00000.OooOo;
import o00000.OooOo00;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;

@ViewPager.DecorView
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: o00O0O */
    public static final Pools.SynchronizedPool f27824o00O0O = new Pools.SynchronizedPool(16);

    /* renamed from: OooOo */
    public final OooOO0O f27825OooOo;

    /* renamed from: OooOo0O */
    public final ArrayList f27826OooOo0O;

    /* renamed from: OooOo0o */
    public OooOOO0 f27827OooOo0o;

    /* renamed from: OooOoO */
    public final int f27828OooOoO;

    /* renamed from: OooOoO0 */
    public final int f27829OooOoO0;

    /* renamed from: OooOoOO */
    public final int f27830OooOoOO;

    /* renamed from: OooOoo */
    public final int f27831OooOoo;

    /* renamed from: OooOoo0 */
    public final int f27832OooOoo0;

    /* renamed from: OooOooO */
    public ColorStateList f27833OooOooO;

    /* renamed from: OooOooo */
    public ColorStateList f27834OooOooo;

    /* renamed from: Oooo */
    public final int f27835Oooo;

    /* renamed from: Oooo0 */
    public final PorterDuff.Mode f27836Oooo0;

    /* renamed from: Oooo000 */
    public ColorStateList f27837Oooo000;

    /* renamed from: Oooo00O */
    public Drawable f27838Oooo00O;

    /* renamed from: Oooo00o */
    public int f27839Oooo00o;

    /* renamed from: Oooo0O0 */
    public final float f27840Oooo0O0;

    /* renamed from: Oooo0OO */
    public final float f27841Oooo0OO;

    /* renamed from: Oooo0o */
    public int f27842Oooo0o;

    /* renamed from: Oooo0o0 */
    public final int f27843Oooo0o0;

    /* renamed from: Oooo0oO */
    public final int f27844Oooo0oO;

    /* renamed from: Oooo0oo */
    public final int f27845Oooo0oo;

    /* renamed from: OoooO */
    public int f27846OoooO;

    /* renamed from: OoooO0 */
    public int f27847OoooO0;

    /* renamed from: OoooO00 */
    public final int f27848OoooO00;

    /* renamed from: OoooO0O */
    public final int f27849OoooO0O;

    /* renamed from: OoooOO0 */
    public int f27850OoooOO0;

    /* renamed from: OoooOOO */
    public boolean f27851OoooOOO;

    /* renamed from: OoooOOo */
    public int f27852OoooOOo;

    /* renamed from: OoooOo0 */
    public int f27853OoooOo0;

    /* renamed from: OoooOoO */
    public boolean f27854OoooOoO;

    /* renamed from: OoooOoo */
    public o0O00000 f27855OoooOoo;

    /* renamed from: Ooooo00 */
    public OooO0OO f27856Ooooo00;

    /* renamed from: Ooooo0o */
    public final ArrayList f27857Ooooo0o;

    /* renamed from: OooooO0 */
    public OooOo f27858OooooO0;

    /* renamed from: OooooOO */
    public ValueAnimator f27859OooooOO;

    /* renamed from: OooooOo */
    public ViewPager f27860OooooOo;

    /* renamed from: Oooooo */
    public OooO f27861Oooooo;

    /* renamed from: Oooooo0 */
    public PagerAdapter f27862Oooooo0;

    /* renamed from: OoooooO */
    public OooOOO f27863OoooooO;

    /* renamed from: Ooooooo */
    public OooO0O0 f27864Ooooooo;
    public boolean o000oOoO;

    /* renamed from: o0OoOo0 */
    public boolean f27865o0OoOo0;

    /* renamed from: ooOO */
    public final Pools.SimplePool f27866ooOO;

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        ArrayList arrayList = this.f27826OooOo0O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooOOO0 oooOOO0 = (OooOOO0) arrayList.get(i);
            if (oooOOO0 != null && oooOOO0.f28981OooO00o != null && !TextUtils.isEmpty(oooOOO0.f28982OooO0O0)) {
                return !this.o000oOoO ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f27844Oooo0oO;
        if (i != -1) {
            return i;
        }
        int i2 = this.f27850OoooOO0;
        if (i2 == 0 || i2 == 2) {
            return this.f27835Oooo;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f27825OooOo.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        OooOO0O oooOO0O = this.f27825OooOo;
        int childCount = oooOO0O.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = oooOO0O.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void OooO(OooOOO0 oooOOO0, boolean z) {
        OooOOO0 oooOOO02 = this.f27827OooOo0o;
        ArrayList arrayList = this.f27857Ooooo0o;
        if (oooOOO02 == oooOOO0) {
            if (oooOOO02 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((OooO0OO) arrayList.get(size)).getClass();
                }
                OooO0OO(oooOOO0.f28984OooO0Oo);
                return;
            }
            return;
        }
        int i = oooOOO0 != null ? oooOOO0.f28984OooO0Oo : -1;
        if (z) {
            if ((oooOOO02 == null || oooOOO02.f28984OooO0Oo == -1) && i != -1) {
                OooOO0O(i, 0.0f, true, true);
            } else {
                OooO0OO(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f27827OooOo0o = oooOOO0;
        if (oooOOO02 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((OooO0OO) arrayList.get(size2)).getClass();
            }
        }
        if (oooOOO0 != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                OooOo oooOo = (OooOo) ((OooO0OO) arrayList.get(size3));
                oooOo.getClass();
                oooOo.f28990OooO00o.setCurrentItem(oooOOO0.f28984OooO0Oo);
            }
        }
    }

    public final void OooO00o(OooOOO0 oooOOO0, boolean z) {
        ArrayList arrayList = this.f27826OooOo0O;
        int size = arrayList.size();
        if (oooOOO0.f28985OooO0o != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        oooOOO0.f28984OooO0Oo = size;
        arrayList.add(size, oooOOO0);
        int size2 = arrayList.size();
        for (int i = size + 1; i < size2; i++) {
            ((OooOOO0) arrayList.get(i)).f28984OooO0Oo = i;
        }
        OooOo00 oooOo00 = oooOOO0.f28987OooO0oO;
        oooOo00.setSelected(false);
        oooOo00.setActivated(false);
        int i2 = oooOOO0.f28984OooO0Oo;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f27850OoooOO0 == 1 && this.f27847OoooO0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f27825OooOo.addView(oooOo00, i2, layoutParams);
        if (z) {
            TabLayout tabLayout = oooOOO0.f28985OooO0o;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.OooO(oooOOO0, true);
        }
    }

    public final void OooO0O0(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        OooOOO0 oooOOO0OooO0oO = OooO0oO();
        CharSequence charSequence = tabItem.f27822OooOo0O;
        if (charSequence != null) {
            if (TextUtils.isEmpty(oooOOO0OooO0oO.f28983OooO0OO) && !TextUtils.isEmpty(charSequence)) {
                oooOOO0OooO0oO.f28987OooO0oO.setContentDescription(charSequence);
            }
            oooOOO0OooO0oO.f28982OooO0O0 = charSequence;
            OooOo00 oooOo00 = oooOOO0OooO0oO.f28987OooO0oO;
            if (oooOo00 != null) {
                oooOo00.OooO0Oo();
            }
        }
        Drawable drawable = tabItem.f27823OooOo0o;
        if (drawable != null) {
            oooOOO0OooO0oO.f28981OooO00o = drawable;
            TabLayout tabLayout = oooOOO0OooO0oO.f28985OooO0o;
            if (tabLayout.f27847OoooO0 == 1 || tabLayout.f27850OoooOO0 == 2) {
                tabLayout.OooOOO0(true);
            }
            OooOo00 oooOo002 = oooOOO0OooO0oO.f28987OooO0oO;
            if (oooOo002 != null) {
                oooOo002.OooO0Oo();
            }
        }
        int i = tabItem.f27821OooOo;
        if (i != 0) {
            oooOOO0OooO0oO.f28986OooO0o0 = LayoutInflater.from(oooOOO0OooO0oO.f28987OooO0oO.getContext()).inflate(i, (ViewGroup) oooOOO0OooO0oO.f28987OooO0oO, false);
            OooOo00 oooOo003 = oooOOO0OooO0oO.f28987OooO0oO;
            if (oooOo003 != null) {
                oooOo003.OooO0Oo();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            oooOOO0OooO0oO.f28983OooO0OO = tabItem.getContentDescription();
            OooOo00 oooOo004 = oooOOO0OooO0oO.f28987OooO0oO;
            if (oooOo004 != null) {
                oooOo004.OooO0Oo();
            }
        }
        OooO00o(oooOOO0OooO0oO, this.f27826OooOo0O.isEmpty());
    }

    public final void OooO0OO(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            OooOO0O oooOO0O = this.f27825OooOo;
            int childCount = oooOO0O.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (oooOO0O.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iOooO0o0 = OooO0o0(0.0f, i);
            if (scrollX != iOooO0o0) {
                OooO0o();
                this.f27859OooooOO.setIntValues(scrollX, iOooO0o0);
                this.f27859OooooOO.start();
            }
            ValueAnimator valueAnimator = oooOO0O.f28976OooOo0O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                oooOO0O.f28976OooOo0O.cancel();
            }
            oooOO0O.OooO0Oo(i, this.f27849OoooO0O, true);
            return;
        }
        OooOO0O(i, 0.0f, true, true);
    }

    public final void OooO0Oo() {
        int i = this.f27850OoooOO0;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f27848OoooO00 - this.f27829OooOoO0) : 0;
        OooOO0O oooOO0O = this.f27825OooOo;
        ViewCompat.setPaddingRelative(oooOO0O, iMax, 0, 0, 0);
        int i2 = this.f27850OoooOO0;
        if (i2 == 0) {
            int i3 = this.f27847OoooO0;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                oooOO0O.setGravity(1);
            } else if (i3 == 2) {
            }
            oooOO0O.setGravity(GravityCompat.START);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f27847OoooO0 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            oooOO0O.setGravity(1);
        }
        OooOOO0(true);
    }

    public final void OooO0o() {
        if (this.f27859OooooOO == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27859OooooOO = valueAnimator;
            valueAnimator.setInterpolator(oo0o0O0.f15016OooO0O0);
            this.f27859OooooOO.setDuration(this.f27849OoooO0O);
            this.f27859OooooOO.addUpdateListener(new o00Oo0(this, 2));
        }
    }

    public final int OooO0o0(float f, int i) {
        OooOO0O oooOO0O;
        View childAt;
        int i2 = this.f27850OoooOO0;
        if ((i2 != 0 && i2 != 2) || (childAt = (oooOO0O = this.f27825OooOo).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < oooOO0O.getChildCount() ? oooOO0O.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i4 : left - i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooOOO0 OooO0oO() {
        OooOOO0 oooOOO0 = (OooOOO0) f27824o00O0O.acquire();
        if (oooOOO0 == null) {
            oooOOO0 = new OooOOO0();
            oooOOO0.f28984OooO0Oo = -1;
        }
        oooOOO0.f28985OooO0o = this;
        Pools.SimplePool simplePool = this.f27866ooOO;
        OooOo00 oooOo00 = simplePool != null ? (OooOo00) simplePool.acquire() : null;
        if (oooOo00 == null) {
            oooOo00 = new OooOo00(this, getContext());
        }
        oooOo00.setTab(oooOOO0);
        oooOo00.setFocusable(true);
        oooOo00.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(oooOOO0.f28983OooO0OO)) {
            oooOo00.setContentDescription(oooOOO0.f28982OooO0O0);
        } else {
            oooOo00.setContentDescription(oooOOO0.f28983OooO0OO);
        }
        oooOOO0.f28987OooO0oO = oooOo00;
        return oooOOO0;
    }

    public final void OooO0oo() {
        OooOOO0 oooOOO0;
        int currentItem;
        OooOO0O oooOO0O = this.f27825OooOo;
        int childCount = oooOO0O.getChildCount() - 1;
        while (true) {
            oooOOO0 = null;
            if (childCount < 0) {
                break;
            }
            OooOo00 oooOo00 = (OooOo00) oooOO0O.getChildAt(childCount);
            oooOO0O.removeViewAt(childCount);
            if (oooOo00 != null) {
                oooOo00.setTab(null);
                oooOo00.setSelected(false);
                this.f27866ooOO.release(oooOo00);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.f27826OooOo0O;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooOOO0 oooOOO02 = (OooOOO0) it.next();
            it.remove();
            oooOOO02.f28985OooO0o = null;
            oooOOO02.f28987OooO0oO = null;
            oooOOO02.f28981OooO00o = null;
            oooOOO02.f28982OooO0O0 = null;
            oooOOO02.f28983OooO0OO = null;
            oooOOO02.f28984OooO0Oo = -1;
            oooOOO02.f28986OooO0o0 = null;
            f27824o00O0O.release(oooOOO02);
        }
        this.f27827OooOo0o = null;
        PagerAdapter pagerAdapter = this.f27862Oooooo0;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                OooOOO0 oooOOO0OooO0oO = OooO0oO();
                CharSequence pageTitle = this.f27862Oooooo0.getPageTitle(i);
                if (TextUtils.isEmpty(oooOOO0OooO0oO.f28983OooO0OO) && !TextUtils.isEmpty(pageTitle)) {
                    oooOOO0OooO0oO.f28987OooO0oO.setContentDescription(pageTitle);
                }
                oooOOO0OooO0oO.f28982OooO0O0 = pageTitle;
                OooOo00 oooOo002 = oooOOO0OooO0oO.f28987OooO0oO;
                if (oooOo002 != null) {
                    oooOo002.OooO0Oo();
                }
                OooO00o(oooOOO0OooO0oO, false);
            }
            ViewPager viewPager = this.f27860OooooOo;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (currentItem >= 0 && currentItem < getTabCount()) {
                oooOOO0 = (OooOOO0) arrayList.get(currentItem);
            }
            OooO(oooOOO0, true);
        }
    }

    public final void OooOO0(PagerAdapter pagerAdapter, boolean z) {
        OooO oooO;
        PagerAdapter pagerAdapter2 = this.f27862Oooooo0;
        if (pagerAdapter2 != null && (oooO = this.f27861Oooooo) != null) {
            pagerAdapter2.unregisterDataSetObserver(oooO);
        }
        this.f27862Oooooo0 = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f27861Oooooo == null) {
                this.f27861Oooooo = new OooO(this);
            }
            pagerAdapter.registerDataSetObserver(this.f27861Oooooo);
        }
        OooO0oo();
    }

    public final void OooOO0O(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0) {
            OooOO0O oooOO0O = this.f27825OooOo;
            if (iRound >= oooOO0O.getChildCount()) {
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator = oooOO0O.f28976OooOo0O;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    oooOO0O.f28976OooOo0O.cancel();
                }
                oooOO0O.OooO0OO(oooOO0O.getChildAt(i), oooOO0O.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.f27859OooooOO;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f27859OooooOO.cancel();
            }
            scrollTo(i < 0 ? 0 : OooO0o0(f, i), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void OooOO0o(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.f27860OooooOo;
        if (viewPager2 != null) {
            OooOOO oooOOO = this.f27863OoooooO;
            if (oooOOO != null) {
                viewPager2.removeOnPageChangeListener(oooOOO);
            }
            OooO0O0 oooO0O0 = this.f27864Ooooooo;
            if (oooO0O0 != null) {
                this.f27860OooooOo.removeOnAdapterChangeListener(oooO0O0);
            }
        }
        OooOo oooOo = this.f27858OooooO0;
        ArrayList arrayList = this.f27857Ooooo0o;
        if (oooOo != null) {
            arrayList.remove(oooOo);
            this.f27858OooooO0 = null;
        }
        if (viewPager != null) {
            this.f27860OooooOo = viewPager;
            if (this.f27863OoooooO == null) {
                this.f27863OoooooO = new OooOOO(this);
            }
            OooOOO oooOOO2 = this.f27863OoooooO;
            oooOOO2.f28980OooO0OO = 0;
            oooOOO2.f28979OooO0O0 = 0;
            viewPager.addOnPageChangeListener(oooOOO2);
            OooOo oooOo2 = new OooOo(viewPager);
            this.f27858OooooO0 = oooOo2;
            if (!arrayList.contains(oooOo2)) {
                arrayList.add(oooOo2);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                OooOO0(adapter, true);
            }
            if (this.f27864Ooooooo == null) {
                this.f27864Ooooooo = new OooO0O0(this);
            }
            OooO0O0 oooO0O02 = this.f27864Ooooooo;
            oooO0O02.f28970OooO00o = true;
            viewPager.addOnAdapterChangeListener(oooO0O02);
            OooOO0O(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f27860OooooOo = null;
            OooOO0(null, false);
        }
        this.f27865o0OoOo0 = z;
    }

    public final void OooOOO0(boolean z) {
        int i = 0;
        while (true) {
            OooOO0O oooOO0O = this.f27825OooOo;
            if (i >= oooOO0O.getChildCount()) {
                return;
            }
            View childAt = oooOO0O.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f27850OoooOO0 == 1 && this.f27847OoooO0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        OooO0O0(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        OooOOO0 oooOOO0 = this.f27827OooOo0o;
        if (oooOOO0 != null) {
            return oooOOO0.f28984OooO0Oo;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f27826OooOo0O.size();
    }

    public int getTabGravity() {
        return this.f27847OoooO0;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f27834OooOooo;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f27853OoooOo0;
    }

    public int getTabIndicatorGravity() {
        return this.f27846OoooO;
    }

    public int getTabMaxWidth() {
        return this.f27842Oooo0o;
    }

    public int getTabMode() {
        return this.f27850OoooOO0;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f27837Oooo000;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f27838Oooo00O;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f27833OooOooO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Oooo0o0.OooO.OooOo0O(this);
        if (this.f27860OooooOo == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                OooOO0o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27865o0OoOo0) {
            setupWithViewPager(null);
            this.f27865o0OoOo0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOo00 oooOo00;
        Drawable drawable;
        int i = 0;
        while (true) {
            OooOO0O oooOO0O = this.f27825OooOo;
            if (i >= oooOO0O.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = oooOO0O.getChildAt(i);
            if ((childAt instanceof OooOo00) && (drawable = (oooOo00 = (OooOo00) childAt).f29000OooOooO) != null) {
                drawable.setBounds(oooOo00.getLeft(), oooOo00.getTop(), oooOo00.getRight(), oooOo00.getBottom());
                oooOo00.f29000OooOooO.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = o0ooOO0.o0000oo.OooO0O0(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f27845Oooo0oo
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = o0ooOO0.o0000oo.OooO0O0(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f27842Oooo0o = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f27850OoooOO0
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        Oooo0o0.OooO.OooOo00(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.o000oOoO == z) {
            return;
        }
        this.o000oOoO = z;
        int i = 0;
        while (true) {
            OooOO0O oooOO0O = this.f27825OooOo;
            if (i >= oooOO0O.getChildCount()) {
                OooO0Oo();
                return;
            }
            View childAt = oooOO0O.getChildAt(i);
            if (childAt instanceof OooOo00) {
                OooOo00 oooOo00 = (OooOo00) childAt;
                oooOo00.setOrientation(!oooOo00.f29002Oooo000.o000oOoO ? 1 : 0);
                TextView textView = oooOo00.f28999OooOoo0;
                if (textView == null && oooOo00.f28998OooOoo == null) {
                    oooOo00.OooO0o(oooOo00.f28992OooOo, oooOo00.f28994OooOo0o);
                } else {
                    oooOo00.OooO0o(oooOo00.f28998OooOoo, textView);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OooO0o oooO0o) {
        setOnTabSelectedListener((OooO0OO) oooO0o);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        OooO0o();
        this.f27859OooooOO.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        this.f27838Oooo00O = drawableMutate;
        int i = this.f27839Oooo00o;
        if (i != 0) {
            DrawableCompat.setTint(drawableMutate, i);
        } else {
            DrawableCompat.setTintList(drawableMutate, null);
        }
        int intrinsicHeight = this.f27852OoooOOo;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f27838Oooo00O.getIntrinsicHeight();
        }
        this.f27825OooOo.OooO0O0(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f27839Oooo00o = i;
        Drawable drawable = this.f27838Oooo00O;
        if (i != 0) {
            DrawableCompat.setTint(drawable, i);
        } else {
            DrawableCompat.setTintList(drawable, null);
        }
        OooOOO0(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f27846OoooO != i) {
            this.f27846OoooO = i;
            ViewCompat.postInvalidateOnAnimation(this.f27825OooOo);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f27852OoooOOo = i;
        this.f27825OooOo.OooO0O0(i);
    }

    public void setTabGravity(int i) {
        if (this.f27847OoooO0 != i) {
            this.f27847OoooO0 = i;
            OooO0Oo();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f27834OooOooo != colorStateList) {
            this.f27834OooOooo = colorStateList;
            ArrayList arrayList = this.f27826OooOo0O;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooOo00 oooOo00 = ((OooOOO0) arrayList.get(i)).f28987OooO0oO;
                if (oooOo00 != null) {
                    oooOo00.OooO0Oo();
                }
            }
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f27853OoooOo0 = i;
        if (i == 0) {
            this.f27855OoooOoo = new o0O00000(10);
            return;
        }
        if (i == 1) {
            this.f27855OoooOoo = new OooO00o(0);
        } else {
            if (i == 2) {
                this.f27855OoooOoo = new OooO00o(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f27851OoooOOO = z;
        int i = OooOO0O.f28975OooOo;
        OooOO0O oooOO0O = this.f27825OooOo;
        oooOO0O.OooO00o();
        ViewCompat.postInvalidateOnAnimation(oooOO0O);
    }

    public void setTabMode(int i) {
        if (i != this.f27850OoooOO0) {
            this.f27850OoooOO0 = i;
            OooO0Oo();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f27837Oooo000 == colorStateList) {
            return;
        }
        this.f27837Oooo000 = colorStateList;
        int i = 0;
        while (true) {
            OooOO0O oooOO0O = this.f27825OooOo;
            if (i >= oooOO0O.getChildCount()) {
                return;
            }
            View childAt = oooOO0O.getChildAt(i);
            if (childAt instanceof OooOo00) {
                Context context = getContext();
                int i2 = OooOo00.f28991Oooo00O;
                ((OooOo00) childAt).OooO0o0(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f27833OooOooO != colorStateList) {
            this.f27833OooOooO = colorStateList;
            ArrayList arrayList = this.f27826OooOo0O;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooOo00 oooOo00 = ((OooOOO0) arrayList.get(i)).f28987OooO0oO;
                if (oooOo00 != null) {
                    oooOo00.OooO0Oo();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        OooOO0(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f27854OoooOoO == z) {
            return;
        }
        this.f27854OoooOoO = z;
        int i = 0;
        while (true) {
            OooOO0O oooOO0O = this.f27825OooOo;
            if (i >= oooOO0O.getChildCount()) {
                return;
            }
            View childAt = oooOO0O.getChildAt(i);
            if (childAt instanceof OooOo00) {
                Context context = getContext();
                int i2 = OooOo00.f28991Oooo00O;
                ((OooOo00) childAt).OooO0o0(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        OooOO0o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.f27826OooOo0O = new ArrayList();
        this.f27839Oooo00o = 0;
        this.f27842Oooo0o = Integer.MAX_VALUE;
        this.f27852OoooOOo = -1;
        this.f27857Ooooo0o = new ArrayList();
        this.f27866ooOO = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        OooOO0O oooOO0O = new OooOO0O(this, context2);
        this.f27825OooOo = oooOO0O;
        super.addView(oooOO0O, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, Ooooo00.OooOo.f14998OoooOoO, i, R.style.Widget_Design_TabLayout, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0();
            oooOOO0.OooOOO0(ColorStateList.valueOf(colorDrawable.getColor()));
            oooOOO0.OooOO0O(context2);
            oooOOO0.OooOO0o(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, oooOOO0);
        }
        setSelectedTabIndicator(oo0o0Oo.OooO0OO.OooO0Oo(context2, typedArrayOooO0Oo, 5));
        setSelectedTabIndicatorColor(typedArrayOooO0Oo.getColor(8, 0));
        oooOO0O.OooO0O0(typedArrayOooO0Oo.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayOooO0Oo.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayOooO0Oo.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayOooO0Oo.getBoolean(9, true));
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(16, 0);
        this.f27832OooOoo0 = dimensionPixelSize;
        this.f27830OooOoOO = dimensionPixelSize;
        this.f27828OooOoO = dimensionPixelSize;
        this.f27829OooOoO0 = dimensionPixelSize;
        this.f27829OooOoO0 = typedArrayOooO0Oo.getDimensionPixelSize(19, dimensionPixelSize);
        this.f27828OooOoO = typedArrayOooO0Oo.getDimensionPixelSize(20, dimensionPixelSize);
        this.f27830OooOoOO = typedArrayOooO0Oo.getDimensionPixelSize(18, dimensionPixelSize);
        this.f27832OooOoo0 = typedArrayOooO0Oo.getDimensionPixelSize(17, dimensionPixelSize);
        int resourceId = typedArrayOooO0Oo.getResourceId(23, R.style.TextAppearance_Design_Tab);
        this.f27831OooOoo = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C0038R.styleable.TextAppearance);
        try {
            this.f27840Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0038R.styleable.TextAppearance_android_textSize, 0);
            this.f27833OooOooO = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, C0038R.styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayOooO0Oo.hasValue(24)) {
                this.f27833OooOooO = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 24);
            }
            if (typedArrayOooO0Oo.hasValue(22)) {
                this.f27833OooOooO = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayOooO0Oo.getColor(22, 0), this.f27833OooOooO.getDefaultColor()});
            }
            this.f27834OooOooo = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 3);
            this.f27836Oooo0 = o0000oo.OooO0o0(typedArrayOooO0Oo.getInt(4, -1), null);
            this.f27837Oooo000 = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 21);
            this.f27849OoooO0O = typedArrayOooO0Oo.getInt(6, 300);
            this.f27844Oooo0oO = typedArrayOooO0Oo.getDimensionPixelSize(14, -1);
            this.f27845Oooo0oo = typedArrayOooO0Oo.getDimensionPixelSize(13, -1);
            this.f27843Oooo0o0 = typedArrayOooO0Oo.getResourceId(0, 0);
            this.f27848OoooO00 = typedArrayOooO0Oo.getDimensionPixelSize(1, 0);
            this.f27850OoooOO0 = typedArrayOooO0Oo.getInt(15, 1);
            this.f27847OoooO0 = typedArrayOooO0Oo.getInt(2, 0);
            this.o000oOoO = typedArrayOooO0Oo.getBoolean(12, false);
            this.f27854OoooOoO = typedArrayOooO0Oo.getBoolean(25, false);
            typedArrayOooO0Oo.recycle();
            Resources resources = getResources();
            this.f27841Oooo0OO = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f27835Oooo = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            OooO0Oo();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        OooO0O0(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = this.f27856Ooooo00;
        ArrayList arrayList = this.f27857Ooooo0o;
        if (oooO0OO2 != null) {
            arrayList.remove(oooO0OO2);
        }
        this.f27856Ooooo00 = oooO0OO;
        if (oooO0OO == null || arrayList.contains(oooO0OO)) {
            return;
        }
        arrayList.add(oooO0OO);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        OooO0O0(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        OooO0O0(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}

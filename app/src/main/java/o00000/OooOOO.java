package o00000;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class OooOOO implements ViewPager.OnPageChangeListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference f28978OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f28979OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f28980OooO0OO;

    public OooOOO(TabLayout tabLayout) {
        this.f28978OooO00o = new WeakReference(tabLayout);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        this.f28979OooO0O0 = this.f28980OooO0OO;
        this.f28980OooO0OO = i;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.f28978OooO00o.get();
        if (tabLayout != null) {
            int i3 = this.f28980OooO0OO;
            tabLayout.OooOO0O(i, f, i3 != 2 || this.f28979OooO0O0 == 1, (i3 == 2 && this.f28979OooO0O0 == 0) ? false : true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        TabLayout tabLayout = (TabLayout) this.f28978OooO00o.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.f28980OooO0OO;
        tabLayout.OooO((i < 0 || i >= tabLayout.getTabCount()) ? null : (OooOOO0) tabLayout.f27826OooOo0O.get(i), i2 == 0 || (i2 == 2 && this.f28979OooO0O0 == 0));
    }
}

package o00000;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class OooO0O0 implements ViewPager.OnAdapterChangeListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f28970OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TabLayout f28971OooO0O0;

    public OooO0O0(TabLayout tabLayout) {
        this.f28971OooO0O0 = tabLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        TabLayout tabLayout = this.f28971OooO0O0;
        if (tabLayout.f27860OooooOo == viewPager) {
            tabLayout.OooOO0(pagerAdapter2, this.f28970OooO00o);
        }
    }
}

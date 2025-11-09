package o00000;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class OooO extends DataSetObserver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TabLayout f28968OooO00o;

    public OooO(TabLayout tabLayout) {
        this.f28968OooO00o = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f28968OooO00o.OooO0oo();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f28968OooO00o.OooO0oo();
    }
}

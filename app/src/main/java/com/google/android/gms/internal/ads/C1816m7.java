package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.internal.client.zzbe;

/* renamed from: com.google.android.gms.internal.ads.m7 */
/* loaded from: classes2.dex */
public final class C1816m7 extends CustomTabsCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C1853n7 f21121OooO00o;

    public C1816m7(C1853n7 c1853n7) {
        this.f21121OooO00o = c1853n7;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        C1853n7 c1853n7 = this.f21121OooO00o;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o00o)).booleanValue() || c1853n7.f21423OooOo == null) {
            return;
        }
        AbstractC2200wl.f25321OooO00o.execute(new com.google.android.gms.common.api.internal.Oooo000(c1853n7, i, 2));
    }
}

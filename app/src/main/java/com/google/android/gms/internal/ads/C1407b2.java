package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.ads.b2 */
/* loaded from: classes2.dex */
public final class C1407b2 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: OooO00o */
    public final /* synthetic */ C1443c2 f17348OooO00o;

    public C1407b2(C1443c2 c1443c2) {
        this.f17348OooO00o = c1443c2;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.f17348OooO00o.f17652OooO00o = System.currentTimeMillis();
            this.f17348OooO00o.f17655OooO0Oo = true;
            return;
        }
        C1443c2 c1443c2 = this.f17348OooO00o;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1443c2.f17653OooO0O0 > 0) {
            C1443c2 c1443c22 = this.f17348OooO00o;
            long j = c1443c22.f17653OooO0O0;
            if (jCurrentTimeMillis >= j) {
                c1443c22.f17654OooO0OO = jCurrentTimeMillis - j;
            }
        }
        this.f17348OooO00o.f17655OooO0Oo = false;
    }
}

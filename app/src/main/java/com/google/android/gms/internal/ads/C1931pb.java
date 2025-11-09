package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;

/* renamed from: com.google.android.gms.internal.ads.pb */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1931pb implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f23268OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ C1468cr f23269OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ String f23270OooO0OO;

    public /* synthetic */ C1931pb(C1468cr c1468cr, String str, int i) {
        this.f23268OooO00o = i;
        this.f23269OooO0O0 = c1468cr;
        this.f23270OooO0OO = str;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) {
        String str = this.f23270OooO0OO;
        C1468cr c1468cr = this.f23269OooO0O0;
        switch (this.f23268OooO00o) {
            case 0:
                String str2 = (String) obj;
                C1820mb c1820mb = AbstractC2005rb.f23817OooO00o;
                return (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOooOo)).booleanValue() && c1468cr != null && C1468cr.OooO0O0(str)) ? c1468cr.OooO00o(str2, zzbc.zze()) : ii0.OooooOO(str2);
            default:
                c1468cr.getClass();
                c1468cr.f18049OooO0o0.OooO00o(new RunnableC1395ar(c1468cr, (Throwable) obj, 1));
                return ii0.OooooOO(str);
        }
    }
}

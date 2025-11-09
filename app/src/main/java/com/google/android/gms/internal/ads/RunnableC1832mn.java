package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.mn */
/* loaded from: classes2.dex */
public final class RunnableC1832mn implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f21302OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21303OooOo0O = 1;

    /* renamed from: OooOo0o */
    public final /* synthetic */ long f21304OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ Object f21305OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f21306OooOoO0;

    public RunnableC1832mn(AbstractC1869nn abstractC1869nn, String str, String str2, long j) {
        this.f21302OooOo = str;
        this.f21306OooOoO0 = str2;
        this.f21304OooOo0o = j;
        this.f21305OooOoO = abstractC1869nn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f21303OooOo0O) {
            case 0:
                HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
                mapOooOOo.put("src", (String) this.f21302OooOo);
                mapOooOOo.put("cachedSrc", (String) this.f21306OooOoO0);
                mapOooOOo.put("totalDuration", Long.toString(this.f21304OooOo0o));
                AbstractC1869nn.OooO0oo((AbstractC1869nn) this.f21305OooOoO, mapOooOOo);
                return;
            default:
                mb0 mb0Var = (mb0) this.f21302OooOo;
                long j = this.f21304OooOo0o;
                kb0 kb0Var = (kb0) this.f21306OooOoO0;
                Bundle bundle = (Bundle) this.f21305OooOoO;
                mb0Var.getClass();
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                if (((Boolean) AbstractC1706j8.f20223OooO00o.OooOOO()).booleanValue()) {
                    String canonicalName = kb0Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    zze.zza("Signal runtime (ms) : " + canonicalName + " = " + jElapsedRealtime);
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue()) {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o000ooO)).booleanValue()) {
                        synchronized (mb0Var) {
                            bundle.putLong("sig" + kb0Var.zza(), jElapsedRealtime);
                        }
                    }
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17848o000oo00)).booleanValue()) {
                    C1548ey c1548eyOooO00o = mb0Var.f21185OooO0o0.OooO00o();
                    c1548eyOooO00o.OooO0oO("action", "lat_ms");
                    c1548eyOooO00o.OooO0oO("lat_grp", "sig_lat_grp");
                    c1548eyOooO00o.OooO0oO("lat_id", String.valueOf(kb0Var.zza()));
                    c1548eyOooO00o.OooO0oO("clat_ms", String.valueOf(jElapsedRealtime));
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17847o000oo0)).booleanValue()) {
                        synchronized (mb0Var) {
                            mb0Var.f21186OooO0oO++;
                        }
                        C2249xx c2249xx = zzv.zzp().f23630OooO0OO.f24104OooO0OO;
                        synchronized (c2249xx) {
                            str = (String) c2249xx.f25813OooOo;
                        }
                        c1548eyOooO00o.OooO0oO("seq_num", str);
                        synchronized (mb0Var) {
                            try {
                                if (mb0Var.f21186OooO0oO == mb0Var.f21181OooO0O0.size() && mb0Var.f21184OooO0o != 0) {
                                    mb0Var.f21186OooO0oO = 0;
                                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - mb0Var.f21184OooO0o);
                                    if (kb0Var.zza() <= 39 || kb0Var.zza() >= 52) {
                                        c1548eyOooO00o.OooO0oO("lat_clsg", strValueOf);
                                    } else {
                                        c1548eyOooO00o.OooO0oO("lat_gmssg", strValueOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    ((h20) c1548eyOooO00o.f18706OooOo).f19526OooO0O0.execute(new g20(c1548eyOooO00o, 1));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1832mn(mb0 mb0Var, long j, kb0 kb0Var, Bundle bundle) {
        this.f21302OooOo = mb0Var;
        this.f21304OooOo0o = j;
        this.f21306OooOoO0 = kb0Var;
        this.f21305OooOoO = bundle;
    }
}

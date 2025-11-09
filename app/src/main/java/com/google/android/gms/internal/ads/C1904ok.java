package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* renamed from: com.google.android.gms.internal.ads.ok */
/* loaded from: classes2.dex */
public final class C1904ok {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzg f23002OooO00o;

    public C1904ok(zzg zzgVar) {
        this.f23002OooO00o = zzgVar;
    }

    public final void OooO00o(int i, long j) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17772o000000)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.f23002OooO00o;
        if (j - zzgVar.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17773o000000O)).booleanValue()) {
            zzgVar.zzH(i);
            zzgVar.zzI(j);
        } else {
            zzgVar.zzH(-1);
            zzgVar.zzI(j);
        }
    }
}

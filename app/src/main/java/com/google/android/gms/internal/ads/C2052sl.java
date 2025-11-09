package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.math.BigInteger;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.sl */
/* loaded from: classes2.dex */
public final class C2052sl implements InterfaceC1738k3 {

    /* renamed from: OooO0O0 */
    public final zzj f24103OooO0O0;

    /* renamed from: OooO0OO */
    public final C2249xx f24104OooO0OO;

    /* renamed from: OooO0Oo */
    public final C2015rl f24105OooO0Oo;

    /* renamed from: OooO00o */
    public final Object f24102OooO00o = new Object();

    /* renamed from: OooO0o0 */
    public final HashSet f24107OooO0o0 = new HashSet();

    /* renamed from: OooO0o */
    public final HashSet f24106OooO0o = new HashSet();

    /* renamed from: OooO0oO */
    public boolean f24108OooO0oO = false;

    public C2052sl(String str, zzj zzjVar) {
        this.f24105OooO0Oo = new C2015rl(str, zzjVar);
        this.f24103OooO0O0 = zzjVar;
        C2249xx c2249xx = new C2249xx(20, false);
        c2249xx.f25815OooOo0o = BigInteger.ONE;
        c2249xx.f25813OooOo = "0";
        this.f24104OooO0OO = c2249xx;
    }

    public final void OooO00o(C1830ml c1830ml) {
        synchronized (this.f24102OooO00o) {
            this.f24107OooO0o0.add(c1830ml);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1738k3
    public final void zza(boolean z) {
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2015rl c2015rl = this.f24105OooO0Oo;
        zzj zzjVar = this.f24103OooO0O0;
        if (!z) {
            zzjVar.zzr(jCurrentTimeMillis);
            zzjVar.zzG(c2015rl.f23878OooO0Oo);
            return;
        }
        if (jCurrentTimeMillis - zzjVar.zzd() > ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17790o0000Oo)).longValue()) {
            c2015rl.f23878OooO0Oo = -1;
        } else {
            c2015rl.f23878OooO0Oo = zzjVar.zzc();
        }
        this.f24108OooO0oO = true;
    }
}

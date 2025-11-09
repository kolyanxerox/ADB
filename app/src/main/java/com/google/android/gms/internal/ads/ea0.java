package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class ea0 implements kb0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final f20 f18529OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18530OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f18531OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f18532OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f18533OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ge0 f18534OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C1949pt f18535OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final vd0 f18536OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final zzj f18537OooO0oo = zzv.zzp().OooO0Oo();

    /* renamed from: OooOO0, reason: collision with root package name */
    public final C2134ut f18538OooOO0;

    public ea0(Context context, String str, String str2, C1949pt c1949pt, ge0 ge0Var, vd0 vd0Var, f20 f20Var, C2134ut c2134ut, long j) {
        this.f18530OooO00o = context;
        this.f18531OooO0O0 = str;
        this.f18532OooO0OO = str2;
        this.f18535OooO0o0 = c1949pt;
        this.f18534OooO0o = ge0Var;
        this.f18536OooO0oO = vd0Var;
        this.f18529OooO = f20Var;
        this.f18538OooOO0 = c2134ut;
        this.f18533OooO0Oo = j;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        Bundle bundle = new Bundle();
        this.f18529OooO.f18766OooO00o.put("seq_num", this.f18531OooO0O0);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue()) {
            f20 f20Var = this.f18529OooO;
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            f20Var.OooO00o("tsacc", String.valueOf(System.currentTimeMillis() - this.f18533OooO0Oo));
            f20 f20Var2 = this.f18529OooO;
            zzv.zzq();
            f20Var2.OooO00o("foreground", true != zzs.zzH(this.f18530OooO00o) ? "1" : "0");
        }
        C1949pt c1949pt = this.f18535OooO0o0;
        zzm zzmVar = this.f18536OooO0oO.f24954OooO0Oo;
        C1830ml c1830ml = c1949pt.f23427OooOo0o;
        synchronized (c1830ml.f21272OooO0Oo) {
            ((Oooo0OO.oo000o) c1830ml.f21269OooO00o).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c1830ml.f21277OooOO0 = jElapsedRealtime;
            C2052sl c2052sl = c1830ml.f21270OooO0O0;
            synchronized (c2052sl.f24102OooO00o) {
                c2052sl.f24105OooO0Oo.OooO00o(zzmVar, jElapsedRealtime);
            }
        }
        bundle.putAll(this.f18534OooO0o.OooO00o());
        return ii0.OooooOO(new fa0(this.f18530OooO00o, bundle, this.f18531OooO0O0, this.f18532OooO0OO, this.f18537OooO0oo, this.f18536OooO0oO.f24955OooO0o, this.f18538OooOO0));
    }
}

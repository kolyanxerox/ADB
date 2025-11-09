package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.rl */
/* loaded from: classes2.dex */
public final class C2015rl {

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f23881OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final zzj f23882OooO0oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f23875OooO00o = -1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f23876OooO0O0 = -1;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f23877OooO0OO = -1;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f23878OooO0Oo = -1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f23880OooO0o0 = 0;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Object f23879OooO0o = new Object();

    /* renamed from: OooO, reason: collision with root package name */
    public int f23874OooO = 0;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f23883OooOO0 = 0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f23884OooOO0O = 0;

    public C2015rl(String str, zzj zzjVar) {
        this.f23881OooO0oO = str;
        this.f23882OooO0oo = zzjVar;
    }

    public final void OooO00o(zzm zzmVar, long j) {
        Bundle bundle;
        synchronized (this.f23879OooO0o) {
            try {
                long jZzd = this.f23882OooO0oo.zzd();
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f23876OooO0O0 == -1) {
                    if (jCurrentTimeMillis - jZzd > ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17790o0000Oo)).longValue()) {
                        this.f23878OooO0Oo = -1;
                    } else {
                        this.f23878OooO0Oo = this.f23882OooO0oo.zzc();
                    }
                    this.f23876OooO0O0 = j;
                    this.f23875OooO00o = j;
                } else {
                    this.f23875OooO00o = j;
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17904o00OOOo)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.f23877OooO0OO++;
                    int i = this.f23878OooO0Oo + 1;
                    this.f23878OooO0Oo = i;
                    if (i == 0) {
                        this.f23880OooO0o0 = 0L;
                        this.f23882OooO0oo.zzz(jCurrentTimeMillis);
                    } else {
                        this.f23880OooO0o0 = jCurrentTimeMillis - this.f23882OooO0oo.zze();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0() {
        if (((Boolean) AbstractC1891o8.f22356OooO00o.OooOOO()).booleanValue()) {
            synchronized (this.f23879OooO0o) {
                this.f23877OooO0OO--;
                this.f23878OooO0Oo--;
            }
        }
    }
}

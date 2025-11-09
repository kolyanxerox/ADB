package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xo */
/* loaded from: classes2.dex */
public final class BinderC2240xo extends zzea {

    /* renamed from: OooOo */
    public final boolean f25655OooOo;

    /* renamed from: OooOo0O */
    public final InterfaceC1722jo f25656OooOo0O;

    /* renamed from: OooOoO */
    public int f25658OooOoO;

    /* renamed from: OooOoO0 */
    public final boolean f25659OooOoO0;

    /* renamed from: OooOoOO */
    public zzee f25660OooOoOO;

    /* renamed from: OooOoo0 */
    public boolean f25662OooOoo0;

    /* renamed from: OooOooO */
    public float f25663OooOooO;

    /* renamed from: OooOooo */
    public float f25664OooOooo;

    /* renamed from: Oooo0 */
    public C1856na f25665Oooo0;

    /* renamed from: Oooo000 */
    public float f25666Oooo000;

    /* renamed from: Oooo00O */
    public boolean f25667Oooo00O;

    /* renamed from: Oooo00o */
    public boolean f25668Oooo00o;

    /* renamed from: OooOo0o */
    public final Object f25657OooOo0o = new Object();

    /* renamed from: OooOoo */
    public boolean f25661OooOoo = true;

    public BinderC2240xo(InterfaceC1722jo interfaceC1722jo, float f, boolean z, boolean z2) {
        this.f25656OooOo0O = interfaceC1722jo;
        this.f25663OooOooO = f;
        this.f25655OooOo = z;
        this.f25659OooOoO0 = z2;
    }

    public final void o000O0O0(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f25657OooOo0o) {
            try {
                z2 = true;
                if (f2 == this.f25663OooOooO && f3 == this.f25666Oooo000) {
                    z2 = false;
                }
                this.f25663OooOooO = f2;
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oO0Oo)).booleanValue()) {
                    this.f25664OooOooo = f;
                }
                z3 = this.f25661OooOoo;
                this.f25661OooOoo = z;
                i2 = this.f25658OooOoO;
                this.f25658OooOoO = i;
                float f4 = this.f25666Oooo000;
                this.f25666Oooo000 = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.f25656OooOo0O.OooO0oO().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                C1856na c1856na = this.f25665Oooo0;
                if (c1856na != null) {
                    c1856na.o000OO0O(c1856na.OooO(), 2);
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        AbstractC2200wl.f25325OooO0o.execute(new RunnableC2203wo(this, i2, i, z3, z));
    }

    public final void o000O0o0(zzga zzgaVar) {
        Object obj = this.f25657OooOo0o;
        boolean z = zzgaVar.zza;
        boolean z2 = zzgaVar.zzb;
        boolean z3 = zzgaVar.zzc;
        synchronized (obj) {
            this.f25667Oooo00O = z2;
            this.f25668Oooo00o = z3;
        }
        String str = true != z ? "0" : "1";
        String str2 = true != z2 ? "0" : "1";
        String str3 = true != z3 ? "0" : "1";
        ArrayMap arrayMap = new ArrayMap(3);
        arrayMap.put("muteStart", str);
        arrayMap.put("customControlsRequested", str2);
        arrayMap.put("clickToExpandRequested", str3);
        o000O0oO("initialState", Collections.unmodifiableMap(arrayMap));
    }

    public final void o000O0oO(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        AbstractC2200wl.f25325OooO0o.execute(new wp0(16, this, map2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
        float f;
        synchronized (this.f25657OooOo0o) {
            f = this.f25666Oooo000;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        float f;
        synchronized (this.f25657OooOo0o) {
            f = this.f25664OooOooo;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        float f;
        synchronized (this.f25657OooOo0o) {
            f = this.f25663OooOooO;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
        int i;
        synchronized (this.f25657OooOo0o) {
            i = this.f25658OooOoO;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() {
        zzee zzeeVar;
        synchronized (this.f25657OooOo0o) {
            zzeeVar = this.f25660OooOoOO;
        }
        return zzeeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) {
        o000O0oO(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
        o000O0oO("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() {
        o000O0oO("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzeeVar) {
        synchronized (this.f25657OooOo0o) {
            this.f25660OooOoOO = zzeeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() {
        o000O0oO("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() {
        boolean z;
        Object obj = this.f25657OooOo0o;
        boolean zZzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zZzp) {
                try {
                    if (this.f25668Oooo00o && this.f25659OooOoO0) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
        boolean z;
        synchronized (this.f25657OooOo0o) {
            try {
                z = false;
                if (this.f25655OooOo && this.f25667Oooo00O) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
        boolean z;
        synchronized (this.f25657OooOo0o) {
            z = this.f25661OooOoo;
        }
        return z;
    }
}

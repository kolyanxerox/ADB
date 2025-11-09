package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class jd0 {

    /* renamed from: OooO00o */
    public final Oooo0OO.o00Ooo f20286OooO00o;

    /* renamed from: OooO0O0 */
    public final h20 f20287OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f20288OooO0OO = new Object();

    /* renamed from: OooO0o0 */
    public volatile int f20290OooO0o0 = 1;

    /* renamed from: OooO0Oo */
    public volatile long f20289OooO0Oo = 0;

    public jd0(Oooo0OO.o00Ooo o00ooo2, h20 h20Var) {
        this.f20286OooO00o = o00ooo2;
        this.f20287OooO0O0 = h20Var;
    }

    public final void OooO00o(boolean z) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OOo0)).booleanValue()) {
            C1548ey c1548eyOooO00o = this.f20287OooO0O0.OooO00o();
            c1548eyOooO00o.OooO0oO("action", "mbs_state");
            c1548eyOooO00o.OooO0oO("mbs_state", true != z ? "0" : "1");
            c1548eyOooO00o.OooOOO0();
        }
        if (z) {
            OooO0OO(1, 2);
        } else {
            OooO0OO(2, 1);
        }
    }

    public final void OooO0O0() {
        ((Oooo0OO.oo000o) this.f20286OooO00o).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f20288OooO0OO) {
            try {
                if (this.f20290OooO0o0 == 3) {
                    if (this.f20289OooO0Oo + ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo)).longValue() <= jCurrentTimeMillis) {
                        this.f20290OooO0o0 = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(int i, int i2) {
        OooO0O0();
        Object obj = this.f20288OooO0OO;
        ((Oooo0OO.oo000o) this.f20286OooO00o).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f20290OooO0o0 != i) {
                    return;
                }
                this.f20290OooO0o0 = i2;
                if (this.f20290OooO0o0 == 3) {
                    this.f20289OooO0Oo = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

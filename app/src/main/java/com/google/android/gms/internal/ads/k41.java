package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.p012di.ServiceProvider;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k41 implements d51 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final eb1 f20445OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f20446OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f20447OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f20448OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f20449OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f20450OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f20451OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f20452OooO0oo;

    public k41() {
        eb1 eb1Var = new eb1();
        OooO0oo(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL, 0, "bufferForPlaybackMs", "0");
        OooO0oo(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        OooO0oo(C3034d9.b.f7938d, UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL, "minBufferMs", "bufferForPlaybackMs");
        OooO0oo(C3034d9.b.f7938d, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        OooO0oo(C3034d9.b.f7938d, C3034d9.b.f7938d, "maxBufferMs", "minBufferMs");
        OooO0oo(0, 0, "backBufferDurationMs", "0");
        this.f20445OooO00o = eb1Var;
        long jOooOOoo = i80.OooOOoo(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.f20446OooO0O0 = jOooOOoo;
        this.f20447OooO0OO = jOooOOoo;
        this.f20448OooO0Oo = i80.OooOOoo(2500L);
        this.f20450OooO0o0 = i80.OooOOoo(5000L);
        this.f20449OooO0o = i80.OooOOoo(0L);
        this.f20451OooO0oO = new HashMap();
        this.f20452OooO0oo = -1L;
    }

    public static void OooO0oo(int i, int i2, String str, String str2) {
        af0.OoooOOo(OooO0oO.OooOo.OooOoo(str, " cannot be less than ", str2), i >= i2);
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final boolean OooO00o(c51 c51Var) {
        int i;
        j41 j41Var = (j41) this.f20451OooO0oO.get(c51Var.f17697OooO00o);
        j41Var.getClass();
        eb1 eb1Var = this.f20445OooO00o;
        synchronized (eb1Var) {
            i = eb1Var.f18558OooO0O0 * 65536;
        }
        int iOooO0oO = OooO0oO();
        float f = c51Var.f17699OooO0OO;
        long j = this.f20447OooO0OO;
        long jMin = this.f20446OooO0O0;
        if (f > 1.0f) {
            jMin = Math.min(i80.OooOOo(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c51Var.f17698OooO0O0;
        if (j2 < jMax) {
            boolean z = i < iOooO0oO;
            j41Var.f20182OooO00o = z;
            if (!z && j2 < 500000) {
                AbstractC1641hg.OooOOo0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || i >= iOooO0oO) {
            j41Var.f20182OooO00o = false;
        }
        return j41Var.f20182OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0O0(o61 o61Var) {
        long id = Thread.currentThread().getId();
        long j = this.f20452OooO0oo;
        boolean z = true;
        if (j != -1 && j != id) {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        }
        this.f20452OooO0oo = id;
        HashMap map = this.f20451OooO0oO;
        if (!map.containsKey(o61Var)) {
            map.put(o61Var, new j41());
        }
        j41 j41Var = (j41) map.get(o61Var);
        j41Var.getClass();
        j41Var.f20183OooO0O0 = 13107200;
        j41Var.f20182OooO00o = false;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0OO(o61 o61Var) {
        if (this.f20451OooO0oO.remove(o61Var) != null) {
            boolean zIsEmpty = this.f20451OooO0oO.isEmpty();
            eb1 eb1Var = this.f20445OooO00o;
            if (!zIsEmpty) {
                eb1Var.OooO00o(OooO0oO());
            } else {
                synchronized (eb1Var) {
                    eb1Var.OooO00o(0);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final boolean OooO0Oo(c51 c51Var) {
        int i;
        boolean z = c51Var.f17700OooO0Oo;
        long jRound = c51Var.f17698OooO0O0;
        float f = c51Var.f17699OooO0OO;
        int i2 = i80.f19994OooO00o;
        if (f != 1.0f) {
            jRound = Math.round(jRound / f);
        }
        long jMin = z ? this.f20450OooO0o0 : this.f20448OooO0Oo;
        long j = c51Var.f17701OooO0o0;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jRound >= jMin) {
            return true;
        }
        eb1 eb1Var = this.f20445OooO00o;
        synchronized (eb1Var) {
            i = eb1Var.f18558OooO0O0 * 65536;
        }
        return i >= OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0o(c51 c51Var, za1[] za1VarArr) {
        j41 j41Var = (j41) this.f20451OooO0oO.get(c51Var.f17697OooO00o);
        j41Var.getClass();
        int length = za1VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i >= length) {
                break;
            }
            za1 za1Var = za1VarArr[i];
            if (za1Var != null) {
                int i4 = za1Var.zzg().f17494OooO0OO;
                if (i4 != -1) {
                    if (i4 == 0) {
                        i3 = 144310272;
                    } else if (i4 != 1) {
                        i3 = i4 != 2 ? 131072 : 131072000;
                    }
                }
                i2 += i3;
            }
            i++;
        }
        j41Var.f20183OooO0O0 = Math.max(13107200, i2);
        boolean zIsEmpty = this.f20451OooO0oO.isEmpty();
        eb1 eb1Var = this.f20445OooO00o;
        if (!zIsEmpty) {
            eb1Var.OooO00o(OooO0oO());
        } else {
            synchronized (eb1Var) {
                eb1Var.OooO00o(0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0o0(o61 o61Var) {
        if (this.f20451OooO0oO.remove(o61Var) != null) {
            boolean zIsEmpty = this.f20451OooO0oO.isEmpty();
            eb1 eb1Var = this.f20445OooO00o;
            if (zIsEmpty) {
                synchronized (eb1Var) {
                    eb1Var.OooO00o(0);
                }
            } else {
                eb1Var.OooO00o(OooO0oO());
            }
        }
        if (this.f20451OooO0oO.isEmpty()) {
            this.f20452OooO0oo = -1L;
        }
    }

    public final int OooO0oO() {
        Iterator it = this.f20451OooO0oO.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((j41) it.next()).f20183OooO0O0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final long zzb() {
        return this.f20449OooO0o;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final boolean zzi() {
        Iterator it = this.f20451OooO0oO.values().iterator();
        while (it.hasNext()) {
            if (((j41) it.next()).f20182OooO00o) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final eb1 zzk() {
        return this.f20445OooO00o;
    }
}

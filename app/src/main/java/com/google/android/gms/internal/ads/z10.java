package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z10 implements hf0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f26064OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26065OooOo0O = 1;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f26066OooOo0o;

    public z10(C1998r4 c1998r4, Map map) {
        this.f26066OooOo0o = map;
        this.f26064OooOo = c1998r4;
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO00o(ef0 ef0Var, String str, Throwable th) {
        switch (this.f26065OooOo0O) {
            case 0:
                Map map = (Map) this.f26066OooOo0o;
                if (map.containsKey(ef0Var)) {
                    ((C1998r4) this.f26064OooOo).OooO0O0(((y10) map.get(ef0Var)).f25837OooO0OO);
                    return;
                }
                return;
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue() && ef0.RENDERER == ef0Var) {
                    m50 m50Var = (m50) this.f26066OooOo0o;
                    if (m50Var.OooO00o() != 0) {
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - m50Var.OooO00o();
                        synchronized (m50Var) {
                            synchronized (m50Var.f21088OooOO0) {
                                m50Var.f21085OooO0o0 = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO0o(ef0 ef0Var, String str) {
        switch (this.f26065OooOo0O) {
            case 0:
                Map map = (Map) this.f26066OooOo0o;
                if (map.containsKey(ef0Var)) {
                    ((C1998r4) this.f26064OooOo).OooO0O0(((y10) map.get(ef0Var)).f25836OooO0O0);
                    return;
                }
                return;
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue() && ef0.RENDERER == ef0Var) {
                    m50 m50Var = (m50) this.f26066OooOo0o;
                    if (m50Var.OooO00o() != 0) {
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - m50Var.OooO00o();
                        synchronized (m50Var) {
                            synchronized (m50Var.f21088OooOO0) {
                                m50Var.f21085OooO0o0 = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO0o0(String str) {
        int i = this.f26065OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void Oooo0oO(ef0 ef0Var, String str) {
        switch (this.f26065OooOo0O) {
            case 0:
                Map map = (Map) this.f26066OooOo0o;
                if (map.containsKey(ef0Var)) {
                    ((C1998r4) this.f26064OooOo).OooO0O0(((y10) map.get(ef0Var)).f25835OooO00o);
                    return;
                }
                return;
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue()) {
                    if (ef0.RENDERER == ef0Var) {
                        m50 m50Var = (m50) this.f26066OooOo0o;
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (m50Var) {
                            synchronized (m50Var.f21079OooO) {
                                m50Var.f21083OooO0Oo = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (ef0.PRELOADED_LOADER == ef0Var || ef0.SERVER_TRANSACTION == ef0Var) {
                        m50 m50Var2 = (m50) this.f26066OooOo0o;
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        synchronized (m50Var2) {
                            synchronized (m50Var2.f21084OooO0o) {
                                m50Var2.f21080OooO00o = jElapsedRealtime2;
                            }
                        }
                        n50 n50Var = (n50) this.f26064OooOo;
                        ((C1548ey) n50Var.f13857OooO0O0).OooO0O0(new OoooOOO.o0O0O0O(n50Var, ((m50) this.f26066OooOo0o).OooO0O0()));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z10(m50 m50Var, n50 n50Var) {
        this.f26066OooOo0o = m50Var;
        this.f26064OooOo = n50Var;
    }

    private final void OooO0O0(String str) {
    }

    private final void OooO0OO(String str) {
    }
}

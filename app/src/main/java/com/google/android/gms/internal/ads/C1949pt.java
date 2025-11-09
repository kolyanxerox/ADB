package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zza;

/* renamed from: com.google.android.gms.internal.ads.pt */
/* loaded from: classes2.dex */
public final class C1949pt implements InterfaceC1656hv, zza, InterfaceC2173vv, InterfaceC1399av, InterfaceC2024ru, InterfaceC1620gw {

    /* renamed from: OooOo0O */
    public final Oooo0OO.o00Ooo f23426OooOo0O;

    /* renamed from: OooOo0o */
    public final C1830ml f23427OooOo0o;

    public C1949pt(Oooo0OO.o00Ooo o00ooo2, C1830ml c1830ml) {
        this.f23426OooOo0O = o00ooo2;
        this.f23427OooOo0o = c1830ml;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OooOO0(C2184w5 c2184w5) {
        C1830ml c1830ml = this.f23427OooOo0o;
        synchronized (c1830ml.f21272OooO0Oo) {
            C2052sl c2052sl = c1830ml.f21270OooO0O0;
            synchronized (c2052sl.f24102OooO00o) {
                c2052sl.f24105OooO0Oo.OooO0O0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OooOOO(C2184w5 c2184w5) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OoooO00(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        C1830ml c1830ml = this.f23427OooOo0o;
        synchronized (c1830ml.f21272OooO0Oo) {
            try {
                if (c1830ml.f21278OooOO0O != -1) {
                    ((Oooo0OO.oo000o) c1830ml.f21269OooO00o).getClass();
                    c1830ml.f21276OooO0oo = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OoooOo0(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void Oooooo0(C2184w5 c2184w5) {
        C1830ml c1830ml = this.f23427OooOo0o;
        synchronized (c1830ml.f21272OooO0Oo) {
            C2052sl c2052sl = c1830ml.f21270OooO0O0;
            synchronized (c2052sl.f24102OooO00o) {
                c2052sl.f24105OooO0Oo.OooO0O0();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        C1830ml c1830ml = this.f23427OooOo0o;
        synchronized (c1830ml.f21272OooO0Oo) {
            if (c1830ml.f21278OooOO0O != -1) {
                C1793ll c1793ll = new C1793ll(c1830ml);
                ((Oooo0OO.oo000o) c1830ml.f21269OooO00o).getClass();
                c1793ll.f20898OooO00o = SystemClock.elapsedRealtime();
                c1830ml.f21271OooO0OO.add(c1793ll);
                c1830ml.f21268OooO++;
                C2052sl c2052sl = c1830ml.f21270OooO0O0;
                synchronized (c2052sl.f24102OooO00o) {
                    C2015rl c2015rl = c2052sl.f24105OooO0Oo;
                    synchronized (c2015rl.f23879OooO0o) {
                        c2015rl.f23874OooO++;
                    }
                }
                c1830ml.f21270OooO0O0.OooO00o(c1830ml);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
        Oooo0OO.o00Ooo o00ooo2 = this.f23426OooOo0O;
        C1830ml c1830ml = this.f23427OooOo0o;
        ((Oooo0OO.oo000o) o00ooo2).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c1830ml.f21272OooO0Oo) {
            try {
                c1830ml.f21278OooOO0O = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    c1830ml.f21270OooO0O0.OooO00o(c1830ml);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zza() {
        C1830ml c1830ml = this.f23427OooOo0o;
        synchronized (c1830ml.f21272OooO0Oo) {
            try {
                if (c1830ml.f21278OooOO0O != -1 && !c1830ml.f21271OooO0OO.isEmpty()) {
                    C1793ll c1793ll = (C1793ll) c1830ml.f21271OooO0OO.getLast();
                    if (c1793ll.f20899OooO0O0 == -1) {
                        ((Oooo0OO.oo000o) c1793ll.f20900OooO0OO.f21269OooO00o).getClass();
                        c1793ll.f20899OooO0O0 = SystemClock.elapsedRealtime();
                        c1830ml.f21270OooO0O0.OooO00o(c1830ml);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        C1830ml c1830ml = this.f23427OooOo0o;
        synchronized (c1830ml.f21272OooO0Oo) {
            try {
                if (c1830ml.f21278OooOO0O != -1 && c1830ml.f21275OooO0oO == -1) {
                    ((Oooo0OO.oo000o) c1830ml.f21269OooO00o).getClass();
                    c1830ml.f21275OooO0oO = SystemClock.elapsedRealtime();
                    c1830ml.f21270OooO0O0.OooO00o(c1830ml);
                }
                C2052sl c2052sl = c1830ml.f21270OooO0O0;
                synchronized (c2052sl.f24102OooO00o) {
                    C2015rl c2015rl = c2052sl.f24105OooO0Oo;
                    synchronized (c2015rl.f23879OooO0o) {
                        c2015rl.f23883OooOO0++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void OooO0oo(BinderC1460cj binderC1460cj, String str, String str2) {
    }
}

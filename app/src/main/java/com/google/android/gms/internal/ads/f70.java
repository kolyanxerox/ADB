package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class f70 extends AbstractBinderC1791lj implements InterfaceC1545ev {

    /* renamed from: OooOo, reason: collision with root package name */
    public C2051sk f18797OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public h80 f18798OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.o0OOO00 f18799OooOo0o;

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ev
    public final synchronized void OooO(com.google.android.gms.internal.measurement.o0OOO00 o0ooo00) {
        this.f18799OooOo0o = o0ooo00;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void Oooo00O(Oooo0o.OooO0O0 oooO0O0) {
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f18799OooOo0o;
        if (o0ooo00 != null) {
            synchronized (o0ooo00) {
                ((C2274yl) o0ooo00.f26562OooOo).zzc(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void OoooO0O(Oooo0o.OooO0O0 oooO0O0, int i) {
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f18799OooOo0o;
        if (o0ooo00 != null) {
            o0ooo00.OooO0O0(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void OooooOo(Oooo0o.OooO0O0 oooO0O0) {
        C2051sk c2051sk = this.f18797OooOo;
        if (c2051sk != null) {
            Executor executor = ((c80) c2051sk.f24099OooOoO).f17955OooO0OO;
            l60 l60Var = (l60) c2051sk.f24100OooOoO0;
            executor.execute(new OoooOOO.o0OOOO0o(c2051sk, (rd0) c2051sk.f24098OooOo0o, (kd0) c2051sk.f24096OooOo, l60Var, 10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void o0000() {
        C2051sk c2051sk = this.f18797OooOo;
        if (c2051sk != null) {
            zzo.zzj("Fail to initialize adapter ".concat(String.valueOf(((l60) c2051sk.f24100OooOoO0).f20808OooO00o)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void o000O00() {
        h80 h80Var = this.f18798OooOo0O;
        if (h80Var != null) {
            h80Var.f19650OooOo.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void o000OoO(Oooo0o.OooO0O0 oooO0O0) {
        h80 h80Var = this.f18798OooOo0O;
        if (h80Var != null) {
            h80Var.o000OoO(oooO0O0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void o000Ooo(Oooo0o.OooO0O0 oooO0O0, C1865nj c1865nj) {
        h80 h80Var = this.f18798OooOo0O;
        if (h80Var != null) {
            h80Var.f19653OooOoO0.o00o0O(c1865nj);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void o0OO00O(Oooo0o.OooO0O0 oooO0O0) {
        h80 h80Var = this.f18798OooOo0O;
        if (h80Var != null) {
            h80Var.f19653OooOoO0.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void zze(Oooo0o.OooO0O0 oooO0O0) {
        h80 h80Var = this.f18798OooOo0O;
        if (h80Var != null) {
            h80Var.f19652OooOo0o.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void zzj(Oooo0o.OooO0O0 oooO0O0) {
        h80 h80Var = this.f18798OooOo0O;
        if (h80Var != null) {
            h80Var.f19651OooOo0O.zzdp();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828mj
    public final synchronized void zzn(Oooo0o.OooO0O0 oooO0O0) {
        h80 h80Var = this.f18798OooOo0O;
        if (h80Var != null) {
            h80Var.f19650OooOo.o0000Ooo(new C2007rd(29));
        }
    }
}

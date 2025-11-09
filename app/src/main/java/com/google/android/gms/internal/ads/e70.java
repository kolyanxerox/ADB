package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class e70 extends AbstractBinderC2304ze implements InterfaceC1545ev {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public m80 f18511OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.o0OOO00 f18512OooOo0o;

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ev
    public final synchronized void OooO(com.google.android.gms.internal.measurement.o0OOO00 o0ooo00) {
        this.f18512OooOo0o = o0ooo00;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void OooO00o(int i) {
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f18512OooOo0o;
        if (o0ooo00 != null) {
            o0ooo00.OooO0O0(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void OooO0O0() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.OooO0O0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void OooOOOO(String str, String str2) {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.OooOOOO(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void OooOoO(int i, String str) {
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f18512OooOo0o;
        if (o0ooo00 != null) {
            synchronized (o0ooo00) {
                try {
                    if (!o0ooo00.f26563OooOo0O) {
                        o0ooo00.f26563OooOo0O = true;
                        if (str == null) {
                            str = "Error from: " + ((l60) o0ooo00.f26564OooOo0o).f20808OooO00o + ", code: " + i;
                        }
                        o0ooo00.OooO0Oo(new zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void OooOoO0() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.OooOoO0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void OooOoo0(zze zzeVar) {
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f18512OooOo0o;
        if (o0ooo00 != null) {
            synchronized (o0ooo00) {
                if (!o0ooo00.f26563OooOo0O) {
                    o0ooo00.f26563OooOo0O = true;
                    o0ooo00.OooO0Oo(zzeVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void OoooOOo(zze zzeVar) {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.OoooOOo(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void o000(InterfaceC1415ba interfaceC1415ba, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void o0000o(C1865nj c1865nj) {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.o0000o(c1865nj);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void o0000oo(InterfaceC1939pj interfaceC1939pj) {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.o0000oo(interfaceC1939pj);
        }
    }

    public final synchronized void o000O0o0(m80 m80Var) {
        this.f18511OooOo0O = m80Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void o00O0O(int i) {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.o00O0O(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zze() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzf() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzl(String str) {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzm() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzn() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzo() {
        try {
            m80 m80Var = this.f18511OooOo0O;
            if (m80Var != null) {
                m80Var.zzo();
            }
            com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f18512OooOo0o;
            if (o0ooo00 != null) {
                synchronized (o0ooo00) {
                    ((C2274yl) o0ooo00.f26562OooOo).zzc(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzp() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzu() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzv() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1383af
    public final synchronized void zzx() {
        m80 m80Var = this.f18511OooOo0O;
        if (m80Var != null) {
            m80Var.zzx();
        }
    }
}

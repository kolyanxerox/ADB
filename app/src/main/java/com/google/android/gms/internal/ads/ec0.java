package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ec0 implements InterfaceC2135uu, InterfaceC1840mv, qc0, zzr, InterfaceC1988qv, InterfaceC2283yu, InterfaceC1401ax {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final he0 f18562OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicReference f18563OooOo0o = new AtomicReference();

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicReference f18561OooOo = new AtomicReference();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReference f18565OooOoO0 = new AtomicReference();

    /* renamed from: OooOoO, reason: collision with root package name */
    public final AtomicReference f18564OooOoO = new AtomicReference();

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicReference f18566OooOoOO = new AtomicReference();

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicReference f18568OooOoo0 = new AtomicReference();

    /* renamed from: OooOoo, reason: collision with root package name */
    public ec0 f18567OooOoo = null;

    public ec0(he0 he0Var) {
        this.f18562OooOo0O = he0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1988qv
    public final void OooO00o(zzu zzuVar) {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.OooO00o(zzuVar);
            return;
        }
        Object obj = this.f18568OooOoo0.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdr) obj).zze(zzuVar);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void OooO0o() {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.OooO0o();
            return;
        }
        C1847n1 c1847n1 = this.f18562OooOo0O.f19717OooO00o;
        if (c1847n1 != null) {
            ab1 ab1Var = (ab1) c1847n1.f21381OooOo0o;
            synchronized (ab1Var) {
                ab1Var.f17021OooOo0O = 1;
                ab1Var.OooO0o0();
            }
        }
        if (this.f18561OooOo.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj = this.f18565OooOoO0.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1482d4) obj).zzc();
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2283yu
    public final void OooO0o0(zze zzeVar) {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.OooO0o0(zzeVar);
            return;
        }
        Object obj = this.f18565OooOoO0.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1482d4) obj).zzd(zzeVar);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void OooO0oo(BinderC1396as binderC1396as) {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.OooO0oo(binderC1396as);
            return;
        }
        Object obj = this.f18563OooOo0o.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1409b4) obj).OooOo00(binderC1396as);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void Oooo000() {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.Oooo000();
            return;
        }
        Object obj = this.f18565OooOoO0.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1482d4) obj).zzb();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.o0OOO0o(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.f18563OooOo0o;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC1409b4) obj).o0000oOO(zzeVar);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC1409b4) obj2).zzb(zzeVar.zza);
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.zzdo();
        } else {
            af0.OooOOOo(this.f18566OooOoOO, new C1658hx(16, (byte) 0));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.zzdp();
            return;
        }
        af0.OooOOOo(this.f18566OooOoOO, new C1658hx(19, (byte) 0));
        AtomicReference atomicReference = this.f18565OooOoO0;
        af0.OooOOOo(atomicReference, new C1658hx(15, (byte) 0));
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1482d4) obj).zze();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.zzdr();
        } else {
            af0.OooOOOo(this.f18566OooOoOO, new C1658hx(18, (byte) 0));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.zzds(i);
            return;
        }
        Object obj = this.f18566OooOoOO.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzr) obj).zzds(i);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1840mv
    public final void zzg() {
        ec0 ec0Var = this.f18567OooOoo;
        if (ec0Var != null) {
            ec0Var.zzg();
        } else {
            af0.OooOOOo(this.f18564OooOoO, new C1658hx(17, (byte) 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void zzu() {
    }
}

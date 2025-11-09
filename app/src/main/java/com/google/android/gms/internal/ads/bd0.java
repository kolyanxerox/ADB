package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class bd0 implements OnAdMetadataChangedListener, InterfaceC1656hv, InterfaceC2135uu, InterfaceC2024ru, InterfaceC2283yu, InterfaceC1988qv, qc0, InterfaceC1401ax {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final he0 f17479OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicReference f17480OooOo0o = new AtomicReference();

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicReference f17478OooOo = new AtomicReference();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReference f17482OooOoO0 = new AtomicReference();

    /* renamed from: OooOoO, reason: collision with root package name */
    public final AtomicReference f17481OooOoO = new AtomicReference();

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicReference f17483OooOoOO = new AtomicReference();

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicReference f17485OooOoo0 = new AtomicReference();

    /* renamed from: OooOoo, reason: collision with root package name */
    public final AtomicReference f17484OooOoo = new AtomicReference();

    /* renamed from: OooOooO, reason: collision with root package name */
    public final bd0 f17486OooOooO = null;

    public bd0(he0 he0Var) {
        this.f17479OooOo0O = he0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1988qv
    public final void OooO00o(zzu zzuVar) {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.OooO00o(zzuVar);
            return;
        }
        Object obj = this.f17484OooOoo.get();
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2283yu
    public final void OooO0o0(zze zzeVar) {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.OooO0o0(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.f17482OooOoO0;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC2161vj) obj).o00ooo(zzeVar);
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
            ((InterfaceC2161vj) obj2).OooOO0O(zzeVar.zza);
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void OooO0oo(BinderC1460cj binderC1460cj, String str, String str2) {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.OooO0oo(binderC1460cj, str, str2);
            return;
        }
        Object obj = this.f17482OooOoO0.get();
        String str3 = binderC1460cj.f18002OooOo0O;
        int i = binderC1460cj.f18003OooOo0o;
        if (obj != null) {
            try {
                ((InterfaceC2161vj) obj).Oooo00o(new BinderC1608gk(str3, i));
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.f17483OooOoOO.get();
        if (obj2 != null) {
            try {
                C1388ak c1388ak = (C1388ak) obj2;
                BinderC1608gk binderC1608gk = new BinderC1608gk(str3, i);
                Parcel parcelOooO = c1388ak.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO, binderC1608gk);
                parcelOooO.writeString(str);
                parcelOooO.writeString(str2);
                c1388ak.o000OO0O(parcelOooO, 2);
            } catch (RemoteException e3) {
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.f17481OooOoO.get();
        if (obj3 != null) {
            try {
                C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj3);
                Parcel parcelOooO2 = c1644hj.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO2, binderC1460cj);
                c1644hj.o000OO0O(parcelOooO2, 5);
            } catch (RemoteException e5) {
                zzo.zzl("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        Object obj4 = this.f17485OooOoo0.get();
        if (obj4 == null) {
            return;
        }
        try {
            C1533ej c1533ej = (C1533ej) obj4;
            Parcel parcelOooO3 = c1533ej.OooO();
            AbstractC2218x2.OooO0o0(parcelOooO3, binderC1460cj);
            parcelOooO3.writeString(str);
            parcelOooO3.writeString(str2);
            c1533ej.o000OO0O(parcelOooO3, 2);
        } catch (RemoteException e7) {
            zzo.zzl("#007 Could not call remote method.", e7);
        } catch (NullPointerException e8) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void Oooo000() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.Oooo000();
        } else {
            af0.OooOOOo(this.f17482OooOoO0, new C1658hx(24, (byte) 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.OoooOOO();
            return;
        }
        Object obj = this.f17478OooOo.get();
        if (obj != null) {
            try {
                ((InterfaceC2309zj) obj).zzg();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.f17481OooOoO.get();
        if (obj2 == null) {
            return;
        }
        try {
            C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj2);
            c1644hj.o000OO0O(c1644hj.OooO(), 1);
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.o0OOO0o(zzeVar);
            return;
        }
        int i = zzeVar.zza;
        AtomicReference atomicReference = this.f17478OooOo;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC2309zj) obj).zzf(zzeVar);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC2309zj) obj2).zze(i);
            } catch (RemoteException e3) {
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.f17481OooOoO.get();
        if (obj3 == null) {
            return;
        }
        try {
            C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj3);
            Parcel parcelOooO = c1644hj.OooO();
            parcelOooO.writeInt(i);
            c1644hj.o000OO0O(parcelOooO, 7);
        } catch (RemoteException e5) {
            zzo.zzl("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.onAdMetadataChanged();
        } else {
            af0.OooOOOo(this.f17480OooOo0o, new C1658hx(23, (byte) 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zza() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.zza();
            return;
        }
        C1847n1 c1847n1 = this.f17479OooOo0O.f19717OooO00o;
        if (c1847n1 != null) {
            ab1 ab1Var = (ab1) c1847n1.f21381OooOo0o;
            synchronized (ab1Var) {
                ab1Var.f17021OooOo0O = 1;
                ab1Var.OooO0o0();
            }
        }
        Object obj = this.f17482OooOoO0.get();
        if (obj != null) {
            try {
                ((InterfaceC2161vj) obj).zzg();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.f17481OooOoO.get();
        if (obj2 == null) {
            return;
        }
        try {
            C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj2);
            c1644hj.o000OO0O(c1644hj.OooO(), 4);
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzb() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.zzb();
            return;
        }
        Object obj = this.f17481OooOoO.get();
        if (obj == null) {
            return;
        }
        try {
            C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj);
            c1644hj.o000OO0O(c1644hj.OooO(), 6);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzc() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.zzc();
            return;
        }
        AtomicReference atomicReference = this.f17482OooOoO0;
        af0.OooOOOo(atomicReference, new C1658hx(21, (byte) 0));
        Object obj = this.f17481OooOoO.get();
        if (obj != null) {
            try {
                C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj);
                c1644hj.o000OO0O(c1644hj.OooO(), 2);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        af0.OooOOOo(atomicReference, new C1658hx(22, (byte) 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zze() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.zze();
            return;
        }
        Object obj = this.f17481OooOoO.get();
        if (obj == null) {
            return;
        }
        try {
            C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj);
            c1644hj.o000OO0O(c1644hj.OooO(), 8);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzf() {
        bd0 bd0Var = this.f17486OooOooO;
        if (bd0Var != null) {
            bd0Var.zzf();
            return;
        }
        Object obj = this.f17481OooOoO.get();
        if (obj == null) {
            return;
        }
        try {
            C1644hj c1644hj = (C1644hj) ((InterfaceC1681ij) obj);
            c1644hj.o000OO0O(c1644hj.OooO(), 3);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void zzu() {
    }
}

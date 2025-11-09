package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.iy */
/* loaded from: classes2.dex */
public final class BinderC1695iy extends AbstractBinderC2181w2 implements InterfaceC1634h9 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C2065sy f20126OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Oooo0o.OooO0O0 f20127OooOo0o;

    public BinderC1695iy(C2065sy c2065sy) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f20126OooOo0O = c2065sy;
    }

    public static float o000O0O0(Oooo0o.OooO0O0 oooO0O0) {
        Drawable drawable;
        if (oooO0O0 == null || (drawable = (Drawable) Oooo0o.OooO0OO.o000O0oO(oooO0O0)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        C1856na c1856na;
        switch (i) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                this.f20127OooOo0o = oooO0O0O000O0o0;
                parcel2.writeNoException();
                return true;
            case 4:
                Oooo0o.OooO0O0 oooO0O0Zzi = zzi();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                zzeb zzebVarOooO = this.f20126OooOo0O.OooO();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzebVarOooO);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1856na = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c1856na = iInterfaceQueryLocalInterface instanceof C1856na ? (C1856na) iInterfaceQueryLocalInterface : new C1856na(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                if (this.f20126OooOo0O.OooO() instanceof BinderC2240xo) {
                    BinderC2240xo binderC2240xo = (BinderC2240xo) this.f20126OooOo0O.OooO();
                    synchronized (binderC2240xo.f25657OooOo0o) {
                        binderC2240xo.f25665Oooo0 = c1856na;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final float zze() {
        float f;
        float f2;
        C2065sy c2065sy = this.f20126OooOo0O;
        synchronized (c2065sy) {
            f = c2065sy.f24196OooOo;
        }
        if (f != 0.0f) {
            synchronized (c2065sy) {
                f2 = c2065sy.f24196OooOo;
            }
            return f2;
        }
        if (c2065sy.OooO() != null) {
            try {
                return c2065sy.OooO().zze();
            } catch (RemoteException e) {
                zzo.zzh("Remote exception getting video controller aspect ratio.", e);
            }
        } else {
            Oooo0o.OooO0O0 oooO0O0 = this.f20127OooOo0o;
            if (oooO0O0 != null) {
                return o000O0O0(oooO0O0);
            }
            InterfaceC1707j9 interfaceC1707j9OooOO0O = c2065sy.OooOO0O();
            if (interfaceC1707j9OooOO0O != null) {
                float fZzd = (interfaceC1707j9OooOO0O.zzd() == -1 || interfaceC1707j9OooOO0O.zzc() == -1) ? 0.0f : interfaceC1707j9OooOO0O.zzd() / interfaceC1707j9OooOO0O.zzc();
                return fZzd == 0.0f ? o000O0O0(interfaceC1707j9OooOO0O.zzf()) : fZzd;
            }
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final float zzf() {
        C2065sy c2065sy = this.f20126OooOo0O;
        if (c2065sy.OooO() != null) {
            return c2065sy.OooO().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final float zzg() {
        C2065sy c2065sy = this.f20126OooOo0O;
        if (c2065sy.OooO() != null) {
            return c2065sy.OooO().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final zzeb zzh() {
        return this.f20126OooOo0O.OooO();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final Oooo0o.OooO0O0 zzi() {
        Oooo0o.OooO0O0 oooO0O0 = this.f20127OooOo0o;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        InterfaceC1707j9 interfaceC1707j9OooOO0O = this.f20126OooOo0O.OooOO0O();
        if (interfaceC1707j9OooOO0O == null) {
            return null;
        }
        return interfaceC1707j9OooOO0O.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final void zzj(Oooo0o.OooO0O0 oooO0O0) {
        this.f20127OooOo0o = oooO0O0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final boolean zzk() {
        InterfaceC1722jo interfaceC1722jo;
        C2065sy c2065sy = this.f20126OooOo0O;
        synchronized (c2065sy) {
            interfaceC1722jo = c2065sy.f24187OooOO0;
        }
        return interfaceC1722jo != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final boolean zzl() {
        return this.f20126OooOo0O.OooO() != null;
    }
}

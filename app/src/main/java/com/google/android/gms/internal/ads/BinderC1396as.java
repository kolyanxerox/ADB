package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.as */
/* loaded from: classes2.dex */
public final class BinderC1396as extends AbstractBinderC2181w2 implements InterfaceC2256y3 {

    /* renamed from: OooOoOO */
    public static final /* synthetic */ int f17090OooOoOO = 0;

    /* renamed from: OooOo */
    public final ec0 f17091OooOo;

    /* renamed from: OooOo0O */
    public final C2317zr f17092OooOo0O;

    /* renamed from: OooOo0o */
    public final zzby f17093OooOo0o;

    /* renamed from: OooOoO */
    public final h20 f17094OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f17095OooOoO0;

    public BinderC1396as(C2317zr c2317zr, zzby zzbyVar, ec0 ec0Var, h20 h20Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f17095OooOoO0 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17802o0000oo)).booleanValue();
        this.f17092OooOo0O = c2317zr;
        this.f17093OooOo0o = zzbyVar;
        this.f17091OooOo = ec0Var;
        this.f17094OooOoO = h20Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final void OooOO0(boolean z) {
        this.f17095OooOoO0 = z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final void o00000OO(Oooo0o.OooO0O0 oooO0O0, InterfaceC1482d4 interfaceC1482d4) {
        try {
            this.f17091OooOo.f18565OooOoO0.set(interfaceC1482d4);
            this.f17092OooOo0O.OooO0OO((Activity) Oooo0o.OooO0OO.o000O0oO(oooO0O0), this.f17095OooOoO0);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1482d4 c1445c4;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, this.f17093OooOo0o);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c1445c4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    c1445c4 = iInterfaceQueryLocalInterface instanceof InterfaceC1482d4 ? (InterfaceC1482d4) iInterfaceQueryLocalInterface : new C1445c4(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                o00000OO(oooO0O0O000O0o0, c1445c4);
                parcel2.writeNoException();
                return true;
            case 5:
                zzdy zzdyVarZzf = zzf();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzdyVarZzf);
                return true;
            case 6:
                boolean zOooO0o = AbstractC2218x2.OooO0o(parcel);
                AbstractC2218x2.OooO0O0(parcel);
                this.f17095OooOoO0 = zOooO0o;
                parcel2.writeNoException();
                return true;
            case 7:
                zzdr zzdrVarZzb = zzdq.zzb(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o0ooOO0(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final void o0ooOO0(zzdr zzdrVar) {
        Oooo00O.o000000O.OooO0Oo("setOnPaidEventListener must be called on the main UI thread.");
        ec0 ec0Var = this.f17091OooOo;
        if (ec0Var != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.f17094OooOoO.OooO0O0();
                }
            } catch (RemoteException e) {
                zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            ec0Var.f18568OooOoo0.set(zzdrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final zzdy zzf() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO00O)).booleanValue()) {
            return this.f17092OooOo0O.f17103OooO0o;
        }
        return null;
    }
}

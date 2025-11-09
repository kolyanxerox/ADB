package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class z60 extends AbstractBinderC2181w2 implements InterfaceC2157vf {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final l60 f26097OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ a70 f26098OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(a70 a70Var, l60 l60Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f26098OooOo0o = a70Var;
        this.f26097OooOo0O = l60Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void OooOOo0(Oooo0o.OooO0O0 oooO0O0) {
        this.f26098OooOo0o.f16933OooO0Oo = (View) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        ((e70) this.f26097OooOo0O.f20810OooO0OO).zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void o000O000(InterfaceC1456cf interfaceC1456cf) {
        this.f26098OooOo0o.f16934OooO0o0 = interfaceC1456cf;
        ((e70) this.f26097OooOo0O.f20810OooO0OO).zzo();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1456cf c1420bf;
        if (i == 1) {
            Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            AbstractC2218x2.OooO0O0(parcel);
            OooOOo0(oooO0O0O000O0o0);
        } else if (i == 2) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zze(string);
        } else if (i == 3) {
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzf(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c1420bf = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c1420bf = iInterfaceQueryLocalInterface instanceof InterfaceC1456cf ? (InterfaceC1456cf) iInterfaceQueryLocalInterface : new C1420bf(strongBinder);
            }
            AbstractC2218x2.OooO0O0(parcel);
            o000O000(c1420bf);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void zze(String str) {
        ((e70) this.f26097OooOo0O.f20810OooO0OO).OooOoO(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void zzf(zze zzeVar) {
        ((e70) this.f26097OooOo0O.f20810OooO0OO).OooOoo0(zzeVar);
    }
}

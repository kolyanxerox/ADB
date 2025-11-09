package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class n70 extends AbstractBinderC2181w2 implements InterfaceC2305zf {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final l60 f21428OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ a70 f21429OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(a70 a70Var, l60 l60Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f21429OooOo0o = a70Var;
        this.f21428OooOo0O = l60Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2305zf
    public final void o000OO(InterfaceC1640hf interfaceC1640hf) {
        this.f21429OooOo0o.f16933OooO0Oo = interfaceC1640hf;
        ((e70) this.f21428OooOo0O.f20810OooO0OO).zzo();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1640hf c1566ff;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c1566ff = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                c1566ff = iInterfaceQueryLocalInterface instanceof InterfaceC1640hf ? (InterfaceC1640hf) iInterfaceQueryLocalInterface : new C1566ff(strongBinder);
            }
            AbstractC2218x2.OooO0O0(parcel);
            o000OO(c1566ff);
        } else if (i == 2) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zze(string);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2305zf
    public final void zze(String str) {
        ((e70) this.f21428OooOo0O.f20810OooO0OO).OooOoO(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2305zf
    public final void zzf(zze zzeVar) {
        ((e70) this.f21428OooOo0O.f20810OooO0OO).OooOoo0(zzeVar);
    }
}

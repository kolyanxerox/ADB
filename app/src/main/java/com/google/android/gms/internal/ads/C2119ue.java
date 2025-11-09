package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ue */
/* loaded from: classes2.dex */
public final class C2119ue extends AbstractC2144v2 implements InterfaceC2156ve {
    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final boolean OooO0o(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 4);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final InterfaceC1530eg OooO0o0(String str) {
        InterfaceC1530eg c1494dg;
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 3);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        int i = BinderC1751kg.f20585OooOoOO;
        if (strongBinder == null) {
            c1494dg = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c1494dg = iInterfaceQueryLocalInterface instanceof InterfaceC1530eg ? (InterfaceC1530eg) iInterfaceQueryLocalInterface : new C1494dg(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        }
        parcelOooOOO.recycle();
        return c1494dg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final InterfaceC2230xe zzb(String str) {
        InterfaceC2230xe c2193we;
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c2193we = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c2193we = iInterfaceQueryLocalInterface instanceof InterfaceC2230xe ? (InterfaceC2230xe) iInterfaceQueryLocalInterface : new C2193we(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
        parcelOooOOO.recycle();
        return c2193we;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2156ve
    public final boolean zze(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 2);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}

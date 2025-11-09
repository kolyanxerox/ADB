package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;

/* renamed from: com.google.android.gms.internal.ads.x3 */
/* loaded from: classes2.dex */
public final class C2219x3 extends AbstractC2144v2 implements InterfaceC2256y3 {
    public C2219x3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final void OooOO0(boolean z) {
        Parcel parcelOooO = OooO();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcelOooO.writeInt(z ? 1 : 0);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final void o00000OO(Oooo0o.OooO0O0 oooO0O0, InterfaceC1482d4 interfaceC1482d4) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1482d4);
        o000OO0O(parcelOooO, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final void o0ooOO0(zzdr zzdrVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzdrVar);
        o000OO0O(parcelOooO, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256y3
    public final zzdy zzf() {
        Parcel parcelOooOOO = OooOOO(OooO(), 5);
        zzdy zzdyVarZzb = zzdx.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return zzdyVarZzb;
    }
}

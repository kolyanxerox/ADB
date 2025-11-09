package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class v60 extends AbstractBinderC2181w2 implements InterfaceC2083tf {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final l60 f24861OooOo0O;

    public v60(l60 l60Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
        this.f24861OooOo0O = l60Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zze(string);
        } else {
            if (i != 4) {
                return false;
            }
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2083tf
    public final void zze(String str) {
        ((e70) this.f24861OooOo0O.f20810OooO0OO).OooOoO(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2083tf
    public final void zzf(zze zzeVar) {
        ((e70) this.f24861OooOo0O.f20810OooO0OO).OooOoo0(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2083tf
    public final void zzg() {
        ((e70) this.f24861OooOo0O.f20810OooO0OO).zzo();
    }
}

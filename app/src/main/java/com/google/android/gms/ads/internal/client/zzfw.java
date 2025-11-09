package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzfw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        int iOooOoO0 = 0;
        int iOooOoO02 = 0;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
            } else if (c != 2) {
                o00O0O0O.OooOoo0(parcel, i);
            } else {
                iOooOoO02 = o00O0O0O.OooOoO0(parcel, i);
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzfv(iOooOoO0, iOooOoO02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfv[i];
    }
}

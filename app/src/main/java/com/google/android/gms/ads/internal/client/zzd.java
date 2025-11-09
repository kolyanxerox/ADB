package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        String strOooO = null;
        String strOooO2 = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strOooO = o00O0O0O.OooO(parcel, i);
            } else if (c != 2) {
                o00O0O0O.OooOoo0(parcel, i);
            } else {
                strOooO2 = o00O0O0O.OooO(parcel, i);
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzc(strOooO, strOooO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzfc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        String strOooO = null;
        int iOooOoO0 = 0;
        int iOooOoO02 = 0;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
            } else if (c == 2) {
                iOooOoO02 = o00O0O0O.OooOoO0(parcel, i);
            } else if (c != 3) {
                o00O0O0O.OooOoo0(parcel, i);
            } else {
                strOooO = o00O0O0O.OooO(parcel, i);
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzfb(iOooOoO0, iOooOoO02, strOooO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfb[i];
    }
}

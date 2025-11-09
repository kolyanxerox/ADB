package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        int iOooOoO0 = 0;
        int iOooOoO02 = 0;
        boolean zOooOo0o = false;
        boolean zOooOo0o2 = false;
        String strOooO = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strOooO = o00O0O0O.OooO(parcel, i);
            } else if (c == 3) {
                iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
            } else if (c == 4) {
                iOooOoO02 = o00O0O0O.OooOoO0(parcel, i);
            } else if (c == 5) {
                zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
            } else if (c != 6) {
                o00O0O0O.OooOoo0(parcel, i);
            } else {
                zOooOo0o2 = o00O0O0O.OooOo0o(parcel, i);
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new VersionInfoParcel(strOooO, iOooOoO0, iOooOoO02, zOooOo0o, zOooOo0o2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VersionInfoParcel[i];
    }
}

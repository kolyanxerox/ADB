package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzgb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        boolean zOooOo0o = false;
        boolean zOooOo0o2 = false;
        boolean zOooOo0o3 = false;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
            } else if (c == 3) {
                zOooOo0o2 = o00O0O0O.OooOo0o(parcel, i);
            } else if (c != 4) {
                o00O0O0O.OooOoo0(parcel, i);
            } else {
                zOooOo0o3 = o00O0O0O.OooOo0o(parcel, i);
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzga(zOooOo0o, zOooOo0o2, zOooOo0o3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzga[i];
    }
}

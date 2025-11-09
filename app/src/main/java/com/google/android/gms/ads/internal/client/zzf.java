package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        String strOooO = null;
        String strOooO2 = null;
        zze zzeVar = null;
        IBinder iBinderOooOo = null;
        int iOooOoO0 = 0;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
            } else if (c == 2) {
                strOooO = o00O0O0O.OooO(parcel, i);
            } else if (c == 3) {
                strOooO2 = o00O0O0O.OooO(parcel, i);
            } else if (c == 4) {
                zzeVar = (zze) o00O0O0O.OooO0oo(parcel, i, zze.CREATOR);
            } else if (c != 5) {
                o00O0O0O.OooOoo0(parcel, i);
            } else {
                iBinderOooOo = o00O0O0O.OooOo(parcel, i);
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zze(iOooOoO0, strOooO, strOooO2, zzeVar, iBinderOooOo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}

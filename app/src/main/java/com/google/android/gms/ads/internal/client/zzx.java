package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        String strOooO = null;
        zze zzeVar = null;
        Bundle bundleOooO0Oo = null;
        String strOooO2 = null;
        String strOooO3 = null;
        String strOooO4 = null;
        String strOooO5 = null;
        long jOooOoO = 0;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strOooO = o00O0O0O.OooO(parcel, i);
                    break;
                case 2:
                    jOooOoO = o00O0O0O.OooOoO(parcel, i);
                    break;
                case 3:
                    zzeVar = (zze) o00O0O0O.OooO0oo(parcel, i, zze.CREATOR);
                    break;
                case 4:
                    bundleOooO0Oo = o00O0O0O.OooO0Oo(parcel, i);
                    break;
                case 5:
                    strOooO2 = o00O0O0O.OooO(parcel, i);
                    break;
                case 6:
                    strOooO3 = o00O0O0O.OooO(parcel, i);
                    break;
                case 7:
                    strOooO4 = o00O0O0O.OooO(parcel, i);
                    break;
                case '\b':
                    strOooO5 = o00O0O0O.OooO(parcel, i);
                    break;
                default:
                    o00O0O0O.OooOoo0(parcel, i);
                    break;
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzw(strOooO, jOooOoO, zzeVar, bundleOooO0Oo, strOooO2, strOooO3, strOooO4, strOooO5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzw[i];
    }
}

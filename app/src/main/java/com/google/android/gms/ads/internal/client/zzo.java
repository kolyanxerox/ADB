package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        long jOooOoO = 0;
        long jOooOoO2 = 0;
        int iOooOoO0 = 0;
        int iOooOoO02 = 0;
        boolean zOooOo0o = false;
        int iOooOoO03 = 0;
        boolean zOooOo0o2 = false;
        boolean zOooOo0o3 = false;
        int iOooOoO04 = 0;
        int iOooOoO05 = 0;
        int iOooOoO06 = 0;
        Bundle bundleOooO0Oo = null;
        ArrayList arrayListOooOO0O = null;
        String strOooO = null;
        zzfx zzfxVar = null;
        Location location = null;
        String strOooO2 = null;
        Bundle bundleOooO0Oo2 = null;
        Bundle bundleOooO0Oo3 = null;
        ArrayList arrayListOooOO0O2 = null;
        String strOooO3 = null;
        String strOooO4 = null;
        zzc zzcVar = null;
        String strOooO5 = null;
        ArrayList arrayListOooOO0O3 = null;
        String strOooO6 = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 2:
                    jOooOoO = o00O0O0O.OooOoO(parcel, i);
                    break;
                case 3:
                    bundleOooO0Oo = o00O0O0O.OooO0Oo(parcel, i);
                    break;
                case 4:
                    iOooOoO02 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 5:
                    arrayListOooOO0O = o00O0O0O.OooOO0O(parcel, i);
                    break;
                case 6:
                    zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 7:
                    iOooOoO03 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case '\b':
                    zOooOo0o2 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case '\t':
                    strOooO = o00O0O0O.OooO(parcel, i);
                    break;
                case '\n':
                    zzfxVar = (zzfx) o00O0O0O.OooO0oo(parcel, i, zzfx.CREATOR);
                    break;
                case 11:
                    location = (Location) o00O0O0O.OooO0oo(parcel, i, Location.CREATOR);
                    break;
                case '\f':
                    strOooO2 = o00O0O0O.OooO(parcel, i);
                    break;
                case '\r':
                    bundleOooO0Oo2 = o00O0O0O.OooO0Oo(parcel, i);
                    break;
                case 14:
                    bundleOooO0Oo3 = o00O0O0O.OooO0Oo(parcel, i);
                    break;
                case 15:
                    arrayListOooOO0O2 = o00O0O0O.OooOO0O(parcel, i);
                    break;
                case 16:
                    strOooO3 = o00O0O0O.OooO(parcel, i);
                    break;
                case 17:
                    strOooO4 = o00O0O0O.OooO(parcel, i);
                    break;
                case 18:
                    zOooOo0o3 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 19:
                    zzcVar = (zzc) o00O0O0O.OooO0oo(parcel, i, zzc.CREATOR);
                    break;
                case 20:
                    iOooOoO04 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 21:
                    strOooO5 = o00O0O0O.OooO(parcel, i);
                    break;
                case 22:
                    arrayListOooOO0O3 = o00O0O0O.OooOO0O(parcel, i);
                    break;
                case 23:
                    iOooOoO05 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 24:
                    strOooO6 = o00O0O0O.OooO(parcel, i);
                    break;
                case 25:
                    iOooOoO06 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 26:
                    jOooOoO2 = o00O0O0O.OooOoO(parcel, i);
                    break;
                default:
                    o00O0O0O.OooOoo0(parcel, i);
                    break;
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzm(iOooOoO0, jOooOoO, bundleOooO0Oo, iOooOoO02, arrayListOooOO0O, zOooOo0o, iOooOoO03, zOooOo0o2, strOooO, zzfxVar, location, strOooO2, bundleOooO0Oo2, bundleOooO0Oo3, arrayListOooOO0O2, strOooO3, strOooO4, zOooOo0o3, zzcVar, iOooOoO04, strOooO5, arrayListOooOO0O3, iOooOoO05, strOooO6, iOooOoO06, jOooOoO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}

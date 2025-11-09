package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        int iOooOoO0 = 0;
        int iOooOoO02 = 0;
        boolean zOooOo0o = false;
        int iOooOoO03 = 0;
        int iOooOoO04 = 0;
        boolean zOooOo0o2 = false;
        boolean zOooOo0o3 = false;
        boolean zOooOo0o4 = false;
        boolean zOooOo0o5 = false;
        boolean zOooOo0o6 = false;
        boolean zOooOo0o7 = false;
        boolean zOooOo0o8 = false;
        boolean zOooOo0o9 = false;
        String strOooO = null;
        zzs[] zzsVarArr = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strOooO = o00O0O0O.OooO(parcel, i);
                    break;
                case 3:
                    iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 4:
                    iOooOoO02 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 5:
                    zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 6:
                    iOooOoO03 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case 7:
                    iOooOoO04 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case '\b':
                    zzsVarArr = (zzs[]) o00O0O0O.OooOO0o(parcel, i, zzs.CREATOR);
                    break;
                case '\t':
                    zOooOo0o2 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case '\n':
                    zOooOo0o3 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 11:
                    zOooOo0o4 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case '\f':
                    zOooOo0o5 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case '\r':
                    zOooOo0o6 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 14:
                    zOooOo0o7 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 15:
                    zOooOo0o8 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 16:
                    zOooOo0o9 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                default:
                    o00O0O0O.OooOoo0(parcel, i);
                    break;
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzs(strOooO, iOooOoO0, iOooOoO02, zOooOo0o, iOooOoO03, iOooOoO04, zzsVarArr, zOooOo0o2, zOooOo0o3, zOooOo0o4, zOooOo0o5, zOooOo0o6, zOooOo0o7, zOooOo0o8, zOooOo0o9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}

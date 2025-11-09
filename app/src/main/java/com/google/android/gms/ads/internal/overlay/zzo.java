package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        long jOooOoO = 0;
        boolean zOooOo0o = false;
        int iOooOoO0 = 0;
        int iOooOoO02 = 0;
        boolean zOooOo0o2 = false;
        zzc zzcVar = null;
        IBinder iBinderOooOo = null;
        IBinder iBinderOooOo2 = null;
        IBinder iBinderOooOo3 = null;
        IBinder iBinderOooOo4 = null;
        String strOooO = null;
        String strOooO2 = null;
        IBinder iBinderOooOo5 = null;
        String strOooO3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String strOooO4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinderOooOo6 = null;
        String strOooO5 = null;
        String strOooO6 = null;
        String strOooO7 = null;
        IBinder iBinderOooOo7 = null;
        IBinder iBinderOooOo8 = null;
        IBinder iBinderOooOo9 = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    zzcVar = (zzc) o00O0O0O.OooO0oo(parcel, i, zzc.CREATOR);
                    break;
                case 3:
                    iBinderOooOo = o00O0O0O.OooOo(parcel, i);
                    break;
                case 4:
                    iBinderOooOo2 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 5:
                    iBinderOooOo3 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 6:
                    iBinderOooOo4 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 7:
                    strOooO = o00O0O0O.OooO(parcel, i);
                    break;
                case '\b':
                    zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case '\t':
                    strOooO2 = o00O0O0O.OooO(parcel, i);
                    break;
                case '\n':
                    iBinderOooOo5 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 11:
                    iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case '\f':
                    iOooOoO02 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case '\r':
                    strOooO3 = o00O0O0O.OooO(parcel, i);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) o00O0O0O.OooO0oo(parcel, i, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    o00O0O0O.OooOoo0(parcel, i);
                    break;
                case 16:
                    strOooO4 = o00O0O0O.OooO(parcel, i);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) o00O0O0O.OooO0oo(parcel, i, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinderOooOo6 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 19:
                    strOooO5 = o00O0O0O.OooO(parcel, i);
                    break;
                case 24:
                    strOooO6 = o00O0O0O.OooO(parcel, i);
                    break;
                case 25:
                    strOooO7 = o00O0O0O.OooO(parcel, i);
                    break;
                case 26:
                    iBinderOooOo7 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 27:
                    iBinderOooOo8 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 28:
                    iBinderOooOo9 = o00O0O0O.OooOo(parcel, i);
                    break;
                case 29:
                    zOooOo0o2 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 30:
                    jOooOoO = o00O0O0O.OooOoO(parcel, i);
                    break;
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new AdOverlayInfoParcel(zzcVar, iBinderOooOo, iBinderOooOo2, iBinderOooOo3, iBinderOooOo4, strOooO, zOooOo0o, strOooO2, iBinderOooOo5, iOooOoO0, iOooOoO02, strOooO3, versionInfoParcel, strOooO4, zzlVar, iBinderOooOo6, strOooO5, strOooO6, strOooO7, iBinderOooOo7, iBinderOooOo8, iBinderOooOo9, zOooOo0o2, jOooOoO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}

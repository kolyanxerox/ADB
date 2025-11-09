package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        boolean zOooOo0o = false;
        String strOooO = null;
        String strOooO2 = null;
        String strOooO3 = null;
        String strOooO4 = null;
        String strOooO5 = null;
        String strOooO6 = null;
        String strOooO7 = null;
        Intent intent = null;
        IBinder iBinderOooOo = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strOooO = o00O0O0O.OooO(parcel, i);
                    break;
                case 3:
                    strOooO2 = o00O0O0O.OooO(parcel, i);
                    break;
                case 4:
                    strOooO3 = o00O0O0O.OooO(parcel, i);
                    break;
                case 5:
                    strOooO4 = o00O0O0O.OooO(parcel, i);
                    break;
                case 6:
                    strOooO5 = o00O0O0O.OooO(parcel, i);
                    break;
                case 7:
                    strOooO6 = o00O0O0O.OooO(parcel, i);
                    break;
                case '\b':
                    strOooO7 = o00O0O0O.OooO(parcel, i);
                    break;
                case '\t':
                    intent = (Intent) o00O0O0O.OooO0oo(parcel, i, Intent.CREATOR);
                    break;
                case '\n':
                    iBinderOooOo = o00O0O0O.OooOo(parcel, i);
                    break;
                case 11:
                    zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
                    break;
                default:
                    o00O0O0O.OooOoo0(parcel, i);
                    break;
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzc(strOooO, strOooO2, strOooO3, strOooO4, strOooO5, strOooO6, strOooO7, intent, iBinderOooOo, zOooOo0o);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}

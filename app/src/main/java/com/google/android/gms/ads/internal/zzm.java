package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        boolean zOooOo0o = false;
        boolean zOooOo0o2 = false;
        boolean zOooOo0o3 = false;
        int iOooOoO0 = 0;
        boolean zOooOo0o4 = false;
        boolean zOooOo0o5 = false;
        boolean zOooOo0o6 = false;
        float f = 0.0f;
        String strOooO = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 3:
                    zOooOo0o2 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 4:
                    strOooO = o00O0O0O.OooO(parcel, i);
                    break;
                case 5:
                    zOooOo0o3 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case 6:
                    o00O0O0O.Oooo00o(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case 7:
                    iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
                    break;
                case '\b':
                    zOooOo0o4 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case '\t':
                    zOooOo0o5 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                case '\n':
                    zOooOo0o6 = o00O0O0O.OooOo0o(parcel, i);
                    break;
                default:
                    o00O0O0O.OooOoo0(parcel, i);
                    break;
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new zzl(zOooOo0o, zOooOo0o2, strOooO, zOooOo0o3, f, iOooOoO0, zOooOo0o4, zOooOo0o5, zOooOo0o6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}

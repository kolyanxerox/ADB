package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iOooOooO = o00O0O0O.OooOooO(parcel);
        IBinder iBinderOooOo = null;
        boolean zOooOo0o = false;
        IBinder iBinderOooOo2 = null;
        while (parcel.dataPosition() < iOooOooO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zOooOo0o = o00O0O0O.OooOo0o(parcel, i);
            } else if (c == 2) {
                iBinderOooOo = o00O0O0O.OooOo(parcel, i);
            } else if (c != 3) {
                o00O0O0O.OooOoo0(parcel, i);
            } else {
                iBinderOooOo2 = o00O0O0O.OooOo(parcel, i);
            }
        }
        o00O0O0O.OooOOo0(parcel, iOooOooO);
        return new PublisherAdViewOptions(zOooOo0o, iBinderOooOo, iBinderOooOo2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}

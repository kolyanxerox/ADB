package com.google.android.gms.internal.ads;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.x2 */
/* loaded from: classes2.dex */
public abstract class AbstractC2218x2 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ClassLoader f25497OooO00o = AbstractC2218x2.class.getClassLoader();

    public static Parcelable OooO00o(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void OooO0O0(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(OooO0oO.OooOo.OooO0o(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void OooO0OO(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void OooO0Oo(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static boolean OooO0o(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void OooO0o0(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}

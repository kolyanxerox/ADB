package com.google.android.material.datepicker;

import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO implements OooO0O0 {
    public static final Parcelable.Creator<OooO> CREATOR = new oOO0OoO0(3);
    private final long point;

    public OooO(long j) {
        this.point = j;
    }

    public final boolean OooO00o(long j) {
        return j >= this.point;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && this.point == ((OooO) obj).point;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }
}

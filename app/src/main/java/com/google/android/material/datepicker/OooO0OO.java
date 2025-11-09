package com.google.android.material.datepicker;

import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO0OO implements Parcelable {
    public static final Parcelable.Creator<OooO0OO> CREATOR = new oOO0OoO0(2);

    @NonNull
    private final o00Ooo end;
    private final int firstDayOfWeek;
    private final int monthSpan;

    @Nullable
    private o00Ooo openAt;

    @NonNull
    private final o00Ooo start;

    @NonNull
    private final OooO0O0 validator;
    private final int yearSpan;

    public OooO0OO(o00Ooo o00ooo2, o00Ooo o00ooo3, OooO0O0 oooO0O0, o00Ooo o00ooo4, int i) {
        this.start = o00ooo2;
        this.end = o00ooo3;
        this.openAt = o00ooo4;
        this.firstDayOfWeek = i;
        this.validator = oooO0O0;
        if (o00ooo4 != null && o00ooo2.compareTo(o00ooo4) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (o00ooo4 != null && o00ooo4.compareTo(o00ooo3) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > o000OOo.OooO0OO(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.monthSpan = o00ooo2.OooOO0O(o00ooo3) + 1;
        this.yearSpan = (o00ooo3.f27586OooOo0o - o00ooo2.f27586OooOo0o) + 1;
    }

    public final int OooO() {
        return this.firstDayOfWeek;
    }

    public final OooO0O0 OooO0oO() {
        return this.validator;
    }

    public final o00Ooo OooO0oo() {
        return this.end;
    }

    public final int OooOO0() {
        return this.monthSpan;
    }

    public final o00Ooo OooOO0O() {
        return this.openAt;
    }

    public final o00Ooo OooOO0o() {
        return this.start;
    }

    public final int OooOOO0() {
        return this.yearSpan;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return this.start.equals(oooO0OO.start) && this.end.equals(oooO0OO.end) && ObjectsCompat.equals(this.openAt, oooO0OO.openAt) && this.firstDayOfWeek == oooO0OO.firstDayOfWeek && this.validator.equals(oooO0OO.validator);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, Integer.valueOf(this.firstDayOfWeek), this.validator});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
        parcel.writeInt(this.firstDayOfWeek);
    }
}

package com.google.android.material.datepicker;

import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class o00Ooo implements Comparable, Parcelable {
    public static final Parcelable.Creator<o00Ooo> CREATOR = new oOO0OoO0(4);

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f27584OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f27585OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f27586OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final long f27587OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f27588OooOoO0;

    @NonNull
    private final Calendar firstOfMonth;

    @Nullable
    private String longName;

    public o00Ooo(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarOooO00o = o000OOo.OooO00o(calendar);
        this.firstOfMonth = calendarOooO00o;
        this.f27585OooOo0O = calendarOooO00o.get(2);
        this.f27586OooOo0o = calendarOooO00o.get(1);
        this.f27584OooOo = calendarOooO00o.getMaximum(7);
        this.f27588OooOoO0 = calendarOooO00o.getActualMaximum(5);
        this.f27587OooOoO = calendarOooO00o.getTimeInMillis();
    }

    public static o00Ooo OooO0O0(int i, int i2) {
        Calendar calendarOooO0OO = o000OOo.OooO0OO(null);
        calendarOooO0OO.set(1, i);
        calendarOooO0OO.set(2, i2);
        return new o00Ooo(calendarOooO0OO);
    }

    public static o00Ooo OooO0OO(long j) {
        Calendar calendarOooO0OO = o000OOo.OooO0OO(null);
        calendarOooO0OO.setTimeInMillis(j);
        return new o00Ooo(calendarOooO0OO);
    }

    public final long OooO() {
        return this.firstOfMonth.getTimeInMillis();
    }

    @Override // java.lang.Comparable
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o00Ooo o00ooo2) {
        return this.firstOfMonth.compareTo(o00ooo2.firstOfMonth);
    }

    public final long OooO0o(int i) {
        Calendar calendarOooO00o = o000OOo.OooO00o(this.firstOfMonth);
        calendarOooO00o.set(5, i);
        return calendarOooO00o.getTimeInMillis();
    }

    public final int OooO0o0(int i) {
        int i2 = this.firstOfMonth.get(7);
        if (i <= 0) {
            i = this.firstOfMonth.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.f27584OooOo : i3;
    }

    public final int OooO0oO(long j) {
        Calendar calendarOooO00o = o000OOo.OooO00o(this.firstOfMonth);
        calendarOooO00o.setTimeInMillis(j);
        return calendarOooO00o.get(5);
    }

    public final String OooO0oo() {
        if (this.longName == null) {
            this.longName = DateUtils.formatDateTime(null, this.firstOfMonth.getTimeInMillis(), 8228);
        }
        return this.longName;
    }

    public final o00Ooo OooOO0(int i) {
        Calendar calendarOooO00o = o000OOo.OooO00o(this.firstOfMonth);
        calendarOooO00o.add(2, i);
        return new o00Ooo(calendarOooO00o);
    }

    public final int OooOO0O(o00Ooo o00ooo2) {
        if (!(this.firstOfMonth instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (o00ooo2.f27585OooOo0O - this.f27585OooOo0O) + ((o00ooo2.f27586OooOo0o - this.f27586OooOo0o) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return this.f27585OooOo0O == o00ooo2.f27585OooOo0O && this.f27586OooOo0o == o00ooo2.f27586OooOo0o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27585OooOo0O), Integer.valueOf(this.f27586OooOo0o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27586OooOo0o);
        parcel.writeInt(this.f27585OooOo0O);
    }
}

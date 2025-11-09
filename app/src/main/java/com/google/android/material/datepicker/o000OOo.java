package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class o000OOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicReference f27555OooO00o = new AtomicReference();

    public static Calendar OooO00o(Calendar calendar) {
        Calendar calendarOooO0OO = OooO0OO(calendar);
        Calendar calendarOooO0OO2 = OooO0OO(null);
        calendarOooO0OO2.set(calendarOooO0OO.get(1), calendarOooO0OO.get(2), calendarOooO0OO.get(5));
        return calendarOooO0OO2;
    }

    public static Calendar OooO0O0() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar OooO0OO(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}

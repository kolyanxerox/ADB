package com.applovin.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.applovin.impl.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC1042h1 {

    /* renamed from: a */
    private static final SimpleDateFormat f817a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f817a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* renamed from: a */
    public static synchronized String m848a(long j) {
        return f817a.format(new Date(j));
    }
}

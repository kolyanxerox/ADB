package com.ironsource;

import java.util.Date;

/* renamed from: com.ironsource.ib */
/* loaded from: classes2.dex */
public class C3216ib {

    /* renamed from: a */
    private long f9006a = new Date().getTime();

    /* renamed from: a */
    public static long m9304a(C3216ib c3216ib) {
        if (c3216ib == null) {
            return 0L;
        }
        return new Date().getTime() - c3216ib.f9006a;
    }
}

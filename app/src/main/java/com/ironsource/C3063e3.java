package com.ironsource;

import java.util.Calendar;
import java.util.Map;

/* renamed from: com.ironsource.e3 */
/* loaded from: classes2.dex */
public final class C3063e3 {

    /* renamed from: a */
    private final EnumC3200hu f8359a;

    /* renamed from: b */
    private final EnumC3558qg f8360b;

    /* renamed from: c */
    private final String f8361c;

    /* renamed from: d */
    private final long f8362d;

    public C3063e3(EnumC3200hu recordType, EnumC3558qg adProvider, String adInstanceId) {
        kotlin.jvm.internal.OooOo.OooO0o0(recordType, "recordType");
        kotlin.jvm.internal.OooOo.OooO0o0(adProvider, "adProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceId, "adInstanceId");
        this.f8359a = recordType;
        this.f8360b = adProvider;
        this.f8361c = adInstanceId;
        this.f8362d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    /* renamed from: a */
    public final String m8442a() {
        return this.f8361c;
    }

    /* renamed from: b */
    public final EnumC3558qg m8443b() {
        return this.f8360b;
    }

    /* renamed from: c */
    public final Map<String, Object> m8444c() {
        return o00O0.o0O0O00.OooOOo0(new oo00o.OooOO0(C3121fl.f8586c, Integer.valueOf(this.f8360b.m11558b())), new oo00o.OooOO0("ts", String.valueOf(this.f8362d)));
    }

    /* renamed from: d */
    public final Map<String, Object> m8445d() {
        return o00O0.o0O0O00.OooOOo0(new oo00o.OooOO0(C3121fl.f8585b, this.f8361c), new oo00o.OooOO0(C3121fl.f8586c, Integer.valueOf(this.f8360b.m11558b())), new oo00o.OooOO0("ts", String.valueOf(this.f8362d)), new oo00o.OooOO0("rt", Integer.valueOf(this.f8359a.ordinal())));
    }

    /* renamed from: e */
    public final EnumC3200hu m8446e() {
        return this.f8359a;
    }

    /* renamed from: f */
    public final long m8447f() {
        return this.f8362d;
    }
}

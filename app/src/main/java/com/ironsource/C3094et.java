package com.ironsource;

/* renamed from: com.ironsource.et */
/* loaded from: classes2.dex */
public final class C3094et {

    /* renamed from: b */
    private static Boolean f8461b;

    /* renamed from: a */
    public static final C3094et f8460a = new C3094et();

    /* renamed from: c */
    private static EnumC3054dt f8462c = EnumC3054dt.NOT_INIT;

    private C3094et() {
    }

    /* renamed from: a */
    public final synchronized EnumC3054dt m8556a() {
        return f8462c;
    }

    /* renamed from: b */
    public final EnumC3054dt m8559b() {
        Boolean bool = f8461b;
        if (bool == null ? true : bool.equals(Boolean.FALSE)) {
            return EnumC3054dt.NOT_INIT;
        }
        if (kotlin.jvm.internal.OooOo.OooO00o(bool, Boolean.TRUE)) {
            return f8462c;
        }
        throw new OooOOO0.OooO00o();
    }

    /* renamed from: a */
    public final synchronized void m8557a(EnumC3054dt enumC3054dt) {
        kotlin.jvm.internal.OooOo.OooO0o0(enumC3054dt, "<set-?>");
        f8462c = enumC3054dt;
    }

    /* renamed from: a */
    public final void m8558a(boolean z) {
        f8461b = Boolean.valueOf(z);
    }
}

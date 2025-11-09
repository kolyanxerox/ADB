package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.mk */
/* loaded from: classes2.dex */
public final class C3422mk {

    /* renamed from: a */
    public static final C3422mk f10291a = new C3422mk();

    private C3422mk() {
    }

    /* renamed from: a */
    public static final <T> T m10819a(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: a */
    public static final boolean m10820a(Object obj) {
        return m10823a(obj, null, false, 6, null);
    }

    /* renamed from: a */
    public static final boolean m10821a(Object obj, String errorMessage) {
        kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
        return m10823a(obj, errorMessage, false, 4, null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m10823a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m10822a(obj, str, z);
    }

    /* renamed from: a */
    public static final boolean m10822a(Object obj, String errorMessage, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z) {
            throw new NullPointerException(errorMessage);
        }
        if (z) {
            throw new OooOOO0.OooO00o();
        }
        IronLog.API.error(errorMessage);
        return false;
    }
}

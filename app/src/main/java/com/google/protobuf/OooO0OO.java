package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Class f28159OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f28160OooO0O0;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f28159OooO00o = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f28160OooO0O0 = cls2 != null;
    }

    public static boolean OooO00o() {
        return (f28159OooO00o == null || f28160OooO0O0) ? false : true;
    }
}

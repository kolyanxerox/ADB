package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public abstract class OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Class f28012OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f28013OooO0O0;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f28012OooO00o = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f28013OooO0O0 = cls2 != null;
    }

    public static boolean OooO00o() {
        return (f28012OooO00o == null || f28013OooO0O0) ? false : true;
    }
}

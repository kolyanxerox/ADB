package Oooo00O;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class o000000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Object f13784OooO00o = new Object();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f13785OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static int f13786OooO0OO;

    public static void OooO(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void OooO00o(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void OooO0O0(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void OooO0OO(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            throw new IllegalStateException(OooO0oO.OooOo.OooOO0o("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void OooO0Oo(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void OooO0o(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void OooO0o0(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void OooO0oO(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void OooO0oo(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void OooOO0(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void OooOO0O(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static boolean OooOO0o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

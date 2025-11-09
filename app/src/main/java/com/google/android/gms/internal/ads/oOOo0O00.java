package com.google.android.gms.internal.ads;

import android.util.Log;
import com.ironsource.C3034d9;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class oOOo0O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f22855OooO00o = Log.isLoggable("Volley", 2);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final String f22856OooO0O0 = oOOo0O00.class.getName();

    public static void OooO00o(String str, Object... objArr) {
        Log.d("Volley", OooO0Oo(str, objArr));
    }

    public static void OooO0O0(String str, Object... objArr) {
        Log.e("Volley", OooO0Oo(str, objArr));
    }

    public static void OooO0OO(String str, Object... objArr) {
        if (f22855OooO00o) {
            Log.v("Volley", OooO0Oo(str, objArr));
        }
    }

    public static String OooO0Oo(String str, Object... objArr) {
        String strOooOoo;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                strOooOoo = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(f22856OooO0O0)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                strOooOoo = OooO0oO.OooOo.OooOoo(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".", stackTrace[i].getMethodName());
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(C3034d9.i.f8177d);
        sb.append(id);
        sb.append("] ");
        sb.append(strOooOoo);
        return OooO0oO.OooOo.OooOOOo(sb, ": ", str2);
    }
}

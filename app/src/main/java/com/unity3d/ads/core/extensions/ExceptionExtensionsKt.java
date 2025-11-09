package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.OooOo;
import o00O0.o00Oo0;
import o00O0o.OooOOO;
import o00O0o.OooOOO0;
import o00O0o.OooOOOO;
import o00O0o.Oooo000;
import o00O0o.o0OoOo0;
import o00O0oO.o000000;

/* loaded from: classes3.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th, int i) {
        OooOo.OooO0o0(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    OooOo.OooO0Oo(string, "stringWriter.toString()");
                    String string2 = o000000.OoooooO(string).toString();
                    OooOo.OooO0o0(string2, "<this>");
                    Oooo000 o00oo0 = new o00Oo0(string2, 4);
                    if (i < 0) {
                        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Requested element count ", " is less than zero.").toString());
                    }
                    String strOooo0o = o0OoOo0.Oooo0o(i == 0 ? OooOOOO.f31411OooO00o : o00oo0 instanceof OooOOO ? ((OooOOO) o00oo0).OooO0O0(i) : new OooOOO0(o00oo0, i, 1), "\n");
                    printWriter.close();
                    stringWriter.close();
                    return strOooo0o;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    public static final String retrieveUnityCrashValue(Throwable th) {
        StackTraceElement stackTraceElement;
        String className;
        OooOo.OooO0o0(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        OooOo.OooO0Oo(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? false : o000000.Oooo0o(SDKErrorHandler.UNITY_PACKAGE, className)) {
                break;
            }
            i++;
        }
        if (stackTraceElement != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "unknown";
            }
            String str = fileName + '_' + stackTraceElement.getLineNumber();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }
}

package io.flutter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class Log {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    private static int logLevel = 3;

    /* renamed from: d */
    public static void m13457d(@NonNull String str, @NonNull String str2) {
    }

    /* renamed from: e */
    public static void m13459e(@NonNull String str, @NonNull String str2) {
        android.util.Log.e(str, str2);
    }

    @NonNull
    public static String getStackTraceString(@Nullable Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    /* renamed from: i */
    public static void m13461i(@NonNull String str, @NonNull String str2) {
    }

    public static void println(@NonNull int i, @NonNull String str, @NonNull String str2) {
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    /* renamed from: v */
    public static void m13463v(@NonNull String str, @NonNull String str2) {
    }

    /* renamed from: w */
    public static void m13465w(@NonNull String str, @NonNull String str2) {
        android.util.Log.w(str, str2);
    }

    public static void wtf(@NonNull String str, @NonNull String str2) {
        android.util.Log.wtf(str, str2);
    }

    /* renamed from: d */
    public static void m13458d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
    }

    /* renamed from: e */
    public static void m13460e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        android.util.Log.e(str, str2, th);
    }

    /* renamed from: i */
    public static void m13462i(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
    }

    /* renamed from: v */
    public static void m13464v(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
    }

    /* renamed from: w */
    public static void m13466w(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        android.util.Log.w(str, str2, th);
    }

    public static void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        android.util.Log.wtf(str, str2, th);
    }
}

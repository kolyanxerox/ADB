package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class o0OO0o {

    /* renamed from: OooO */
    public static final ConcurrentHashMap f26546OooO = new ConcurrentHashMap();

    /* renamed from: OooOO0 */
    public static final String[] f26547OooOO0 = {"key", "value"};

    /* renamed from: OooO00o */
    public final ContentResolver f26548OooO00o;

    /* renamed from: OooO0O0 */
    public final Uri f26549OooO0O0;

    /* renamed from: OooO0OO */
    public final Runnable f26550OooO0OO;

    /* renamed from: OooO0oO */
    public volatile Map f26554OooO0oO;

    /* renamed from: OooO0Oo */
    public o0OO00o0 f26551OooO0Oo = null;

    /* renamed from: OooO0o0 */
    public volatile boolean f26553OooO0o0 = true;

    /* renamed from: OooO0o */
    public final Object f26552OooO0o = new Object();

    /* renamed from: OooO0oo */
    public final ArrayList f26555OooO0oo = new ArrayList();

    public o0OO0o(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f26548OooO00o = contentResolver;
        this.f26549OooO0O0 = uri;
        this.f26550OooO0OO = runnable;
    }

    public static o0OO0o OooO00o(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        o0OO0o o0oo0o = (o0OO0o) f26546OooO.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.o0OO0o00
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new o0OO0o(contentResolver, uri, runnable);
            }
        });
        try {
            if (!o0oo0o.f26553OooO0o0) {
                return o0oo0o;
            }
            synchronized (o0oo0o) {
                try {
                    if (o0oo0o.f26553OooO0o0) {
                        o0OO00o0 o0oo00o0 = new o0OO00o0(o0oo0o);
                        o0oo0o.f26548OooO00o.registerContentObserver(o0oo0o.f26549OooO0O0, false, o0oo00o0);
                        o0oo0o.f26551OooO0Oo = o0oo00o0;
                        o0oo0o.f26553OooO0o0 = false;
                    }
                } finally {
                }
            }
            return o0oo0o;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void OooO0OO() {
        Iterator it = f26546OooO.values().iterator();
        while (it.hasNext()) {
            o0OO0o o0oo0o = (o0OO0o) it.next();
            synchronized (o0oo0o) {
                try {
                    if (o0oo0o.f26553OooO0o0) {
                        o0oo0o.f26553OooO0o0 = false;
                    } else {
                        o0OO00o0 o0oo00o0 = o0oo0o.f26551OooO0Oo;
                        if (o0oo00o0 != null) {
                            o0oo0o.f26548OooO00o.unregisterContentObserver(o0oo00o0);
                            o0oo0o.f26551OooO0Oo = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0052  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map OooO0O0() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f26554OooO0oO
            if (r0 != 0) goto L4f
            java.lang.Object r1 = r5.f26552OooO0o
            monitor-enter(r1)
            java.util.Map r0 = r5.f26554OooO0oO     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L4b
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.measurement.oO00Oo0 r2 = new com.google.android.gms.internal.measurement.oO00Oo0     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.OooO0OO()     // Catch: java.lang.SecurityException -> L19 java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30
            goto L24
        L19:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.OooO0OO()     // Catch: java.lang.Throwable -> L34
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L24:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L26:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            goto L43
        L2a:
            r0 = move-exception
            goto L4d
        L2c:
            r2 = move-exception
            goto L47
        L2e:
            r2 = move-exception
            goto L39
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L39:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L2c
            goto L26
        L43:
            r5.f26554OooO0oO = r2     // Catch: java.lang.Throwable -> L2a
            r0 = r2
            goto L4b
        L47:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L4f:
            if (r0 == 0) goto L52
            return r0
        L52:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o0OO0o.OooO0O0():java.util.Map");
    }
}

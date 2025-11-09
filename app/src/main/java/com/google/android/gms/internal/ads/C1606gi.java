package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.gi */
/* loaded from: classes2.dex */
public final class C1606gi implements Thread.UncaughtExceptionHandler {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f19352OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f19353OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C1643hi f19354OooO0OO;

    public /* synthetic */ C1606gi(C1643hi c1643hi, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f19352OooO00o = i;
        this.f19353OooO0O0 = uncaughtExceptionHandler;
        this.f19354OooO0OO = c1643hi;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f19352OooO00o) {
            case 0:
                uncaughtExceptionHandler = this.f19353OooO0O0;
                try {
                    try {
                        this.f19354OooO0OO.OooO0oo(th);
                    } catch (Throwable unused) {
                        zzo.zzg("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                uncaughtExceptionHandler = this.f19353OooO0O0;
                try {
                    try {
                        this.f19354OooO0OO.OooO0oo(th);
                    } catch (Throwable unused2) {
                        zzo.zzg("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
        }
    }
}

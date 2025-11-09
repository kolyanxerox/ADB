package o000Ooo;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import o000O000.OooO00o;
import o000O000.OooO0OO;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o00000 implements Thread.UncaughtExceptionHandler {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f30427OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOo.o0ooOOo f30428OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f30429OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f30430OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f30431OooO0o0 = new AtomicBoolean(false);

    public o00000(OooOO0 oooOO0, OooOOOo.o0ooOOo o0ooooo, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, OooO00o oooO00o) {
        this.f30427OooO00o = oooOO0;
        this.f30428OooO0O0 = o0ooooo;
        this.f30429OooO0OO = uncaughtExceptionHandler;
        this.f30430OooO0Oo = oooO00o;
    }

    public final boolean OooO00o(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f30430OooO0Oo.OooO0O0()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f30429OooO0OO;
        AtomicBoolean atomicBoolean = this.f30431OooO0o0;
        atomicBoolean.set(true);
        try {
            try {
                if (OooO00o(thread, th)) {
                    OooOO0 oooOO0 = this.f30427OooO00o;
                    ((o0OOO0o) oooOO0.f30538OooOo0o).OooO0oO(this.f30428OooO0O0, thread, th, false);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                OooO0OO oooO0OO = OooO0OO.f30095OooO00o;
                if (oooO0OO.OooO0O0(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                }
                if (uncaughtExceptionHandler != null) {
                    oooO0OO.OooO0OO("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    oooO0OO.OooO0OO("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}

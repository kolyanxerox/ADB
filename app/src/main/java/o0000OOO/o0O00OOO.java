package o0000ooO;

import android.os.StrictMode;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class o0O00OOO implements ThreadFactory {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final ThreadFactory f29696OooO0o0 = Executors.defaultThreadFactory();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicLong f29697OooO00o = new AtomicLong();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29698OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29699OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f29700OooO0Oo;

    public o0O00OOO(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f29698OooO0O0 = str;
        this.f29699OooO0OO = i;
        this.f29700OooO0Oo = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f29696OooO0o0.newThread(new OooOOOO(4, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f29698OooO0O0 + " Thread #" + this.f29697OooO00o.getAndIncrement());
        return threadNewThread;
    }
}

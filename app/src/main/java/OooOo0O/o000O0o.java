package OoooO0O;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class o000O0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Handler f13967OooO00o = new Handler(Looper.getMainLooper());

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000O000 f13968OooO0O0 = new o000O000();

    public static void OooO00o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}

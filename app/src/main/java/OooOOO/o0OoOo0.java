package OooOoo;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class o0OoOo0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final ReentrantLock f13652OooO0OO = new ReentrantLock();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static o0OoOo0 f13653OooO0Oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ReentrantLock f13654OooO00o = new ReentrantLock();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final SharedPreferences f13655OooO0O0;

    public o0OoOo0(Context context) {
        this.f13655OooO0O0 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String OooO00o(String str) {
        ReentrantLock reentrantLock = this.f13654OooO00o;
        reentrantLock.lock();
        try {
            return this.f13655OooO0O0.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}

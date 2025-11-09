package Oooo00O;

import OooOooo.o000Oo0;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class o000OO {

    /* renamed from: OooO */
    public static HandlerThread f13811OooO;

    /* renamed from: OooO0oO */
    public static final Object f13812OooO0oO = new Object();

    /* renamed from: OooO0oo */
    public static o000OO f13813OooO0oo;

    /* renamed from: OooO00o */
    public final HashMap f13814OooO00o = new HashMap();

    /* renamed from: OooO0O0 */
    public final Context f13815OooO0O0;

    /* renamed from: OooO0OO */
    public volatile OoooO0.OooOO0O f13816OooO0OO;

    /* renamed from: OooO0Oo */
    public final Oooo0O0.OooO0OO f13817OooO0Oo;

    /* renamed from: OooO0o */
    public final long f13818OooO0o;

    /* renamed from: OooO0o0 */
    public final long f13819OooO0o0;

    public o000OO(Context context, Looper looper) {
        o0000O0O o0000o0o2 = new o0000O0O(this);
        this.f13815OooO0O0 = context.getApplicationContext();
        OoooO0.OooOO0O oooOO0O = new OoooO0.OooOO0O(looper, o0000o0o2);
        Looper.getMainLooper();
        this.f13816OooO0OO = oooOO0O;
        this.f13817OooO0Oo = Oooo0O0.OooO0OO.OooO00o();
        this.f13819OooO0o0 = 5000L;
        this.f13818OooO0o = 300000L;
    }

    public static o000OO OooO00o(Context context) {
        synchronized (f13812OooO0oO) {
            try {
                if (f13813OooO0oo == null) {
                    f13813OooO0oo = new o000OO(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13813OooO0oo;
    }

    public final o000Oo0 OooO0O0(o0000oo o0000ooVar, o00000OO o00000oo2, String str, Executor executor) {
        synchronized (this.f13814OooO00o) {
            try {
                o0000O0 o0000o02 = (o0000O0) this.f13814OooO00o.get(o0000ooVar);
                o000Oo0 o000oo0OooO00o = null;
                if (executor == null) {
                    executor = null;
                }
                if (o0000o02 == null) {
                    o0000o02 = new o0000O0(this, o0000ooVar);
                    o0000o02.f13794OooOo0O.put(o00000oo2, o00000oo2);
                    o000oo0OooO00o = o0000O0.OooO00o(o0000o02, str, executor);
                    this.f13814OooO00o.put(o0000ooVar, o0000o02);
                } else {
                    this.f13816OooO0OO.removeMessages(0, o0000ooVar);
                    if (o0000o02.f13794OooOo0O.containsKey(o00000oo2)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(o0000ooVar.toString()));
                    }
                    o0000o02.f13794OooOo0O.put(o00000oo2, o00000oo2);
                    int i = o0000o02.f13795OooOo0o;
                    if (i == 1) {
                        o00000oo2.onServiceConnected(o0000o02.f13798OooOoOO, o0000o02.f13797OooOoO0);
                    } else if (i == 2) {
                        o000oo0OooO00o = o0000O0.OooO00o(o0000o02, str, executor);
                    }
                }
                if (o0000o02.f13793OooOo) {
                    return o000Oo0.RESULT_SUCCESS;
                }
                if (o000oo0OooO00o == null) {
                    o000oo0OooO00o = new o000Oo0(-1);
                }
                return o000oo0OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(String str, ServiceConnection serviceConnection, boolean z) {
        o0000oo o0000ooVar = new o0000oo(str, z);
        o000000O.OooO(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f13814OooO00o) {
            try {
                o0000O0 o0000o02 = (o0000O0) this.f13814OooO00o.get(o0000ooVar);
                if (o0000o02 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(o0000ooVar.toString()));
                }
                if (!o0000o02.f13794OooOo0O.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(o0000ooVar.toString()));
                }
                o0000o02.f13794OooOo0O.remove(serviceConnection);
                if (o0000o02.f13794OooOo0O.isEmpty()) {
                    this.f13816OooO0OO.sendMessageDelayed(this.f13816OooO0OO.obtainMessage(0, o0000ooVar), this.f13819OooO0o0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

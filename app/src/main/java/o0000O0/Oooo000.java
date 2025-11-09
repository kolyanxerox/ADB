package o0000o0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Oooo000 extends BroadcastReceiver {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final AtomicReference f29597OooO0O0 = new AtomicReference();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f29598OooO00o;

    public Oooo000(Context context) {
        this.f29598OooO00o = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (Oooo0.f29586OooOO0O) {
            try {
                Iterator it = Oooo0.OooOO0o.values().iterator();
                while (it.hasNext()) {
                    ((Oooo0) it.next()).OooO0oO();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f29598OooO00o.unregisterReceiver(this);
    }
}

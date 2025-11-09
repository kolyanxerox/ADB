package Oooo0O0;

import Oooo00O.o000000O;
import Oooo00O.o0000O0;
import Oooo0o0.OooOO0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO0O0 */
    public static final Object f13840OooO0O0 = new Object();

    /* renamed from: OooO0OO */
    public static volatile OooO0OO f13841OooO0OO;

    /* renamed from: OooO00o */
    public final ConcurrentHashMap f13842OooO00o = new ConcurrentHashMap();

    public static OooO0OO OooO00o() {
        if (f13841OooO0OO == null) {
            synchronized (f13840OooO0O0) {
                try {
                    if (f13841OooO0OO == null) {
                        f13841OooO0OO = new OooO0OO();
                    }
                } finally {
                }
            }
        }
        OooO0OO oooO0OO = f13841OooO0OO;
        o000000O.OooO0oo(oooO0OO);
        return oooO0OO;
    }

    public static final boolean OooO0Oo(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    public final void OooO0O0(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof o0000O0)) {
            ConcurrentHashMap concurrentHashMap = this.f13842OooO00o;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean OooO0OO(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((OooOO0.OooO00o(context).OooO0O0(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof o0000O0) {
            return OooO0Oo(context, intent, serviceConnection, i, executor);
        }
        ConcurrentHashMap concurrentHashMap = this.f13842OooO00o;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zOooO0Oo = OooO0Oo(context, intent, serviceConnection, i, executor);
            if (zOooO0Oo) {
                return zOooO0Oo;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}

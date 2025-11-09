package Oooo00O;

import OooOooo.o000Oo0;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class o0000O0 implements ServiceConnection {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f13793OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final HashMap f13794OooOo0O = new HashMap();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f13795OooOo0o = 2;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o0000oo f13796OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public IBinder f13797OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public ComponentName f13798OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o000OO f13799OooOoo0;

    public o0000O0(o000OO o000oo2, o0000oo o0000ooVar) {
        this.f13799OooOoo0 = o000oo2;
        this.f13796OooOoO = o0000ooVar;
    }

    public static o000Oo0 OooO00o(o0000O0 o0000o02, String str, Executor executor) throws RemoteException {
        try {
            Intent intentOooO00o = o0000o02.f13796OooOoO.OooO00o(o0000o02.f13799OooOoo0.f13815OooO0O0);
            o0000o02.f13795OooOo0o = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(Oooo0OO.o0OOO0o.OooO00o(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                o000OO o000oo2 = o0000o02.f13799OooOoo0;
                boolean zOooO0OO = o000oo2.f13817OooO0Oo.OooO0OO(o000oo2.f13815OooO0O0, str, intentOooO00o, o0000o02, 4225, executor);
                o0000o02.f13793OooOo = zOooO0OO;
                if (zOooO0OO) {
                    o0000o02.f13799OooOoo0.f13816OooO0OO.sendMessageDelayed(o0000o02.f13799OooOoo0.f13816OooO0OO.obtainMessage(1, o0000o02.f13796OooOoO), o0000o02.f13799OooOoo0.f13818OooO0o);
                    o000Oo0 o000oo02 = o000Oo0.RESULT_SUCCESS;
                    StrictMode.setVmPolicy(vmPolicy);
                    return o000oo02;
                }
                o0000o02.f13795OooOo0o = 2;
                try {
                    o000OO o000oo3 = o0000o02.f13799OooOoo0;
                    o000oo3.f13817OooO0Oo.OooO0O0(o000oo3.f13815OooO0O0, o0000o02);
                } catch (IllegalArgumentException unused) {
                }
                o000Oo0 o000oo03 = new o000Oo0(16);
                StrictMode.setVmPolicy(vmPolicy);
                return o000oo03;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (o00000 e) {
            return e.f13783OooOo0O;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f13799OooOoo0.f13814OooO00o) {
            try {
                this.f13799OooOoo0.f13816OooO0OO.removeMessages(1, this.f13796OooOoO);
                this.f13797OooOoO0 = iBinder;
                this.f13798OooOoOO = componentName;
                Iterator it = this.f13794OooOo0O.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f13795OooOo0o = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f13799OooOoo0.f13814OooO00o) {
            try {
                this.f13799OooOoo0.f13816OooO0OO.removeMessages(1, this.f13796OooOoO);
                this.f13797OooOoO0 = null;
                this.f13798OooOoOO = componentName;
                Iterator it = this.f13794OooOo0O.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f13795OooOo0o = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

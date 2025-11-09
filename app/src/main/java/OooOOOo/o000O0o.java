package OooOooo;

import Oooo00O.o000000O;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.WorkRequest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class o000O0o implements ServiceConnection {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f13672OooOo0O = false;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedBlockingQueue f13673OooOo0o = new LinkedBlockingQueue();

    public final IBinder OooO00o() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o000000O.OooO0oO("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f13672OooOo0O) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f13672OooOo0O = true;
        IBinder iBinder = (IBinder) this.f13673OooOo0o.poll(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13673OooOo0o.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

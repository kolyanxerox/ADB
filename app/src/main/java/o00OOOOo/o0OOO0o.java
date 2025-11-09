package o00OOOOo;

import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;
import o00OOOoO.o00000O;

/* loaded from: classes3.dex */
public final class o0OOO0o extends o00000O {

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f32500OooOOO0;

    public o0OOO0o(o0Oo0oo o0oo0oo) {
        this.f32500OooOOO0 = o0oo0oo;
    }

    @Override // o00OOOoO.o00000O
    public final void OooOO0() {
        o0Oo0oo o0oo0oo = this.f32500OooOOO0;
        if (o0oo0oo.OooO0Oo(6)) {
            o0oo0oo.f32505OooO0Oo.OooOOO0(o0oo0oo.f32504OooO0OO, 6);
        }
        o00Oo0 o00oo0 = this.f32500OooOOO0.f32505OooO0Oo;
        synchronized (o00oo0) {
            try {
                long j = o00oo0.f32471Oooo00o;
                long j2 = o00oo0.f32470Oooo00O;
                if (j < j2) {
                    return;
                }
                o00oo0.f32470Oooo00O = j2 + 1;
                o00oo0.f32468Oooo0 = System.nanoTime() + 1000000000;
                try {
                    o00oo0.f32463OooOoo.execute(new OooOo00(o00oo0, new Object[]{o00oo0.f32461OooOoO0}));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0O() throws SocketTimeoutException {
        if (OooO()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}

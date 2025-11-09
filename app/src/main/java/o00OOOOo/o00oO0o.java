package o00OOOOo;

import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import java.net.SocketTimeoutException;
import o00OOOoO.o00;
import o00OOOoO.o0000;
import o00OOOoO.o00O000;

/* loaded from: classes3.dex */
public final class o00oO0o implements o00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f32485OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0000 f32486OooOo0O = new o0000();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f32487OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f32488OooOoO0;

    public o00oO0o(o0Oo0oo o0oo0oo) {
        this.f32488OooOoO0 = o0oo0oo;
    }

    public final void OooO00o(boolean z) throws SocketTimeoutException {
        o0Oo0oo o0oo0oo;
        long jMin;
        o0Oo0oo o0oo0oo2;
        synchronized (this.f32488OooOoO0) {
            this.f32488OooOoO0.f32510OooOO0.OooO0oo();
            while (true) {
                try {
                    o0oo0oo = this.f32488OooOoO0;
                    if (o0oo0oo.f32503OooO0O0 > 0 || this.f32485OooOo || this.f32487OooOo0o || o0oo0oo.f32511OooOO0O != 0) {
                        break;
                    } else {
                        o0oo0oo.OooO();
                    }
                } finally {
                    this.f32488OooOoO0.f32510OooOO0.OooOO0O();
                }
            }
            o0oo0oo.f32510OooOO0.OooOO0O();
            this.f32488OooOoO0.OooO0O0();
            jMin = Math.min(this.f32488OooOoO0.f32503OooO0O0, this.f32486OooOo0O.f32535OooOo0o);
            o0oo0oo2 = this.f32488OooOoO0;
            o0oo0oo2.f32503OooO0O0 -= jMin;
        }
        o0oo0oo2.f32510OooOO0.OooO0oo();
        try {
            o0Oo0oo o0oo0oo3 = this.f32488OooOoO0;
            o0oo0oo3.f32505OooO0Oo.OooOO0O(o0oo0oo3.f32504OooO0OO, z && jMin == this.f32486OooOo0O.f32535OooOo0o, this.f32486OooOo0O, jMin);
            this.f32488OooOoO0.f32510OooOO0.OooOO0O();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o00OOOoO.o00
    public final void OooOO0(long j, o0000 o0000Var) throws SocketTimeoutException {
        o0000 o0000Var2 = this.f32486OooOo0O;
        o0000Var2.OooOO0(j, o0000Var);
        while (o0000Var2.f32535OooOo0o >= Http2Stream.EMIT_BUFFER_SIZE) {
            OooO00o(false);
        }
    }

    @Override // o00OOOoO.o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        synchronized (this.f32488OooOoO0) {
            try {
                if (this.f32487OooOo0o) {
                    return;
                }
                o0Oo0oo o0oo0oo = this.f32488OooOoO0;
                if (!o0oo0oo.f32509OooO0oo.f32485OooOo) {
                    if (this.f32486OooOo0O.f32535OooOo0o > 0) {
                        while (this.f32486OooOo0O.f32535OooOo0o > 0) {
                            OooO00o(true);
                        }
                    } else {
                        o0oo0oo.f32505OooO0Oo.OooOO0O(o0oo0oo.f32504OooO0OO, true, null, 0L);
                    }
                }
                synchronized (this.f32488OooOoO0) {
                    this.f32487OooOo0o = true;
                }
                this.f32488OooOoO0.f32505OooO0Oo.flush();
                this.f32488OooOoO0.OooO00o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00OOOoO.o00, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        synchronized (this.f32488OooOoO0) {
            this.f32488OooOoO0.OooO0O0();
        }
        while (this.f32486OooOo0O.f32535OooOo0o > 0) {
            OooO00o(false);
            this.f32488OooOoO0.f32505OooO0Oo.flush();
        }
    }

    @Override // o00OOOoO.o00
    public final o00O000 timeout() {
        return this.f32488OooOoO0.f32510OooOO0;
    }
}

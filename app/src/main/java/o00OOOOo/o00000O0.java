package o00OOOoO;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes3.dex */
public final class o00000O0 implements o0O0ooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f32547OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f32548OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f32549OooOo0o;

    public /* synthetic */ o00000O0(int i, Object obj, Object obj2) {
        this.f32548OooOo0O = i;
        this.f32549OooOo0o = obj;
        this.f32547OooOo = obj2;
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 sink) throws IOException {
        switch (this.f32548OooOo0O) {
            case 0:
                OooOo.OooO0o0(sink, "sink");
                o00000O0 o00000o02 = (o00000O0) this.f32547OooOo;
                o00O0000 o00o0000 = (o00O0000) this.f32549OooOo0o;
                o00o0000.OooO0oo();
                try {
                    long jOooO0oO = o00000o02.OooO0oO(j, sink);
                    if (o00o0000.OooO()) {
                        throw o00o0000.OooOO0O(null);
                    }
                    return jOooO0oO;
                } catch (IOException e) {
                    if (o00o0000.OooO()) {
                        throw o00o0000.OooOO0O(e);
                    }
                    throw e;
                } finally {
                    o00o0000.OooO();
                }
            default:
                OooOo.OooO0o0(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
                }
                try {
                    ((o00O000) this.f32547OooOo).OooO0o();
                    o000O o000oOooO0o0 = sink.OooO0o0(1);
                    int i = ((InputStream) this.f32549OooOo0o).read(o000oOooO0o0.f32563OooO00o, o000oOooO0o0.f32565OooO0OO, (int) Math.min(j, 8192 - o000oOooO0o0.f32565OooO0OO));
                    if (i == -1) {
                        if (o000oOooO0o0.f32564OooO0O0 == o000oOooO0o0.f32565OooO0OO) {
                            sink.f32534OooOo0O = o000oOooO0o0.OooO00o();
                            o000OO00.OooO00o(o000oOooO0o0);
                        }
                        return -1L;
                    }
                    o000oOooO0o0.f32565OooO0OO += i;
                    long j2 = i;
                    sink.f32535OooOo0o += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (o00oO0o.OooO(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f32548OooOo0O) {
            case 0:
                o00000O0 o00000o02 = (o00000O0) this.f32547OooOo;
                o00O0000 o00o0000 = (o00O0000) this.f32549OooOo0o;
                o00o0000.OooO0oo();
                try {
                    o00000o02.close();
                    if (o00o0000.OooO()) {
                        throw o00o0000.OooOO0O(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!o00o0000.OooO()) {
                        throw e;
                    }
                    throw o00o0000.OooOO0O(e);
                } finally {
                    o00o0000.OooO();
                }
            default:
                ((InputStream) this.f32549OooOo0o).close();
                return;
        }
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        switch (this.f32548OooOo0O) {
            case 0:
                return (o00O0000) this.f32549OooOo0o;
            default:
                return (o00O000) this.f32547OooOo;
        }
    }

    public final String toString() {
        switch (this.f32548OooOo0O) {
            case 0:
                return "AsyncTimeout.source(" + ((o00000O0) this.f32547OooOo) + ')';
            default:
                return "source(" + ((InputStream) this.f32549OooOo0o) + ')';
        }
    }
}

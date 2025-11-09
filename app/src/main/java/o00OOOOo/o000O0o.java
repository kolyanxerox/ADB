package o00OOOoO;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o000O0o implements o0O0ooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f32581OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000O0O0 f32582OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Inflater f32583OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f32584OooOoO0;

    public o000O0o(o000O0O0 o000o0o02, Inflater inflater) {
        this.f32582OooOo0O = o000o0o02;
        this.f32583OooOo0o = inflater;
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 sink) throws DataFormatException, IOException {
        long j2;
        OooOo.OooO0o0(sink, "sink");
        while (j >= 0) {
            if (this.f32584OooOoO0) {
                throw new IllegalStateException("closed");
            }
            o000O0O0 o000o0o02 = this.f32582OooOo0O;
            Inflater inflater = this.f32583OooOo0o;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    o000O o000oOooO0o0 = sink.OooO0o0(1);
                    int iMin = (int) Math.min(j, 8192 - o000oOooO0o0.f32565OooO0OO);
                    if (inflater.needsInput() && !o000o0o02.exhausted()) {
                        o000O o000o = o000o0o02.f32578OooOo0o.f32534OooOo0O;
                        OooOo.OooO0O0(o000o);
                        int i = o000o.f32565OooO0OO;
                        int i2 = o000o.f32564OooO0O0;
                        int i3 = i - i2;
                        this.f32581OooOo = i3;
                        inflater.setInput(o000o.f32563OooO00o, i2, i3);
                    }
                    int iInflate = inflater.inflate(o000oOooO0o0.f32563OooO00o, o000oOooO0o0.f32565OooO0OO, iMin);
                    int i4 = this.f32581OooOo;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.f32581OooOo -= remaining;
                        o000o0o02.skip(remaining);
                    }
                    if (iInflate > 0) {
                        o000oOooO0o0.f32565OooO0OO += iInflate;
                        j2 = iInflate;
                        sink.f32535OooOo0o += j2;
                    } else {
                        if (o000oOooO0o0.f32564OooO0O0 == o000oOooO0o0.f32565OooO0OO) {
                            sink.f32534OooOo0O = o000oOooO0o0.OooO00o();
                            o000OO00.OooO00o(o000oOooO0o0);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (o000o0o02.exhausted()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f32584OooOoO0) {
            return;
        }
        this.f32583OooOo0o.end();
        this.f32584OooOoO0 = true;
        this.f32582OooOo0O.close();
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return this.f32582OooOo0O.f32577OooOo0O.timeout();
    }
}

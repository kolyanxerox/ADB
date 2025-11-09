package o00OOOoO;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOo;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class o00000OO extends InputStream implements AutoCloseable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f32550OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0000oo f32551OooOo0o;

    public /* synthetic */ o00000OO(o0000oo o0000ooVar, int i) {
        this.f32550OooOo0O = i;
        this.f32551OooOo0o = o0000ooVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.f32550OooOo0O) {
            case 0:
                return (int) Math.min(((o0000) this.f32551OooOo0o).f32535OooOo0o, Integer.MAX_VALUE);
            default:
                o000O0O0 o000o0o02 = (o000O0O0) this.f32551OooOo0o;
                if (o000o0o02.f32576OooOo) {
                    throw new IOException("closed");
                }
                return (int) Math.min(o000o0o02.f32578OooOo0o.f32535OooOo0o, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f32550OooOo0O) {
            case 0:
                break;
            default:
                ((o000O0O0) this.f32551OooOo0o).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f32550OooOo0O) {
            case 0:
                o0000 o0000Var = (o0000) this.f32551OooOo0o;
                if (o0000Var.f32535OooOo0o > 0) {
                    return o0000Var.readByte() & ForkServer.ERROR;
                }
                return -1;
            default:
                o000O0O0 o000o0o02 = (o000O0O0) this.f32551OooOo0o;
                if (o000o0o02.f32576OooOo) {
                    throw new IOException("closed");
                }
                o0000 o0000Var2 = o000o0o02.f32578OooOo0o;
                if (o0000Var2.f32535OooOo0o == 0 && o000o0o02.f32577OooOo0O.OooO0oO(8192L, o0000Var2) == -1) {
                    return -1;
                }
                return o0000Var2.readByte() & ForkServer.ERROR;
        }
    }

    public final String toString() {
        switch (this.f32550OooOo0O) {
            case 0:
                return ((o0000) this.f32551OooOo0o) + ".inputStream()";
            default:
                return ((o000O0O0) this.f32551OooOo0o) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i, int i2) throws IOException {
        switch (this.f32550OooOo0O) {
            case 0:
                OooOo.OooO0o0(sink, "sink");
                return ((o0000) this.f32551OooOo0o).read(sink, i, i2);
            default:
                OooOo.OooO0o0(sink, "data");
                o000O0O0 o000o0o02 = (o000O0O0) this.f32551OooOo0o;
                if (!o000o0o02.f32576OooOo) {
                    o0OOO0.OooO0o0(sink.length, i, i2);
                    o0000 o0000Var = o000o0o02.f32578OooOo0o;
                    if (o0000Var.f32535OooOo0o == 0 && o000o0o02.f32577OooOo0O.OooO0oO(8192L, o0000Var) == -1) {
                        return -1;
                    }
                    return o0000Var.read(sink, i, i2);
                }
                throw new IOException("closed");
        }
    }

    private final void OooO00o() {
    }
}

package o00OOOoO;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o0000Ooo extends OutputStream implements AutoCloseable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f32561OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f32562OooOo0o;

    public /* synthetic */ o0000Ooo(o0000O00 o0000o00, int i) {
        this.f32561OooOo0O = i;
        this.f32562OooOo0o = o0000o00;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f32561OooOo0O) {
            case 0:
                break;
            default:
                ((o000OO0O) this.f32562OooOo0o).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f32561OooOo0O) {
            case 0:
                break;
            default:
                o000OO0O o000oo0o = (o000OO0O) this.f32562OooOo0o;
                if (!o000oo0o.f32591OooOo) {
                    o000oo0o.flush();
                    break;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f32561OooOo0O) {
            case 0:
                return ((o0000) this.f32562OooOo0o) + ".outputStream()";
            default:
                return ((o000OO0O) this.f32562OooOo0o) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f32561OooOo0O) {
            case 0:
                ((o0000) this.f32562OooOo0o).OooOO0O(i);
                return;
            default:
                o000OO0O o000oo0o = (o000OO0O) this.f32562OooOo0o;
                if (o000oo0o.f32591OooOo) {
                    throw new IOException("closed");
                }
                o000oo0o.f32593OooOo0o.OooOO0O((byte) i);
                o000oo0o.OooO00o();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) throws IOException {
        switch (this.f32561OooOo0O) {
            case 0:
                OooOo.OooO0o0(data, "data");
                ((o0000) this.f32562OooOo0o).OooO0oo(data, i, i2);
                return;
            default:
                OooOo.OooO0o0(data, "data");
                o000OO0O o000oo0o = (o000OO0O) this.f32562OooOo0o;
                if (!o000oo0o.f32591OooOo) {
                    o000oo0o.f32593OooOo0o.OooO0oo(data, i, i2);
                    o000oo0o.OooO00o();
                    return;
                }
                throw new IOException("closed");
        }
    }

    private final void OooO00o() {
    }

    private final void OooO0O0() {
    }
}

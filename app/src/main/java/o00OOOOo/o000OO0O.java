package o00OOOoO;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o000OO0O implements o0000O00 {

    /* renamed from: OooOo */
    public boolean f32591OooOo;

    /* renamed from: OooOo0O */
    public final o00 f32592OooOo0O;

    /* renamed from: OooOo0o */
    public final o0000 f32593OooOo0o = new o0000();

    public o000OO0O(o00 o00Var) {
        this.f32592OooOo0O = o00Var;
    }

    public final o0000O00 OooO00o() {
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        o0000 o0000Var = this.f32593OooOo0o;
        long j = o0000Var.f32535OooOo0o;
        if (j == 0) {
            j = 0;
        } else {
            o000O o000o = o0000Var.f32534OooOo0O;
            OooOo.OooO0O0(o000o);
            o000O o000o2 = o000o.f32569OooO0oO;
            OooOo.OooO0O0(o000o2);
            if (o000o2.f32565OooO0OO < 8192 && o000o2.f32568OooO0o0) {
                j -= r6 - o000o2.f32564OooO0O0;
            }
        }
        if (j > 0) {
            this.f32592OooOo0O.OooOO0(j, o0000Var);
        }
        return this;
    }

    public final o0000O00 OooO0O0(byte[] bArr) {
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        this.f32593OooOo0o.OooO0oo(bArr, 0, bArr.length);
        OooO00o();
        return this;
    }

    public final o0000O00 OooO0OO(int i) {
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        this.f32593OooOo0o.OooOO0O(i);
        OooO00o();
        return this;
    }

    public final o0000O00 OooO0Oo(int i) {
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        o0000 o0000Var = this.f32593OooOo0o;
        o000O o000oOooO0o0 = o0000Var.OooO0o0(4);
        int i2 = o000oOooO0o0.f32565OooO0OO;
        byte[] bArr = o000oOooO0o0.f32563OooO00o;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        o000oOooO0o0.f32565OooO0OO = i2 + 4;
        o0000Var.f32535OooOo0o += 4;
        OooO00o();
        return this;
    }

    @Override // o00OOOoO.o00
    public final void OooOO0(long j, o0000 source) {
        OooOo.OooO0o0(source, "source");
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        this.f32593OooOo0o.OooOO0(j, source);
        OooO00o();
    }

    @Override // o00OOOoO.o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o00 o00Var = this.f32592OooOo0O;
        if (this.f32591OooOo) {
            return;
        }
        try {
            o0000 o0000Var = this.f32593OooOo0o;
            long j = o0000Var.f32535OooOo0o;
            if (j > 0) {
                o00Var.OooOO0(j, o0000Var);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            o00Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f32591OooOo = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o00OOOoO.o00, java.io.Flushable
    public final void flush() {
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        o0000 o0000Var = this.f32593OooOo0o;
        long j = o0000Var.f32535OooOo0o;
        o00 o00Var = this.f32592OooOo0O;
        if (j > 0) {
            o00Var.OooOO0(j, o0000Var);
        }
        o00Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f32591OooOo;
    }

    @Override // o00OOOoO.o0000O00
    public final OutputStream outputStream() {
        return new o0000Ooo(this, 1);
    }

    @Override // o00OOOoO.o00
    public final o00O000 timeout() {
        return this.f32592OooOo0O.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f32592OooOo0O + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        OooOo.OooO0o0(source, "source");
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f32593OooOo0o.write(source);
        OooO00o();
        return iWrite;
    }

    @Override // o00OOOoO.o0000O00
    public final o0000O00 writeUtf8(String string) {
        OooOo.OooO0o0(string, "string");
        if (this.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        this.f32593OooOo0o.OooOOOO(string);
        OooO00o();
        return this;
    }
}

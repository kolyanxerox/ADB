package o00Oo00o;

import java.io.IOException;
import java.io.OutputStream;
import o000o00o.o00000O0;
import o00O00o0.OooO00o;
import o00Oo000.o0OO00O;
import o00Oo000.o0Oo0oo;

/* loaded from: classes3.dex */
public final class o000oOoO extends OutputStream implements AutoCloseable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o0OO00O f32673OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f32674OooOo0O = Integer.MAX_VALUE;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o0Oo0oo f32675OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f32676OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f32677OooOoO0;

    public o000oOoO(o00000O0 o00000o02, OooO00o oooO00o) {
        this.f32675OooOo0o = o00000o02;
        this.f32673OooOo = oooO00o;
    }

    public final void OooO00o(int i) {
        if (this.f32676OooOoO || this.f32677OooOoO0 + i <= this.f32674OooOo0O) {
            return;
        }
        this.f32676OooOoO = true;
        this.f32675OooOo0o.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f32673OooOo.OooO00o(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((OutputStream) this.f32673OooOo.OooO00o(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        OooO00o(bArr.length);
        ((OutputStream) this.f32673OooOo.OooO00o(this)).write(bArr);
        this.f32677OooOoO0 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        OooO00o(i2);
        ((OutputStream) this.f32673OooOo.OooO00o(this)).write(bArr, i, i2);
        this.f32677OooOoO0 += i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        OooO00o(1);
        ((OutputStream) this.f32673OooOo.OooO00o(this)).write(i);
        this.f32677OooOoO0++;
    }
}

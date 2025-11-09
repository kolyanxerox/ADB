package o00OOOO;

import java.net.ProtocolException;
import o00OOOoO.o00;
import o00OOOoO.o000;
import o00OOOoO.o0000;
import o00OOOoO.o00O000;

/* loaded from: classes3.dex */
public final class OooO0o implements o00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public long f32362OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000 f32363OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f32364OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f32365OooOoO0;

    public OooO0o(OooOO0O oooOO0O, long j) {
        this.f32365OooOoO0 = oooOO0O;
        this.f32363OooOo0O = new o000(oooOO0O.f32370OooO0Oo.f32592OooOo0O.timeout());
        this.f32362OooOo = j;
    }

    @Override // o00OOOoO.o00
    public final void OooOO0(long j, o0000 o0000Var) throws ProtocolException {
        if (this.f32364OooOo0o) {
            throw new IllegalStateException("closed");
        }
        long j2 = o0000Var.f32535OooOo0o;
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j <= this.f32362OooOo) {
            this.f32365OooOoO0.f32370OooO0Oo.OooOO0(j, o0000Var);
            this.f32362OooOo -= j;
        } else {
            throw new ProtocolException("expected " + this.f32362OooOo + " bytes but received " + j);
        }
    }

    @Override // o00OOOoO.o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f32364OooOo0o) {
            return;
        }
        this.f32364OooOo0o = true;
        if (this.f32362OooOo > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        OooOO0O oooOO0O = this.f32365OooOoO0;
        oooOO0O.getClass();
        o000 o000Var = this.f32363OooOo0O;
        o00O000 o00o000 = o000Var.f32533OooO0o0;
        o000Var.f32533OooO0o0 = o00O000.f32601OooO0Oo;
        o00o000.OooO00o();
        o00o000.OooO0O0();
        oooOO0O.f32372OooO0o0 = 3;
    }

    @Override // o00OOOoO.o00, java.io.Flushable
    public final void flush() {
        if (this.f32364OooOo0o) {
            return;
        }
        this.f32365OooOoO0.f32370OooO0Oo.flush();
    }

    @Override // o00OOOoO.o00
    public final o00O000 timeout() {
        return this.f32363OooOo0O;
    }
}

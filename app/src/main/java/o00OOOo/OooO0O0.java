package o00OOOO;

import o00OOOoO.o00;
import o00OOOoO.o000;
import o00OOOoO.o0000;
import o00OOOoO.o000OO0O;
import o00OOOoO.o00O000;

/* loaded from: classes3.dex */
public final class OooO0O0 implements o00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f32355OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000 f32356OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f32357OooOo0o;

    public OooO0O0(OooOO0O oooOO0O) {
        this.f32355OooOo = oooOO0O;
        this.f32356OooOo0O = new o000(oooOO0O.f32370OooO0Oo.f32592OooOo0O.timeout());
    }

    @Override // o00OOOoO.o00
    public final void OooOO0(long j, o0000 o0000Var) {
        if (this.f32357OooOo0o) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        OooOO0O oooOO0O = this.f32355OooOo;
        o000OO0O o000oo0o = oooOO0O.f32370OooO0Oo;
        if (o000oo0o.f32591OooOo) {
            throw new IllegalStateException("closed");
        }
        o000oo0o.f32593OooOo0o.OooOOO0(j);
        o000oo0o.OooO00o();
        o000OO0O o000oo0o2 = oooOO0O.f32370OooO0Oo;
        o000oo0o2.writeUtf8("\r\n");
        o000oo0o2.OooOO0(j, o0000Var);
        o000oo0o2.writeUtf8("\r\n");
    }

    @Override // o00OOOoO.o00, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f32357OooOo0o) {
            return;
        }
        this.f32357OooOo0o = true;
        this.f32355OooOo.f32370OooO0Oo.writeUtf8("0\r\n\r\n");
        OooOO0O oooOO0O = this.f32355OooOo;
        o000 o000Var = this.f32356OooOo0O;
        oooOO0O.getClass();
        o00O000 o00o000 = o000Var.f32533OooO0o0;
        o000Var.f32533OooO0o0 = o00O000.f32601OooO0Oo;
        o00o000.OooO00o();
        o00o000.OooO0O0();
        this.f32355OooOo.f32372OooO0o0 = 3;
    }

    @Override // o00OOOoO.o00, java.io.Flushable
    public final synchronized void flush() {
        if (this.f32357OooOo0o) {
            return;
        }
        this.f32355OooOo.f32370OooO0Oo.flush();
    }

    @Override // o00OOOoO.o00
    public final o00O000 timeout() {
        return this.f32356OooOo0O;
    }
}

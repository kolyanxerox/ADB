package o00OOO0;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class o000000 implements Closeable, AutoCloseable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f32208OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0OO00O f32209OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o00oO0o f32210OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Oooo0 f32211OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final String f32212OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final o000oOoO f32213OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final o000000 f32214OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final o00000 f32215OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final o000000 f32216OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final o000000 f32217OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final long f32218Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final long f32219Oooo00O;

    public o000000(o000OOo o000ooo2) {
        this.f32209OooOo0O = o000ooo2.f32233OooO00o;
        this.f32210OooOo0o = o000ooo2.f32234OooO0O0;
        this.f32208OooOo = o000ooo2.f32235OooO0OO;
        this.f32212OooOoO0 = o000ooo2.f32236OooO0Oo;
        this.f32211OooOoO = o000ooo2.f32238OooO0o0;
        o000Ooo.o00oO0o o00oo0o = o000ooo2.f32237OooO0o;
        o00oo0o.getClass();
        this.f32213OooOoOO = new o000oOoO(o00oo0o);
        this.f32215OooOoo0 = o000ooo2.f32239OooO0oO;
        this.f32214OooOoo = o000ooo2.f32240OooO0oo;
        this.f32216OooOooO = o000ooo2.f32232OooO;
        this.f32217OooOooo = o000ooo2.f32241OooOO0;
        this.f32218Oooo000 = o000ooo2.f32242OooOO0O;
        this.f32219Oooo00O = o000ooo2.OooOO0o;
    }

    public final String OooO00o(String str) {
        String strOooO0OO = this.f32213OooOoOO.OooO0OO(str);
        if (strOooO0OO != null) {
            return strOooO0OO;
        }
        return null;
    }

    public final o000OOo OooO0O0() {
        o000OOo o000ooo2 = new o000OOo();
        o000ooo2.f32233OooO00o = this.f32209OooOo0O;
        o000ooo2.f32234OooO0O0 = this.f32210OooOo0o;
        o000ooo2.f32235OooO0OO = this.f32208OooOo;
        o000ooo2.f32236OooO0Oo = this.f32212OooOoO0;
        o000ooo2.f32238OooO0o0 = this.f32211OooOoO;
        o000ooo2.f32237OooO0o = this.f32213OooOoOO.OooO0o0();
        o000ooo2.f32239OooO0oO = this.f32215OooOoo0;
        o000ooo2.f32240OooO0oo = this.f32214OooOoo;
        o000ooo2.f32232OooO = this.f32216OooOooO;
        o000ooo2.f32241OooOO0 = this.f32217OooOooo;
        o000ooo2.f32242OooOO0O = this.f32218Oooo000;
        o000ooo2.OooOO0o = this.f32219Oooo00O;
        return o000ooo2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o00000 o00000Var = this.f32215OooOoo0;
        if (o00000Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        o00000Var.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f32210OooOo0o + ", code=" + this.f32208OooOo + ", message=" + this.f32212OooOoO0 + ", url=" + this.f32209OooOo0O.f32277OooO00o + '}';
    }
}

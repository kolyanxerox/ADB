package o00OOO0;

/* loaded from: classes3.dex */
public final class o000OOo {

    /* renamed from: OooO */
    public o000000 f32232OooO;

    /* renamed from: OooO00o */
    public o0OO00O f32233OooO00o;

    /* renamed from: OooO0O0 */
    public o00oO0o f32234OooO0O0;

    /* renamed from: OooO0Oo */
    public String f32236OooO0Oo;

    /* renamed from: OooO0o0 */
    public Oooo0 f32238OooO0o0;

    /* renamed from: OooO0oO */
    public o00000 f32239OooO0oO;

    /* renamed from: OooO0oo */
    public o000000 f32240OooO0oo;

    /* renamed from: OooOO0 */
    public o000000 f32241OooOO0;

    /* renamed from: OooOO0O */
    public long f32242OooOO0O;
    public long OooOO0o;

    /* renamed from: OooO0OO */
    public int f32235OooO0OO = -1;

    /* renamed from: OooO0o */
    public o000Ooo.o00oO0o f32237OooO0o = new o000Ooo.o00oO0o(15);

    public static void OooO0O0(String str, o000000 o000000Var) {
        if (o000000Var.f32215OooOoo0 != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (o000000Var.f32214OooOoo != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (o000000Var.f32216OooOooO != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (o000000Var.f32217OooOooo != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final o000000 OooO00o() {
        if (this.f32233OooO00o == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f32234OooO0O0 == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f32235OooO0OO >= 0) {
            if (this.f32236OooO0Oo != null) {
                return new o000000(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.f32235OooO0OO);
    }
}

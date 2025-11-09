package o00OOO0;

import java.io.IOException;
import oOooo0o.o00OOOOo;

/* loaded from: classes3.dex */
public final class o0OOO0o extends o00OOO0O.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f32283OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0 f32284OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o0Oo0oo o0oo0oo, OooOO0 oooOO0) {
        super("OkHttp %s", o0oo0oo.OooO0Oo());
        this.f32283OooOo = o0oo0oo;
        this.f32284OooOo0o = oooOO0;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() {
        OooOO0 oooOO0 = this.f32284OooOo0o;
        o0Oo0oo o0oo0oo = this.f32283OooOo;
        o0oo0oo.f32285OooOo.OooO0oo();
        boolean z = false;
        try {
            try {
            } catch (IOException e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                oooOO0.onResponse(o0oo0oo, o0oo0oo.OooO0O0());
                o0oo0oo.f32286OooOo0O.f32305OooOo0O.OooO0OO(this);
            } catch (IOException e2) {
                e = e2;
                z = true;
                IOException iOExceptionOooO0o0 = o0oo0oo.OooO0o0(e);
                if (z) {
                    o00OOOOo o00ooooo = o00OOOOo.f33168OooO00o;
                    StringBuilder sb = new StringBuilder("Callback failure for ");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(o0oo0oo.f32287OooOo0o.f32393OooO0Oo ? "canceled " : "");
                    sb2.append("call to ");
                    sb2.append(o0oo0oo.OooO0Oo());
                    sb.append(sb2.toString());
                    o00ooooo.OooOO0o(4, sb.toString(), iOExceptionOooO0o0);
                } else {
                    o0oo0oo.f32289OooOoO0.getClass();
                    oooOO0.onFailure(o0oo0oo, iOExceptionOooO0o0);
                }
                o0oo0oo.f32286OooOo0O.f32305OooOo0O.OooO0OO(this);
            } catch (Throwable th2) {
                th = th2;
                z = true;
                o0oo0oo.cancel();
                if (!z) {
                    oooOO0.onFailure(o0oo0oo, new IOException("canceled due to " + th));
                }
                throw th;
            }
        } catch (Throwable th3) {
            o0oo0oo.f32286OooOo0O.f32305OooOo0O.OooO0OO(this);
            throw th3;
        }
    }
}

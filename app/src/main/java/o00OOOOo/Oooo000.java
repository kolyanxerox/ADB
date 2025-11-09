package o00OOOOo;

import java.io.IOException;
import o00OOOoO.o0000;

/* loaded from: classes3.dex */
public final class Oooo000 extends o00OOO0O.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0000 f32446OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f32447OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f32448OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f32449OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(o00Oo0 o00oo0, Object[] objArr, int i, o0000 o0000Var, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f32448OooOoO = o00oo0;
        this.f32447OooOo0o = i;
        this.f32446OooOo = o0000Var;
        this.f32449OooOoO0 = i2;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() {
        try {
            o000OOo o000ooo2 = this.f32448OooOoO.f32466OooOooo;
            o0000 o0000Var = this.f32446OooOo;
            int i = this.f32449OooOoO0;
            o000ooo2.getClass();
            o0000Var.skip(i);
            this.f32448OooOoO.f32477Oooo0oo.OooO0oo(this.f32447OooOo0o, 6);
            synchronized (this.f32448OooOoO) {
                this.f32448OooOoO.f32478OoooO00.remove(Integer.valueOf(this.f32447OooOo0o));
            }
        } catch (IOException unused) {
        }
    }
}

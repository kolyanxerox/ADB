package o00OOOOo;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class OooOOOO extends o00OOO0O.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f32438OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f32439OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f32440OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(o00Oo0 o00oo0, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f32440OooOoO0 = o00oo0;
        this.f32439OooOo0o = i;
        this.f32438OooOo = j;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() {
        o00Oo0 o00oo0 = this.f32440OooOoO0;
        try {
            o00oo0.f32477Oooo0oo.OooO(this.f32439OooOo0o, this.f32438OooOo);
        } catch (IOException unused) {
            o00oo0.OooO0O0();
        }
    }
}

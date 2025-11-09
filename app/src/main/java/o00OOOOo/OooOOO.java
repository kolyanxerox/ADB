package o00OOOOo;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class OooOOO extends o00OOO0O.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f32428OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f32429OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f32430OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(o00Oo0 o00oo0, Object[] objArr, int i, int i2) {
        super("OkHttp %s stream %d", objArr);
        this.f32430OooOoO0 = o00oo0;
        this.f32429OooOo0o = i;
        this.f32428OooOo = i2;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() {
        o00Oo0 o00oo0 = this.f32430OooOoO0;
        try {
            o00oo0.f32477Oooo0oo.OooO0oo(this.f32429OooOo0o, this.f32428OooOo);
        } catch (IOException unused) {
            o00oo0.OooO0O0();
        }
    }
}

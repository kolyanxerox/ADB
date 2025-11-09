package o00OOOOo;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class o0OoOo0 extends o00OOO0O.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f32512OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f32513OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f32514OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f32515OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o00Oo0 o00oo0, int i, int i2) {
        super("OkHttp %s ping %08x%08x", o00oo0.f32461OooOoO0, Integer.valueOf(i), Integer.valueOf(i2));
        this.f32514OooOoO = o00oo0;
        this.f32513OooOo0o = true;
        this.f32512OooOo = i;
        this.f32515OooOoO0 = i2;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() {
        int i = this.f32512OooOo;
        int i2 = this.f32515OooOoO0;
        boolean z = this.f32513OooOo0o;
        o00Oo0 o00oo0 = this.f32514OooOoO;
        o00oo0.getClass();
        try {
            o00oo0.f32477Oooo0oo.OooO0o(z, i, i2);
        } catch (IOException unused) {
            o00oo0.OooO0O0();
        }
    }
}

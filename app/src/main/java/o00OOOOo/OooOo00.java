package o00OOOOo;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class OooOo00 extends o00OOO0O.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f32444OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f32445OooOo0o = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(o00Oo0 o00oo0, Object[] objArr) {
        super("OkHttp %s ping", objArr);
        this.f32444OooOo = o00oo0;
    }

    @Override // o00OOO0O.OooO00o
    public final void OooO00o() {
        switch (this.f32445OooOo0o) {
            case 0:
                o00Oo0 o00oo0 = (o00Oo0) this.f32444OooOo;
                o00oo0.getClass();
                try {
                    o00oo0.f32477Oooo0oo.OooO0o(false, 2, 0);
                    break;
                } catch (IOException unused) {
                    o00oo0.OooO0O0();
                    return;
                }
            default:
                o00Oo0 o00oo02 = (o00Oo0) ((o00O0O) this.f32444OooOo).f32453OooOo;
                o00oo02.f32459OooOo0o.OooO00o(o00oo02);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(o00O0O o00o0o, Object[] objArr) {
        super("OkHttp %s settings", objArr);
        this.f32444OooOo = o00o0o;
    }
}

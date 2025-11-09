package o0000o0;

import android.content.Context;
import o0000oo0.o00Oo0;
import o0000oo0.o0OOO0o;
import o000O0Oo.OooO0o;
import o000OOo0.OooO0O0;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOOOO implements o000Oo00.OooOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29581OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f29582OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f29583OooO0OO;

    public /* synthetic */ OooOOOO(int i, Object obj, Object obj2) {
        this.f29581OooO00o = i;
        this.f29582OooO0O0 = obj;
        this.f29583OooO0OO = obj2;
    }

    @Override // o000Oo00.OooOOO
    public final Object get() {
        switch (this.f29581OooO00o) {
            case 0:
                Oooo0 oooo0 = (Oooo0) this.f29582OooO0O0;
                return new o000OoOo.OooOOOO((Context) this.f29583OooO0OO, oooo0.OooO0o(), (OooO0O0) oooo0.f29591OooO0Oo.get(OooO0O0.class));
            case 1:
                o0OOO0o o0ooo0o = (o0OOO0o) this.f29582OooO0O0;
                o0ooo0o.getClass();
                o00Oo0 o00oo0 = (o00Oo0) this.f29583OooO0OO;
                return o00oo0.f29674OooO0o.OooO0OO(new OooO0o(o00oo0, o0ooo0o));
            default:
                return new o000OOoO.OooOOO((Context) this.f29583OooO0OO, (String) this.f29582OooO0O0);
        }
    }

    public /* synthetic */ OooOOOO(Context context, String str) {
        this.f29581OooO00o = 2;
        this.f29583OooO0OO = context;
        this.f29582OooO0O0 = str;
    }
}

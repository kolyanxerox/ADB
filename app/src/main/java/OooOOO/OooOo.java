package OooOOo;

import OooOOoo.o0000O;
import OooOOoo.o0000OO0;
import android.content.Context;
import o000OOoO.OooO;

/* loaded from: classes2.dex */
public final class OooOo implements o0000O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13448OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o0000OO0 f13449OooOo0o;

    public /* synthetic */ OooOo(o0000OO0 o0000oo02, int i) {
        this.f13448OooOo0O = i;
        this.f13449OooOo0o = o0000oo02;
    }

    @Override // o00O00oO.o0000O0
    public final Object get() {
        switch (this.f13448OooOo0O) {
            case 0:
                return new OooOo00((Context) this.f13449OooOo0o.f13531OooOo0o, new OooO(4), new o000000.OooO(4));
            case 1:
                String packageName = ((Context) this.f13449OooOo0o.f13531OooOo0o).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new OooOo.Oooo0((Context) this.f13449OooOo0o.f13531OooOo0o, "com.google.android.datatransport.events", Integer.valueOf(OooOo.Oooo0.f13566OooO0Oo).intValue());
        }
    }
}

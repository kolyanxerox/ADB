package o00O0;

import java.util.Iterator;
import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class o00Oo0 implements o00O0o.Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31244OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f31245OooO0O0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f31244OooO00o = i;
        this.f31245OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o00O0OO0.OooOOO, o00O0Oo.o00O0O] */
    @Override // o00O0o.Oooo000
    public final Iterator iterator() {
        switch (this.f31244OooO00o) {
            case 0:
                return ((Iterable) this.f31245OooO0O0).iterator();
            case 1:
                return new o00O0Oo0.o00oO0o(this);
            case 2:
                return o00O0O0O.OooOo00((o00O0OO0.OooOOO) this.f31245OooO0O0);
            case 3:
                return (Iterator) this.f31245OooO0O0;
            default:
                return new o00O0oO.o0O0O00((String) this.f31245OooO0O0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00Oo0(o00O0Oo.o00O0O o00o0o) {
        this.f31244OooO00o = 2;
        this.f31245OooO0O0 = (o00O0OO0.OooOOO) o00o0o;
    }
}

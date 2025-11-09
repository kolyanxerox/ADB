package o0000oo0;

import o000Oo00.OooOOO;

/* loaded from: classes2.dex */
public final class o000000O implements OooOOO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f29657OooO0OO = new Object();

    /* renamed from: OooO00o, reason: collision with root package name */
    public volatile Object f29658OooO00o = f29657OooO0OO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public volatile OooOOO f29659OooO0O0;

    public o000000O(OooOOO oooOOO) {
        this.f29659OooO0O0 = oooOOO;
    }

    @Override // o000Oo00.OooOOO
    public final Object get() {
        Object obj;
        Object obj2 = this.f29658OooO00o;
        Object obj3 = f29657OooO0OO;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f29658OooO00o;
                if (obj == obj3) {
                    obj = this.f29659OooO0O0.get();
                    this.f29658OooO00o = obj;
                    this.f29659OooO0O0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}

package o00O0ooo;

import kotlin.jvm.internal.OooOo;
import o00O0oOo.o000OO00;
import o00O0oOo.oo0o0Oo;

/* loaded from: classes3.dex */
public final class o0OOOO00 implements o000OO00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f31778OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0OOo000 f31779OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final long f31780OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final oo0o0Oo f31781OooOoO0;

    public o0OOOO00(o0OOo000 o0ooo000, long j, Object obj, oo0o0Oo oo0o0oo) {
        this.f31779OooOo0O = o0ooo000;
        this.f31780OooOo0o = j;
        this.f31778OooOo = obj;
        this.f31781OooOoO0 = oo0o0oo;
    }

    @Override // o00O0oOo.o000OO00
    public final void dispose() {
        o0OOo000 o0ooo000 = this.f31779OooOo0O;
        synchronized (o0ooo000) {
            if (this.f31780OooOo0o < o0ooo000.OooOOO0()) {
                return;
            }
            Object[] objArr = o0ooo000.f31793OooOoo0;
            OooOo.OooO0O0(objArr);
            long j = this.f31780OooOo0o;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            o0o0000.OooO0o(objArr, j, o0o0000.f31803OooO00o);
            o0ooo000.OooO0oo();
        }
    }
}

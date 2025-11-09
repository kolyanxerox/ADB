package o00O0oOo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o000O0O0.OooO0O0;

/* loaded from: classes3.dex */
public final class o00O0O extends oo0o0O0 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31534OooOoo = AtomicReferenceFieldUpdater.newUpdater(o00O0O.class, Object.class, "_disposer$volatile");

    /* renamed from: OooOoO, reason: collision with root package name */
    public final oo0o0Oo f31535OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public o000OO00 f31536OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f31537OooOoo0;
    private volatile /* synthetic */ Object _disposer$volatile;

    public o00O0O(o00Ooo o00ooo2, oo0o0Oo oo0o0oo) {
        this.f31537OooOoo0 = o00ooo2;
        this.f31535OooOoO = oo0o0oo;
    }

    @Override // o00O0oOo.oo0o0O0
    public final boolean OooO() {
        return false;
    }

    @Override // o00O0oOo.oo0o0O0
    public final void OooOO0(Throwable th) {
        oo0o0Oo oo0o0oo = this.f31535OooOoO;
        if (th != null) {
            oo0o0oo.getClass();
            OooO0O0 oooO0O0OooOooO = oo0o0oo.OooOooO(new o0000Ooo(false, th), null);
            if (oooO0O0OooOooO != null) {
                oo0o0oo.OooOOo(oooO0O0OooOooO);
                o00Oo0 o00oo0 = (o00Oo0) f31534OooOoo.get(this);
                if (o00oo0 != null) {
                    o00oo0.OooO0O0();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o00Ooo.f31555OooO0O0;
        o00Ooo o00ooo2 = this.f31537OooOoo0;
        if (atomicIntegerFieldUpdater.decrementAndGet(o00ooo2) == 0) {
            o000O0o[] o000o0oArr = o00ooo2.f31556OooO00o;
            ArrayList arrayList = new ArrayList(o000o0oArr.length);
            for (o000O0o o000o0o2 : o000o0oArr) {
                arrayList.add(o000o0o2.OooO0O0());
            }
            oo0o0oo.resumeWith(arrayList);
        }
    }
}

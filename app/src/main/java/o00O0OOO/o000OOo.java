package o00O0oOo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o000O0O0.OooO0O0;
import o00OO000.OooO00o;
import o00OO000.OooOO0;

/* loaded from: classes3.dex */
public final class o000OOo extends oo0o0O0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f31517OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final Object f31518OooOoOO;

    public /* synthetic */ o000OOo(Object obj, int i) {
        this.f31517OooOoO = i;
        this.f31518OooOoOO = obj;
    }

    @Override // o00O0oOo.oo0o0O0
    public final boolean OooO() {
        switch (this.f31517OooOoO) {
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o00O0Oo.Oooo000] */
    @Override // o00O0oOo.oo0o0O0
    public final void OooOO0(Throwable th) {
        switch (this.f31517OooOoO) {
            case 0:
                o00O o00oOooO0oo = OooO0oo();
                oo0o0Oo oo0o0oo = (oo0o0Oo) this.f31518OooOoOO;
                Throwable thOooOOO = oo0o0oo.OooOOO(o00oOooO0oo);
                if (oo0o0oo.OooOo0O()) {
                    OooOO0 oooOO0 = (OooOO0) oo0o0oo.f31583OooOoO0;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0.f31933OooOoo;
                        Object obj = atomicReferenceFieldUpdater.get(oooOO0);
                        OooO0O0 oooO0O0 = OooO00o.f31924OooO0OO;
                        if (OooOo.OooO00o(obj, oooO0O0)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(oooOO0, oooO0O0, thOooOOO)) {
                                if (atomicReferenceFieldUpdater.get(oooOO0) != oooO0O0) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(oooOO0, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(oooOO0) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                oo0o0oo.OooO0oO(thOooOOO);
                if (!oo0o0oo.OooOo0O()) {
                    oo0o0oo.OooOO0o();
                    break;
                }
                break;
            case 1:
                ((o000OO00) this.f31518OooOoOO).dispose();
                break;
            case 2:
                this.f31518OooOoOO.invoke(th);
                break;
            default:
                Object obj2 = o00O.f31521OooOo0O.get(OooO0oo());
                boolean z = obj2 instanceof o0000Ooo;
                o00O0OO o00o0oo = (o00O0OO) this.f31518OooOoOO;
                if (!z) {
                    o00o0oo.resumeWith(o0000OO0.OooOooo(obj2));
                    break;
                } else {
                    o00o0oo.resumeWith(o00O0.o000OOo.OooO0O0(((o0000Ooo) obj2).f31507OooO00o));
                    break;
                }
        }
    }
}

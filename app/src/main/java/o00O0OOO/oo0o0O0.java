package o00O0oOo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o00OO000.OooOOOO;

/* loaded from: classes3.dex */
public abstract class oo0o0O0 extends OooOOOO implements o000OO00, o00O00OO {

    /* renamed from: OooOoO0 */
    public o00O f31578OooOoO0;

    public abstract boolean OooO();

    @Override // o00O0oOo.o00O00OO
    public final o00OO00O OooO0O0() {
        return null;
    }

    public final o00O OooO0oo() {
        o00O o00o = this.f31578OooOoO0;
        if (o00o != null) {
            return o00o;
        }
        OooOo.OooOO0o("job");
        throw null;
    }

    public abstract void OooOO0(Throwable th);

    @Override // o00O0oOo.o000OO00
    public final void dispose() {
        o00O o00oOooO0oo = OooO0oo();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o00O.f31521OooOo0O;
            Object obj = atomicReferenceFieldUpdater.get(o00oOooO0oo);
            if (obj instanceof oo0o0O0) {
                if (obj != this) {
                    return;
                }
                o000OOo0 o000ooo02 = o0000OO0.f31505OooOO0;
                while (!atomicReferenceFieldUpdater.compareAndSet(o00oOooO0oo, obj, o000ooo02)) {
                    if (atomicReferenceFieldUpdater.get(o00oOooO0oo) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof o00O00OO) || ((o00O00OO) obj).OooO0O0() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OooOOOO.f31947OooOo0O;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof o00OO000.o0OoOo0) {
                    OooOOOO oooOOOO = ((o00OO000.o0OoOo0) obj2).f31968OooO00o;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                OooOOOO oooOOOO2 = (OooOOOO) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = OooOOOO.f31946OooOo;
                o00OO000.o0OoOo0 o0oooo0 = (o00OO000.o0OoOo0) atomicReferenceFieldUpdater3.get(oooOOOO2);
                if (o0oooo0 == null) {
                    o0oooo0 = new o00OO000.o0OoOo0(oooOOOO2);
                    atomicReferenceFieldUpdater3.set(oooOOOO2, o0oooo0);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, o0oooo0)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                oooOOOO2.OooO0Oo();
                return;
            }
        }
    }

    public o00O0O00 getParent() {
        return OooO0oo();
    }

    @Override // o00O0oOo.o00O00OO
    public final boolean isActive() {
        return true;
    }

    @Override // o00OO000.OooOOOO
    public final String toString() {
        return getClass().getSimpleName() + '@' + o0000OO0.OooOOOo(this) + "[job@" + o0000OO0.OooOOOo(OooO0oo()) + ']';
    }
}

package o00O0oOo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class oo0oOO0 implements o00O00OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o00OO00O f31587OooOo0O;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31585OooOo0o = AtomicIntegerFieldUpdater.newUpdater(oo0oOO0.class, "_isCompleting$volatile");

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31584OooOo = AtomicReferenceFieldUpdater.newUpdater(oo0oOO0.class, Object.class, "_rootCause$volatile");

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31586OooOoO0 = AtomicReferenceFieldUpdater.newUpdater(oo0oOO0.class, Object.class, "_exceptionsHolder$volatile");

    public oo0oOO0(o00OO00O o00oo00o, Throwable th) {
        this.f31587OooOo0O = o00oo00o;
        this._rootCause$volatile = th;
    }

    public final void OooO00o(Throwable th) {
        Throwable thOooO0OO = OooO0OO();
        if (thOooO0OO == null) {
            f31584OooOo.set(this, th);
            return;
        }
        if (th == thOooO0OO) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31586OooOoO0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // o00O0oOo.o00O00OO
    public final o00OO00O OooO0O0() {
        return this.f31587OooOo0O;
    }

    public final Throwable OooO0OO() {
        return (Throwable) f31584OooOo.get(this);
    }

    public final boolean OooO0Oo() {
        return OooO0OO() != null;
    }

    public final ArrayList OooO0o0(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31586OooOoO0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thOooO0OO = OooO0OO();
        if (thOooO0OO != null) {
            arrayList.add(0, thOooO0OO);
        }
        if (th != null && !th.equals(thOooO0OO)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, o0000OO0.f31504OooO0oo);
        return arrayList;
    }

    @Override // o00O0oOo.o00O00OO
    public final boolean isActive() {
        return OooO0OO() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(OooO0Oo());
        sb.append(", completing=");
        sb.append(f31585OooOo0o.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(OooO0OO());
        sb.append(", exceptions=");
        sb.append(f31586OooOoO0.get(this));
        sb.append(", list=");
        sb.append(this.f31587OooOo0O);
        sb.append(']');
        return sb.toString();
    }
}

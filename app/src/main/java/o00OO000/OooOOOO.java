package o00OO000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o00O0oOo.o0000OO0;

/* loaded from: classes3.dex */
public class OooOOOO {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31947OooOo0O = AtomicReferenceFieldUpdater.newUpdater(OooOOOO.class, Object.class, "_next$volatile");

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31948OooOo0o = AtomicReferenceFieldUpdater.newUpdater(OooOOOO.class, Object.class, "_prev$volatile");

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31946OooOo = AtomicReferenceFieldUpdater.newUpdater(OooOOOO.class, Object.class, "_removedRef$volatile");

    public final boolean OooO0OO(OooOOOO oooOOOO, int i) {
        while (true) {
            OooOOOO oooOOOOOooO0Oo = OooO0Oo();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31948OooOo0o;
            if (oooOOOOOooO0Oo == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    oooOOOOOooO0Oo = (OooOOOO) obj;
                    if (!oooOOOOOooO0Oo.OooO0oO()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(oooOOOOOooO0Oo);
                }
            }
            if (oooOOOOOooO0Oo instanceof OooOOO0) {
                return (((OooOOO0) oooOOOOOooO0Oo).f31945OooOoO0 & i) == 0 && oooOOOOOooO0Oo.OooO0OO(oooOOOO, i);
            }
            atomicReferenceFieldUpdater.set(oooOOOO, oooOOOOOooO0Oo);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31947OooOo0O;
            atomicReferenceFieldUpdater2.set(oooOOOO, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(oooOOOOOooO0Oo, this, oooOOOO)) {
                if (atomicReferenceFieldUpdater2.get(oooOOOOOooO0Oo) != this) {
                    break;
                }
            }
            oooOOOO.OooO0o0(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((o00OO000.o0OoOo0) r6).f31968OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00OO000.OooOOOO OooO0Oo() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o00OO000.OooOOOO.f31948OooOo0o
            java.lang.Object r1 = r0.get(r9)
            o00OO000.OooOOOO r1 = (o00OO000.OooOOOO) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o00OO000.OooOOOO.f31947OooOo0O
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.OooO0oO()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof o00OO000.o0OoOo0
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            o00OO000.o0OoOo0 r6 = (o00OO000.o0OoOo0) r6
            o00OO000.OooOOOO r6 = r6.f31968OooO00o
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            o00OO000.OooOOOO r3 = (o00OO000.OooOOOO) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.OooOo.OooO0OO(r6, r4)
            r4 = r6
            o00OO000.OooOOOO r4 = (o00OO000.OooOOOO) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO000.OooOOOO.OooO0Oo():o00OO000.OooOOOO");
    }

    public final OooOOOO OooO0o() {
        OooOOOO oooOOOO;
        Object obj = f31947OooOo0O.get(this);
        o0OoOo0 o0oooo0 = obj instanceof o0OoOo0 ? (o0OoOo0) obj : null;
        if (o0oooo0 != null && (oooOOOO = o0oooo0.f31968OooO00o) != null) {
            return oooOOOO;
        }
        kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (OooOOOO) obj;
    }

    public final void OooO0o0(OooOOOO oooOOOO) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31948OooOo0o;
            OooOOOO oooOOOO2 = (OooOOOO) atomicReferenceFieldUpdater.get(oooOOOO);
            if (f31947OooOo0O.get(this) != oooOOOO) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(oooOOOO, oooOOOO2, this)) {
                if (atomicReferenceFieldUpdater.get(oooOOOO) != oooOOOO2) {
                    break;
                }
            }
            if (OooO0oO()) {
                oooOOOO.OooO0Oo();
                return;
            }
            return;
        }
    }

    public boolean OooO0oO() {
        return f31947OooOo0O.get(this) instanceof o0OoOo0;
    }

    public String toString() {
        return new OooOOO(this, o0000OO0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + o0000OO0.OooOOOo(this);
    }
}

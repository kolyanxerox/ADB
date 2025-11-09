package o00OO0O0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o00O0O0o.OooOo00;
import o00O0oOo.o0000OO0;
import o00O0oOo.oo0o0Oo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class OooO0o extends OooOOO0 implements OooO00o {

    /* renamed from: OooO0oO */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32024OooO0oO = AtomicReferenceFieldUpdater.newUpdater(OooO0o.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public OooO0o(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : OooO.f32019OooO00o;
    }

    public final boolean OooO0OO() {
        return Math.max(OooOOO0.f32036OooO0o.get(this), 0) == 0;
    }

    public final Object OooO0Oo(o00O0OO0.OooO0OO oooO0OO) {
        boolean zOooO0o0 = OooO0o0(null);
        OooOo oooOo = OooOo.f33195OooO00o;
        if (!zOooO0o0) {
            oo0o0Oo oo0o0ooOooOOo0 = o0000OO0.OooOOo0(Oooo0o0.OooO.OooOOOO(oooO0OO));
            try {
                OooO00o(new OooO0OO(this, oo0o0ooOooOOo0));
                Object objOooOOOo = oo0o0ooOooOOo0.OooOOOo();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (objOooOOOo != oooOo00) {
                    objOooOOOo = oooOo;
                }
                if (objOooOOOo == oooOo00) {
                    return objOooOOOo;
                }
            } catch (Throwable th) {
                oo0o0ooOooOOo0.OooOoO0();
                throw th;
            }
        }
        return oooOo;
    }

    public final void OooO0o(Object obj) {
        while (OooO0OO()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32024OooO0oO;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            o000O0O0.OooO0O0 oooO0O0 = OooO.f32019OooO00o;
            if (obj2 != oooO0O0) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, oooO0O0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    OooO0O0();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x001e, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0o0(java.lang.Object r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o00OO0O0.OooOOO0.f32036OooO0o
            int r1 = r0.get(r7)
            r2 = 1
            if (r1 <= r2) goto L16
        L9:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto L9
            goto L0
        L16:
            r3 = 2
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o00OO0O0.OooO0o.f32024OooO0oO
            if (r1 > 0) goto L3c
            if (r8 != 0) goto L20
        L1e:
            r0 = r2
            goto L48
        L20:
            boolean r0 = r7.OooO0OO()
            if (r0 != 0) goto L28
            r0 = r4
            goto L35
        L28:
            java.lang.Object r0 = r5.get(r7)
            o000O0O0.OooO0O0 r1 = o00OO0O0.OooO.f32019OooO00o
            if (r0 == r1) goto L20
            if (r0 != r8) goto L34
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            if (r0 == r2) goto L3a
            if (r0 == r3) goto L1e
            goto L0
        L3a:
            r0 = r3
            goto L48
        L3c:
            int r6 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r6)
            if (r0 == 0) goto L0
            r5.set(r7, r8)
            r0 = r4
        L48:
            if (r0 == 0) goto L6f
            if (r0 == r2) goto L6e
            if (r0 == r3) goto L56
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r8.<init>(r0)
            throw r8
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L6e:
            return r4
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO0O0.OooO0o.OooO0o0(java.lang.Object):boolean");
    }

    public final String toString() {
        return "Mutex@" + o0000OO0.OooOOOo(this) + "[isLocked=" + OooO0OO() + ",owner=" + f32024OooO0oO.get(this) + ']';
    }
}

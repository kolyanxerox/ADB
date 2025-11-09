package o00O0oo;

import OooO0oO.OooOo;
import kotlin.jvm.internal.o0OO00O;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public final class o000OOo0 extends o000O000 {

    /* renamed from: Oooo000, reason: collision with root package name */
    public final o0000oo f31629Oooo000;

    public o000OOo0(int i, o0000oo o0000ooVar) {
        super(i);
        this.f31629Oooo000 = o0000ooVar;
        if (o0000ooVar != o0000oo.f31602OooOo0O) {
            if (i < 1) {
                throw new IllegalArgumentException(OooOo.OooO0oO(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + o0OO00O.OooO00o(o000O000.class).OooO0OO() + " instead").toString());
        }
    }

    @Override // o00O0oo.o000O000, o00O0oo.o00O00
    public final Object OooO(Object obj) {
        return Oooo0o0(obj, false);
    }

    @Override // o00O0oo.o000O000, o00O0oo.o00O00
    public final Object OooOOO0(Object obj, OooO0OO oooO0OO) throws Throwable {
        if (Oooo0o0(obj, true) instanceof o000O0) {
            throw OooOo00();
        }
        return oo00o.OooOo.f33195OooO00o;
    }

    @Override // o00O0oo.o000O000
    public final boolean OooOoO() {
        return this.f31629Oooo000 == o0000oo.f31603OooOo0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Oooo0o0(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            o00O0oo.o0000oo r1 = o00O0oo.o0000oo.f31601OooOo
            oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
            o00O0oo.o0000oo r2 = r15.f31629Oooo000
            if (r2 != r1) goto L17
            java.lang.Object r1 = super.OooO(r16)
            boolean r2 = r1 instanceof o00O0oo.o000O0Oo
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof o00O0oo.o000O0
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            o000O0O0.OooO0O0 r6 = o00O0oo.o000Oo0.f31634OooO0Oo
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o00O0oo.o000O000.f31616OooOoOO
            java.lang.Object r1 = r1.get(r15)
            o00O0oo.o000O0O0 r1 = (o00O0oo.o000O0O0) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = o00O0oo.o000O000.f31613OooOo0o
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.OooOo0o(r2, r7)
            int r9 = o00O0oo.o000Oo0.f31632OooO0O0
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f31964OooOo
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            o00O0oo.o000O0O0 r2 = o00O0oo.o000O000.OooO0O0(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.OooOo00()
            o00O0oo.o000O0 r2 = new o00O0oo.o000O0
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = o00O0oo.o000O000.OooO0o0(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.OooO0O0()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = o00O0oo.o000O000.f31612OooOo
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.OooO0O0()
        L7e:
            java.lang.Throwable r1 = r15.OooOo00()
            o00O0oo.o000O0 r2 = new o00O0oo.o000O0
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.OooO()
            java.lang.Throwable r1 = r15.OooOo00()
            o00O0oo.o000O0 r2 = new o00O0oo.o000O0
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof o00O0oOo.o0oOOo
            if (r3 == 0) goto La6
            o00O0oOo.o0oOOo r6 = (o00O0oOo.o0oOOo) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.OooO0O0(r1, r12)
        Lae:
            long r3 = r1.f31964OooOo
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.OooOO0O(r3)
        Lb6:
            return r8
        Lb7:
            r1.OooO0O0()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000OOo0.Oooo0o0(java.lang.Object, boolean):java.lang.Object");
    }
}

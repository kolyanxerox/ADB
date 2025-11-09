package o00O0oo;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.OooOo;
import o000O0O0.OooO0O0;
import o00OO000.o00Ooo;

/* loaded from: classes3.dex */
public final class o000O0O0 extends o00Ooo {

    /* renamed from: OooOoO */
    public final o000O000 f31623OooOoO;

    /* renamed from: OooOoOO */
    public final /* synthetic */ AtomicReferenceArray f31624OooOoOO;

    public o000O0O0(long j, o000O0O0 o000o0o02, o000O000 o000o0002, int i) {
        super(j, o000o0o02, i);
        this.f31623OooOoO = o000o0002;
        this.f31624OooOoOO = new AtomicReferenceArray(o000Oo0.f31632OooO0O0 * 2);
    }

    @Override // o00OO000.o00Ooo
    public final int OooO0oO() {
        return o000Oo0.f31632OooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x005e, code lost:
    
        kotlin.jvm.internal.OooOo.OooO0O0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0059, code lost:
    
        OooOOO(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x005c, code lost:
    
        if (r0 == false) goto L124;
     */
    @Override // o00OO000.o00Ooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo(int r5, o00O0O0O.OooOOO0 r6) {
        /*
            r4 = this;
            int r6 = o00O0oo.o000Oo0.f31632OooO0O0
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f31624OooOoOO
            int r1 = r5 * 2
            r6.get(r1)
        L11:
            java.lang.Object r6 = r4.OooOO0o(r5)
            boolean r1 = r6 instanceof o00O0oOo.o0oOOo
            o00O0oo.o000O000 r2 = r4.f31623OooOoO
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof o00O0oo.o00O00O
            if (r1 == 0) goto L21
            goto L62
        L21:
            o000O0O0.OooO0O0 r1 = o00O0oo.o000Oo0.f31639OooOO0
            if (r6 == r1) goto L59
            o000O0O0.OooO0O0 r1 = o00O0oo.o000Oo0.f31640OooOO0O
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            o000O0O0.OooO0O0 r1 = o00O0oo.o000Oo0.f31637OooO0oO
            if (r6 == r1) goto L11
            o000O0O0.OooO0O0 r1 = o00O0oo.o000Oo0.f31635OooO0o
            if (r6 != r1) goto L33
            goto L11
        L33:
            o000O0O0.OooO0O0 r5 = o00O0oo.o000Oo0.f31630OooO
            if (r6 == r5) goto L7c
            o000O0O0.OooO0O0 r5 = o00O0oo.o000Oo0.f31634OooO0Oo
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            o000O0O0.OooO0O0 r5 = o00O0oo.o000Oo0.OooOO0o
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.OooOOO(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.OooOo.OooO0O0(r2)
            return
        L62:
            if (r0 == 0) goto L67
            o000O0O0.OooO0O0 r1 = o00O0oo.o000Oo0.f31639OooOO0
            goto L69
        L67:
            o000O0O0.OooO0O0 r1 = o00O0oo.o000Oo0.f31640OooOO0O
        L69:
            boolean r6 = r4.OooOO0O(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.OooOOO(r5, r3)
            r6 = r0 ^ 1
            r4.OooOOO0(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.OooOo.OooO0O0(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O0O0.OooO0oo(int, o00O0O0O.OooOOO0):void");
    }

    public final boolean OooOO0O(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f31624OooOoOO;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object OooOO0o(int i) {
        return this.f31624OooOoOO.get((i * 2) + 1);
    }

    public final void OooOOO(int i, Object obj) {
        this.f31624OooOoOO.set(i * 2, obj);
    }

    public final void OooOOO0(int i, boolean z) {
        if (z) {
            o000O000 o000o0002 = this.f31623OooOoO;
            OooOo.OooO0O0(o000o0002);
            o000o0002.Oooo0OO((this.f31964OooOo * o000Oo0.f31632OooO0O0) + i);
        }
        OooO();
    }

    public final void OooOOOO(int i, OooO0O0 oooO0O0) {
        this.f31624OooOoOO.set((i * 2) + 1, oooO0O0);
    }
}

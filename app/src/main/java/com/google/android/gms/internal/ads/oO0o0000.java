package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class oO0o0000 implements o00000O {

    /* renamed from: OooO, reason: collision with root package name */
    public final ooOOO00O f22727OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f22728OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final r40 f22729OooO0O0 = new r40(new byte[9400], 0);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final SparseIntArray f22730OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p80 f22731OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final SparseArray f22732OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o0O f22733OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final SparseBooleanArray f22734OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final SparseBooleanArray f22735OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public o00O0 f22736OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public o0000Ooo f22737OooOO0O;
    public boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f22738OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public boolean f22739OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f22740OooOOOO;

    public oO0o0000(o0O o0o, h70 h70Var, p80 p80Var) {
        this.f22731OooO0Oo = p80Var;
        this.f22733OooO0o0 = o0o;
        this.f22728OooO00o = Collections.singletonList(h70Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f22734OooO0oO = sparseBooleanArray;
        this.f22735OooO0oo = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f22732OooO0o = sparseArray;
        this.f22730OooO0OO = new SparseIntArray();
        this.f22727OooO = new ooOOO00O(1);
        this.f22737OooOO0O = o0000Ooo.f21682OooOO0;
        this.f22740OooOOOO = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f22732OooO0o.put(sparseArray2.keyAt(i), (InterfaceC1893oO) sparseArray2.valueAt(i));
        }
        this.f22732OooO0o.put(0, new oO0Oo0o0(new C2249xx(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.f22728OooO00o
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L38
            java.lang.Object r4 = r10.get(r1)
            com.google.android.gms.internal.ads.h70 r4 = (com.google.android.gms.internal.ads.h70) r4
            monitor-enter(r4)
            long r5 = r4.f19585OooO0O0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.OooO0Oo()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.OooO0o0(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            r10 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r10
        L38:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L43
            com.google.android.gms.internal.ads.o00O0 r10 = r9.f22736OooOO0
            if (r10 == 0) goto L43
            r10.OooO0O0(r12)
        L43:
            com.google.android.gms.internal.ads.r40 r10 = r9.f22729OooO0O0
            r10.OooO0oO(r0)
            android.util.SparseIntArray r10 = r9.f22730OooO0OO
            r10.clear()
        L4d:
            android.util.SparseArray r10 = r9.f22732OooO0o
            int r11 = r10.size()
            if (r0 >= r11) goto L61
            java.lang.Object r10 = r10.valueAt(r0)
            com.google.android.gms.internal.ads.oO r10 = (com.google.android.gms.internal.ads.InterfaceC1893oO) r10
            r10.zzc()
            int r0 = r0 + 1
            goto L4d
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0o0000.OooO0O0(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0OO(com.google.android.gms.internal.ads.o00000OO r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.r40 r0 = r6.f22729OooO0O0
            byte[] r0 = r0.f23745OooO00o
            com.google.android.gms.internal.ads.o000000 r7 = (com.google.android.gms.internal.ads.o000000) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.OooO0o(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.OooO(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0o0000.OooO0OO(com.google.android.gms.internal.ads.o00000OO):boolean");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        this.f22737OooOO0O = new de0(o0000ooo, this.f22733OooO0o0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028d  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r24, com.google.android.gms.internal.ads.o0000O00 r25) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0o0000.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* loaded from: classes2.dex */
public final class C2335e0 extends OooOOO0 {

    /* renamed from: OooOo */
    public final boolean f26455OooOo;

    /* renamed from: OooOoO */
    public final /* synthetic */ o0OOO0OO f26456OooOoO;

    /* renamed from: OooOoO0 */
    public final boolean f26457OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335e0(o0OOO0OO o0ooo0oo, boolean z, boolean z2) {
        super("log");
        Objects.requireNonNull(o0ooo0oo);
        this.f26456OooOoO = o0ooo0oo;
        this.f26455OooOo = z;
        this.f26457OooOoO0 = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    @Override // com.google.android.gms.internal.measurement.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.Oooo0 OooO00o(com.google.android.gms.internal.ads.C2051sk r14, java.util.List r15) {
        /*
            r13 = this;
            java.lang.String r0 = "log"
            r1 = 1
            o00O0.o000OOo.OooOOOO(r0, r15, r1)
            int r0 = r15.size()
            com.google.android.gms.internal.measurement.o00Oo0 r2 = com.google.android.gms.internal.measurement.Oooo0.OooOO0o
            r3 = 0
            com.google.android.gms.internal.measurement.o0OOO0OO r4 = r13.f26456OooOoO
            if (r0 != r1) goto L33
            java.lang.Object r15 = r15.get(r3)
            com.google.android.gms.internal.measurement.Oooo0 r15 = (com.google.android.gms.internal.measurement.Oooo0) r15
            java.lang.Object r0 = r14.f24096OooOo
            com.google.android.gms.internal.measurement.oo000o r0 = (com.google.android.gms.internal.measurement.oo000o) r0
            com.google.android.gms.internal.measurement.Oooo0 r14 = r0.OooO0OO(r14, r15)
            java.lang.String r7 = r14.zzc()
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            java.lang.Object r14 = r4.f26566OooOoO0
            r5 = r14
            o000Ooo0.OooOO0 r5 = (o000Ooo0.OooOO0) r5
            boolean r9 = r13.f26455OooOo
            boolean r10 = r13.f26457OooOoO0
            r6 = 3
            r5.OooOO0O(r6, r7, r8, r9, r10)
            return r2
        L33:
            java.lang.Object r0 = r15.get(r3)
            com.google.android.gms.internal.measurement.Oooo0 r0 = (com.google.android.gms.internal.measurement.Oooo0) r0
            java.lang.Object r3 = r14.f24096OooOo
            com.google.android.gms.internal.measurement.oo000o r3 = (com.google.android.gms.internal.measurement.oo000o) r3
            com.google.android.gms.internal.measurement.Oooo0 r0 = r3.OooO0OO(r14, r0)
            java.lang.Double r0 = r0.zzd()
            double r5 = r0.doubleValue()
            int r0 = o00O0.o000OOo.OooOo00(r5)
            r3 = 5
            r5 = 2
            if (r0 == r5) goto L61
            r6 = 3
            if (r0 == r6) goto L5f
            if (r0 == r3) goto L5d
            r7 = 6
            if (r0 == r7) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            r8 = r5
            goto L63
        L5d:
            r8 = r3
            goto L63
        L5f:
            r8 = r1
            goto L63
        L61:
            r6 = 4
            goto L59
        L63:
            java.lang.Object r0 = r15.get(r1)
            com.google.android.gms.internal.measurement.Oooo0 r0 = (com.google.android.gms.internal.measurement.Oooo0) r0
            java.lang.Object r1 = r14.f24096OooOo
            com.google.android.gms.internal.measurement.oo000o r1 = (com.google.android.gms.internal.measurement.oo000o) r1
            com.google.android.gms.internal.measurement.Oooo0 r0 = r1.OooO0OO(r14, r0)
            java.lang.String r9 = r0.zzc()
            int r0 = r15.size()
            if (r0 != r5) goto L8a
            java.util.List r10 = java.util.Collections.EMPTY_LIST
            java.lang.Object r14 = r4.f26566OooOoO0
            r7 = r14
            o000Ooo0.OooOO0 r7 = (o000Ooo0.OooOO0) r7
            boolean r11 = r13.f26455OooOo
            boolean r12 = r13.f26457OooOoO0
            r7.OooOO0O(r8, r9, r10, r11, r12)
            return r2
        L8a:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L8f:
            int r0 = r15.size()
            int r0 = java.lang.Math.min(r0, r3)
            if (r5 >= r0) goto Lad
            java.lang.Object r0 = r15.get(r5)
            com.google.android.gms.internal.measurement.Oooo0 r0 = (com.google.android.gms.internal.measurement.Oooo0) r0
            com.google.android.gms.internal.measurement.Oooo0 r0 = r1.OooO0OO(r14, r0)
            java.lang.String r0 = r0.zzc()
            r10.add(r0)
            int r5 = r5 + 1
            goto L8f
        Lad:
            java.lang.Object r14 = r4.f26566OooOoO0
            r7 = r14
            o000Ooo0.OooOO0 r7 = (o000Ooo0.OooOO0) r7
            boolean r11 = r13.f26455OooOo
            boolean r12 = r13.f26457OooOoO0
            r7.OooOO0O(r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2335e0.OooO00o(com.google.android.gms.internal.ads.sk, java.util.List):com.google.android.gms.internal.measurement.Oooo0");
    }
}

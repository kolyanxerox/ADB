package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Random;

/* loaded from: classes2.dex */
public final class j61 {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final Random f20203OooO0oo = new Random();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public m61 f20207OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f20208OooO0o;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2045se f20204OooO00o = new C2045se();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1528ee f20205OooO0O0 = new C1528ee();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f20206OooO0OO = new HashMap();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public AbstractC1787lf f20209OooO0o0 = AbstractC1787lf.f20867OooO00o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f20210OooO0oO = -1;

    public final synchronized String OooO00o(AbstractC1787lf abstractC1787lf, h91 h91Var) {
        return OooO0OO(abstractC1787lf.OooOOO(h91Var.f19657OooO00o, this.f20205OooO0O0).f18576OooO0OO, h91Var).f19962OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x0021, B:16:0x002d, B:18:0x0033, B:20:0x003f, B:22:0x0045, B:15:0x0028, B:27:0x004f, B:29:0x005b, B:30:0x005f, B:32:0x0064, B:34:0x006a, B:36:0x007f, B:37:0x00a9, B:39:0x00ad, B:40:0x00af, B:42:0x00b9, B:44:0x00bd, B:46:0x00ca, B:49:0x00d1, B:55:0x00f0), top: B:58:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x0021, B:16:0x002d, B:18:0x0033, B:20:0x003f, B:22:0x0045, B:15:0x0028, B:27:0x004f, B:29:0x005b, B:30:0x005f, B:32:0x0064, B:34:0x006a, B:36:0x007f, B:37:0x00a9, B:39:0x00ad, B:40:0x00af, B:42:0x00b9, B:44:0x00bd, B:46:0x00ca, B:49:0x00d1, B:55:0x00f0), top: B:58:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void OooO0O0(com.google.android.gms.internal.ads.d61 r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j61.OooO0O0(com.google.android.gms.internal.ads.d61):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.i61 OooO0OO(int r18, com.google.android.gms.internal.ads.h91 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap r3 = r0.f20206OooO0OO
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.ads.i61 r8 = (com.google.android.gms.internal.ads.i61) r8
            long r9 = r8.f19964OooO0OO
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L52
            int r9 = r8.f19963OooO0O0
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            com.google.android.gms.internal.ads.j61 r9 = r8.f19968OooO0oO
            java.util.HashMap r10 = r9.f20206OooO0OO
            java.lang.String r13 = r9.f20208OooO0o
            java.lang.Object r10 = r10.get(r13)
            com.google.android.gms.internal.ads.i61 r10 = (com.google.android.gms.internal.ads.i61) r10
            if (r10 == 0) goto L45
            long r13 = r10.f19964OooO0OO
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f20210OooO0oO
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f19660OooO0Oo
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L52
            r8.f19964OooO0OO = r9
        L52:
            com.google.android.gms.internal.ads.h91 r9 = r8.f19965OooO0Oo
            if (r2 != 0) goto L5c
            int r10 = r8.f19963OooO0O0
            if (r1 != r10) goto L16
            r15 = r11
            goto L81
        L5c:
            long r13 = r2.f19660OooO0Oo
            if (r9 != 0) goto L6e
            boolean r10 = r2.OooO0O0()
            if (r10 != 0) goto L16
            r15 = r11
            long r11 = r8.f19964OooO0OO
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L81
        L6e:
            r15 = r11
            long r10 = r9.f19660OooO0Oo
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L16
            int r10 = r2.f19658OooO0O0
            int r11 = r9.f19658OooO0O0
            if (r10 != r11) goto L16
            int r10 = r2.f19659OooO0OO
            int r11 = r9.f19659OooO0OO
            if (r10 != r11) goto L16
        L81:
            long r10 = r8.f19964OooO0OO
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 >= 0) goto L8c
            goto L99
        L8c:
            if (r12 != 0) goto L16
            int r10 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            com.google.android.gms.internal.ads.h91 r10 = r7.f19965OooO0Oo
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r7 = r8
            goto L16
        L99:
            r7 = r8
            r5 = r10
            goto L16
        L9d:
            if (r7 != 0) goto Lb7
            r4 = 12
            byte[] r4 = new byte[r4]
            java.util.Random r5 = com.google.android.gms.internal.ads.j61.f20203OooO0oo
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            com.google.android.gms.internal.ads.i61 r5 = new com.google.android.gms.internal.ads.i61
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lb7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j61.OooO0OO(int, com.google.android.gms.internal.ads.h91):com.google.android.gms.internal.ads.i61");
    }

    public final void OooO0Oo(i61 i61Var) {
        long j = i61Var.f19964OooO0OO;
        if (j != -1) {
            this.f20210OooO0oO = j;
        }
        this.f20208OooO0o = null;
    }

    public final void OooO0o0(d61 d61Var) {
        h91 h91Var;
        boolean zOooOOOO = d61Var.f18179OooO0O0.OooOOOO();
        HashMap map = this.f20206OooO0OO;
        if (zOooOOOO) {
            String str = this.f20208OooO0o;
            if (str != null) {
                i61 i61Var = (i61) map.get(str);
                i61Var.getClass();
                OooO0Oo(i61Var);
                return;
            }
            return;
        }
        i61 i61Var2 = (i61) map.get(this.f20208OooO0o);
        int i = d61Var.f18180OooO0OO;
        h91 h91Var2 = d61Var.f18181OooO0Oo;
        this.f20208OooO0o = OooO0OO(i, h91Var2).f19962OooO00o;
        OooO0O0(d61Var);
        if (h91Var2 == null || !h91Var2.OooO0O0()) {
            return;
        }
        long j = h91Var2.f19660OooO0Oo;
        if (i61Var2 != null && i61Var2.f19964OooO0OO == j && (h91Var = i61Var2.f19965OooO0Oo) != null && h91Var.f19658OooO0O0 == h91Var2.f19658OooO0O0 && h91Var.f19659OooO0OO == h91Var2.f19659OooO0OO) {
            return;
        }
        OooO0OO(i, new h91(h91Var2.f19657OooO00o, j));
    }
}

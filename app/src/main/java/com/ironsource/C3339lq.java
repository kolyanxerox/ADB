package com.ironsource;

import java.util.Arrays;

/* renamed from: com.ironsource.lq */
/* loaded from: classes2.dex */
public final class C3339lq {

    /* renamed from: a */
    private boolean f9421a;

    /* renamed from: b */
    private String f9422b;

    /* renamed from: c */
    private boolean f9423c;

    /* renamed from: d */
    private int f9424d;

    /* renamed from: e */
    private int[] f9425e;

    /* renamed from: f */
    private int[] f9426f;

    public C3339lq() {
        this(false, null, false, 0, null, null, 63, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C3339lq m9865a(C3339lq c3339lq, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c3339lq.f9421a;
        }
        if ((i2 & 2) != 0) {
            str = c3339lq.f9422b;
        }
        if ((i2 & 4) != 0) {
            z2 = c3339lq.f9423c;
        }
        if ((i2 & 8) != 0) {
            i = c3339lq.f9424d;
        }
        if ((i2 & 16) != 0) {
            iArr = c3339lq.f9425e;
        }
        if ((i2 & 32) != 0) {
            iArr2 = c3339lq.f9426f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c3339lq.m9866a(z, str, z2, i, iArr3, iArr4);
    }

    /* renamed from: b */
    public final String m9872b() {
        return this.f9422b;
    }

    /* renamed from: c */
    public final boolean m9875c() {
        return this.f9423c;
    }

    /* renamed from: d */
    public final int m9876d() {
        return this.f9424d;
    }

    /* renamed from: e */
    public final int[] m9877e() {
        return this.f9425e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3339lq)) {
            return false;
        }
        C3339lq c3339lq = (C3339lq) obj;
        return this.f9421a == c3339lq.f9421a && kotlin.jvm.internal.OooOo.OooO00o(this.f9422b, c3339lq.f9422b) && this.f9423c == c3339lq.f9423c && this.f9424d == c3339lq.f9424d && kotlin.jvm.internal.OooOo.OooO00o(this.f9425e, c3339lq.f9425e) && kotlin.jvm.internal.OooOo.OooO00o(this.f9426f, c3339lq.f9426f);
    }

    /* renamed from: f */
    public final int[] m9878f() {
        return this.f9426f;
    }

    /* renamed from: g */
    public final boolean m9879g() {
        return this.f9423c;
    }

    /* renamed from: h */
    public final int m9880h() {
        return this.f9424d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.f9421a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iOooO0O0 = androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(r0 * 31, 31, this.f9422b);
        boolean z2 = this.f9423c;
        int iOooO00o = androidx.datastore.preferences.protobuf.OooO00o.OooO00o(this.f9424d, (iOooO0O0 + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31);
        int[] iArr = this.f9425e;
        int iHashCode = (iOooO00o + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f9426f;
        return iHashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    /* renamed from: i */
    public final boolean m9881i() {
        return this.f9421a;
    }

    /* renamed from: j */
    public final String m9882j() {
        return this.f9422b;
    }

    /* renamed from: k */
    public final int[] m9883k() {
        return this.f9426f;
    }

    /* renamed from: l */
    public final int[] m9884l() {
        return this.f9425e;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f9421a + ", pixelEventsUrl=" + this.f9422b + ", pixelEventsCompression=" + this.f9423c + ", pixelEventsCompressionLevel=" + this.f9424d + ", pixelOptOut=" + Arrays.toString(this.f9425e) + ", pixelOptIn=" + Arrays.toString(this.f9426f) + ')';
    }

    public C3339lq(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.OooOo.OooO0o0(pixelEventsUrl, "pixelEventsUrl");
        this.f9421a = z;
        this.f9422b = pixelEventsUrl;
        this.f9423c = z2;
        this.f9424d = i;
        this.f9425e = iArr;
        this.f9426f = iArr2;
    }

    /* renamed from: a */
    public final C3339lq m9866a(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.OooOo.OooO0o0(pixelEventsUrl, "pixelEventsUrl");
        return new C3339lq(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    /* renamed from: b */
    public final void m9873b(boolean z) {
        this.f9421a = z;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C3339lq(boolean r2, java.lang.String r3, boolean r4, int r5, int[] r6, int[] r7, int r8, kotlin.jvm.internal.OooOO0O r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            java.lang.String r3 = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=3"
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = 0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = -1
        L15:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3339lq.<init>(boolean, java.lang.String, boolean, int, int[], int[], int, kotlin.jvm.internal.OooOO0O):void");
    }

    /* renamed from: a */
    public final void m9867a(int i) {
        this.f9424d = i;
    }

    /* renamed from: b */
    public final void m9874b(int[] iArr) {
        this.f9425e = iArr;
    }

    /* renamed from: a */
    public final void m9868a(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f9422b = str;
    }

    /* renamed from: a */
    public final void m9869a(boolean z) {
        this.f9423c = z;
    }

    /* renamed from: a */
    public final void m9870a(int[] iArr) {
        this.f9426f = iArr;
    }

    /* renamed from: a */
    public final boolean m9871a() {
        return this.f9421a;
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ea1 extends AbstractC1787lf {

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f18539OooO0oO = new Object();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f18540OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f18541OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f18542OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final oO000Oo0 f18543OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C1550f f18544OooO0o0;

    static {
        pm0 pm0Var = rm0.f23913OooOo0o;
        gn0 gn0Var = gn0.f19388OooOoO;
        List list = Collections.EMPTY_LIST;
        gn0 gn0Var2 = gn0.f19388OooOoO;
        oOO00000 ooo00000 = oOO00000.f22776OooO00o;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new oO00o00O(uri, gn0Var2);
        }
        new o0O0O0Oo();
        C1626h1 c1626h1 = C1626h1.f19498OooOoO;
    }

    public ea1(long j, long j2, boolean z, C1550f c1550f, oO000Oo0 oo000oo0) {
        this.f18540OooO0O0 = j;
        this.f18541OooO0OO = j2;
        this.f18542OooO0Oo = z;
        c1550f.getClass();
        this.f18544OooO0o0 = c1550f;
        this.f18543OooO0o = oo000oo0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO00o(Object obj) {
        return f18539OooO0oO.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO0O0() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO0OO() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final C1528ee OooO0Oo(int i, C1528ee c1528ee, boolean z) {
        af0.OooOOO0(i, 1);
        Object obj = z ? f18539OooO0oO : null;
        C2145v3 c2145v3 = C2145v3.f24840OooO0O0;
        c1528ee.OooO0O0(null, obj, 0, this.f18540OooO0O0, false);
        return c1528ee;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final Object OooO0o(int i) {
        af0.OooOOO0(i, 1);
        return f18539OooO0oO;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final C2045se OooO0o0(int i, C2045se c2045se, long j) {
        af0.OooOOO0(i, 1);
        Object obj = C2045se.f24068OooOOO0;
        c2045se.OooO00o(this.f18544OooO0o0, this.f18542OooO0Oo, false, this.f18543OooO0o, this.f18541OooO0OO);
        return c2045se;
    }
}

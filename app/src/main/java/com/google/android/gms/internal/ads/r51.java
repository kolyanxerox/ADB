package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes2.dex */
public final class r51 {

    /* renamed from: OooOo00, reason: collision with root package name */
    public static final h91 f23754OooOo00 = new h91(new Object(), -1);

    /* renamed from: OooO, reason: collision with root package name */
    public final ab1 f23755OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC1787lf f23756OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final h91 f23757OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f23758OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f23759OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final l41 f23760OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f23761OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f23762OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ha1 f23763OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final List f23764OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final h91 f23765OooOO0O;
    public final boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final int f23766OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final int f23767OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final C2260y7 f23768OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public volatile long f23769OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public volatile long f23770OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public volatile long f23771OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public volatile long f23772OooOOoo;

    public r51(AbstractC1787lf abstractC1787lf, h91 h91Var, long j, long j2, int i, l41 l41Var, boolean z, ha1 ha1Var, ab1 ab1Var, List list, h91 h91Var2, boolean z2, int i2, int i3, C2260y7 c2260y7, long j3, long j4, long j5, long j6) {
        this.f23756OooO00o = abstractC1787lf;
        this.f23757OooO0O0 = h91Var;
        this.f23758OooO0OO = j;
        this.f23759OooO0Oo = j2;
        this.f23761OooO0o0 = i;
        this.f23760OooO0o = l41Var;
        this.f23762OooO0oO = z;
        this.f23763OooO0oo = ha1Var;
        this.f23755OooO = ab1Var;
        this.f23764OooOO0 = list;
        this.f23765OooOO0O = h91Var2;
        this.OooOO0o = z2;
        this.f23767OooOOO0 = i2;
        this.f23766OooOOO = i3;
        this.f23768OooOOOO = c2260y7;
        this.f23769OooOOOo = j3;
        this.f23771OooOOo0 = j4;
        this.f23770OooOOo = j5;
        this.f23772OooOOoo = j6;
    }

    public static r51 OooO0oO(ab1 ab1Var) {
        C1970qd c1970qd = AbstractC1787lf.f20867OooO00o;
        h91 h91Var = f23754OooOo00;
        return new r51(c1970qd, h91Var, -9223372036854775807L, 0L, 1, null, false, ha1.f19673OooO0Oo, ab1Var, gn0.f19388OooOoO, h91Var, false, 1, 0, C2260y7.f25859OooO0Oo, 0L, 0L, 0L, 0L);
    }

    public final r51 OooO00o(h91 h91Var) {
        return new r51(this.f23756OooO00o, this.f23757OooO0O0, this.f23758OooO0OO, this.f23759OooO0Oo, this.f23761OooO0o0, this.f23760OooO0o, this.f23762OooO0oO, this.f23763OooO0oo, this.f23755OooO, this.f23764OooOO0, h91Var, this.OooOO0o, this.f23767OooOOO0, this.f23766OooOOO, this.f23768OooOOOO, this.f23769OooOOOo, this.f23771OooOOo0, this.f23770OooOOo, this.f23772OooOOoo);
    }

    public final r51 OooO0O0(h91 h91Var, long j, long j2, long j3, long j4, ha1 ha1Var, ab1 ab1Var, List list) {
        h91 h91Var2 = this.f23765OooOO0O;
        boolean z = this.OooOO0o;
        int i = this.f23767OooOOO0;
        int i2 = this.f23766OooOOO;
        C2260y7 c2260y7 = this.f23768OooOOOO;
        long j5 = this.f23769OooOOOo;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new r51(this.f23756OooO00o, h91Var, j2, j3, this.f23761OooO0o0, this.f23760OooO0o, this.f23762OooO0oO, ha1Var, ab1Var, list, h91Var2, z, i, i2, c2260y7, j5, j4, j, jElapsedRealtime);
    }

    public final r51 OooO0OO(int i, int i2, boolean z) {
        return new r51(this.f23756OooO00o, this.f23757OooO0O0, this.f23758OooO0OO, this.f23759OooO0Oo, this.f23761OooO0o0, this.f23760OooO0o, this.f23762OooO0oO, this.f23763OooO0oo, this.f23755OooO, this.f23764OooOO0, this.f23765OooOO0O, z, i, i2, this.f23768OooOOOO, this.f23769OooOOOo, this.f23771OooOOo0, this.f23770OooOOo, this.f23772OooOOoo);
    }

    public final r51 OooO0Oo(l41 l41Var) {
        return new r51(this.f23756OooO00o, this.f23757OooO0O0, this.f23758OooO0OO, this.f23759OooO0Oo, this.f23761OooO0o0, l41Var, this.f23762OooO0oO, this.f23763OooO0oo, this.f23755OooO, this.f23764OooOO0, this.f23765OooOO0O, this.OooOO0o, this.f23767OooOOO0, this.f23766OooOOO, this.f23768OooOOOO, this.f23769OooOOOo, this.f23771OooOOo0, this.f23770OooOOo, this.f23772OooOOoo);
    }

    public final r51 OooO0o(AbstractC1787lf abstractC1787lf) {
        return new r51(abstractC1787lf, this.f23757OooO0O0, this.f23758OooO0OO, this.f23759OooO0Oo, this.f23761OooO0o0, this.f23760OooO0o, this.f23762OooO0oO, this.f23763OooO0oo, this.f23755OooO, this.f23764OooOO0, this.f23765OooOO0O, this.OooOO0o, this.f23767OooOOO0, this.f23766OooOOO, this.f23768OooOOOO, this.f23769OooOOOo, this.f23771OooOOo0, this.f23770OooOOo, this.f23772OooOOoo);
    }

    public final r51 OooO0o0(int i) {
        return new r51(this.f23756OooO00o, this.f23757OooO0O0, this.f23758OooO0OO, this.f23759OooO0Oo, i, this.f23760OooO0o, this.f23762OooO0oO, this.f23763OooO0oo, this.f23755OooO, this.f23764OooOO0, this.f23765OooOO0O, this.OooOO0o, this.f23767OooOOO0, this.f23766OooOOO, this.f23768OooOOOO, this.f23769OooOOOo, this.f23771OooOOo0, this.f23770OooOOo, this.f23772OooOOoo);
    }

    public final boolean OooO0oo() {
        return this.f23761OooO0o0 == 3 && this.OooOO0o && this.f23766OooOOO == 0;
    }
}

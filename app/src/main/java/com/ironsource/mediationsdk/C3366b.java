package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C3407s;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.mediationsdk.b */
/* loaded from: classes2.dex */
final class C3366b {

    /* renamed from: a */
    private final C3407s.d f9583a;

    /* renamed from: b */
    private final boolean f9584b;

    /* renamed from: c */
    private final boolean f9585c;

    /* renamed from: d */
    private final boolean f9586d;

    public C3366b(C3407s.d sdkState, boolean z, boolean z2, boolean z3) {
        OooOo.OooO0o0(sdkState, "sdkState");
        this.f9583a = sdkState;
        this.f9584b = z;
        this.f9585c = z2;
        this.f9586d = z3;
    }

    /* renamed from: a */
    public static /* synthetic */ C3366b m10062a(C3366b c3366b, C3407s.d dVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = c3366b.f9583a;
        }
        if ((i & 2) != 0) {
            z = c3366b.f9584b;
        }
        if ((i & 4) != 0) {
            z2 = c3366b.f9585c;
        }
        if ((i & 8) != 0) {
            z3 = c3366b.f9586d;
        }
        return c3366b.m10063a(dVar, z, z2, z3);
    }

    /* renamed from: b */
    public final boolean m10065b() {
        return this.f9584b;
    }

    /* renamed from: c */
    public final boolean m10066c() {
        return this.f9585c;
    }

    /* renamed from: d */
    public final boolean m10067d() {
        return this.f9586d;
    }

    /* renamed from: e */
    public final C3407s.d m10068e() {
        return this.f9583a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3366b)) {
            return false;
        }
        C3366b c3366b = (C3366b) obj;
        return this.f9583a == c3366b.f9583a && this.f9584b == c3366b.f9584b && this.f9585c == c3366b.f9585c && this.f9586d == c3366b.f9586d;
    }

    /* renamed from: f */
    public final boolean m10069f() {
        return this.f9586d;
    }

    /* renamed from: g */
    public final boolean m10070g() {
        return this.f9585c;
    }

    /* renamed from: h */
    public final boolean m10071h() {
        return this.f9584b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f9583a.hashCode() * 31;
        boolean z = this.f9584b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.f9585c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f9586d;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdUnitInitStateInfo(sdkState=");
        sb.append(this.f9583a);
        sb.append(", isRetryForMoreThan15Secs=");
        sb.append(this.f9584b);
        sb.append(", isDemandOnlyInitRequested=");
        sb.append(this.f9585c);
        sb.append(", isAdUnitInitRequested=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f9586d, ')');
    }

    /* renamed from: a */
    public final C3366b m10063a(C3407s.d sdkState, boolean z, boolean z2, boolean z3) {
        OooOo.OooO0o0(sdkState, "sdkState");
        return new C3366b(sdkState, z, z2, z3);
    }

    /* renamed from: a */
    public final C3407s.d m10064a() {
        return this.f9583a;
    }
}

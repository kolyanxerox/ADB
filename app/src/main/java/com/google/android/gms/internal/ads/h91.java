package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class h91 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f19657OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f19658OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f19659OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19660OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f19661OooO0o0;

    public h91(Object obj, int i, int i2, long j, int i3) {
        this.f19657OooO00o = obj;
        this.f19658OooO0O0 = i;
        this.f19659OooO0OO = i2;
        this.f19660OooO0Oo = j;
        this.f19661OooO0o0 = i3;
    }

    public final h91 OooO00o(Object obj) {
        return this.f19657OooO00o.equals(obj) ? this : new h91(obj, this.f19658OooO0O0, this.f19659OooO0OO, this.f19660OooO0Oo, this.f19661OooO0o0);
    }

    public final boolean OooO0O0() {
        return this.f19658OooO0O0 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h91)) {
            return false;
        }
        h91 h91Var = (h91) obj;
        return this.f19657OooO00o.equals(h91Var.f19657OooO00o) && this.f19658OooO0O0 == h91Var.f19658OooO0O0 && this.f19659OooO0OO == h91Var.f19659OooO0OO && this.f19660OooO0Oo == h91Var.f19660OooO0Oo && this.f19661OooO0o0 == h91Var.f19661OooO0o0;
    }

    public final int hashCode() {
        return ((((((((this.f19657OooO00o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19658OooO0O0) * 31) + this.f19659OooO0OO) * 31) + ((int) this.f19660OooO0Oo)) * 31) + this.f19661OooO0o0;
    }

    public h91(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public h91(Object obj, int i, long j) {
        this(obj, -1, -1, j, i);
    }
}

package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class o000O00O {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000O00O f21696OooO0OO = new o000O00O(0, 0);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f21697OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f21698OooO0O0;

    public o000O00O(long j, long j2) {
        this.f21697OooO00o = j;
        this.f21698OooO0O0 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o000O00O.class == obj.getClass()) {
            o000O00O o000o00o2 = (o000O00O) obj;
            if (this.f21697OooO00o == o000o00o2.f21697OooO00o && this.f21698OooO0O0 == o000o00o2.f21698OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f21697OooO00o) * 31) + ((int) this.f21698OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f21697OooO00o);
        sb.append(", position=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f21698OooO0O0, C3034d9.i.f8179e);
    }
}

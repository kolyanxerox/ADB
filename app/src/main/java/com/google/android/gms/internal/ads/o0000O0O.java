package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0000O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f21669OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f21670OooO0O0;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public o0000O0O(String str, String str2) {
        this.f21669OooO00o = i80.OooO00o(str);
        this.f21670OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0000O0O.class == obj.getClass()) {
            o0000O0O o0000o0o2 = (o0000O0O) obj;
            if (Objects.equals(this.f21669OooO00o, o0000o0o2.f21669OooO00o) && Objects.equals(this.f21670OooO0O0, o0000o0o2.f21670OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f21670OooO0O0.hashCode() * 31;
        String str = this.f21669OooO00o;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}

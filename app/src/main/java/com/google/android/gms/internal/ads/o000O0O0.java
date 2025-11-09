package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o000O0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f21699OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f21700OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f21701OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f21702OooO0Oo;

    public o000O0O0(int i, byte[] bArr, int i2, int i3) {
        this.f21699OooO00o = i;
        this.f21700OooO0O0 = bArr;
        this.f21701OooO0OO = i2;
        this.f21702OooO0Oo = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o000O0O0.class == obj.getClass()) {
            o000O0O0 o000o0o02 = (o000O0O0) obj;
            if (this.f21699OooO00o == o000o0o02.f21699OooO00o && this.f21701OooO0OO == o000o0o02.f21701OooO0OO && this.f21702OooO0Oo == o000o0o02.f21702OooO0Oo && Arrays.equals(this.f21700OooO0O0, o000o0o02.f21700OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f21700OooO0O0) + (this.f21699OooO00o * 31)) * 31) + this.f21701OooO0OO) * 31) + this.f21702OooO0Oo;
    }
}

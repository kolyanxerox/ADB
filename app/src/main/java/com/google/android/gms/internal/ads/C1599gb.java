package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.gb */
/* loaded from: classes2.dex */
public final class C1599gb {

    /* renamed from: OooO */
    public final int f19288OooO;

    /* renamed from: OooO00o */
    public final Object f19289OooO00o;

    /* renamed from: OooO0O0 */
    public final int f19290OooO0O0;

    /* renamed from: OooO0OO */
    public final C1550f f19291OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f19292OooO0Oo;

    /* renamed from: OooO0o */
    public final long f19293OooO0o;

    /* renamed from: OooO0o0 */
    public final int f19294OooO0o0;

    /* renamed from: OooO0oO */
    public final long f19295OooO0oO;

    /* renamed from: OooO0oo */
    public final int f19296OooO0oo;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C1599gb(Object obj, int i, C1550f c1550f, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f19289OooO00o = obj;
        this.f19290OooO0O0 = i;
        this.f19291OooO0OO = c1550f;
        this.f19292OooO0Oo = obj2;
        this.f19294OooO0o0 = i2;
        this.f19293OooO0o = j;
        this.f19295OooO0oO = j2;
        this.f19296OooO0oo = i3;
        this.f19288OooO = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1599gb.class == obj.getClass()) {
            C1599gb c1599gb = (C1599gb) obj;
            if (this.f19290OooO0O0 == c1599gb.f19290OooO0O0 && this.f19294OooO0o0 == c1599gb.f19294OooO0o0 && this.f19293OooO0o == c1599gb.f19293OooO0o && this.f19295OooO0oO == c1599gb.f19295OooO0oO && this.f19296OooO0oo == c1599gb.f19296OooO0oo && this.f19288OooO == c1599gb.f19288OooO && ii0.OooOOoo(this.f19291OooO0OO, c1599gb.f19291OooO0OO) && ii0.OooOOoo(this.f19289OooO00o, c1599gb.f19289OooO00o) && ii0.OooOOoo(this.f19292OooO0Oo, c1599gb.f19292OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19289OooO00o, Integer.valueOf(this.f19290OooO0O0), this.f19291OooO0OO, this.f19292OooO0Oo, Integer.valueOf(this.f19294OooO0o0), Long.valueOf(this.f19293OooO0o), Long.valueOf(this.f19295OooO0oO), Integer.valueOf(this.f19296OooO0oo), Integer.valueOf(this.f19288OooO)});
    }
}

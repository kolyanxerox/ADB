package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qk */
/* loaded from: classes2.dex */
public final class C1977qk {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final C1977qk f23622OooO0O0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final rm0 f23623OooO00o;

    static {
        pm0 pm0Var = rm0.f23913OooOo0o;
        f23622OooO0O0 = new C1977qk(gn0.f19388OooOoO);
        Integer.toString(0, 36);
    }

    public C1977qk(rm0 rm0Var) {
        this.f23623OooO00o = rm0.OooOOOO(rm0Var);
    }

    public final boolean OooO00o(int i) {
        int i2 = 0;
        while (true) {
            rm0 rm0Var = this.f23623OooO00o;
            if (i2 >= rm0Var.size()) {
                return false;
            }
            C1461ck c1461ck = (C1461ck) rm0Var.get(i2);
            boolean[] zArr = c1461ck.f18008OooO0o0;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (c1461ck.f18005OooO0O0.f17494OooO0OO == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1977qk.class != obj.getClass()) {
            return false;
        }
        return this.f23623OooO00o.equals(((C1977qk) obj).f23623OooO00o);
    }

    public final int hashCode() {
        return this.f23623OooO00o.hashCode();
    }
}

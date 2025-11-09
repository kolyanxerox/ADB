package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class pr0 {

    /* renamed from: OooO, reason: collision with root package name */
    public static final pr0 f23409OooO;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final pr0 f23410OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final pr0 f23411OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final pr0 f23412OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final pr0 f23413OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final pr0 f23414OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final pr0 f23415OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final pr0 f23416OooOO0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23417OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f23418OooO0O0;

    static {
        int i = 0;
        f23410OooO0OO = new pr0("TINK", i);
        f23411OooO0Oo = new pr0("CRUNCHY", i);
        f23413OooO0o0 = new pr0("NO_PREFIX", i);
        int i2 = 1;
        f23412OooO0o = new pr0("TINK", i2);
        f23414OooO0oO = new pr0("CRUNCHY", i2);
        f23415OooO0oo = new pr0("NO_PREFIX", i2);
        int i3 = 2;
        f23409OooO = new pr0("TINK", i3);
        f23416OooOO0 = new pr0("NO_PREFIX", i3);
    }

    public /* synthetic */ pr0(String str, int i) {
        this.f23417OooO00o = i;
        this.f23418OooO0O0 = str;
    }

    public static pr0 OooO00o(r40 r40Var) {
        String str;
        r40Var.OooOO0O(2);
        int iOooOo0O = r40Var.OooOo0O();
        int i = iOooOo0O >> 1;
        int i2 = iOooOo0O & 1;
        int iOooOo0O2 = r40Var.OooOo0O() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i3 = iOooOo0O2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new pr0(sb.toString(), 3);
    }

    public String toString() {
        switch (this.f23417OooO00o) {
            case 0:
                return this.f23418OooO0O0;
            case 1:
                return this.f23418OooO0O0;
            case 2:
                return this.f23418OooO0O0;
            default:
                return super.toString();
        }
    }
}

package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0OO000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0O00o0 f27135OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f27136OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f27137OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f27138OooO0Oo;

    public o0OO000(o0O00o0 o0o00o0, String str, Object[] objArr) {
        this.f27135OooO00o = o0o00o0;
        this.f27136OooO0O0 = str;
        this.f27137OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f27138OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f27138OooO0Oo = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int OooO00o() {
        int i = this.f27138OooO0Oo;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

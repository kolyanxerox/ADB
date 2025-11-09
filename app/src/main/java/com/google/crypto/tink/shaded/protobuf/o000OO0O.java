package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class o000OO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f28096OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f28097OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f28098OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28099OooO0Oo;

    public o000OO0O(OooO00o oooO00o, String str, Object[] objArr) {
        this.f28096OooO00o = oooO00o;
        this.f28097OooO0O0 = str;
        this.f28098OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f28099OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f28099OooO0Oo = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }
}

package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class oOo000o0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC2346o f26880OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f26881OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f26882OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f26883OooO0Oo;

    public oOo000o0(AbstractC2346o abstractC2346o, String str, Object[] objArr) {
        this.f26880OooO00o = abstractC2346o;
        this.f26881OooO0O0 = str;
        this.f26882OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f26883OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f26883OooO0Oo = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int OooO00o() {
        int i = this.f26883OooO0Oo;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

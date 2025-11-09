package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jn */
/* loaded from: classes2.dex */
public final class C1721jn {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final C1721jn f20337OooO0Oo = new C1721jn(0, 0, 1.0f);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f20338OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f20339OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final float f20340OooO0OO;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C1721jn(int i, int i2, float f) {
        this.f20338OooO00o = i;
        this.f20339OooO0O0 = i2;
        this.f20340OooO0OO = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1721jn) {
            C1721jn c1721jn = (C1721jn) obj;
            if (this.f20338OooO00o == c1721jn.f20338OooO00o && this.f20339OooO0O0 == c1721jn.f20339OooO0O0 && this.f20340OooO0OO == c1721jn.f20340OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f20340OooO0OO) + ((((this.f20338OooO00o + 217) * 31) + this.f20339OooO0O0) * 31);
    }
}

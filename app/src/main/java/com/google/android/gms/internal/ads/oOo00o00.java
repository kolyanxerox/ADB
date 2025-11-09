package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oOo00o00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f22883OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f22884OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f22885OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22886OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public String f22887OooO0o0;

    public oOo00o00(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f22883OooO00o = str;
        this.f22884OooO0O0 = i2;
        this.f22885OooO0OO = i3;
        this.f22886OooO0Oo = Integer.MIN_VALUE;
        this.f22887OooO0o0 = "";
    }

    public final void OooO00o() {
        int i = this.f22886OooO0Oo;
        int i2 = i == Integer.MIN_VALUE ? this.f22884OooO0O0 : i + this.f22885OooO0OO;
        this.f22886OooO0Oo = i2;
        this.f22887OooO0o0 = this.f22883OooO00o + i2;
    }

    public final void OooO0O0() {
        if (this.f22886OooO0Oo == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}

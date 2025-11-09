package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o000O0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f21703OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f21704OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f21705OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f21706OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f21707OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21708OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public Serializable f21709OooO0oO;

    public boolean OooO00o(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.f21703OooO00o = i2;
        this.f21709OooO0oO = AbstractC1641hg.f19722OooO0Oo[3 - i3];
        int i7 = AbstractC1641hg.f19724OooO0o0[i5];
        this.f21705OooO0OO = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.f21705OooO0OO = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.f21705OooO0OO = i7;
        }
        int i8 = (i >>> 9) & 1;
        int i9 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                i9 = 384;
            }
        } else if (i2 != 3) {
            i9 = 576;
        }
        this.f21707OooO0o = i9;
        if (i3 == 3) {
            int i10 = i2 == 3 ? AbstractC1641hg.f19723OooO0o[i6] : AbstractC1641hg.f19725OooO0oO[i6];
            this.f21708OooO0o0 = i10;
            this.f21704OooO0O0 = (((i10 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i11 = i3 == 2 ? AbstractC1641hg.f19726OooO0oo[i6] : AbstractC1641hg.f19718OooO[i6];
                this.f21708OooO0o0 = i11;
                this.f21704OooO0O0 = OooO0oO.OooOo.OooO0O0(i11, 144, i7, i8);
            } else {
                int i12 = AbstractC1641hg.f19727OooOO0[i6];
                this.f21708OooO0o0 = i12;
                this.f21704OooO0O0 = OooO0oO.OooOo.OooO0O0(i3 == 1 ? 72 : 144, i12, i7, i8);
            }
        }
        this.f21706OooO0Oo = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}

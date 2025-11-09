package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* loaded from: classes2.dex */
public final class oO0Oo0o0 implements InterfaceC1893oO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oO0OO0O f22694OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final r40 f22695OooO0O0 = new r40(32);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f22696OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22697OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public boolean f22698OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f22699OooO0o0;

    public oO0Oo0o0(oO0OO0O oo0oo0o) {
        this.f22694OooO00o = oo0oo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1893oO
    public final void OooO00o(h70 h70Var, o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        this.f22694OooO00o.OooO00o(h70Var, o0000ooo, ooo00o00);
        this.f22698OooO0o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1893oO
    public final void OooO0O0(int i, r40 r40Var) {
        int i2 = i & 1;
        int iOooOo0O = i2 != 0 ? r40Var.f23746OooO0O0 + r40Var.OooOo0O() : -1;
        if (this.f22698OooO0o) {
            if (i2 == 0) {
                return;
            }
            this.f22698OooO0o = false;
            r40Var.OooOO0(iOooOo0O);
            this.f22697OooO0Oo = 0;
        }
        while (r40Var.OooOOOO() > 0) {
            int i3 = this.f22697OooO0Oo;
            r40 r40Var2 = this.f22695OooO0O0;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iOooOo0O2 = r40Var.OooOo0O();
                    r40Var.OooOO0(r40Var.f23746OooO0O0 - 1);
                    if (iOooOo0O2 == 255) {
                        this.f22698OooO0o = true;
                        return;
                    }
                }
                int iMin = Math.min(r40Var.OooOOOO(), 3 - this.f22697OooO0Oo);
                r40Var.OooO0o(r40Var2.f23745OooO00o, this.f22697OooO0Oo, iMin);
                int i4 = this.f22697OooO0Oo + iMin;
                this.f22697OooO0Oo = i4;
                if (i4 == 3) {
                    r40Var2.OooOO0(0);
                    r40Var2.OooO(3);
                    r40Var2.OooOO0O(1);
                    int iOooOo0O3 = r40Var2.OooOo0O();
                    boolean z = (iOooOo0O3 & 128) != 0;
                    int iOooOo0O4 = r40Var2.OooOo0O();
                    this.f22699OooO0o0 = z;
                    int i5 = (((iOooOo0O3 & 15) << 8) | iOooOo0O4) + 3;
                    this.f22696OooO0OO = i5;
                    byte[] bArr = r40Var2.f23745OooO00o;
                    if (bArr.length < i5) {
                        int length = bArr.length;
                        r40Var2.OooO0o0(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(r40Var.OooOOOO(), this.f22696OooO0OO - i3);
                r40Var.OooO0o(r40Var2.f23745OooO00o, this.f22697OooO0Oo, iMin2);
                int i6 = this.f22697OooO0Oo + iMin2;
                this.f22697OooO0Oo = i6;
                int i7 = this.f22696OooO0OO;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f22699OooO0o0) {
                        r40Var2.OooO(i7);
                    } else {
                        if (i80.OooOO0O(0, r40Var2.f23745OooO00o, i7, -1) != 0) {
                            this.f22698OooO0o = true;
                            return;
                        }
                        r40Var2.OooO(this.f22696OooO0OO - 4);
                    }
                    r40Var2.OooOO0(0);
                    this.f22694OooO00o.OooO0O0(r40Var2);
                    this.f22697OooO0Oo = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1893oO
    public final void zzc() {
        this.f22698OooO0o = true;
    }
}

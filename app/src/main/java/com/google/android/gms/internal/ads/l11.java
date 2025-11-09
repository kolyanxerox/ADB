package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l11 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final l11 f20771OooO0o = new l11(0, new int[0], new Object[0], false);

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f20772OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int[] f20773OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object[] f20774OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f20775OooO0Oo = -1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f20776OooO0o0;

    public l11(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f20772OooO00o = i;
        this.f20773OooO0O0 = iArr;
        this.f20774OooO0OO = objArr;
        this.f20776OooO0o0 = z;
    }

    public static l11 OooO0O0() {
        return new l11(0, new int[8], new Object[8], true);
    }

    public final int OooO00o() {
        int iOo000o;
        int iO00oO0o;
        int iOo000o2;
        int i = this.f20775OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooO = 0;
        for (int i2 = 0; i2 < this.f20772OooO00o; i2++) {
            int i3 = this.f20773OooO0O0[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.f20774OooO0OO[i2]).getClass();
                    iOo000o2 = rz0.oo000o(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    jz0 jz0Var = (jz0) this.f20774OooO0OO[i2];
                    int iOo000o3 = rz0.oo000o(i6);
                    int iOooOO0 = jz0Var.OooOO0();
                    iOooO = AbstractC2183w4.OooO(iOooOO0, iOooOO0, iOo000o3, iOooO);
                } else if (i5 == 3) {
                    int iOo000o4 = rz0.oo000o(i4 << 3);
                    iOo000o = iOo000o4 + iOo000o4;
                    iO00oO0o = ((l11) this.f20774OooO0OO[i2]).OooO00o();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new j01());
                    }
                    ((Integer) this.f20774OooO0OO[i2]).getClass();
                    iOo000o2 = rz0.oo000o(i4 << 3) + 4;
                }
                iOooO = iOo000o2 + iOooO;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f20774OooO0OO[i2]).longValue();
                iOo000o = rz0.oo000o(i7);
                iO00oO0o = rz0.o00oO0o(jLongValue);
            }
            iOooO = iO00oO0o + iOo000o + iOooO;
        }
        this.f20775OooO0Oo = iOooO;
        return iOooO;
    }

    public final void OooO0OO(int i, Object obj) {
        if (!this.f20776OooO0o0) {
            throw new UnsupportedOperationException();
        }
        OooO0o0(this.f20772OooO00o + 1);
        int[] iArr = this.f20773OooO0O0;
        int i2 = this.f20772OooO00o;
        iArr[i2] = i;
        this.f20774OooO0OO[i2] = obj;
        this.f20772OooO00o = i2 + 1;
    }

    public final void OooO0Oo(rh0 rh0Var) {
        if (this.f20772OooO00o != 0) {
            for (int i = 0; i < this.f20772OooO00o; i++) {
                int i2 = this.f20773OooO0O0[i];
                Object obj = this.f20774OooO0OO[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((rz0) rh0Var.f23865OooOo0O).o00000O(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((rz0) rh0Var.f23865OooOo0O).o0OO00O(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((rz0) rh0Var.f23865OooOo0O).o0ooOoO(i4, (jz0) obj);
                } else if (i3 == 3) {
                    ((rz0) rh0Var.f23865OooOo0O).o000000o(i4, 3);
                    ((l11) obj).OooO0Oo(rh0Var);
                    ((rz0) rh0Var.f23865OooOo0O).o000000o(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new j01());
                    }
                    ((rz0) rh0Var.f23865OooOo0O).o0OOO0o(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void OooO0o0(int i) {
        int[] iArr = this.f20773OooO0O0;
        if (i > iArr.length) {
            int i2 = this.f20772OooO00o;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f20773OooO0O0 = Arrays.copyOf(iArr, i);
            this.f20774OooO0OO = Arrays.copyOf(this.f20774OooO0OO, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l11)) {
            return false;
        }
        l11 l11Var = (l11) obj;
        int i = this.f20772OooO00o;
        if (i == l11Var.f20772OooO00o) {
            int[] iArr = this.f20773OooO0O0;
            int[] iArr2 = l11Var.f20773OooO0O0;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f20774OooO0OO;
                    Object[] objArr2 = l11Var.f20774OooO0OO;
                    int i3 = this.f20772OooO00o;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f20772OooO00o;
        int i2 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f20773OooO0O0;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f20774OooO0OO;
        int i6 = this.f20772OooO00o;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}

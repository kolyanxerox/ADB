package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.pz0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class oO0O00oO {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final oO0O00oO f26737OooO0o = new oO0O00oO(0, new int[0], new Object[0], false);

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f26738OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int[] f26739OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object[] f26740OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f26741OooO0Oo = -1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f26742OooO0o0;

    public oO0O00oO(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f26738OooO00o = i;
        this.f26739OooO0O0 = iArr;
        this.f26740OooO0OO = objArr;
        this.f26742OooO0o0 = z;
    }

    public static oO0O00oO OooO00o() {
        return new oO0O00oO(0, new int[8], new Object[8], true);
    }

    public final void OooO0O0(oO00Oo0 oo00oo0) throws pz0 {
        if (this.f26738OooO00o != 0) {
            for (int i = 0; i < this.f26738OooO00o; i++) {
                int i2 = this.f26739OooO0O0[i];
                Object obj = this.f26740OooO0OO[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOo(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((oO000O0) oo00oo0.f26700OooOo0O).OooOOo0(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
                    oo000o0.OooOo0((i4 << 3) | 2);
                    oo000o0.OooOOo((oO000) obj);
                } else if (i3 == 3) {
                    ((oO000O0) oo00oo0.f26700OooOo0O).OooOO0o(i4, 3);
                    ((oO0O00oO) obj).OooO0O0(oo00oo0);
                    ((oO000O0) oo00oo0.f26700OooOo0O).OooOO0o(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new oOo00OO0());
                    }
                    ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOO(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int OooO0OO() {
        int iOooOoOO;
        int iOooOO0;
        int iOooOoOO2;
        int i = this.f26741OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooOo0O = 0;
        for (int i2 = 0; i2 < this.f26738OooO00o; i2++) {
            int i3 = this.f26739OooO0O0[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.f26740OooO0OO[i2]).getClass();
                    iOooOoOO2 = oO000O0.OooOoOO(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    oO000 oo000 = (oO000) this.f26740OooO0OO[i2];
                    int iOooOoOO3 = oO000O0.OooOoOO(i6);
                    int iOooO0oO = oo000.OooO0oO();
                    iOooOo0O = AbstractC2183w4.OooOo0O(iOooO0oO, iOooO0oO, iOooOoOO3, iOooOo0O);
                } else if (i5 == 3) {
                    int iOooOoOO4 = oO000O0.OooOoOO(i4 << 3);
                    iOooOoOO = iOooOoOO4 + iOooOoOO4;
                    iOooOO0 = ((oO0O00oO) this.f26740OooO0OO[i2]).OooO0OO();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new oOo00OO0());
                    }
                    ((Integer) this.f26740OooO0OO[i2]).getClass();
                    iOooOoOO2 = oO000O0.OooOoOO(i4 << 3) + 4;
                }
                iOooOo0O = iOooOoOO2 + iOooOo0O;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f26740OooO0OO[i2]).longValue();
                iOooOoOO = oO000O0.OooOoOO(i7);
                iOooOO0 = oO000O0.OooOO0(jLongValue);
            }
            iOooOo0O = iOooOO0 + iOooOoOO + iOooOo0O;
        }
        this.f26741OooO0Oo = iOooOo0O;
        return iOooOo0O;
    }

    public final void OooO0Oo(int i, Object obj) {
        if (!this.f26742OooO0o0) {
            throw new UnsupportedOperationException();
        }
        OooO0o0(this.f26738OooO00o + 1);
        int[] iArr = this.f26739OooO0O0;
        int i2 = this.f26738OooO00o;
        iArr[i2] = i;
        this.f26740OooO0OO[i2] = obj;
        this.f26738OooO00o = i2 + 1;
    }

    public final void OooO0o0(int i) {
        int[] iArr = this.f26739OooO0O0;
        if (i > iArr.length) {
            int i2 = this.f26738OooO00o;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f26739OooO0O0 = Arrays.copyOf(iArr, i);
            this.f26740OooO0OO = Arrays.copyOf(this.f26740OooO0OO, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof oO0O00oO)) {
            return false;
        }
        oO0O00oO oo0o00oo = (oO0O00oO) obj;
        int i = this.f26738OooO00o;
        if (i == oo0o00oo.f26738OooO00o) {
            int[] iArr = this.f26739OooO0O0;
            int[] iArr2 = oo0o00oo.f26739OooO0O0;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f26740OooO0OO;
                    Object[] objArr2 = oo0o00oo.f26740OooO0OO;
                    int i3 = this.f26738OooO00o;
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
        int i = this.f26738OooO00o;
        int i2 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f26739OooO0O0;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f26740OooO0OO;
        int i6 = this.f26738OooO00o;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}

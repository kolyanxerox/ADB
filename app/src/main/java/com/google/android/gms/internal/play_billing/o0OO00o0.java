package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.pz0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o0OO00o0 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final o0OO00o0 f27139OooO0o = new o0OO00o0(0, new int[0], new Object[0], false);

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f27140OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int[] f27141OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object[] f27142OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f27143OooO0Oo = -1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f27144OooO0o0;

    public o0OO00o0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f27140OooO00o = i;
        this.f27141OooO0O0 = iArr;
        this.f27142OooO0OO = objArr;
        this.f27144OooO0o0 = z;
    }

    public static o0OO00o0 OooO0O0() {
        return new o0OO00o0(0, new int[8], new Object[8], true);
    }

    public final int OooO00o() {
        int iOooooO0;
        int iOooo0oO;
        int iOooooO02;
        int i = this.f27143OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooOo = 0;
        for (int i2 = 0; i2 < this.f27140OooO00o; i2++) {
            int i3 = this.f27141OooO0O0[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.f27142OooO0OO[i2]).getClass();
                    iOooooO02 = o0O0000O.OooooO0(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    o0O00000 o0o00000 = (o0O00000) this.f27142OooO0OO[i2];
                    int iOooooO03 = o0O0000O.OooooO0(i6);
                    int iOooO0oO = o0o00000.OooO0oO();
                    iOooOo = AbstractC2183w4.OooOo(iOooO0oO, iOooO0oO, iOooooO03, iOooOo);
                } else if (i5 == 3) {
                    int iOooooO04 = o0O0000O.OooooO0(i4 << 3);
                    iOooooO0 = iOooooO04 + iOooooO04;
                    iOooo0oO = ((o0OO00o0) this.f27142OooO0OO[i2]).OooO00o();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new o0O00o00());
                    }
                    ((Integer) this.f27142OooO0OO[i2]).getClass();
                    iOooooO02 = o0O0000O.OooooO0(i4 << 3) + 4;
                }
                iOooOo = iOooooO02 + iOooOo;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f27142OooO0OO[i2]).longValue();
                iOooooO0 = o0O0000O.OooooO0(i7);
                iOooo0oO = o0O0000O.Oooo0oO(jLongValue);
            }
            iOooOo = iOooo0oO + iOooooO0 + iOooOo;
        }
        this.f27143OooO0Oo = iOooOo;
        return iOooOo;
    }

    public final void OooO0OO(int i, Object obj) {
        if (!this.f27144OooO0o0) {
            throw new UnsupportedOperationException();
        }
        OooO0o0(this.f27140OooO00o + 1);
        int[] iArr = this.f27141OooO0O0;
        int i2 = this.f27140OooO00o;
        iArr[i2] = i;
        this.f27142OooO0OO[i2] = obj;
        this.f27140OooO00o = i2 + 1;
    }

    public final void OooO0Oo(o0O0O0o0 o0o0o0o0) throws pz0 {
        if (this.f27140OooO00o != 0) {
            for (int i = 0; i < this.f27140OooO00o; i++) {
                int i2 = this.f27141OooO0O0[i];
                Object obj = this.f27142OooO0OO[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOoo(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO0O(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((o0O0000O) o0o0o0o0.f27109OooO00o).Oooo(i4, (o0O00000) obj);
                } else if (i3 == 3) {
                    ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOOo(i4, 3);
                    ((o0OO00o0) obj).OooO0Oo(o0o0o0o0);
                    ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOOo(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new o0O00o00());
                    }
                    ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO00(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void OooO0o0(int i) {
        int[] iArr = this.f27141OooO0O0;
        if (i > iArr.length) {
            int i2 = this.f27140OooO00o;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f27141OooO0O0 = Arrays.copyOf(iArr, i);
            this.f27142OooO0OO = Arrays.copyOf(this.f27142OooO0OO, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0OO00o0)) {
            return false;
        }
        o0OO00o0 o0oo00o0 = (o0OO00o0) obj;
        int i = this.f27140OooO00o;
        if (i == o0oo00o0.f27140OooO00o) {
            int[] iArr = this.f27141OooO0O0;
            int[] iArr2 = o0oo00o0.f27141OooO0O0;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f27142OooO0OO;
                    Object[] objArr2 = o0oo00o0.f27142OooO0OO;
                    int i3 = this.f27140OooO00o;
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
        int i = this.f27140OooO00o;
        int i2 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f27141OooO0O0;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f27142OooO0OO;
        int i6 = this.f27140OooO00o;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}

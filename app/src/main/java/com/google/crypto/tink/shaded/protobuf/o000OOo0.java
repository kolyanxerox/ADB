package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.pz0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o000OOo0 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final o000OOo0 f28101OooO0o = new o000OOo0(0, new int[0], new Object[0], false);

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f28102OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int[] f28103OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object[] f28104OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f28105OooO0Oo = -1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f28106OooO0o0;

    public o000OOo0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f28102OooO00o = i;
        this.f28103OooO0O0 = iArr;
        this.f28104OooO0OO = objArr;
        this.f28106OooO0o0 = z;
    }

    public static o000OOo0 OooO0OO() {
        return new o000OOo0(0, new int[8], new Object[8], true);
    }

    public final void OooO00o(int i) {
        int[] iArr = this.f28103OooO0O0;
        if (i > iArr.length) {
            int i2 = this.f28102OooO00o;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f28103OooO0O0 = Arrays.copyOf(iArr, i);
            this.f28104OooO0OO = Arrays.copyOf(this.f28104OooO0OO, i);
        }
    }

    public final int OooO0O0() {
        int iOooOo;
        int iOooOoO;
        int iOooOo00;
        int i = this.f28105OooO0Oo;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f28102OooO00o; i3++) {
            int i4 = this.f28103OooO0O0[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f28104OooO0OO[i3]).getClass();
                    iOooOo00 = OooOo00.OooOo00(i5);
                } else if (i6 == 2) {
                    iOooOo00 = OooOo00.OooOOo0(i5, (OooOOO0) this.f28104OooO0OO[i3]);
                } else if (i6 == 3) {
                    iOooOo = OooOo00.OooOo(i5) * 2;
                    iOooOoO = ((o000OOo0) this.f28104OooO0OO[i3]).OooO0O0();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(o000OOo.OooO0OO());
                    }
                    ((Integer) this.f28104OooO0OO[i3]).getClass();
                    iOooOo00 = OooOo00.OooOOoo(i5);
                }
                i2 = iOooOo00 + i2;
            } else {
                long jLongValue = ((Long) this.f28104OooO0OO[i3]).longValue();
                iOooOo = OooOo00.OooOo(i5);
                iOooOoO = OooOo00.OooOoO(jLongValue);
            }
            i2 = iOooOoO + iOooOo + i2;
        }
        this.f28105OooO0Oo = i2;
        return i2;
    }

    public final void OooO0Oo(int i, Object obj) {
        if (!this.f28106OooO0o0) {
            throw new UnsupportedOperationException();
        }
        OooO00o(this.f28102OooO00o + 1);
        int[] iArr = this.f28103OooO0O0;
        int i2 = this.f28102OooO00o;
        iArr[i2] = i;
        this.f28104OooO0OO[i2] = obj;
        this.f28102OooO00o = i2 + 1;
    }

    public final void OooO0o0(o0000O00 o0000o00) throws pz0 {
        if (this.f28102OooO00o == 0) {
            return;
        }
        o0000o00.getClass();
        for (int i = 0; i < this.f28102OooO00o; i++) {
            int i2 = this.f28103OooO0O0[i];
            Object obj = this.f28104OooO0OO[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
            if (i4 == 0) {
                oooOo00.Oooo0O0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                oooOo00.OooOooo(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                o0000o00.OooO00o(i3, (OooOOO0) obj);
            } else if (i4 == 3) {
                oooOo00.Oooo00o(i3, 3);
                ((o000OOo0) obj).OooO0o0(o0000o00);
                oooOo00.Oooo00o(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(o000OOo.OooO0OO());
                }
                oooOo00.OooOoo(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o000OOo0)) {
            return false;
        }
        o000OOo0 o000ooo02 = (o000OOo0) obj;
        int i = this.f28102OooO00o;
        if (i == o000ooo02.f28102OooO00o) {
            int[] iArr = this.f28103OooO0O0;
            int[] iArr2 = o000ooo02.f28103OooO0O0;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f28104OooO0OO;
                    Object[] objArr2 = o000ooo02.f28104OooO0OO;
                    int i3 = this.f28102OooO00o;
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
        int i = this.f28102OooO00o;
        int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31;
        int[] iArr = this.f28103OooO0O0;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f28104OooO0OO;
        int i6 = this.f28102OooO00o;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}

package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class o0O00000 implements Iterable, Serializable {

    /* renamed from: OooOo */
    public static final o0O00000 f27078OooOo = new o0O00000(o0oO0Ooo.f27161OooO0O0);

    /* renamed from: OooOo0O */
    public int f27079OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final byte[] f27080OooOo0o;

    static {
        int i = o0oOOo.f27171OooO00o;
    }

    public o0O00000(byte[] bArr) {
        bArr.getClass();
        this.f27080OooOo0o = bArr;
    }

    public static int OooO(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0oO(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i2, i3, "End index: ", " >= "));
    }

    public static o0O00000 OooOO0(byte[] bArr, int i, int i2) {
        OooO(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new o0O00000(bArr2);
    }

    public byte OooO0o(int i) {
        return this.f27080OooOo0o[i];
    }

    public byte OooO0o0(int i) {
        return this.f27080OooOo0o[i];
    }

    public int OooO0oO() {
        return this.f27080OooOo0o.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o0O00000) && OooO0oO() == ((o0O00000) obj).OooO0oO()) {
            if (OooO0oO() == 0) {
                return true;
            }
            if (!(obj instanceof o0O00000)) {
                return obj.equals(this);
            }
            o0O00000 o0o00000 = (o0O00000) obj;
            int i = this.f27079OooOo0O;
            int i2 = o0o00000.f27079OooOo0O;
            if (i == 0 || i2 == 0 || i == i2) {
                int iOooO0oO = OooO0oO();
                if (iOooO0oO > o0o00000.OooO0oO()) {
                    throw new IllegalArgumentException("Length too large: " + iOooO0oO + OooO0oO());
                }
                if (iOooO0oO > o0o00000.OooO0oO()) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(iOooO0oO, o0o00000.OooO0oO(), "Ran off end of other: 0, ", ", "));
                }
                int i3 = 0;
                int i4 = 0;
                while (i3 < iOooO0oO) {
                    if (this.f27080OooOo0o[i3] == o0o00000.f27080OooOo0o[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f27079OooOo0O;
        if (i != 0) {
            return i;
        }
        int iOooO0oO = OooO0oO();
        int i2 = iOooO0oO;
        for (int i3 = 0; i3 < iOooO0oO; i3++) {
            i2 = (i2 * 31) + this.f27080OooOo0o[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f27079OooOo0O = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new com.google.android.gms.internal.measurement.oO0000Oo(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iOooO0oO = OooO0oO();
        if (OooO0oO() <= 50) {
            strConcat = o0O000Oo.OooO0o0(this);
        } else {
            int iOooO = OooO(0, 47, OooO0oO());
            strConcat = o0O000Oo.OooO0o0(iOooO == 0 ? f27078OooOo : new C2361o0(this.f27080OooOo0o, iOooO)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iOooO0oO);
        sb.append(" contents=\"");
        return OooO0oO.OooOo.OooOOOo(sb, strConcat, "\">");
    }
}

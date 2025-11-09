package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class oO000 implements Iterable, Serializable {

    /* renamed from: OooOo */
    public static final oO000 f26663OooOo = new oO000(oO00O0o.f26685OooO0O0);

    /* renamed from: OooOo0O */
    public int f26664OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final byte[] f26665OooOo0o;

    static {
        int i = oO00000o.f26667OooO00o;
    }

    public oO000(byte[] bArr) {
        bArr.getClass();
        this.f26665OooOo0o = bArr;
    }

    public static oO000 OooO(byte[] bArr, int i, int i2) {
        OooOO0(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new oO000(bArr2);
    }

    public static int OooOO0(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public byte OooO0o(int i) {
        return this.f26665OooOo0o[i];
    }

    public byte OooO0o0(int i) {
        return this.f26665OooOo0o[i];
    }

    public int OooO0oO() {
        return this.f26665OooOo0o.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof oO000) && OooO0oO() == ((oO000) obj).OooO0oO()) {
            if (OooO0oO() == 0) {
                return true;
            }
            if (!(obj instanceof oO000)) {
                return obj.equals(this);
            }
            oO000 oo000 = (oO000) obj;
            int i = this.f26664OooOo0O;
            int i2 = oo000.f26664OooOo0O;
            if (i == 0 || i2 == 0 || i == i2) {
                int iOooO0oO = OooO0oO();
                if (iOooO0oO > oo000.OooO0oO()) {
                    int iOooO0oO2 = OooO0oO();
                    StringBuilder sb = new StringBuilder(String.valueOf(iOooO0oO).length() + 18 + String.valueOf(iOooO0oO2).length());
                    sb.append("Length too large: ");
                    sb.append(iOooO0oO);
                    sb.append(iOooO0oO2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iOooO0oO <= oo000.OooO0oO()) {
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < iOooO0oO) {
                        if (this.f26665OooOo0o[i3] == oo000.f26665OooOo0o[i4]) {
                            i3++;
                            i4++;
                        }
                    }
                    return true;
                }
                int iOooO0oO3 = oo000.OooO0oO();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iOooO0oO).length() + 27 + String.valueOf(iOooO0oO3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iOooO0oO);
                sb2.append(", ");
                sb2.append(iOooO0oO3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26664OooOo0O;
        if (i != 0) {
            return i;
        }
        int iOooO0oO = OooO0oO();
        int i2 = iOooO0oO;
        for (int i3 = 0; i3 < iOooO0oO; i3++) {
            i2 = (i2 * 31) + this.f26665OooOo0o[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f26664OooOo0O = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new oO0000Oo(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iOooO0oO = OooO0oO();
        if (OooO0oO() <= 50) {
            strConcat = Oooo0o0.OooO.OooOo(this);
        } else {
            int iOooOO0 = OooOO0(0, 47, OooO0oO());
            strConcat = Oooo0o0.OooO.OooOo(iOooOO0 == 0 ? f26663OooOo : new oO0000o0(this.f26665OooOo0o, iOooOO0)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iOooO0oO);
        sb.append(" contents=\"");
        return OooO0oO.OooOo.OooOOOo(sb, strConcat, "\">");
    }
}

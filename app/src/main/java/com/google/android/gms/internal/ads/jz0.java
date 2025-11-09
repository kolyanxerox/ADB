package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class jz0 implements Iterable, Serializable {

    /* renamed from: OooOo0o */
    public static final hz0 f20406OooOo0o = new hz0(i01.f19889OooO0O0);

    /* renamed from: OooOo0O */
    public int f20407OooOo0O = 0;

    static {
        int i = dz0.f18440OooO00o;
    }

    public static jz0 OooO(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (jz0) it.next();
        }
        int i2 = i >>> 1;
        jz0 jz0VarOooO = OooO(it, i2);
        jz0 jz0VarOooO2 = OooO(it, i - i2);
        if (Integer.MAX_VALUE - jz0VarOooO.OooOO0() < jz0VarOooO2.OooOO0()) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(jz0VarOooO.OooOO0(), jz0VarOooO2.OooOO0(), "ByteString would be too long: ", "+"));
        }
        if (jz0VarOooO2.OooOO0() == 0) {
            return jz0VarOooO;
        }
        if (jz0VarOooO.OooOO0() == 0) {
            return jz0VarOooO2;
        }
        int iOooOO0 = jz0VarOooO2.OooOO0() + jz0VarOooO.OooOO0();
        if (iOooOO0 < 128) {
            int iOooOO02 = jz0VarOooO.OooOO0();
            int iOooOO03 = jz0VarOooO2.OooOO0();
            int i3 = iOooOO02 + iOooOO03;
            byte[] bArr = new byte[i3];
            OooOOo(0, iOooOO02, jz0VarOooO.OooOO0());
            OooOOo(0, iOooOO02, i3);
            if (iOooOO02 > 0) {
                jz0VarOooO.OooOO0O(0, bArr, 0, iOooOO02);
            }
            OooOOo(0, iOooOO03, jz0VarOooO2.OooOO0());
            OooOOo(iOooOO02, i3, i3);
            if (iOooOO03 > 0) {
                jz0VarOooO2.OooOO0O(0, bArr, iOooOO02, iOooOO03);
            }
            return new hz0(bArr);
        }
        if (jz0VarOooO instanceof f11) {
            f11 f11Var = (f11) jz0VarOooO;
            jz0 jz0Var = f11Var.f18758OooOoO;
            int iOooOO04 = jz0VarOooO2.OooOO0() + jz0Var.OooOO0();
            jz0 jz0Var2 = f11Var.f18759OooOoO0;
            if (iOooOO04 < 128) {
                int iOooOO05 = jz0Var.OooOO0();
                int iOooOO06 = jz0VarOooO2.OooOO0();
                int i4 = iOooOO05 + iOooOO06;
                byte[] bArr2 = new byte[i4];
                OooOOo(0, iOooOO05, jz0Var.OooOO0());
                OooOOo(0, iOooOO05, i4);
                if (iOooOO05 > 0) {
                    jz0Var.OooOO0O(0, bArr2, 0, iOooOO05);
                }
                OooOOo(0, iOooOO06, jz0VarOooO2.OooOO0());
                OooOOo(iOooOO05, i4, i4);
                if (iOooOO06 > 0) {
                    jz0VarOooO2.OooOO0O(0, bArr2, iOooOO05, iOooOO06);
                }
                return new f11(jz0Var2, new hz0(bArr2));
            }
            if (jz0Var2.OooOO0o() > jz0Var.OooOO0o() && f11Var.f18761OooOoo0 > jz0VarOooO2.OooOO0o()) {
                return new f11(jz0Var2, new f11(jz0Var, jz0VarOooO2));
            }
        }
        if (iOooOO0 >= f11.OooOo0o(Math.max(jz0VarOooO.OooOO0o(), jz0VarOooO2.OooOO0o()) + 1)) {
            return new f11(jz0VarOooO, jz0VarOooO2);
        }
        ni0 ni0Var = new ni0(3);
        ni0Var.OooO0OO(jz0VarOooO);
        ni0Var.OooO0OO(jz0VarOooO2);
        ArrayDeque arrayDeque = (ArrayDeque) ni0Var.f21493OooOo0o;
        jz0 f11Var2 = (jz0) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            f11Var2 = new f11((jz0) arrayDeque.pop(), f11Var2);
        }
        return f11Var2;
    }

    public static int OooOOo(int i, int i2, int i3) {
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

    public static hz0 OooOo0(byte[] bArr, int i, int i2) {
        OooOOo(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new hz0(bArr2);
    }

    public static jz0 OooOo00(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            int size2 = arrayList.size();
            size = 0;
            int i = 0;
            while (i < size2) {
                arrayList.get(i);
                i++;
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? f20406OooOo0o : OooO(arrayList.iterator(), size);
    }

    public static void OooOo0O(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(OooO0oO.OooOo.OooO0o(i, "Index < 0: "));
        }
    }

    public abstract byte OooO0o(int i);

    public final byte[] OooO0o0() {
        int iOooOO0 = OooOO0();
        if (iOooOO0 == 0) {
            return i01.f19889OooO0O0;
        }
        byte[] bArr = new byte[iOooOO0];
        OooOO0O(0, bArr, 0, iOooOO0);
        return bArr;
    }

    public abstract byte OooO0oO(int i);

    public abstract int OooOO0();

    public abstract void OooOO0O(int i, byte[] bArr, int i2, int i3);

    public abstract int OooOO0o();

    public abstract int OooOOO(int i, int i2, int i3);

    public abstract boolean OooOOO0();

    public abstract jz0 OooOOOO(int i, int i2);

    public abstract nz0 OooOOOo();

    public abstract void OooOOo0(rz0 rz0Var);

    @Override // java.lang.Iterable
    /* renamed from: OooOOoo */
    public vn0 iterator() {
        return new fz0(this);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iOooOOO = this.f20407OooOo0O;
        if (iOooOOO == 0) {
            int iOooOO0 = OooOO0();
            iOooOOO = OooOOO(iOooOO0, 0, iOooOO0);
            if (iOooOOO == 0) {
                iOooOOO = 1;
            }
            this.f20407OooOo0O = iOooOOO;
        }
        return iOooOOO;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iOooOO0 = OooOO0();
        String strOooOOOo = OooOO0() <= 50 ? xh0.OooOOOo(this) : xh0.OooOOOo(OooOOOO(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iOooOO0);
        sb.append(" contents=\"");
        return OooO0oO.OooOo.OooOOOo(sb, strOooOOOo, "\">");
    }
}

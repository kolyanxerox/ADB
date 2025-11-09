package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class OooOOO0 implements Iterable, Serializable {

    /* renamed from: OooOo */
    public static final OooO f28024OooOo;

    /* renamed from: OooOo0o */
    public static final OooOO0O f28025OooOo0o = new OooOO0O(oo0o0Oo.f28135OooO0O0);

    /* renamed from: OooOo0O */
    public int f28026OooOo0O;

    static {
        f28024OooOo = OooO0OO.OooO00o() ? new OooO(1) : new OooO(0);
    }

    public static int OooO0o(int i, int i2, int i3) {
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

    public static OooOO0O OooO0oO(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        OooO0o(i, i + i2, bArr.length);
        switch (f28024OooOo.f28010OooO00o) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new OooOO0O(bArrCopyOfRange);
    }

    public abstract void OooO(int i, byte[] bArr);

    public abstract byte OooO0o0(int i);

    public final byte[] OooOO0() {
        int size = size();
        if (size == 0) {
            return oo0o0Oo.f28135OooO0O0;
        }
        byte[] bArr = new byte[size];
        OooO(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f28026OooOo0O;
        if (i != 0) {
            return i;
        }
        int size = size();
        OooOO0O oooOO0O = (OooOO0O) this;
        int iOooOO0O = oooOO0O.OooOO0O();
        int i2 = size;
        for (int i3 = iOooOO0O; i3 < iOooOO0O + size; i3++) {
            i2 = (i2 * 31) + oooOO0O.f28016OooOoO0[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f28026OooOo0O = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        OooOO0O oooOO0;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = o0OOO0.OooO0o(this);
        } else {
            StringBuilder sb = new StringBuilder();
            OooOO0O oooOO0O = (OooOO0O) this;
            int iOooO0o = OooO0o(0, 47, oooOO0O.size());
            if (iOooO0o == 0) {
                oooOO0 = f28025OooOo0o;
            } else {
                oooOO0 = new OooOO0(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), iOooO0o);
            }
            sb.append(o0OOO0.OooO0o(oooOO0));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return OooO0oO.OooOo.OooOOOo(sb2, string, "\">");
    }
}

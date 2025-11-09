package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.oO0000Oo;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class OooOO0O extends OooOOO0 {

    /* renamed from: OooOoO0 */
    public final byte[] f28016OooOoO0;

    public OooOO0O(byte[] bArr) {
        this.f28026OooOo0O = 0;
        bArr.getClass();
        this.f28016OooOoO0 = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOOO0
    public void OooO(int i, byte[] bArr) {
        System.arraycopy(this.f28016OooOoO0, 0, bArr, 0, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOOO0
    public byte OooO0o0(int i) {
        return this.f28016OooOoO0[i];
    }

    public int OooOO0O() {
        return 0;
    }

    public byte OooOO0o(int i) {
        return this.f28016OooOoO0[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO0) || size() != ((OooOOO0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return obj.equals(this);
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        int i = this.f28026OooOo0O;
        int i2 = oooOO0O.f28026OooOo0O;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > oooOO0O.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > oooOO0O.size()) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(size, "Ran off end of other: 0, ", ", ");
            sbOooOOo0.append(oooOO0O.size());
            throw new IllegalArgumentException(sbOooOOo0.toString());
        }
        int iOooOO0O = OooOO0O() + size;
        int iOooOO0O2 = OooOO0O();
        int iOooOO0O3 = oooOO0O.OooOO0O();
        while (iOooOO0O2 < iOooOO0O) {
            if (this.f28016OooOoO0[iOooOO0O2] != oooOO0O.f28016OooOoO0[iOooOO0O3]) {
                return false;
            }
            iOooOO0O2++;
            iOooOO0O3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new oO0000Oo(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOOO0
    public int size() {
        return this.f28016OooOoO0.length;
    }
}

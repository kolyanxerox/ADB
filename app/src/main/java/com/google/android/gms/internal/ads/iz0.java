package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class iz0 extends OutputStream {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final byte[] f20132OooOoOO = new byte[0];

    /* renamed from: OooOo, reason: collision with root package name */
    public int f20133OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f20136OooOoO;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f20134OooOo0O = 128;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f20135OooOo0o = new ArrayList();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public byte[] f20137OooOoO0 = new byte[128];

    public final synchronized jz0 OooO00o() {
        try {
            int i = this.f20136OooOoO;
            byte[] bArr = this.f20137OooOoO0;
            if (i >= bArr.length) {
                this.f20135OooOo0o.add(new hz0(this.f20137OooOoO0));
                this.f20137OooOoO0 = f20132OooOoOO;
            } else if (i > 0) {
                this.f20135OooOo0o.add(new hz0(Arrays.copyOf(bArr, i)));
            }
            this.f20133OooOo += this.f20136OooOoO;
            this.f20136OooOoO = 0;
        } catch (Throwable th) {
            throw th;
        }
        return jz0.OooOo00(this.f20135OooOo0o);
    }

    public final void OooO0O0(int i) {
        this.f20135OooOo0o.add(new hz0(this.f20137OooOoO0));
        int length = this.f20133OooOo + this.f20137OooOoO0.length;
        this.f20133OooOo = length;
        this.f20137OooOoO0 = new byte[Math.max(this.f20134OooOo0O, Math.max(i, length >>> 1))];
        this.f20136OooOoO = 0;
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f20133OooOo + this.f20136OooOoO;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f20136OooOoO == this.f20137OooOoO0.length) {
                OooO0O0(1);
            }
            byte[] bArr = this.f20137OooOoO0;
            int i2 = this.f20136OooOoO;
            this.f20136OooOoO = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f20137OooOoO0;
        int length = bArr2.length;
        int i3 = this.f20136OooOoO;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f20136OooOoO += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        OooO0O0(i5);
        System.arraycopy(bArr, i + i4, this.f20137OooOoO0, 0, i5);
        this.f20136OooOoO = i5;
    }
}

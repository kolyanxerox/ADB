package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class oO0000o0 extends oO000 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f26673OooOoO0;

    public oO0000o0(byte[] bArr, int i) {
        super(bArr);
        oO000.OooOO0(0, i, bArr.length);
        this.f26673OooOoO0 = i;
    }

    @Override // com.google.android.gms.internal.measurement.oO000
    public final byte OooO0o(int i) {
        return this.f26665OooOo0o[i];
    }

    @Override // com.google.android.gms.internal.measurement.oO000
    public final byte OooO0o0(int i) {
        int i2 = this.f26673OooOoO0;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f26665OooOo0o[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.oO000
    public final int OooO0oO() {
        return this.f26673OooOoO0;
    }
}

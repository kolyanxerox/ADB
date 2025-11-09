package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gz0 extends hz0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f19485OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f19486OooOoO0;

    public gz0(byte[] bArr, int i, int i2) {
        super(bArr);
        jz0.OooOOo(i, i + i2, bArr.length);
        this.f19486OooOoO0 = i;
        this.f19485OooOoO = i2;
    }

    @Override // com.google.android.gms.internal.ads.hz0, com.google.android.gms.internal.ads.jz0
    public final byte OooO0o(int i) {
        jz0.OooOo0O(i, this.f19485OooOoO);
        return this.f19882OooOo[this.f19486OooOoO0 + i];
    }

    @Override // com.google.android.gms.internal.ads.hz0, com.google.android.gms.internal.ads.jz0
    public final byte OooO0oO(int i) {
        return this.f19882OooOo[this.f19486OooOoO0 + i];
    }

    @Override // com.google.android.gms.internal.ads.hz0, com.google.android.gms.internal.ads.jz0
    public final int OooOO0() {
        return this.f19485OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.hz0, com.google.android.gms.internal.ads.jz0
    public final void OooOO0O(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f19882OooOo, this.f19486OooOoO0 + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.hz0
    public final int OooOo0o() {
        return this.f19486OooOoO0;
    }
}

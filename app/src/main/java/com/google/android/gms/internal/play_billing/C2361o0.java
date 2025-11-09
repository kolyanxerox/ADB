package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.o0 */
/* loaded from: classes2.dex */
public final class C2361o0 extends o0O00000 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f26961OooOoO0;

    public C2361o0(byte[] bArr, int i) {
        super(bArr);
        o0O00000.OooO(0, i, bArr.length);
        this.f26961OooOoO0 = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O00000
    public final byte OooO0o(int i) {
        return this.f27080OooOo0o[i];
    }

    @Override // com.google.android.gms.internal.play_billing.o0O00000
    public final byte OooO0o0(int i) {
        int i2 = this.f26961OooOoO0;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f27080OooOo0o[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(OooO0oO.OooOo.OooO0o(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.o0O00000
    public final int OooO0oO() {
        return this.f26961OooOoO0;
    }
}

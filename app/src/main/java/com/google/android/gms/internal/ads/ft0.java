package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ft0 extends Oooo0o.OooO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f19124OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft0(byte[] bArr, int i) {
        super(bArr, 3);
        this.f19124OooO0OO = i;
    }

    @Override // Oooo0o.OooO
    public final et0 OooO0oO(int i, byte[] bArr) {
        switch (this.f19124OooO0OO) {
            case 0:
                return new dt0(bArr, i, 0);
            default:
                return new dt0(bArr, i, 1);
        }
    }
}

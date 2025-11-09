package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.i */
/* loaded from: classes2.dex */
public final class C1661i extends g31 {

    /* renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ int f19883OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1661i(String str, int i) {
        super(str);
        this.f19883OooOooO = i;
    }

    @Override // com.google.android.gms.internal.ads.g31
    public final void OooO0OO(ByteBuffer byteBuffer) {
        switch (this.f19883OooOooO) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void OooO0o0(ByteBuffer byteBuffer) {
    }
}

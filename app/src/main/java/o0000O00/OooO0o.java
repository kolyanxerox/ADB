package o0000O00;

import Oooo0o.OooO;
import com.google.android.gms.internal.ads.et0;

/* loaded from: classes2.dex */
public final class OooO0o extends OooO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f29375OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooO0o(byte[] bArr, int i) {
        super(bArr, 4);
        this.f29375OooO0OO = i;
    }

    @Override // Oooo0o.OooO
    public final et0 OooO0o(int i, byte[] bArr) {
        switch (this.f29375OooO0OO) {
            case 0:
                return new OooO0OO(bArr, i, 0);
            default:
                return new OooO0OO(bArr, i, 1);
        }
    }
}

package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.ClientInfoOuterClass;

/* loaded from: classes3.dex */
public final class OooOO0 implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f28668OooO00o = new OooOO0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return ClientInfoOuterClass.Platform.forNumber(i) != null;
    }
}

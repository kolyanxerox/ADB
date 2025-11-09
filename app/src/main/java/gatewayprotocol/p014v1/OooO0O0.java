package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.AdRequestOuterClass;

/* loaded from: classes3.dex */
public final class OooO0O0 implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final OooO0O0 f28666OooO00o = new OooO0O0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return AdRequestOuterClass.AdRequestType.forNumber(i) != null;
    }
}

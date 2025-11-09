package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.OperativeEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o00000O implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o00000O f28675OooO00o = new o00000O();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(i) != null;
    }
}

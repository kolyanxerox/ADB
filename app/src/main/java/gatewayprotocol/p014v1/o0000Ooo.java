package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.OperativeEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o0000Ooo implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o0000Ooo f28678OooO00o = new o0000Ooo();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return OperativeEventRequestOuterClass.OperativeEventType.forNumber(i) != null;
    }
}

package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DynamicDeviceInfoOuterClass;

/* loaded from: classes3.dex */
public final class o0OOO0o implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o0OOO0o f28683OooO00o = new o0OOO0o();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DynamicDeviceInfoOuterClass.ConnectionType.forNumber(i) != null;
    }
}

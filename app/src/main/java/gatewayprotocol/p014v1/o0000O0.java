package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.TransactionEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o0000O0 implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o0000O0 f28676OooO00o = new o0000O0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return TransactionEventRequestOuterClass.TransactionState.forNumber(i) != null;
    }
}

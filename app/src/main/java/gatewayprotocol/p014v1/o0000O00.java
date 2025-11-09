package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.TransactionEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o0000O00 implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o0000O00 f28677OooO00o = new o0000O00();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return TransactionEventRequestOuterClass.StoreType.forNumber(i) != null;
    }
}

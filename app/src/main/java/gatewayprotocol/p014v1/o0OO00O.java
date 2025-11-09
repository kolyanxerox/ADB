package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;

/* loaded from: classes3.dex */
public final class o0OO00O implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o0OO00O f28682OooO00o = new o0OO00O();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return InitializationResponseOuterClass.AdFormat.forNumber(i) != null;
    }
}

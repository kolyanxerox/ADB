package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;

/* loaded from: classes3.dex */
public final class o00000 implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00000 f28674OooO00o = new o00000();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return NativeConfigurationOuterClass.ShowCompletionState.forNumber(i) != null;
    }
}

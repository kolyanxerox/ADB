package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.ClientInfoOuterClass;

/* loaded from: classes3.dex */
public final class OooO implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return ClientInfoOuterClass.Platform.forNumber(i);
    }
}

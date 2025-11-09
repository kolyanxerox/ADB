package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;

/* loaded from: classes3.dex */
public final class oo0o0Oo implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        InitializationResponseOuterClass.AdFormat adFormatForNumber = InitializationResponseOuterClass.AdFormat.forNumber(((Integer) obj).intValue());
        return adFormatForNumber == null ? InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
    }
}

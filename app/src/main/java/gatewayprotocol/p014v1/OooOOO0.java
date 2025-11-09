package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DeveloperConsentOuterClass;

/* loaded from: classes3.dex */
public final class OooOOO0 implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final OooOOO0 f28669OooO00o = new OooOOO0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(i) != null;
    }
}

package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DeveloperConsentOuterClass;

/* loaded from: classes3.dex */
public final class OooOOOO implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final OooOOOO f28670OooO00o = new OooOOOO();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DeveloperConsentOuterClass.DeveloperConsentType.forNumber(i) != null;
    }
}

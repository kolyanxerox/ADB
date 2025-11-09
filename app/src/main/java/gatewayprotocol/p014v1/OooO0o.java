package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.ClientInfoOuterClass;

/* loaded from: classes3.dex */
public final class OooO0o implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f28667OooO00o = new OooO0o();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return ClientInfoOuterClass.MediationProvider.forNumber(i) != null;
    }
}

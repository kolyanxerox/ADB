package gatewayprotocol.p014v1;

import gatewayprotocol.p014v1.AllowedPiiKt;
import gatewayprotocol.p014v1.AllowedPiiOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class AllowedPiiKtKt {
    /* renamed from: -initializeallowedPii, reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m13809initializeallowedPii(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builderNewBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, Oooo000 block) {
        OooOo.OooO0o0(allowedPii, "<this>");
        OooOo.OooO0o0(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        OooOo.OooO0Oo(builder, "this.toBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

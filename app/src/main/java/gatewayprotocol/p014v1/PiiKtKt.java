package gatewayprotocol.p014v1;

import gatewayprotocol.p014v1.PiiKt;
import gatewayprotocol.p014v1.PiiOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class PiiKtKt {
    /* renamed from: -initializepii, reason: not valid java name */
    public static final PiiOuterClass.Pii m13840initializepii(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builderNewBuilder = PiiOuterClass.Pii.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PiiOuterClass.Pii copy(PiiOuterClass.Pii pii, Oooo000 block) {
        OooOo.OooO0o0(pii, "<this>");
        OooOo.OooO0o0(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builder = pii.toBuilder();
        OooOo.OooO0Oo(builder, "this.toBuilder()");
        PiiKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

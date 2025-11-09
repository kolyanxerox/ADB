package gatewayprotocol.p014v1;

import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import gatewayprotocol.p014v1.PlacementKt;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class PlacementKtKt {
    /* renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m13841initializeplacement(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builderNewBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, Oooo000 block) {
        OooOo.OooO0o0(placement, "<this>");
        OooOo.OooO0o0(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        OooOo.OooO0Oo(builder, "this.toBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

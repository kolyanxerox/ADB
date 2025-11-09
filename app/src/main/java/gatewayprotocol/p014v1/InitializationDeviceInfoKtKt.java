package gatewayprotocol.p014v1;

import gatewayprotocol.p014v1.InitializationDeviceInfoKt;
import gatewayprotocol.p014v1.InitializationRequestOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class InitializationDeviceInfoKtKt {
    /* renamed from: -initializeinitializationDeviceInfo, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationDeviceInfo m13831initializeinitializationDeviceInfo(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        InitializationDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo copy(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo, Oooo000 block) {
        OooOo.OooO0o0(initializationDeviceInfo, "<this>");
        OooOo.OooO0o0(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder = initializationDeviceInfo.toBuilder();
        OooOo.OooO0Oo(builder, "this.toBuilder()");
        InitializationDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

package gatewayprotocol.p014v1;

import gatewayprotocol.p014v1.ErrorKt;
import gatewayprotocol.p014v1.ErrorOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class ErrorKtKt {
    /* renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m13824initializeerror(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builderNewBuilder = ErrorOuterClass.Error.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, Oooo000 block) {
        OooOo.OooO0o0(error, "<this>");
        OooOo.OooO0o0(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        OooOo.OooO0Oo(builder, "this.toBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

package gatewayprotocol.p014v1;

import gatewayprotocol.p014v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.p014v1.TokenCountersKt;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class TokenCountersKtKt {
    /* renamed from: -initializetokenCounters, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.TokenCounters m13853initializetokenCounters(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, Oooo000 block) {
        OooOo.OooO0o0(tokenCounters, "<this>");
        OooOo.OooO0o0(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = tokenCounters.toBuilder();
        OooOo.OooO0Oo(builder, "this.toBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

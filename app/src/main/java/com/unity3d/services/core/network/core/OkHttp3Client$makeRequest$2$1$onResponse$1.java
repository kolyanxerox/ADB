package com.unity3d.services.core.network.core;

import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00OOOoO.o0000;
import o00OOOoO.o0000oo;

/* loaded from: classes3.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ o0000 $buffer;
    final /* synthetic */ o0000oo $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$1(o0000oo o0000ooVar, o0000 o0000Var) {
        super(0);
        this.$source = o0000ooVar;
        this.$buffer = o0000Var;
    }

    @Override // o00O0Oo.OooO0O0
    public final Long invoke() {
        return Long.valueOf(this.$source.OooO0oO(8192L, this.$buffer));
    }
}

package com.unity3d.services.core.network.core;

import java.io.IOException;
import kotlin.jvm.internal.Oooo000;
import o00OOO0.OooO;
import o00OOO0.o0Oo0oo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class RefactoredOkHttp3Client$execute$2$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ OooO $call;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefactoredOkHttp3Client$execute$2$1(OooO oooO) {
        super(1);
        this.$call = oooO;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
        invoke((Throwable) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(Throwable th) throws IOException {
        ((o0Oo0oo) this.$call).cancel();
    }
}

package com.unity3d.services.core.domain.task;

import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import oo00o.OooOOO0;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeSDK", m13472f = "InitializeSDK.kt", m13473l = {120}, m13474m = "executeErrorState-BWLJW6A")
/* loaded from: classes3.dex */
public final class InitializeSDK$executeErrorState$1 extends OooO0OO {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = initializeSDK;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM13788executeErrorStateBWLJW6A = this.this$0.m13788executeErrorStateBWLJW6A(null, null, null, this);
        return objM13788executeErrorStateBWLJW6A == OooOo00.f31365OooOo0O ? objM13788executeErrorStateBWLJW6A : new OooOOO0(objM13788executeErrorStateBWLJW6A);
    }
}

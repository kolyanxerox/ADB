package com.unity3d.services.core.domain.task;

import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import oo00o.OooOOO0;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateReset", m13472f = "InitializeStateReset.kt", m13473l = {33}, m13474m = "doWork-gIAlu-s$suspendImpl")
/* loaded from: classes3.dex */
public final class InitializeStateReset$doWork$1 extends OooO0OO {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = initializeStateReset;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM13799doWorkgIAlus$suspendImpl = InitializeStateReset.m13799doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM13799doWorkgIAlus$suspendImpl == OooOo00.f31365OooOo0O ? objM13799doWorkgIAlus$suspendImpl : new OooOOO0(objM13799doWorkgIAlus$suspendImpl);
    }
}

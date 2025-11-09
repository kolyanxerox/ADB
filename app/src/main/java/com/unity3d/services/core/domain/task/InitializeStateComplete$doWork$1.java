package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateComplete;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import oo00o.OooOOO0;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateComplete", m13472f = "InitializeStateComplete.kt", m13473l = {18}, m13474m = "doWork-gIAlu-s")
/* loaded from: classes3.dex */
public final class InitializeStateComplete$doWork$1 extends OooO0OO {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = initializeStateComplete;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo13783doWorkgIAlus = this.this$0.mo13783doWorkgIAlus((InitializeStateComplete.Params) null, (o00O0O0O.OooO0OO) this);
        return objMo13783doWorkgIAlus == OooOo00.f31365OooOo0O ? objMo13783doWorkgIAlus : new OooOOO0(objMo13783doWorkgIAlus);
    }
}

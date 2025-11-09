package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateConfig;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import oo00o.OooOOO0;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateConfig", m13472f = "InitializeStateConfig.kt", m13473l = {24}, m13474m = "doWork-gIAlu-s")
/* loaded from: classes3.dex */
public final class InitializeStateConfig$doWork$1 extends OooO0OO {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$1(InitializeStateConfig initializeStateConfig, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = initializeStateConfig;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo13783doWorkgIAlus = this.this$0.mo13783doWorkgIAlus((InitializeStateConfig.Params) null, (o00O0O0O.OooO0OO) this);
        return objMo13783doWorkgIAlus == OooOo00.f31365OooOo0O ? objMo13783doWorkgIAlus : new OooOOO0(objMo13783doWorkgIAlus);
    }
}

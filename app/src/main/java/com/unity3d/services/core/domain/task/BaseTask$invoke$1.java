package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import oo00o.OooOOO0;

@OooO(m13471c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", m13472f = "BaseTask.kt", m13473l = {11}, m13474m = "invoke-gIAlu-s")
/* loaded from: classes3.dex */
public final class BaseTask$invoke$1<P extends BaseParams, R> extends OooO0OO {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM13785invokegIAlus = BaseTask.DefaultImpls.m13785invokegIAlus(null, null, this);
        return objM13785invokegIAlus == OooOo00.f31365OooOo0O ? objM13785invokegIAlus : new OooOOO0(objM13785invokegIAlus);
    }
}

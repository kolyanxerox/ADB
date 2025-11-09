package com.unity3d.services.core.domain.task;

import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import oo00o.OooOOO0;

@OooO(m13471c = "com.unity3d.services.core.domain.task.MetricTask", m13472f = "MetricTask.kt", m13473l = {24}, m13474m = "invoke-gIAlu-s$suspendImpl")
/* loaded from: classes3.dex */
public final class MetricTask$invoke$1 extends OooO0OO {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = metricTask;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM13801invokegIAlus$suspendImpl = MetricTask.m13801invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM13801invokegIAlus$suspendImpl == OooOo00.f31365OooOo0O ? objM13801invokegIAlus$suspendImpl : new OooOOO0(objM13801invokegIAlus$suspendImpl);
    }
}

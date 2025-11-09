package com.unity3d.services.core.domain.task;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.p012di.IServiceProvider;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0OO00O;
import o00O0O0O.OooO0OO;
import oo00o.OooOO0O;

/* loaded from: classes3.dex */
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;
    private String taskStatus = "unknown";

    private final void captureMetric(Object obj) {
        this.taskStatus = !(obj instanceof OooOO0O) ? "success" : "failure";
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        OooOo.OooO0Oo(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", o0OO00O.OooO00o(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: invoke-gIAlu-s$suspendImpl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m13801invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask<? super P, R> r8, P r9, o00O0O0O.OooO0OO r10) {
        /*
            boolean r0 = r10 instanceof com.unity3d.services.core.domain.task.MetricTask$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.MetricTask$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.MetricTask$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            long r8 = r0.J$0
            java.lang.Object r1 = r0.L$4
            java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
            java.lang.Object r2 = r0.L$3
            com.unity3d.services.core.domain.task.MetricTask r2 = (com.unity3d.services.core.domain.task.MetricTask) r2
            java.lang.Object r3 = r0.L$2
            kotlin.jvm.internal.o0Oo0oo r3 = (kotlin.jvm.internal.o0Oo0oo) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.o0Oo0oo r4 = (kotlin.jvm.internal.o0Oo0oo) r4
            java.lang.Object r0 = r0.L$0
            com.unity3d.services.core.domain.task.MetricTask r0 = (com.unity3d.services.core.domain.task.MetricTask) r0
            o00O0.o000OOo.OooOO0O(r10)
            oo00o.OooOOO0 r10 = (oo00o.OooOOO0) r10
            java.lang.Object r10 = r10.f33191OooOo0O
            r6 = r8
            r9 = r4
            r4 = r6
            r8 = r2
            goto L75
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            o00O0.o000OOo.OooOO0O(r10)
            kotlin.jvm.internal.o0Oo0oo r10 = new kotlin.jvm.internal.o0Oo0oo
            r10.<init>()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = java.lang.System.nanoTime()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r10
            r0.L$3 = r8
            r0.L$4 = r2
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m13785invokegIAlus(r8, r9, r0)
            if (r9 != r1) goto L70
            return r1
        L70:
            r0 = r8
            r3 = r10
            r1 = r2
            r10 = r9
            r9 = r3
        L75:
            r3.f28880OooOo0O = r10
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            long r1 = r1.toMillis(r2)
            r8.duration = r1
            java.lang.Object r8 = r9.f28880OooOo0O
            r0.captureMetric(r8)
            java.lang.Object r8 = r9.f28880OooOo0O
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.MetricTask.m13801invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask, com.unity3d.services.core.domain.task.BaseParams, o00O0O0O.OooO0OO):java.lang.Object");
    }

    private final void sendMetric() {
        String metricName = getMetricName();
        if (metricName == null || metricName.length() == 0) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final long getDuration() {
        return this.duration;
    }

    public String getMetricName() {
        return null;
    }

    public final String getMetricNameForInitializeTask(String name) {
        OooOo.OooO0o0(name, "name");
        StringBuilder sb = new StringBuilder("native_");
        sb.append(name);
        sb.append("_task_");
        return OooO0oO.OooOo.OooOOOo(sb, this.taskStatus, "_time");
    }

    public final String getMetricNameForTask(Object task) {
        OooOo.OooO0o0(task, "task");
        String simpleName = task.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String strSubstring = simpleName.substring(getStatePrefixLength());
        OooOo.OooO0Oo(strSubstring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        OooOo.OooO0Oo(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return OooO00o.OooOOO0(new StringBuilder(lowerCase.length() + 13), "native_", lowerCase, "_state");
    }

    @Override // com.unity3d.services.core.p012di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: invoke-gIAlu-s */
    public Object mo13784invokegIAlus(P p, OooO0OO oooO0OO) {
        return m13801invokegIAlus$suspendImpl(this, p, oooO0OO);
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTaskStatus(String str) {
        OooOo.OooO0o0(str, "<set-?>");
        this.taskStatus = str;
    }
}

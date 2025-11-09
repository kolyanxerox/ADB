package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.IServiceProvider;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    public static final class DefaultImpls {
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* renamed from: invoke-gIAlu-s, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m13785invokegIAlus(com.unity3d.services.core.domain.task.BaseTask<? super P, R> r4, P r5, o00O0O0O.OooO0OO r6) {
            /*
                boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                o00O0.o000OOo.OooOO0O(r6)
                oo00o.OooOOO0 r6 = (oo00o.OooOOO0) r6
                java.lang.Object r4 = r6.f33191OooOo0O
                return r4
            L2b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L33:
                o00O0.o000OOo.OooOO0O(r6)
                r0.label = r3
                java.lang.Object r4 = r4.mo13783doWorkgIAlus(r5, r0)
                if (r4 != r1) goto L3f
                return r1
            L3f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m13785invokegIAlus(com.unity3d.services.core.domain.task.BaseTask, com.unity3d.services.core.domain.task.BaseParams, o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo13783doWorkgIAlus(P p, OooO0OO oooO0OO);

    /* renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo13784invokegIAlus(P p, OooO0OO oooO0OO);
}

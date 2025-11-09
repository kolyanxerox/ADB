package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.IServiceProvider;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import oo00o.OooO0OO;
import oo00o.OooO0o;

/* loaded from: classes3.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    public RequestPolicy requestPolicy;
    private final OooO0OO universalRequestDataSource$delegate;
    private final OooO0OO universalRequestEventSender$delegate;
    private final WorkerParameters workerParams;

    @OooO(m13471c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", m13472f = "UniversalRequestJob.kt", m13473l = {25, 28, 31}, m13474m = "doWork$suspendImpl")
    /* renamed from: com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1 */
    public static final class C41891 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41891(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UniversalRequestJob.doWork$suspendImpl(UniversalRequestJob.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(workerParams, "workerParams");
        this.workerParams = workerParams;
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        this.universalRequestEventSender$delegate = o0OOO0.OooO0oO(oooO0o, new UniversalRequestJob$special$$inlined$inject$default$1(this, ""));
        this.universalRequestDataSource$delegate = o0OOO0.OooO0oO(oooO0o, new UniversalRequestJob$special$$inlined$inject$default$2(this, ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r9.remove(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob r8, o00O0O0O.OooO0OO r9) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.work.UniversalRequestJob.C41891
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.UniversalRequestJob.C41891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            o00O0.o000OOo.OooOO0O(r9)
            goto Lc1
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.UniversalRequestJob r2 = (com.unity3d.ads.core.domain.work.UniversalRequestJob) r2
            o00O0.o000OOo.OooOO0O(r9)     // Catch: java.lang.Throwable -> L42
            goto La4
        L42:
            r9 = move-exception
            goto La7
        L44:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.UniversalRequestJob r2 = (com.unity3d.ads.core.domain.work.UniversalRequestJob) r2
            o00O0.o000OOo.OooOO0O(r9)
            goto L80
        L50:
            o00O0.o000OOo.OooOO0O(r9)
            androidx.work.WorkerParameters r9 = r8.workerParams
            androidx.work.Data r9 = r9.getInputData()
            java.lang.String r2 = "universalRequestId"
            java.lang.String r9 = r9.getString(r2)
            if (r9 != 0) goto L6b
            androidx.work.ListenableWorker$Result r8 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r9 = "success()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r8, r9)
            return r8
        L6b:
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r2 = r8.getUniversalRequestDataSource()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L7c
            goto Lc0
        L7c:
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r7
        L80:
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore r9 = (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) r9
            com.google.protobuf.ByteString r9 = r9.getUniversalRequestMapOrThrow(r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r9 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(r9)
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r5 = r2.getUniversalRequestEventSender()     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "universalRequest"
            kotlin.jvm.internal.OooOo.OooO0Oo(r9, r6)     // Catch: java.lang.Throwable -> L42
            com.unity3d.ads.gatewayclient.RequestPolicy r6 = r2.getRequestPolicy()     // Catch: java.lang.Throwable -> L42
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L42
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L42
            r0.label = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r9 = r5.invoke(r9, r6, r0)     // Catch: java.lang.Throwable -> L42
            if (r9 != r1) goto La4
            goto Lc0
        La4:
            oo00o.OooOo r9 = oo00o.OooOo.f33195OooO00o     // Catch: java.lang.Throwable -> L42
            goto Lab
        La7:
            oo00o.OooOO0O r9 = o00O0.o000OOo.OooO0O0(r9)
        Lab:
            boolean r9 = r9 instanceof oo00o.OooOO0O
            if (r9 != 0) goto Lcb
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r9 = r2.getUniversalRequestDataSource()
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r9.remove(r8, r0)
            if (r8 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            androidx.work.ListenableWorker$Result r8 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r9 = "{\n            universalR…esult.success()\n        }"
            kotlin.jvm.internal.OooOo.OooO0Oo(r8, r9)
            goto Ld4
        Lcb:
            androidx.work.ListenableWorker$Result r8 = androidx.work.ListenableWorker.Result.retry()
            java.lang.String r9 = "{\n            Result.retry()\n        }"
            kotlin.jvm.internal.OooOo.OooO0Oo(r8, r9)
        Ld4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(o00O0O0O.OooO0OO oooO0OO) {
        return doWork$suspendImpl(this, oooO0OO);
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        OooOo.OooOO0o("requestPolicy");
        throw null;
    }

    @Override // com.unity3d.services.core.p012di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy) {
        OooOo.OooO0o0(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }
}

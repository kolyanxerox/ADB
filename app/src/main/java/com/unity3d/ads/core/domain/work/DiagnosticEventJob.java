package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.ServiceProvider;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import oo00o.OooO0OO;
import oo00o.OooO0o;

/* loaded from: classes3.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {
    private final OooO0OO diagnosticEventRequestWorkModifier$delegate;
    private final OooO0OO getDiagnosticRequestPolicy$delegate;

    @OooO(m13471c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", m13472f = "DiagnosticEventJob.kt", m13473l = {22, 25, 27}, m13474m = "doWork")
    /* renamed from: com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 */
    public static final class C41861 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41861(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DiagnosticEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(workerParams, "workerParams");
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        this.getDiagnosticRequestPolicy$delegate = o0OOO0.OooO0oO(oooO0o, new DiagnosticEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OTHER_REQ));
        this.diagnosticEventRequestWorkModifier$delegate = o0OOO0.OooO0oO(oooO0o, new DiagnosticEventJob$special$$inlined$inject$default$2(this, ""));
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1 A[RETURN] */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(o00O0O0O.OooO0OO r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.work.DiagnosticEventJob.C41861
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob.C41861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            o00O0.o000OOo.OooOO0O(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r2 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r2
            o00O0.o000OOo.OooOO0O(r10)
            goto Lab
        L3e:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r6 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r6
            o00O0.o000OOo.OooOO0O(r10)
            goto L79
        L4a:
            o00O0.o000OOo.OooOO0O(r10)
            androidx.work.WorkerParameters r10 = r9.getWorkerParams()
            androidx.work.Data r10 = r10.getInputData()
            java.lang.String r2 = "universalRequestId"
            java.lang.String r2 = r10.getString(r2)
            if (r2 != 0) goto L67
            androidx.work.ListenableWorker$Result r10 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r0 = "success()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r10, r0)
            return r10
        L67:
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r10 = r9.getUniversalRequestDataSource()
            r0.L$0 = r9
            r0.L$1 = r2
            r0.label = r6
            java.lang.Object r10 = r10.get(r0)
            if (r10 != r1) goto L78
            goto Lc0
        L78:
            r6 = r9
        L79:
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore r10 = (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) r10
            com.google.protobuf.ByteString r10 = r10.getUniversalRequestMapOrThrow(r2)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r10 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(r10)
            com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier r7 = r6.getDiagnosticEventRequestWorkModifier()
            java.lang.String r8 = "universalRequest"
            kotlin.jvm.internal.OooOo.OooO0Oo(r10, r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r10 = r7.invoke(r10)
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r7 = r6.getUniversalRequestDataSource()
            com.google.protobuf.ByteString r10 = r10.toByteString()
            java.lang.String r8 = "modifiedUniversalRequest.toByteString()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r10, r8)
            r0.L$0 = r6
            r0.L$1 = r3
            r0.label = r5
            java.lang.Object r10 = r7.set(r2, r10, r0)
            if (r10 != r1) goto Laa
            goto Lc0
        Laa:
            r2 = r6
        Lab:
            com.unity3d.ads.core.domain.GetRequestPolicy r10 = r2.getGetDiagnosticRequestPolicy()
            com.unity3d.ads.gatewayclient.RequestPolicy r10 = r10.invoke()
            r2.setRequestPolicy(r10)
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r10 = super.doWork(r0)
            if (r10 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork(o00O0O0O.OooO0OO):java.lang.Object");
    }
}

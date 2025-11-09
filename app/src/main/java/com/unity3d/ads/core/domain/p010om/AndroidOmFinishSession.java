package com.unity3d.ads.core.domain.p010om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class AndroidOmFinishSession implements OmFinishSession {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @OooO(m13471c = "com.unity3d.ads.core.domain.om.AndroidOmFinishSession", m13472f = "AndroidOmFinishSession.kt", m13473l = {17}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 */
    public static final class C41801 extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41801(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOmFinishSession.this.invoke(null, this);
        }
    }

    public AndroidOmFinishSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        OooOo.OooO0o0(openMeasurementRepository, "openMeasurementRepository");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.p010om.OmFinishSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r12, o00O0O0O.OooO0OO r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.p010om.AndroidOmFinishSession.C41801
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = (com.unity3d.ads.core.domain.p010om.AndroidOmFinishSession.C41801) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r12 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r12 = (com.unity3d.ads.core.data.model.AdObject) r12
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession r0 = (com.unity3d.ads.core.domain.p010om.AndroidOmFinishSession) r0
            o00O0.o000OOo.OooOO0O(r13)
        L2e:
            r7 = r12
            goto L50
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            o00O0.o000OOo.OooOO0O(r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r13 = r11.openMeasurementRepository
            com.google.protobuf.ByteString r2 = r12.getOpportunityId()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r13 = r13.finishSession(r2, r0)
            if (r13 != r1) goto L4e
            return r1
        L4e:
            r0 = r11
            goto L2e
        L50:
            com.unity3d.ads.core.data.model.OMResult r13 = (com.unity3d.ads.core.data.model.OMResult) r13
            boolean r12 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r12 == 0) goto L65
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r0.sendDiagnosticEvent
            r6 = 0
            r8 = 0
            java.lang.String r3 = "om_session_finish_success"
            r4 = 0
            r5 = 0
            r9 = 46
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L98
        L65:
            boolean r12 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r12 == 0) goto L98
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r0.sendDiagnosticEvent
            o00O0O00.OooOO0 r12 = o00O0.o0O0O00.OooOOO0()
            com.unity3d.ads.core.data.model.OMResult$Failure r13 = (com.unity3d.ads.core.data.model.OMResult.Failure) r13
            java.lang.String r0 = r13.getReason()
            java.lang.String r1 = "reason"
            r12.put(r1, r0)
            java.lang.String r0 = r13.getReasonDebug()
            if (r0 == 0) goto L89
            java.lang.String r0 = "reason_debug"
            java.lang.String r13 = r13.getReasonDebug()
            r12.put(r0, r13)
        L89:
            o00O0O00.OooOO0 r5 = o00O0.o0O0O00.OooOO0o(r12)
            r6 = 0
            r8 = 0
            java.lang.String r3 = "om_session_finish_failure"
            r4 = 0
            r9 = 42
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L98:
            oo00o.OooOo r12 = oo00o.OooOo.f33195OooO00o
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.p010om.AndroidOmFinishSession.invoke(com.unity3d.ads.core.data.model.AdObject, o00O0O0O.OooO0OO):java.lang.Object");
    }
}

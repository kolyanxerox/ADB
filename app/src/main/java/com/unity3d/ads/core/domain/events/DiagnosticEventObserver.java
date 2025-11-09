package com.unity3d.ads.core.domain.events;

import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p014v1.UniversalRequestKt;
import gatewayprotocol.p014v1.UniversalRequestOuterClass;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;

/* loaded from: classes3.dex */
public final class DiagnosticEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final o0000O00 defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final o0OO isRunning;
    private final UniversalRequestDataSource universalRequestDataSource;

    @OooO(m13471c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", m13472f = "DiagnosticEventObserver.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2 */
    public static final class C41232 extends OooOOOO implements o00O0O {
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", m13472f = "DiagnosticEventObserver.kt", m13473l = {42, 45}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DiagnosticEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DiagnosticEventObserver diagnosticEventObserver, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = diagnosticEventObserver;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, oooO0OO);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                String str;
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = (List) this.L$0;
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    DiagnosticEventObserver diagnosticEventObserver = this.this$0;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
                    UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setDiagnosticEventRequest(diagnosticEventObserver.getDiagnosticEventBatchRequest.invoke(list));
                    UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                    GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                    this.label = 1;
                    obj = getUniversalRequestForPayLoad.invoke(payload_build, this);
                    if (obj != oooOo00) {
                    }
                    return oooOo00;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    o000OOo.OooOO0O(obj);
                    UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker = this.this$0.backgroundWorker;
                    Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                    OooOo.OooO0Oo(constraintsBuild, "Builder()\n            .s…TED)\n            .build()");
                    OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(DiagnosticEventJob.class).setConstraints(constraintsBuild).setInputData(universalRequestWorkerData.invoke()).addTag(BackgroundWorker.TAG).build();
                    OooOo.OooO0Oo(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker.getWorkManager().enqueue(oneTimeWorkRequestBuild);
                    return oo00o.OooOo.f33195OooO00o;
                }
                o000OOo.OooOO0O(obj);
                String string = UUID.randomUUID().toString();
                OooOo.OooO0Oo(string, "randomUUID().toString()");
                UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                OooOo.OooO0Oo(byteArray, "fullRequest.toByteArray()");
                ByteString byteString = ByteStringsKt.toByteString(byteArray);
                this.L$0 = string;
                this.label = 2;
                if (universalRequestDataSource.set(string, byteString, this) != oooOo00) {
                    str = string;
                    UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                    Constraints constraintsBuild2 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                    OooOo.OooO0Oo(constraintsBuild2, "Builder()\n            .s…TED)\n            .build()");
                    OneTimeWorkRequest oneTimeWorkRequestBuild2 = new OneTimeWorkRequest.Builder(DiagnosticEventJob.class).setConstraints(constraintsBuild2).setInputData(universalRequestWorkerData2.invoke()).addTag(BackgroundWorker.TAG).build();
                    OooOo.OooO0Oo(oneTimeWorkRequestBuild2, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker2.getWorkManager().enqueue(oneTimeWorkRequestBuild2);
                    return oo00o.OooOo.f33195OooO00o;
                }
                return oooOo00;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(list, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
            }
        }

        public C41232(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return DiagnosticEventObserver.this.new C41232(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            oO00000o oo00000o;
            Object value;
            Boolean bool;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            o0OO o0oo = DiagnosticEventObserver.this.isRunning;
            do {
                oo00000o = (oO00000o) o0oo;
                value = oo00000o.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!oo00000o.OooO0oO(value, Boolean.TRUE));
            boolean zBooleanValue = bool.booleanValue();
            oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
            if (zBooleanValue) {
                return oooOo;
            }
            o0o0000.OooOOo0(new o0O0OOO0(DiagnosticEventObserver.this.diagnosticEventRepository.getDiagnosticEvents(), new AnonymousClass2(DiagnosticEventObserver.this, null), 2), o0000OO0.OooO0O0(DiagnosticEventObserver.this.defaultDispatcher));
            return oooOo;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41232) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    public DiagnosticEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, o0000O00 defaultDispatcher, DiagnosticEventRepository diagnosticEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        OooOo.OooO0o0(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        OooOo.OooO0o0(getDiagnosticEventBatchRequest, "getDiagnosticEventBatchRequest");
        OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        OooOo.OooO0o0(diagnosticEventRepository, "diagnosticEventRepository");
        OooOo.OooO0o0(universalRequestDataSource, "universalRequestDataSource");
        OooOo.OooO0o0(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.defaultDispatcher = defaultDispatcher;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = o0o0000.OooO0OO(Boolean.FALSE);
    }

    public final Object invoke(OooO0OO oooO0OO) throws Throwable {
        Object objOooo00O = o0000OO0.Oooo00O(new C41232(null), this.defaultDispatcher, oooO0OO);
        return objOooo00O == OooOo00.f31365OooOo0O ? objOooo00O : oo00o.OooOo.f33195OooO00o;
    }
}

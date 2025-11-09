package com.unity3d.ads.core.domain.events;

import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.OperativeEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import gatewayprotocol.p014v1.OperativeEventRequestOuterClass;
import gatewayprotocol.p014v1.UniversalRequestKt;
import gatewayprotocol.p014v1.UniversalRequestOuterClass;
import java.util.UUID;
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
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final o0000O00 defaultDispatcher;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final o0OO isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final UniversalRequestDataSource universalRequestDataSource;

    @OooO(m13471c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", m13472f = "OperativeEventObserver.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2 */
    public static final class C41272 extends OooOOOO implements o00O0O {
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", m13472f = "OperativeEventObserver.kt", m13473l = {40, 43}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OperativeEventObserver operativeEventObserver, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = operativeEventObserver;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, oooO0OO);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(operativeEventRequest, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                String str;
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
                    UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setOperativeEvent(operativeEventRequest);
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
                    kotlin.jvm.internal.OooOo.OooO0Oo(constraintsBuild, "Builder()\n            .s…TED)\n            .build()");
                    OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setConstraints(constraintsBuild).setInputData(universalRequestWorkerData.invoke()).addTag(BackgroundWorker.TAG).build();
                    kotlin.jvm.internal.OooOo.OooO0Oo(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker.getWorkManager().enqueue(oneTimeWorkRequestBuild);
                    return OooOo.f33195OooO00o;
                }
                o000OOo.OooOO0O(obj);
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOo.OooO0Oo(string, "randomUUID().toString()");
                UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                kotlin.jvm.internal.OooOo.OooO0Oo(byteArray, "fullRequest.toByteArray()");
                ByteString byteString = ByteStringsKt.toByteString(byteArray);
                this.L$0 = string;
                this.label = 2;
                if (universalRequestDataSource.set(string, byteString, this) != oooOo00) {
                    str = string;
                    UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                    Constraints constraintsBuild2 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                    kotlin.jvm.internal.OooOo.OooO0Oo(constraintsBuild2, "Builder()\n            .s…TED)\n            .build()");
                    OneTimeWorkRequest oneTimeWorkRequestBuild2 = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setConstraints(constraintsBuild2).setInputData(universalRequestWorkerData2.invoke()).addTag(BackgroundWorker.TAG).build();
                    kotlin.jvm.internal.OooOo.OooO0Oo(oneTimeWorkRequestBuild2, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker2.getWorkManager().enqueue(oneTimeWorkRequestBuild2);
                    return OooOo.f33195OooO00o;
                }
                return oooOo00;
            }
        }

        public C41272(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return OperativeEventObserver.this.new C41272(oooO0OO);
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
            o0OO o0oo = OperativeEventObserver.this.isRunning;
            do {
                oo00000o = (oO00000o) o0oo;
                value = oo00000o.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!oo00000o.OooO0oO(value, Boolean.TRUE));
            boolean zBooleanValue = bool.booleanValue();
            OooOo oooOo = OooOo.f33195OooO00o;
            if (zBooleanValue) {
                return oooOo;
            }
            o0o0000.OooOOo0(new o0O0OOO0(OperativeEventObserver.this.operativeEventRepository.getOperativeEvents(), new AnonymousClass2(OperativeEventObserver.this, null), 2), o0000OO0.OooO0O0(OperativeEventObserver.this.defaultDispatcher));
            return oooOo;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41272) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, o0000O00 defaultDispatcher, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        kotlin.jvm.internal.OooOo.OooO0o0(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(operativeEventRepository, "operativeEventRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(universalRequestDataSource, "universalRequestDataSource");
        kotlin.jvm.internal.OooOo.OooO0o0(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = o0o0000.OooO0OO(Boolean.FALSE);
    }

    public final Object invoke(OooO0OO oooO0OO) throws Throwable {
        Object objOooo00O = o0000OO0.Oooo00O(new C41272(null), this.defaultDispatcher, oooO0OO);
        return objOooo00O == OooOo00.f31365OooOo0O ? objOooo00O : OooOo.f33195OooO00o;
    }
}

package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Iterator;
import java.util.List;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.oo0o0Oo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public class MeasurementManagerImplCommon extends MeasurementManager {
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    @OooO(m13471c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", m13472f = "MeasurementManagerImplCommon.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4 */
    public static final class C06444 extends OooOOOO implements o00O0O {
        final /* synthetic */ SourceRegistrationRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MeasurementManagerImplCommon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06444(SourceRegistrationRequest sourceRegistrationRequest, MeasurementManagerImplCommon measurementManagerImplCommon, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$request = sourceRegistrationRequest;
            this.this$0 = measurementManagerImplCommon;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C06444 c06444 = new C06444(this.$request, this.this$0, oooO0OO);
            c06444.L$0 = obj;
            return c06444;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            o000OO o000oo2 = (o000OO) this.L$0;
            List<Uri> registrationUris = this.$request.getRegistrationUris();
            MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
            SourceRegistrationRequest sourceRegistrationRequest = this.$request;
            Iterator<T> it = registrationUris.iterator();
            while (it.hasNext()) {
                o0000OO0.OooOo0(o000oo2, null, new MeasurementManagerImplCommon$registerSource$4$1$1(measurementManagerImplCommon, (Uri) it.next(), sourceRegistrationRequest, null), 3);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C06444) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager mMeasurementManager) {
        kotlin.jvm.internal.OooOo.OooO0o0(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    public static Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    public static Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, OooO0OO oooO0OO) throws Throwable {
        Object objOooOO0 = o0000OO0.OooOO0(new C06444(sourceRegistrationRequest, measurementManagerImplCommon, null), oooO0OO);
        return objOooOO0 == OooOo00.f31365OooOo0O ? objOooOO0 : OooOo.f33195OooO00o;
    }

    public static Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri, new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    public static Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    public static Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object deleteRegistrations(DeletionRequest deletionRequest, OooO0OO oooO0OO) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, oooO0OO);
    }

    public final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object getMeasurementApiStatus(OooO0OO oooO0OO) {
        return getMeasurementApiStatus$suspendImpl(this, oooO0OO);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerSource(Uri uri, InputEvent inputEvent, OooO0OO oooO0OO) {
        return registerSource$suspendImpl(this, uri, inputEvent, oooO0OO);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerTrigger(Uri uri, OooO0OO oooO0OO) {
        return registerTrigger$suspendImpl(this, uri, oooO0OO);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, OooO0OO oooO0OO) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, oooO0OO);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, OooO0OO oooO0OO) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, oooO0OO);
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object registerSource(SourceRegistrationRequest sourceRegistrationRequest, OooO0OO oooO0OO) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, oooO0OO);
    }
}

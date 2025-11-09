package androidx.privacysandbox.ads.adservices.java.measurement;

import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", m13472f = "MeasurementManagerFutures.kt", m13473l = {182}, m13474m = "invokeSuspend")
/* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1 */
/* loaded from: classes.dex */
public final class C0643x91b1fc89 extends OooOOOO implements o00O0O {
    final /* synthetic */ WebTriggerRegistrationRequest $request;
    int label;
    final /* synthetic */ MeasurementManagerFutures.Api33Ext5JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643x91b1fc89(MeasurementManagerFutures.Api33Ext5JavaImpl api33Ext5JavaImpl, WebTriggerRegistrationRequest webTriggerRegistrationRequest, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = api33Ext5JavaImpl;
        this.$request = webTriggerRegistrationRequest;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new C0643x91b1fc89(this.this$0, this.$request, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            MeasurementManager measurementManager = this.this$0.mMeasurementManager;
            WebTriggerRegistrationRequest webTriggerRegistrationRequest = this.$request;
            this.label = 1;
            if (measurementManager.registerWebTrigger(webTriggerRegistrationRequest, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((C0643x91b1fc89) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}

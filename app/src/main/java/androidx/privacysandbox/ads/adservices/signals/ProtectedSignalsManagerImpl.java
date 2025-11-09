package androidx.privacysandbox.ads.adservices.signals;

import OooO0o0.OooO0O0;
import Oooo0o0.OooO;
import androidx.arch.core.executor.OooO00o;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0oOo.oo0o0Oo;

@ExperimentalFeatures.Ext12OptIn
/* loaded from: classes.dex */
public class ProtectedSignalsManagerImpl extends ProtectedSignalsManager {
    private final android.adservices.signals.ProtectedSignalsManager protectedSignalsManager;

    public ProtectedSignalsManagerImpl(android.adservices.signals.ProtectedSignalsManager protectedSignalsManager) {
        OooOo.OooO0o0(protectedSignalsManager, "protectedSignalsManager");
        this.protectedSignalsManager = protectedSignalsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.signals.UpdateSignalsRequest convertUpdateRequest(UpdateSignalsRequest updateSignalsRequest) {
        OooO0O0.OooOOoo();
        android.adservices.signals.UpdateSignalsRequest updateSignalsRequestBuild = OooO0O0.OooOOOO(updateSignalsRequest.getUpdateUri()).build();
        OooOo.OooO0Oo(updateSignalsRequestBuild, "Builder(request.updateUri).build()");
        return updateSignalsRequestBuild;
    }

    public static Object updateSignals$suspendImpl(ProtectedSignalsManagerImpl protectedSignalsManagerImpl, UpdateSignalsRequest updateSignalsRequest, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        protectedSignalsManagerImpl.protectedSignalsManager.updateSignals(protectedSignalsManagerImpl.convertUpdateRequest(updateSignalsRequest), new OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : oo00o.OooOo.f33195OooO00o;
    }

    @Override // androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager
    public Object updateSignals(UpdateSignalsRequest updateSignalsRequest, OooO0OO oooO0OO) {
        return updateSignals$suspendImpl(this, updateSignalsRequest, oooO0OO);
    }
}

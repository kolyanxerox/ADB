package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o0O0O00;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        OooOo.OooO0o0(getGameId, "getGameId");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z) {
        if (z) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(str, map, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, null, map, null, null, null, 58, null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z) {
        String strInvoke = this.getGameId.invoke();
        if (strInvoke == null) {
            strInvoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> mapOooOOo0 = o0O0O00.OooOOo0(new OooOO0("previous_game_id", previousGameId), new OooOO0("game_id", strInvoke));
        if (previousGameId.equals("null")) {
            return;
        }
        if (strInvoke.equals(previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", mapOooOOo0, z);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", mapOooOOo0, z);
        }
        boolean zIsTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map<String, String> mapOooOOo02 = o0O0O00.OooOOo0(new OooOO0("previous_test_mode", String.valueOf(previousTestMode)), new OooOO0("test_mode", String.valueOf(zIsTestMode)));
        if (zIsTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", mapOooOOo02, z);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", mapOooOOo02, z);
        }
    }
}

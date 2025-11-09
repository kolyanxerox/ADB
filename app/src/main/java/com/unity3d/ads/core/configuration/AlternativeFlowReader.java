package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import kotlin.jvm.internal.OooOo;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;

/* loaded from: classes3.dex */
public final class AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final o0OO isAlternativeFlowEnabled;
    private final o0OO isAlternativeFlowRead;
    private final MediationTraitsMetadataReader mediationMetadataReader;
    private final SessionRepository sessionRepository;

    public AlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository, MediationTraitsMetadataReader mediationMetadataReader) {
        OooOo.OooO0o0(configurationReader, "configurationReader");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(mediationMetadataReader, "mediationMetadataReader");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationMetadataReader;
        Boolean bool = Boolean.FALSE;
        this.isAlternativeFlowRead = o0o0000.OooO0OO(bool);
        this.isAlternativeFlowEnabled = o0o0000.OooO0OO(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean invoke() {
        /*
            r4 = this;
            o00O0ooo.o0OO r0 = r4.isAlternativeFlowRead
            o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            o00O0ooo.o0OO r0 = r4.isAlternativeFlowEnabled
            o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            com.unity3d.ads.core.configuration.MediationTraitsMetadataReader r0 = r4.mediationMetadataReader
            com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
            java.lang.String r0 = r0.getKey()
            java.lang.Object r0 = r1.get(r0)
            r1 = 0
            if (r0 == 0) goto L38
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 != 0) goto L39
        L38:
            r0 = r1
        L39:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L67
            java.lang.String r2 = "boldSdkEnabled"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            if (r0 == 0) goto L67
            o00O0ooo.o0OO r3 = r4.isAlternativeFlowEnabled
            boolean r0 = r0.optBoolean(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            o00O0ooo.oO00000o r3 = (o00O0ooo.oO00000o) r3
            r3.getClass()
            r3.OooO(r1, r0)
            o00O0ooo.o0OO r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
            r0.getClass()
            r0.OooO(r1, r2)
        L67:
            o00O0ooo.o0OO r0 = r4.isAlternativeFlowRead
            o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb5
            o00O0ooo.o0OO r0 = r4.isAlternativeFlowEnabled
            com.unity3d.services.core.configuration.ConfigurationReader r2 = r4.configurationReader
            com.unity3d.services.core.configuration.Configuration r2 = r2.getCurrentConfiguration()
            com.unity3d.services.core.configuration.IExperiments r2 = r2.getExperiments()
            boolean r2 = r2.isBoldSdkNextSessionEnabled()
            if (r2 != 0) goto L9c
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r4.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r2 = r2.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r2 = r2.getFeatureFlags()
            boolean r2 = r2.getBoldSdkNextSessionEnabled()
            if (r2 == 0) goto L9a
            goto L9c
        L9a:
            r2 = 0
            goto L9d
        L9c:
            r2 = 1
        L9d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
            r0.getClass()
            r0.OooO(r1, r2)
            o00O0ooo.o0OO r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
            r0.getClass()
            r0.OooO(r1, r2)
        Lb5:
            o00O0ooo.o0OO r0 = r4.isAlternativeFlowEnabled
            o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.AlternativeFlowReader.invoke():boolean");
    }
}

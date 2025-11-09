package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.ClientInfoOuterClass;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00O0oO.o0000O00;

/* loaded from: classes3.dex */
public final class AndroidMediationRepository$mediationProvider$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    @Override // o00O0Oo.OooO0O0
    public final ClientInfoOuterClass.MediationProvider invoke() {
        String name = this.this$0.getName();
        if (name != null) {
            ClientInfoOuterClass.MediationProvider mediationProvider = o0000O00.Oooo0OO(name, "AppLovinSdk_", false) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : name.equalsIgnoreCase("AdMob") ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB : name.equalsIgnoreCase("MAX") ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : name.equalsIgnoreCase("ironSource") ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}

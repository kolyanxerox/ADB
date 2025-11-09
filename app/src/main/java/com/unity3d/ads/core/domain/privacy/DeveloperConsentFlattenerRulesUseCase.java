package com.unity3d.ads.core.domain.privacy;

import com.google.android.gms.internal.measurement.o0OO0O0;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import o00O0.OooOo;

/* loaded from: classes3.dex */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(OooOo.OooOOoo("privacy", "gdpr", "pipl", "user"), o0OO0O0.OooOO0o("value"), OooOo.OooOOoo("ts"));
    }
}

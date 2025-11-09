package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.y */
/* loaded from: classes2.dex */
public final class C3853y implements InterfaceC3220if {

    /* renamed from: a */
    private final InterfaceC3223ii f12689a;

    public C3853y(InterfaceC3223ii sessionDepthService) {
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDepthService, "sessionDepthService");
        this.f12689a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC3220if
    /* renamed from: a */
    public void mo9324a(Map<String, Object> output) {
        kotlin.jvm.internal.OooOo.OooO0o0(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C3451ne.f10420H0, Integer.valueOf(this.f12689a.mo9345a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(C3451ne.f10420H0, Integer.valueOf(this.f12689a.mo9345a(LevelPlay.AdFormat.REWARDED)));
        output.put(C3451ne.f10412E0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(C3451ne.f10420H0, Integer.valueOf(this.f12689a.mo9345a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(C3451ne.f10420H0, Integer.valueOf(this.f12689a.mo9345a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}

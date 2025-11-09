package com.ironsource;

import com.ironsource.C3611s;
import com.ironsource.InterfaceC3186hg;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.ironsource.pq */
/* loaded from: classes2.dex */
public final class C3533pq {

    /* renamed from: a */
    private final C3842xm f10841a;

    /* renamed from: b */
    private final Map<LevelPlay.AdFormat, C3611s> f10842b;

    public C3533pq(C3842xm tools, Map<LevelPlay.AdFormat, C3611s> adFormatsConfigurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormatsConfigurations, "adFormatsConfigurations");
        this.f10841a = tools;
        this.f10842b = adFormatsConfigurations;
    }

    /* renamed from: b */
    private final void m11437b(InterfaceC3186hg.a aVar, String str, LevelPlay.AdFormat adFormat, C3611s.d dVar) throws JSONException {
        EnumC3515p8 enumC3515p8 = EnumC3515p8.Delivery;
        C3552qa c3552qaM11790c = dVar.m11790c();
        m11436a(aVar.mo9121a(str, adFormat, enumC3515p8, new C3143g8(c3552qaM11790c != null ? Boolean.valueOf(c3552qaM11790c.m11523a()) : null, null, null, 6, null)), str, adFormat, enumC3515p8);
    }

    /* renamed from: c */
    private final void m11438c(InterfaceC3186hg.a aVar, String str, LevelPlay.AdFormat adFormat, C3611s.d dVar) throws JSONException {
        C3091eq c3091eqM11792e = dVar.m11792e();
        if (c3091eqM11792e != null) {
            EnumC3515p8 enumC3515p8 = EnumC3515p8.Pacing;
            m11436a(aVar.mo9121a(str, adFormat, enumC3515p8, new C3143g8(c3091eqM11792e.m8538a(), c3091eqM11792e.m8539b(), EnumC3480o8.Second)), str, adFormat, enumC3515p8);
        }
    }

    /* renamed from: a */
    public final void m11439a(InterfaceC3186hg.a cappingService) {
        kotlin.jvm.internal.OooOo.OooO0o0(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C3611s> entry : this.f10842b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C3611s.d> entry2 : entry.getValue().m11785c().entrySet()) {
                String key2 = entry2.getKey();
                C3611s.d value = entry2.getValue();
                m11437b(cappingService, key2, key, value);
                m11435a(cappingService, key2, key, value);
                m11438c(cappingService, key2, key, value);
            }
        }
    }

    /* renamed from: a */
    private final void m11435a(InterfaceC3186hg.a aVar, String str, LevelPlay.AdFormat adFormat, C3611s.d dVar) throws JSONException {
        C3247j8 c3247j8M11789b = dVar.m11789b();
        if (c3247j8M11789b != null) {
            EnumC3515p8 enumC3515p8 = EnumC3515p8.ShowCount;
            m11436a(aVar.mo9121a(str, adFormat, enumC3515p8, new C3143g8(c3247j8M11789b.m9463a(), c3247j8M11789b.m9464b(), c3247j8M11789b.m9465c())), str, adFormat, enumC3515p8);
        }
    }

    /* renamed from: a */
    private final void m11436a(Object obj, String str, LevelPlay.AdFormat adFormat, EnumC3515p8 enumC3515p8) throws JSONException {
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(obj);
        if (thOooO00o != null) {
            this.f10841a.m13093a(str, adFormat, new C3282k8().m9655a(enumC3515p8), thOooO00o.getMessage());
        }
    }
}

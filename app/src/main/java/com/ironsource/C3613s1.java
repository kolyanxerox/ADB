package com.ironsource;

import com.ironsource.C3611s;
import com.ironsource.InterfaceC3452nf;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.ironsource.s1 */
/* loaded from: classes2.dex */
public final class C3613s1 implements InterfaceC3356m8 {

    /* renamed from: a */
    private final C3842xm f11263a;

    /* renamed from: b */
    private final Map<LevelPlay.AdFormat, C3611s> f11264b;

    public C3613s1(C3842xm tools, Map<LevelPlay.AdFormat, C3611s> adFormatsConfigurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormatsConfigurations, "adFormatsConfigurations");
        this.f11263a = tools;
        this.f11264b = adFormatsConfigurations;
    }

    /* renamed from: b */
    private final void m11797b(InterfaceC3452nf.a aVar, String str, C3611s.d dVar) throws JSONException {
        C3091eq c3091eqM11792e = dVar.m11792e();
        if (c3091eqM11792e != null) {
            EnumC3515p8 enumC3515p8 = EnumC3515p8.Pacing;
            m11796a(aVar.mo7976a(str, enumC3515p8, new C3143g8(c3091eqM11792e.m8538a(), c3091eqM11792e.m8539b(), c3091eqM11792e.m8540c())), str, enumC3515p8);
        }
    }

    @Override // com.ironsource.InterfaceC3356m8
    /* renamed from: a */
    public void mo10012a(InterfaceC3452nf.a cappingService) {
        kotlin.jvm.internal.OooOo.OooO0o0(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C3611s>> it = this.f11264b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C3611s.d> entry : it.next().getValue().m11783a().entrySet()) {
                String key = entry.getKey();
                C3611s.d value = entry.getValue();
                m11795a(cappingService, key, value);
                m11797b(cappingService, key, value);
            }
        }
    }

    /* renamed from: a */
    private final void m11795a(InterfaceC3452nf.a aVar, String str, C3611s.d dVar) throws JSONException {
        C3247j8 c3247j8M11789b = dVar.m11789b();
        if (c3247j8M11789b != null) {
            EnumC3515p8 enumC3515p8 = EnumC3515p8.ShowCount;
            m11796a(aVar.mo7976a(str, enumC3515p8, new C3143g8(c3247j8M11789b.m9463a(), c3247j8M11789b.m9464b(), c3247j8M11789b.m9465c())), str, enumC3515p8);
        }
    }

    /* renamed from: a */
    private final void m11796a(Object obj, String str, EnumC3515p8 enumC3515p8) throws JSONException {
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(obj);
        if (thOooO00o != null) {
            this.f11263a.m13092a(str, new C3282k8().m9655a(enumC3515p8), thOooO00o.getMessage());
        }
    }
}

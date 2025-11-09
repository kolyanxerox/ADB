package com.ironsource;

import com.ironsource.InterfaceC3452nf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.bq */
/* loaded from: classes2.dex */
public final class C2981bq implements InterfaceC3452nf, InterfaceC3452nf.a {

    /* renamed from: a */
    private final InterfaceC3621s9 f7620a;

    /* renamed from: b */
    private final InterfaceC3151gg f7621b;

    /* renamed from: c */
    private final Map<String, C2946aq> f7622c;

    public C2981bq(InterfaceC3621s9 currentTimeProvider, InterfaceC3151gg repository) {
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(repository, "repository");
        this.f7620a = currentTimeProvider;
        this.f7621b = repository;
        this.f7622c = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC3452nf
    /* renamed from: a */
    public C3445n8 mo7975a(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        C2946aq c2946aq = this.f7622c.get(identifier);
        if (c2946aq != null && m7974a(c2946aq, identifier)) {
            return new C3445n8(true, EnumC3515p8.Pacing);
        }
        return new C3445n8(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: b */
    public void mo7978b(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        if (this.f7622c.get(identifier) == null) {
            return;
        }
        this.f7621b.mo8203a(this.f7620a.mo11889a(), identifier);
    }

    /* renamed from: a */
    public final Map<String, C2946aq> m7977a() {
        return this.f7622c;
    }

    /* renamed from: a */
    private final boolean m7974a(C2946aq c2946aq, String str) {
        Long lMo8202a = this.f7621b.mo8202a(str);
        return lMo8202a != null && this.f7620a.mo11889a() - lMo8202a.longValue() < c2946aq.m7829a();
    }

    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: a */
    public Object mo7976a(String identifier, EnumC3515p8 cappingType, InterfaceC3324lf cappingConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        kotlin.jvm.internal.OooOo.OooO0o0(cappingType, "cappingType");
        kotlin.jvm.internal.OooOo.OooO0o0(cappingConfig, "cappingConfig");
        Object objMo8920b = cappingConfig.mo8920b();
        boolean z = objMo8920b instanceof oo00o.OooOO0O;
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        if (z) {
            Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objMo8920b);
            if (thOooO00o != null) {
                return o00O0.o000OOo.OooO0O0(thOooO00o);
            }
        } else {
            C2946aq c2946aq = (C2946aq) objMo8920b;
            if (c2946aq != null) {
                this.f7622c.put(identifier, c2946aq);
                return oooOo;
            }
        }
        return oooOo;
    }
}

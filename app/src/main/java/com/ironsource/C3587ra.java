package com.ironsource;

import com.ironsource.InterfaceC3452nf;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.ra */
/* loaded from: classes2.dex */
public final class C3587ra implements InterfaceC3452nf, InterfaceC3452nf.a {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C3482oa> f11183a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC3452nf
    /* renamed from: a */
    public C3445n8 mo7975a(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        C3482oa c3482oa = this.f11183a.get(identifier);
        return (c3482oa == null || c3482oa.m11127a()) ? new C3445n8(false, null, 2, null) : new C3445n8(true, EnumC3515p8.Delivery);
    }

    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: b */
    public void mo7978b(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: a */
    public Object mo7976a(String identifier, EnumC3515p8 cappingType, InterfaceC3324lf cappingConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        kotlin.jvm.internal.OooOo.OooO0o0(cappingType, "cappingType");
        kotlin.jvm.internal.OooOo.OooO0o0(cappingConfig, "cappingConfig");
        Object objMo8919a = cappingConfig.mo8919a();
        boolean z = objMo8919a instanceof oo00o.OooOO0O;
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        if (z) {
            Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objMo8919a);
            if (thOooO00o != null) {
                return o00O0.o000OOo.OooO0O0(thOooO00o);
            }
        } else {
            C3482oa c3482oa = (C3482oa) objMo8919a;
            if (c3482oa != null) {
                this.f11183a.put(identifier, c3482oa);
                return oooOo;
            }
        }
        return oooOo;
    }
}

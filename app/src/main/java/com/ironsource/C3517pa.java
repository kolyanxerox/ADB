package com.ironsource;

/* renamed from: com.ironsource.pa */
/* loaded from: classes2.dex */
public final class C3517pa implements InterfaceC3417mf {

    /* renamed from: a */
    private final Boolean f10817a;

    public C3517pa(Boolean bool) {
        this.f10817a = bool;
    }

    @Override // com.ironsource.InterfaceC3417mf
    /* renamed from: a */
    public Object mo9099a() {
        Boolean bool = this.f10817a;
        return bool == null ? o00O0.o000OOo.OooO0O0(new Exception("enabled flag is not provided or invalid")) : bool;
    }
}

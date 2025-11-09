package com.ironsource;

/* renamed from: com.ironsource.h8 */
/* loaded from: classes2.dex */
public final class C3178h8 implements InterfaceC3417mf {

    /* renamed from: a */
    private final Boolean f8846a;

    /* renamed from: b */
    private final Integer f8847b;

    /* renamed from: c */
    private final EnumC3480o8 f8848c;

    public C3178h8(Boolean bool, Integer num, EnumC3480o8 enumC3480o8) {
        this.f8846a = bool;
        this.f8847b = num;
        this.f8848c = enumC3480o8;
    }

    @Override // com.ironsource.InterfaceC3417mf
    /* renamed from: a */
    public Object mo9099a() {
        Exception exc;
        Boolean bool = this.f8846a;
        if (bool == null) {
            exc = new Exception("enabled flag is not provided or invalid");
        } else {
            if (!bool.booleanValue()) {
                return Boolean.FALSE;
            }
            Integer num = this.f8847b;
            if (num == null || num.intValue() <= 0) {
                exc = new Exception("limit flag is not provided or invalid");
            } else {
                if (this.f8848c != null) {
                    return Boolean.TRUE;
                }
                exc = new Exception("unit flag is not provided or invalid");
            }
        }
        return o00O0.o000OOo.OooO0O0(exc);
    }
}

package com.ironsource;

/* renamed from: com.ironsource.g8 */
/* loaded from: classes2.dex */
public final class C3143g8 implements InterfaceC3324lf {

    /* renamed from: a */
    private final Boolean f8710a;

    /* renamed from: b */
    private final Integer f8711b;

    /* renamed from: c */
    private final EnumC3480o8 f8712c;

    public C3143g8(Boolean bool, Integer num, EnumC3480o8 enumC3480o8) {
        this.f8710a = bool;
        this.f8711b = num;
        this.f8712c = enumC3480o8;
    }

    @Override // com.ironsource.InterfaceC3324lf
    /* renamed from: a */
    public Object mo8919a() {
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(new C3517pa(this.f8710a).mo9099a());
        if (thOooO00o != null) {
            return o00O0.o000OOo.OooO0O0(thOooO00o);
        }
        Boolean bool = this.f8710a;
        if (bool != null) {
            return new C3482oa(bool.booleanValue());
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3324lf
    /* renamed from: b */
    public Object mo8920b() {
        Integer num;
        EnumC3480o8 enumC3480o8 = EnumC3480o8.Second;
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(m8918a(enumC3480o8));
        if (thOooO00o != null) {
            return o00O0.o000OOo.OooO0O0(thOooO00o);
        }
        if (!kotlin.jvm.internal.OooOo.OooO00o(this.f8710a, Boolean.TRUE) || (num = this.f8711b) == null) {
            return null;
        }
        return new C2946aq(enumC3480o8.m11125a(num), null, 2, null);
    }

    @Override // com.ironsource.InterfaceC3324lf
    /* renamed from: c */
    public Object mo8921c() {
        Integer num;
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(m8918a(this.f8712c));
        if (thOooO00o != null) {
            return o00O0.o000OOo.OooO0O0(thOooO00o);
        }
        if (!kotlin.jvm.internal.OooOo.OooO00o(this.f8710a, Boolean.TRUE) || (num = this.f8711b) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        EnumC3480o8 enumC3480o8 = this.f8712c;
        if (enumC3480o8 != null) {
            return new C3467nu(iIntValue, enumC3480o8);
        }
        return null;
    }

    /* renamed from: d */
    public final Boolean m8922d() {
        return this.f8710a;
    }

    /* renamed from: e */
    public final Integer m8923e() {
        return this.f8711b;
    }

    /* renamed from: f */
    public final EnumC3480o8 m8924f() {
        return this.f8712c;
    }

    public /* synthetic */ C3143g8(Boolean bool, Integer num, EnumC3480o8 enumC3480o8, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : enumC3480o8);
    }

    /* renamed from: a */
    private final Object m8918a(EnumC3480o8 enumC3480o8) {
        return new C3178h8(this.f8710a, this.f8711b, enumC3480o8).mo9099a();
    }
}

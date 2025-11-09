package com.ironsource;

/* renamed from: com.ironsource.gu */
/* loaded from: classes2.dex */
public final class C3165gu implements InterfaceC3460nn<AbstractC2950au, C3716u> {
    @Override // com.ironsource.InterfaceC3460nn
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3716u mo8213a(AbstractC2950au input) {
        String strM10910h;
        String strM10911i;
        String strM10909g;
        EnumC3558qg enumC3558qgM10907e;
        String strM10905c;
        kotlin.jvm.internal.OooOo.OooO0o0(input, "input");
        EnumC3200hu enumC3200huMo7836b = input.mo7836b();
        C3437n0 c3437n0M7834a = input.m7834a();
        if (c3437n0M7834a == null || (strM10910h = c3437n0M7834a.m10910h()) == null) {
            strM10910h = "0";
        }
        C3437n0 c3437n0M7834a2 = input.m7834a();
        if (c3437n0M7834a2 == null || (strM10911i = c3437n0M7834a2.m10911i()) == null) {
            strM10911i = "0";
        }
        C3437n0 c3437n0M7834a3 = input.m7834a();
        if (c3437n0M7834a3 == null || (strM10909g = c3437n0M7834a3.m10909g()) == null) {
            strM10909g = "0";
        }
        C3437n0 c3437n0M7834a4 = input.m7834a();
        if (c3437n0M7834a4 == null || (enumC3558qgM10907e = c3437n0M7834a4.m10907e()) == null) {
            enumC3558qgM10907e = EnumC3558qg.UnknownProvider;
        }
        C3437n0 c3437n0M7834a5 = input.m7834a();
        return new C3716u(enumC3200huMo7836b, strM10910h, strM10911i, strM10909g, enumC3558qgM10907e, (c3437n0M7834a5 == null || (strM10905c = c3437n0M7834a5.m10905c()) == null) ? "0" : strM10905c);
    }
}

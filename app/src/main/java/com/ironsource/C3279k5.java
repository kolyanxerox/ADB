package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.k5 */
/* loaded from: classes2.dex */
public final class C3279k5 implements InterfaceC3314l5 {

    /* renamed from: a */
    private final String f9238a;

    /* renamed from: b */
    private final InterfaceC2947ar f9239b;

    public C3279k5(String encryptedAuctionResponse, InterfaceC2947ar providerName) {
        kotlin.jvm.internal.OooOo.OooO0o0(encryptedAuctionResponse, "encryptedAuctionResponse");
        kotlin.jvm.internal.OooOo.OooO0o0(providerName, "providerName");
        this.f9238a = encryptedAuctionResponse;
        this.f9239b = providerName;
    }

    @Override // com.ironsource.InterfaceC3314l5
    /* renamed from: a */
    public Object mo9643a() {
        Object objOooO0O0;
        String strM10017c = C3359mb.m10015b().m10017c();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM10017c, "getInstance().mediationKey");
        try {
            objOooO0O0 = new C2976bl(new C3215ia(this.f9238a, strM10017c)).mo7938a();
        } catch (Throwable th) {
            objOooO0O0 = o00O0.o000OOo.OooO0O0(th);
        }
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objOooO0O0);
        if (thOooO00o == null) {
            return C3210i5.f8973h.m9278a((JSONObject) objOooO0O0, this.f9239b.value());
        }
        C3551q9.m11517d().m11519a(thOooO00o);
        return thOooO00o instanceof IllegalArgumentException ? o00O0.o000OOo.OooO0O0(new C3870yg(C3797wb.f12445a.m12869d())) : o00O0.o000OOo.OooO0O0(new C3870yg(C3797wb.f12445a.m12874h()));
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.C3391i;

/* renamed from: com.ironsource.p1 */
/* loaded from: classes2.dex */
public class C3508p1 implements InterfaceC3140g5 {

    /* renamed from: a */
    private final C3061e1 f10725a;

    public C3508p1(C3061e1 adProperties) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        this.f10725a = adProperties;
    }

    @Override // com.ironsource.InterfaceC3140g5
    /* renamed from: a */
    public void mo8877a(C3391i auctionRequestParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.m10306b(this.f10725a.m8437c());
        auctionRequestParams.m10301a(this.f10725a.m8434a().toString());
        auctionRequestParams.m10299a(Boolean.TRUE);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.C3391i;
import com.ironsource.mediationsdk.ISBannerSize;

/* renamed from: com.ironsource.s6 */
/* loaded from: classes2.dex */
public final class C3618s6 extends C3508p1 {

    /* renamed from: b */
    private final ISBannerSize f11306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3618s6(C3061e1 adProperties, ISBannerSize iSBannerSize) {
        super(adProperties);
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        this.f11306b = iSBannerSize;
    }

    @Override // com.ironsource.C3508p1, com.ironsource.InterfaceC3140g5
    /* renamed from: a */
    public void mo8877a(C3391i auctionRequestParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(auctionRequestParams, "auctionRequestParams");
        super.mo8877a(auctionRequestParams);
        auctionRequestParams.m10296a(this.f11306b);
    }
}

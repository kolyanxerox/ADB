package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3724u7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.wj */
/* loaded from: classes2.dex */
public class C3805wj extends AbstractC3724u7 {

    /* renamed from: R */
    private static C3805wj f12486R;

    /* renamed from: P */
    private String f12487P;

    /* renamed from: Q */
    private final InterfaceC3223ii f12488Q = C3495on.m11199U().mo8689k();

    private C3805wj() {
        this.f12170H = "ironbeast";
        this.f12169G = 2;
        this.f12171I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f12487P = "";
    }

    /* renamed from: i */
    public static synchronized C3805wj m12898i() {
        try {
            if (f12486R == null) {
                C3805wj c3805wj = new C3805wj();
                f12486R = c3805wj;
                c3805wj.m12626e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12486R;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: c */
    public int mo8392c(C3899zb c3899zb) {
        InterfaceC3223ii interfaceC3223ii;
        IronSource.AD_UNIT ad_unit;
        int iM12627f = m12627f(c3899zb.m13323c());
        if (iM12627f == AbstractC3724u7.e.BANNER.m12631a()) {
            interfaceC3223ii = this.f12488Q;
            ad_unit = IronSource.AD_UNIT.BANNER;
        } else if (iM12627f == AbstractC3724u7.e.NATIVE_AD.m12631a()) {
            interfaceC3223ii = this.f12488Q;
            ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        } else {
            interfaceC3223ii = this.f12488Q;
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return interfaceC3223ii.mo9344a(ad_unit);
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: d */
    public void mo8393d() {
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_LOAD_CALLED, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_INSTANCE_LOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_INSTANCE_LOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_CALLBACK_LOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_INSTANCE_LOAD_FAILED, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_INSTANCE_LOAD_NO_FILL, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_INSTANCE_READY_TRUE, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.IS_INSTANCE_READY_FALSE, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_LOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_CALLBACK_LOAD_ERROR, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_RELOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_CALLBACK_RELOAD_ERROR, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_CALLBACK_RELOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_LOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_RELOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_LOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_LOAD_ERROR, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_RELOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_RELOAD_ERROR, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.BN_INSTANCE_SHOW, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.NT_LOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.NT_CALLBACK_LOAD_ERROR, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.NT_INSTANCE_LOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.NT_INSTANCE_LOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.NT_INSTANCE_LOAD_ERROR, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.NT_INSTANCE_SHOW, this.f12172J);
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: e */
    public String mo8395e(int i) {
        return this.f12487P;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: f */
    public void mo8396f(C3899zb c3899zb) {
        this.f12487P = c3899zb.m13322b().optString("placement");
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: j */
    public boolean mo8397j(C3899zb c3899zb) {
        return false;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: d */
    public boolean mo8394d(C3899zb c3899zb) {
        int iM13323c = c3899zb.m13323c();
        return iM13323c == EnumC2638ac.IS_CALLBACK_LOAD_SUCCESS.m4887b() || iM13323c == EnumC2638ac.IS_INSTANCE_OPENED.m4887b() || iM13323c == EnumC2638ac.IS_INSTANCE_CLOSED.m4887b() || iM13323c == EnumC2638ac.IS_AUCTION_SUCCESS.m4887b() || iM13323c == EnumC2638ac.IS_AUCTION_FAILED.m4887b() || iM13323c == EnumC2638ac.BN_INSTANCE_SHOW.m4887b() || iM13323c == EnumC2638ac.BN_AUCTION_SUCCESS.m4887b() || iM13323c == EnumC2638ac.BN_AUCTION_FAILED.m4887b() || iM13323c == EnumC2638ac.NT_INSTANCE_LOAD_SUCCESS.m4887b() || iM13323c == EnumC2638ac.NT_INSTANCE_SHOW.m4887b() || iM13323c == EnumC2638ac.NT_AUCTION_SUCCESS.m4887b() || iM13323c == EnumC2638ac.NT_AUCTION_FAILED.m4887b();
    }
}

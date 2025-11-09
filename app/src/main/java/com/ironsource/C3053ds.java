package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.ds */
/* loaded from: classes2.dex */
public class C3053ds extends AbstractC3724u7 {

    /* renamed from: R */
    private static C3053ds f8325R;

    /* renamed from: P */
    private String f8326P;

    /* renamed from: Q */
    private final InterfaceC3223ii f8327Q = C3495on.m11199U().mo8689k();

    private C3053ds() {
        this.f12170H = "outcome";
        this.f12169G = 3;
        this.f12171I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f8326P = "";
    }

    /* renamed from: i */
    public static synchronized C3053ds m8391i() {
        try {
            if (f8325R == null) {
                C3053ds c3053ds = new C3053ds();
                f8325R = c3053ds;
                c3053ds.m12626e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8325R;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: c */
    public int mo8392c(C3899zb c3899zb) {
        return this.f8327Q.mo9344a(IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: d */
    public void mo8393d() {
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_INSTANCE_LOAD_FAILED, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_INSTANCE_SHOW_CHANCE, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_INSTANCE_READY_TRUE, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_INSTANCE_READY_FALSE, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_INSTANCE_LOAD_FAILED_REASON, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_INSTANCE_LOAD_NO_FILL, this.f12172J);
        AbstractC2183w4.OooOOOo(EnumC2638ac.RV_MEDIATION_LOAD_ERROR, this.f12172J);
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: e */
    public String mo8395e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.f8326P : "";
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: f */
    public void mo8396f(C3899zb c3899zb) {
        if (c3899zb.m13323c() == 15 || (c3899zb.m13323c() >= 300 && c3899zb.m13323c() < 400)) {
            this.f8326P = c3899zb.m13322b().optString("placement");
        }
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
        return iM13323c == EnumC2638ac.FIRST_INSTANCE.m4887b() || iM13323c == EnumC2638ac.INIT_COMPLETE.m4887b() || iM13323c == EnumC2638ac.SDK_INIT_FAILED.m4887b() || iM13323c == EnumC2638ac.SDK_INIT_SUCCESS.m4887b() || iM13323c == EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.m4887b() || iM13323c == EnumC2638ac.RV_BUSINESS_INSTANCE_OPENED.m4887b() || iM13323c == EnumC2638ac.RV_INSTANCE_CLOSED.m4887b() || iM13323c == EnumC2638ac.RV_BUSINESS_INSTANCE_REWARDED.m4887b() || iM13323c == EnumC2638ac.RV_AUCTION_FAILED.m4887b() || iM13323c == EnumC2638ac.RV_AUCTION_SUCCESS.m4887b();
    }
}

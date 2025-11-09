package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nr */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1873nr implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ JSONObject f21568OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21569OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ InterfaceC1722jo f21570OooOo0o;

    public /* synthetic */ RunnableC1873nr(InterfaceC1722jo interfaceC1722jo, JSONObject jSONObject, int i) {
        this.f21569OooOo0O = i;
        this.f21570OooOo0o = interfaceC1722jo;
        this.f21568OooOo = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1722jo interfaceC1722jo = this.f21570OooOo0o;
        JSONObject jSONObject = this.f21568OooOo;
        switch (this.f21569OooOo0O) {
            case 0:
                interfaceC1722jo.OooOOO("AFMA_updateActiveView", jSONObject);
                break;
            default:
                int i = C1917oy.f23138Oooo00O;
                interfaceC1722jo.OooO0o0("onVideoEvent", jSONObject);
                break;
        }
    }
}

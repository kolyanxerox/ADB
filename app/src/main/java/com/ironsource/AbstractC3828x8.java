package com.ironsource;

import android.content.Context;
import com.ironsource.C3034d9;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.x8 */
/* loaded from: classes2.dex */
public abstract class AbstractC3828x8 implements InterfaceC3557qf {

    /* renamed from: a */
    private InterfaceC3522pf f12595a;

    public AbstractC3828x8(JSONObject jSONObject, Context context) {
        InterfaceC3522pf interfaceC3522pfM13028a = m13028a(jSONObject, context);
        this.f12595a = interfaceC3522pfM13028a;
        Logger.m12266i("x8", "created ConnectivityAdapter with strategy ".concat(interfaceC3522pfM13028a.getClass().getSimpleName()));
    }

    /* renamed from: a */
    private InterfaceC3522pf m13028a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C3034d9.i.f8184g0) != 1 && C2959b4.m7869c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new C3337lo(this);
        }
        return new BroadcastReceiverStrategy(this);
    }

    /* renamed from: b */
    public void m13030b() {
        this.f12595a.mo9861a();
    }

    /* renamed from: c */
    public void m13032c(Context context) {
        this.f12595a.mo9862a(context);
    }

    /* renamed from: a */
    public JSONObject m13029a(Context context) {
        return this.f12595a.mo9864c(context);
    }

    /* renamed from: b */
    public void m13031b(Context context) {
        this.f12595a.mo9863b(context);
    }

    @Override // com.ironsource.InterfaceC3557qf
    /* renamed from: a */
    public void mo11554a() {
    }

    @Override // com.ironsource.InterfaceC3557qf
    /* renamed from: b */
    public void mo11556b(String str, JSONObject jSONObject) {
    }

    @Override // com.ironsource.InterfaceC3557qf
    /* renamed from: a */
    public void mo11555a(String str, JSONObject jSONObject) {
    }
}

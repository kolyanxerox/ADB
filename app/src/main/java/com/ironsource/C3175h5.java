package com.ironsource;

import com.ironsource.mediationsdk.C3387e;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.ironsource.h5 */
/* loaded from: classes2.dex */
public class C3175h5 extends C3387e.a {
    public C3175h5(InterfaceC3581r4 interfaceC3581r4, URL url, JSONObject jSONObject, boolean z, C3477o5 c3477o5) {
        super(interfaceC3581r4, url, jSONObject, z, c3477o5);
    }

    @Override // com.ironsource.mediationsdk.C3387e.a
    /* renamed from: a */
    public void mo9092a(boolean z, InterfaceC3581r4 interfaceC3581r4, long j) {
        try {
            if (z) {
                ((InterfaceC2631a5) interfaceC3581r4).mo4777a(this.f9791b, this.f9795f + 1, j, this.f9799j, this.f9798i);
            } else {
                interfaceC3581r4.mo10175a(this.f9792c, this.f9793d, this.f9795f + 1, this.f9796g, j);
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            interfaceC3581r4.mo10175a(1009, e.getMessage(), this.f9795f + 1, this.f9796g, j);
        }
    }
}

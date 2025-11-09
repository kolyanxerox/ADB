package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C3175h5;
import com.ironsource.C3477o5;
import com.ironsource.InterfaceC3581r4;
import com.ironsource.mediationsdk.C3387e;
import java.net.URL;
import kotlin.jvm.internal.OooOo;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f */
/* loaded from: classes2.dex */
public final class C3388f implements InterfaceC3389g {

    /* renamed from: a */
    private final C3477o5 f9808a;

    /* renamed from: b */
    private final String f9809b;

    public C3388f(C3477o5 settings, String sessionId) {
        OooOo.OooO0o0(settings, "settings");
        OooOo.OooO0o0(sessionId, "sessionId");
        this.f9808a = settings;
        this.f9809b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC3389g
    /* renamed from: a */
    public C3387e.a mo10284a(Context context, C3391i auctionRequestParams, InterfaceC3581r4 auctionListener) throws JSONException {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(auctionRequestParams, "auctionRequestParams");
        OooOo.OooO0o0(auctionListener, "auctionListener");
        JSONObject jSONObjectM10283a = m10283a(context, auctionRequestParams);
        String strM11087a = this.f9808a.m11087a(auctionRequestParams.m10327s());
        return auctionRequestParams.m10327s() ? new C3175h5(auctionListener, new URL(strM11087a), jSONObjectM10283a, auctionRequestParams.m10328t(), this.f9808a) : new C3387e.a(auctionListener, new URL(strM11087a), jSONObjectM10283a, auctionRequestParams.m10328t(), this.f9808a);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC3389g
    /* renamed from: b */
    public boolean mo10286b() {
        return this.f9808a.m11101n();
    }

    /* renamed from: a */
    private final JSONObject m10283a(Context context, C3391i c3391i) throws JSONException {
        JSONObject jSONObjectM10132a = C3368d.m10127b().m10132a(c3391i);
        OooOo.OooO0Oo(jSONObjectM10132a, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectM10132a;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC3389g
    /* renamed from: a */
    public boolean mo10285a() {
        return this.f9808a.m11094g() > 0;
    }
}

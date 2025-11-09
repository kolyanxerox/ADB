package com.ironsource;

import android.content.Context;
import com.ironsource.C3034d9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.pc */
/* loaded from: classes2.dex */
public final class C3519pc implements InterfaceC3497op {

    /* renamed from: a */
    private boolean f10819a = true;

    /* renamed from: b */
    private String f10820b = C3554qc.f10924j;

    /* renamed from: com.ironsource.pc$a */
    public static final class a implements InterfaceC3115ff {
        @Override // com.ironsource.InterfaceC3115ff
        /* renamed from: a */
        public void mo8680a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    /* renamed from: b */
    private final JSONObject m11380b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            C3080ek ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.m8507c());
                jSONObject.put("advIdType", ironSourceAdvId.m8508d());
            }
        }
        String strM10554k = C3404p.m10470j().m10554k();
        if (strM10554k != null) {
            jSONObject.put(C3034d9.i.f8183g, strM10554k);
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3497op
    /* renamed from: a */
    public void mo10500a() {
    }

    @Override // com.ironsource.InterfaceC3497op
    /* renamed from: d */
    public void mo10547d(String str) {
    }

    /* renamed from: a */
    public final void m11381a(String dataSource, JSONObject impressionData) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(dataSource, "dataSource");
        kotlin.jvm.internal.OooOo.OooO0o0(impressionData, "impressionData");
        if (!this.f10819a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectM11380b = m11380b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectM11380b);
            IronLog.API.info("impressionData: " + jSONObject);
            HttpFunctions.sendPostRequest(this.f10820b, jSONObject.toString(), new a());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.InterfaceC3497op
    /* renamed from: a */
    public void mo10525a(List<IronSource.AD_UNIT> list, boolean z, C3725u8 c3725u8) {
        if (c3725u8 != null) {
            C3891z3 c3891z3M12633b = c3725u8.m12633b();
            C3243j4 c3243j4M13292f = c3891z3M12633b != null ? c3891z3M12633b.m13292f() : null;
            kotlin.jvm.internal.OooOo.OooO0O0(c3243j4M13292f);
            this.f10819a = c3243j4M13292f.m9429l();
            this.f10820b = c3725u8.m12633b().m13292f().m9421d();
        }
    }
}

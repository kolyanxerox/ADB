package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.tt */
/* loaded from: classes2.dex */
public final class C3711tt {

    /* renamed from: a */
    private C2639ad f12102a;

    /* renamed from: com.ironsource.tt$a */
    public final class a extends RunnableC3676st {
        public a() {
        }

        @Override // com.ironsource.RunnableC3676st, java.lang.Runnable
        public void run() throws JSONException {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, m12310a());
            } catch (JSONException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C3300kq.f9270P.mo12605a(new C3899zb(EnumC2638ac.APP_ENTER_BACKGROUND, mediationAdditionalData));
        }
    }

    /* renamed from: a */
    public final void m12485a(InterfaceC3254jf applicationLifecycleService) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationLifecycleService, "applicationLifecycleService");
        this.f12102a = new C2639ad(applicationLifecycleService, new a());
    }
}

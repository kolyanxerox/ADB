package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2629a3;
import com.ironsource.C3551q9;
import com.ironsource.InterfaceC3188hi;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.y */
/* loaded from: classes2.dex */
public abstract class AbstractC3415y implements InterfaceC3188hi.b {

    /* renamed from: a */
    protected AbstractAdapter f10256a;

    /* renamed from: b */
    protected C2629a3 f10257b;

    /* renamed from: c */
    private boolean f10258c;

    /* renamed from: d */
    protected JSONObject f10259d;

    /* renamed from: e */
    protected String f10260e;

    /* renamed from: f */
    protected int f10261f;

    /* renamed from: g */
    protected Long f10262g = null;

    public AbstractC3415y(C2629a3 c2629a3, AbstractAdapter abstractAdapter) {
        this.f10257b = c2629a3;
        this.f10256a = abstractAdapter;
        this.f10259d = c2629a3.m4768c();
    }

    /* renamed from: a */
    public void m10795a(String str) {
        m10794a(str, 0);
    }

    @Override // com.ironsource.InterfaceC3188hi.b
    /* renamed from: b */
    public int mo9128b() {
        return this.f10257b.m4770e();
    }

    @Override // com.ironsource.InterfaceC3188hi.b
    /* renamed from: c */
    public String mo9129c() {
        return this.f10257b.m4771f();
    }

    /* renamed from: d */
    public abstract IronSource.AD_UNIT mo10629d();

    /* renamed from: e */
    public Long m10799e() {
        return this.f10262g;
    }

    /* renamed from: f */
    public String m10800f() {
        return m10803i() + StringUtils.SPACE + hashCode();
    }

    /* renamed from: g */
    public int m10801g() {
        return this.f10257b.m4769d();
    }

    /* renamed from: h */
    public boolean m10802h() {
        return this.f10258c;
    }

    /* renamed from: i */
    public String m10803i() {
        return this.f10257b.m4773h().isMultipleInstances() ? this.f10257b.m4773h().getProviderTypeForReflection() : this.f10257b.m4773h().getProviderName();
    }

    /* renamed from: j */
    public String m10804j() {
        return this.f10257b.m4772g();
    }

    /* renamed from: k */
    public abstract String mo10630k();

    /* renamed from: l */
    public int mo10631l() {
        return 1;
    }

    /* renamed from: m */
    public Map<String, Object> m10805m() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f10256a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f10256a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f10257b.m4774i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f10257b.m4766a());
            map.put("instanceType", Integer.valueOf(m10808p() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(mo10631l()));
            if (!TextUtils.isEmpty(this.f10260e)) {
                map.put("dynamicDemandSource", this.f10260e);
                return map;
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + mo9129c() + ")", th);
        }
        return map;
    }

    /* renamed from: n */
    public int m10806n() {
        return this.f10261f;
    }

    /* renamed from: o */
    public boolean m10807o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f10256a.isUsingActivityBeforeImpression(mo10629d())) {
                return false;
            }
            ironLog.verbose(mo9129c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("Exception while calling adapter.isUsingActivityBeforeImpression() - ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            m10797b(sbOooOOO.toString());
            return true;
        }
    }

    /* renamed from: p */
    public boolean m10808p() {
        return this.f10257b.m4775j();
    }

    /* renamed from: q */
    public void mo10787q() {
        try {
            AbstractAdapter abstractAdapter = this.f10256a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.f10257b.m4767b(), this.f10259d);
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error("exception - " + th.getMessage());
        }
        this.f10256a = null;
    }

    /* renamed from: r */
    public boolean m10809r() {
        if (m10807o()) {
            return false;
        }
        return m10808p() || m10810s();
    }

    /* renamed from: s */
    public boolean m10810s() {
        return this.f10257b.m4776k();
    }

    /* renamed from: a */
    private void m10794a(String str, int i) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo10630k() + StringUtils.SPACE + mo9129c() + " : " + str, i);
    }

    /* renamed from: b */
    public void m10797b(String str) {
        m10794a(str, 3);
    }

    /* renamed from: c */
    public void m10798c(String str) {
        this.f10260e = C3368d.m10127b().m10136c(str);
    }

    /* renamed from: a */
    public void m10796a(boolean z) {
        this.f10258c = z;
    }
}

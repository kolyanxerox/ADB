package com.ironsource;

import com.ironsource.InterfaceC3835xf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ironsource.pb */
/* loaded from: classes2.dex */
public final class C3518pb implements InterfaceC3835xf, InterfaceC3835xf.a {

    /* renamed from: a */
    private JSONObject f10818a = new JSONObject();

    /* renamed from: h */
    private final JSONObject m11371h() {
        JSONObject jSONObjectOptJSONObject = this.f10818a.optJSONObject(C3553qb.f10914a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.InterfaceC3835xf.a
    /* renamed from: a */
    public void mo11372a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f10818a;
        }
        this.f10818a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + this.f10818a);
    }

    @Override // com.ironsource.InterfaceC3588rb
    /* renamed from: b */
    public long mo11374b() {
        String strOptString = m11371h().optString(C3623sb.f11353d);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long lOooOoo0 = o00O0oO.o0000.OooOoo0(strOptString);
        if (lOooOoo0 != null) {
            return lOooOoo0.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC3588rb
    /* renamed from: c */
    public int mo11375c() {
        String strOptString = m11371h().optString(C3623sb.f11351b);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer numOooOoOO = o00O0oO.o0000.OooOoOO(strOptString);
        if (numOooOoOO != null) {
            return numOooOoOO.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC3835xf
    public JSONObject config() {
        return this.f10818a;
    }

    @Override // com.ironsource.InterfaceC3588rb
    /* renamed from: d */
    public boolean mo11376d() {
        return m11371h().optBoolean(C3623sb.f11354e, true);
    }

    @Override // com.ironsource.InterfaceC3588rb
    /* renamed from: e */
    public long mo11377e() {
        String strOptString = m11371h().optString(C3623sb.f11352c);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long lOooOoo0 = o00O0oO.o0000.OooOoo0(strOptString);
        if (lOooOoo0 != null) {
            return lOooOoo0.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC3588rb
    /* renamed from: f */
    public boolean mo11378f() {
        return m11371h().optBoolean(C3623sb.f11356g, true);
    }

    @Override // com.ironsource.InterfaceC3588rb
    /* renamed from: g */
    public boolean mo11379g() {
        String strOptString = m11371h().optString(C3623sb.f11350a);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.OooOo.OooO0Oo(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase.equals(C3401a.f9920g);
    }

    @Override // com.ironsource.InterfaceC3588rb
    /* renamed from: a */
    public boolean mo11373a() {
        return m11371h().optBoolean(C3623sb.f11355f, true);
    }
}

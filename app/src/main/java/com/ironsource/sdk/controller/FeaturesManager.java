package com.ironsource.sdk.controller;

import com.ironsource.C3034d9;
import com.ironsource.C3495on;
import com.ironsource.C3550q8;
import com.ironsource.C3551q9;
import com.ironsource.C3585r8;
import com.ironsource.C3849xt;
import com.ironsource.C3902ze;
import com.ironsource.InterfaceC3291kh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FeaturesManager {

    /* renamed from: d */
    private static volatile FeaturesManager f11382d = null;

    /* renamed from: e */
    private static final String f11383e = "debugMode";

    /* renamed from: a */
    private Map<String, ?> f11384a;

    /* renamed from: b */
    private final ArrayList<String> f11385b = new C3630a();

    /* renamed from: c */
    private InterfaceC3291kh f11386c = C3495on.m11199U().mo8681A();

    /* renamed from: com.ironsource.sdk.controller.FeaturesManager$a */
    public class C3630a extends ArrayList<String> {
        public C3630a() {
            add(C3034d9.d.f7978f);
            add(C3034d9.d.f7977e);
            add(C3034d9.d.f7979g);
            add(C3034d9.d.f7980h);
            add(C3034d9.d.f7981i);
            add(C3034d9.d.f7982j);
            add(C3034d9.d.f7983k);
            add(C3034d9.d.f7984l);
            add(C3034d9.d.f7985m);
        }
    }

    private FeaturesManager() {
        if (f11382d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f11384a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f11382d == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (f11382d == null) {
                        f11382d = new FeaturesManager();
                    }
                } finally {
                }
            }
        }
        return f11382d;
    }

    /* renamed from: a */
    public ArrayList<String> m11907a() {
        return new ArrayList<>(this.f11385b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(C3034d9.a.f7917d) ? networkConfiguration.optJSONObject(C3034d9.a.f7917d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f11384a.containsKey("debugMode")) {
                num = (Integer) this.f11384a.get("debugMode");
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C3550q8 getFeatureFlagCatchUrlError() {
        return new C3550q8(SDKUtils.getNetworkConfiguration().optJSONObject(C3550q8.a.f10894c));
    }

    public C3585r8 getFeatureFlagClickCheck() {
        return new C3585r8(SDKUtils.getNetworkConfiguration());
    }

    public C3902ze getFeatureFlagHealthCheck() {
        JSONObject jSONObjectMo9671a = this.f11386c.mo9671a(C3034d9.a.f7931r);
        return jSONObjectMo9671a != null ? new C3902ze(jSONObjectMo9671a) : new C3902ze(null);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(C3034d9.a.f7919f);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(C3034d9.a.f7918e, 0);
        }
        return 0;
    }

    public C3849xt getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new C3849xt(networkConfiguration.has(C3034d9.a.f7932s) ? networkConfiguration.optJSONObject(C3034d9.a.f7932s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f11386c.mo9673c(C3034d9.a.f7934u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f11384a = map;
    }
}

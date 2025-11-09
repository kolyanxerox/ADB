package com.ironsource.adapters.ironsource;

import com.ironsource.C3037dc;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface IronSourceLoadParameters {

    public static final class Base implements IronSourceLoadParameters {
        private final JSONObject loadConfig;
        private final String serverData;

        public Base(JSONObject loadConfig, String str) {
            OooOo.OooO0o0(loadConfig, "loadConfig");
            this.loadConfig = loadConfig;
            this.serverData = str;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> map = new HashMap<>();
            map.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String strM10129a = C3368d.m10127b().m10129a(this.serverData);
                OooOo.OooO0Oo(strM10129a, "getInstance().getAdmFromServerData(serverData)");
                map.put("adm", strM10129a);
                map.putAll(C3368d.m10127b().m10135b(this.serverData));
            }
            return map;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i, OooOO0O oooOO0O) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }
    }

    public static final class Constants {
        public static final String ADM_KEY = "adm";
        public static final String DEMAND_ONLY = "demandOnly";
        public static final Constants INSTANCE = new Constants();
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    public static final class WithLog implements IronSourceLoadParameters {
        private final IronSourceLoadParameters loadParameters;

        public WithLog(IronSourceLoadParameters loadParameters) {
            OooOo.OooO0o0(loadParameters, "loadParameters");
            this.loadParameters = loadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> mapValue = this.loadParameters.value();
            if (!mapValue.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : mapValue.keySet()) {
                    IronLog.ADAPTER_API.verbose(str + C3037dc.f8244T + mapValue.get(str));
                }
            }
            return mapValue;
        }
    }

    JSONObject config();

    boolean demandOnly();

    HashMap<String, String> value();
}

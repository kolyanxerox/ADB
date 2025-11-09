package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.qo */
/* loaded from: classes2.dex */
public final class C3566qo {

    /* renamed from: com.ironsource.qo$a */
    public static final class a {

        /* renamed from: a */
        public static final a f10962a = new a();

        /* renamed from: b */
        public static final String f10963b = "SDKPluginType";

        /* renamed from: c */
        public static final String f10964c = "sessionid";

        private a() {
        }
    }

    /* renamed from: a */
    public final Map<String, String> m11598a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.f10963b, pluginType);
        }
        String sessionId = IronSourceUtils.getSessionId();
        if (sessionId != null) {
            linkedHashMap.put("sessionid", sessionId);
        }
        return linkedHashMap;
    }
}

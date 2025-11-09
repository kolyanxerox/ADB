package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.p009i.C2656an;
import com.ironsource.adqualitysdk.sdk.p009i.C2916kd;
import com.ironsource.adqualitysdk.sdk.p009i.C2921n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ISAdQualityConfig {

    /* renamed from: ﮉ */
    private final Map<String, String> f4358;

    /* renamed from: ﮐ */
    private final ISAdQualityLogLevel f4359;

    /* renamed from: ﱟ */
    private final boolean f4360;

    /* renamed from: ﱡ */
    private final ISAdQualityDeviceIdType f4361;

    /* renamed from: ﺙ */
    private final boolean f4362;

    /* renamed from: ﻏ */
    private final String f4363;

    /* renamed from: ﻐ */
    private final String f4364;

    /* renamed from: ﻛ */
    private final Set<ISAdQualityInitListener> f4365;

    /* renamed from: ｋ */
    private final boolean f4366;

    /* renamed from: ﾇ */
    private final boolean f4367;

    /* renamed from: ﾒ */
    private final boolean f4368;

    public /* synthetic */ ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b) {
        this(str, z, z2, z3, iSAdQualityLogLevel, set, str2, z4, z5, iSAdQualityDeviceIdType, map);
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f4367) {
            builder.setUserId(iSAdQualityConfig.f4364);
        } else if (iSAdQualityConfig2.f4367) {
            builder.setUserId(iSAdQualityConfig2.f4364);
        }
        if (iSAdQualityConfig.f4366) {
            builder.setTestMode(iSAdQualityConfig.f4368);
        } else if (iSAdQualityConfig2.f4366) {
            builder.setTestMode(iSAdQualityConfig2.f4368);
        }
        if (iSAdQualityConfig.f4360) {
            builder.setCoppa(iSAdQualityConfig.f4362);
        } else if (iSAdQualityConfig2.f4360) {
            builder.setCoppa(iSAdQualityConfig2.f4362);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f4359;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f4359;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f4365.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f4365.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f4363;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f4363;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f4361;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f4361;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f4358);
        map.putAll(iSAdQualityConfig.f4358);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f4365;
    }

    public boolean getCoppa() {
        return this.f4362;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f4361;
    }

    public String getInitializationSource() {
        return this.f4363;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f4359;
    }

    public Map<String, String> getMetaData() {
        return this.f4358;
    }

    public String getUserId() {
        return this.f4364;
    }

    public boolean isTestMode() {
        return this.f4368;
    }

    public boolean isUserIdSet() {
        return this.f4367;
    }

    private ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f4364 = str;
        this.f4367 = z;
        this.f4368 = z2;
        this.f4366 = z3;
        this.f4359 = iSAdQualityLogLevel;
        this.f4365 = set;
        this.f4363 = str2;
        this.f4362 = z4;
        this.f4360 = z5;
        this.f4361 = iSAdQualityDeviceIdType;
        this.f4358 = map;
    }

    public static class Builder {

        /* renamed from: ﾇ */
        private String f4378 = null;

        /* renamed from: ｋ */
        private boolean f4377 = false;

        /* renamed from: ﾒ */
        private boolean f4379 = false;

        /* renamed from: ﻐ */
        private boolean f4375 = false;

        /* renamed from: ﻛ */
        private ISAdQualityLogLevel f4376 = ISAdQualityLogLevel.INFO;

        /* renamed from: ﱡ */
        private final Set<ISAdQualityInitListener> f4372 = new HashSet();

        /* renamed from: ﱟ */
        private String f4371 = null;

        /* renamed from: ﺙ */
        private boolean f4373 = false;

        /* renamed from: ﮐ */
        private boolean f4370 = false;

        /* renamed from: ﻏ */
        private ISAdQualityDeviceIdType f4374 = ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﮉ */
        private final Map<String, String> f4369 = new HashMap();

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f4372.add(iSAdQualityInitListener);
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f4378, this.f4377, this.f4379, this.f4375, this.f4376, this.f4372, this.f4371, this.f4373, this.f4370, this.f4374, this.f4369, (byte) 0);
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f4372.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder setCoppa(boolean z) {
            this.f4373 = z;
            this.f4370 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f4374 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (C2916kd.m7451(str, 20)) {
                this.f4371 = str;
                return this;
            }
            StringBuilder sb = new StringBuilder("setInitializationSource( ");
            sb.append(str);
            sb.append(" ) init source must have length of 1-20");
            C2921n.m7502("ISAdQualityConfig", sb.toString());
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f4376 = iSAdQualityLogLevel;
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) throws JSONException {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb = new StringBuilder("setMetaData( ");
                            sb.append(string);
                            sb.append(" , ");
                            sb.append(objOpt);
                            sb.append(" ) value must be a string");
                            C2921n.m7502("ISAdQualityConfig", sb.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setTestMode(boolean z) {
            this.f4379 = z;
            this.f4375 = true;
            return this;
        }

        public Builder setUserId(String str) {
            this.f4378 = str;
            this.f4377 = true;
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!C2656an.m5102(str)) {
                        if (C2656an.m5104(this.f4369, str)) {
                            StringBuilder sb = new StringBuilder("setMetaData( ");
                            sb.append(str);
                            sb.append(" , ");
                            sb.append(str2);
                            sb.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                            C2921n.m7502("ISAdQualityConfig", sb.toString());
                            return this;
                        }
                        if (!C2656an.m5103(str, str2)) {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(str);
                            sb2.append(" , ");
                            sb2.append(str2);
                            sb2.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                            C2921n.m7502("ISAdQualityConfig", sb2.toString());
                            return this;
                        }
                    }
                    this.f4369.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }
    }
}

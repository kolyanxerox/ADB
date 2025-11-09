package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.p009i.C2916kd;
import com.ironsource.adqualitysdk.sdk.p009i.C2921n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class ISAdQualitySegment {

    /* renamed from: ﮐ */
    private final long f4396;

    /* renamed from: ﱡ */
    private final Map<String, String> f4397;

    /* renamed from: ﺙ */
    private double f4398;

    /* renamed from: ﻐ */
    private final AtomicBoolean f4399;

    /* renamed from: ﻛ */
    private final String f4400;

    /* renamed from: ｋ */
    private final int f4401;

    /* renamed from: ﾇ */
    private final String f4402;

    /* renamed from: ﾒ */
    private final int f4403;

    public static class Builder {

        /* renamed from: ﻛ */
        private String f4409;

        /* renamed from: ﾒ */
        private String f4412;

        /* renamed from: ｋ */
        private double f4410 = 999999.99d;

        /* renamed from: ﾇ */
        private int f4411 = -1;

        /* renamed from: ﻐ */
        private int f4408 = -1;

        /* renamed from: ﱡ */
        private AtomicBoolean f4406 = null;

        /* renamed from: ﮐ */
        private long f4404 = 0;

        /* renamed from: ﱟ */
        private double f4405 = -1.0d;

        /* renamed from: ﻏ */
        private Map<String, String> f4407 = new HashMap();

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f4412, this.f4411, this.f4409, this.f4408, this.f4406, this.f4405, this.f4404, new HashMap(this.f4407), (byte) 0);
        }

        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i <= 199) {
                this.f4411 = i;
                return this;
            }
            StringBuilder sb = new StringBuilder("setAge( ");
            sb.append(i);
            sb.append(" ) age must be between 1-199");
            C2921n.m7502("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (this.f4407.size() >= 5) {
                        StringBuilder sb = new StringBuilder("setCustomData( ");
                        sb.append(str);
                        sb.append(" , ");
                        sb.append(str2);
                        sb.append(" ) limited to 5 custom values. Ignoring custom value.");
                        C2921n.m7502("ISAdQualitySegment Builder", sb.toString());
                        return this;
                    }
                    if (C2916kd.m7460(str) && C2916kd.m7460(str2) && C2916kd.m7451(str, 32) && C2916kd.m7451(str2, 32)) {
                        this.f4407.put("sgct_".concat(String.valueOf(str)), str2);
                        return this;
                    }
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) key and value must be alphanumeric and 1-32 in length");
                    C2921n.m7502("ISAdQualitySegment Builder", sb2.toString());
                    return this;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return this;
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.C3411a.f10173b) || str.toLowerCase(locale).equals(IronSourceConstants.C3411a.f10174c)) {
                this.f4409 = str.toLowerCase(locale);
                return this;
            }
            StringBuilder sb = new StringBuilder("setGender( ");
            sb.append(str);
            sb.append(" ) is invalid");
            C2921n.m7502("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setInAppPurchasesTotal(double d) {
            if (d >= 0.0d && d < this.f4410) {
                this.f4405 = Math.floor(d * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb = new StringBuilder("setIAPTotal( ");
            sb.append(d);
            sb.append(" ) iapt must be between 0-");
            sb.append(this.f4410);
            C2921n.m7502("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setIsPaying(boolean z) {
            if (this.f4406 == null) {
                this.f4406 = new AtomicBoolean();
            }
            this.f4406.set(z);
            return this;
        }

        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i < 999999) {
                this.f4408 = i;
                return this;
            }
            StringBuilder sb = new StringBuilder("setLevel( ");
            sb.append(i);
            sb.append(" ) level must be between 1-999999");
            C2921n.m7502("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (C2916kd.m7460(str) && C2916kd.m7451(str, 32)) {
                this.f4412 = str;
                return this;
            }
            StringBuilder sb = new StringBuilder("setSegmentName( ");
            sb.append(str);
            sb.append(" ) segment name must be alphanumeric and 1-32 in length");
            C2921n.m7502("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f4404 = j;
                return this;
            }
            StringBuilder sb = new StringBuilder("setUserCreationDate( ");
            sb.append(j);
            sb.append(" ) is an invalid timestamp");
            C2921n.m7502("ISAdQualitySegment Builder", sb.toString());
            return this;
        }
    }

    public /* synthetic */ ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map map, byte b) {
        this(str, i, str2, i2, atomicBoolean, d, j, map);
    }

    public int getAge() {
        return this.f4401;
    }

    public Map<String, String> getCustomData() {
        return this.f4397;
    }

    public String getGender() {
        return this.f4400;
    }

    public double getInAppPurchasesTotal() {
        return this.f4398;
    }

    public AtomicBoolean getIsPaying() {
        return this.f4399;
    }

    public int getLevel() {
        return this.f4403;
    }

    public String getName() {
        return this.f4402;
    }

    public long getUserCreationDate() {
        return this.f4396;
    }

    private ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map<String, String> map) {
        this.f4402 = str;
        this.f4401 = i;
        this.f4400 = str2;
        this.f4403 = i2;
        this.f4399 = atomicBoolean;
        this.f4398 = d;
        this.f4396 = j;
        this.f4397 = map;
    }
}

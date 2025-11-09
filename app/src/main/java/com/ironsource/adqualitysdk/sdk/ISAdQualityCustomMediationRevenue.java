package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes2.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻛ */
    private final ISAdQualityMediationNetwork f4380;

    /* renamed from: ｋ */
    private final ISAdQualityAdType f4381;

    /* renamed from: ﾇ */
    private final double f4382;

    /* renamed from: ﾒ */
    private final String f4383;

    public static class Builder {

        /* renamed from: ﻐ */
        private ISAdQualityMediationNetwork f4384 = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ﻛ */
        private ISAdQualityAdType f4385 = ISAdQualityAdType.UNKNOWN;

        /* renamed from: ｋ */
        private String f4386;

        /* renamed from: ﾇ */
        private double f4387;

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f4384, this.f4385, this.f4387, this.f4386, (byte) 0);
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f4385 = iSAdQualityAdType;
            return this;
        }

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f4384 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f4386 = str;
            return this;
        }

        public Builder setRevenue(double d) {
            this.f4387 = d;
            return this;
        }
    }

    public /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, byte b) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d, str);
    }

    public ISAdQualityAdType getAdType() {
        return this.f4381;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f4380;
    }

    public String getPlacement() {
        return this.f4383;
    }

    public double getRevenue() {
        return this.f4382;
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str) {
        this.f4380 = iSAdQualityMediationNetwork;
        this.f4381 = iSAdQualityAdType;
        this.f4382 = d;
        this.f4383 = str;
    }
}

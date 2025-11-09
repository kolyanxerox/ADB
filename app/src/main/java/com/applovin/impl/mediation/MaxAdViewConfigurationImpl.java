package com.applovin.impl.mediation;

import com.applovin.impl.sdk.C1240o;
import com.applovin.mediation.MaxAdViewConfiguration;

/* loaded from: classes.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* renamed from: a */
    private final MaxAdViewConfiguration.AdaptiveType f1211a;

    /* renamed from: b */
    private final int f1212b;

    /* renamed from: c */
    private final int f1213c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* renamed from: a */
        private MaxAdViewConfiguration.AdaptiveType f1214a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* renamed from: b */
        private int f1215b = -1;

        /* renamed from: c */
        private int f1216c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f1214a;
        }

        public int getAdaptiveWidth() {
            return this.f1215b;
        }

        public int getInlineMaximumHeight() {
            return this.f1216c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            C1240o.m3205e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f1214a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            C1240o.m3205e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + ")");
            this.f1215b = i;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            C1240o.m3205e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + ")");
            this.f1216c = i;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MaxAdViewConfiguration.Builder{adaptiveType=");
            sb.append(this.f1214a);
            sb.append(", adaptiveWidth=");
            sb.append(this.f1215b);
            sb.append(", inlineMaximumHeight=");
            return OooO0oO.OooOo.OooOOO(sb, this.f1216c, "}");
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f1211a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f1212b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f1213c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdViewConfiguration{adaptiveType=");
        sb.append(this.f1211a);
        sb.append(", adaptiveWidth=");
        sb.append(this.f1212b);
        sb.append(", inlineMaximumHeight=");
        return OooO0oO.OooOo.OooOOO(sb, this.f1213c, "}");
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f1211a = builderImpl.f1214a;
        this.f1212b = builderImpl.f1215b;
        this.f1213c = builderImpl.f1216c;
    }
}

package com.ironsource.mediationsdk;

import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class WaterfallConfiguration {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Double f9549a;

    /* renamed from: b */
    private final Double f9550b;

    public static final class Companion {
        private Companion() {
        }

        public final WaterfallConfigurationBuilder builder() {
            return new WaterfallConfigurationBuilder();
        }

        public final WaterfallConfiguration empty() {
            return builder().build();
        }

        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }
    }

    public static final class WaterfallConfigurationBuilder {

        /* renamed from: a */
        private Double f9551a;

        /* renamed from: b */
        private Double f9552b;

        public final WaterfallConfiguration build() {
            return new WaterfallConfiguration(this, null);
        }

        public final Double getCeiling$mediationsdk_release() {
            return this.f9552b;
        }

        public final Double getFloor$mediationsdk_release() {
            return this.f9551a;
        }

        public final WaterfallConfigurationBuilder setCeiling(double d) {
            this.f9552b = Double.valueOf(d);
            return this;
        }

        public final void setCeiling$mediationsdk_release(Double d) {
            this.f9552b = d;
        }

        public final WaterfallConfigurationBuilder setFloor(double d) {
            this.f9551a = Double.valueOf(d);
            return this;
        }

        public final void setFloor$mediationsdk_release(Double d) {
            this.f9551a = d;
        }
    }

    private WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder) {
        this.f9549a = waterfallConfigurationBuilder.getFloor$mediationsdk_release();
        this.f9550b = waterfallConfigurationBuilder.getCeiling$mediationsdk_release();
    }

    public static final WaterfallConfigurationBuilder builder() {
        return Companion.builder();
    }

    public static final WaterfallConfiguration empty() {
        return Companion.empty();
    }

    public final Double getCeiling() {
        return this.f9550b;
    }

    public final Double getFloor() {
        return this.f9549a;
    }

    public final String toJsonString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f9550b);
            jSONObject.put("floor", this.f9549a);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String string = jSONObject.toString();
        OooOo.OooO0Oo(string, "json.toString()");
        return string;
    }

    public String toString() {
        return "WaterfallConfiguration" + toJsonString();
    }

    public /* synthetic */ WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder, OooOO0O oooOO0O) {
        this(waterfallConfigurationBuilder);
    }
}

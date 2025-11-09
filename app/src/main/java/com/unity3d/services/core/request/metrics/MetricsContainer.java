package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.Oooo000;
import o00O0.o0O0O00;
import o00O0O00.OooOO0;

/* loaded from: classes3.dex */
public final class MetricsContainer {
    public static final Companion Companion = new Companion(null);
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final String apiLevel;
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;
    private final String metricSampleRate;
    private final List<Metric> metrics;
    private final String sTkn;
    private final String shSid;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public MetricsContainer(String metricSampleRate, MetricCommonTags commonTags, List<Metric> metrics, String str) {
        OooOo.OooO0o0(metricSampleRate, "metricSampleRate");
        OooOo.OooO0o0(commonTags, "commonTags");
        OooOo.OooO0o0(metrics, "metrics");
        this.metricSampleRate = metricSampleRate;
        this.commonTags = commonTags;
        this.metrics = metrics;
        this.sTkn = str;
        this.shSid = Session.Default.getId();
        this.apiLevel = String.valueOf(Device.getApiLevel());
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    public final Map<String, Object> toMap() {
        List<Metric> list = this.metrics;
        ArrayList arrayList = new ArrayList(Oooo000.OooOo0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Metric) it.next()).toMap());
        }
        OooOO0 oooOO0OooOOO0 = o0O0O00.OooOOO0();
        oooOO0OooOOO0.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        oooOO0OooOOO0.put(METRICS_CONTAINER, arrayList);
        oooOO0OooOOO0.put(METRICS_CONTAINER_TAGS, this.commonTags.toMap());
        oooOO0OooOOO0.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        oooOO0OooOOO0.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            oooOO0OooOOO0.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        String str2 = this.deviceModel;
        if (str2 != null) {
            oooOO0OooOOO0.put("deviceModel", str2);
        }
        String str3 = this.deviceName;
        if (str3 != null) {
            oooOO0OooOOO0.put(METRIC_CONTAINER_DEVICE_NAME, str3);
        }
        String str4 = this.deviceManufacturer;
        if (str4 != null) {
            oooOO0OooOOO0.put(METRIC_CONTAINER_DEVICE_MAKE, str4);
        }
        String str5 = this.gameId;
        if (str5 != null) {
            oooOO0OooOOO0.put("gameId", str5);
        }
        return o0O0O00.OooOO0o(oooOO0OooOOO0);
    }
}

package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.OooOo;
import o00O0.oo000o;

/* loaded from: classes3.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender _original, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        OooOo.OooO0o0(_original, "_original");
        OooOo.OooO0o0(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue<>();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String str, Map<String, String> tags) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(event, "event");
        OooOo.OooO0o0(tags, "tags");
        if (event.length() == 0) {
            DeviceLog.debug("Metric event not sent due to being empty: ".concat(event));
        } else {
            sendMetrics(o0OO0O0.OooOO0o(new Metric(event, str, tags)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        OooOo.OooO0o0(metric, "metric");
        sendMetrics(o0OO0O0.OooOO0o(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(List<Metric> metrics) {
        OooOo.OooO0o0(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(oo000o.f31251OooOo0O);
    }

    public final void updateOriginal(SDKMetricsSender metrics) {
        OooOo.OooO0o0(metrics, "metrics");
        this._original = metrics;
    }
}

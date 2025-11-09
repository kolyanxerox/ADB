package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import o00O0O0O.OooO00o;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000oo;

/* loaded from: classes3.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends OooO00o implements o0000O0 {
    final /* synthetic */ List $metrics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(o0000oo o0000ooVar, List list) {
        super(o0000ooVar);
        this.$metrics$inlined = list;
    }

    @Override // o00O0oOo.o0000O0
    public void handleException(OooOOO0 oooOOO0, Throwable th) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Metric " + this.$metrics$inlined + " failed to send with error: " + th);
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000oo;

/* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 */
/* loaded from: classes3.dex */
public final class C4090xa5c277d3 extends o00O0O0O.OooO00o implements o0000O0 {
    public C4090xa5c277d3(o0000oo o0000ooVar) {
        super(o0000ooVar);
    }

    @Override // o00O0oOo.o0000O0
    public void handleException(OooOOO0 oooOOO0, Throwable th) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("CleanUpExpiredOpportunity: " + th.getMessage());
    }
}

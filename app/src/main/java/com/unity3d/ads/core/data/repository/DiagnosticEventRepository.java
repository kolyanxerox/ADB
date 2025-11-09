package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import o00O0ooo.o0OOO0OO;

/* loaded from: classes3.dex */
public interface DiagnosticEventRepository {
    void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent);

    void clear();

    void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration);

    void flush();

    o0OOO0OO getDiagnosticEvents();
}

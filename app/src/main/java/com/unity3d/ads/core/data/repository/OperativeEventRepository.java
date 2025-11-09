package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0oo.o0000oo;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO00;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OOo000;
import o00O0ooo.o0o0000;

/* loaded from: classes3.dex */
public final class OperativeEventRepository {
    private final o0OO0oO0 _operativeEvents;
    private final o0OOO0OO operativeEvents;

    public OperativeEventRepository() {
        o0OOo000 o0ooo000OooO00o = o0o0000.OooO00o(10, 10, o0000oo.f31603OooOo0o);
        this._operativeEvents = o0ooo000OooO00o;
        this.operativeEvents = new o0OOO00(o0ooo000OooO00o);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        OooOo.OooO0o0(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.OooO00o(operativeEventRequest);
    }

    public final o0OOO0OO getOperativeEvents() {
        return this.operativeEvents;
    }
}

package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0oo.o0000oo;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO00;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OOo000;
import o00O0ooo.o0o0000;

/* loaded from: classes3.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final o0OO0oO0 _transactionEvents;
    private final o0OOO0OO transactionEvents;

    public AndroidTransactionEventRepository() {
        o0OOo000 o0ooo000OooO00o = o0o0000.OooO00o(10, 10, o0000oo.f31603OooOo0o);
        this._transactionEvents = o0ooo000OooO00o;
        this.transactionEvents = new o0OOO00(o0ooo000OooO00o);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        OooOo.OooO0o0(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.OooO00o(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public o0OOO0OO getTransactionEvents() {
        return this.transactionEvents;
    }
}

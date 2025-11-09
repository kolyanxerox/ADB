package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.TransactionEventRequestOuterClass;
import o00O0ooo.o0OOO0OO;

/* loaded from: classes3.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    o0OOO0OO getTransactionEvents();
}

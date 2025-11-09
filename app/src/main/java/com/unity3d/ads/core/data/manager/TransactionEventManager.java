package com.unity3d.ads.core.data.manager;

import com.ironsource.InterfaceC3173h3;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import o00O0.Oooo000;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000;
import o00O0oOo.o00000O0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.oo0o0Oo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class TransactionEventManager {
    public static final Companion Companion = new Companion(null);
    private static final String INAPP = "inapp";
    private static final int dummyOperationId = 42;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final o000OO scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final StoreMonitor storeMonitor;
    private final TransactionEventRepository transactionEventRepository;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", m13472f = "TransactionEventManager.kt", m13473l = {123}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1 */
    public static final class C40321 extends OooOOOO implements o00O0O {
        Object L$0;
        int label;

        public C40321(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return TransactionEventManager.this.new C40321(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
            } catch (Exception unused) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(TransactionEventManager.this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, null, 62, null);
            }
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                if (!TransactionEventManager.this.storeMonitor.isInitialized()) {
                    final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                    this.L$0 = transactionEventManager;
                    this.label = 1;
                    final oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(this));
                    oo0o0oo.OooOOo0();
                    transactionEventManager.storeMonitor.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                        private final void tryResume() {
                            if (oo0o0oo.isActive()) {
                                oo0o0oo.resumeWith(OooOo.f33195OooO00o);
                            }
                        }

                        private final void tryResumeWithException(Exception exc) {
                            if (oo0o0oo.isActive()) {
                                oo0o0oo.resumeWith(o000OOo.OooO0O0(exc));
                            }
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingServiceDisconnected() {
                            tryResumeWithException(new TransactionException("Billing service disconnected"));
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingSetupFinished(BillingResultBridge billingResult) {
                            kotlin.jvm.internal.OooOo.OooO0o0(billingResult, "billingResult");
                            if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                                tryResumeWithException(new TransactionException("Billing setup failed"));
                            } else {
                                tryResume();
                            }
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                        public void onIsAlreadyInitialized() {
                            tryResume();
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                        public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
                            kotlin.jvm.internal.OooOo.OooO0o0(billingResult, "billingResult");
                            transactionEventManager.onPurchasesReceived(billingResult, list);
                        }
                    });
                    if (oo0o0oo.OooOOOo() == oooOo00) {
                        return oooOo00;
                    }
                }
                return OooOo.f33195OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            StoreMonitor storeMonitor = TransactionEventManager.this.storeMonitor;
            final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
            storeMonitor.getPurchases(42, "inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.OooO00o
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    TransactionEventManager.access$onPurchasesReceived(transactionEventManager2, billingResultBridge, list);
                }
            });
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40321) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", m13472f = "TransactionEventManager.kt", m13473l = {92, 109, InterfaceC3173h3.d.b.f8827j}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1 */
    public static final class C40331 extends OooOOOO implements o00O0O {
        final /* synthetic */ List<PurchaseBridge> $purchases;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C40331(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3$lambda$2(List list, int i, List list2, TransactionEventManager transactionEventManager, PurchaseBridge purchaseBridge, BillingResultBridge billingResultBridge, List list3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            OooOo oooOo = OooOo.f33195OooO00o;
            if (list3 == null || billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                ((o00000O0) ((o00000) list.get(i))).Oooo0oO(oooOo);
                return;
            }
            ArrayList arrayList = new ArrayList(Oooo000.OooOo0(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(transactionEventManager.getTransactionData.invoke(purchaseBridge, (SkuDetailsBridge) it.next()));
            }
            list2.addAll(arrayList);
            ((o00000O0) ((o00000) list.get(i))).Oooo0oO(oooOo);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C40331(this.$purchases, this.this$0, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x01d5, code lost:
        
            if (r1 == r2) goto L54;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01c6  */
        /* JADX WARN: Type inference failed for: r11v0, types: [o00O0oOo.o00O0O00] */
        /* JADX WARN: Type inference failed for: r1v6, types: [o00O0oOo.o000O0o[]] */
        /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d2 -> B:25:0x00de). Please report as a decompilation issue!!! */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                Method dump skipped, instructions count: 484
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C40331.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40331) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public TransactionEventManager(o000OO scope, StoreMonitor storeMonitor, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource iapTransactionStore, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.OooOo.OooO0o0(scope, "scope");
        kotlin.jvm.internal.OooOo.OooO0o0(storeMonitor, "storeMonitor");
        kotlin.jvm.internal.OooOo.OooO0o0(getTransactionData, "getTransactionData");
        kotlin.jvm.internal.OooOo.OooO0o0(getTransactionRequest, "getTransactionRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(iapTransactionStore, "iapTransactionStore");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.storeMonitor = storeMonitor;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static final /* synthetic */ void access$onPurchasesReceived(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK || list == null || list.isEmpty()) {
            return;
        }
        o0000OO0.OooOo0(this.scope, null, new C40331(list, this, null), 3);
    }

    public final void invoke() {
        o0000OO0.OooOo0(this.scope, null, new C40321(null), 3);
    }
}

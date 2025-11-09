package com.unity3d.services.store.gpbl.listeners;

/* loaded from: classes3.dex */
public interface BillingInitializationListener extends BillingClientStateListener, PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}

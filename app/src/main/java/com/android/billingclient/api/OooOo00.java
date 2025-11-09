package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;

/* loaded from: classes.dex */
public abstract class OooOo00 {
    public static final BillingResult OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public static final BillingResult f15473OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public static final BillingResult f15474OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public static final BillingResult f15475OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public static final BillingResult f15476OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public static final BillingResult f15477OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public static final BillingResult f15478OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public static final BillingResult f15479OooOOoo;

    /* renamed from: OooOo, reason: collision with root package name */
    public static final BillingResult f15480OooOo;
    public static final BillingResult OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public static final BillingResult f15481OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final BillingResult f15482OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final BillingResult f15483OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final BillingResult f15484OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final BillingResult f15485OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final BillingResult f15486OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final BillingResult f15487OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final BillingResult f15488OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final BillingResult f15489OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final BillingResult f15490OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public static final BillingResult f15491Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final BillingResult f15492Oooo00O;

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final BillingResult f15463OooO00o = OooO0oO.OooOo.OooO0OO(3, "Google Play In-app Billing API version is less than 3");

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final BillingResult f15464OooO0O0 = OooO0oO.OooOo.OooO0OO(3, "Google Play In-app Billing API version is less than 9");

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final BillingResult f15465OooO0OO = OooO0oO.OooOo.OooO0OO(3, "Billing service unavailable on device.");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final BillingResult f15466OooO0Oo = OooO0oO.OooOo.OooO0OO(2, "Billing service unavailable on device.");

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final BillingResult f15468OooO0o0 = OooO0oO.OooOo.OooO0OO(5, "Client is already in the process of connecting to billing service.");

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final BillingResult f15467OooO0o = OooO0oO.OooOo.OooO0OO(5, "The list of SKUs can't be empty.");

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final BillingResult f15469OooO0oO = OooO0oO.OooOo.OooO0OO(5, "SKU type can't be empty.");

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final BillingResult f15470OooO0oo = OooO0oO.OooOo.OooO0OO(5, "Product type can't be empty.");

    /* renamed from: OooO, reason: collision with root package name */
    public static final BillingResult f15462OooO = OooO0oO.OooOo.OooO0OO(-2, "Client does not support extra params.");

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final BillingResult f15471OooOO0 = OooO0oO.OooOo.OooO0OO(5, "Invalid purchase token.");

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final BillingResult f15472OooOO0O = OooO0oO.OooOo.OooO0OO(6, "An internal error occurred.");

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(5);
        builderNewBuilder.setDebugMessage("SKU can't be null.");
        builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(0);
        OooOO0o = builderNewBuilder2.build();
        f15474OooOOO0 = OooO0oO.OooOo.OooO0OO(-1, "Service connection is disconnected.");
        f15473OooOOO = OooO0oO.OooOo.OooO0OO(2, "Timeout communicating with service.");
        f15475OooOOOO = OooO0oO.OooOo.OooO0OO(-2, "Client does not support subscriptions.");
        f15476OooOOOo = OooO0oO.OooOo.OooO0OO(-2, "Client does not support subscriptions update.");
        f15478OooOOo0 = OooO0oO.OooOo.OooO0OO(-2, "Client does not support get purchase history.");
        f15477OooOOo = OooO0oO.OooOo.OooO0OO(-2, "Client does not support price change confirmation.");
        f15479OooOOoo = OooO0oO.OooOo.OooO0OO(-2, "Play Store version installed does not support cross selling products.");
        f15481OooOo00 = OooO0oO.OooOo.OooO0OO(-2, "Client does not support multi-item purchases.");
        OooOo0 = OooO0oO.OooOo.OooO0OO(-2, "Client does not support offer_id_token.");
        f15482OooOo0O = OooO0oO.OooOo.OooO0OO(-2, "Client does not support ProductDetails.");
        f15483OooOo0o = OooO0oO.OooOo.OooO0OO(-2, "Client does not support in-app messages.");
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(-2);
        builderNewBuilder3.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(-2);
        builderNewBuilder4.setDebugMessage("Play Store version installed does not support external offer.");
        f15480OooOo = builderNewBuilder4.build();
        f15485OooOoO0 = OooO0oO.OooOo.OooO0OO(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f15484OooOoO = OooO0oO.OooOo.OooO0OO(5, "Unknown feature");
        f15486OooOoOO = OooO0oO.OooOo.OooO0OO(-2, "Play Store version installed does not support get billing config.");
        f15488OooOoo0 = OooO0oO.OooOo.OooO0OO(-2, "Query product details with serialized docid is not supported.");
        f15487OooOoo = OooO0oO.OooOo.OooO0OO(4, "Item is unavailable for purchase.");
        f15489OooOooO = OooO0oO.OooOo.OooO0OO(-2, "Query product details with developer specified account is not supported.");
        f15490OooOooo = OooO0oO.OooOo.OooO0OO(-2, "Play Store version installed does not support alternative billing only.");
        f15491Oooo000 = OooO0oO.OooOo.OooO0OO(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f15492Oooo00O = OooO0oO.OooOo.OooO0OO(6, "An error occurred while retrieving billing override.");
    }

    public static BillingResult OooO00o(int i, String str) {
        return OooO0oO.OooOo.OooO0OO(i, str);
    }
}

package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import com.google.android.gms.internal.play_billing.o00O0O0;
import com.google.android.gms.internal.play_billing.o00O0O00;
import com.google.android.gms.internal.play_billing.o00O0OO;
import com.google.android.gms.internal.play_billing.o00O0OOO;
import com.google.android.gms.internal.play_billing.o00OO00O;
import com.google.android.gms.internal.play_billing.o00OO0O0;
import com.google.android.gms.internal.play_billing.o00OO0OO;
import com.google.android.gms.internal.play_billing.o0O000Oo;
import com.google.android.gms.internal.play_billing.o0O0oo0o;
import com.google.android.gms.internal.play_billing.o0OOO0;
import com.google.android.gms.internal.play_billing.o0OOOO00;
import com.google.android.gms.internal.play_billing.oO000o00;
import com.google.android.gms.internal.play_billing.oO00O0o;
import com.google.android.gms.internal.play_billing.oO00O0o0;
import com.google.android.gms.internal.play_billing.oO0O0OoO;
import com.google.android.gms.internal.play_billing.oOO00O;
import com.google.android.gms.internal.play_billing.oOo00OO0;
import com.google.android.gms.internal.play_billing.oo00o;
import com.google.android.gms.internal.play_billing.oo0o0O0;
import com.google.android.gms.internal.play_billing.oo0oOO0;
import com.ironsource.InterfaceC3173h3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class OooOOOO extends OooO00o {

    /* renamed from: Oooo0 */
    public volatile com.google.android.gms.internal.play_billing.OooOOO f15457Oooo0;

    /* renamed from: Oooo00O */
    public final Context f15458Oooo00O;

    /* renamed from: Oooo00o */
    public volatile int f15459Oooo00o;

    /* renamed from: Oooo0O0 */
    public volatile OooOOO f15460Oooo0O0;

    /* renamed from: Oooo0OO */
    public volatile o00O0OOO f15461Oooo0OO;

    public OooOOOO(Context context) {
        super(context);
        this.f15459Oooo00o = 0;
        this.f15458Oooo00O = context;
    }

    public final /* synthetic */ void Oooo0(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        super.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
    }

    public final /* synthetic */ void Oooo00O(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        super.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
    }

    public final /* synthetic */ void Oooo00o(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        super.consumeAsync(consumeParams, consumeResponseListener);
    }

    public final /* synthetic */ void Oooo0O0(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        super.querySkuDetailsAsync(skuDetailsParams, skuDetailsResponseListener);
    }

    public final synchronized boolean Oooo0OO() {
        if (this.f15459Oooo00o == 2 && this.f15457Oooo0 != null) {
            if (this.f15460Oooo0O0 != null) {
                return true;
            }
        }
        return false;
    }

    public final void Oooo0o(int i, int i2, BillingResult billingResult) {
        o0OOO0 o0ooo0Zzb = zzcg.zzb(i, i2, billingResult);
        Objects.requireNonNull(o0ooo0Zzb, "ApiFailure should not be null");
        this.f15420OooO0oO.OooOO0O(o0ooo0Zzb);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.android.billingclient.api.zzbs] */
    public final oo0o0O0 Oooo0o0(final int i) {
        if (!Oooo0OO()) {
            oOO00O.OooO0oo("BillingClientTesting", "Billing Override Service is not ready.");
            Oooo0o(106, 28, OooOo00.OooO00o(-1, "Billing Override Service connection is disconnected."));
            return new o00O0O0();
        }
        ?? r0 = new Object() { // from class: com.android.billingclient.api.zzbs
            public final Object zza(oO0O0OoO oo0o0ooo) {
                String str;
                OooOOOO oooOOOO = this.zza;
                int i2 = i;
                oooOOOO.getClass();
                try {
                    if (oooOOOO.f15457Oooo0 == null) {
                        throw null;
                    }
                    com.google.android.gms.internal.play_billing.OooOOO oooOOO = oooOOOO.f15457Oooo0;
                    String packageName = oooOOOO.f15458Oooo00O.getPackageName();
                    switch (i2) {
                        case 2:
                            str = "LAUNCH_BILLING_FLOW";
                            break;
                        case 3:
                            str = "ACKNOWLEDGE_PURCHASE";
                            break;
                        case 4:
                            str = "CONSUME_ASYNC";
                            break;
                        case 5:
                            str = "IS_FEATURE_SUPPORTED";
                            break;
                        case 6:
                            str = "START_CONNECTION";
                            break;
                        case 7:
                            str = "QUERY_PRODUCT_DETAILS_ASYNC";
                            break;
                        default:
                            str = "QUERY_SKU_DETAILS_ASYNC";
                            break;
                    }
                    OooO0oO.OooOOOO oooOOOO2 = new OooO0oO.OooOOOO(oo0o0ooo);
                    com.google.android.gms.internal.play_billing.OooOO0O oooOO0O = (com.google.android.gms.internal.play_billing.OooOO0O) oooOOO;
                    Parcel parcelO000O0oO = oooOO0O.o000O0oO();
                    parcelO000O0oO.writeString(packageName);
                    parcelO000O0oO.writeString(str);
                    int i3 = com.google.android.gms.internal.play_billing.OooOO0.f26955OooO00o;
                    parcelO000O0oO.writeStrongBinder(oooOOOO2);
                    oooOO0O.o000OO00(parcelO000O0oO, 1);
                    return "billingOverrideService.getBillingOverride";
                } catch (Exception e) {
                    oooOOOO.Oooo0o(107, 28, OooOo00.f15492Oooo00O);
                    oOO00O.OooO("BillingClientTesting", "An error occurred while retrieving billing override.", e);
                    oo0o0ooo.f27202OooO0Oo = true;
                    oO00O0o oo00o0o = oo0o0ooo.f27200OooO0O0;
                    if (oo00o0o == null) {
                        return "billingOverrideService.getBillingOverride";
                    }
                    oO00O0o0 oo00o0o0 = oo00o0o.f27197OooOo0o;
                    oo00o0o0.getClass();
                    if (!oO000o00.f27191OooOoOO.OooOo0O(oo00o0o0, null, 0)) {
                        return "billingOverrideService.getBillingOverride";
                    }
                    oO000o00.OooO0OO(oo00o0o0);
                    oo0o0ooo.f27199OooO00o = null;
                    oo0o0ooo.f27200OooO0O0 = null;
                    oo0o0ooo.f27201OooO0OO = null;
                    return "billingOverrideService.getBillingOverride";
                }
            }
        };
        oO0O0OoO oo0o0ooo = new oO0O0OoO();
        oo0o0ooo.f27201OooO0OO = new oOo00OO0();
        oO00O0o oo00o0o = new oO00O0o(oo0o0ooo);
        oo0o0ooo.f27200OooO0O0 = oo00o0o;
        oo0o0ooo.f27199OooO00o = zzbs.class;
        try {
            oo0o0ooo.f27199OooO00o = r0.zza(oo0o0ooo);
            return oo00o0o;
        } catch (Exception e) {
            o0O0oo0o o0o0oo0o = new o0O0oo0o(e);
            o0O000Oo o0o000oo = oO000o00.f27191OooOoOO;
            oO00O0o0 oo00o0o0 = oo00o0o.f27197OooOo0o;
            if (o0o000oo.OooOo0O(oo00o0o0, null, o0o0oo0o)) {
                oO000o00.OooO0OO(oo00o0o0);
            }
            return oo00o0o;
        }
    }

    public final void Oooo0oO(int i, Consumer consumer, Runnable runnable) {
        o00O0OOO o00o0ooo;
        o00O0OO o00o0oo;
        o00O0OO o00oo00o;
        oo0o0O0 oo0o0o0Oooo0o0 = Oooo0o0(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f15461Oooo0OO == null) {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.f15461Oooo0OO = scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof o00O0OOO ? (o00O0OOO) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new o00OO00O(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                }
                o00o0ooo = this.f15461Oooo0OO;
            } finally {
            }
        }
        if (!oo0o0o0Oooo0o0.isDone()) {
            o00OO0OO o00oo0oo = new o00OO0OO();
            o00oo0oo.f27065OooOoo = oo0o0o0Oooo0o0;
            o00OO0O0 o00oo0o0 = new o00OO0O0();
            o00oo0o0.f27064OooOo0O = o00oo0oo;
            o00oo0oo.f27066OooOooO = ((o00OO00O) o00o0ooo).schedule(o00oo0o0, 28500L, timeUnit);
            oo0o0o0Oooo0o0.OooO00o(o00oo0o0, oo00o.f27205OooOo0O);
            oo0o0o0Oooo0o0 = o00oo0oo;
        }
        OooO0oO.OooOOO oooOOO = new OooO0oO.OooOOO(this, i, consumer, runnable);
        synchronized (this) {
            try {
                if (this.f15441OooOooo == null) {
                    ExecutorService executorServiceOooO0o0 = OooO0o0();
                    if (executorServiceOooO0o0 instanceof o00O0OO) {
                        o00oo00o = (o00O0OO) executorServiceOooO0o0;
                    } else {
                        o00oo00o = executorServiceOooO0o0 instanceof ScheduledExecutorService ? new o00OO00O((ScheduledExecutorService) executorServiceOooO0o0) : new oo0oOO0(executorServiceOooO0o0);
                    }
                    this.f15441OooOooo = o00oo00o;
                }
                o00o0oo = this.f15441OooOooo;
            } finally {
            }
        }
        oo0o0o0Oooo0o0.OooO00o(new o00O0O00(oo0o0o0Oooo0o0, oooOOO), o00o0oo);
    }

    public final /* synthetic */ BillingResult Oooo0oo(Activity activity, BillingFlowParams billingFlowParams) {
        return super.launchBillingFlow(activity, billingFlowParams);
    }

    @Override // com.android.billingclient.api.OooO00o, com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Objects.requireNonNull(acknowledgePurchaseResponseListener);
        Oooo0oO(3, new Consumer() { // from class: com.android.billingclient.api.zzbv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse((BillingResult) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.Oooo00O(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.OooO00o, com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        Oooo0oO(4, new Consumer() { // from class: com.android.billingclient.api.zzbq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                consumeResponseListener.onConsumeResponse((BillingResult) obj, consumeParams.getPurchaseToken());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.Oooo00o(consumeParams, consumeResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.OooO00o, com.android.billingclient.api.BillingClient
    public final void endConnection() {
        synchronized (this) {
            o0OOOO00 o0oooo00Zzd = zzcg.zzd(27);
            Objects.requireNonNull(o0oooo00Zzd, "ApiSuccess should not be null");
            this.f15420OooO0oO.OooOOO(o0oooo00Zzd);
            try {
                try {
                    if (this.f15460Oooo0O0 != null && this.f15457Oooo0 != null) {
                        oOO00O.OooO0oO("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f15458Oooo00O.unbindService(this.f15460Oooo0O0);
                        this.f15460Oooo0O0 = new OooOOO(this);
                    }
                    this.f15457Oooo0 = null;
                    if (this.f15461Oooo0OO != null) {
                        ((oo0oOO0) this.f15461Oooo0OO).shutdownNow();
                        this.f15461Oooo0OO = null;
                    }
                } catch (RuntimeException e) {
                    oOO00O.OooO("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.f15459Oooo00o = 3;
            } catch (Throwable th) {
                this.f15459Oooo00o = 3;
                throw th;
            }
        }
        super.endConnection();
    }

    @Override // com.android.billingclient.api.OooO00o, com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(final Activity activity, final BillingFlowParams billingFlowParams) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.zzbx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.zza.Oooo000((BillingResult) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzbo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.Oooo0oo(activity, billingFlowParams);
            }
        };
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) Oooo0o0(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            Oooo0o(114, 28, OooOo00.f15492Oooo00O);
            oOO00O.OooO("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Oooo0o(107, 28, OooOo00.f15492Oooo00O);
            oOO00O.OooO("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            BillingResult billingResultOooO00o = OooOo00.OooO00o(iIntValue, "Billing override value was set by a license tester.");
            Oooo0o(InterfaceC3173h3.d.b.f8823f, 2, billingResultOooO00o);
            consumer.accept(billingResultOooO00o);
            return billingResultOooO00o;
        }
        try {
            return (BillingResult) callable.call();
        } catch (Exception e3) {
            BillingResult billingResult = OooOo00.f15472OooOO0O;
            Oooo0o(115, 2, billingResult);
            oOO00O.OooO("BillingClientTesting", "An internal error occurred.", e3);
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.OooO00o, com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        Oooo0oO(7, new Consumer() { // from class: com.android.billingclient.api.zzbn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                productDetailsResponseListener.onProductDetailsResponse((BillingResult) obj, arrayList);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.Oooo0(queryProductDetailsParams, productDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.OooO00o, com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(final SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        Oooo0oO(8, new Consumer() { // from class: com.android.billingclient.api.zzbt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                skuDetailsResponseListener.onSkuDetailsResponse((BillingResult) obj, null);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.Oooo0O0(skuDetailsParams, skuDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.OooO00o, com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        synchronized (this) {
            if (Oooo0OO()) {
                oOO00O.OooO0oO("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                o0OOOO00 o0oooo00Zzd = zzcg.zzd(26);
                Objects.requireNonNull(o0oooo00Zzd, "ApiSuccess should not be null");
                this.f15420OooO0oO.OooOOO(o0oooo00Zzd);
            } else {
                int i = 1;
                if (this.f15459Oooo00o == 1) {
                    oOO00O.OooO0oo("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f15459Oooo00o == 3) {
                    oOO00O.OooO0oo("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    Oooo0o(38, 26, OooOo00.OooO00o(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f15459Oooo00o = 1;
                    oOO00O.OooO0oO("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.f15460Oooo0O0 = new OooOOO(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> listQueryIntentServices = this.f15458Oooo00O.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                oOO00O.OooO0oo("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f15458Oooo00O.bindService(intent2, this.f15460Oooo0O0, 1)) {
                                    oOO00O.OooO0oO("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    oOO00O.OooO0oo("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i = 39;
                        }
                    }
                    this.f15459Oooo00o = 0;
                    oOO00O.OooO0oO("BillingClientTesting", "Billing Override Service unavailable on device.");
                    Oooo0o(i, 26, OooOo00.OooO00o(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.startConnection(billingClientStateListener);
    }

    public OooOOOO(PendingPurchasesParams pendingPurchasesParams, Context context) {
        super(pendingPurchasesParams, context);
        this.f15459Oooo00o = 0;
        this.f15458Oooo00O = context;
    }

    public OooOOOO(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener);
        this.f15459Oooo00o = 0;
        this.f15458Oooo00O = context;
    }

    public OooOOOO(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener);
        this.f15459Oooo00o = 0;
        this.f15458Oooo00O = context;
    }
}

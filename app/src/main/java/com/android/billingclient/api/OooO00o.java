package com.android.billingclient.api;

import OooO0oO.o0OoOo0;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.BundleCompat;
import androidx.work.WorkRequest;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.C2360o;
import com.google.android.gms.internal.play_billing.o000000;
import com.google.android.gms.internal.play_billing.o0000OO0;
import com.google.android.gms.internal.play_billing.o00O0OO;
import com.google.android.gms.internal.play_billing.o0OOO0;
import com.google.android.gms.internal.play_billing.o0OOO00;
import com.google.android.gms.internal.play_billing.o0OOO0OO;
import com.google.android.gms.internal.play_billing.o0OOOO00;
import com.google.android.gms.internal.play_billing.o0OOOO0o;
import com.google.android.gms.internal.play_billing.o0OOo000;
import com.google.android.gms.internal.play_billing.oO00000;
import com.google.android.gms.internal.play_billing.oO0000O;
import com.google.android.gms.internal.play_billing.oO0000o0;
import com.google.android.gms.internal.play_billing.oO0OOo0o;
import com.google.android.gms.internal.play_billing.oOO00O;
import com.google.android.gms.internal.play_billing.oo0o0Oo;
import com.google.android.gms.internal.play_billing.ooOOOOoo;
import com.ironsource.C3126fq;
import com.ironsource.InterfaceC3173h3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: classes.dex */
public class OooO00o extends BillingClient {

    /* renamed from: OooO */
    public volatile OooO0o f15413OooO;

    /* renamed from: OooO00o */
    public final Object f15414OooO00o;

    /* renamed from: OooO0O0 */
    public volatile int f15415OooO0O0;

    /* renamed from: OooO0OO */
    public final String f15416OooO0OO;

    /* renamed from: OooO0Oo */
    public final Handler f15417OooO0Oo;

    /* renamed from: OooO0o */
    public final Context f15418OooO0o;

    /* renamed from: OooO0o0 */
    public volatile o0OoOo0 f15419OooO0o0;

    /* renamed from: OooO0oO */
    public final OooO0oO.OooOOO0 f15420OooO0oO;

    /* renamed from: OooO0oo */
    public volatile com.google.android.gms.internal.play_billing.OooO f15421OooO0oo;

    /* renamed from: OooOO0 */
    public boolean f15422OooOO0;

    /* renamed from: OooOO0O */
    public boolean f15423OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO */
    public boolean f15424OooOOO;

    /* renamed from: OooOOO0 */
    public boolean f15425OooOOO0;

    /* renamed from: OooOOOO */
    public boolean f15426OooOOOO;

    /* renamed from: OooOOOo */
    public boolean f15427OooOOOo;

    /* renamed from: OooOOo */
    public boolean f15428OooOOo;

    /* renamed from: OooOOo0 */
    public boolean f15429OooOOo0;

    /* renamed from: OooOOoo */
    public boolean f15430OooOOoo;

    /* renamed from: OooOo */
    public boolean f15431OooOo;
    public boolean OooOo0;

    /* renamed from: OooOo00 */
    public boolean f15432OooOo00;

    /* renamed from: OooOo0O */
    public boolean f15433OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f15434OooOo0o;

    /* renamed from: OooOoO */
    public boolean f15435OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f15436OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f15437OooOoOO;

    /* renamed from: OooOoo */
    public final boolean f15438OooOoo;

    /* renamed from: OooOoo0 */
    public final PendingPurchasesParams f15439OooOoo0;

    /* renamed from: OooOooO */
    public ExecutorService f15440OooOooO;

    /* renamed from: OooOooo */
    public volatile o00O0OO f15441OooOooo;

    /* renamed from: Oooo000 */
    public final Long f15442Oooo000;

    public OooO00o(Context context) {
        this.f15414OooO00o = new Object();
        this.f15415OooO0O0 = 0;
        this.f15417OooO0Oo = new Handler(Looper.getMainLooper());
        this.OooOO0o = 0;
        long jNextLong = new Random().nextLong();
        this.f15442Oooo000 = Long.valueOf(jNextLong);
        String strOooO0Oo = OooO0Oo();
        this.f15416OooO0OO = strOooO0Oo;
        this.f15418OooO0o = context.getApplicationContext();
        C2360o c2360oOooOOo = oO00000.OooOOo();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOo0((oO00000) c2360oOooOOo.f27076OooOo0o, strOooO0Oo);
        String packageName = this.f15418OooO0o.getPackageName();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOo((oO00000) c2360oOooOOo.f27076OooOo0o, packageName);
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOO((oO00000) c2360oOooOOo.f27076OooOo0o, jNextLong);
        this.f15420OooO0oO = new OooO0oO.OooOOO0(this.f15418OooO0o, (oO00000) c2360oOooOOo.OooO0O0());
        this.f15418OooO0o.getPackageName();
    }

    public static Future OooO00o(Callable callable, long j, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    oOO00O.OooO0oo("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            oOO00O.OooO("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String OooO0Oo() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    public final void OooO(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 9, billingResult);
            oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, o0000OO0.f26985OooOoO);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            oOO00O.OooO0oo("BillingClient", "Please provide a valid product type.");
            BillingResult billingResult2 = OooOo00.f15470OooO0oo;
            OooOoo(50, 9, billingResult2);
            oo0o0Oo oo0o0oo2 = o000000.f26972OooOo0o;
            purchasesResponseListener.onQueryPurchasesResponse(billingResult2, o0000OO0.f26985OooOoO);
            return;
        }
        if (OooO00o(new OooO0oO.OooO0o(this, str, purchasesResponseListener, 0), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzac
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                PurchasesResponseListener purchasesResponseListener2 = purchasesResponseListener;
                oooO00o.getClass();
                BillingResult billingResult3 = OooOo00.f15473OooOOO;
                oooO00o.OooOoo(24, 9, billingResult3);
                oo0o0Oo oo0o0oo3 = o000000.f26972OooOo0o;
                purchasesResponseListener2.onQueryPurchasesResponse(billingResult3, o0000OO0.f26985OooOoO);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            BillingResult billingResultOooO0O0 = OooO0O0();
            OooOoo(25, 9, billingResultOooO0O0);
            oo0o0Oo oo0o0oo3 = o000000.f26972OooOo0o;
            purchasesResponseListener.onQueryPurchasesResponse(billingResultOooO0O0, o0000OO0.f26985OooOoO);
        }
    }

    public final BillingResult OooO0O0() {
        int[] iArr = {0, 3};
        synchronized (this.f15414OooO00o) {
            for (int i = 0; i < 2; i++) {
                if (this.f15415OooO0O0 == iArr[i]) {
                    return OooOo00.f15474OooOOO0;
                }
            }
            return OooOo00.f15472OooOO0O;
        }
    }

    public final void OooO0OO() {
        if (TextUtils.isEmpty(null)) {
            this.f15418OooO0o.getPackageName();
        }
    }

    public final void OooO0o(o0OOO0 o0ooo0) {
        try {
            this.f15420OooO0oO.OooOOO0(o0ooo0, this.OooOO0o);
        } catch (Throwable th) {
            oOO00O.OooO("BillingClient", "Unable to log.", th);
        }
    }

    public final synchronized ExecutorService OooO0o0() {
        try {
            if (this.f15440OooOooO == null) {
                this.f15440OooOooO = Executors.newFixedThreadPool(oOO00O.f27203OooO00o, new OooO0oO.OooO0OO());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15440OooOooO;
    }

    public final void OooO0oO(o0OOOO00 o0oooo00) {
        try {
            OooO0oO.OooOOO0 oooOOO0 = this.f15420OooO0oO;
            int i = this.OooOO0o;
            oooOOO0.getClass();
            try {
                C2360o c2360o = (C2360o) ((oO00000) oooOOO0.f13280OooOo0o).OooO0oO();
                c2360o.OooO0Oo();
                oO00000.OooOOO((oO00000) c2360o.f27076OooOo0o, i);
                oooOOO0.f13280OooOo0o = (oO00000) c2360o.OooO0O0();
                oooOOO0.OooOOO(o0oooo00);
            } catch (Throwable th) {
                oOO00O.OooO("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            oOO00O.OooO("BillingClient", "Unable to log.", th2);
        }
    }

    public final void OooO0oo(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 11, billingResult);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (OooO00o(new OooO0oO.OooO0o(this, str, purchaseHistoryResponseListener, 1), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                PurchaseHistoryResponseListener purchaseHistoryResponseListener2 = purchaseHistoryResponseListener;
                oooO00o.getClass();
                BillingResult billingResult2 = OooOo00.f15473OooOOO;
                oooO00o.OooOoo(24, 11, billingResult2);
                purchaseHistoryResponseListener2.onPurchaseHistoryResponse(billingResult2, null);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            BillingResult billingResultOooO0O0 = OooO0O0();
            OooOoo(25, 11, billingResultOooO0O0);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultOooO0O0, null);
        }
    }

    public final void OooOO0(int i) {
        synchronized (this.f15414OooO00o) {
            try {
                if (this.f15415OooO0O0 == 3) {
                    return;
                }
                int i2 = this.f15415OooO0O0;
                oOO00O.OooO0oO("BillingClient", "Setting clientState from " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f15415OooO0O0 = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0O() {
        synchronized (this.f15414OooO00o) {
            if (this.f15413OooO != null) {
                try {
                    this.f15418OooO0o.unbindService(this.f15413OooO);
                } catch (Throwable th) {
                    try {
                        oOO00O.OooO("BillingClient", "There was an exception while unbinding service!", th);
                        this.f15421OooO0oo = null;
                        this.f15413OooO = null;
                    } finally {
                        this.f15421OooO0oo = null;
                        this.f15413OooO = null;
                    }
                }
            }
        }
    }

    public final OooO0oO.OooOO0O OooOO0o(BillingResult billingResult, int i, String str, Exception exc) {
        oOO00O.OooO("BillingClient", str, exc);
        OooOooO(i, 7, billingResult, zzcg.zza(exc));
        return new OooO0oO.OooOO0O(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList());
    }

    public final zzcv OooOOO(BillingResult billingResult, int i, String str, Exception exc) {
        OooOooO(i, 9, billingResult, zzcg.zza(exc));
        oOO00O.OooO("BillingClient", str, exc);
        return new zzcv(billingResult, null);
    }

    public final OooO0oO.OooOOO0 OooOOO0(BillingResult billingResult, int i, String str, Exception exc) {
        oOO00O.OooO("BillingClient", str, exc);
        OooOooO(i, 11, billingResult, zzcg.zza(exc));
        return new OooO0oO.OooOOO0(0, billingResult, (Object) null);
    }

    public final OooO0oO.OooOO0O OooOOOO(BillingResult billingResult, int i, String str, Exception exc) {
        oOO00O.OooO("BillingClient", str, exc);
        OooOooO(i, 8, billingResult, zzcg.zza(exc));
        return new OooO0oO.OooOO0O(billingResult.getResponseCode(), billingResult.getDebugMessage(), null);
    }

    public final void OooOOOo(int i, int i2, BillingResult billingResult) {
        o0OOOO00 o0oooo00 = null;
        o0OOO0 o0ooo0 = null;
        if (billingResult.getResponseCode() == 0) {
            int i3 = zzcg.zza;
            try {
                o0OOO0OO o0ooo0ooOooOOo0 = o0OOOO00.OooOOo0();
                o0ooo0ooOooOOo0.OooO0Oo();
                o0OOOO00.OooOOOo((o0OOOO00) o0ooo0ooOooOOo0.f27076OooOo0o, 5);
                oO0000O oo0000oOooOOOO = oO0000o0.OooOOOO();
                oo0000oOooOOOO.OooO0Oo();
                oO0000o0.OooOOO((oO0000o0) oo0000oOooOOOO.f27076OooOo0o, i2);
                oO0000o0 oo0000o0 = (oO0000o0) oo0000oOooOOOO.OooO0O0();
                o0ooo0ooOooOOo0.OooO0Oo();
                o0OOOO00.OooOOO((o0OOOO00) o0ooo0ooOooOOo0.f27076OooOo0o, oo0000o0);
                o0oooo00 = (o0OOOO00) o0ooo0ooOooOOo0.OooO0O0();
            } catch (Exception e) {
                oOO00O.OooO("BillingLogger", "Unable to create logging payload", e);
            }
            OooO0oO(o0oooo00);
            return;
        }
        int i4 = zzcg.zza;
        try {
            o0OOO00 o0ooo00OooOOo = o0OOO0.OooOOo();
            o0OOOO0o o0oooo0oOooOOo = o0OOo000.OooOOo();
            o0oooo0oOooOOo.OooO0o0(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            o0oooo0oOooOOo.OooO0Oo();
            o0OOo000.OooOOOO((o0OOo000) o0oooo0oOooOOo.f27076OooOo0o, debugMessage);
            o0oooo0oOooOOo.OooO0o(i);
            o0ooo00OooOOo.OooO0o0(o0oooo0oOooOOo);
            o0ooo00OooOOo.OooO0o(5);
            oO0000O oo0000oOooOOOO2 = oO0000o0.OooOOOO();
            oo0000oOooOOOO2.OooO0Oo();
            oO0000o0.OooOOO((oO0000o0) oo0000oOooOOOO2.f27076OooOo0o, i2);
            oO0000o0 oo0000o02 = (oO0000o0) oo0000oOooOOOO2.OooO0O0();
            o0ooo00OooOOo.OooO0Oo();
            o0OOO0.OooOOOo((o0OOO0) o0ooo00OooOOo.f27076OooOo0o, oo0000o02);
            o0ooo0 = (o0OOO0) o0ooo00OooOOo.OooO0O0();
        } catch (Exception e2) {
            oOO00O.OooO("BillingLogger", "Unable to create logging payload", e2);
        }
        OooO0o(o0ooo0);
    }

    public final void OooOOo(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, int i, Exception exc) {
        OooOooO(i, 14, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final void OooOOo0(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, int i, Exception exc) {
        oOO00O.OooO("BillingClient", "Error in acknowledge purchase!", exc);
        OooOooO(i, 3, billingResult, zzcg.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final void OooOOoo(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, int i, String str2, Exception exc) {
        oOO00O.OooO("BillingClient", str2, exc);
        OooOooO(i, 4, billingResult, zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    public final BillingResult OooOo() {
        oOO00O.OooO0oO("BillingClient", "Service connection is valid. No need to re-initialize.");
        o0OOO0OO o0ooo0ooOooOOo0 = o0OOOO00.OooOOo0();
        o0ooo0ooOooOOo0.OooO0Oo();
        o0OOOO00.OooOOOo((o0OOOO00) o0ooo0ooOooOOo0.f27076OooOo0o, 6);
        ooOOOOoo ooooooooOooOOOO = oO0OOo0o.OooOOOO();
        ooooooooOooOOOO.OooO0Oo();
        oO0OOo0o.OooOOO((oO0OOo0o) ooooooooOooOOOO.f27076OooOo0o);
        o0ooo0ooOooOOo0.OooO0Oo();
        o0OOOO00.OooOOOO((o0OOOO00) o0ooo0ooOooOOo0.f27076OooOo0o, (oO0OOo0o) ooooooooOooOOOO.OooO0O0());
        OooO0oO((o0OOOO00) o0ooo0ooOooOOo0.OooO0O0());
        return OooOo00.OooOO0o;
    }

    public final void OooOo0(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, int i, Exception exc) {
        OooOooO(i, 24, billingResult, zzcg.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    public final void OooOo00(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, int i, Exception exc) {
        OooOooO(i, 15, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final void OooOo0O(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, int i, Exception exc) {
        OooOooO(i, 23, billingResult, zzcg.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final Handler OooOo0o() {
        return Looper.myLooper() == null ? this.f15417OooO0Oo : new Handler(Looper.myLooper());
    }

    public final void OooOoO(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, int i, Exception exc) {
        oOO00O.OooO("BillingClient", "getBillingConfig got an exception.", exc);
        OooOooO(i, 13, billingResult, zzcg.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final void OooOoO0(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, int i, Exception exc) {
        OooOooO(i, 25, billingResult, zzcg.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final void OooOoOO(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, int i, Exception exc) {
        OooOooO(i, 16, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final void OooOoo(int i, int i2, BillingResult billingResult) {
        try {
            OooO0o(zzcg.zzb(i, i2, billingResult));
        } catch (Throwable th) {
            oOO00O.OooO("BillingClient", "Unable to log.", th);
        }
    }

    public final void OooOoo0(int i, int i2, Exception exc) {
        o0OOO0 o0ooo0;
        oOO00O.OooO("BillingClient", "showInAppMessages error.", exc);
        OooO0oO.OooOOO0 oooOOO0 = this.f15420OooO0oO;
        String strZza = zzcg.zza(exc);
        try {
            o0OOOO0o o0oooo0oOooOOo = o0OOo000.OooOOo();
            o0oooo0oOooOOo.OooO0o0(i);
            o0oooo0oOooOOo.OooO0o(i2);
            if (strZza != null) {
                o0oooo0oOooOOo.OooO0Oo();
                o0OOo000.OooOOO((o0OOo000) o0oooo0oOooOOo.f27076OooOo0o, strZza);
            }
            o0OOO00 o0ooo00OooOOo = o0OOO0.OooOOo();
            o0ooo00OooOOo.OooO0o0(o0oooo0oOooOOo);
            o0ooo00OooOOo.OooO0o(30);
            o0ooo0 = (o0OOO0) o0ooo00OooOOo.OooO0O0();
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to create logging payload", th);
            o0ooo0 = null;
        }
        oooOOO0.OooOO0O(o0ooo0);
    }

    public final void OooOooO(int i, int i2, BillingResult billingResult, String str) {
        try {
            OooO0o(zzcg.zzc(i, i2, billingResult, str));
        } catch (Throwable th) {
            oOO00O.OooO("BillingClient", "Unable to log.", th);
        }
    }

    public final void OooOooo(int i) {
        try {
            OooO0oO(zzcg.zzd(i));
        } catch (Throwable th) {
            oOO00O.OooO("BillingClient", "Unable to log.", th);
        }
    }

    public final void Oooo000(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return;
        }
        this.f15417OooO0Oo.post(new Runnable() { // from class: com.android.billingclient.api.zzp
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                BillingResult billingResult2 = billingResult;
                if (((PurchasesUpdatedListener) oooO00o.f15419OooO0o0.f13294OooO0OO) != null) {
                    ((PurchasesUpdatedListener) oooO00o.f15419OooO0o0.f13294OooO0OO).onPurchasesUpdated(billingResult2, null);
                } else {
                    oOO00O.OooO0oo("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 3, billingResult);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            oOO00O.OooO0oo("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = OooOo00.f15471OooOO0;
            OooOoo(26, 3, billingResult2);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.f15426OooOOOO) {
            BillingResult billingResult3 = OooOo00.f15464OooO0O0;
            OooOoo(27, 3, billingResult3);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                AcknowledgePurchaseParams acknowledgePurchaseParams2 = acknowledgePurchaseParams;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOOo0(acknowledgePurchaseResponseListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    String packageName = oooO00o.f15418OooO0o.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams2.getPurchaseToken();
                    String str = oooO00o.f15416OooO0OO;
                    long jLongValue = oooO00o.f15442Oooo000.longValue();
                    Bundle bundle = new Bundle();
                    oOO00O.OooO0O0(str, jLongValue, bundle);
                    Bundle bundleO000OO0o = ((com.google.android.gms.internal.play_billing.OooO0OO) oooO).o000OO0o(packageName, bundle, purchaseToken);
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(OooOo00.OooO00o(oOO00O.OooO00o(bundleO000OO0o, "BillingClient"), oOO00O.OooO0o(bundleO000OO0o, "BillingClient")));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOOo0(acknowledgePurchaseResponseListener2, OooOo00.f15474OooOOO0, 28, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOOo0(acknowledgePurchaseResponseListener2, OooOo00.f15472OooOO0O, 28, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                oooO00o.getClass();
                BillingResult billingResult4 = OooOo00.f15473OooOOO;
                oooO00o.OooOoo(24, 3, billingResult4);
                acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult4);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            BillingResult billingResultOooO0O0 = OooO0O0();
            OooOoo(25, 3, billingResultOooO0O0);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultOooO0O0);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 4, billingResult);
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzag
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                Exception exc;
                DeadObjectException deadObjectException;
                com.google.android.gms.internal.play_billing.OooO oooO;
                String str;
                int i;
                String strOooO0o;
                OooO00o oooO00o = this.zza;
                ConsumeParams consumeParams2 = consumeParams;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                oooO00o.getClass();
                String str2 = "Error consuming purchase with token. Response code: ";
                String purchaseToken = consumeParams2.getPurchaseToken();
                try {
                    oOO00O.OooO0oO("BillingClient", "Consuming purchase with token: " + purchaseToken);
                    synchronized (oooO00o.f15414OooO00o) {
                        try {
                            try {
                                oooO = oooO00o.f15421OooO0oo;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (DeadObjectException e) {
                            e = e;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                    if (oooO == null) {
                        try {
                            str2 = purchaseToken;
                        } catch (DeadObjectException e3) {
                            e = e3;
                            str = purchaseToken;
                            deadObjectException = e;
                            str2 = str;
                            oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15474OooOOO0, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e4) {
                            e = e4;
                            str = purchaseToken;
                            exc = e;
                            str2 = str;
                            oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15472OooOO0O, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                        try {
                            oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15474OooOOO0, 119, "Service has been reset to null.", null);
                            return null;
                        } catch (DeadObjectException e5) {
                            e = e5;
                            deadObjectException = e;
                            oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15474OooOOO0, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e6) {
                            e = e6;
                            exc = e;
                            oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15472OooOO0O, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    }
                    str = purchaseToken;
                    try {
                        if (oooO00o.f15426OooOOOO) {
                            try {
                                String packageName = oooO00o.f15418OooO0o.getPackageName();
                                boolean z = oooO00o.f15426OooOOOO;
                                String str3 = oooO00o.f15416OooO0OO;
                                long jLongValue = oooO00o.f15442Oooo000.longValue();
                                Bundle bundle = new Bundle();
                                if (z) {
                                    oOO00O.OooO0O0(str3, jLongValue, bundle);
                                }
                                Bundle bundleO000OOO = ((com.google.android.gms.internal.play_billing.OooO0OO) oooO).o000OOO(packageName, bundle, str);
                                i = bundleO000OOO.getInt("RESPONSE_CODE");
                                strOooO0o = oOO00O.OooO0o(bundleO000OOO, "BillingClient");
                            } catch (DeadObjectException e7) {
                                e = e7;
                                deadObjectException = e;
                                str2 = str;
                                oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15474OooOOO0, 29, "Error consuming purchase!", deadObjectException);
                                return null;
                            } catch (Exception e8) {
                                e = e8;
                                exc = e;
                                str2 = str;
                                oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15472OooOO0O, 29, "Error consuming purchase!", exc);
                                return null;
                            }
                        } else {
                            String packageName2 = oooO00o.f15418OooO0o.getPackageName();
                            com.google.android.gms.internal.play_billing.OooO0OO oooO0OO = (com.google.android.gms.internal.play_billing.OooO0OO) oooO;
                            Parcel parcelO000O0oO = oooO0OO.o000O0oO();
                            parcelO000O0oO.writeInt(3);
                            parcelO000O0oO.writeString(packageName2);
                            parcelO000O0oO.writeString(str);
                            Parcel parcelO000O0oo = oooO0OO.o000O0oo(parcelO000O0oO, 5);
                            i = parcelO000O0oo.readInt();
                            parcelO000O0oo.recycle();
                            strOooO0o = "";
                        }
                        BillingResult billingResultOooO00o = OooOo00.OooO00o(i, strOooO0o);
                        if (i == 0) {
                            oOO00O.OooO0oO("BillingClient", "Successfully consumed purchase.");
                            consumeResponseListener2.onConsumeResponse(billingResultOooO00o, str);
                            return null;
                        }
                        oooO00o.OooOOoo(consumeResponseListener2, str, billingResultOooO00o, 23, "Error consuming purchase with token. Response code: " + i, null);
                        return null;
                    } catch (DeadObjectException e9) {
                        e = e9;
                        str2 = str;
                        deadObjectException = e;
                        oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15474OooOOO0, 29, "Error consuming purchase!", deadObjectException);
                        return null;
                    } catch (Exception e10) {
                        e = e10;
                        str2 = str;
                        exc = e;
                        oooO00o.OooOOoo(consumeResponseListener2, str2, OooOo00.f15472OooOO0O, 29, "Error consuming purchase!", exc);
                        return null;
                    }
                } catch (DeadObjectException e11) {
                    e = e11;
                    str2 = purchaseToken;
                } catch (Exception e12) {
                    e = e12;
                    str2 = purchaseToken;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzah
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                oooO00o.getClass();
                BillingResult billingResult2 = OooOo00.f15473OooOOO;
                oooO00o.OooOoo(24, 4, billingResult2);
                consumeResponseListener2.onConsumeResponse(billingResult2, consumeParams2.getPurchaseToken());
            }
        }, OooOo0o(), OooO0o0()) == null) {
            BillingResult billingResultOooO0O0 = OooO0O0();
            OooOoo(25, 4, billingResultOooO0O0);
            consumeResponseListener.onConsumeResponse(billingResultOooO0O0, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            OooOo00(alternativeBillingOnlyReportingDetailsListener, OooOo00.f15474OooOOO0, 2, null);
            return;
        }
        if (!this.f15436OooOoO0) {
            oOO00O.OooO0oo("BillingClient", "Current client doesn't support alternative billing only.");
            OooOo00(alternativeBillingOnlyReportingDetailsListener, OooOo00.f15490OooOooo, 66, null);
        } else if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOo00(alternativeBillingOnlyReportingDetailsListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.OooO0OO oooO0OO = (com.google.android.gms.internal.play_billing.OooO0OO) oooO;
                    oooO0OO.o000OoOo(oooO00o.f15418OooO0o.getPackageName(), oOO00O.OooO0Oo(oooO00o.f15442Oooo000.longValue(), oooO00o.f15416OooO0OO), new OooO0oO.OooOO0(alternativeBillingOnlyReportingDetailsListener2, oooO00o.f15420OooO0oO, oooO00o.OooOO0o));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOo00(alternativeBillingOnlyReportingDetailsListener2, OooOo00.f15474OooOOO0, 70, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOo00(alternativeBillingOnlyReportingDetailsListener2, OooOo00.f15472OooOO0O, 70, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzy
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                oooO00o.getClass();
                oooO00o.OooOo00(alternativeBillingOnlyReportingDetailsListener2, OooOo00.f15473OooOOO, 24, null);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            OooOo00(alternativeBillingOnlyReportingDetailsListener, OooO0O0(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            OooOo0(externalOfferReportingDetailsListener, OooOo00.f15474OooOOO0, 2, null);
            return;
        }
        if (!this.f15435OooOoO) {
            oOO00O.OooO0oo("BillingClient", "Current client doesn't support external offer.");
            OooOo0(externalOfferReportingDetailsListener, OooOo00.f15480OooOo, InterfaceC3173h3.d.b.f8821d, null);
        } else if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOo0(externalOfferReportingDetailsListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.OooO0OO oooO0OO = (com.google.android.gms.internal.play_billing.OooO0OO) oooO;
                    oooO0OO.o000Ooo0(oooO00o.f15418OooO0o.getPackageName(), oOO00O.OooO0Oo(oooO00o.f15442Oooo000.longValue(), oooO00o.f15416OooO0OO), new OooO0oO.OooOO0(externalOfferReportingDetailsListener2, oooO00o.f15420OooO0oO, oooO00o.OooOO0o));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOo0(externalOfferReportingDetailsListener2, OooOo00.f15474OooOOO0, 94, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOo0(externalOfferReportingDetailsListener2, OooOo00.f15472OooOO0O, 94, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                oooO00o.getClass();
                oooO00o.OooOo0(externalOfferReportingDetailsListener2, OooOo00.f15473OooOOO, 24, null);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            OooOo0(externalOfferReportingDetailsListener, OooO0O0(), 25, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void endConnection() {
        /*
            r5 = this;
            r0 = 12
            r5.OooOooo(r0)
            java.lang.Object r0 = r5.f15414OooO00o
            monitor-enter(r0)
            OooO0oO.o0OoOo0 r1 = r5.f15419OooO0o0     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L27
            OooO0oO.o0OoOo0 r1 = r5.f15419OooO0o0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.f13296OooO0o     // Catch: java.lang.Throwable -> L1f
            OooO0oO.o000oOoO r2 = (OooO0oO.o000oOoO) r2     // Catch: java.lang.Throwable -> L1f
            android.content.Context r3 = r1.f13292OooO00o     // Catch: java.lang.Throwable -> L1f
            r2.OooO0Oo(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.f13298OooO0oO     // Catch: java.lang.Throwable -> L1f
            OooO0oO.o000oOoO r1 = (OooO0oO.o000oOoO) r1     // Catch: java.lang.Throwable -> L1f
            r1.OooO0Oo(r3)     // Catch: java.lang.Throwable -> L1f
            goto L27
        L1f:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while shutting down broadcast manager while ending connection!"
            com.google.android.gms.internal.play_billing.oOO00O.OooO(r2, r3, r1)     // Catch: java.lang.Throwable -> L50
        L27:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unbinding from service."
            com.google.android.gms.internal.play_billing.oOO00O.OooO0oO(r1, r2)     // Catch: java.lang.Throwable -> L32
            r5.OooOO0O()     // Catch: java.lang.Throwable -> L32
            goto L3a
        L32:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while unbinding from the service while ending connection!"
            com.google.android.gms.internal.play_billing.oOO00O.OooO(r2, r3, r1)     // Catch: java.lang.Throwable -> L50
        L3a:
            r1 = 3
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ExecutorService r2 = r5.f15440OooOooO     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L48
            r2.shutdownNow()     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            r5.f15440OooOooO = r2     // Catch: java.lang.Throwable -> L4a
            r5.f15441OooOooo = r2     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            goto L4c
        L4a:
            r2 = move-exception
            goto L52
        L4c:
            r5.OooOO0(r1)     // Catch: java.lang.Throwable -> L50
            goto L5d
        L50:
            r1 = move-exception
            goto L64
        L52:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r2     // Catch: java.lang.Throwable -> L54
        L54:
            r2 = move-exception
            java.lang.String r3 = "BillingClient"
            java.lang.String r4 = "There was an exception while shutting down the executor service while ending connection!"
            com.google.android.gms.internal.play_billing.oOO00O.OooO(r3, r4, r2)     // Catch: java.lang.Throwable -> L5f
            goto L4c
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return
        L5f:
            r2 = move-exception
            r5.OooOO0(r1)     // Catch: java.lang.Throwable -> L50
            throw r2     // Catch: java.lang.Throwable -> L50
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.OooO00o.endConnection():void");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            oOO00O.OooO0oo("BillingClient", "Service disconnected.");
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 13, billingResult);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.f15433OooOo0O) {
            oOO00O.OooO0oo("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = OooOo00.f15486OooOoOO;
            OooOoo(32, 13, billingResult2);
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOoO(billingConfigResponseListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    String packageName = oooO00o.f15418OooO0o.getPackageName();
                    String str = oooO00o.f15416OooO0OO;
                    long jLongValue = oooO00o.f15442Oooo000.longValue();
                    Bundle bundle = new Bundle();
                    oOO00O.OooO0O0(str, jLongValue, bundle);
                    ((com.google.android.gms.internal.play_billing.OooO0OO) oooO).o000Oooo(packageName, bundle, new OooOO0(billingConfigResponseListener2, oooO00o.f15420OooO0oO, oooO00o.OooOO0o));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOoO(billingConfigResponseListener2, OooOo00.f15474OooOOO0, 62, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOoO(billingConfigResponseListener2, OooOo00.f15472OooOO0O, 62, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzw
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                oooO00o.getClass();
                BillingResult billingResult3 = OooOo00.f15473OooOOO;
                oooO00o.OooOoo(24, 13, billingResult3);
                billingConfigResponseListener2.onBillingConfigResponse(billingResult3, null);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            BillingResult billingResultOooO0O0 = OooO0O0();
            OooOoo(25, 13, billingResultOooO0O0);
            billingConfigResponseListener.onBillingConfigResponse(billingResultOooO0O0, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i;
        synchronized (this.f15414OooO00o) {
            i = this.f15415OooO0O0;
        }
        return i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            OooOOo(alternativeBillingOnlyAvailabilityListener, OooOo00.f15474OooOOO0, 2, null);
            return;
        }
        if (!this.f15436OooOoO0) {
            oOO00O.OooO0oo("BillingClient", "Current client doesn't support alternative billing only.");
            OooOOo(alternativeBillingOnlyAvailabilityListener, OooOo00.f15490OooOooo, 66, null);
        } else if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOOo(alternativeBillingOnlyAvailabilityListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.OooO0OO oooO0OO = (com.google.android.gms.internal.play_billing.OooO0OO) oooO;
                    oooO0OO.o000o00(oooO00o.f15418OooO0o.getPackageName(), oOO00O.OooO0Oo(oooO00o.f15442Oooo000.longValue(), oooO00o.f15416OooO0OO), new OooO0oO.OooOO0(alternativeBillingOnlyAvailabilityListener2, oooO00o.f15420OooO0oO, oooO00o.OooOO0o));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOOo(alternativeBillingOnlyAvailabilityListener2, OooOo00.f15474OooOOO0, 69, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOOo(alternativeBillingOnlyAvailabilityListener2, OooOo00.f15472OooOO0O, 69, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                oooO00o.getClass();
                oooO00o.OooOOo(alternativeBillingOnlyAvailabilityListener2, OooOo00.f15473OooOOO, 24, null);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            OooOOo(alternativeBillingOnlyAvailabilityListener, OooO0O0(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            OooOo0O(externalOfferAvailabilityListener, OooOo00.f15474OooOOO0, 2, null);
            return;
        }
        if (!this.f15435OooOoO) {
            oOO00O.OooO0oo("BillingClient", "Current client doesn't support external offer.");
            OooOo0O(externalOfferAvailabilityListener, OooOo00.f15480OooOo, InterfaceC3173h3.d.b.f8821d, null);
        } else if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOo0O(externalOfferAvailabilityListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.OooO0OO oooO0OO = (com.google.android.gms.internal.play_billing.OooO0OO) oooO;
                    oooO0OO.o000o00O(oooO00o.f15418OooO0o.getPackageName(), oOO00O.OooO0Oo(oooO00o.f15442Oooo000.longValue(), oooO00o.f15416OooO0OO), new OooO0oO.OooOO0(externalOfferAvailabilityListener2, oooO00o.f15420OooO0oO, oooO00o.OooOO0o));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOo0O(externalOfferAvailabilityListener2, OooOo00.f15474OooOOO0, 91, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOo0O(externalOfferAvailabilityListener2, OooOo00.f15472OooOO0O, 91, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                oooO00o.getClass();
                oooO00o.OooOo0O(externalOfferAvailabilityListener2, OooOo00.f15473OooOOO, 24, null);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            OooOo0O(externalOfferAvailabilityListener, OooO0O0(), 25, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00d5  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.OooO00o.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        boolean z;
        synchronized (this.f15414OooO00o) {
            try {
                z = false;
                if (this.f15415OooO0O0 == 2 && this.f15421OooO0oo != null && this.f15413OooO != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:380:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x069c A[Catch: Exception -> 0x06a8, CancellationException -> 0x06ab, TimeoutException -> 0x06ae, TRY_ENTER, TryCatch #6 {CancellationException -> 0x06ab, TimeoutException -> 0x06ae, Exception -> 0x06a8, blocks: (B:597:0x069c, B:605:0x06b1, B:607:0x06c6, B:631:0x0750, B:630:0x073e, B:620:0x071b, B:633:0x0757), top: B:652:0x069a }] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x06b1 A[Catch: Exception -> 0x06a8, CancellationException -> 0x06ab, TimeoutException -> 0x06ae, TryCatch #6 {CancellationException -> 0x06ab, TimeoutException -> 0x06ae, Exception -> 0x06a8, blocks: (B:597:0x069c, B:605:0x06b1, B:607:0x06c6, B:631:0x0750, B:630:0x073e, B:620:0x071b, B:633:0x0757), top: B:652:0x069a }] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r33, final com.android.billingclient.api.BillingFlowParams r34) {
        /*
            Method dump skipped, instructions count: 1972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.OooO00o.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.OooOo0) {
                oOO00O.OooO0oo("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = OooOo00.f15482OooOo0O;
                OooOoo(20, 7, billingResult2);
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    OooO0oO.OooOO0O oooOO0O;
                    com.google.android.gms.internal.play_billing.OooO oooO;
                    OooO00o oooO00o = this.zza;
                    QueryProductDetailsParams queryProductDetailsParams2 = queryProductDetailsParams;
                    oooO00o.getClass();
                    ArrayList arrayList = new ArrayList();
                    String strZzb = queryProductDetailsParams2.zzb();
                    o000000 o000000VarZza = queryProductDetailsParams2.zza();
                    int size = o000000VarZza.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            oooOO0O = new OooO0oO.OooOO0O(0, "", arrayList);
                            break;
                        }
                        int i2 = i + 20;
                        ArrayList arrayList2 = new ArrayList(o000000VarZza.subList(i, i2 > size ? size : i2));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i3)).zza());
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", oooO00o.f15416OooO0OO);
                        try {
                            synchronized (oooO00o.f15414OooO00o) {
                                oooO = oooO00o.f15421OooO0oo;
                            }
                            if (oooO == null) {
                                oooOO0O = oooO00o.OooOO0o(OooOo00.f15474OooOOO0, 119, "Service has been reset to null.", null);
                                break;
                            }
                            int i4 = true != oooO00o.f15431OooOo ? 17 : 20;
                            String packageName = oooO00o.f15418OooO0o.getPackageName();
                            boolean z = oooO00o.f15434OooOo0o && oooO00o.f15439OooOoo0.f15493OooO00o;
                            String str = oooO00o.f15416OooO0OO;
                            oooO00o.OooO0OO();
                            oooO00o.OooO0OO();
                            oooO00o.OooO0OO();
                            oooO00o.OooO0OO();
                            int i5 = size;
                            long jLongValue = oooO00o.f15442Oooo000.longValue();
                            Bundle bundle2 = new Bundle();
                            oOO00O.OooO0O0(str, jLongValue, bundle2);
                            bundle2.putBoolean("enablePendingPurchases", true);
                            bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                            if (z) {
                                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                            }
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size3 = arrayList2.size();
                            int i6 = 0;
                            boolean z2 = false;
                            while (i6 < size3) {
                                QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i6);
                                int i7 = i4;
                                arrayList4.add(null);
                                z2 |= !TextUtils.isEmpty(null);
                                String strZzb2 = product.zzb();
                                o000000 o000000Var = o000000VarZza;
                                if (strZzb2.equals("first_party")) {
                                    throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                }
                                i6++;
                                o000000VarZza = o000000Var;
                                i4 = i7;
                            }
                            o000000 o000000Var2 = o000000VarZza;
                            int i8 = i4;
                            if (z2) {
                                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                            }
                            Bundle bundleO000OoOO = ((com.google.android.gms.internal.play_billing.OooO0OO) oooO).o000OoOO(i8, packageName, strZzb, bundle, bundle2);
                            if (bundleO000OoOO == null) {
                                oooOO0O = oooO00o.OooOO0o(OooOo00.f15487OooOoo, 44, "queryProductDetailsAsync got empty product details response.", null);
                                break;
                            }
                            if (bundleO000OoOO.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundleO000OoOO.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    oooOO0O = oooO00o.OooOO0o(OooOo00.f15487OooOoo, 46, "queryProductDetailsAsync got null response list", null);
                                    break;
                                }
                                for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                                    try {
                                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i9));
                                        oOO00O.OooO0oO("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                        arrayList.add(productDetails);
                                    } catch (JSONException e) {
                                        oooOO0O = oooO00o.OooOO0o(OooOo00.OooO00o(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                    }
                                }
                                i = i2;
                                size = i5;
                                o000000VarZza = o000000Var2;
                            } else {
                                int iOooO00o = oOO00O.OooO00o(bundleO000OoOO, "BillingClient");
                                String strOooO0o = oOO00O.OooO0o(bundleO000OoOO, "BillingClient");
                                oooOO0O = iOooO00o != 0 ? oooO00o.OooOO0o(OooOo00.OooO00o(iOooO00o, strOooO0o), 23, OooO0oO.OooOo.OooO0o(iOooO00o, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : oooO00o.OooOO0o(OooOo00.OooO00o(6, strOooO0o), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                            }
                        } catch (DeadObjectException e2) {
                            oooOO0O = oooO00o.OooOO0o(OooOo00.f15474OooOOO0, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                        } catch (Exception e3) {
                            oooOO0O = oooO00o.OooOO0o(OooOo00.f15472OooOO0O, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
                        }
                    }
                    productDetailsResponseListener.onProductDetailsResponse(OooOo00.OooO00o(oooOO0O.f13272OooO0O0, oooOO0O.f13273OooO0OO), oooOO0O.f13271OooO00o);
                    return null;
                }
            }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    OooO00o oooO00o = this.zza;
                    ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                    oooO00o.getClass();
                    BillingResult billingResult3 = OooOo00.f15473OooOOO;
                    oooO00o.OooOoo(24, 7, billingResult3);
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult3, new ArrayList());
                }
            }, OooOo0o(), OooO0o0()) == null) {
                BillingResult billingResultOooO0O0 = OooO0O0();
                OooOoo(25, 7, billingResultOooO0O0);
                productDetailsResponseListener.onProductDetailsResponse(billingResultOooO0O0, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        OooO0oo(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        OooO(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 8, billingResult);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            oOO00O.OooO0oo("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = OooOo00.f15469OooO0oO;
            OooOoo(49, 8, billingResult2);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            oOO00O.OooO0oo("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = OooOo00.f15467OooO0o;
            OooOoo(48, 8, billingResult3);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (OooO00o(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzz
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                OooO0oO.OooOO0O oooOO0O;
                com.google.android.gms.internal.play_billing.OooO oooO;
                int i;
                Bundle bundleO000Oo;
                OooO00o oooO00o = this.zza;
                String str2 = this.zzb;
                List list = this.zzc;
                oooO00o.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        oooOO0O = new OooO0oO.OooOO0O(0, "", arrayList);
                        break;
                    }
                    int i3 = i2 + 20;
                    ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
                    bundle.putString("playBillingLibraryVersion", oooO00o.f15416OooO0OO);
                    try {
                        synchronized (oooO00o.f15414OooO00o) {
                            oooO = oooO00o.f15421OooO0oo;
                        }
                        if (oooO == null) {
                            oooOO0O = oooO00o.OooOOOO(OooOo00.f15474OooOOO0, 119, "Service has been reset to null.", null);
                            break;
                        }
                        if (oooO00o.f15427OooOOOo) {
                            String packageName = oooO00o.f15418OooO0o.getPackageName();
                            int i4 = oooO00o.OooOO0o;
                            oooO00o.f15439OooOoo0.getClass();
                            boolean z = oooO00o.f15434OooOo0o && oooO00o.f15439OooOoo0.f15493OooO00o;
                            String str3 = oooO00o.f15416OooO0OO;
                            i = i3;
                            long jLongValue = oooO00o.f15442Oooo000.longValue();
                            boolean z2 = z;
                            Bundle bundle2 = new Bundle();
                            if (i4 >= 9) {
                                oOO00O.OooO0O0(str3, jLongValue, bundle2);
                            }
                            if (i4 >= 9) {
                                bundle2.putBoolean("enablePendingPurchases", true);
                            }
                            if (z2) {
                                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                            }
                            bundleO000Oo = ((com.google.android.gms.internal.play_billing.OooO0OO) oooO).o000OoOO(10, packageName, str2, bundle, bundle2);
                        } else {
                            i = i3;
                            bundleO000Oo = ((com.google.android.gms.internal.play_billing.OooO0OO) oooO).o000Oo(oooO00o.f15418OooO0o.getPackageName(), bundle, str2);
                        }
                        if (bundleO000Oo == null) {
                            oooOO0O = oooO00o.OooOOOO(OooOo00.f15487OooOoo, 44, "querySkuDetailsAsync got null sku details list", null);
                            break;
                        }
                        if (bundleO000Oo.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleO000Oo.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                oooOO0O = oooO00o.OooOOOO(OooOo00.f15487OooOoo, 46, "querySkuDetailsAsync got null response list", null);
                                break;
                            }
                            for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                                    oOO00O.OooO0oO("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                    arrayList.add(skuDetails);
                                } catch (JSONException e) {
                                    oooOO0O = oooO00o.OooOOOO(OooOo00.OooO00o(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e);
                                }
                            }
                            i2 = i;
                        } else {
                            int iOooO00o = oOO00O.OooO00o(bundleO000Oo, "BillingClient");
                            String strOooO0o = oOO00O.OooO0o(bundleO000Oo, "BillingClient");
                            oooOO0O = iOooO00o != 0 ? oooO00o.OooOOOO(OooOo00.OooO00o(iOooO00o, strOooO0o), 23, OooO0oO.OooOo.OooO0o(iOooO00o, "getSkuDetails() failed. Response code: "), null) : oooO00o.OooOOOO(OooOo00.OooO00o(6, strOooO0o), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                        }
                    } catch (DeadObjectException e2) {
                        oooOO0O = oooO00o.OooOOOO(OooOo00.f15474OooOOO0, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                    } catch (Exception e3) {
                        oooOO0O = oooO00o.OooOOOO(OooOo00.f15472OooOO0O, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e3);
                    }
                }
                this.zzd.onSkuDetailsResponse(OooOo00.OooO00o(oooOO0O.f13272OooO0O0, oooOO0O.f13273OooO0OO), oooOO0O.f13271OooO00o);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzab
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                SkuDetailsResponseListener skuDetailsResponseListener2 = skuDetailsResponseListener;
                oooO00o.getClass();
                BillingResult billingResult4 = OooOo00.f15473OooOOO;
                oooO00o.OooOoo(24, 8, billingResult4);
                skuDetailsResponseListener2.onSkuDetailsResponse(billingResult4, null);
            }
        }, OooOo0o(), OooO0o0()) == null) {
            BillingResult billingResultOooO0O0 = OooO0O0();
            OooOoo(25, 8, billingResultOooO0O0);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultOooO0O0, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 16, billingResult);
            return billingResult;
        }
        if (!this.f15436OooOoO0) {
            oOO00O.OooO0oo("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = OooOo00.f15490OooOooo;
            OooOoo(66, 16, billingResult2);
            return billingResult2;
        }
        Handler handler = this.f15417OooO0Oo;
        final OooO0O0 oooO0O0 = new OooO0O0(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = oooO0O0;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOoOO(alternativeBillingOnlyInformationDialogListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.OooO0OO oooO0OO = (com.google.android.gms.internal.play_billing.OooO0OO) oooO;
                    oooO0OO.o000OooO(oooO00o.f15418OooO0o.getPackageName(), oOO00O.OooO0Oo(oooO00o.f15442Oooo000.longValue(), oooO00o.f15416OooO0OO), new OooO(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOoOO(alternativeBillingOnlyInformationDialogListener2, OooOo00.f15474OooOOO0, 74, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOoOO(alternativeBillingOnlyInformationDialogListener2, OooOo00.f15472OooOO0O, 74, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzs
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                oooO00o.getClass();
                oooO00o.OooOoOO(alternativeBillingOnlyInformationDialogListener2, OooOo00.f15473OooOOO, 24, null);
            }
        }, handler, OooO0o0()) != null) {
            return OooOo00.OooOO0o;
        }
        BillingResult billingResultOooO0O0 = OooO0O0();
        OooOoo(25, 16, billingResultOooO0O0);
        return billingResultOooO0O0;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = OooOo00.f15474OooOOO0;
            OooOoo(2, 25, billingResult);
            return billingResult;
        }
        if (!this.f15435OooOoO) {
            oOO00O.OooO0oo("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = OooOo00.f15480OooOo;
            OooOoo(InterfaceC3173h3.d.b.f8821d, 25, billingResult2);
            return billingResult2;
        }
        Handler handler = this.f15417OooO0Oo;
        final OooO0OO oooO0OO = new OooO0OO(this, handler, externalOfferInformationDialogListener);
        if (OooO00o(new Callable() { // from class: com.android.billingclient.api.zzai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO;
                OooO00o oooO00o = this.zza;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = oooO0OO;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO = oooO00o.f15421OooO0oo;
                    }
                    if (oooO == null) {
                        oooO00o.OooOoO0(externalOfferInformationDialogListener2, OooOo00.f15474OooOOO0, 119, null);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.OooO0OO oooO0OO2 = (com.google.android.gms.internal.play_billing.OooO0OO) oooO;
                    oooO0OO2.o000o000(oooO00o.f15418OooO0o.getPackageName(), oOO00O.OooO0Oo(oooO00o.f15442Oooo000.longValue(), oooO00o.f15416OooO0OO), new OooOO0O(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOoO0(externalOfferInformationDialogListener2, OooOo00.f15474OooOOO0, 98, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOoO0(externalOfferInformationDialogListener2, OooOo00.f15472OooOO0O, 98, e2);
                    return null;
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = this.zza;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                oooO00o.getClass();
                oooO00o.OooOoO0(externalOfferInformationDialogListener2, OooOo00.f15473OooOOO, 24, null);
            }
        }, handler, OooO0o0()) != null) {
            return OooOo00.OooOO0o;
        }
        BillingResult billingResultOooO0O0 = OooO0O0();
        OooOoo(25, 25, billingResultOooO0O0);
        return billingResultOooO0O0;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            oOO00O.OooO0oo("BillingClient", "Service disconnected.");
            return OooOo00.f15474OooOOO0;
        }
        if (!this.f15429OooOOo0) {
            oOO00O.OooO0oo("BillingClient", "Current client doesn't support showing in-app messages.");
            return OooOo00.f15483OooOo0o;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f15416OooO0OO);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.f15407OooO00o);
        Handler handler = this.f15417OooO0Oo;
        final OooO0oO.OooO oooO = new OooO0oO.OooO(handler, inAppMessageResponseListener);
        OooO00o(new Callable() { // from class: com.android.billingclient.api.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.OooO oooO2;
                OooO00o oooO00o = this.zza;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = oooO;
                oooO00o.getClass();
                try {
                    synchronized (oooO00o.f15414OooO00o) {
                        oooO2 = oooO00o.f15421OooO0oo;
                    }
                    if (oooO2 == null) {
                        oooO00o.OooOoo0(-1, 119, null);
                        return null;
                    }
                    ((com.google.android.gms.internal.play_billing.OooO0OO) oooO2).o000o00o(oooO00o.f15418OooO0o.getPackageName(), bundle2, new OooOOO0(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e) {
                    oooO00o.OooOoo0(-1, 118, e);
                    return null;
                } catch (Exception e2) {
                    oooO00o.OooOoo0(6, 118, e2);
                    return null;
                }
            }
        }, 5000L, null, handler, OooO0o0());
        return OooOo00.OooOO0o;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingResult billingResultOooOo;
        synchronized (this.f15414OooO00o) {
            try {
                if (isReady()) {
                    billingResultOooOo = OooOo();
                } else if (this.f15415OooO0O0 == 1) {
                    oOO00O.OooO0oo("BillingClient", "Client is already in the process of connecting to billing service.");
                    billingResultOooOo = OooOo00.f15468OooO0o0;
                    OooOoo(37, 6, billingResultOooOo);
                } else if (this.f15415OooO0O0 == 3) {
                    oOO00O.OooO0oo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    billingResultOooOo = OooOo00.f15474OooOOO0;
                    OooOoo(38, 6, billingResultOooOo);
                } else {
                    OooOO0(1);
                    OooOO0O();
                    oOO00O.OooO0oO("BillingClient", "Starting in-app billing setup.");
                    this.f15413OooO = new OooO0o(this, billingClientStateListener);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage(C3126fq.f8595b);
                    List<ResolveInfo> listQueryIntentServices = this.f15418OooO0o.getPackageManager().queryIntentServices(intent, 0);
                    int i = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        OooOO0(0);
                        oOO00O.OooO0oO("BillingClient", "Billing service unavailable on device.");
                        billingResultOooOo = OooOo00.f15465OooO0OO;
                        OooOoo(i, 6, billingResultOooOo);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, C3126fq.f8595b) || str2 == null) {
                                oOO00O.OooO0oo("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f15416OooO0OO);
                                synchronized (this.f15414OooO00o) {
                                    try {
                                        if (this.f15415OooO0O0 == 2) {
                                            billingResultOooOo = OooOo();
                                        } else if (this.f15415OooO0O0 != 1) {
                                            oOO00O.OooO0oo("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            billingResultOooOo = OooOo00.f15474OooOOO0;
                                            OooOoo(117, 6, billingResultOooOo);
                                        } else {
                                            OooO0o oooO0o = this.f15413OooO;
                                            if (this.f15418OooO0o.bindService(intent2, oooO0o, 1)) {
                                                oOO00O.OooO0oO("BillingClient", "Service was bonded successfully.");
                                                billingResultOooOo = null;
                                            } else {
                                                oOO00O.OooO0oo("BillingClient", "Connection to Billing service is blocked.");
                                                i = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            oOO00O.OooO0oo("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        OooOO0(0);
                        oOO00O.OooO0oO("BillingClient", "Billing service unavailable on device.");
                        billingResultOooOo = OooOo00.f15465OooO0OO;
                        OooOoo(i, 6, billingResultOooOo);
                    }
                }
            } finally {
            }
        }
        if (billingResultOooOo != null) {
            billingClientStateListener.onBillingSetupFinished(billingResultOooOo);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        OooO0oo(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        OooO(str, purchasesResponseListener);
    }

    public OooO00o(PendingPurchasesParams pendingPurchasesParams, Context context) {
        this.f15414OooO00o = new Object();
        this.f15415OooO0O0 = 0;
        this.f15417OooO0Oo = new Handler(Looper.getMainLooper());
        this.OooOO0o = 0;
        long jNextLong = new Random().nextLong();
        this.f15442Oooo000 = Long.valueOf(jNextLong);
        this.f15416OooO0OO = OooO0Oo();
        this.f15418OooO0o = context.getApplicationContext();
        C2360o c2360oOooOOo = oO00000.OooOOo();
        String strOooO0Oo = OooO0Oo();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOo0((oO00000) c2360oOooOOo.f27076OooOo0o, strOooO0Oo);
        String packageName = this.f15418OooO0o.getPackageName();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOo((oO00000) c2360oOooOOo.f27076OooOo0o, packageName);
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOO((oO00000) c2360oOooOOo.f27076OooOo0o, jNextLong);
        this.f15420OooO0oO = new OooO0oO.OooOOO0(this.f15418OooO0o, (oO00000) c2360oOooOOo.OooO0O0());
        oOO00O.OooO0oo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f15419OooO0o0 = new o0OoOo0(this.f15418OooO0o, null, null, this.f15420OooO0oO);
        this.f15439OooOoo0 = pendingPurchasesParams;
        this.f15418OooO0o.getPackageName();
    }

    public OooO00o(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        String strOooO0Oo = OooO0Oo();
        this.f15414OooO00o = new Object();
        this.f15415OooO0O0 = 0;
        this.f15417OooO0Oo = new Handler(Looper.getMainLooper());
        this.OooOO0o = 0;
        long jNextLong = new Random().nextLong();
        this.f15442Oooo000 = Long.valueOf(jNextLong);
        this.f15416OooO0OO = strOooO0Oo;
        this.f15418OooO0o = context.getApplicationContext();
        C2360o c2360oOooOOo = oO00000.OooOOo();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOo0((oO00000) c2360oOooOOo.f27076OooOo0o, strOooO0Oo);
        String packageName = this.f15418OooO0o.getPackageName();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOo((oO00000) c2360oOooOOo.f27076OooOo0o, packageName);
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOO((oO00000) c2360oOooOOo.f27076OooOo0o, jNextLong);
        this.f15420OooO0oO = new OooO0oO.OooOOO0(this.f15418OooO0o, (oO00000) c2360oOooOOo.OooO0O0());
        if (purchasesUpdatedListener == null) {
            oOO00O.OooO0oo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f15419OooO0o0 = new o0OoOo0(this.f15418OooO0o, purchasesUpdatedListener, null, this.f15420OooO0oO);
        this.f15439OooOoo0 = pendingPurchasesParams;
        this.f15438OooOoo = false;
        this.f15418OooO0o.getPackageName();
    }

    public OooO00o(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener) {
        String strOooO0Oo = OooO0Oo();
        this.f15414OooO00o = new Object();
        this.f15415OooO0O0 = 0;
        this.f15417OooO0Oo = new Handler(Looper.getMainLooper());
        this.OooOO0o = 0;
        long jNextLong = new Random().nextLong();
        this.f15442Oooo000 = Long.valueOf(jNextLong);
        this.f15416OooO0OO = strOooO0Oo;
        this.f15418OooO0o = context.getApplicationContext();
        C2360o c2360oOooOOo = oO00000.OooOOo();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOo0((oO00000) c2360oOooOOo.f27076OooOo0o, strOooO0Oo);
        String packageName = this.f15418OooO0o.getPackageName();
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOo((oO00000) c2360oOooOOo.f27076OooOo0o, packageName);
        c2360oOooOOo.OooO0Oo();
        oO00000.OooOOOO((oO00000) c2360oOooOOo.f27076OooOo0o, jNextLong);
        this.f15420OooO0oO = new OooO0oO.OooOOO0(this.f15418OooO0o, (oO00000) c2360oOooOOo.OooO0O0());
        if (purchasesUpdatedListener == null) {
            oOO00O.OooO0oo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f15419OooO0o0 = new o0OoOo0(this.f15418OooO0o, purchasesUpdatedListener, userChoiceBillingListener, this.f15420OooO0oO);
        this.f15439OooOoo0 = pendingPurchasesParams;
        this.f15438OooOoo = userChoiceBillingListener != null;
    }
}

package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.play_billing.o0OOO0;
import com.google.android.gms.internal.play_billing.o0OOO00;
import com.google.android.gms.internal.play_billing.o0OOOO0o;
import com.google.android.gms.internal.play_billing.o0OOo000;
import com.google.android.gms.internal.play_billing.oO000OOo;
import com.google.android.gms.internal.play_billing.oOO00O;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class OooO0o implements ServiceConnection {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final BillingClientStateListener f15447OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f15448OooOo0o;

    public /* synthetic */ OooO0o(OooO00o oooO00o, BillingClientStateListener billingClientStateListener) {
        this.f15448OooOo0o = oooO00o;
        this.f15447OooOo0O = billingClientStateListener;
    }

    public final void OooO00o(BillingResult billingResult) {
        synchronized (this.f15448OooOo0o.f15414OooO00o) {
            try {
                if (this.f15448OooOo0o.f15415OooO0O0 == 3) {
                    return;
                }
                this.f15447OooOo0O.onBillingSetupFinished(billingResult);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.OooO oooO0OO;
        oOO00O.OooO0oO("BillingClient", "Billing service connected.");
        synchronized (this.f15448OooOo0o.f15414OooO00o) {
            try {
                if (this.f15448OooOo0o.f15415OooO0O0 == 3) {
                    return;
                }
                OooO00o oooO00o = this.f15448OooOo0o;
                int i = com.google.android.gms.internal.play_billing.OooO0o.f26954OooOo0o;
                if (iBinder == null) {
                    oooO0OO = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    oooO0OO = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.OooO ? (com.google.android.gms.internal.play_billing.OooO) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.OooO0OO(iBinder, "com.android.vending.billing.IInAppBillingService", 3);
                }
                oooO00o.f15421OooO0oo = oooO0OO;
                OooO00o oooO00o2 = this.f15448OooOo0o;
                if (OooO00o.OooO00o(new Callable() { // from class: com.android.billingclient.api.zzay
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:170:0x022d  */
                    /* JADX WARN: Removed duplicated region for block: B:171:0x0232  */
                    /* JADX WARN: Removed duplicated region for block: B:182:0x0281  */
                    /* JADX WARN: Removed duplicated region for block: B:202:0x0240 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object call() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 742
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzay.call():java.lang.Object");
                    }
                }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO0o oooO0o = this.zza;
                        OooO00o oooO00o3 = oooO0o.f15448OooOo0o;
                        oooO00o3.OooOO0(0);
                        BillingResult billingResult = OooOo00.f15473OooOOO;
                        oooO00o3.OooOoo(24, 6, billingResult);
                        oooO0o.OooO00o(billingResult);
                    }
                }, oooO00o2.OooOo0o(), oooO00o2.OooO0o0()) == null) {
                    OooO00o oooO00o3 = this.f15448OooOo0o;
                    BillingResult billingResultOooO0O0 = oooO00o3.OooO0O0();
                    oooO00o3.OooOoo(25, 6, billingResultOooO0O0);
                    OooO00o(billingResultOooO0O0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        oOO00O.OooO0oo("BillingClient", "Billing service disconnected.");
        try {
            OooO00o oooO00o = this.f15448OooOo0o;
            synchronized (oooO00o.f15414OooO00o) {
                z = true;
                if (oooO00o.f15415OooO0O0 != 1) {
                    z = false;
                }
            }
            if (z) {
                OooO0oO.OooOOO0 oooOOO0 = this.f15448OooOo0o.f15420OooO0oO;
                o0OOO00 o0ooo00OooOOo = o0OOO0.OooOOo();
                o0ooo00OooOOo.OooO0o(6);
                o0OOOO0o o0oooo0oOooOOo = o0OOo000.OooOOo();
                o0oooo0oOooOOo.OooO0o(121);
                o0ooo00OooOOo.OooO0o0(o0oooo0oOooOOo);
                oooOOO0.OooOO0O((o0OOO0) o0ooo00OooOOo.OooO0O0());
            } else {
                this.f15448OooOo0o.f15420OooO0oO.OooOOOo(oO000OOo.OooOOO());
            }
        } catch (Throwable th) {
            oOO00O.OooO("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f15448OooOo0o.f15414OooO00o) {
            try {
                if (this.f15448OooOo0o.f15415OooO0O0 == 3) {
                    return;
                }
                this.f15448OooOo0o.OooOO0(0);
                this.f15447OooOo0O.onBillingServiceDisconnected();
            } finally {
            }
        }
    }
}

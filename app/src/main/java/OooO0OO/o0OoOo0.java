package OooO0oO;

import android.content.Context;
import android.content.IntentFilter;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.google.android.gms.internal.ads.gn0;
import com.google.android.gms.internal.ads.k50;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.rm0;

/* loaded from: classes.dex */
public final class o0OoOo0 {

    /* renamed from: OooO00o */
    public final Context f13292OooO00o;

    /* renamed from: OooO0O0 */
    public boolean f13293OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f13294OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f13295OooO0Oo;

    /* renamed from: OooO0o */
    public final Object f13296OooO0o;

    /* renamed from: OooO0o0 */
    public Object f13297OooO0o0;

    /* renamed from: OooO0oO */
    public Object f13298OooO0oO;

    public o0OoOo0(Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, OooOOO0 oooOOO0) {
        this.f13292OooO00o = context;
        this.f13294OooO0OO = purchasesUpdatedListener;
        this.f13295OooO0Oo = userChoiceBillingListener;
        this.f13297OooO0o0 = oooOOO0;
        this.f13296OooO0o = new o000oOoO(this, true);
        this.f13298OooO0oO = new o000oOoO(this, false);
    }

    public void OooO00o(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f13293OooO0O0 = z;
        o000oOoO o000oooo2 = (o000oOoO) this.f13298OooO0oO;
        Context context = this.f13292OooO00o;
        o000oooo2.OooO00o(context, intentFilter2);
        boolean z2 = this.f13293OooO0O0;
        o000oOoO o000oooo3 = (o000oOoO) this.f13296OooO0o;
        if (z2) {
            o000oooo3.OooO0OO(context, intentFilter);
        } else {
            o000oooo3.OooO00o(context, intentFilter);
        }
    }

    public o0OoOo0(Context context, com.google.android.gms.internal.ads.OooOOO0 oooOOO0) {
        this.f13292OooO00o = context.getApplicationContext();
        this.f13294OooO0OO = oooOOO0;
        pm0 pm0Var = rm0.f23913OooOo0o;
        this.f13296OooO0o = gn0.f19388OooOoO;
        this.f13298OooO0oO = k50.f20453OooO00o;
    }
}

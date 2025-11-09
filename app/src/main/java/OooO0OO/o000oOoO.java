package OooO0oO;

import Oooo00O.o000000O;
import OoooOOO.oOO0000;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.play_billing.o0O000;
import com.google.android.gms.internal.play_billing.o0O000Oo;
import com.google.android.gms.internal.play_billing.o0O0oo00;
import com.google.android.gms.internal.play_billing.o0OOO0;
import com.google.android.gms.internal.play_billing.oOO00O;

/* loaded from: classes.dex */
public final class o000oOoO extends BroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f13288OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f13289OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f13290OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f13291OooO0Oo;

    public o000oOoO(o0OoOo0 o0oooo0, boolean z) {
        this.f13291OooO0Oo = o0oooo0;
        this.f13290OooO0OO = z;
    }

    public synchronized void OooO00o(Context context, IntentFilter intentFilter) {
        try {
            if (this.f13289OooO0O0) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f13290OooO0OO ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f13289OooO0O0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void OooO0O0() {
        oOO0000 ooo0000 = (oOO0000) this.f13291OooO0Oo;
        ooo0000.ooOO();
        ooo0000.OooO0O0().OooOO0O();
        ooo0000.OooO0O0().OooOO0O();
        if (this.f13289OooO0O0) {
            ooo0000.OooO00o().f14398Oooo0.OooO0O0("Unregistering connectivity change receiver");
            this.f13289OooO0O0 = false;
            this.f13290OooO0OO = false;
            try {
                ooo0000.f14805Oooo00O.f14516OooOo0O.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                ooo0000.OooO00o().f14393OooOoOO.OooO0OO(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void OooO0OO(Context context, IntentFilter intentFilter) {
        o000oOoO o000oooo2;
        try {
            try {
                if (this.f13289OooO0O0) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    o000oooo2 = this;
                    context.registerReceiver(o000oooo2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f13290OooO0OO ? 4 : 2);
                } else {
                    o000oooo2 = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                o000oooo2.f13289OooO0O0 = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized void OooO0Oo(Context context) {
        if (!this.f13289OooO0O0) {
            oOO00O.OooO0oo("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f13289OooO0O0 = false;
        }
    }

    public void OooO0o0(Bundle bundle, BillingResult billingResult, int i) {
        o0O000 o0o000OooOOOo;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((OooOOO0) ((o0OoOo0) this.f13291OooO0Oo).f13297OooO0o0).OooOO0O(zzcg.zzb(23, i, billingResult));
                return;
            }
            OooOOO0 oooOOO0 = (OooOOO0) ((o0OoOo0) this.f13291OooO0Oo).f13297OooO0o0;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i2 = o0O000.f27077OooO00o;
            synchronized (o0O000.class) {
                int i3 = o0O000.f27077OooO00o;
                o0O0oo00 o0o0oo00 = o0O0oo00.f27130OooO0OO;
                o0o000OooOOOo = o0O000Oo.OooOOOo();
                int i4 = o0O000.f27077OooO00o;
            }
            oooOOO0.OooOO0O(o0OOO0.OooOOO(byteArray, o0o000OooOOOo));
        } catch (Throwable unused) {
            oOO00O.OooO0oo("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oO.o000oOoO.onReceive(android.content.Context, android.content.Intent):void");
    }

    public o000oOoO(oOO0000 ooo0000) {
        o000000O.OooO0oo(ooo0000);
        this.f13291OooO0Oo = ooo0000;
    }
}

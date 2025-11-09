package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.o0OOOO00;
import com.google.android.gms.internal.play_billing.oOO00O;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OooOOO implements ServiceConnection {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f15454OooOo0O;

    public /* synthetic */ OooOOO(OooOOOO oooOOOO) {
        this.f15454OooOo0O = oooOOOO;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.OooOOO oooOO0O;
        oOO00O.OooO0oO("BillingClientTesting", "Billing Override Service connected.");
        OooOOOO oooOOOO = this.f15454OooOo0O;
        int i = com.google.android.gms.internal.play_billing.OooOOO0.f26956OooOo0o;
        if (iBinder == null) {
            oooOO0O = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            oooOO0O = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.OooOOO ? (com.google.android.gms.internal.play_billing.OooOOO) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.OooOO0O(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
        }
        oooOOOO.f15457Oooo0 = oooOO0O;
        this.f15454OooOo0O.f15459Oooo00o = 2;
        OooOOOO oooOOOO2 = this.f15454OooOo0O;
        o0OOOO00 o0oooo00Zzd = zzcg.zzd(26);
        Objects.requireNonNull(o0oooo00Zzd, "ApiSuccess should not be null");
        oooOOOO2.f15420OooO0oO.OooOOO(o0oooo00Zzd);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        oOO00O.OooO0oo("BillingClientTesting", "Billing Override Service disconnected.");
        this.f15454OooOo0O.f15457Oooo0 = null;
        this.f15454OooOo0O.f15459Oooo00o = 0;
    }
}

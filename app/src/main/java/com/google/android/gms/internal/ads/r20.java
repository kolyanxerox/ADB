package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes2.dex */
public final class r20 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final b40 f23730OooO00o;

    public r20(b40 b40Var) {
        this.f23730OooO00o = b40Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        b40.OooO0o(this.f23730OooO00o, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}

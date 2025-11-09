package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class zabx extends BroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public Context f16766OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0oO.OooOOO0 f16767OooO0O0;

    public zabx(OooO0oO.OooOOO0 oooOOO0) {
        this.f16767OooO0O0 = oooOOO0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f16767OooO0O0.f13278OooOo;
            throw null;
        }
    }
}

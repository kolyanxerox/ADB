package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
public final class zzavw extends BroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f26398OooO00o = true;

    public zzavw(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f26398OooO00o = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f26398OooO00o = false;
        }
    }
}

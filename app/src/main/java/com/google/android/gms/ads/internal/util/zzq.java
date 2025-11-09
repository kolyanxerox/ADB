package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzq extends BroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzs f16309OooO00o;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zEquals = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
        zzs zzsVar = this.f16309OooO00o;
        if (zEquals) {
            zzsVar.f16316OooO0o0 = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzsVar.f16316OooO0o0 = false;
        }
    }
}

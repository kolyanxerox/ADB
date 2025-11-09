package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzci {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16267OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Context f16268OooO0o0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f16266OooO0OO = false;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final WeakHashMap f16265OooO0O0 = new WeakHashMap();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final BroadcastReceiver f16264OooO00o = new zzch(this);

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(Context context) {
        try {
            if (this.f16266OooO0OO) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f16268OooO0o0 = applicationContext;
            if (applicationContext == null) {
                this.f16268OooO0o0 = context;
            }
            AbstractC1448c7.OooO00o(this.f16268OooO0o0);
            this.f16267OooO0Oo = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00Oo0o0)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOoO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f16268OooO0o0.registerReceiver(this.f16264OooO00o, intentFilter);
            } else {
                this.f16268OooO0o0.registerReceiver(this.f16264OooO00o, intentFilter, 4);
            }
            this.f16266OooO0OO = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f16267OooO0Oo) {
            this.f16265OooO0O0.put(broadcastReceiver, intentFilter);
            return;
        }
        AbstractC1448c7.OooO00o(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOoO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f16267OooO0Oo) {
            this.f16265OooO0O0.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}

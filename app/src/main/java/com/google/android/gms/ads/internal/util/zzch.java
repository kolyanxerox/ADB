package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzch extends BroadcastReceiver {

    /* renamed from: OooO00o */
    public final /* synthetic */ zzci f16263OooO00o;

    public zzch(zzci zzciVar) {
        this.f16263OooO00o = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzci zzciVar = this.f16263OooO00o;
        synchronized (zzciVar) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : zzciVar.f16265OooO0O0.entrySet()) {
                    if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                        arrayList.add((BroadcastReceiver) entry.getKey());
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

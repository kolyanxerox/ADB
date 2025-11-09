package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class d41 extends BroadcastReceiver implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Handler f18157OooOo0O;

    public d41(Handler handler) {
        this.f18157OooOo0O = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f18157OooOo0O.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}

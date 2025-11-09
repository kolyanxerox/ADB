package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.pj0;

/* loaded from: classes2.dex */
public final class zzf extends pj0 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void OooO00o(Message message) {
        try {
            super.OooO00o(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzq();
            zzs.zzN(com.google.android.gms.ads.internal.zzv.zzp().f23633OooO0o0, th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdMobHandler.handleMessage", e);
        }
    }
}

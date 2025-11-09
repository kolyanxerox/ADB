package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public class pj0 extends Handler {
    public pj0(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public void OooO00o(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        OooO00o(message);
    }
}

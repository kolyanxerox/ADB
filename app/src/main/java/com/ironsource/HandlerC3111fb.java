package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.fb */
/* loaded from: classes2.dex */
public class HandlerC3111fb extends Handler {

    /* renamed from: b */
    private static final String f8563b = "DownloadHandler";

    /* renamed from: a */
    InterfaceC3602rp f8564a;

    public HandlerC3111fb(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public void m8657a() {
        this.f8564a = null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC3602rp interfaceC3602rp = this.f8564a;
        if (interfaceC3602rp == null) {
            Logger.m12266i(f8563b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                interfaceC3602rp.mo8059a((C3769vh) message.obj);
            } else {
                this.f8564a.mo8060a((C3769vh) message.obj, new C3454nh(i, C3679sw.m12312a(i)));
            }
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("handleMessage | Got exception: ", th);
            sbOooOOO.append(th.getMessage());
            Logger.m12266i(f8563b, sbOooOOO.toString());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* renamed from: a */
    public void m8658a(InterfaceC3602rp interfaceC3602rp) {
        if (interfaceC3602rp == null) {
            throw new IllegalArgumentException();
        }
        this.f8564a = interfaceC3602rp;
    }
}

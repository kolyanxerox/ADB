package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.wc */
/* loaded from: classes2.dex */
public class HandlerC3798wc extends Handler {

    /* renamed from: a */
    private final ConcurrentHashMap<String, InterfaceC3602rp> f12446a;

    public HandlerC3798wc(Looper looper) {
        super(looper);
        this.f12446a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public void m12888a(String str, InterfaceC3602rp interfaceC3602rp) {
        if (str == null || interfaceC3602rp == null) {
            return;
        }
        this.f12446a.put(str, interfaceC3602rp);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C3769vh c3769vh = (C3769vh) message.obj;
            String path = c3769vh.getPath();
            InterfaceC3602rp interfaceC3602rp = this.f12446a.get(path);
            if (interfaceC3602rp == null) {
                return;
            }
            if (m12887a(message.what)) {
                interfaceC3602rp.mo8059a(c3769vh);
            } else {
                int i = message.what;
                interfaceC3602rp.mo8060a(c3769vh, new C3454nh(i, C3679sw.m12312a(i)));
            }
            this.f12446a.remove(path);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* renamed from: a */
    private boolean m12887a(int i) {
        return i == 1016 || i == 1015;
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jt */
/* loaded from: classes2.dex */
public final class C1727jt implements o0oOO.OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f20384OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile boolean f20385OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f20386OooOo0o;

    public C1727jt(cq0 cq0Var, ScheduledExecutorService scheduledExecutorService, df0 df0Var) {
        this.f20385OooOo0O = true;
        this.f20386OooOo0o = cq0Var;
        this.f20384OooOo = scheduledExecutorService;
    }

    @Override // o0oOO.OooO00o
    public synchronized o0oOO.OooO0O0 OooO0OO(String str) {
        o00OoO00.OooOO0 oooOO0;
        oooOO0 = (o00OoO00.OooOO0) ((ConcurrentHashMap) this.f20386OooOo0o).get(str);
        if (oooOO0 == null) {
            oooOO0 = new o00OoO00.OooOO0(str, (LinkedBlockingQueue) this.f20384OooOo, this.f20385OooOo0O);
            ((ConcurrentHashMap) this.f20386OooOo0o).put(str, oooOO0);
        }
        return oooOO0;
    }

    public C1727jt() {
        this.f20385OooOo0O = false;
        this.f20386OooOo0o = new ConcurrentHashMap();
        this.f20384OooOo = new LinkedBlockingQueue();
    }
}

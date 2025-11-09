package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class o71 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final h91 f22354OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final CopyOnWriteArrayList f22355OooO0O0;

    public /* synthetic */ o71(CopyOnWriteArrayList copyOnWriteArrayList, h91 h91Var) {
        this.f22355OooO0O0 = copyOnWriteArrayList;
        this.f22354OooO00o = h91Var;
    }

    public void OooO00o(InterfaceC1546ew interfaceC1546ew) {
        Iterator it = this.f22355OooO0O0.iterator();
        while (it.hasNext()) {
            k91 k91Var = (k91) it.next();
            c60 c60Var = new c60(16, interfaceC1546ew, k91Var.f20468OooO0O0);
            int i = i80.f19994OooO00o;
            Handler handler = k91Var.f20467OooO00o;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    c60Var.run();
                } else {
                    handler.post(c60Var);
                }
            }
        }
    }
}

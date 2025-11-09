package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class v51 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final f81 f24851OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f24852OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object f24853OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Looper f24854OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f24855OooO0o0;

    public v51(t51 t51Var, f81 f81Var, Looper looper) {
        this.f24851OooO00o = f81Var;
        this.f24854OooO0Oo = looper;
    }

    public final synchronized void OooO00o(boolean z) {
        notifyAll();
    }
}

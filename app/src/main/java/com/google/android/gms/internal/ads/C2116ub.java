package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ub */
/* loaded from: classes2.dex */
public final class C2116ub {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f24616OooO00o = false;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f24617OooO0O0 = false;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public float f24618OooO0OO = 0.0f;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f24619OooO0Oo = new AtomicBoolean(false);

    public final synchronized boolean OooO00o(boolean z) {
        if (!this.f24619OooO0Oo.get()) {
            return z;
        }
        return this.f24616OooO00o;
    }
}

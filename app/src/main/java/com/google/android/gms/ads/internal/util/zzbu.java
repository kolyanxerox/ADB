package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzbu {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f16246OooO00o = new ConcurrentHashMap();

    public zzbu() {
        new AtomicInteger(0);
    }

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.f16246OooO00o.get(num);
    }
}

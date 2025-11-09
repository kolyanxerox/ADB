package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.p2 */
/* loaded from: classes2.dex */
public final class C1922p2 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2143v1 f23179OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f23180OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f23181OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Method f23182OooO0Oo = null;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final CountDownLatch f23183OooO0o = new CountDownLatch(1);

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Class[] f23184OooO0o0;

    public C1922p2(C2143v1 c2143v1, String str, String str2, Class... clsArr) {
        this.f23179OooO00o = c2143v1;
        this.f23180OooO0O0 = str;
        this.f23181OooO0OO = str2;
        this.f23184OooO0o0 = clsArr;
        c2143v1.f24815OooO0O0.submit(new RunnableC1442c1(this, 3));
    }
}

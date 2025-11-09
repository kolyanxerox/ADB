package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.q2 */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC1959q2 implements Callable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f23488OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C2143v1 f23489OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f23490OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public Method f23491OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C2104u f23492OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f23493OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final int f23494OooOoo0;

    public AbstractCallableC1959q2(C2143v1 c2143v1, String str, String str2, C2104u c2104u, int i, int i2) {
        this.f23489OooOo0O = c2143v1;
        this.f23490OooOo0o = str;
        this.f23488OooOo = str2;
        this.f23492OooOoO0 = c2104u;
        this.f23493OooOoOO = i;
        this.f23494OooOoo0 = i2;
    }

    public abstract void OooO00o();

    public void OooO0O0() {
        int i;
        C2143v1 c2143v1 = this.f23489OooOo0O;
        try {
            long jNanoTime = System.nanoTime();
            Method methodOooO0Oo = c2143v1.OooO0Oo(this.f23490OooOo0o, this.f23488OooOo);
            this.f23491OooOoO = methodOooO0Oo;
            if (methodOooO0Oo == null) {
                return;
            }
            OooO00o();
            C1515e1 c1515e1 = c2143v1.f24825OooOOO0;
            if (c1515e1 == null || (i = this.f23493OooOoOO) == Integer.MIN_VALUE) {
                return;
            }
            c1515e1.OooO00o(this.f23494OooOoo0, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        OooO0O0();
        return null;
    }
}

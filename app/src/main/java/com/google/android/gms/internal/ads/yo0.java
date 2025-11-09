package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class yo0 extends xh0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final Unsafe f25950OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final long f25951OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final long f25952OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final long f25953OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final long f25954OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final long f25955OooOoo0;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new xo0());
            }
            try {
                f25951OooOoO = unsafe.objectFieldOffset(ap0.class.getDeclaredField("OooOo"));
                f25952OooOoO0 = unsafe.objectFieldOffset(ap0.class.getDeclaredField("OooOo0o"));
                f25953OooOoOO = unsafe.objectFieldOffset(ap0.class.getDeclaredField("OooOo0O"));
                f25955OooOoo0 = unsafe.objectFieldOffset(zo0.class.getDeclaredField("OooO00o"));
                f25954OooOoo = unsafe.objectFieldOffset(zo0.class.getDeclaredField("OooO0O0"));
                f25950OooOo = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final ro0 OooOO0(ap0 ap0Var) {
        ro0 ro0Var;
        ro0 ro0Var2 = ro0.f23921OooO0Oo;
        do {
            ro0Var = ap0Var.f17079OooOo0o;
            if (ro0Var2 == ro0Var) {
                break;
            }
        } while (!Ooooo00(ap0Var, ro0Var, ro0Var2));
        return ro0Var;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final zo0 Oooo000(ap0 ap0Var) {
        zo0 zo0Var;
        zo0 zo0Var2 = zo0.f26234OooO0OO;
        do {
            zo0Var = ap0Var.f17077OooOo;
            if (zo0Var2 == zo0Var) {
                break;
            }
        } while (!Oooooo0(ap0Var, zo0Var, zo0Var2));
        return zo0Var;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void OoooO00(zo0 zo0Var, zo0 zo0Var2) {
        f25950OooOo.putObject(zo0Var, f25954OooOoo, zo0Var2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean Ooooo00(ap0 ap0Var, ro0 ro0Var, ro0 ro0Var2) {
        return cp0.OooO00o(f25950OooOo, ap0Var, f25952OooOoO0, ro0Var, ro0Var2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean OooooOO(ap0 ap0Var, Object obj, Object obj2) {
        return cp0.OooO00o(f25950OooOo, ap0Var, f25953OooOoOO, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean Oooooo0(ap0 ap0Var, zo0 zo0Var, zo0 zo0Var2) {
        return cp0.OooO00o(f25950OooOo, ap0Var, f25951OooOoO, zo0Var, zo0Var2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void o000oOoO(zo0 zo0Var, Thread thread) {
        f25950OooOo.putObject(zo0Var, f25955OooOoo0, thread);
    }
}

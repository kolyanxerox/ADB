package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o00O000o extends o0O000Oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final long f27043OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final Unsafe f27044OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final long f27045OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final long f27046OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final long f27047OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final long f27048OooOoo0;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new o00O000());
            }
            try {
                f27046OooOoO0 = unsafe.objectFieldOffset(o00O00O.class.getDeclaredField("OooOo"));
                f27043OooOo = unsafe.objectFieldOffset(o00O00O.class.getDeclaredField("OooOo0o"));
                f27045OooOoO = unsafe.objectFieldOffset(o00O00O.class.getDeclaredField("OooOo0O"));
                f27047OooOoOO = unsafe.objectFieldOffset(o00O00.class.getDeclaredField("OooO00o"));
                f27048OooOoo0 = unsafe.objectFieldOffset(o00O00.class.getDeclaredField("OooO0O0"));
                f27044OooOo0o = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final o000OOo0 OooO0Oo(o00O00O o00o00o) {
        o000OOo0 o000ooo02;
        o000OOo0 o000ooo03 = o000OOo0.f27028OooO0Oo;
        do {
            o000ooo02 = o00o00o.f27055OooOo0o;
            if (o000ooo03 == o000ooo02) {
                break;
            }
        } while (!OooOoO(o00o00o, o000ooo02, o000ooo03));
        return o000ooo02;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final o00O00 OooOOOO(o00O00O o00o00o) {
        o00O00 o00o00;
        o00O00 o00o002 = o00O00.f27038OooO0OO;
        do {
            o00o00 = o00o00o.f27053OooOo;
            if (o00o002 == o00o00) {
                break;
            }
        } while (!Oooo000(o00o00o, o00o00, o00o002));
        return o00o00;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOOoo(o00O00 o00o00, o00O00 o00o002) {
        f27044OooOo0o.putObject(o00o00, f27048OooOoo0, o00o002);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOo0(o00O00 o00o00, Thread thread) {
        f27044OooOo0o.putObject(o00o00, f27047OooOoOO, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOoO(o00O00O o00o00o, o000OOo0 o000ooo02, o000OOo0 o000ooo03) {
        return o00O00o0.OooO00o(f27044OooOo0o, o00o00o, f27043OooOo, o000ooo02, o000ooo03);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOooO(o00O00O o00o00o, Object obj, Object obj2) {
        return o00O00o0.OooO00o(f27044OooOo0o, o00o00o, f27045OooOoO, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean Oooo000(o00O00O o00o00o, o00O00 o00o00, o00O00 o00o002) {
        return o00O00o0.OooO00o(f27044OooOo0o, o00o00o, f27046OooOoO0, o00o00, o00o002);
    }
}

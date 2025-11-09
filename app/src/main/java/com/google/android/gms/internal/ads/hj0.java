package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class hj0 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f19800OooO0o = new HashMap();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f19801OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OoooO0O.o00Ooo f19802OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OoooOOO.o0O0oo00 f19803OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public C2051sk f19804OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Object f19805OooO0o0 = new Object();

    public hj0(Context context, OoooO0O.o00Ooo o00ooo2, OoooOOO.o0O0oo00 o0o0oo00, o0O o0o) {
        this.f19801OooO00o = context;
        this.f19802OooO0O0 = o00ooo2;
        this.f19803OooO0OO = o0o0oo00;
    }

    public final C2051sk OooO00o() {
        C2051sk c2051sk;
        synchronized (this.f19805OooO0o0) {
            c2051sk = this.f19804OooO0Oo;
        }
        return c2051sk;
    }

    public final boolean OooO0O0(OooOOo0.o0OOO0o o0ooo0o) throws IllegalAccessException, InstantiationException, IllegalArgumentException, gj0, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C2051sk c2051sk = new C2051sk(OooO0OO(o0ooo0o).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f19801OooO00o, "msa-r", o0ooo0o.OooOoOO(), null, new Bundle(), 2), o0ooo0o, this.f19802OooO0O0, this.f19803OooO0OO, 15);
                if (!c2051sk.OooOooO()) {
                    throw new gj0(4000, "init failed");
                }
                int iOooOo = c2051sk.OooOo();
                if (iOooOo != 0) {
                    throw new gj0(4001, "ci: " + iOooOo);
                }
                synchronized (this.f19805OooO0o0) {
                    C2051sk c2051sk2 = this.f19804OooO0Oo;
                    if (c2051sk2 != null) {
                        try {
                            c2051sk2.OooOoo0();
                        } catch (gj0 e) {
                            this.f19803OooO0OO.OooO0oO(e.f19372OooOo0O, -1L, e);
                        }
                        this.f19804OooO0Oo = c2051sk;
                    } else {
                        this.f19804OooO0Oo = c2051sk;
                    }
                }
                this.f19803OooO0OO.OooO0oo(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new gj0(e2, 2004);
            }
        } catch (gj0 e3) {
            this.f19803OooO0OO.OooO0oO(e3.f19372OooOo0O, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.f19803OooO0OO.OooO0oO(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final synchronized Class OooO0OO(OooOOo0.o0OOO0o o0ooo0o) {
        try {
            String strOooOooo = ((C2070t2) o0ooo0o.f13518OooOo0o).OooOooo();
            HashMap map = f19800OooO0o;
            Class cls = (Class) map.get(strOooOooo);
            if (cls != null) {
                return cls;
            }
            try {
                if (!o0O.OooOOo0((File) o0ooo0o.f13516OooOo)) {
                    throw new gj0(2026, "VM did not pass signature verification");
                }
                try {
                    File file = (File) o0ooo0o.f13520OooOoO0;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(((File) o0ooo0o.f13516OooOo).getAbsolutePath(), file.getAbsolutePath(), null, this.f19801OooO00o.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strOooOooo, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new gj0(e, 2008);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new gj0(e, 2008);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new gj0(e, 2008);
                }
            } catch (GeneralSecurityException e4) {
                throw new gj0(e4, 2026);
            }
        } finally {
        }
    }
}

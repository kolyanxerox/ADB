package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zz0 extends bz0 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zz0> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd;
    protected l11 zzt;

    public zz0() {
        this.zzq = 0;
        this.zzd = -1;
        this.zzt = l11.f20771OooO0o;
    }

    public static Object OooO(Method method, bz0 bz0Var, Object... objArr) {
        try {
            return method.invoke(bz0Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void OooOO0O(Class cls, zz0 zz0Var) {
        zz0Var.OooOO0();
        zzc.put(cls, zz0Var);
    }

    public static zz0 OooOOO0(Class cls) throws ClassNotFoundException {
        zz0 zz0Var = zzc.get(cls);
        if (zz0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zz0Var = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zz0Var != null) {
            return zz0Var;
        }
        zz0 zz0Var2 = (zz0) ((zz0) q11.OooO0oo(cls)).OooOOoo(6, null);
        if (zz0Var2 == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, zz0Var2);
        return zz0Var2;
    }

    public static zz0 OooOOOO(zz0 zz0Var, jz0 jz0Var, tz0 tz0Var) throws k01 {
        nz0 nz0VarOooOOOo = jz0Var.OooOOOo();
        zz0 zz0VarOooOOOo = OooOOOo(zz0Var, nz0VarOooOOOo, tz0Var);
        nz0VarOooOOOo.OoooOo0();
        OooOo00(zz0VarOooOOOo);
        return zz0VarOooOOOo;
    }

    public static zz0 OooOOOo(zz0 zz0Var, nz0 nz0Var, tz0 tz0Var) throws k01 {
        zz0 zz0VarOooOOO = zz0Var.OooOOO();
        try {
            g11 g11VarOooO00o = a11.f16875OooO0OO.OooO00o(zz0VarOooOOO.getClass());
            w10 w10Var = (w10) nz0Var.f21617OooO0O0;
            if (w10Var == null) {
                w10Var = new w10(nz0Var);
            }
            g11VarOooO00o.OooO(zz0VarOooOOO, w10Var, tz0Var);
            g11VarOooO00o.OooO00o(zz0VarOooOOO);
            return zz0VarOooOOO;
        } catch (k01 e) {
            if (e.f20408OooOo0O) {
                throw new k01(e.getMessage(), e);
            }
            throw e;
        } catch (k11 e2) {
            throw new k01(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof k01) {
                throw ((k01) e3.getCause());
            }
            throw new k01(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof k01) {
                throw ((k01) e4.getCause());
            }
            throw e4;
        }
    }

    public static zz0 OooOo0(zz0 zz0Var, byte[] bArr, int i, tz0 tz0Var) throws k01 {
        if (i == 0) {
            return zz0Var;
        }
        zz0 zz0VarOooOOO = zz0Var.OooOOO();
        try {
            g11 g11VarOooO00o = a11.f16875OooO0OO.OooO00o(zz0VarOooOOO.getClass());
            g11VarOooO00o.OooO0OO(zz0VarOooOOO, bArr, 0, i, new ez0(tz0Var));
            g11VarOooO00o.OooO00o(zz0VarOooOOO);
            return zz0VarOooOOO;
        } catch (k01 e) {
            if (e.f20408OooOo0O) {
                throw new k01(e.getMessage(), e);
            }
            throw e;
        } catch (k11 e2) {
            throw new k01(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof k01) {
                throw ((k01) e3.getCause());
            }
            throw new k01(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void OooOo00(zz0 zz0Var) throws k01 {
        if (zz0Var != null && !OooOo0O(zz0Var, true)) {
            throw new k01(new k11().getMessage());
        }
    }

    public static final boolean OooOo0O(zz0 zz0Var, boolean z) {
        byte bByteValue = ((Byte) zz0Var.OooOOoo(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zOooO0oO = a11.f16875OooO0OO.OooO00o(zz0Var.getClass()).OooO0oO(zz0Var);
        if (z) {
            zz0Var.OooOOoo(2, true == zOooO0oO ? zz0Var : null);
        }
        return zOooO0oO;
    }

    @Override // com.google.android.gms.internal.ads.bz0
    public final int OooO00o(g11 g11Var) {
        int iOooO0oo;
        int iOooO0oo2;
        if (OooOOo()) {
            if (g11Var == null) {
                iOooO0oo2 = a11.f16875OooO0OO.OooO00o(getClass()).OooO0oo(this);
            } else {
                iOooO0oo2 = g11Var.OooO0oo(this);
            }
            if (iOooO0oo2 >= 0) {
                return iOooO0oo2;
            }
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooO0oo2, "serialized size must be non-negative, was "));
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (g11Var == null) {
            iOooO0oo = a11.f16875OooO0OO.OooO00o(getClass()).OooO0oo(this);
        } else {
            iOooO0oo = g11Var.OooO0oo(this);
        }
        OooO0o(iOooO0oo);
        return iOooO0oo;
    }

    public final void OooO0o(int i) {
        if (i < 0) {
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(i, "serialized size must be non-negative, was "));
        }
        this.zzd = i | (this.zzd & Integer.MIN_VALUE);
    }

    public final xz0 OooO0oO() {
        return (xz0) OooOOoo(5, null);
    }

    public final y01 OooO0oo() {
        return (y01) OooOOoo(7, null);
    }

    public final void OooOO0() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final xz0 OooOO0o() {
        xz0 xz0Var = (xz0) OooOOoo(5, null);
        if (xz0Var.f25821OooOo0O.equals(this)) {
            return xz0Var;
        }
        xz0Var.OooO0Oo();
        zz0 zz0Var = xz0Var.f25822OooOo0o;
        a11.f16875OooO0OO.OooO00o(zz0Var.getClass()).OooO0O0(zz0Var, this);
        return xz0Var;
    }

    public final zz0 OooOOO() {
        return (zz0) OooOOoo(4, null);
    }

    public final boolean OooOOo() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final void OooOOo0(rz0 rz0Var) {
        g11 g11VarOooO00o = a11.f16875OooO0OO.OooO00o(getClass());
        rh0 rh0Var = rz0Var.f23960OooOo0o;
        if (rh0Var == null) {
            rh0Var = new rh0(rz0Var);
        }
        g11VarOooO00o.OooO0Oo(this, rh0Var);
    }

    public abstract Object OooOOoo(int i, zz0 zz0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a11.f16875OooO0OO.OooO00o(getClass()).OooO0o0(this, (zz0) obj);
    }

    public final int hashCode() {
        if (OooOOo()) {
            return a11.f16875OooO0OO.OooO00o(getClass()).OooO0o(this);
        }
        if (this.zzq == 0) {
            this.zzq = a11.f16875OooO0OO.OooO00o(getClass()).OooO0o(this);
        }
        return this.zzq;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = u01.f24547OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        u01.OooO0OO(this, sb, 0);
        return sb.toString();
    }
}

package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class ooOOOOoo extends AbstractC2346o {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected oO0O00oO zzc;

    public ooOOOOoo() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = oO0O00oO.f26737OooO0o;
    }

    public static ooOOOOoo OooOO0o(Class cls) throws ClassNotFoundException {
        Map map = zzd;
        ooOOOOoo oooooooo = (ooOOOOoo) map.get(cls);
        if (oooooooo == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                oooooooo = (ooOOOOoo) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (oooooooo != null) {
            return oooooooo;
        }
        ooOOOOoo oooooooo2 = (ooOOOOoo) ((ooOOOOoo) oO0O0Oo0.OooO0Oo(cls)).OooOOOO(6);
        if (oooooooo2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, oooooooo2);
        return oooooooo2;
    }

    public static Object OooOOO(Method method, AbstractC2346o abstractC2346o, Object... objArr) {
        try {
            return method.invoke(abstractC2346o, objArr);
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

    public static void OooOOO0(Class cls, ooOOOOoo oooooooo) {
        oooooooo.OooO0o();
        zzd.put(cls, oooooooo);
    }

    public final oO000OOo OooO() {
        oO000OOo oo000ooo = (oO000OOo) OooOOOO(5);
        oo000ooo.OooO0o(this);
        return oo000ooo;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2346o
    public final int OooO0O0(oO0 oo0) {
        if (OooO0o0()) {
            int iOooO0o = oo0.OooO0o(this);
            if (iOooO0o >= 0) {
                return iOooO0o;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iOooO0o).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iOooO0o);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iOooO0o2 = oo0.OooO0o(this);
        if (iOooO0o2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iOooO0o2;
            return iOooO0o2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iOooO0o2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iOooO0o2);
        throw new IllegalStateException(sb2.toString());
    }

    public final void OooO0Oo(oO000O0 oo000o0) {
        oO0 oo0OooO00o = oOo000Oo.f26877OooO0OO.OooO00o(getClass());
        oO00Oo0 oo00oo0 = oo000o0.f26676OooO0Oo;
        if (oo00oo0 == null) {
            oo00oo0 = new oO00Oo0(oo000o0);
        }
        oo0OooO00o.OooO0Oo(this, oo00oo0);
    }

    public final void OooO0o() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final boolean OooO0o0() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void OooO0oO() {
        oOo000Oo.f26877OooO0OO.OooO00o(getClass()).OooO0oo(this);
        OooO0o();
    }

    public final oO000OOo OooO0oo() {
        return (oO000OOo) OooOOOO(5);
    }

    public final void OooOO0() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int OooOO0O() {
        if (OooO0o0()) {
            int iOooO0o = oOo000Oo.f26877OooO0OO.OooO00o(getClass()).OooO0o(this);
            if (iOooO0o >= 0) {
                return iOooO0o;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iOooO0o).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iOooO0o);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iOooO0o2 = oOo000Oo.f26877OooO0OO.OooO00o(getClass()).OooO0o(this);
        if (iOooO0o2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iOooO0o2;
            return iOooO0o2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iOooO0o2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iOooO0o2);
        throw new IllegalStateException(sb2.toString());
    }

    public abstract Object OooOOOO(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return oOo000Oo.f26877OooO0OO.OooO00o(getClass()).OooO0o0(this, (ooOOOOoo) obj);
    }

    public final int hashCode() {
        if (OooO0o0()) {
            return oOo000Oo.f26877OooO0OO.OooO00o(getClass()).OooO(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iOooO = oOo000Oo.f26877OooO0OO.OooO00o(getClass()).OooO(this);
        this.zza = iOooO;
        return iOooO;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = oO00o00O.f26719OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        oO00o00O.OooO0O0(this, sb, 0);
        return sb.toString();
    }
}

package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class o0OoO00O extends o0O00o0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected o0OO00o0 zzc;
    private int zzd;

    public o0OoO00O() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = o0OO00o0.f27139OooO0o;
    }

    public static Object OooO(Method method, o0O00o0 o0o00o0, Object... objArr) {
        try {
            return method.invoke(o0o00o0, objArr);
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

    public static o0OoO00O OooO0oo(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        o0OoO00O o0ooo00o = (o0OoO00O) map.get(cls);
        if (o0ooo00o == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o0ooo00o = (o0OoO00O) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (o0ooo00o != null) {
            return o0ooo00o;
        }
        o0OoO00O o0ooo00o2 = (o0OoO00O) ((o0OoO00O) o0OO0o.OooO0o(cls)).OooO0Oo(6);
        if (o0ooo00o2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, o0ooo00o2);
        return o0ooo00o2;
    }

    public static void OooOO0O(Class cls, o0OoO00O o0ooo00o) {
        o0ooo00o.OooOO0();
        zzb.put(cls, o0ooo00o);
    }

    public static final boolean OooOOO0(o0OoO00O o0ooo00o, boolean z) {
        byte bByteValue = ((Byte) o0ooo00o.OooO0Oo(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zOooO0OO = o0O0oo00.f27130OooO0OO.OooO00o(o0ooo00o.getClass()).OooO0OO(o0ooo00o);
        if (z) {
            o0ooo00o.OooO0Oo(2);
        }
        return zOooO0OO;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O00o0
    public final int OooO00o(o0OO000o o0oo000o) {
        if (OooO0OO()) {
            int iOooO0o0 = o0oo000o.OooO0o0(this);
            if (iOooO0o0 >= 0) {
                return iOooO0o0;
            }
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooO0o0, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iOooO0o02 = o0oo000o.OooO0o0(this);
        if (iOooO0o02 < 0) {
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooO0o02, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iOooO0o02;
        return iOooO0o02;
    }

    public final boolean OooO0OO() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object OooO0Oo(int i);

    public final o0O00 OooO0o() {
        return (o0O00) OooO0Oo(5);
    }

    public final int OooO0o0() {
        if (OooO0OO()) {
            int iOooO0o0 = o0O0oo00.f27130OooO0OO.OooO00o(getClass()).OooO0o0(this);
            if (iOooO0o0 >= 0) {
                return iOooO0o0;
            }
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooO0o0, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iOooO0o02 = o0O0oo00.f27130OooO0OO.OooO00o(getClass()).OooO0o0(this);
        if (iOooO0o02 < 0) {
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooO0o02, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iOooO0o02;
        return iOooO0o02;
    }

    public final o0O00 OooO0oO() {
        o0O00 o0o00 = (o0O00) OooO0Oo(5);
        if (!o0o00.f27075OooOo0O.equals(this)) {
            if (!o0o00.f27076OooOo0o.OooO0OO()) {
                o0OoO00O o0ooo00o = (o0OoO00O) o0o00.f27075OooOo0O.OooO0Oo(4);
                o0O0oo00.f27130OooO0OO.OooO00o(o0ooo00o.getClass()).OooO0O0(o0ooo00o, o0o00.f27076OooOo0o);
                o0o00.f27076OooOo0o = o0ooo00o;
            }
            o0OoO00O o0ooo00o2 = o0o00.f27076OooOo0o;
            o0O0oo00.f27130OooO0OO.OooO00o(o0ooo00o2.getClass()).OooO0O0(o0ooo00o2, this);
        }
        return o0o00;
    }

    public final void OooOO0() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void OooOO0o() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return o0O0oo00.f27130OooO0OO.OooO00o(getClass()).OooO0oo(this, (o0OoO00O) obj);
    }

    public final int hashCode() {
        if (OooO0OO()) {
            return o0O0oo00.f27130OooO0OO.OooO00o(getClass()).OooO0o(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iOooO0o = o0O0oo00.f27130OooO0OO.OooO00o(getClass()).OooO0o(this);
        this.zza = iOooO0o;
        return iOooO0o;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = oo0OOoo.f27212OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        oo0OOoo.OooO0OO(this, sb, 0);
        return sb.toString();
    }
}

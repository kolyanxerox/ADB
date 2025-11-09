package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.nz0;
import com.google.android.gms.internal.ads.w10;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class o0ooOOo extends OooO00o {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, o0ooOOo> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected o000OOo0 unknownFields;

    public o0ooOOo() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = o000OOo0.f28101OooO0o;
    }

    public static o0ooOOo OooO(Class cls) throws ClassNotFoundException {
        o0ooOOo o0ooooo = defaultInstanceMap.get(cls);
        if (o0ooooo == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o0ooooo = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (o0ooooo != null) {
            return o0ooooo;
        }
        o0ooOOo defaultInstanceForType = ((o0ooOOo) oOO00O.OooO0O0(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static void OooO0o(o0ooOOo o0ooooo) throws o000OOo {
        if (!OooOO0o(o0ooooo, true)) {
            throw new o000OOo(new o000OO00().getMessage());
        }
    }

    public static Object OooOO0O(Method method, OooO00o oooO00o, Object... objArr) {
        try {
            return method.invoke(oooO00o, objArr);
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

    public static final boolean OooOO0o(o0ooOOo o0ooooo, boolean z) {
        byte bByteValue = ((Byte) o0ooooo.OooO0oo(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        o000O0 o000o0 = o000O0.f28087OooO0OO;
        o000o0.getClass();
        boolean zIsInitialized = o000o0.OooO00o(o0ooooo.getClass()).isInitialized(o0ooooo);
        if (z) {
            o0ooooo.OooO0oo(2);
        }
        return zIsInitialized;
    }

    public static o0ooOOo OooOOo(o0ooOOo o0ooooo, nz0 nz0Var, Oooo0 oooo0) throws o000OOo {
        o0ooOOo o0oooooOooOOOo = o0ooooo.OooOOOo();
        try {
            o000O0 o000o0 = o000O0.f28087OooO0OO;
            o000o0.getClass();
            o000O0O0 o000o0o0OooO00o = o000o0.OooO00o(o0oooooOooOOOo.getClass());
            w10 w10Var = (w10) nz0Var.f21617OooO0O0;
            if (w10Var == null) {
                w10Var = new w10(nz0Var, false);
            }
            o000o0o0OooO00o.OooO0OO(o0oooooOooOOOo, w10Var, oooo0);
            o000o0o0OooO00o.makeImmutable(o0oooooOooOOOo);
            return o0oooooOooOOOo;
        } catch (o000OO00 e) {
            throw new o000OOo(e.getMessage());
        } catch (o000OOo e2) {
            if (e2.f28100OooOo0O) {
                throw new o000OOo(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof o000OOo) {
                throw ((o000OOo) e3.getCause());
            }
            throw new o000OOo(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof o000OOo) {
                throw ((o000OOo) e4.getCause());
            }
            throw e4;
        }
    }

    public static o0ooOOo OooOOo0(o0ooOOo o0ooooo, OooOOO0 oooOOO0, Oooo0 oooo0) throws o000OOo {
        OooOO0O oooOO0O = (OooOO0O) oooOOO0;
        OooOOO oooOOOOooO0o = nz0.OooO0o(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), oooOO0O.size(), true);
        o0ooOOo o0oooooOooOOo = OooOOo(o0ooooo, oooOOOOooO0o, oooo0);
        oooOOOOooO0o.OooO00o(0);
        OooO0o(o0oooooOooOOo);
        return o0oooooOooOOo;
    }

    public static void OooOOoo(Class cls, o0ooOOo o0ooooo) {
        o0ooooo.OooOOO();
        defaultInstanceMap.put(cls, o0ooooo);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO00o
    public final int OooO00o(o000O0O0 o000o0o02) {
        int iOooO00o;
        int iOooO00o2;
        if (OooOOO0()) {
            if (o000o0o02 == null) {
                o000O0 o000o0 = o000O0.f28087OooO0OO;
                o000o0.getClass();
                iOooO00o2 = o000o0.OooO00o(getClass()).OooO00o(this);
            } else {
                iOooO00o2 = o000o0o02.OooO00o(this);
            }
            if (iOooO00o2 >= 0) {
                return iOooO00o2;
            }
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooO00o2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (o000o0o02 == null) {
            o000O0 o000o02 = o000O0.f28087OooO0OO;
            o000o02.getClass();
            iOooO00o = o000o02.OooO00o(getClass()).OooO00o(this);
        } else {
            iOooO00o = o000o0o02.OooO00o(this);
        }
        OooOo00(iOooO00o);
        return iOooO00o;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO00o
    public final void OooO0o0(OooOo00 oooOo00) {
        o000O0 o000o0 = o000O0.f28087OooO0OO;
        o000o0.getClass();
        o000O0O0 o000o0o0OooO00o = o000o0.OooO00o(getClass());
        o0000O00 o0000o00 = oooOo00.f28037OooO0OO;
        if (o0000o00 == null) {
            o0000o00 = new o0000O00(oooOo00);
        }
        o000o0o0OooO00o.OooO0O0(this, o0000o00);
    }

    public final oo000o OooO0oO() {
        return (oo000o) OooO0oo(5);
    }

    public abstract Object OooO0oo(int i);

    @Override // com.google.crypto.tink.shaded.protobuf.o0000O
    /* renamed from: OooOO0 */
    public final o0ooOOo getDefaultInstanceForType() {
        return (o0ooOOo) OooO0oo(6);
    }

    public final void OooOOO() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final boolean OooOOO0() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO00o
    /* renamed from: OooOOOO */
    public final oo000o OooO0OO() {
        return (oo000o) OooO0oo(5);
    }

    public final o0ooOOo OooOOOo() {
        return (o0ooOOo) OooO0oo(4);
    }

    public final oo000o OooOo0() {
        oo000o oo000oVar = (oo000o) OooO0oo(5);
        if (!oo000oVar.f28131OooOo0O.equals(this)) {
            oo000oVar.OooO0Oo();
            oo000o.OooO0o0(oo000oVar.f28132OooOo0o, this);
        }
        return oo000oVar;
    }

    public final void OooOo00(int i) {
        if (i < 0) {
            throw new IllegalStateException(OooO0oO.OooOo.OooO0o(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o000O0 o000o0 = o000O0.f28087OooO0OO;
        o000o0.getClass();
        return o000o0.OooO00o(getClass()).OooO0Oo(this, (o0ooOOo) obj);
    }

    public final int hashCode() {
        if (OooOOO0()) {
            o000O0 o000o0 = o000O0.f28087OooO0OO;
            o000o0.getClass();
            return o000o0.OooO00o(getClass()).OooO0o0(this);
        }
        if (this.memoizedHashCode == 0) {
            o000O0 o000o02 = o000O0.f28087OooO0OO;
            o000o02.getClass();
            this.memoizedHashCode = o000o02.OooO00o(getClass()).OooO0o0(this);
        }
        return this.memoizedHashCode;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = o0000OO0.f28080OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        o0000OO0.OooO0OO(this, sb, 0);
        return sb.toString();
    }
}

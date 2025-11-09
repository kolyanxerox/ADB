package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Looper;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class o0OOO0 {

    /* renamed from: OooO00o */
    public static volatile o00000o0.o0O0O00 f26560OooO00o;

    public static String OooO(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static o00O0oo.o000O000 OooO00o(int i, int i2, o00O0oo.o0000oo o0000ooVar) {
        if ((i2 & 2) != 0) {
            o0000ooVar = o00O0oo.o0000oo.f31602OooOo0O;
        }
        if (i == -2) {
            if (o0000ooVar != o00O0oo.o0000oo.f31602OooOo0O) {
                return new o00O0oo.o000OOo0(1, o0000ooVar);
            }
            o00O0oo.o000O00O.f31622OooOo00.getClass();
            return new o00O0oo.o000O000(o00O0oo.o000O00.f31611OooO0O0);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? o0000ooVar == o00O0oo.o0000oo.f31602OooOo0O ? new o00O0oo.o000O000(i) : new o00O0oo.o000OOo0(i, o0000ooVar) : new o00O0oo.o000O000(Integer.MAX_VALUE) : o0000ooVar == o00O0oo.o0000oo.f31602OooOo0O ? new o00O0oo.o000O000(0) : new o00O0oo.o000OOo0(1, o0000ooVar);
        }
        if (o0000ooVar == o00O0oo.o0000oo.f31602OooOo0O) {
            return new o00O0oo.o000OOo0(1, o00O0oo.o0000oo.f31603OooOo0o);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final boolean OooO0O0(byte[] a, int i, byte[] b, int i2, int i3) {
        kotlin.jvm.internal.OooOo.OooO0o0(a, "a");
        kotlin.jvm.internal.OooOo.OooO0o0(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static String OooO0o(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0) {
        StringBuilder sb = new StringBuilder(oooOOO0.size());
        for (int i = 0; i < oooOOO0.size(); i++) {
            byte bOooO0o0 = oooOOO0.OooO0o0(i);
            if (bOooO0o0 == 34) {
                sb.append("\\\"");
            } else if (bOooO0o0 == 39) {
                sb.append("\\'");
            } else if (bOooO0o0 != 92) {
                switch (bOooO0o0) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bOooO0o0 < 32 || bOooO0o0 > 126) {
                            sb.append('\\');
                            sb.append((char) (((bOooO0o0 >>> 6) & 3) + 48));
                            sb.append((char) (((bOooO0o0 >>> 3) & 7) + 48));
                            sb.append((char) ((bOooO0o0 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bOooO0o0);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void OooO0o0(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j, "size=", " offset=");
            sbOooOOo.append(j2);
            sbOooOOo.append(" byteCount=");
            sbOooOOo.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbOooOOo.toString());
        }
    }

    public static oo00o.OooO0OO OooO0oO(oo00o.OooO0o oooO0o, o00O0Oo.OooO0O0 oooO0O0) {
        int iOrdinal = oooO0o.ordinal();
        if (iOrdinal == 0) {
            return new oo00o.OooOOOO(oooO0O0);
        }
        oo00o.OooOo00 oooOo00 = oo00o.OooOo00.f33196OooO00o;
        if (iOrdinal == 1) {
            oo00o.OooOOO oooOOO = new oo00o.OooOOO();
            oooOOO.f33189OooOo0O = oooO0O0;
            oooOOO.f33190OooOo0o = oooOo00;
            return oooOOO;
        }
        if (iOrdinal != 2) {
            throw new OooOOO0.OooO00o();
        }
        oo00o.Oooo000 oooo000 = new oo00o.Oooo000();
        oooo000.f33197OooOo0O = oooO0O0;
        oooo000.f33198OooOo0o = oooOo00;
        return oooo000;
    }

    public static oo00o.OooOOOO OooO0oo(o00O0Oo.OooO0O0 initializer) {
        kotlin.jvm.internal.OooOo.OooO0o0(initializer, "initializer");
        return new oo00o.OooOOOO(initializer);
    }

    public static int OooOO0(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int OooOO0O(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public Oooo000.OooO0OO OooO0OO(Context context, Looper looper, o000OO.o0OoOo0 o0oooo0, Object obj, Oooo000.OooOO0O oooOO0O, Oooo000.OooOOO0 oooOOO0) {
        return OooO0Oo(context, looper, o0oooo0, obj, (com.google.android.gms.common.api.internal.Oooo0) oooOO0O, (com.google.android.gms.common.api.internal.Oooo0) oooOOO0);
    }

    public Oooo000.OooO0OO OooO0Oo(Context context, Looper looper, o000OO.o0OoOo0 o0oooo0, Object obj, com.google.android.gms.common.api.internal.Oooo0 oooo0, com.google.android.gms.common.api.internal.Oooo0 oooo02) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}

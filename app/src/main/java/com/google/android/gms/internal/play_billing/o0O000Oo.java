package com.google.android.gms.internal.play_billing;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.internal.ads.ez0;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes2.dex */
public abstract class o0O000Oo {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f27088OooOo0O;

    public /* synthetic */ o0O000Oo(int i) {
        this.f27088OooOo0O = i;
    }

    public static int OooO0O0(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int OooO0OO(byte[] bArr, int i, ez0 ez0Var) throws o0O00oO0 {
        int iOooo00O = Oooo00O(bArr, i, ez0Var);
        int i2 = ez0Var.f18711OooO00o;
        if (i2 < 0) {
            throw new o0O00oO0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iOooo00O) {
            throw new o0O00oO0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            ez0Var.f18713OooO0OO = o0O00000.f27078OooOo;
            return iOooo00O;
        }
        ez0Var.f18713OooO0OO = o0O00000.OooOO0(bArr, iOooo00O, i2);
        return iOooo00O + i2;
    }

    public static String OooO0o(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strOooOO0o;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strOooOO0o = "null";
            } else {
                try {
                    strOooOO0o = obj.toString();
                } catch (Exception e) {
                    String strOooOoo = OooO0oO.OooOo.OooOoo(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strOooOoo), (Throwable) e);
                    strOooOO0o = OooO0oO.OooOo.OooOO0o("<", strOooOoo, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strOooOO0o;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String OooO0o0(o0O00000 o0o00000) {
        StringBuilder sb = new StringBuilder(o0o00000.OooO0oO());
        for (int i = 0; i < o0o00000.OooO0oO(); i++) {
            byte bOooO0o0 = o0o00000.OooO0o0(i);
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

    public static void OooO0oO(int i, int i2) {
        String strOooO0o;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strOooO0o = OooO0o("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i2, "negative size: "));
                }
                strOooO0o = OooO0o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strOooO0o);
        }
    }

    public static void OooO0oo(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static boolean OooOO0(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = o0000O0.f26981OooOo0o;
            }
        } else {
            if (!(collection instanceof o000OO0O)) {
                return false;
            }
            objComparator = ((o0000Ooo) ((o000OO0O) collection)).f26988OooOo;
        }
        return comparator.equals(objComparator);
    }

    public static /* synthetic */ boolean OooOO0O(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, o00O00O o00o00o, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(o00o00o, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(o00o00o) != obj && atomicReferenceFieldUpdater.get(o00o00o) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean OooOO0o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, oO000o00 oo000o00, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(oo000o00, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(oo000o00) != obj && atomicReferenceFieldUpdater.get(oo000o00) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int OooOOO(int i, byte[] bArr) {
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        int i4 = bArr[i + 2] & ForkServer.ERROR;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int OooOOO0(int i) {
        if (i == 90) {
            return 91;
        }
        if (i == 91) {
            return 92;
        }
        if (i == 93) {
            return 94;
        }
        if (i == 94) {
            return 95;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                return 49;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                return 50;
            case 50:
                return 51;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                return 61;
            case 61:
                return 62;
            case IronSourceConstants.RETRY_LIMIT /* 62 */:
                return 63;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return InterfaceC3173h3.d.b.f8819b;
                    case InterfaceC3173h3.d.b.f8819b /* 101 */:
                        return 102;
                    case 102:
                        return InterfaceC3173h3.d.b.f8821d;
                    case InterfaceC3173h3.d.b.f8821d /* 103 */:
                        return 104;
                    case 104:
                        return InterfaceC3173h3.d.b.f8823f;
                    case InterfaceC3173h3.d.b.f8823f /* 105 */:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR;
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                        return 109;
                    case 109:
                        return InterfaceC3173h3.d.b.f8825h;
                    case InterfaceC3173h3.d.b.f8825h /* 110 */:
                        return InterfaceC3173h3.d.b.f8826i;
                    case InterfaceC3173h3.d.b.f8826i /* 111 */:
                        return InterfaceC3173h3.d.b.f8827j;
                    case InterfaceC3173h3.d.b.f8827j /* 112 */:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return 116;
                    case 116:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    public static o0O000 OooOOOo() {
        String str;
        ClassLoader classLoader = o0O000Oo.class.getClassLoader();
        if (o0O000.class.equals(o0O000.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!o0O000.class.getPackage().equals(o0O000Oo.class.getPackage())) {
                throw new IllegalArgumentException(o0O000.class.getName());
            }
            str = o0O000.class.getPackage().getName() + ".BlazeGenerated" + o0O000.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e) {
                    throw new IllegalStateException(e);
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new o0O000Oo[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(o0O0000O.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(o0O000.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (o0O000) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (o0O000) o0O000.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(e6);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static void OooOOo0(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(OooOoo(i, i2, "index"));
        }
    }

    public static void OooOo(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? OooOoo(i, i3, "start index") : (i2 < 0 || i2 > i3) ? OooOoo(i2, i3, "end index") : OooO0o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static int OooOo0o(o0OO000o o0oo000o, int i, byte[] bArr, int i2, int i3, o0O00OOO o0o00ooo, ez0 ez0Var) throws o0O00oO0 {
        o0OoO00O o0ooo00oZze = o0oo000o.zze();
        o0OO000o o0oo000o2 = o0oo000o;
        byte[] bArr2 = bArr;
        int i4 = i3;
        ez0 ez0Var2 = ez0Var;
        int iOooo0o0 = Oooo0o0(o0ooo00oZze, o0oo000o2, bArr2, i2, i4, ez0Var2);
        o0oo000o2.OooO00o(o0ooo00oZze);
        ez0Var2.f18713OooO0OO = o0ooo00oZze;
        o0o00ooo.add(o0ooo00oZze);
        while (iOooo0o0 < i4) {
            ez0 ez0Var3 = ez0Var2;
            int i5 = i4;
            int iOooo00O = Oooo00O(bArr2, iOooo0o0, ez0Var3);
            if (i != ez0Var3.f18711OooO00o) {
                break;
            }
            byte[] bArr3 = bArr2;
            o0OO000o o0oo000o3 = o0oo000o2;
            o0OoO00O o0ooo00oZze2 = o0oo000o3.zze();
            iOooo0o0 = Oooo0o0(o0ooo00oZze2, o0oo000o3, bArr3, iOooo00O, i5, ez0Var3);
            o0oo000o2 = o0oo000o3;
            bArr2 = bArr3;
            i4 = i5;
            ez0Var2 = ez0Var3;
            o0oo000o2.OooO00o(o0ooo00oZze2);
            ez0Var2.f18713OooO0OO = o0ooo00oZze2;
            o0o00ooo.add(o0ooo00oZze2);
        }
        return iOooo0o0;
    }

    public static boolean OooOoO0(byte b) {
        return b > -65;
    }

    public static String OooOoo(int i, int i2, String str) {
        if (i < 0) {
            return OooO0o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return OooO0o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i2, "negative size: "));
    }

    public static int OooOoo0(byte[] bArr, int i, o0O00OOO o0o00ooo, ez0 ez0Var) throws o0O00oO0 {
        o0O00O0o o0o00o0o = (o0O00O0o) o0o00ooo;
        int iOooo00O = Oooo00O(bArr, i, ez0Var);
        int i2 = ez0Var.f18711OooO00o + iOooo00O;
        while (iOooo00O < i2) {
            iOooo00O = Oooo00O(bArr, iOooo00O, ez0Var);
            o0o00o0o.OooO0o(ez0Var.f18711OooO00o);
        }
        if (iOooo00O == i2) {
            return iOooo00O;
        }
        throw new o0O00oO0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int OooOooo(int i, byte[] bArr, int i2, int i3, o0OO00o0 o0oo00o0, ez0 ez0Var) throws o0O00oO0 {
        if ((i >>> 3) == 0) {
            throw new o0O00oO0("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iOooo0O0 = Oooo0O0(bArr, i2, ez0Var);
            o0oo00o0.OooO0OO(i, Long.valueOf(ez0Var.f18712OooO0O0));
            return iOooo0O0;
        }
        if (i4 == 1) {
            o0oo00o0.OooO0OO(i, Long.valueOf(Oooo0o(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iOooo00O = Oooo00O(bArr, i2, ez0Var);
            int i5 = ez0Var.f18711OooO00o;
            if (i5 < 0) {
                throw new o0O00oO0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iOooo00O) {
                throw new o0O00oO0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                o0oo00o0.OooO0OO(i, o0O00000.f27078OooOo);
            } else {
                o0oo00o0.OooO0OO(i, o0O00000.OooOO0(bArr, iOooo00O, i5));
            }
            return iOooo00O + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new o0O00oO0("Protocol message contained an invalid tag (zero).");
            }
            o0oo00o0.OooO0OO(i, Integer.valueOf(OooOOO(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        o0OO00o0 o0oo00o0OooO0O0 = o0OO00o0.OooO0O0();
        int i7 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i7;
        if (i7 >= 100) {
            throw new o0O00oO0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iOooo00O2 = Oooo00O(bArr, i2, ez0Var);
            int i9 = ez0Var.f18711OooO00o;
            if (i9 == i6) {
                i8 = i9;
                i2 = iOooo00O2;
                break;
            }
            i2 = OooOooo(i9, bArr, iOooo00O2, i3, o0oo00o0OooO0O0, ez0Var);
            i8 = i9;
        }
        ez0Var.f18714OooO0Oo--;
        if (i2 > i3 || i8 != i6) {
            throw new o0O00oO0("Failed to parse the message.");
        }
        o0oo00o0.OooO0OO(i, o0oo00o0OooO0O0);
        return i2;
    }

    public static int Oooo0(int i, byte[] bArr, int i2, int i3, o0O00OOO o0o00ooo, ez0 ez0Var) {
        o0O00O0o o0o00o0o = (o0O00O0o) o0o00ooo;
        int iOooo00O = Oooo00O(bArr, i2, ez0Var);
        o0o00o0o.OooO0o(ez0Var.f18711OooO00o);
        while (iOooo00O < i3) {
            int iOooo00O2 = Oooo00O(bArr, iOooo00O, ez0Var);
            if (i != ez0Var.f18711OooO00o) {
                break;
            }
            iOooo00O = Oooo00O(bArr, iOooo00O2, ez0Var);
            o0o00o0o.OooO0o(ez0Var.f18711OooO00o);
        }
        return iOooo00O;
    }

    public static int Oooo00O(byte[] bArr, int i, ez0 ez0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return Oooo00o(b, bArr, i2, ez0Var);
        }
        ez0Var.f18711OooO00o = b;
        return i2;
    }

    public static int Oooo00o(int i, byte[] bArr, int i2, ez0 ez0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            ez0Var.f18711OooO00o = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ez0Var.f18711OooO00o = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ez0Var.f18711OooO00o = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ez0Var.f18711OooO00o = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ez0Var.f18711OooO00o = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int Oooo0O0(byte[] bArr, int i, ez0 ez0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ez0Var.f18712OooO0O0 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        ez0Var.f18712OooO0O0 = j2;
        return i3;
    }

    public static int Oooo0OO(Object obj, o0OO000o o0oo000o, byte[] bArr, int i, int i2, int i3, ez0 ez0Var) throws o0O00oO0 {
        o0O0o000 o0o0o000 = (o0O0o000) o0oo000o;
        int i4 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i4;
        if (i4 >= 100) {
            throw new o0O00oO0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iOooOOoo = o0o0o000.OooOOoo(obj, bArr, i, i2, i3, ez0Var);
        ez0Var.f18714OooO0Oo--;
        ez0Var.f18713OooO0OO = obj;
        return iOooOOoo;
    }

    public static long Oooo0o(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int Oooo0o0(Object obj, o0OO000o o0oo000o, byte[] bArr, int i, int i2, ez0 ez0Var) throws o0O00oO0 {
        int iOooo00o = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iOooo00o = Oooo00o(i3, bArr, iOooo00o, ez0Var);
            i3 = ez0Var.f18711OooO00o;
        }
        int i4 = iOooo00o;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new o0O00oO0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i5;
        if (i5 >= 100) {
            throw new o0O00oO0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        o0oo000o.OooO0Oo(obj, bArr, i4, i6, ez0Var);
        ez0Var.f18714OooO0Oo--;
        ez0Var.f18713OooO0OO = obj;
        return i6;
    }

    public abstract void OooO(oO000Oo oo000oo, oO000Oo oo000oo2);

    public abstract o000OOo0 OooO0Oo(o00O00O o00o00o);

    public abstract o00O00 OooOOOO(o00O00O o00o00o);

    public abstract void OooOOo(oO000Oo oo000oo, Thread thread);

    public abstract void OooOOoo(o00O00 o00o00, o00O00 o00o002);

    public abstract void OooOo0(o00O00 o00o00, Thread thread);

    public abstract boolean OooOo00(oO000o00 oo000o00, oo0ooO oo0ooo, oo0ooO oo0ooo2);

    public abstract boolean OooOo0O(oO000o00 oo000o00, Object obj, Object obj2);

    public abstract boolean OooOoO(o00O00O o00o00o, o000OOo0 o000ooo02, o000OOo0 o000ooo03);

    public abstract boolean OooOoOO(oO000o00 oo000o00, oO000Oo oo000oo, oO000Oo oo000oo2);

    public abstract boolean OooOooO(o00O00O o00o00o, Object obj, Object obj2);

    public abstract boolean Oooo000(o00O00O o00o00o, o00O00 o00o00, o00O00 o00o002);

    public String toString() {
        switch (this.f27088OooOo0O) {
            case 4:
                return ((o00O) this).f27037OooOo0o.toString();
            default:
                return super.toString();
        }
    }
}

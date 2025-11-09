package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.ironsource.InterfaceC3173h3;
import io.flutter.plugin.platform.PlatformPlugin;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class wz0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final C1591g3 f25459OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final C1591g3 f25460OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final C1591g3 f25461OooOoO;

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final C2250xy f25466OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final C2250xy f25467OooOooo;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final C2250xy f25471Oooo00O;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public static final C2250xy f25473Oooo0O0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public static final be0 f25480OoooO00;

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f25440OooO00o = {1, 2, 3, 6};

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f25441OooO0O0 = {48000, 44100, 32000};

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f25442OooO0OO = {24000, 22050, 16000};

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f25443OooO0Oo = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f25445OooO0o0 = {32, 40, 48, 56, 64, 80, 96, InterfaceC3173h3.d.b.f8827j, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f25444OooO0o = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f25446OooO0oO = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final int[] f25447OooO0oo = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: OooO, reason: collision with root package name */
    public static final int[] f25439OooO = {64, InterfaceC3173h3.d.b.f8827j, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final int[] f25448OooOO0 = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f25449OooOO0O = {5, 8, 10, 12};
    public static final int[] OooOO0o = {6, 9, 12, 15};

    /* renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f25451OooOOO0 = {2, 4, 6, 8};

    /* renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f25450OooOOO = {9, 11, 13, 16};

    /* renamed from: OooOOOO, reason: collision with root package name */
    public static final int[] f25452OooOOOO = {5, 8, 10, 12};

    /* renamed from: OooOOOo, reason: collision with root package name */
    public static final String[] f25453OooOOOo = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: OooOOo0, reason: collision with root package name */
    public static final String[] f25455OooOOo0 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: OooOOo, reason: collision with root package name */
    public static final String[] f25454OooOOo = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: OooOOoo, reason: collision with root package name */
    public static final int[] f25456OooOOoo = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: OooOo00, reason: collision with root package name */
    public static final oOo0o00 f25458OooOo00 = new oOo0o00("https://csi.gstatic.com/csi", "gads:sdk_csi_server", 4);
    public static final oOo0o00 OooOo0 = new oOo0o00("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", "gads:sdk_core_location", 4);

    /* renamed from: OooOo, reason: collision with root package name */
    public static final C1591g3 f25457OooOo = new C1591g3(12);

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final C1591g3 f25462OooOoO0 = new C1591g3(14);

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final C1591g3 f25463OooOoOO = new C1591g3(24);

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final C1591g3 f25465OooOoo0 = new C1591g3(26);

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final C1591g3 f25464OooOoo = new C1591g3(28);

    /* renamed from: Oooo000, reason: collision with root package name */
    public static final C2250xy f25470Oooo000 = new C2250xy(8);

    /* renamed from: Oooo00o, reason: collision with root package name */
    public static final C2250xy f25472Oooo00o = new C2250xy(12);

    /* renamed from: Oooo0, reason: collision with root package name */
    public static final C2250xy f25469Oooo0 = new C2250xy(14);

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public static final C2250xy f25474Oooo0OO = new C2250xy(18);

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public static final C2250xy f25476Oooo0o0 = new C2250xy(21);

    /* renamed from: Oooo0o, reason: collision with root package name */
    public static final C2250xy f25475Oooo0o = new C2250xy(24);

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public static final C2250xy f25477Oooo0oO = new C2250xy(29);

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public static final be0 f25478Oooo0oo = new be0(1);

    /* renamed from: Oooo, reason: collision with root package name */
    public static final be0 f25468Oooo = new be0(3);

    /* renamed from: OoooO0, reason: collision with root package name */
    public static final be0 f25479OoooO0 = new be0(7);

    static {
        int i = 10;
        int i2 = 5;
        int i3 = 16;
        int i4 = 4;
        f25459OooOo0O = new C1591g3(i4);
        f25460OooOo0o = new C1591g3(i);
        f25461OooOoO = new C1591g3(i3);
        f25466OooOooO = new C2250xy(i4);
        f25467OooOooo = new C2250xy(i2);
        f25471Oooo00O = new C2250xy(i);
        f25473Oooo0O0 = new C2250xy(i3);
        f25480OoooO00 = new be0(i2);
    }

    public static gn0 OooO00o(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (af0.Oooo00o(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strOooOO0o = af0.OooOO0o(xmlPullParser, strConcat2);
                String strOooOO0o2 = af0.OooOO0o(xmlPullParser, strConcat3);
                String strOooOO0o3 = af0.OooOO0o(xmlPullParser, strConcat4);
                String strOooOO0o4 = af0.OooOO0o(xmlPullParser, strConcat5);
                if (strOooOO0o == null || strOooOO0o2 == null) {
                    pm0 pm0Var = rm0.f23913OooOo0o;
                    return gn0.f19388OooOoO;
                }
                oo0oOO0 oo0ooo0 = new oo0oOO0(strOooOO0o, strOooOO0o3 != null ? Long.parseLong(strOooOO0o3) : 0L, strOooOO0o4 != null ? Long.parseLong(strOooOO0o4) : 0L);
                int length = objArrCopyOf.length;
                int i2 = i + 1;
                int iOooO0o = lm0.OooO0o(length, i2);
                if (iOooO0o > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
                }
                objArrCopyOf[i] = oo0ooo0;
                i = i2;
            }
        } while (!af0.OooOo(xmlPullParser, str.concat(":Directory")));
        return rm0.OooOOO(i, objArrCopyOf);
    }

    public static tz0 OooO0O0() {
        String str;
        ClassLoader classLoader = wz0.class.getClassLoader();
        if (tz0.class.equals(tz0.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!tz0.class.getPackage().equals(wz0.class.getPackage())) {
                throw new IllegalArgumentException(tz0.class.getName());
            }
            str = tz0.class.getPackage().getName() + ".BlazeGenerated" + tz0.class.getSimpleName() + "Loader";
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
                Iterator it = Arrays.asList(new wz0[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(rz0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(tz0.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (tz0) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (tz0) tz0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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

    public static o000OO0O OooO0OO(o00000OO o00000oo2, boolean z, boolean z2) {
        o000OO0O o000oo0o;
        long j;
        r40 r40Var;
        int i;
        int i2;
        int[] iArr;
        long jZzd = o00000oo2.zzd();
        long j2 = -1;
        long j3 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j3 = jZzd;
        }
        r40 r40Var2 = new r40(64);
        int i3 = (int) j3;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            r40Var2.OooO0oO(8);
            boolean z4 = true;
            if (!o00000oo2.OooO0o(r40Var2.f23745OooO00o, i4, 8, true)) {
                break;
            }
            long jOooOooO = r40Var2.OooOooO();
            int iOooOOo0 = r40Var2.OooOOo0();
            if (jOooOooO == 1) {
                j = j2;
                o00000oo2.OooOO0o(r40Var2.f23745OooO00o, 8, 8);
                i = 16;
                r40Var2.OooO(16);
                jOooOooO = r40Var2.OooOoo();
                r40Var = r40Var2;
            } else {
                j = j2;
                if (jOooOooO == 0) {
                    long jZzd2 = o00000oo2.zzd();
                    if (jZzd2 != j) {
                        jOooOooO = (jZzd2 - o00000oo2.zze()) + 8;
                    }
                }
                r40Var = r40Var2;
                i = 8;
            }
            long j4 = jOooOooO;
            o000oo0o = null;
            long j5 = i;
            if (j4 < j5) {
                return new o0O(18);
            }
            i5 += i;
            if (iOooOOo0 == 1836019574) {
                i3 += (int) j4;
                if (jZzd != -1 && i3 > jZzd) {
                    i3 = (int) jZzd;
                }
                r40Var2 = r40Var;
                j2 = j;
                i4 = 0;
            } else {
                if (iOooOOo0 == 1836019558 || iOooOOo0 == 1836475768) {
                    i4 = 1;
                    break;
                }
                z3 |= !(iOooOOo0 != 1835295092);
                long j6 = jZzd;
                if ((i5 + j4) - j5 >= i3) {
                    i4 = 0;
                    break;
                }
                int i6 = (int) (j4 - j5);
                i5 += i6;
                if (iOooOOo0 != 1718909296) {
                    i2 = 0;
                    if (i6 != 0) {
                        o00000oo2.OooO00o(i6);
                    }
                } else {
                    if (i6 < 8) {
                        return new o0O(18);
                    }
                    r40Var.OooO0oO(i6);
                    i2 = 0;
                    o00000oo2.OooOO0o(r40Var.f23745OooO00o, 0, i6);
                    boolean zOooO0Oo = OooO0Oo(r40Var.OooOOo0(), z2) | z3;
                    r40Var.OooOO0O(4);
                    int iOooOOOO = r40Var.OooOOOO() / 4;
                    if (!zOooO0Oo && iOooOOOO > 0) {
                        iArr = new int[iOooOOOO];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= iOooOOOO) {
                                z4 = zOooO0Oo;
                                break;
                            }
                            int iOooOOo02 = r40Var.OooOOo0();
                            iArr[i7] = iOooOOo02;
                            if (OooO0Oo(iOooOOo02, z2)) {
                                break;
                            }
                            i7++;
                        }
                    } else {
                        z4 = zOooO0Oo;
                        iArr = null;
                    }
                    if (!z4) {
                        o0O o0o = new o0O(19);
                        if (iArr != null) {
                            int length = Arrays.copyOf(iArr, iArr.length).length;
                        }
                        return o0o;
                    }
                    z3 = z4;
                }
                i4 = i2;
                r40Var2 = r40Var;
                j2 = j;
                jZzd = j6;
            }
        }
        o000oo0o = null;
        return !z3 ? o0O.f21855OooOoO0 : z != i4 ? i4 != 0 ? o0O.f21853OooOo0o : o0O.f21852OooOo : o000oo0o;
    }

    public static boolean OooO0Oo(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = f25456OooOOoo;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static int OooO0o(o000OOo0 o000ooo02, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && o000ooo02.OooOo0o(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return o000ooo02.OooO0o(iArr[i]) + i3;
    }

    public static int OooO0o0(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = f25441OooO0O0[i];
        if (i4 == 44100) {
            int i5 = f25444OooO0o[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f25445OooO0o0[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static o000OOo0 OooO0oO(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new o000OOo0(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        int length = bArrCopyOf.length;
        o000OOo0 o000ooo02 = new o000OOo0(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            o000OOo0 o000ooo03 = new o000OOo0(bArrCopyOf, length);
            while (o000ooo03.OooO00o() >= 16) {
                o000ooo03.OooOo0(2);
                int iOooO0o = o000ooo03.OooO0o(14);
                int iMin = Math.min(8 - o000ooo02.f21727OooO0Oo, 14);
                int i3 = o000ooo02.f21727OooO0Oo;
                int i4 = (8 - i3) - iMin;
                int i5 = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3;
                byte[] bArr2 = o000ooo02.f21725OooO0O0;
                int i6 = o000ooo02.f21726OooO0OO;
                byte b4 = (byte) ((i5 | ((1 << i4) - 1)) & bArr2[i6]);
                bArr2[i6] = b4;
                int i7 = 14 - iMin;
                int i8 = iOooO0o & 16383;
                bArr2[i6] = (byte) (b4 | ((i8 >>> i7) << i4));
                int i9 = i6 + 1;
                while (i7 > 8) {
                    i7 -= 8;
                    o000ooo02.f21725OooO0O0[i9] = (byte) (i8 >>> i7);
                    i9++;
                }
                byte[] bArr3 = o000ooo02.f21725OooO0O0;
                byte b5 = (byte) (bArr3[i9] & ((1 << r7) - 1));
                bArr3[i9] = b5;
                bArr3[i9] = (byte) (((i8 & ((1 << i7) - 1)) << (8 - i7)) | b5);
                o000ooo02.OooOo0(14);
                o000ooo02.OooOo();
            }
        }
        int length2 = bArrCopyOf.length;
        o000ooo02.f21725OooO0O0 = bArrCopyOf;
        o000ooo02.f21726OooO0OO = 0;
        o000ooo02.f21727OooO0Oo = 0;
        o000ooo02.f21728OooO0o0 = length2;
        return o000ooo02;
    }
}

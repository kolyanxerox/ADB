package Oooo0oO;

import OooOooo.o000O0Oo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import o000000.OooO;

/* loaded from: classes2.dex */
public final class o000000 {

    /* renamed from: OooO */
    public static int f13866OooO = -1;

    /* renamed from: OooO0o */
    public static Boolean f13870OooO0o;

    /* renamed from: OooO0oO */
    public static String f13872OooO0oO;

    /* renamed from: OooO0oo */
    public static boolean f13873OooO0oo;

    /* renamed from: OooOO0 */
    public static Boolean f13874OooOO0;

    /* renamed from: OooOOO */
    public static o0000 f13876OooOOO;

    /* renamed from: OooOOOO */
    public static o0000O00 f13878OooOOOO;

    /* renamed from: OooO00o */
    public final Context f13879OooO00o;

    /* renamed from: OooOO0O */
    public static final ThreadLocal f13875OooOO0O = new ThreadLocal();
    public static final o00000O OooOO0o = new o00000O(0);

    /* renamed from: OooOOO0 */
    public static final OooO f13877OooOOO0 = new OooO(6);

    /* renamed from: OooO0O0 */
    public static final o000OOoO.OooO f13867OooO0O0 = new o000OOoO.OooO(6);

    /* renamed from: OooO0OO */
    public static final OooO f13868OooO0OO = new OooO(7);

    /* renamed from: OooO0Oo */
    public static final o000OOoO.OooO f13869OooO0Oo = new o000OOoO.OooO(7);

    /* renamed from: OooO0o0 */
    public static final OooO f13871OooO0o0 = new OooO(8);

    public o000000(Context context) {
        this.f13879OooO00o = context;
    }

    public static int OooO00o(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Oooo00O.o000000O.OooOO0o(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #4 {all -> 0x0085, blocks: (B:159:0x004b, B:163:0x007f, B:170:0x008b, B:173:0x0091, B:176:0x00a5, B:254:0x020d, B:255:0x0217, B:258:0x021a, B:259:0x021b, B:260:0x0222, B:277:0x0283, B:278:0x0294, B:261:0x0223, B:263:0x0241, B:265:0x024f, B:275:0x027b, B:276:0x0282, B:279:0x0295, B:280:0x02c1), top: B:300:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Oooo0oO.o000000 OooO0OO(android.content.Context r22, Oooo0oO.o000OOo r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0oO.o000000.OooO0OO(android.content.Context, Oooo0oO.o000OOo, java.lang.String):Oooo0oO.o000000");
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x00af A[Catch: all -> 0x0037, TryCatch #8 {, blocks: (B:164:0x0027, B:166:0x0033, B:206:0x00b8, B:171:0x003c, B:173:0x0043, B:175:0x0049, B:180:0x004f, B:182:0x0053, B:185:0x005c, B:187:0x0064, B:190:0x006b, B:197:0x0097, B:198:0x009f, B:193:0x0072, B:195:0x0078, B:196:0x0089, B:201:0x00a2, B:204:0x00a5, B:205:0x00af, B:172:0x003f), top: B:296:0x0027, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0191 A[Catch: all -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00eb, blocks: (B:158:0x0002, B:218:0x00e0, B:220:0x00e6, B:227:0x010a, B:257:0x0191, B:265:0x01a4, B:283:0x0223, B:284:0x0226, B:278:0x021b, B:225:0x00ef, B:286:0x0228, B:159:0x0003, B:162:0x000a, B:163:0x0026, B:216:0x00dd, B:176:0x004a, B:199:0x00a0, B:202:0x00a3, B:209:0x00bb, B:217:0x00df, B:215:0x00c1), top: B:292:0x0002, inners: #5, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO0Oo(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0oO.o000000.OooO0Oo(android.content.Context, java.lang.String, boolean):int");
    }

    public static void OooO0o(ClassLoader classLoader) throws o0OO00O {
        try {
            o0000O00 o0000o00 = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof o0000O00) {
                    o0000o00 = (o0000O00) iInterfaceQueryLocalInterface;
                } else {
                    try {
                        o0000o00 = new o0000O00(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 0);
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new o0OO00O("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        throw new o0OO00O("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        throw new o0OO00O("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        throw new o0OO00O("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f13878OooOOOO = o0000o00;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            e = e5;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0137 A[PHI: r12
  0x0137: PHI (r12v10 boolean) = (r12v6 boolean), (r12v14 boolean) binds: [B:196:0x00ee, B:221:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO0o0(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0oO.o000000.OooO0o0(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static boolean OooO0oO(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f13874OooOO0)) {
            return true;
        }
        boolean z = false;
        if (f13874OooOO0 == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (o000O0Oo.f13671OooO0O0.OooO0OO(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f13874OooOO0 = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f13873OooO0oo = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static o0000 OooO0oo(Context context) {
        o0000 o0000Var;
        synchronized (o000000.class) {
            o0000 o0000Var2 = f13876OooOOO;
            if (o0000Var2 != null) {
                return o0000Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    o0000Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    o0000Var = iInterfaceQueryLocalInterface instanceof o0000 ? (o0000) iInterfaceQueryLocalInterface : new o0000(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 0);
                }
                if (o0000Var != null) {
                    f13876OooOOO = o0000Var;
                    return o0000Var;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    public final IBinder OooO0O0(String str) {
        try {
            return (IBinder) this.f13879OooO00o.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new o0OO00O("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }
}

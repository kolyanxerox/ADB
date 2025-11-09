package o0oOO;

import OooOOo.OooOOO;
import OoooOOO.C0001o0;
import com.google.android.gms.internal.ads.C1727jt;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import o00Oo.o0OoOo0;
import o00OoO00.OooO;
import o00OoO00.OooOO0;
import o00OoO00.OooOO0O;
import o00OoO00.OooOOO0;

/* loaded from: classes3.dex */
public abstract class OooO0o {

    /* renamed from: OooO00o */
    public static volatile int f32999OooO00o;

    /* renamed from: OooO0O0 */
    public static final o00OoO00.OooO0o f33000OooO0O0 = new o00OoO00.OooO0o(1);

    /* renamed from: OooO0OO */
    public static final o00OoO00.OooO0o f33001OooO0OO = new o00OoO00.OooO0o(0);

    /* renamed from: OooO0Oo */
    public static final boolean f33002OooO0Oo;

    /* renamed from: OooO0o */
    public static final String[] f33003OooO0o;

    /* renamed from: OooO0o0 */
    public static volatile o00OoO00.OooO0o f33004OooO0o0;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f33002OooO0Oo = property == null ? false : property.equalsIgnoreCase(C3401a.f9920g);
        f33003OooO0o = new String[]{C3451ne.f10482i0};
    }

    public static ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = OooO0o.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        o00OoO00.OooO0o oooO0o = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = OooO.f32685OooO00o;
                if (OooOOO.OooO0O0(2) >= OooOOO.OooO0O0(OooO.f32686OooO0O0)) {
                    OooO.OooO0O0().println("SLF4J(I): " + str);
                }
                oooO0o = (o00OoO00.OooO0o) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                OooO.OooO00o("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                OooO.OooO00o("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                OooO.OooO00o("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                OooO.OooO00o("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                OooO.OooO00o("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                OooO.OooO00o("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (oooO0o != null) {
            arrayList.add(oooO0o);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(o00OoO00.OooO0o.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: o0oOO.OooO0OO
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(o00OoO00.OooO0o.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((o00OoO00.OooO0o) it.next());
            } catch (ServiceConfigurationError e7) {
                String str2 = "A service provider failed to instantiate:\n" + e7.getMessage();
                OooO.OooO0O0().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    public static OooO0O0 OooO0O0(Class cls) {
        int i;
        OooO0O0 oooO0O0OooO0OO = OooO0OO(cls.getName());
        if (f33002OooO0Oo) {
            OooOO0O oooOO0O = OooOOO0.f32697OooO00o;
            Class cls2 = null;
            if (oooOO0O == null) {
                if (OooOOO0.f32698OooO0O0) {
                    oooOO0O = null;
                } else {
                    try {
                        oooOO0O = new OooOO0O();
                    } catch (SecurityException unused) {
                        oooOO0O = null;
                    }
                    OooOOO0.f32697OooO00o = oooOO0O;
                    OooOOO0.f32698OooO0O0 = true;
                }
            }
            if (oooOO0O != null) {
                Class[] classContext = oooOO0O.getClassContext();
                String name = OooOOO0.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                OooO.OooO0OO("Detected logger name mismatch. Given name: \"" + oooO0O0OooO0OO.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                OooO.OooO0OO("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return oooO0O0OooO0OO;
    }

    public static OooO0O0 OooO0OO(String str) {
        o00OoO00.OooO0o oooO0o;
        OooO00o oooO00o;
        if (f32999OooO00o == 0) {
            synchronized (OooO0o.class) {
                try {
                    if (f32999OooO00o == 0) {
                        f32999OooO00o = 1;
                        OooO0Oo();
                    }
                } finally {
                }
            }
        }
        int i = f32999OooO00o;
        if (i == 1) {
            oooO0o = f33000OooO0O0;
        } else {
            if (i == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                oooO0o = f33004OooO0o0;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                oooO0o = f33001OooO0OO;
            }
        }
        switch (oooO0o.f32688OooO00o) {
            case 0:
                oooO00o = (C0001o0) oooO0o.f32689OooO0O0;
                break;
            default:
                oooO00o = (C1727jt) oooO0o.f32689OooO0O0;
                break;
        }
        return oooO00o.OooO0OO(str);
    }

    public static final void OooO0Oo() {
        try {
            ArrayList arrayListOooO00o = OooO00o();
            OooO0oo(arrayListOooO00o);
            if (arrayListOooO00o.isEmpty()) {
                f32999OooO00o = 4;
                OooO.OooO0OO("No SLF4J providers were found.");
                OooO.OooO0OO("Defaulting to no-operation (NOP) logger implementation");
                OooO.OooO0OO("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = OooO0o.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    OooO.OooO00o("Error getting resources from path", e);
                }
                OooO0oO(linkedHashSet);
            } else {
                f33004OooO0o0 = (o00OoO00.OooO0o) arrayListOooO00o.get(0);
                f33004OooO0o0.getClass();
                f33004OooO0o0.getClass();
                f32999OooO00o = 3;
                OooO0o(arrayListOooO00o);
            }
            OooO0o0();
            if (f32999OooO00o == 3) {
                try {
                    switch (f33004OooO0o0.f32688OooO00o) {
                        case 0:
                            boolean z = false;
                            for (String str : f33003OooO0o) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            OooO.OooO0OO("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f33003OooO0o).toString());
                            OooO.OooO0OO("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    OooO.OooO00o("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f32999OooO00o = 2;
            OooO.OooO00o("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    public static void OooO0o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + C3034d9.i.f8179e;
            int i = OooO.f32685OooO00o;
            if (OooOOO.OooO0O0(2) >= OooOOO.OooO0O0(OooO.f32686OooO0O0)) {
                OooO.OooO0O0().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((o00OoO00.OooO0o) arrayList.get(0)).getClass().getName() + C3034d9.i.f8179e;
        int i2 = OooO.f32685OooO00o;
        if (OooOOO.OooO0O0(1) >= OooOOO.OooO0O0(OooO.f32686OooO0O0)) {
            OooO.OooO0O0().println("SLF4J(D): " + str2);
        }
    }

    public static void OooO0o0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o00OoO00.OooO0o oooO0o = f33000OooO0O0;
        synchronized (oooO0o) {
            try {
                ((C1727jt) oooO0o.f32689OooO0O0).f20385OooOo0O = true;
                C1727jt c1727jt = (C1727jt) oooO0o.f32689OooO0O0;
                c1727jt.getClass();
                ArrayList arrayList = new ArrayList(((ConcurrentHashMap) c1727jt.f20386OooOo0o).values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    OooOO0 oooOO0 = (OooOO0) obj;
                    oooOO0.f32692OooOo0o = OooO0OO(oooOO0.f32691OooOo0O);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) ((C1727jt) f33000OooO0O0.f32689OooO0O0).f20384OooOo;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                o0OoOo0 o0oooo0 = (o0OoOo0) obj2;
                if (o0oooo0 != null) {
                    OooOO0 oooOO02 = o0oooo0.f32654OooO0O0;
                    String str = oooOO02.f32691OooOo0O;
                    if (oooOO02.f32692OooOo0o == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(oooOO02.f32692OooOo0o instanceof o00OoO00.OooO0OO)) {
                        if (!oooOO02.OooOoo0()) {
                            OooO.OooO0OO(str);
                        } else if (oooOO02.OooOoO0(o0oooo0.f32653OooO00o) && oooOO02.OooOoo0()) {
                            try {
                                oooOO02.f32694OooOoO0.invoke(oooOO02.f32692OooOo0o, o0oooo0);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (o0oooo0.f32654OooO0O0.OooOoo0()) {
                        OooO.OooO0OO("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        OooO.OooO0OO("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        OooO.OooO0OO("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(o0oooo0.f32654OooO0O0.f32692OooOo0o instanceof o00OoO00.OooO0OO)) {
                        OooO.OooO0OO("The following set of substitute loggers may have been accessed");
                        OooO.OooO0OO("during the initialization phase. Logging calls during this");
                        OooO.OooO0OO("phase were not honored. However, subsequent logging calls to these");
                        OooO.OooO0OO("loggers will work as normally expected.");
                        OooO.OooO0OO("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        C1727jt c1727jt2 = (C1727jt) f33000OooO0O0.f32689OooO0O0;
        ((ConcurrentHashMap) c1727jt2.f20386OooOo0o).clear();
        ((LinkedBlockingQueue) c1727jt2.f20384OooOo).clear();
    }

    public static void OooO0oO(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        OooO.OooO0OO("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            OooO.OooO0OO("Ignoring binding found at [" + ((URL) it.next()) + C3034d9.i.f8179e);
        }
        OooO.OooO0OO("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void OooO0oo(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            OooO.OooO0OO("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                OooO.OooO0OO("Found provider [" + ((o00OoO00.OooO0o) obj) + C3034d9.i.f8179e);
            }
            OooO.OooO0OO("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}

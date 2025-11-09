package o00000oo;

import OooOOo.OooOOO;
import OoooOOO.C0001o0;
import com.google.crypto.tink.shaded.protobuf.OooO00o;
import com.google.crypto.tink.shaded.protobuf.OooOO0O;
import com.google.crypto.tink.shaded.protobuf.o000OOo;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import o0000OOo.o00O00;
import o0000OOo.o00O00OO;
import o0000OOo.o00OO0OO;
import o0000OOo.oOO00O;
import o000OO.OooO;
import o000OO.OooO0o;
import o000OO.OooOOO0;

/* loaded from: classes2.dex */
public abstract class o0OOO0o {

    /* renamed from: OooO00o */
    public static final AtomicReference f29297OooO00o;

    /* renamed from: OooO0O0 */
    public static final ConcurrentHashMap f29298OooO0O0;

    /* renamed from: OooO0OO */
    public static final ConcurrentHashMap f29299OooO0OO;

    /* renamed from: OooO0Oo */
    public static final ConcurrentHashMap f29300OooO0Oo;

    static {
        Logger.getLogger(o0OOO0o.class.getName());
        f29297OooO00o = new AtomicReference(new Oooo0());
        f29298OooO0O0 = new ConcurrentHashMap();
        f29299OooO0OO = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f29300OooO0Oo = new ConcurrentHashMap();
    }

    public static synchronized void OooO00o(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = f29299OooO0OO;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z) {
            if (((Oooo0) f29297OooO00o.get()).f29286OooO00o.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f29300OooO0Oo.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f29300OooO0Oo.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object OooO0O0(OooOo00 oooOo00, Class cls) {
        o000OO.o000oOoO o000oooo2 = (o000OO.o000oOoO) OooOOO0.f30168OooO0O0.f30169OooO00o.get();
        o000oooo2.getClass();
        o000OO.Oooo0 oooo0 = new o000OO.Oooo0(oooOo00.getClass(), cls);
        HashMap map = o000oooo2.f30176OooO00o;
        if (map.containsKey(oooo0)) {
            return ((o000OO.OooOo) map.get(oooo0)).f30172OooO0O0.OooO0O0(oooOo00);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + oooo0 + " available");
    }

    public static Object OooO0OO(String str, com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, Class cls) {
        Oooo0 oooo0 = (Oooo0) f29297OooO00o.get();
        oooo0.getClass();
        Oooo000 oooo000OooO00o = oooo0.OooO00o(str);
        boolean zContains = oooo000OooO00o.f29287OooO00o.f30156OooO0O0.keySet().contains(cls);
        OooO oooO = oooo000OooO00o.f29287OooO00o;
        if (!zContains) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(oooO.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet = oooO.f30156OooO0O0.keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!oooO.f30156OooO0O0.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + oooO.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                OooO00o oooO00oOooO0o = oooO.OooO0o(oooOOO0);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                oooO.OooO0oO(oooO00oOooO0o);
                return oooO.OooO0OO(oooO00oOooO0o, cls);
            } catch (o000OOo e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(oooO.f30155OooO00o.getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public static synchronized o00O00 OooO0Oo(o00O00OO o00o00oo) {
        o000oOoO o000oooo2;
        OooO oooO = ((Oooo0) f29297OooO00o.get()).OooO00o(o00o00oo.OooOoOO()).f29287OooO00o;
        o000oooo2 = new o000oOoO(oooO, oooO.f30157OooO0OO);
        if (!((Boolean) f29299OooO0OO.get(o00o00oo.OooOoOO())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + o00o00oo.OooOoOO());
        }
        return o000oooo2.OooO0o0(o00o00oo.OooOoo0());
    }

    public static void OooO0o(String str, Map map) {
        o00OO0OO o00oo0oo;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f29300OooO0Oo;
            String str2 = (String) entry.getKey();
            byte[] bArrOooO0Oo = ((OooO0o) entry.getValue()).f30161OooO00o.OooO0Oo();
            int i = ((OooO0o) entry.getValue()).f30162OooO0O0;
            oOO00O ooo00oOooOoo = o00O00OO.OooOoo();
            ooo00oOooOoo.OooO0Oo();
            o00O00OO.OooOo0O((o00O00OO) ooo00oOooOoo.f28132OooOo0o, str);
            OooOO0O oooOO0OOooO0oO = com.google.crypto.tink.shaded.protobuf.OooOOO0.OooO0oO(bArrOooO0Oo, 0, bArrOooO0Oo.length);
            ooo00oOooOoo.OooO0Oo();
            o00O00OO.OooOo0o((o00O00OO) ooo00oOooOoo.f28132OooOo0o, oooOO0OOooO0oO);
            int iOooO0O0 = OooOOO.OooO0O0(i);
            if (iOooO0O0 == 0) {
                o00oo0oo = o00OO0OO.TINK;
            } else if (iOooO0O0 == 1) {
                o00oo0oo = o00OO0OO.LEGACY;
            } else if (iOooO0O0 == 2) {
                o00oo0oo = o00OO0OO.RAW;
            } else {
                if (iOooO0O0 != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                o00oo0oo = o00OO0OO.CRUNCHY;
            }
            ooo00oOooOoo.OooO0Oo();
            o00O00OO.OooOo((o00O00OO) ooo00oOooOoo.f28132OooOo0o, o00oo0oo);
            concurrentHashMap.put(str2, new o0OoOo0((o00O00OO) ooo00oOooOoo.OooO00o()));
        }
    }

    public static synchronized void OooO0o0(OooO oooO, boolean z) {
        try {
            AtomicReference atomicReference = f29297OooO00o;
            Oooo0 oooo0 = new Oooo0((Oooo0) atomicReference.get());
            oooo0.OooO0O0(oooO);
            String strOooO0O0 = oooO.OooO0O0();
            OooO00o(strOooO0O0, z ? oooO.OooO0Oo().OooO0oo() : Collections.EMPTY_MAP, z);
            if (!((Oooo0) atomicReference.get()).f29286OooO00o.containsKey(strOooO0O0)) {
                f29298OooO0O0.put(strOooO0O0, new C0001o0(11));
                if (z) {
                    OooO0o(strOooO0O0, oooO.OooO0Oo().OooO0oo());
                }
            }
            f29299OooO0OO.put(strOooO0O0, Boolean.valueOf(z));
            atomicReference.set(oooo0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void OooO0oO(o0ooOOo o0ooooo) {
        OooOOO0 oooOOO0 = OooOOO0.f30168OooO0O0;
        synchronized (oooOOO0) {
            OooO0oO.OooOOO0 oooOOO02 = new OooO0oO.OooOOO0((o000OO.o000oOoO) oooOOO0.f30169OooO00o.get());
            oooOOO02.OooO0oo(o0ooooo);
            oooOOO0.f30169OooO00o.set(new o000OO.o000oOoO(oooOOO02));
        }
    }
}

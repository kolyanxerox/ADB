package o0000O0;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import o0000OOo.o00OO0OO;
import o0000OoO.o00OOO0O;
import o000OO.OooOOOO;
import o000OO.OooOo00;
import o000OO.o00oO0o;

/* loaded from: classes2.dex */
public abstract class OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOo00 f29360OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOOOO f29361OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO.OooO0OO f29362OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO.OooO00o f29363OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final Map f29364OooO0o0;

    static {
        o00OOO0O o00ooo0oOooO0O0 = o00oO0o.OooO0O0("type.googleapis.com/google.crypto.tink.AesSivKey");
        f29360OooO00o = new OooOo00(OooO0OO.class);
        f29361OooO0O0 = new OooOOOO(o00ooo0oOooO0O0);
        f29362OooO0OO = new o000OO.OooO0OO(OooO00o.class);
        f29363OooO0Oo = new o000OO.OooO00o(o00ooo0oOooO0O0, new o0000O.OooOo00(2));
        HashMap map = new HashMap();
        OooO0O0 oooO0O0 = OooO0O0.f29356OooO0Oo;
        o00OO0OO o00oo0oo = o00OO0OO.RAW;
        map.put(oooO0O0, o00oo0oo);
        OooO0O0 oooO0O02 = OooO0O0.f29354OooO0O0;
        o00OO0OO o00oo0oo2 = o00OO0OO.TINK;
        map.put(oooO0O02, o00oo0oo2);
        OooO0O0 oooO0O03 = OooO0O0.f29355OooO0OO;
        o00OO0OO o00oo0oo3 = o00OO0OO.CRUNCHY;
        map.put(oooO0O03, o00oo0oo3);
        Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(o00OO0OO.class);
        enumMap.put((EnumMap) o00oo0oo, (o00OO0OO) oooO0O0);
        enumMap.put((EnumMap) o00oo0oo2, (o00OO0OO) oooO0O02);
        enumMap.put((EnumMap) o00oo0oo3, (o00OO0OO) oooO0O03);
        enumMap.put((EnumMap) o00OO0OO.LEGACY, (o00OO0OO) oooO0O03);
        f29364OooO0o0 = Collections.unmodifiableMap(enumMap);
    }
}

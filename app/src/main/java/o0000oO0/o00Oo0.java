package o0000oo0;

import OoooO0O.o0000O0O;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o00OoO00.OooOOO0;

/* loaded from: classes2.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29670OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Set f29671OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Set f29672OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29673OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o00oO0o f29674OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f29675OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Set f29676OooO0oO;

    public o00Oo0(String str, Set set, Set set2, int i, int i2, o00oO0o o00oo0o, Set set3) {
        this.f29670OooO00o = str;
        this.f29671OooO0O0 = Collections.unmodifiableSet(set);
        this.f29672OooO0OO = Collections.unmodifiableSet(set2);
        this.f29673OooO0Oo = i;
        this.f29675OooO0o0 = i2;
        this.f29674OooO0o = o00oo0o;
        this.f29676OooO0oO = Collections.unmodifiableSet(set3);
    }

    public static o0000O0O OooO00o(Class cls) {
        return new o0000O0O(cls, new Class[0]);
    }

    public static o0000O0O OooO0O0(o00000OO o00000oo2) {
        o00000OO[] o00000ooArr = new o00000OO[0];
        o0000O0O o0000o0o2 = new o0000O0O();
        o0000o0o2.f13931OooO00o = null;
        HashSet hashSet = new HashSet();
        o0000o0o2.f13932OooO0O0 = hashSet;
        o0000o0o2.f13933OooO0OO = new HashSet();
        o0000o0o2.f13934OooO0Oo = 0;
        o0000o0o2.f13936OooO0o0 = 0;
        o0000o0o2.f13937OooO0oO = new HashSet();
        hashSet.add(o00000oo2);
        for (o00000OO o00000oo3 : o00000ooArr) {
            OooOOO0.OooO0o0(o00000oo3, "Null interface");
        }
        Collections.addAll((HashSet) o0000o0o2.f13932OooO0O0, o00000ooArr);
        return o0000o0o2;
    }

    public static o00Oo0 OooO0OO(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o00000OO.OooO00o(cls));
        for (Class cls2 : clsArr) {
            OooOOO0.OooO0o0(cls2, "Null interface");
            hashSet.add(o00000OO.OooO00o(cls2));
        }
        return new o00Oo0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new OooO0oo.o00Oo0(obj, 20), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f29671OooO0O0.toArray()) + ">{" + this.f29673OooO0Oo + ", type=" + this.f29675OooO0o0 + ", deps=" + Arrays.toString(this.f29672OooO0OO.toArray()) + "}";
    }
}

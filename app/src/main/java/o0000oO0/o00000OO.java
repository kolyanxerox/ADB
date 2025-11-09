package o0000oo0;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public final class o00000OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f29664OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Class f29665OooO0O0;

    public o00000OO(Class cls, Class cls2) {
        this.f29664OooO00o = cls;
        this.f29665OooO0O0 = cls2;
    }

    public static o00000OO OooO00o(Class cls) {
        return new o00000OO(o00000O.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00000OO.class != obj.getClass()) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) obj;
        if (this.f29665OooO0O0.equals(o00000oo2.f29665OooO0O0)) {
            return this.f29664OooO00o.equals(o00000oo2.f29664OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29664OooO00o.hashCode() + (this.f29665OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f29665OooO0O0;
        Class cls2 = this.f29664OooO00o;
        if (cls2 == o00000O.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + StringUtils.SPACE + cls.getName();
    }
}

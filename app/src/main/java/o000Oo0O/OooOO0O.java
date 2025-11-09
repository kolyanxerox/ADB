package o000OO0o;

import java.util.Date;
import java.util.HashMap;
import o0OoO0o.o00O0O;

/* loaded from: classes2.dex */
public final class OooOO0O implements o00O0O {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final OooO f30220OooO0o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO f30222OooO0oO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f30224OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f30225OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f30226OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f30227OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0o f30221OooO0o0 = new OooO0o(0);

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final OooOO0 f30223OooO0oo = new OooOO0();

    /* JADX WARN: Type inference failed for: r0v1, types: [o000OO0o.OooO] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o000OO0o.OooO] */
    static {
        final int i = 0;
        f30220OooO0o = new o000OO00.OooOO0() { // from class: o000OO0o.OooO
            @Override // o000OO00.OooO00o
            public final void OooO00o(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((o000OO00.OooOO0O) obj2).OooO00o((String) obj);
                        break;
                    default:
                        ((o000OO00.OooOO0O) obj2).OooO0oO(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f30222OooO0oO = new o000OO00.OooOO0() { // from class: o000OO0o.OooO
            @Override // o000OO00.OooO00o
            public final void OooO00o(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((o000OO00.OooOO0O) obj2).OooO00o((String) obj);
                        break;
                    default:
                        ((o000OO00.OooOO0O) obj2).OooO0oO(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public OooOO0O() {
        HashMap map = new HashMap();
        this.f30224OooO00o = map;
        HashMap map2 = new HashMap();
        this.f30225OooO0O0 = map2;
        this.f30226OooO0OO = f30221OooO0o0;
        this.f30227OooO0Oo = false;
        map2.put(String.class, f30220OooO0o);
        map.remove(String.class);
        map2.put(Boolean.class, f30222OooO0oO);
        map.remove(Boolean.class);
        map2.put(Date.class, f30223OooO0oo);
        map.remove(Date.class);
    }

    public final o00O0O OooO00o(Class cls, o000OO00.OooO0o oooO0o) {
        this.f30224OooO00o.put(cls, oooO0o);
        this.f30225OooO0O0.remove(cls);
        return this;
    }
}

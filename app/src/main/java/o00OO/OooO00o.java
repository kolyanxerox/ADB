package o00OO;

import o00O0.o000OOo;
import o00O0oO.o0000;

/* loaded from: classes3.dex */
public abstract class OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final int f31857OooO00o;

    static {
        Object objOooO0O0;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.OooOo.OooO0Oo(property, "getProperty(...)");
            objOooO0O0 = o0000.OooOoOO(property);
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if (objOooO0O0 instanceof oo00o.OooOO0O) {
            objOooO0O0 = null;
        }
        Integer num = (Integer) objOooO0O0;
        f31857OooO00o = num != null ? num.intValue() : 2097152;
    }
}

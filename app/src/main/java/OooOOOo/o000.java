package OooOoOO;

import OooO0oO.OooOo;
import OooOOO.OooO0OO;
import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class o000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final SparseArray f13650OooO00o = new SparseArray();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f13651OooO0O0;

    static {
        HashMap map = new HashMap();
        f13651OooO0O0 = map;
        map.put(OooO0OO.f13317OooOo0O, 0);
        map.put(OooO0OO.f13318OooOo0o, 1);
        map.put(OooO0OO.f13316OooOo, 2);
        for (OooO0OO oooO0OO : map.keySet()) {
            f13650OooO00o.append(((Integer) f13651OooO0O0.get(oooO0OO)).intValue(), oooO0OO);
        }
    }

    public static int OooO00o(OooO0OO oooO0OO) {
        Integer num = (Integer) f13651OooO0O0.get(oooO0OO);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + oooO0OO);
    }

    public static OooO0OO OooO0O0(int i) {
        OooO0OO oooO0OO = (OooO0OO) f13650OooO00o.get(i);
        if (oooO0OO != null) {
            return oooO0OO;
        }
        throw new IllegalArgumentException(OooOo.OooO0o(i, "Unknown Priority for value "));
    }
}

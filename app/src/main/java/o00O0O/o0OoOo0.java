package o00O0o;

import Oooo0o0.OooO;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000o00o.o000OO;
import o000o00o.o0Oo0oo;

/* loaded from: classes3.dex */
public abstract class o0OoOo0 extends o00O0O {
    public static Oooo000 Oooo0(Iterator it) {
        kotlin.jvm.internal.OooOo.OooO0o0(it, "<this>");
        return new OooOO0(new o00O0.o00Oo0(it, 3));
    }

    public static OooOo00 Oooo0O0(Oooo000 oooo000, o00O0Oo.Oooo000 predicate) {
        kotlin.jvm.internal.OooOo.OooO0o0(predicate, "predicate");
        return new OooOo00(oooo000, true, predicate);
    }

    public static Object Oooo0OO(OooOo00 oooOo00) {
        o00O0Oo0.o0OoOo0 o0oooo0 = new o00O0Oo0.o0OoOo0(oooOo00);
        if (o0oooo0.hasNext()) {
            return o0oooo0.next();
        }
        return null;
    }

    public static String Oooo0o(Oooo000 oooo000, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(oooo000, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : oooo000) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            OooO.OooO0Oo(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Oooo000 Oooo0o0(o00O0Oo.Oooo000 nextFunction, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(nextFunction, "nextFunction");
        return obj == null ? OooOOOO.f31411OooO00o : new o00O0Oo0.o00Oo0(new o000OO(obj, 2), nextFunction);
    }

    public static OooOo00 Oooo0oO(Oooo000 oooo000, o00O0Oo.Oooo000 transform) {
        kotlin.jvm.internal.OooOo.OooO0o0(transform, "transform");
        return new OooOo00(new o00O0Oo0.o00Oo0(oooo000, transform, 4), false, new o0Oo0oo(1));
    }

    public static List Oooo0oo(Oooo000 oooo000) {
        Iterator it = oooo000.iterator();
        if (!it.hasNext()) {
            return o00O0.oo000o.f31251OooOo0O;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return o0OO0O0.OooOO0o(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

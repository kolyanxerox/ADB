package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.adqualitysdk.sdk.p009i.C2847hp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cs */
/* loaded from: classes2.dex */
public final class C2715cs extends C2722cz {
    /* renamed from: ﻐ */
    public static Field m6387(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM6459 = C2722cz.m6459(list, 0, Object.class);
            return C2849hr.m6916().m6918().m6889(objM6459.getClass(), (Class) C2722cz.m6459(list, 1, Class.class));
        }
        Class cls = (Class) C2722cz.m6459(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return C2849hr.m6916().m6918().m6889(cls, (Class) C2722cz.m6459(list, 1, Class.class));
        }
        return C2849hr.m6916().m6918().m6890(cls, (C2847hp) C2722cz.m6459(list, 1, C2847hp.class));
    }

    /* renamed from: ﻛ */
    public static List<Field> m6388(List<Object> list) throws SecurityException {
        if (!(list.get(0) instanceof Class)) {
            Object objM6459 = C2722cz.m6459(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) C2722cz.m6459(list, 1, Boolean.class)).booleanValue() : false;
            C2849hr.m6916().m6918();
            Field[] fieldArrM6888 = C2846ho.m6888(objM6459.getClass(), zBooleanValue, -1, null);
            if (fieldArrM6888 != null) {
                return Arrays.asList(fieldArrM6888);
            }
        } else if (list.size() > 1) {
            return C2849hr.m6916().m6918().m6892((Class) C2722cz.m6459(list, 0, Class.class), (C2847hp) C2722cz.m6459(list, 1, C2847hp.class));
        }
        return new ArrayList();
    }

    /* renamed from: ｋ */
    public static Field m6389(List<Object> list) {
        return C2849hr.m6916().m6918().m6890((Class) C2722cz.m6459(list, 0, Class.class), (C2847hp) C2722cz.m6459(list, 1, C2847hp.class));
    }

    /* renamed from: ﾒ */
    public static Field m6390(List<Object> list) {
        return C2849hr.m6916().m6918().m6891((Class) C2722cz.m6459(list, 0, Class.class), (String) C2722cz.m6459(list, 1, String.class));
    }

    /* renamed from: ﻐ */
    public static C2847hp.e m6386() {
        C2849hr.m6916().m6918();
        return C2846ho.m6886();
    }
}

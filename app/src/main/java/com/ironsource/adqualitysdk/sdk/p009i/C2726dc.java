package com.ironsource.adqualitysdk.sdk.p009i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dc */
/* loaded from: classes2.dex */
public final class C2726dc extends C2722cz {
    /* renamed from: ﻏ */
    public static String m6477(List<Object> list) {
        return C2916kd.m7448((String) C2722cz.m6459(list, 0, String.class));
    }

    /* renamed from: ﻐ */
    public static String m6478(List<Object> list) {
        String str = (String) C2722cz.m6459(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) C2722cz.m6459(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? C2916kd.m7457(str, (String) C2722cz.m6459(list, 1, String.class), zBooleanValue) : C2916kd.m7458(str, new JSONArray((Collection) C2722cz.m6459(list, 1, List.class)), zBooleanValue);
    }

    /* renamed from: ﻛ */
    public static boolean m6479(List<Object> list) {
        return C2916kd.m7454((String) C2722cz.m6459(list, 0, String.class));
    }

    /* renamed from: ｋ */
    public static List<String> m6480(List<Object> list) {
        String str = (String) C2722cz.m6459(list, 0, String.class);
        return list.get(1) instanceof String ? C2916kd.m7449(str, (String) C2722cz.m6459(list, 1, String.class)) : C2916kd.m7459(str, new JSONArray((Collection) C2722cz.m6459(list, 1, List.class)));
    }

    /* renamed from: ﾇ */
    public static List<String> m6481(List<Object> list) {
        return C2849hr.m6916().m6919().m6990(C2722cz.m6459(list, 0, Object.class), (List<String>) C2722cz.m6459(list, 1, List.class), ((Integer) C2722cz.m6459(list, 2, Integer.class)).intValue());
    }

    /* renamed from: ﾒ */
    public static int m6482(List<Object> list) {
        return C2916kd.m7455((String) C2722cz.m6459(list, 0, String.class), (String) C2722cz.m6459(list, 1, String.class));
    }
}

package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.wk */
/* loaded from: classes2.dex */
public class C3806wk {
    /* renamed from: a */
    public static Map<String, Object> m12899a(Object[][] objArr) {
        HashMap map = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
            }
        }
        return map;
    }
}

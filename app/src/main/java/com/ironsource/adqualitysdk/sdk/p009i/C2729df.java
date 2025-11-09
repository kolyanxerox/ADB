package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.adqualitysdk.sdk.p009i.C2709cm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.df */
/* loaded from: classes2.dex */
public final class C2729df extends C2722cz {
    /* renamed from: ﻐ */
    public static C2709cm.a m6488(List<Object> list) {
        return new C2709cm.a((List) C2722cz.m6459(list, 0, List.class), ((Integer) C2722cz.m6459(list, 1, Integer.class)).intValue());
    }

    /* renamed from: ﻛ */
    public static Object m6489(List<Object> list) {
        Object objM6459;
        Class<?> cls;
        C2847hp c2847hp;
        Object objM64592;
        C2847hp c2847hp2;
        Object objM64593;
        int size = list.size();
        Object objM64594 = null;
        Class<?> cls2 = null;
        if (size != 2) {
            if (size == 3) {
                if (list.get(0) instanceof Class) {
                    cls = (Class) C2722cz.m6459(list, 0, Class.class);
                    if (list.get(1) instanceof C2847hp) {
                        c2847hp2 = (C2847hp) C2722cz.m6459(list, 1, C2847hp.class);
                        objM64593 = C2722cz.m6459(list, 2, Object.class);
                    } else {
                        objM6459 = C2722cz.m6459(list, 1, Object.class);
                        c2847hp = (C2847hp) C2722cz.m6459(list, 2, C2847hp.class);
                    }
                } else {
                    objM64594 = C2722cz.m6459(list, 0, Object.class);
                    cls = objM64594.getClass();
                    c2847hp2 = (C2847hp) C2722cz.m6459(list, 1, C2847hp.class);
                    objM64593 = C2722cz.m6459(list, 2, Object.class);
                }
                Class<?> cls3 = cls;
                objM64592 = objM64593;
                c2847hp = c2847hp2;
                objM6459 = objM64594;
                cls2 = cls3;
            } else if (size != 4) {
                c2847hp = null;
                objM64592 = null;
                objM6459 = null;
            } else {
                cls2 = (Class) C2722cz.m6459(list, 0, Class.class);
                Object objM64595 = C2722cz.m6459(list, 1, Object.class);
                C2847hp c2847hp3 = (C2847hp) C2722cz.m6459(list, 2, C2847hp.class);
                objM64592 = C2722cz.m6459(list, 3, Object.class);
                c2847hp = c2847hp3;
                objM6459 = objM64595;
            }
            C2849hr.m6916().m6919();
            return C2854hw.m6983(cls2, objM6459, c2847hp, objM64592);
        }
        if (list.get(0) instanceof Class) {
            cls = (Class) C2722cz.m6459(list, 0, Class.class);
            objM6459 = null;
        } else {
            Object objM64596 = C2722cz.m6459(list, 0, Object.class);
            if (objM64596 != null) {
                objM6459 = objM64596;
                cls = objM64596.getClass();
            } else {
                objM6459 = objM64596;
                cls = null;
            }
        }
        c2847hp = (C2847hp) C2722cz.m6459(list, 1, C2847hp.class);
        cls2 = cls;
        objM64592 = null;
        C2849hr.m6916().m6919();
        return C2854hw.m6983(cls2, objM6459, c2847hp, objM64592);
    }

    /* renamed from: ﾇ */
    public static List<Object> m6490(List<Object> list) {
        Object objM6459;
        C2847hp c2847hp;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object objM64592 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) C2722cz.m6459(list, 0, Class.class);
                objM6459 = null;
            } else {
                objM6459 = C2722cz.m6459(list, 0, Object.class);
                if (objM6459 != null) {
                    cls2 = objM6459.getClass();
                }
            }
            c2847hp = (C2847hp) C2722cz.m6459(list, 1, C2847hp.class);
        } else if (size != 3) {
            c2847hp = null;
            objM6459 = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) C2722cz.m6459(list, 0, Class.class);
                if (list.get(1) instanceof C2847hp) {
                    c2847hp = (C2847hp) C2722cz.m6459(list, 1, C2847hp.class);
                } else {
                    objM64592 = C2722cz.m6459(list, 1, Object.class);
                    c2847hp = (C2847hp) C2722cz.m6459(list, 2, C2847hp.class);
                }
            } else {
                objM64592 = C2722cz.m6459(list, 0, Object.class);
                cls = objM64592.getClass();
                c2847hp = (C2847hp) C2722cz.m6459(list, 1, C2847hp.class);
            }
            Object obj = objM64592;
            cls2 = cls;
            objM6459 = obj;
        }
        C2849hr.m6916().m6919();
        return C2854hw.m6976(cls2, objM6459, c2847hp);
    }

    /* renamed from: ﾒ */
    public final <T> InterfaceC2851ht<T> m6495(final C2741dr c2741dr, final C2712cp c2712cp, List<Object> list) {
        Object objM6459 = C2722cz.m6459(list, 0, Object.class);
        final C2709cm c2709cm = (C2709cm) C2722cz.m6459(list, 1, C2709cm.class);
        final List<Object> listM6460 = C2722cz.m6460(list, 2);
        if (c2709cm == null) {
            return null;
        }
        return C2849hr.m6916().m6919().m6989(objM6459, c2709cm.m6205(new InterfaceC2856hy() { // from class: com.ironsource.adqualitysdk.sdk.i.df.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
            /* renamed from: ﾇ */
            public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
                return c2709cm.m6204().m6234(interfaceC2851ht, c2741dr, c2712cp, listM6460);
            }
        }));
    }

    /* renamed from: ﻐ */
    public final List<Object> m6492(C2741dr c2741dr, C2712cp c2712cp, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2851ht interfaceC2851ht : m6493(c2741dr, c2712cp, list)) {
            if (interfaceC2851ht != null) {
                arrayList.add(interfaceC2851ht.mo6934());
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ */
    public static String m6491(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return C2849hr.m6916().m6919().m6988((Class) C2722cz.m6459(list, 0, Class.class), (String) C2722cz.m6459(list, 1, String.class));
        }
        Object objM6459 = C2722cz.m6459(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return C2849hr.m6916().m6919().m6986(objM6459, new JSONArray((Collection) C2722cz.m6459(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return C2849hr.m6916().m6919().m6986(objM6459, (JSONArray) C2722cz.m6459(list, 1, JSONArray.class));
        }
        return C2849hr.m6916().m6919().m6991(objM6459, (String) C2722cz.m6459(list, 1, String.class));
    }

    /* renamed from: ﾇ */
    public final Object m6494(C2741dr c2741dr, C2712cp c2712cp, List<Object> list) {
        InterfaceC2851ht interfaceC2851htM6495 = m6495(c2741dr, c2712cp, list);
        if (interfaceC2851htM6495 != null) {
            return interfaceC2851htM6495.mo6934();
        }
        return null;
    }

    /* renamed from: ﻛ */
    public final List<InterfaceC2851ht> m6493(final C2741dr c2741dr, final C2712cp c2712cp, List<Object> list) {
        Object objM6459 = C2722cz.m6459(list, 0, Object.class);
        final C2709cm c2709cm = (C2709cm) C2722cz.m6459(list, 1, C2709cm.class);
        final List<Object> listM6460 = C2722cz.m6460(list, 2);
        if (c2709cm == null) {
            return null;
        }
        return C2849hr.m6916().m6919().m6992(objM6459, c2709cm.m6205(new InterfaceC2856hy() { // from class: com.ironsource.adqualitysdk.sdk.i.df.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
            /* renamed from: ﾇ */
            public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
                return c2709cm.m6204().m6234(interfaceC2851ht, c2741dr, c2712cp, listM6460);
            }
        }));
    }
}

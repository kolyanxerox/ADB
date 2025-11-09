package com.ironsource;

import java.util.HashMap;

/* renamed from: com.ironsource.l0 */
/* loaded from: classes2.dex */
public final class C3309l0 {

    /* renamed from: a */
    public static final C3309l0 f9291a = new C3309l0();

    /* renamed from: b */
    private static final HashMap<String, Long> f9292b = new HashMap<>();

    private C3309l0() {
    }

    /* renamed from: a */
    public final HashMap<String, Long> m9726a() {
        return f9292b;
    }

    /* renamed from: b */
    public final long m9729b(String instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        Long l = f9292b.get(instance);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    /* renamed from: c */
    public final long m9730c(String instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        Long l = f9292b.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* renamed from: a */
    public final boolean m9727a(String instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        HashMap<String, Long> map = f9292b;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }

    /* renamed from: a */
    public final boolean m9728a(String instance, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f9292b;
        if (map.containsKey(instance)) {
            return false;
        }
        map.put(instance, Long.valueOf(j));
        return true;
    }
}

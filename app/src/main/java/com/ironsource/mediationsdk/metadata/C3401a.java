package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.metadata.a */
/* loaded from: classes2.dex */
public class C3401a {

    /* renamed from: a */
    public static final String f9914a = "do_not_sell";

    /* renamed from: b */
    public static final String f9915b = "is_child_directed";

    /* renamed from: c */
    public static final String f9916c = "is_deviceid_optout";

    /* renamed from: d */
    public static final String f9917d = "google_family_self_certified_sdks";

    /* renamed from: e */
    public static final String f9918e = "iiqf";

    /* renamed from: f */
    public static final String f9919f = "is_test_suite";

    /* renamed from: g */
    public static final String f9920g = "true";

    /* renamed from: h */
    protected static final String f9921h = "false";

    /* renamed from: i */
    public static final String f9922i = "google_water_mark";

    /* renamed from: j */
    public static final String f9923j = "enable";

    /* renamed from: k */
    static final Set<String> f9924k;

    /* renamed from: l */
    static final Set<String> f9925l;

    /* renamed from: m */
    static final Set<String> f9926m;

    /* renamed from: n */
    public static final int f9927n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f9915b, f9916c, f9919f, f9917d, f9918e));
        f9924k = hashSet;
        f9925l = new HashSet(Arrays.asList(f9916c, f9917d, f9919f, f9918e));
        HashSet hashSet2 = new HashSet(hashSet);
        f9926m = hashSet2;
        hashSet2.add(f9914a);
    }
}

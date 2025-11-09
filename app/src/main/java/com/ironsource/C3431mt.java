package com.ironsource;

import java.util.List;

/* renamed from: com.ironsource.mt */
/* loaded from: classes2.dex */
public final class C3431mt {

    /* renamed from: a */
    private final String f10327a;

    /* renamed from: b */
    private final List<String> f10328b;

    /* renamed from: c */
    private final boolean f10329c;

    public C3431mt(String str, List<String> list, boolean z) {
        this.f10327a = str;
        this.f10328b = list;
        this.f10329c = z;
    }

    /* renamed from: a */
    public final boolean m10887a() {
        if (this.f10329c) {
            List<String> list = this.f10328b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f10327a;
                    if (str2 != null && o00O0oO.o0000O00.Oooo0OO(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<String> list2 = this.f10328b;
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                String str4 = this.f10327a;
                if (str4 != null && o00O0oO.o000000.Oooo0o(str3, str4)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final String m10888b() {
        return this.f10327a;
    }

    public /* synthetic */ C3431mt(String str, List list, boolean z, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}

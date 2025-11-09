package com.ironsource;

import java.util.Map;

/* renamed from: com.ironsource.i4 */
/* loaded from: classes2.dex */
public final class C3209i4 {

    /* renamed from: a */
    private final Map<String, String> f8972a;

    public C3209i4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3209i4 m9252a(C3209i4 c3209i4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c3209i4.f8972a;
        }
        return c3209i4.m9253a(map);
    }

    /* renamed from: b */
    public final Map<String, String> m9255b() {
        return this.f8972a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3209i4) && kotlin.jvm.internal.OooOo.OooO00o(this.f8972a, ((C3209i4) obj).f8972a);
    }

    public int hashCode() {
        return this.f8972a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f8972a + ')';
    }

    public C3209i4(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.OooOo.OooO0o0(mediationTypes, "mediationTypes");
        this.f8972a = mediationTypes;
    }

    /* renamed from: a */
    public final C3209i4 m9253a(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.OooOo.OooO0o0(mediationTypes, "mediationTypes");
        return new C3209i4(mediationTypes);
    }

    public /* synthetic */ C3209i4(Map map, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? o00O0.o00oO0o.f31247OooOo0O : map);
    }

    /* renamed from: a */
    public final Map<String, String> m9254a() {
        return this.f8972a;
    }
}

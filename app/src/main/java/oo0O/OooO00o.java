package oo0O;

import o000O00.o00O0O0O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OooO00o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final OooO00o f33199OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ OooO00o[] f33200OooOo0o;

    static {
        OooO00o oooO00o = new OooO00o("NONE", 0);
        OooO00o oooO00o2 = new OooO00o("ALL_JSON_OBJECTS", 1);
        OooO00o oooO00o3 = new OooO00o("POLYMORPHIC", 2);
        f33199OooOo0O = oooO00o3;
        OooO00o[] oooO00oArr = {oooO00o, oooO00o2, oooO00o3};
        f33200OooOo0o = oooO00oArr;
        o00O0O0O.OooOOo(oooO00oArr);
    }

    public static OooO00o valueOf(String str) {
        return (OooO00o) Enum.valueOf(OooO00o.class, str);
    }

    public static OooO00o[] values() {
        return (OooO00o[]) f33200OooOo0o.clone();
    }
}

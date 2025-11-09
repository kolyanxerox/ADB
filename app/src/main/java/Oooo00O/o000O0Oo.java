package oooo00o;

import o000O00.o00O0O0O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o000O0Oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ o000O0Oo[] f33306OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o000O0Oo f33307OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o000O0Oo f33308OooOo0o;

    static {
        o000O0Oo o000o0oo2 = new o000O0Oo("CRASHLYTICS", 0);
        f33307OooOo0O = o000o0oo2;
        o000O0Oo o000o0oo3 = new o000O0Oo("PERFORMANCE", 1);
        f33308OooOo0o = o000o0oo3;
        o000O0Oo[] o000o0ooArr = {o000o0oo2, o000o0oo3, new o000O0Oo("MATT_SAYS_HI", 2)};
        f33306OooOo = o000o0ooArr;
        o00O0O0O.OooOOo(o000o0ooArr);
    }

    public static o000O0Oo valueOf(String str) {
        return (o000O0Oo) Enum.valueOf(o000O0Oo.class, str);
    }

    public static o000O0Oo[] values() {
        return (o000O0Oo[]) f33306OooOo.clone();
    }
}

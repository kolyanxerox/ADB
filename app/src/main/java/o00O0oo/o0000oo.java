package o00O0oo;

import o000O00.o00O0O0O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o0000oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o0000oo f31601OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o0000oo f31602OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o0000oo f31603OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ o0000oo[] f31604OooOoO0;

    static {
        o0000oo o0000ooVar = new o0000oo("SUSPEND", 0);
        f31602OooOo0O = o0000ooVar;
        o0000oo o0000ooVar2 = new o0000oo("DROP_OLDEST", 1);
        f31603OooOo0o = o0000ooVar2;
        o0000oo o0000ooVar3 = new o0000oo("DROP_LATEST", 2);
        f31601OooOo = o0000ooVar3;
        o0000oo[] o0000ooVarArr = {o0000ooVar, o0000ooVar2, o0000ooVar3};
        f31604OooOoO0 = o0000ooVarArr;
        o00O0O0O.OooOOo(o0000ooVarArr);
    }

    public static o0000oo valueOf(String str) {
        return (o0000oo) Enum.valueOf(o0000oo.class, str);
    }

    public static o0000oo[] values() {
        return (o0000oo[]) f31604OooOoO0.clone();
    }
}

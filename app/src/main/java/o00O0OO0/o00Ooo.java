package o00O0Oo0;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class o00Ooo extends Enum {

    /* renamed from: OooOo0O */
    public static final o00Ooo f31394OooOo0O;

    /* renamed from: OooOo0o */
    public static final /* synthetic */ o00Ooo[] f31395OooOo0o;

    static {
        o00Ooo o00ooo2 = new o00Ooo("TOP_DOWN", 0);
        f31394OooOo0O = o00ooo2;
        o00Ooo[] o00oooArr = {o00ooo2, new o00Ooo("BOTTOM_UP", 1)};
        f31395OooOo0o = o00oooArr;
        o00O0O0O.OooOOo(o00oooArr);
    }

    public static o00Ooo valueOf(String str) {
        return (o00Ooo) Enum.valueOf(o00Ooo.class, str);
    }

    public static o00Ooo[] values() {
        return (o00Ooo[]) f31395OooOo0o.clone();
    }
}

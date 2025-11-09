package o00O0O0o;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class OooOo00 extends Enum {

    /* renamed from: OooOo */
    public static final OooOo00 f31364OooOo;

    /* renamed from: OooOo0O */
    public static final OooOo00 f31365OooOo0O;

    /* renamed from: OooOo0o */
    public static final OooOo00 f31366OooOo0o;

    /* renamed from: OooOoO0 */
    public static final /* synthetic */ OooOo00[] f31367OooOoO0;

    static {
        OooOo00 oooOo00 = new OooOo00("COROUTINE_SUSPENDED", 0);
        f31365OooOo0O = oooOo00;
        OooOo00 oooOo002 = new OooOo00("UNDECIDED", 1);
        f31366OooOo0o = oooOo002;
        OooOo00 oooOo003 = new OooOo00("RESUMED", 2);
        f31364OooOo = oooOo003;
        OooOo00[] oooOo00Arr = {oooOo00, oooOo002, oooOo003};
        f31367OooOoO0 = oooOo00Arr;
        o00O0O0O.OooOOo(oooOo00Arr);
    }

    public static OooOo00 valueOf(String str) {
        return (OooOo00) Enum.valueOf(OooOo00.class, str);
    }

    public static OooOo00[] values() {
        return (OooOo00[]) f31367OooOoO0.clone();
    }
}

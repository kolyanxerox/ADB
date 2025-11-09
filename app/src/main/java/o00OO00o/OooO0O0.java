package o00OO00o;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class OooO0O0 extends Enum {

    /* renamed from: OooOo */
    public static final OooO0O0 f31982OooOo;

    /* renamed from: OooOo0O */
    public static final OooO0O0 f31983OooOo0O;

    /* renamed from: OooOo0o */
    public static final OooO0O0 f31984OooOo0o;

    /* renamed from: OooOoO */
    public static final OooO0O0 f31985OooOoO;

    /* renamed from: OooOoO0 */
    public static final OooO0O0 f31986OooOoO0;

    /* renamed from: OooOoOO */
    public static final /* synthetic */ OooO0O0[] f31987OooOoOO;

    static {
        OooO0O0 oooO0O0 = new OooO0O0("CPU_ACQUIRED", 0);
        f31983OooOo0O = oooO0O0;
        OooO0O0 oooO0O02 = new OooO0O0("BLOCKING", 1);
        f31984OooOo0o = oooO0O02;
        OooO0O0 oooO0O03 = new OooO0O0("PARKING", 2);
        f31982OooOo = oooO0O03;
        OooO0O0 oooO0O04 = new OooO0O0("DORMANT", 3);
        f31986OooOoO0 = oooO0O04;
        OooO0O0 oooO0O05 = new OooO0O0("TERMINATED", 4);
        f31985OooOoO = oooO0O05;
        OooO0O0[] oooO0O0Arr = {oooO0O0, oooO0O02, oooO0O03, oooO0O04, oooO0O05};
        f31987OooOoOO = oooO0O0Arr;
        o00O0O0O.OooOOo(oooO0O0Arr);
    }

    public static OooO0O0 valueOf(String str) {
        return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
    }

    public static OooO0O0[] values() {
        return (OooO0O0[]) f31987OooOoOO.clone();
    }
}

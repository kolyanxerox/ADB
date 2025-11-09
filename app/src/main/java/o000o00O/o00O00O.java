package o000o00o;

/* loaded from: classes2.dex */
public final class o00O00O extends Enum {

    /* renamed from: OooOo */
    public static final /* synthetic */ o00O00O[] f30838OooOo;

    /* renamed from: OooOo0O */
    public static final o00O00O f30839OooOo0O;

    /* renamed from: OooOo0o */
    public static final o00O00O f30840OooOo0o;

    static {
        o00O00O o00o00o = new o00O00O("GENERAL", 0);
        f30839OooOo0O = o00o00o;
        o00O00O o00o00o2 = new o00O00O("FALLBACK", 1);
        f30840OooOo0o = o00o00o2;
        o00O00O[] o00o00oArr = {o00o00o, o00o00o2};
        f30838OooOo = o00o00oArr;
        o000O00.o00O0O0O.OooOOo(o00o00oArr);
    }

    public static o00O00O valueOf(String str) {
        return (o00O00O) Enum.valueOf(o00O00O.class, str);
    }

    public static o00O00O[] values() {
        return (o00O00O[]) f30838OooOo.clone();
    }
}

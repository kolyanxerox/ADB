package o00O0oOo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o0000O {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o0000O f31489OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o0000O f31490OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o0000O f31491OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ o0000O[] f31492OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final o0000O f31493OooOoO0;

    static {
        o0000O o0000o2 = new o0000O("DEFAULT", 0);
        f31490OooOo0O = o0000o2;
        o0000O o0000o3 = new o0000O("LAZY", 1);
        f31491OooOo0o = o0000o3;
        o0000O o0000o4 = new o0000O("ATOMIC", 2);
        f31489OooOo = o0000o4;
        o0000O o0000o5 = new o0000O("UNDISPATCHED", 3);
        f31493OooOoO0 = o0000o5;
        o0000O[] o0000oArr = {o0000o2, o0000o3, o0000o4, o0000o5};
        f31492OooOoO = o0000oArr;
        o000O00.o00O0O0O.OooOOo(o0000oArr);
    }

    public static o0000O valueOf(String str) {
        return (o0000O) Enum.valueOf(o0000O.class, str);
    }

    public static o0000O[] values() {
        return (o0000O[]) f31492OooOoO.clone();
    }
}

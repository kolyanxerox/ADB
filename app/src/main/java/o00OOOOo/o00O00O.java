package o00OOooO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o00O00O {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ o00O00O[] f32642OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o00O00O f32643OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o00O00O f32644OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    o00O00O EF0;

    static {
        o00O00O o00o00o = new o00O00O("CR", 0);
        o00O00O o00o00o2 = new o00O00O("CRLF", 1);
        f32643OooOo0O = o00o00o2;
        o00O00O o00o00o3 = new o00O00O("LF", 2);
        f32644OooOo0o = o00o00o3;
        f32642OooOo = new o00O00O[]{o00o00o, o00o00o2, o00o00o3};
    }

    public static o00O00O valueOf(String str) {
        return (o00O00O) Enum.valueOf(o00O00O.class, str);
    }

    public static o00O00O[] values() {
        return (o00O00O[]) f32642OooOo.clone();
    }
}

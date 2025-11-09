package OooOOOo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o000OOo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o000OOo f13394OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ o000OOo[] f13395OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    o000OOo EF0;

    static {
        o000OOo o000ooo2 = new o000OOo("UNKNOWN", 0);
        o000OOo o000ooo3 = new o000OOo("ANDROID_FIREBASE", 1);
        f13394OooOo0O = o000ooo3;
        f13395OooOo0o = new o000OOo[]{o000ooo2, o000ooo3};
    }

    public static o000OOo valueOf(String str) {
        return (o000OOo) Enum.valueOf(o000OOo.class, str);
    }

    public static o000OOo[] values() {
        return (o000OOo[]) f13395OooOo0o.clone();
    }
}

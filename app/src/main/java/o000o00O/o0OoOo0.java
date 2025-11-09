package o000o00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o0OoOo0 implements o000OO0o.OooOOO {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o0OoOo0 f30881OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o0OoOo0 f30882OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ o0OoOo0[] f30883OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final o0OoOo0 f30884OooOoO0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f30885OooOo0O;

    static {
        o0OoOo0 o0oooo0 = new o0OoOo0("COLLECTION_UNKNOWN", 0, 0);
        o0OoOo0 o0oooo02 = new o0OoOo0("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        f30882OooOo0o = o0oooo02;
        o0OoOo0 o0oooo03 = new o0OoOo0("COLLECTION_ENABLED", 2, 2);
        f30881OooOo = o0oooo03;
        o0OoOo0 o0oooo04 = new o0OoOo0("COLLECTION_DISABLED", 3, 3);
        f30884OooOoO0 = o0oooo04;
        o0OoOo0[] o0oooo0Arr = {o0oooo0, o0oooo02, o0oooo03, o0oooo04, new o0OoOo0("COLLECTION_DISABLED_REMOTE", 4, 4), new o0OoOo0("COLLECTION_SAMPLED", 5, 5)};
        f30883OooOoO = o0oooo0Arr;
        o000O00.o00O0O0O.OooOOo(o0oooo0Arr);
    }

    public o0OoOo0(String str, int i, int i2) {
        this.f30885OooOo0O = i2;
    }

    public static o0OoOo0 valueOf(String str) {
        return (o0OoOo0) Enum.valueOf(o0OoOo0.class, str);
    }

    public static o0OoOo0[] values() {
        return (o0OoOo0[]) f30883OooOoO.clone();
    }

    @Override // o000OO0o.OooOOO
    public final int getNumber() {
        return this.f30885OooOo0O;
    }
}

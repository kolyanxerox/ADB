package OooOOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final OooO0OO f13316OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final OooO0OO f13317OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0OO f13318OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ OooO0OO[] f13319OooOoO0;

    static {
        OooO0OO oooO0OO = new OooO0OO("DEFAULT", 0);
        f13317OooOo0O = oooO0OO;
        OooO0OO oooO0OO2 = new OooO0OO("VERY_LOW", 1);
        f13318OooOo0o = oooO0OO2;
        OooO0OO oooO0OO3 = new OooO0OO("HIGHEST", 2);
        f13316OooOo = oooO0OO3;
        f13319OooOoO0 = new OooO0OO[]{oooO0OO, oooO0OO2, oooO0OO3};
    }

    public static OooO0OO valueOf(String str) {
        return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
    }

    public static OooO0OO[] values() {
        return (OooO0OO[]) f13319OooOoO0.clone();
    }
}

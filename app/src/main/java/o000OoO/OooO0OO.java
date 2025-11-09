package o000OOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final OooO0OO f30245OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ OooO0OO[] f30246OooOo0o;

    static {
        OooO0OO oooO0OO = new OooO0OO("DEFAULT", 0);
        f30245OooOo0O = oooO0OO;
        f30246OooOo0o = new OooO0OO[]{oooO0OO, new OooO0OO("SIGNED", 1), new OooO0OO("FIXED", 2)};
    }

    public static OooO0OO valueOf(String str) {
        return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
    }

    public static OooO0OO[] values() {
        return (OooO0OO[]) f30246OooOo0o.clone();
    }
}

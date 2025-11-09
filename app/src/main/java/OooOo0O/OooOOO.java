package OooOo0o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OooOOO {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final OooOOO f13612OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final OooOOO f13613OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOO f13614OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ OooOOO[] f13615OooOoO0;

    static {
        OooOOO oooOOO = new OooOOO("NETWORK_UNMETERED", 0);
        f13613OooOo0O = oooOOO;
        OooOOO oooOOO2 = new OooOOO("DEVICE_IDLE", 1);
        f13614OooOo0o = oooOOO2;
        OooOOO oooOOO3 = new OooOOO("DEVICE_CHARGING", 2);
        f13612OooOo = oooOOO3;
        f13615OooOoO0 = new OooOOO[]{oooOOO, oooOOO2, oooOOO3};
    }

    public static OooOOO valueOf(String str) {
        return (OooOOO) Enum.valueOf(OooOOO.class, str);
    }

    public static OooOOO[] values() {
        return (OooOOO[]) f13615OooOoO0.clone();
    }
}

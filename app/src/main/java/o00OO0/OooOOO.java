package o00OO0;

import o000O00.o00O0O0O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OooOOO {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final OooOOO f31911OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final OooOOO f31912OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOO f31913OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ OooOOO[] f31914OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final OooOOO f31915OooOoO0;

    static {
        OooOOO oooOOO = new OooOOO("SUCCESSFUL", 0);
        f31912OooOo0O = oooOOO;
        OooOOO oooOOO2 = new OooOOO("REREGISTER", 1);
        f31913OooOo0o = oooOOO2;
        OooOOO oooOOO3 = new OooOOO("CANCELLED", 2);
        f31911OooOo = oooOOO3;
        OooOOO oooOOO4 = new OooOOO("ALREADY_SELECTED", 3);
        f31915OooOoO0 = oooOOO4;
        OooOOO[] oooOOOArr = {oooOOO, oooOOO2, oooOOO3, oooOOO4};
        f31914OooOoO = oooOOOArr;
        o00O0O0O.OooOOo(oooOOOArr);
    }

    public static OooOOO valueOf(String str) {
        return (OooOOO) Enum.valueOf(OooOOO.class, str);
    }

    public static OooOOO[] values() {
        return (OooOOO[]) f31914OooOoO.clone();
    }
}

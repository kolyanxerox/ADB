package OooOOOo;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o0000O00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final SparseArray f13388OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ o0000O00[] f13389OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    o0000O00 EF1;

    static {
        o0000O00 o0000o00 = new o0000O00("UNKNOWN_MOBILE_SUBTYPE", 0);
        o0000O00 o0000o002 = new o0000O00("GPRS", 1);
        o0000O00 o0000o003 = new o0000O00("EDGE", 2);
        o0000O00 o0000o004 = new o0000O00("UMTS", 3);
        o0000O00 o0000o005 = new o0000O00("CDMA", 4);
        o0000O00 o0000o006 = new o0000O00("EVDO_0", 5);
        o0000O00 o0000o007 = new o0000O00("EVDO_A", 6);
        o0000O00 o0000o008 = new o0000O00("RTT", 7);
        o0000O00 o0000o009 = new o0000O00("HSDPA", 8);
        o0000O00 o0000o0010 = new o0000O00("HSUPA", 9);
        o0000O00 o0000o0011 = new o0000O00("HSPA", 10);
        o0000O00 o0000o0012 = new o0000O00("IDEN", 11);
        o0000O00 o0000o0013 = new o0000O00("EVDO_B", 12);
        o0000O00 o0000o0014 = new o0000O00("LTE", 13);
        o0000O00 o0000o0015 = new o0000O00("EHRPD", 14);
        o0000O00 o0000o0016 = new o0000O00("HSPAP", 15);
        o0000O00 o0000o0017 = new o0000O00("GSM", 16);
        o0000O00 o0000o0018 = new o0000O00("TD_SCDMA", 17);
        o0000O00 o0000o0019 = new o0000O00("IWLAN", 18);
        o0000O00 o0000o0020 = new o0000O00("LTE_CA", 19);
        f13389OooOo0o = new o0000O00[]{o0000o00, o0000o002, o0000o003, o0000o004, o0000o005, o0000o006, o0000o007, o0000o008, o0000o009, o0000o0010, o0000o0011, o0000o0012, o0000o0013, o0000o0014, o0000o0015, o0000o0016, o0000o0017, o0000o0018, o0000o0019, o0000o0020, new o0000O00("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f13388OooOo0O = sparseArray;
        sparseArray.put(0, o0000o00);
        sparseArray.put(1, o0000o002);
        sparseArray.put(2, o0000o003);
        sparseArray.put(3, o0000o004);
        sparseArray.put(4, o0000o005);
        sparseArray.put(5, o0000o006);
        sparseArray.put(6, o0000o007);
        sparseArray.put(7, o0000o008);
        sparseArray.put(8, o0000o009);
        sparseArray.put(9, o0000o0010);
        sparseArray.put(10, o0000o0011);
        sparseArray.put(11, o0000o0012);
        sparseArray.put(12, o0000o0013);
        sparseArray.put(13, o0000o0014);
        sparseArray.put(14, o0000o0015);
        sparseArray.put(15, o0000o0016);
        sparseArray.put(16, o0000o0017);
        sparseArray.put(17, o0000o0018);
        sparseArray.put(18, o0000o0019);
        sparseArray.put(19, o0000o0020);
    }

    public static o0000O00 valueOf(String str) {
        return (o0000O00) Enum.valueOf(o0000O00.class, str);
    }

    public static o0000O00[] values() {
        return (o0000O00[]) f13389OooOo0o.clone();
    }
}

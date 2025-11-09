package OooOOOo;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o0000oo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final SparseArray f13392OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ o0000oo[] f13393OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    o0000oo EF1;

    static {
        o0000oo o0000ooVar = new o0000oo("MOBILE", 0);
        o0000oo o0000ooVar2 = new o0000oo("WIFI", 1);
        o0000oo o0000ooVar3 = new o0000oo("MOBILE_MMS", 2);
        o0000oo o0000ooVar4 = new o0000oo("MOBILE_SUPL", 3);
        o0000oo o0000ooVar5 = new o0000oo("MOBILE_DUN", 4);
        o0000oo o0000ooVar6 = new o0000oo("MOBILE_HIPRI", 5);
        o0000oo o0000ooVar7 = new o0000oo("WIMAX", 6);
        o0000oo o0000ooVar8 = new o0000oo("BLUETOOTH", 7);
        o0000oo o0000ooVar9 = new o0000oo("DUMMY", 8);
        o0000oo o0000ooVar10 = new o0000oo("ETHERNET", 9);
        o0000oo o0000ooVar11 = new o0000oo("MOBILE_FOTA", 10);
        o0000oo o0000ooVar12 = new o0000oo("MOBILE_IMS", 11);
        o0000oo o0000ooVar13 = new o0000oo("MOBILE_CBS", 12);
        o0000oo o0000ooVar14 = new o0000oo("WIFI_P2P", 13);
        o0000oo o0000ooVar15 = new o0000oo("MOBILE_IA", 14);
        o0000oo o0000ooVar16 = new o0000oo("MOBILE_EMERGENCY", 15);
        o0000oo o0000ooVar17 = new o0000oo("PROXY", 16);
        o0000oo o0000ooVar18 = new o0000oo("VPN", 17);
        o0000oo o0000ooVar19 = new o0000oo("NONE", 18);
        f13393OooOo0o = new o0000oo[]{o0000ooVar, o0000ooVar2, o0000ooVar3, o0000ooVar4, o0000ooVar5, o0000ooVar6, o0000ooVar7, o0000ooVar8, o0000ooVar9, o0000ooVar10, o0000ooVar11, o0000ooVar12, o0000ooVar13, o0000ooVar14, o0000ooVar15, o0000ooVar16, o0000ooVar17, o0000ooVar18, o0000ooVar19};
        SparseArray sparseArray = new SparseArray();
        f13392OooOo0O = sparseArray;
        sparseArray.put(0, o0000ooVar);
        sparseArray.put(1, o0000ooVar2);
        sparseArray.put(2, o0000ooVar3);
        sparseArray.put(3, o0000ooVar4);
        sparseArray.put(4, o0000ooVar5);
        sparseArray.put(5, o0000ooVar6);
        sparseArray.put(6, o0000ooVar7);
        sparseArray.put(7, o0000ooVar8);
        sparseArray.put(8, o0000ooVar9);
        sparseArray.put(9, o0000ooVar10);
        sparseArray.put(10, o0000ooVar11);
        sparseArray.put(11, o0000ooVar12);
        sparseArray.put(12, o0000ooVar13);
        sparseArray.put(13, o0000ooVar14);
        sparseArray.put(14, o0000ooVar15);
        sparseArray.put(15, o0000ooVar16);
        sparseArray.put(16, o0000ooVar17);
        sparseArray.put(17, o0000ooVar18);
        sparseArray.put(-1, o0000ooVar19);
    }

    public static o0000oo valueOf(String str) {
        return (o0000oo) Enum.valueOf(o0000oo.class, str);
    }

    public static o0000oo[] values() {
        return (o0000oo[]) f13393OooOo0o.clone();
    }
}

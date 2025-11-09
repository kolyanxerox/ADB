package OooOOOo;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o000000O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o000000O f13386OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ o000000O[] f13387OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    o000000O EF0;

    static {
        o000000O o000000o2 = new o000000O("NOT_SET", 0);
        o000000O o000000o3 = new o000000O("EVENT_OVERRIDE", 1);
        f13386OooOo0O = o000000o3;
        f13387OooOo0o = new o000000O[]{o000000o2, o000000o3};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, o000000o2);
        sparseArray.put(5, o000000o3);
    }

    public static o000000O valueOf(String str) {
        return (o000000O) Enum.valueOf(o000000O.class, str);
    }

    public static o000000O[] values() {
        return (o000000O[]) f13387OooOo0o.clone();
    }
}

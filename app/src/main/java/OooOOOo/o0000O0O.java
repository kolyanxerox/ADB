package OooOOOo;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o0000O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o0000O0O f13390OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ o0000O0O[] f13391OooOo0o;

    static {
        o0000O0O o0000o0o2 = new o0000O0O("DEFAULT", 0);
        f13390OooOo0O = o0000o0o2;
        o0000O0O o0000o0o3 = new o0000O0O("UNMETERED_ONLY", 1);
        o0000O0O o0000o0o4 = new o0000O0O("UNMETERED_OR_DAILY", 2);
        o0000O0O o0000o0o5 = new o0000O0O("FAST_IF_RADIO_AWAKE", 3);
        o0000O0O o0000o0o6 = new o0000O0O("NEVER", 4);
        o0000O0O o0000o0o7 = new o0000O0O("UNRECOGNIZED", 5);
        f13391OooOo0o = new o0000O0O[]{o0000o0o2, o0000o0o3, o0000o0o4, o0000o0o5, o0000o0o6, o0000o0o7};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, o0000o0o2);
        sparseArray.put(1, o0000o0o3);
        sparseArray.put(2, o0000o0o4);
        sparseArray.put(3, o0000o0o5);
        sparseArray.put(4, o0000o0o6);
        sparseArray.put(-1, o0000o0o7);
    }

    public static o0000O0O valueOf(String str) {
        return (o0000O0O) Enum.valueOf(o0000O0O.class, str);
    }

    public static o0000O0O[] values() {
        return (o0000O0O[]) f13391OooOo0o.clone();
    }
}

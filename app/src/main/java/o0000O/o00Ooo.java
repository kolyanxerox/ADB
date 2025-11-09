package o0000o;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o00Ooo {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o00Ooo f29568OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o00Ooo f29569OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o00Ooo f29570OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ o00Ooo[] f29571OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final o00Ooo f29572OooOoO0;

    static {
        o00Ooo o00ooo2 = new o00Ooo("AD_STORAGE", 0);
        f29569OooOo0O = o00ooo2;
        o00Ooo o00ooo3 = new o00Ooo("ANALYTICS_STORAGE", 1);
        f29570OooOo0o = o00ooo3;
        o00Ooo o00ooo4 = new o00Ooo("AD_USER_DATA", 2);
        f29568OooOo = o00ooo4;
        o00Ooo o00ooo5 = new o00Ooo("AD_PERSONALIZATION", 3);
        f29572OooOoO0 = o00ooo5;
        f29571OooOoO = new o00Ooo[]{o00ooo2, o00ooo3, o00ooo4, o00ooo5};
    }

    @NonNull
    public static o00Ooo valueOf(@NonNull String str) {
        return (o00Ooo) Enum.valueOf(o00Ooo.class, str);
    }

    @NonNull
    public static o00Ooo[] values() {
        return (o00Ooo[]) f29571OooOoO.clone();
    }
}

package o0000o;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o00Oo0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ o00Oo0[] f29565OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o00Oo0 f29566OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o00Oo0 f29567OooOo0o;

    static {
        o00Oo0 o00oo0 = new o00Oo0("GRANTED", 0);
        f29566OooOo0O = o00oo0;
        o00Oo0 o00oo02 = new o00Oo0("DENIED", 1);
        f29567OooOo0o = o00oo02;
        f29565OooOo = new o00Oo0[]{o00oo0, o00oo02};
    }

    @NonNull
    public static o00Oo0 valueOf(@NonNull String str) {
        return (o00Oo0) Enum.valueOf(o00Oo0.class, str);
    }

    @NonNull
    public static o00Oo0[] values() {
        return (o00Oo0[]) f29565OooOo.clone();
    }
}

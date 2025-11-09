package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class oO000OOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f22435OooO00o = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f22436OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f22437OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f22438OooO0Oo;

    static {
        Locale locale = Locale.US;
        f22436OooO0O0 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f22437OooO0OO = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f22438OooO0Oo = Pattern.compile("\\\\an(\\d+)");
    }
}

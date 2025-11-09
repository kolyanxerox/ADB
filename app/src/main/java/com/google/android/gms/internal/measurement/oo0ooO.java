package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class oo0ooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Uri f26910OooO00o = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f26911OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f26912OooO0OO;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f26911OooO0O0 = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f26912OooO0OO = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}

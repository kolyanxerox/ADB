package com.unity3d.ads.core.extensions;

import java.net.URLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o0OO00O;
import o00OOOoO.o0000O0;

/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        OooOo.OooO0o0(str, "<this>");
        byte[] bytes = str.getBytes(o0OO00O.f31451OooO00o);
        OooOo.OooO0Oo(bytes, "this as java.lang.String).getBytes(charset)");
        String strOooO0o = o0000O0.OooOOO0(Arrays.copyOf(bytes, bytes.length)).OooO0OO("SHA-256").OooO0o();
        OooOo.OooO0Oo(strOooO0o, "bytes.sha256().hex()");
        return strOooO0o;
    }

    public static final String guessMimeType(String str) {
        OooOo.OooO0o0(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}

package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String username, String password) {
        OooOo.OooO0o0(username, "username");
        OooOo.OooO0o0(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i, Object obj) {
        if ((i & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            OooOo.OooO0Oo(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }

    public static final String basic(String username, String password, Charset charset) {
        OooOo.OooO0o0(username, "username");
        OooOo.OooO0o0(password, "password");
        OooOo.OooO0o0(charset, "charset");
        return OooO0oO.OooOo.OooOO0("Basic ", ByteString.Companion.encodeString(username + ':' + password, charset).base64());
    }
}

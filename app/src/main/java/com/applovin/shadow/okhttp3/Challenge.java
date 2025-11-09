package com.applovin.shadow.okhttp3;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C3037dc;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o0O0O00;

/* loaded from: classes.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String scheme, Map<String, String> authParams) {
        String lowerCase;
        OooOo.OooO0o0(scheme, "scheme");
        OooOo.OooO0o0(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                OooOo.OooO0Oo(US, "US");
                lowerCase = key.toLowerCase(US);
                OooOo.OooO0Oo(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        OooOo.OooO0Oo(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m13563deprecated_authParams() {
        return this.authParams;
    }

    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m13564deprecated_charset() {
        return charset();
    }

    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m13565deprecated_realm() {
        return realm();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m13566deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get(C3037dc.f8237M);
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                OooOo.OooO0Oo(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        OooOo.OooO0Oo(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return OooOo.OooO00o(challenge.scheme, this.scheme) && OooOo.OooO00o(challenge.authParams, this.authParams);
    }

    public int hashCode() {
        return this.authParams.hashCode() + OooO00o.OooO0O0(899, 31, this.scheme);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        OooOo.OooO0o0(charset, "charset");
        LinkedHashMap linkedHashMapOooOoO0 = o0O0O00.OooOoO0(this.authParams);
        String strName = charset.name();
        OooOo.OooO0Oo(strName, "charset.name()");
        linkedHashMapOooOoO0.put(C3037dc.f8237M, strName);
        return new Challenge(this.scheme, linkedHashMapOooOoO0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String scheme, String realm) {
        OooOo.OooO0o0(scheme, "scheme");
        OooOo.OooO0o0(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        OooOo.OooO0Oo(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}

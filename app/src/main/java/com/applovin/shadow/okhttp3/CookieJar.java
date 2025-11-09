package com.applovin.shadow.okhttp3;

import java.util.List;
import kotlin.jvm.internal.OooOo;
import o00O0.oo000o;

/* loaded from: classes.dex */
public interface CookieJar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class NoCookies implements CookieJar {
            @Override // com.applovin.shadow.okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl url) {
                OooOo.OooO0o0(url, "url");
                return oo000o.f31251OooOo0O;
            }

            @Override // com.applovin.shadow.okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                OooOo.OooO0o0(url, "url");
                OooOo.OooO0o0(cookies, "cookies");
            }
        }

        private Companion() {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}

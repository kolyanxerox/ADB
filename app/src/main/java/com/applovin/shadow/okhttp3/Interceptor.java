package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.Interceptor;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final Oooo000 block) {
            OooOo.OooO0o0(block, "block");
            return new Interceptor() { // from class: com.applovin.shadow.okhttp3.Interceptor$Companion$invoke$1
                @Override // com.applovin.shadow.okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain it) {
                    OooOo.OooO0o0(it, "it");
                    return (Response) block.invoke(it);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}

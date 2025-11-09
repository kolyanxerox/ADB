package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0oO.o000000;

/* loaded from: classes3.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {
    private final ConcurrentHashMap<String, File> _cached;
    private final CacheRepository cacheRepository;
    private final SessionRepository sessionRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidCacheWebViewAssets", m13472f = "AndroidCacheWebViewAssets.kt", m13473l = {35, 45}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1 */
    public static final class C40561 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C40561(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheWebViewAssets.this.invoke(null, this);
        }
    }

    public AndroidCacheWebViewAssets(CacheRepository cacheRepository, SessionRepository sessionRepository) {
        OooOo.OooO0o0(cacheRepository, "cacheRepository");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap<>();
    }

    private final String getFilename(String missingDelimiterValue, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        OooOo.OooO0o0(missingDelimiterValue, "<this>");
        OooOo.OooO0o0(missingDelimiterValue, "missingDelimiterValue");
        int iOoooO0 = o000000.OoooO0(missingDelimiterValue, '?', 0, 6);
        if (iOoooO0 != -1) {
            missingDelimiterValue = missingDelimiterValue.substring(0, iOoooO0);
            OooOo.OooO0Oo(missingDelimiterValue, "substring(...)");
        }
        sb.append(o000000.OooooOo('/', missingDelimiterValue, missingDelimiterValue));
        return sb.toString();
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e5 -> B:39:0x00e8). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.WebViewConfiguration r9, o00O0O0O.OooO0OO r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets.invoke(com.unity3d.ads.core.data.model.WebViewConfiguration, o00O0O0O.OooO0OO):java.lang.Object");
    }
}

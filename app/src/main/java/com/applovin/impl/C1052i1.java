package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;

/* renamed from: com.applovin.impl.i1 */
/* loaded from: classes.dex */
public class C1052i1 {

    /* renamed from: a */
    private final C1220k f891a;

    public C1052i1(C1220k c1220k) {
        this.f891a = c1220k;
    }

    /* renamed from: a */
    public void m967a(Uri uri) {
        C1240o.m3206g("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.f891a.m2930x0().m1104b(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.f891a.m2930x0().m1106c(queryParameter2);
            }
        }
    }
}

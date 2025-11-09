package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.C0981b0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import com.ironsource.C3034d9;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.s5 */
/* loaded from: classes.dex */
public class C1189s5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final b f1884g;

    /* renamed from: com.applovin.impl.s5$b */
    public interface b {
        /* renamed from: a */
        void mo317a(C0981b0.b bVar);

        /* renamed from: a */
        void mo319a(String str);
    }

    public C1189s5(C1220k c1220k, b bVar) {
        super("TaskFetchDeveloperUri", c1220k);
        this.f1884g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f776a.m2827B().m2984E().get(C3034d9.h.f8089V));
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Looking up developer URI for package name: ".concat(strValueOf));
        }
        this.f776a.m2918r0().m402a(new a(C1235a.m3072a(this.f776a).mo3107c("GET").mo3103b("https://play.google.com/store/apps/details?id=".concat(strValueOf)).mo3096a((Object) "").mo3100a(false).mo3101a(), this.f776a));
    }

    /* renamed from: com.applovin.impl.s5$a */
    public class a extends AbstractC1067j6 {
        public a(C1235a c1235a, C1220k c1220k) {
            super(c1235a, c1220k);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "No developer URI found - response from the Play Store is empty");
                }
                C1189s5.this.f1884g.mo317a(C0981b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                C1189s5.this.f1884g.mo317a(C0981b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Developer URI (" + strGroup + ") is not valid");
                }
                C1189s5.this.f1884g.mo317a(C0981b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Found developer URI: ", strGroup, this.f778c, this.f777b);
            }
            C1189s5.this.f1884g.mo319a(strGroup);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, String str3) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i);
            }
            C1189s5.this.f1884g.mo317a(C0981b0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}

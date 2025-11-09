package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.applovin.impl.C0981b0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.applovin.impl.q5 */
/* loaded from: classes.dex */
public class C1171q5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final b f1807g;

    /* renamed from: h */
    private final String f1808h;

    /* renamed from: i */
    private String f1809i;

    /* renamed from: com.applovin.impl.q5$b */
    public interface b {
        /* renamed from: a */
        void mo318a(C0981b0.b bVar, String str);

        /* renamed from: a */
        void mo320a(String str, String str2);
    }

    public C1171q5(C1220k c1220k, String str, b bVar) {
        super("TaskFetchAppAdsContent", c1220k);
        this.f1808h = str;
        this.f1807g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f1808h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        C1235a c1235aMo3101a = C1235a.m3072a(this.f776a).mo3107c("GET").mo3103b(uriBuild.toString()).mo3097a(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTP).authority(strJoin).appendPath("app-ads.txt").build().toString()).mo3096a((Object) "").mo3100a(false).mo3101a();
        this.f1809i = uriBuild.toString();
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Looking up app-ads.txt at "), this.f1809i, this.f778c, this.f777b);
        }
        this.f776a.m2918r0().m402a(new a(c1235aMo3101a, this.f776a));
    }

    /* renamed from: com.applovin.impl.q5$a */
    public class a extends AbstractC1067j6 {
        public a(C1235a c1235a, C1220k c1220k) {
            super(c1235a, c1220k);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "No app-ads.txt found");
                }
                C1171q5.this.f1807g.mo318a(C0981b0.b.APPADSTXT_NOT_FOUND, C1171q5.this.f1809i);
            } else {
                if (C1240o.m3200a()) {
                    this.f778c.m3211a(this.f777b, "Found app-ads.txt");
                }
                C1171q5.this.f1807g.mo320a(str2, C1171q5.this.f1809i);
            }
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, String str3) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i);
            }
            C1171q5.this.f1807g.mo318a(C0981b0.b.APPADSTXT_NOT_FOUND, C1171q5.this.f1809i);
        }
    }
}

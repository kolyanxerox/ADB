package com.applovin.impl;

import com.applovin.impl.C1171q5;
import com.applovin.impl.C1189s5;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.b0 */
/* loaded from: classes.dex */
public class C0981b0 implements C1189s5.b, C1171q5.b {

    /* renamed from: a */
    private final C1220k f328a;

    /* renamed from: b */
    private final a f329b;

    /* renamed from: c */
    private C1299z f330c;

    /* renamed from: d */
    private String f331d;

    /* renamed from: com.applovin.impl.b0$a */
    public interface a {
        /* renamed from: a */
        void mo321a(b bVar, String str);

        /* renamed from: a */
        void mo322a(C1299z c1299z, String str);
    }

    /* renamed from: com.applovin.impl.b0$b */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public C0981b0(C1220k c1220k, a aVar) {
        this.f328a = c1220k;
        this.f329b = aVar;
    }

    /* renamed from: a */
    public void m316a() {
        C1299z c1299z = this.f330c;
        if (c1299z != null) {
            this.f329b.mo322a(c1299z, this.f331d);
        } else {
            this.f328a.m2918r0().m402a(new C1189s5(this.f328a, this));
        }
    }

    /* renamed from: a */
    public static List m315a(C1299z c1299z, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0953a0 c0953a0 = (C0953a0) it.next();
            List list2 = (List) c1299z.m3816a().get(c0953a0.m70b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((C0953a0) it2.next()).m68a(c0953a0)) {
                        break;
                    }
                }
            }
            arrayList.add(c0953a0);
        }
        return arrayList;
    }

    @Override // com.applovin.impl.C1189s5.b
    /* renamed from: a */
    public void mo319a(String str) {
        this.f328a.m2918r0().m402a(new C1171q5(this.f328a, str, this));
    }

    @Override // com.applovin.impl.C1189s5.b
    /* renamed from: a */
    public void mo317a(b bVar) {
        this.f329b.mo321a(bVar, (String) null);
    }

    @Override // com.applovin.impl.C1171q5.b
    /* renamed from: a */
    public void mo320a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                C0953a0 c0953a0 = new C0953a0(strTrim, i);
                if (c0953a0.m76h()) {
                    String strM70b = c0953a0.m70b();
                    List arrayList2 = map.containsKey(strM70b) ? (List) map.get(strM70b) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(c0953a0);
                        map.put(strM70b, arrayList2);
                    }
                } else {
                    arrayList.add(c0953a0);
                }
            }
            i++;
        }
        this.f330c = new C1299z(map, arrayList);
        this.f331d = str2;
        this.f328a.m2847O();
        if (C1240o.m3200a()) {
            this.f328a.m2847O().m3211a("AppAdsTxtService", "app-ads.txt fetched: " + this.f330c);
        }
        this.f329b.mo322a(this.f330c, str2);
    }

    @Override // com.applovin.impl.C1171q5.b
    /* renamed from: a */
    public void mo318a(b bVar, String str) {
        this.f329b.mo321a(bVar, str);
    }
}

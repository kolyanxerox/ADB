package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.z3 */
/* loaded from: classes.dex */
public class C1303z3 {

    /* renamed from: a */
    private final String f3220a;

    /* renamed from: b */
    private final List f3221b;

    /* renamed from: c */
    private final int f3222c;

    /* renamed from: d */
    private Long f3223d;

    /* renamed from: e */
    private final Map f3224e = new HashMap();

    /* renamed from: f */
    private final Deque f3225f = new ArrayDeque();

    public C1303z3(C1220k c1220k) {
        this.f3220a = (String) c1220k.m2866a(C1268v4.f2880r4);
        this.f3221b = c1220k.m2888c(C1268v4.f2888s4);
        this.f3222c = ((Integer) c1220k.m2866a(C1268v4.f2896t4)).intValue();
    }

    /* renamed from: a */
    public Long m3865a() {
        return this.f3223d;
    }

    /* renamed from: b */
    public Deque m3867b() {
        return this.f3225f;
    }

    /* renamed from: a */
    public void m3866a(String str) {
        if (TextUtils.isEmpty(str) || this.f3222c <= 0) {
            return;
        }
        Map map = (Map) this.f3224e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / list.size()));
            }
        }
        if (this.f3225f.size() == this.f3222c) {
            this.f3225f.pollLast();
        }
        this.f3225f.addFirst(map2);
    }

    /* renamed from: b */
    public void m3868b(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f3221b) && this.f3222c > 0) {
            Iterator it = this.f3221b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    m3864a(j, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f3220a) && str.endsWith(this.f3220a)) {
            this.f3223d = Long.valueOf(j);
        }
    }

    /* renamed from: a */
    private void m3864a(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f3224e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f3224e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j));
    }
}

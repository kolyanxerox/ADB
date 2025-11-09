package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.m8 */
/* loaded from: classes.dex */
public class C1099m8 {

    /* renamed from: f */
    public static final C1099m8 f1205f = new C1099m8();

    /* renamed from: a */
    private final C1099m8 f1206a;

    /* renamed from: b */
    private final String f1207b;

    /* renamed from: c */
    private final Map f1208c;

    /* renamed from: d */
    protected String f1209d;

    /* renamed from: e */
    protected final List f1210e;

    public C1099m8(String str, Map map, C1099m8 c1099m8) {
        this.f1206a = c1099m8;
        this.f1207b = str;
        this.f1208c = Collections.unmodifiableMap(map);
        this.f1210e = new ArrayList();
    }

    /* renamed from: a */
    public Map m1512a() {
        return this.f1208c;
    }

    /* renamed from: b */
    public List m1514b() {
        return Collections.unmodifiableList(this.f1210e);
    }

    /* renamed from: c */
    public String m1516c() {
        return this.f1207b;
    }

    /* renamed from: d */
    public String m1517d() {
        return this.f1209d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f1207b + "', text='" + this.f1209d + "', attributes=" + this.f1208c + '}';
    }

    /* renamed from: a */
    public List m1511a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f1210e.size());
        for (C1099m8 c1099m8 : this.f1210e) {
            if (str.equalsIgnoreCase(c1099m8.m1516c())) {
                arrayList.add(c1099m8);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public C1099m8 m1513b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f1210e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            C1099m8 c1099m8 = (C1099m8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(c1099m8.m1516c())) {
                return c1099m8;
            }
            arrayList.addAll(c1099m8.m1514b());
        }
        return null;
    }

    /* renamed from: c */
    public C1099m8 m1515c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (C1099m8 c1099m8 : this.f1210e) {
            if (str.equalsIgnoreCase(c1099m8.m1516c())) {
                return c1099m8;
            }
        }
        return null;
    }

    private C1099m8() {
        this.f1206a = null;
        this.f1207b = "";
        this.f1208c = Collections.EMPTY_MAP;
        this.f1209d = "";
        this.f1210e = Collections.EMPTY_LIST;
    }
}

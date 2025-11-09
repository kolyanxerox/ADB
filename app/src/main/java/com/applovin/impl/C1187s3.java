package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.s3 */
/* loaded from: classes.dex */
public class C1187s3 {

    /* renamed from: a */
    private final List f1876a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.s3$a */
    public interface a {
        /* renamed from: a */
        void mo1075a(AbstractC1266v2 abstractC1266v2);
    }

    /* renamed from: a */
    public void m2372a(a aVar) {
        this.f1876a.add(aVar);
    }

    /* renamed from: b */
    public void m2374b(a aVar) {
        this.f1876a.remove(aVar);
    }

    /* renamed from: a */
    public void m2373a(AbstractC1266v2 abstractC1266v2) {
        ArrayList arrayList = new ArrayList(this.f1876a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a) obj).mo1075a(abstractC1266v2);
        }
    }
}

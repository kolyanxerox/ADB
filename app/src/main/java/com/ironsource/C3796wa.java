package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C3419mh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.wa */
/* loaded from: classes2.dex */
public class C3796wa {

    /* renamed from: a */
    private final Map<String, C3762va> f12442a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C3762va> f12443b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, C3762va> f12444c = new LinkedHashMap();

    /* renamed from: b */
    private Map<String, C3762va> m12848b(C3419mh.e eVar) {
        if (eVar.name().equalsIgnoreCase(C3419mh.e.RewardedVideo.name())) {
            return this.f12442a;
        }
        if (eVar.name().equalsIgnoreCase(C3419mh.e.Interstitial.name())) {
            return this.f12443b;
        }
        if (eVar.name().equalsIgnoreCase(C3419mh.e.Banner.name())) {
            return this.f12444c;
        }
        return null;
    }

    /* renamed from: a */
    public C3762va m12849a(C3419mh.e eVar, C3907zj c3907zj) {
        C3762va c3762va = new C3762va(c3907zj);
        m12847a(eVar, c3907zj.m13395e(), c3762va);
        return c3762va;
    }

    /* renamed from: a */
    public C3762va m12850a(C3419mh.e eVar, String str) {
        Map<String, C3762va> mapM12848b;
        if (TextUtils.isEmpty(str) || (mapM12848b = m12848b(eVar)) == null) {
            return null;
        }
        return mapM12848b.get(str);
    }

    /* renamed from: b */
    public void m12853b(C3419mh.e eVar, String str) {
        Map<String, C3762va> mapM12848b;
        C3762va c3762vaRemove;
        if (TextUtils.isEmpty(str) || (mapM12848b = m12848b(eVar)) == null || (c3762vaRemove = mapM12848b.remove(str)) == null) {
            return;
        }
        c3762vaRemove.m12753a();
    }

    /* renamed from: a */
    public C3762va m12851a(C3419mh.e eVar, String str, Map<String, String> map, InterfaceC3299kp interfaceC3299kp) {
        C3762va c3762va = new C3762va(str, str, map, interfaceC3299kp);
        m12847a(eVar, str, c3762va);
        return c3762va;
    }

    /* renamed from: a */
    public Collection<C3762va> m12852a(C3419mh.e eVar) {
        Map<String, C3762va> mapM12848b = m12848b(eVar);
        return mapM12848b != null ? mapM12848b.values() : new ArrayList();
    }

    /* renamed from: a */
    private void m12847a(C3419mh.e eVar, String str, C3762va c3762va) {
        Map<String, C3762va> mapM12848b;
        if (TextUtils.isEmpty(str) || c3762va == null || (mapM12848b = m12848b(eVar)) == null) {
            return;
        }
        mapM12848b.put(str, c3762va);
    }
}

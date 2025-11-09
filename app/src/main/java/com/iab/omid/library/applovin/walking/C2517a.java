package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.internal.C2490c;
import com.iab.omid.library.applovin.internal.C2492e;
import com.iab.omid.library.applovin.utils.C2512h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.applovin.walking.a */
/* loaded from: classes2.dex */
public class C2517a {

    /* renamed from: a */
    private final HashMap<View, String> f3553a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, a> f3554b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f3555c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f3556d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f3557e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f3558f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f3559g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f3560h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f3561i = new WeakHashMap();

    /* renamed from: j */
    private boolean f3562j;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a */
    public static class a {

        /* renamed from: a */
        private final C2492e f3563a;

        /* renamed from: b */
        private final ArrayList<String> f3564b = new ArrayList<>();

        public a(C2492e c2492e, String str) {
            this.f3563a = c2492e;
            m4217a(str);
        }

        /* renamed from: a */
        public C2492e m4216a() {
            return this.f3563a;
        }

        /* renamed from: b */
        public ArrayList<String> m4218b() {
            return this.f3564b;
        }

        /* renamed from: a */
        public void m4217a(String str) {
            this.f3564b.add(str);
        }
    }

    /* renamed from: a */
    public View m4204a(String str) {
        return this.f3555c.get(str);
    }

    /* renamed from: b */
    public a m4206b(View view) {
        a aVar = this.f3554b.get(view);
        if (aVar != null) {
            this.f3554b.remove(view);
        }
        return aVar;
    }

    /* renamed from: c */
    public String m4209c(View view) {
        if (this.f3553a.size() == 0) {
            return null;
        }
        String str = this.f3553a.get(view);
        if (str != null) {
            this.f3553a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC2525c m4212d(View view) {
        return this.f3556d.contains(view) ? EnumC2525c.PARENT_VIEW : this.f3562j ? EnumC2525c.OBSTRUCTION_VIEW : EnumC2525c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m4214e() {
        C2490c c2490cM4029c = C2490c.m4029c();
        if (c2490cM4029c != null) {
            for (C2480a c2480a : c2490cM4029c.m4030a()) {
                View viewM3988e = c2480a.m3988e();
                if (c2480a.m3991h()) {
                    String strM3986c = c2480a.m3986c();
                    if (viewM3988e != null) {
                        boolean zM4176e = C2512h.m4176e(viewM3988e);
                        if (zM4176e) {
                            this.f3560h.add(strM3986c);
                        }
                        String strM4201a = m4201a(viewM3988e, zM4176e);
                        if (strM4201a == null) {
                            this.f3557e.add(strM3986c);
                            this.f3553a.put(viewM3988e, strM3986c);
                            m4202a(c2480a);
                        } else if (strM4201a != "noWindowFocus") {
                            this.f3558f.add(strM3986c);
                            this.f3555c.put(strM3986c, viewM3988e);
                            this.f3559g.put(strM3986c, strM4201a);
                        }
                    } else {
                        this.f3558f.add(strM3986c);
                        this.f3559g.put(strM3986c, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m4200a(View view) {
        if (view.hasWindowFocus()) {
            this.f3561i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f3561i.containsKey(view)) {
            return this.f3561i.get(view);
        }
        Map<View, Boolean> map = this.f3561i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* renamed from: b */
    public String m4207b(String str) {
        return this.f3559g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m4210c() {
        return this.f3557e;
    }

    /* renamed from: d */
    public void m4213d() {
        this.f3562j = true;
    }

    /* renamed from: e */
    public boolean m4215e(View view) {
        if (!this.f3561i.containsKey(view)) {
            return true;
        }
        this.f3561i.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: a */
    private String m4201a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m4200a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM4172a = C2512h.m4172a(view);
            if (strM4172a != null) {
                return strM4172a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f3556d.addAll(hashSet);
        return null;
    }

    /* renamed from: b */
    public HashSet<String> m4208b() {
        return this.f3558f;
    }

    /* renamed from: c */
    public boolean m4211c(String str) {
        return this.f3560h.contains(str);
    }

    /* renamed from: a */
    public void m4205a() {
        this.f3553a.clear();
        this.f3554b.clear();
        this.f3555c.clear();
        this.f3556d.clear();
        this.f3557e.clear();
        this.f3558f.clear();
        this.f3559g.clear();
        this.f3562j = false;
        this.f3560h.clear();
    }

    /* renamed from: a */
    private void m4202a(C2480a c2480a) {
        Iterator<C2492e> it = c2480a.m3989f().iterator();
        while (it.hasNext()) {
            m4203a(it.next(), c2480a);
        }
    }

    /* renamed from: a */
    private void m4203a(C2492e c2492e, C2480a c2480a) {
        View view = c2492e.m4046c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f3554b.get(view);
        if (aVar != null) {
            aVar.m4217a(c2480a.m3986c());
        } else {
            this.f3554b.put(view, new a(c2492e, c2480a.m3986c()));
        }
    }
}

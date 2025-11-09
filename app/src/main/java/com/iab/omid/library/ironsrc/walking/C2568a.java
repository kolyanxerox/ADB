package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.internal.C2541c;
import com.iab.omid.library.ironsrc.internal.C2543e;
import com.iab.omid.library.ironsrc.utils.C2563h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.ironsrc.walking.a */
/* loaded from: classes2.dex */
public class C2568a {

    /* renamed from: a */
    private final HashMap<View, String> f3688a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, a> f3689b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f3690c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f3691d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f3692e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f3693f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f3694g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f3695h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f3696i = new WeakHashMap();

    /* renamed from: j */
    private boolean f3697j;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    public static class a {

        /* renamed from: a */
        private final C2543e f3698a;

        /* renamed from: b */
        private final ArrayList<String> f3699b = new ArrayList<>();

        public a(C2543e c2543e, String str) {
            this.f3698a = c2543e;
            m4470a(str);
        }

        /* renamed from: a */
        public C2543e m4469a() {
            return this.f3698a;
        }

        /* renamed from: b */
        public ArrayList<String> m4471b() {
            return this.f3699b;
        }

        /* renamed from: a */
        public void m4470a(String str) {
            this.f3699b.add(str);
        }
    }

    /* renamed from: a */
    public View m4457a(String str) {
        return this.f3690c.get(str);
    }

    /* renamed from: b */
    public a m4459b(View view) {
        a aVar = this.f3689b.get(view);
        if (aVar != null) {
            this.f3689b.remove(view);
        }
        return aVar;
    }

    /* renamed from: c */
    public String m4462c(View view) {
        if (this.f3688a.size() == 0) {
            return null;
        }
        String str = this.f3688a.get(view);
        if (str != null) {
            this.f3688a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC2576c m4465d(View view) {
        return this.f3691d.contains(view) ? EnumC2576c.PARENT_VIEW : this.f3697j ? EnumC2576c.OBSTRUCTION_VIEW : EnumC2576c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m4467e() {
        C2541c c2541cM4282c = C2541c.m4282c();
        if (c2541cM4282c != null) {
            for (C2531a c2531a : c2541cM4282c.m4283a()) {
                View viewM4241c = c2531a.m4241c();
                if (c2531a.m4244f()) {
                    String adSessionId = c2531a.getAdSessionId();
                    if (viewM4241c != null) {
                        boolean zM4429e = C2563h.m4429e(viewM4241c);
                        if (zM4429e) {
                            this.f3695h.add(adSessionId);
                        }
                        String strM4454a = m4454a(viewM4241c, zM4429e);
                        if (strM4454a == null) {
                            this.f3692e.add(adSessionId);
                            this.f3688a.put(viewM4241c, adSessionId);
                            m4455a(c2531a);
                        } else if (strM4454a != "noWindowFocus") {
                            this.f3693f.add(adSessionId);
                            this.f3690c.put(adSessionId, viewM4241c);
                            this.f3694g.put(adSessionId, strM4454a);
                        }
                    } else {
                        this.f3693f.add(adSessionId);
                        this.f3694g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m4453a(View view) {
        if (view.hasWindowFocus()) {
            this.f3696i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f3696i.containsKey(view)) {
            return this.f3696i.get(view);
        }
        Map<View, Boolean> map = this.f3696i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* renamed from: b */
    public String m4460b(String str) {
        return this.f3694g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m4463c() {
        return this.f3692e;
    }

    /* renamed from: d */
    public void m4466d() {
        this.f3697j = true;
    }

    /* renamed from: e */
    public boolean m4468e(View view) {
        if (!this.f3696i.containsKey(view)) {
            return true;
        }
        this.f3696i.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: a */
    private String m4454a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m4453a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM4425a = C2563h.m4425a(view);
            if (strM4425a != null) {
                return strM4425a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f3691d.addAll(hashSet);
        return null;
    }

    /* renamed from: b */
    public HashSet<String> m4461b() {
        return this.f3693f;
    }

    /* renamed from: c */
    public boolean m4464c(String str) {
        return this.f3695h.contains(str);
    }

    /* renamed from: a */
    public void m4458a() {
        this.f3688a.clear();
        this.f3689b.clear();
        this.f3690c.clear();
        this.f3691d.clear();
        this.f3692e.clear();
        this.f3693f.clear();
        this.f3694g.clear();
        this.f3697j = false;
        this.f3695h.clear();
    }

    /* renamed from: a */
    private void m4455a(C2531a c2531a) {
        Iterator<C2543e> it = c2531a.m4242d().iterator();
        while (it.hasNext()) {
            m4456a(it.next(), c2531a);
        }
    }

    /* renamed from: a */
    private void m4456a(C2543e c2543e, C2531a c2531a) {
        View view = c2543e.m4299c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f3689b.get(view);
        if (aVar != null) {
            aVar.m4470a(c2531a.getAdSessionId());
        } else {
            this.f3689b.put(view, new a(c2543e, c2531a.getAdSessionId()));
        }
    }
}

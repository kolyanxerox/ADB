package com.iab.omid.library.unity3d.walking;

import android.view.View;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.internal.C2590c;
import com.iab.omid.library.unity3d.internal.C2592e;
import com.iab.omid.library.unity3d.utils.C2610h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.unity3d.walking.a */
/* loaded from: classes2.dex */
public class C2614a {

    /* renamed from: a */
    private final HashMap<View, String> f3817a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, a> f3818b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f3819c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f3820d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f3821e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f3822f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f3823g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f3824h = new WeakHashMap();

    /* renamed from: i */
    private boolean f3825i;

    /* renamed from: com.iab.omid.library.unity3d.walking.a$a */
    public static class a {

        /* renamed from: a */
        private final C2592e f3826a;

        /* renamed from: b */
        private final ArrayList<String> f3827b = new ArrayList<>();

        public a(C2592e c2592e, String str) {
            this.f3826a = c2592e;
            m4704a(str);
        }

        /* renamed from: a */
        public C2592e m4703a() {
            return this.f3826a;
        }

        /* renamed from: b */
        public ArrayList<String> m4705b() {
            return this.f3827b;
        }

        /* renamed from: a */
        public void m4704a(String str) {
            this.f3827b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m4691b(View view) {
        if (view.hasWindowFocus()) {
            this.f3824h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f3824h.containsKey(view)) {
            return this.f3824h.get(view);
        }
        Map<View, Boolean> map = this.f3824h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* renamed from: a */
    public View m4692a(String str) {
        return this.f3819c.get(str);
    }

    /* renamed from: c */
    public a m4696c(View view) {
        a aVar = this.f3818b.get(view);
        if (aVar != null) {
            this.f3818b.remove(view);
        }
        return aVar;
    }

    /* renamed from: d */
    public String m4698d(View view) {
        if (this.f3817a.size() == 0) {
            return null;
        }
        String str = this.f3817a.get(view);
        if (str != null) {
            this.f3817a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC2622c m4700e(View view) {
        return this.f3820d.contains(view) ? EnumC2622c.PARENT_VIEW : this.f3825i ? EnumC2622c.OBSTRUCTION_VIEW : EnumC2622c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m4702f(View view) {
        if (!this.f3824h.containsKey(view)) {
            return true;
        }
        this.f3824h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: a */
    private String m4688a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m4691b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM4664a = C2610h.m4664a(view);
            if (strM4664a != null) {
                return strM4664a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f3820d.addAll(hashSet);
        return null;
    }

    /* renamed from: b */
    public String m4694b(String str) {
        return this.f3823g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m4697c() {
        return this.f3821e;
    }

    /* renamed from: d */
    public void m4699d() {
        this.f3825i = true;
    }

    /* renamed from: e */
    public void m4701e() {
        C2590c c2590cM4538c = C2590c.m4538c();
        if (c2590cM4538c != null) {
            for (C2580a c2580a : c2590cM4538c.m4539a()) {
                View viewM4497c = c2580a.m4497c();
                if (c2580a.m4500f()) {
                    String adSessionId = c2580a.getAdSessionId();
                    if (viewM4497c != null) {
                        String strM4688a = m4688a(viewM4497c);
                        if (strM4688a == null) {
                            this.f3821e.add(adSessionId);
                            this.f3817a.put(viewM4497c, adSessionId);
                            m4689a(c2580a);
                        } else if (strM4688a != "noWindowFocus") {
                            this.f3822f.add(adSessionId);
                            this.f3819c.put(adSessionId, viewM4497c);
                            this.f3823g.put(adSessionId, strM4688a);
                        }
                    } else {
                        this.f3822f.add(adSessionId);
                        this.f3823g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4693a() {
        this.f3817a.clear();
        this.f3818b.clear();
        this.f3819c.clear();
        this.f3820d.clear();
        this.f3821e.clear();
        this.f3822f.clear();
        this.f3823g.clear();
        this.f3825i = false;
    }

    /* renamed from: b */
    public HashSet<String> m4695b() {
        return this.f3822f;
    }

    /* renamed from: a */
    private void m4689a(C2580a c2580a) {
        Iterator<C2592e> it = c2580a.m4498d().iterator();
        while (it.hasNext()) {
            m4690a(it.next(), c2580a);
        }
    }

    /* renamed from: a */
    private void m4690a(C2592e c2592e, C2580a c2580a) {
        View view = c2592e.m4555c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f3818b.get(view);
        if (aVar != null) {
            aVar.m4704a(c2580a.getAdSessionId());
        } else {
            this.f3818b.put(view, new a(c2592e, c2580a.getAdSessionId()));
        }
    }
}

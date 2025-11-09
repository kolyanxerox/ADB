package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.C1011e0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.applovin.impl.d0 */
/* loaded from: classes.dex */
public class C1001d0 extends AbstractCallableC0991c0 {

    /* renamed from: f */
    private final String f601f;

    /* renamed from: g */
    private final AbstractC1207b f602g;

    /* renamed from: h */
    private final List f603h;

    /* renamed from: i */
    private final c f604i;

    /* renamed from: j */
    private StringBuffer f605j;

    /* renamed from: k */
    private final Object f606k;

    /* renamed from: l */
    private final ExecutorService f607l;

    /* renamed from: m */
    private final String f608m;

    /* renamed from: n */
    private List f609n;

    /* renamed from: o */
    private List f610o;

    /* renamed from: com.applovin.impl.d0$a */
    public class a implements C1011e0.a {

        /* renamed from: a */
        final /* synthetic */ String f611a;

        public a(String str) {
            this.f611a = str;
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C1001d0.this.f453a.m2866a(C1268v4.f2683T0)).booleanValue()) {
                    synchronized (C1001d0.this.f606k) {
                        StringUtils.replaceAll(C1001d0.this.f605j, this.f611a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C1001d0.this.f605j, this.f611a, uri.toString());
                }
                C1001d0.this.f602g.m2574a(uri);
                return;
            }
            C1240o c1240o = C1001d0.this.f455c;
            if (C1240o.m3200a()) {
                C1001d0 c1001d0 = C1001d0.this;
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Failed to cache JavaScript resource "), this.f611a, c1001d0.f455c, c1001d0.f454b);
            }
            if (C1001d0.this.f604i != null) {
                C1001d0.this.f604i.mo524a(C1001d0.this.f601f, true);
            }
        }
    }

    /* renamed from: com.applovin.impl.d0$b */
    public class b implements C1011e0.a {

        /* renamed from: a */
        final /* synthetic */ String f613a;

        /* renamed from: b */
        final /* synthetic */ String f614b;

        /* renamed from: c */
        final /* synthetic */ String f615c;

        public b(String str, String str2, String str3) {
            this.f613a = str;
            this.f614b = str2;
            this.f615c = str3;
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C1001d0.this.f453a.m2866a(C1268v4.f2683T0)).booleanValue()) {
                    synchronized (C1001d0.this.f606k) {
                        StringUtils.replaceAll(C1001d0.this.f605j, this.f613a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C1001d0.this.f605j, this.f613a, uri.toString());
                }
                C1001d0.this.f602g.m2574a(uri);
                return;
            }
            if (!C1001d0.this.f602g.m2577a0().contains(this.f614b + this.f615c) || C1001d0.this.f604i == null) {
                return;
            }
            C1001d0.this.f604i.mo524a(C1001d0.this.f601f, true);
        }
    }

    /* renamed from: com.applovin.impl.d0$c */
    public interface c {
        /* renamed from: a */
        void mo524a(String str, boolean z);
    }

    public C1001d0(String str, AbstractC1207b abstractC1207b, List list, ExecutorService executorService, String str2, C1220k c1220k, c cVar) {
        super("AsyncTaskCacheHTMLResources", c1220k);
        this.f601f = str;
        this.f602g = abstractC1207b;
        this.f603h = list;
        this.f607l = executorService;
        this.f608m = str2;
        this.f604i = cVar;
        this.f605j = new StringBuffer(str);
        this.f606k = new Object();
    }

    /* renamed from: f */
    private Collection m520f() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f453a.m2866a(C1268v4.f2555D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* renamed from: a */
    private void m513a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f607l.submit((C1011e0) it.next()));
        }
        this.f610o = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Future) obj).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0017, code lost:
    
        continue;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.HashSet m517d() {
        /*
            r18 = this;
            r0 = r18
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.applovin.impl.sdk.ad.b r2 = r0.f602g
            java.util.List r2 = r2.m2554R()
            java.util.Collection r3 = r0.m520f()
            java.util.List r4 = r0.f603h
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbf
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = r6
        L25:
            java.lang.String r8 = r0.f601f
            int r8 = r8.length()
            if (r6 >= r8) goto L17
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f457e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L37
            return r8
        L37:
            java.lang.String r6 = r0.f601f
            int r6 = r6.indexOf(r5, r7)
            r7 = -1
            if (r6 != r7) goto L41
            goto L17
        L41:
            java.lang.String r7 = r0.f601f
            int r7 = r7.length()
            r9 = r6
        L48:
            java.lang.String r10 = r0.f601f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L5d
            if (r9 >= r7) goto L5d
            int r9 = r9 + 1
            goto L48
        L5d:
            if (r9 <= r6) goto Laf
            if (r9 == r7) goto Laf
            java.lang.String r7 = r0.f601f
            int r8 = r5.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.String r11 = OooO0oO.OooOo.OooOoo0(r5, r7)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L9d
            boolean r8 = r2.contains(r11)
            if (r8 != 0) goto L9d
            com.applovin.impl.e0 r10 = new com.applovin.impl.e0
            com.applovin.impl.sdk.ad.b r12 = r0.f602g
            java.lang.String[] r8 = new java.lang.String[]{r5}
            java.util.List r13 = java.util.Arrays.asList(r8)
            java.lang.String r15 = r0.f608m
            com.applovin.impl.sdk.k r8 = r0.f453a
            com.applovin.impl.d0$b r14 = new com.applovin.impl.d0$b
            r14.<init>(r11, r5, r7)
            r17 = r14
            r14 = 1
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.add(r10)
            goto Lac
        L9d:
            boolean r8 = com.applovin.impl.sdk.C1240o.m3200a()
            if (r8 == 0) goto Lac
            com.applovin.impl.sdk.o r8 = r0.f455c
            java.lang.String r10 = r0.f454b
            java.lang.String r11 = "Skip caching of optional or non-resource "
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0(r11, r7, r8, r10)
        Lac:
            r7 = r9
            goto L25
        Laf:
            boolean r1 = com.applovin.impl.sdk.C1240o.m3200a()
            if (r1 == 0) goto Lbe
            com.applovin.impl.sdk.o r1 = r0.f455c
            java.lang.String r2 = r0.f454b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.m3214b(r2, r3)
        Lbe:
            return r8
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1001d0.m517d():java.util.HashSet");
    }

    /* renamed from: e */
    private HashSet m519e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f601f, (String) this.f453a.m2866a(C1268v4.f2719X4)), 1)) {
            if (this.f457e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new C1011e0(str, this.f602g, Collections.EMPTY_LIST, false, this.f608m, this.f453a, new a(str)));
            } else if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Skip caching of non-resource ", str, this.f455c, this.f454b);
            }
        }
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Boolean call() throws InterruptedException {
        HashSet hashSetM519e;
        if (this.f457e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f601f)) {
            m512a(this.f601f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f453a.m2866a(C1268v4.f2563E0)).booleanValue()) {
            if (C1240o.m3200a()) {
                this.f455c.m3211a(this.f454b, "Resource caching is disabled, skipping cache...");
            }
            m512a(this.f601f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetM517d = m517d();
        if (hashSetM517d != null) {
            hashSet.addAll(hashSetM517d);
        }
        if (((Boolean) this.f453a.m2866a(C1268v4.f2711W4)).booleanValue() && (hashSetM519e = m519e()) != null) {
            hashSet.addAll(hashSetM519e);
        }
        this.f609n = new ArrayList(hashSet);
        if (this.f457e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f609n;
        if (list == null || list.isEmpty()) {
            m512a(this.f601f);
            return Boolean.FALSE;
        }
        if (C1240o.m3200a()) {
            this.f455c.m3211a(this.f454b, "Executing " + this.f609n.size() + " caching operations...");
        }
        if (this.f453a.m2918r0().m413f()) {
            m513a(this.f609n);
        } else {
            this.f607l.invokeAll(this.f609n);
        }
        if (((Boolean) this.f453a.m2866a(C1268v4.f2683T0)).booleanValue()) {
            synchronized (this.f606k) {
                m512a(this.f605j.toString());
            }
        } else {
            m512a(this.f605j.toString());
        }
        return Boolean.TRUE;
    }

    /* renamed from: c */
    public void m522c() {
        List list = this.f609n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1011e0) it.next()).m442a(true);
            }
        }
        List<Future> list2 = this.f610o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    /* renamed from: a */
    private void m512a(String str) {
        c cVar;
        if (this.f457e.get() || (cVar = this.f604i) == null) {
            return;
        }
        cVar.mo524a(str, false);
    }
}

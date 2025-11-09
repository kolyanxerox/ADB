package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.C1001d0;
import com.applovin.impl.C1011e0;
import com.applovin.impl.C1187s3;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1222m;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* renamed from: com.applovin.impl.j5 */
/* loaded from: classes.dex */
public abstract class AbstractC1066j5 extends AbstractRunnableC1036g5 implements C1187s3.a {

    /* renamed from: g */
    protected final AbstractC1207b f946g;

    /* renamed from: h */
    private AppLovinAdLoadListener f947h;

    /* renamed from: i */
    protected final String f948i;

    /* renamed from: j */
    private final C1222m f949j;

    /* renamed from: k */
    private final Collection f950k;

    /* renamed from: l */
    private boolean f951l;

    /* renamed from: m */
    protected ExecutorService f952m;

    /* renamed from: n */
    protected ExecutorService f953n;

    /* renamed from: o */
    protected List f954o;

    /* renamed from: p */
    private C1001d0 f955p;

    /* renamed from: com.applovin.impl.j5$a */
    public class a implements C1011e0.a {
        public a() {
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            AbstractC1066j5.this.f946g.m2580b(uri);
            C1240o c1240o = AbstractC1066j5.this.f778c;
            if (C1240o.m3200a()) {
                AbstractC1066j5 abstractC1066j5 = AbstractC1066j5.this;
                abstractC1066j5.f778c.m3211a(abstractC1066j5.f777b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    /* renamed from: com.applovin.impl.j5$b */
    public class b implements C1011e0.a {
        public b() {
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            AbstractC1066j5.this.f946g.m2586c(uri);
            C1240o c1240o = AbstractC1066j5.this.f778c;
            if (C1240o.m3200a()) {
                AbstractC1066j5 abstractC1066j5 = AbstractC1066j5.this;
                abstractC1066j5.f778c.m3211a(abstractC1066j5.f777b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    /* renamed from: com.applovin.impl.j5$c */
    public class c implements C1011e0.a {

        /* renamed from: a */
        final /* synthetic */ C1011e0.a f958a;

        public c(C1011e0.a aVar) {
            this.f958a = aVar;
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            if (uri == null) {
                C1240o c1240o = AbstractC1066j5.this.f778c;
                if (C1240o.m3200a()) {
                    AbstractC1066j5 abstractC1066j5 = AbstractC1066j5.this;
                    abstractC1066j5.f778c.m3214b(abstractC1066j5.f777b, "Failed to cache video");
                }
                AbstractC1066j5.this.mo1073a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", AbstractC1066j5.this.f946g.getAdIdNumber());
                AbstractC1066j5.this.f776a.m2923u().m2769a(bundle, "video_caching_failed");
                return;
            }
            C1240o c1240o2 = AbstractC1066j5.this.f778c;
            if (C1240o.m3200a()) {
                AbstractC1066j5 abstractC1066j52 = AbstractC1066j5.this;
                abstractC1066j52.f778c.m3211a(abstractC1066j52.f777b, "Finish caching video for ad #" + AbstractC1066j5.this.f946g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f958a.mo523a(uri);
        }
    }

    /* renamed from: com.applovin.impl.j5$d */
    public class d implements C1001d0.c {

        /* renamed from: a */
        final /* synthetic */ e f960a;

        public d(e eVar) {
            this.f960a = eVar;
        }

        @Override // com.applovin.impl.C1001d0.c
        /* renamed from: a */
        public void mo524a(String str, boolean z) {
            if (z) {
                AbstractC1066j5.this.mo1073a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f960a;
            if (eVar != null) {
                eVar.mo1088a(str);
            }
        }
    }

    /* renamed from: com.applovin.impl.j5$e */
    public interface e {
        /* renamed from: a */
        void mo1088a(String str);
    }

    public AbstractC1066j5(String str, AbstractC1207b abstractC1207b, C1220k c1220k, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, c1220k);
        this.f948i = UUID.randomUUID().toString();
        if (abstractC1207b == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f946g = abstractC1207b;
        this.f947h = appLovinAdLoadListener;
        this.f949j = c1220k.m2837H();
        this.f950k = m1064h();
        if (((Boolean) c1220k.m2866a(C1268v4.f2595I0)).booleanValue()) {
            if (c1220k.m2918r0().m413f()) {
                this.f952m = c1220k.m2918r0().m400a();
                this.f953n = c1220k.m2918r0().m412e();
            } else {
                String mediationServeId = StringUtils.isValidString(abstractC1207b.getMediationServeId()) ? abstractC1207b.getMediationServeId() : UUID.randomUUID().toString();
                this.f952m = c1220k.m2918r0().m401a(OooO0oO.OooOo.OooOO0("com.applovin.sdk.caching.", mediationServeId), ((Integer) c1220k.m2866a(C1268v4.f2611K0)).intValue());
                this.f953n = c1220k.m2918r0().m401a(OooO0oO.OooOo.OooOO0("com.applovin.sdk.caching.html.", mediationServeId), ((Integer) c1220k.m2866a(C1268v4.f2619L0)).intValue());
            }
        }
    }

    /* renamed from: h */
    private Collection m1064h() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f776a.m2866a(C1268v4.f2555D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* renamed from: i */
    public /* synthetic */ void m1065i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f947h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f946g);
            this.f947h = null;
        }
    }

    @Override // com.applovin.impl.C1187s3.a
    /* renamed from: a */
    public void mo1075a(AbstractC1266v2 abstractC1266v2) {
        if (abstractC1266v2.m3518P().equalsIgnoreCase(this.f946g.getMediationServeId())) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Updating flag for timeout...");
            }
            m1084g();
        }
        this.f776a.m2864Z().m2374b(this);
    }

    /* renamed from: b */
    public C1011e0 m1079b(String str, C1011e0.a aVar) {
        return m1070a(str, this.f946g.m2588c0(), true, aVar);
    }

    /* renamed from: c */
    public Uri m1080c(String str) {
        return m1078b(str, this.f946g.m2588c0(), true);
    }

    /* renamed from: e */
    public List m1082e() {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f946g.m2553Q() != null) {
            arrayList.add(m1069a(this.f946g.m2553Q().toString(), new a()));
        }
        if (this.f946g.m2607i0() != null) {
            arrayList.add(m1069a(this.f946g.m2607i0().toString(), new b()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public void mo1083f() {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Rendered new ad:" + this.f946g);
        }
        AppLovinSdkUtils.runOnUiThread(new o0OO00O(this, 9));
    }

    /* renamed from: g */
    public void m1084g() {
        this.f951l = true;
        List list = this.f954o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f954o.iterator();
            while (it.hasNext()) {
                ((AbstractCallableC0991c0) it.next()).m442a(true);
            }
        }
        if (this.f776a.m2918r0().m413f()) {
            C1001d0 c1001d0 = this.f955p;
            if (c1001d0 != null) {
                c1001d0.m522c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f952m;
        if (executorService != null) {
            executorService.shutdown();
            this.f952m = null;
        }
        ExecutorService executorService2 = this.f953n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f953n = null;
        }
    }

    /* renamed from: j */
    public void m1085j() {
        if (AbstractC1141o0.m1949e()) {
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching mute images...");
        }
        Uri uriM1066a = m1066a(this.f946g.m2553Q(), "mute");
        if (uriM1066a != null) {
            this.f946g.m2580b(uriM1066a);
        }
        Uri uriM1066a2 = m1066a(this.f946g.m2607i0(), "unmute");
        if (uriM1066a2 != null) {
            this.f946g.m2586c(uriM1066a2);
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Ad updated with muteImageFilename = " + this.f946g.m2553Q() + ", unmuteImageFilename = " + this.f946g.m2607i0());
        }
    }

    /* renamed from: k */
    public void m1086k() {
        this.f776a.m2864Z().m2374b(this);
        if (!this.f776a.m2918r0().m413f()) {
            ExecutorService executorService = this.f952m;
            if (executorService != null) {
                executorService.shutdown();
                this.f952m = null;
            }
            ExecutorService executorService2 = this.f953n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f953n = null;
            }
        }
        MaxAdFormat maxAdFormatM3374d = this.f946g.getAdZone().m3374d();
        if (((Boolean) this.f776a.m2866a(C1268v4.f2707W0)).booleanValue() && maxAdFormatM3374d != null && maxAdFormatM3374d.isFullscreenAd()) {
            this.f776a.m2899h().m2699b(this.f946g);
        }
        this.f776a.m2892d0().m3866a(this.f948i);
    }

    /* renamed from: l */
    public boolean m1087l() {
        return this.f951l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f946g.m2624o1()) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Subscribing to timeout events...");
            }
            this.f776a.m2864Z().m2372a(this);
        }
    }

    /* renamed from: b */
    public Uri m1078b(String str, List list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching video " + str + "...");
        }
        int iM3022a = this.f776a.m2837H().m3022a(str, this.f946g);
        Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g);
        String strM3025a = this.f949j.m3025a(m791a(), str, this.f946g.getCachePrefix(), list, z, iM3022a, this.f948i, mapM675a);
        if (!StringUtils.isValidString(strM3025a)) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Failed to cache video: " + str);
            }
            m1076a(str, "cacheVideo", mapM675a);
            mo1073a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileM3023a = this.f949j.m3023a(strM3025a, m791a());
        if (fileM3023a == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to retrieve File from cached video filename = " + strM3025a);
            }
            m1076a(strM3025a, "retrieveVideoFile", mapM675a);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM3023a);
        if (uriFromFile == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to create URI from cached video file = " + fileM3023a);
            }
            m1076a(strM3025a, "extractUriFromVideoFile", mapM675a);
            return null;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finish caching video for ad #" + this.f946g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strM3025a);
        }
        return uriFromFile;
    }

    /* renamed from: c */
    public String m1081c(String str, List list, boolean z) {
        try {
            InputStream inputStreamM3024a = this.f949j.m3024a(str, list, z, AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g));
            if (inputStreamM3024a == null) {
                if (inputStreamM3024a == null) {
                    return null;
                }
                inputStreamM3024a.close();
                return null;
            }
            try {
                String strM3027a = this.f949j.m3027a(inputStreamM3024a);
                inputStreamM3024a.close();
                return strM3027a;
            } finally {
            }
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Unknown failure to read input stream.", th);
            }
            this.f778c.m3213a(this.f777b, th);
            this.f776a.m2832E().m2148a(this.f777b, "readInputStreamAsString", th);
            return null;
        }
    }

    /* renamed from: a */
    public List m1072a(List list) {
        this.f954o = list;
        return this.f776a.m2918r0().m398a(list, this.f952m);
    }

    /* renamed from: a */
    public C1011e0 m1069a(String str, C1011e0.a aVar) {
        return new C1011e0(str, this.f946g, this.f948i, this.f776a, aVar);
    }

    /* renamed from: a */
    public C1011e0 m1070a(String str, List list, boolean z, C1011e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.f778c.m3211a(this.f777b, "No video to cache, skipping...");
            return null;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching video " + str + "...");
        }
        return new C1011e0(str, this.f946g, list, z, this.f948i, this.f776a, new c(aVar));
    }

    /* renamed from: a */
    public C1001d0 m1068a(String str, List list, e eVar) {
        C1001d0 c1001d0 = new C1001d0(str, this.f946g, list, this.f953n, this.f948i, this.f776a, new d(eVar));
        this.f955p = c1001d0;
        return c1001d0;
    }

    /* renamed from: a */
    public Uri m1066a(Uri uri, String str) {
        if (uri == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching " + str + " image...");
        }
        return m1077b(string);
    }

    /* renamed from: b */
    public Uri m1077b(String str) {
        return m1067a(str, this.f946g.m2588c0(), true);
    }

    /* renamed from: a */
    public Uri m1067a(String str, List list, boolean z) {
        try {
            int iM3022a = this.f776a.m2837H().m3022a(str, this.f946g);
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g);
            String strM3025a = this.f949j.m3025a(m791a(), str, this.f946g.getCachePrefix(), list, z, iM3022a, this.f948i, mapM675a);
            if (StringUtils.isValidString(strM3025a)) {
                File fileM3023a = this.f949j.m3023a(strM3025a, m791a());
                if (fileM3023a != null) {
                    Uri uriFromFile = Uri.fromFile(fileM3023a);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (C1240o.m3200a()) {
                        this.f778c.m3214b(this.f777b, "Unable to extract Uri from image file");
                    }
                    m1076a(strM3025a, "extractUriFromImageFile", mapM675a);
                    return null;
                }
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Unable to retrieve File from cached image filename = " + strM3025a);
                }
                m1076a(strM3025a, "retrieveImageFile", mapM675a);
                return null;
            }
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Failed to cache image: " + str);
            }
            m1076a(str, "cacheImageResource", mapM675a);
            return null;
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Failed to cache image at url = " + str, th);
            }
            Map mapM675a2 = AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g);
            CollectionUtils.putStringIfValid("url", str, mapM675a2);
            this.f776a.m2832E().m2151a(this.f777b, "cacheImageResource", th, mapM675a2);
            return null;
        }
    }

    /* renamed from: a */
    public void m1074a(AbstractC1207b abstractC1207b) {
        String strM2613k0 = abstractC1207b.m2613k0();
        if (abstractC1207b.m2562V0() && StringUtils.isValidString(strM2613k0)) {
            String strM1071a = m1071a(strM2613k0, abstractC1207b.m2588c0(), abstractC1207b);
            abstractC1207b.m2587c(strM1071a);
            this.f778c.m3217f(this.f777b, "Ad updated with video button HTML assets cached = " + strM1071a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0039, code lost:
    
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m1071a(java.lang.String r12, java.util.List r13, com.applovin.impl.sdk.p005ad.AbstractC1207b r14) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L8
            goto Lf9
        L8:
            com.applovin.impl.sdk.k r0 = r11.f776a
            com.applovin.impl.v4 r1 = com.applovin.impl.C1268v4.f2563E0
            java.lang.Object r0 = r0.m2866a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L28
            boolean r13 = com.applovin.impl.sdk.C1240o.m3200a()
            if (r13 == 0) goto Lf9
            com.applovin.impl.sdk.o r13 = r11.f778c
            java.lang.String r14 = r11.f777b
            java.lang.String r0 = "Resource caching is disabled, skipping cache..."
            r13.m3211a(r14, r0)
            return r12
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.util.List r1 = r14.m2577a0()
            java.util.List r2 = r14.m2554R()
            java.util.Iterator r13 = r13.iterator()
        L39:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lfa
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = r4
        L47:
            int r6 = r0.length()
            if (r4 >= r6) goto L39
            boolean r4 = r11.m1087l()
            if (r4 == 0) goto L55
            goto Lf9
        L55:
            int r4 = r0.indexOf(r3, r5)
            r5 = -1
            if (r4 != r5) goto L5d
            goto L39
        L5d:
            int r5 = r0.length()
            r6 = r4
        L62:
            java.util.Collection r7 = r11.f950k
            char r8 = r0.charAt(r6)
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L77
            if (r6 >= r5) goto L77
            int r6 = r6 + 1
            goto L62
        L77:
            if (r6 <= r4) goto Lea
            if (r6 == r5) goto Lea
            int r5 = r3.length()
            int r5 = r5 + r4
            java.lang.String r5 = r0.substring(r5, r6)
            java.lang.String r7 = OooO0oO.OooOo.OooOoo0(r3, r5)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r8 == 0) goto Ld8
            boolean r8 = r2.contains(r7)
            if (r8 != 0) goto Ld8
            android.net.Uri r5 = r11.m1063a(r3, r5)
            if (r5 == 0) goto La5
            java.lang.String r7 = r5.toString()
            r0.replace(r4, r6, r7)
            r14.m2574a(r5)
            goto Le7
        La5:
            boolean r5 = r1.contains(r7)
            if (r5 == 0) goto Lb3
            r5 = -203(0xffffffffffffff35, float:NaN)
            r11.mo1073a(r5)
            r5 = 1
            r11.f951l = r5
        Lb3:
            boolean r5 = com.applovin.impl.sdk.C1240o.m3200a()
            if (r5 == 0) goto Lce
            com.applovin.impl.sdk.o r5 = r11.f778c
            java.lang.String r8 = r11.f777b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to cache HTML Resource: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r5.m3214b(r8, r9)
        Lce:
            java.util.Map r5 = com.applovin.impl.AbstractC1013e2.m675a(r14)
            java.lang.String r8 = "cacheHtmlResource"
            r11.m1076a(r7, r8, r5)
            goto Le7
        Ld8:
            boolean r7 = com.applovin.impl.sdk.C1240o.m3200a()
            if (r7 == 0) goto Le7
            com.applovin.impl.sdk.o r7 = r11.f778c
            java.lang.String r8 = r11.f777b
            java.lang.String r9 = "Skip caching of optional or non-resource: "
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0(r9, r5, r7, r8)
        Le7:
            r5 = r6
            goto L47
        Lea:
            boolean r13 = com.applovin.impl.sdk.C1240o.m3200a()
            if (r13 == 0) goto Lf9
            com.applovin.impl.sdk.o r13 = r11.f778c
            java.lang.String r14 = r11.f777b
            java.lang.String r0 = "Unable to cache resource; ad HTML is invalid."
            r13.m3214b(r14, r0)
        Lf9:
            return r12
        Lfa:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC1066j5.m1071a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    /* renamed from: a */
    private Uri m1063a(String str, String str2) {
        File fileM3023a = this.f949j.m3023a(AbstractC1078k7.m1170a(Uri.parse(str2), this.f946g.getCachePrefix(), this.f776a), C1220k.m2824o());
        if (fileM3023a == null) {
            return null;
        }
        if (!((Boolean) this.f776a.m2866a(C1268v4.f2569E6)).booleanValue() && this.f949j.m3029a(fileM3023a)) {
            return Uri.parse("file://" + fileM3023a.getAbsolutePath());
        }
        String strOooOoo0 = OooO0oO.OooOo.OooOoo0(str, str2);
        if (!this.f949j.m3030a(fileM3023a, strOooOoo0, Arrays.asList(str), this.f776a.m2837H().m3022a(strOooOoo0, this.f946g), this.f948i, AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g))) {
            return null;
        }
        return Uri.parse("file://" + fileM3023a.getAbsolutePath());
    }

    /* renamed from: a */
    public void mo1073a(int i) {
        if (this.f947h != null) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Calling back ad load failed with error code: " + i);
            }
            this.f947h.failedToReceiveAd(i);
            this.f947h = null;
        }
        m1084g();
    }

    /* renamed from: a */
    public void m1076a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f776a.m2832E().m572a(C0993c2.f554z0, str2, map2);
    }
}

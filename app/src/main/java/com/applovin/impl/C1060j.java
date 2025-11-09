package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C3007ch;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.j */
/* loaded from: classes.dex */
public class C1060j implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1220k f916a;

    /* renamed from: b */
    private final Object f917b = new Object();

    /* renamed from: c */
    private final LinkedHashMap f918c = new a();

    /* renamed from: d */
    private final Set f919d = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.j$a */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* renamed from: com.applovin.impl.j$b */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C1060j(C1220k c1220k) {
        this.f916a = c1220k;
        if (m1026c()) {
            AppLovinCommunicator.getInstance(C1220k.m2824o()).subscribe(this, "safedk_ad_info");
        }
    }

    /* renamed from: a */
    public Bundle m1027a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f917b) {
            bundle = (Bundle) this.f918c.get(str);
        }
        this.f916a.m2847O();
        if (C1240o.m3200a()) {
            this.f916a.m2847O().m3211a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    /* renamed from: b */
    public void m1029b(b bVar) {
        this.f919d.remove(bVar);
    }

    /* renamed from: c */
    public void m1030c(String str) {
        this.f916a.m2847O();
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Removing ad info for serve id: ", str, this.f916a.m2847O(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f917b) {
            this.f918c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "j";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f916a.m2847O();
                if (C1240o.m3200a()) {
                    this.f916a.m2847O().m3218k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f916a.m2847O();
                if (C1240o.m3200a()) {
                    this.f916a.m2847O().m3218k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f916a.m2847O();
                if (C1240o.m3200a()) {
                    this.f916a.m2847O().m3218k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString(C3007ch.f7763x);
            if (TextUtils.isEmpty(string)) {
                this.f916a.m2847O();
                if (C1240o.m3200a()) {
                    this.f916a.m2847O().m3218k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f917b) {
                try {
                    this.f916a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f916a.m2847O().m3211a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f918c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f916a.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Received SafeDK ad info with Ad Review creative id: ", string2, this.f916a.m2847O(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.f919d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.f919d);
            this.f916a.m2847O();
            if (C1240o.m3200a()) {
                this.f916a.m2847O().m3211a("AdReviewManager", "Notifying listeners: " + this.f919d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f916a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f916a, "creativeIdGenerated", new OooOo0O.OooO0O0(this, (b) it.next(), string, string2, 3)), C0987b6.b.OTHER);
            }
        }
    }

    /* renamed from: b */
    public static String m1024b() {
        return m1025b("getVersion");
    }

    /* renamed from: b */
    private static String m1025b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: a */
    public void m1028a(b bVar) {
        this.f919d.add(bVar);
    }

    /* renamed from: a */
    public static String m1022a() {
        return m1025b("getSdkKey");
    }

    /* renamed from: a */
    public /* synthetic */ void m1023a(b bVar, String str, String str2) {
        this.f916a.m2847O();
        if (C1240o.m3200a()) {
            this.f916a.m2847O().m3211a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    /* renamed from: c */
    public static boolean m1026c() {
        return StringUtils.isValidString(m1024b());
    }
}

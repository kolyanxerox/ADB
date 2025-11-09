package com.applovin.impl.sdk;

import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1216g;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeCrashReporter implements C1216g.d {

    /* renamed from: b */
    private static boolean f1947b;

    /* renamed from: c */
    private static boolean f1948c;

    /* renamed from: d */
    private static final NativeCrashReporter f1949d = new NativeCrashReporter();

    /* renamed from: a */
    private final HashMap f1950a = new HashMap();

    private NativeCrashReporter() {
    }

    /* renamed from: a */
    public static void m2462a(C1220k c1220k) {
        if (c1220k == null) {
            return;
        }
        if (!((Boolean) c1220k.m2866a(C1268v4.f2848n4)).booleanValue() && !AbstractC1078k7.m1253k(C1220k.m2824o())) {
            if (f1948c) {
                try {
                    C1216g c1216gM2907l = c1220k.m2907l();
                    NativeCrashReporter nativeCrashReporter = f1949d;
                    c1216gM2907l.m2727a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    c1220k.m2847O();
                    if (C1240o.m3200a()) {
                        c1220k.m2847O().m3212a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    c1220k.m2832E().m2148a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (m2464a()) {
            List listM2888c = c1220k.m2888c(C1268v4.f2856o4);
            int[] iArr = new int[listM2888c.size()];
            for (int i = 0; i < listM2888c.size(); i++) {
                try {
                    iArr[i] = Integer.parseInt((String) listM2888c.get(i));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(C1220k.m2824o().getCacheDir(), "al-reports");
            if (file.exists()) {
                m2463a(file, c1220k);
            } else if (!file.mkdir()) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3214b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f1949d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) c1220k.m2866a(C1268v4.f2864p4)).booleanValue());
                if (((Boolean) c1220k.m2866a(C1268v4.f2872q4)).booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(C1216g.c.LOADING);
                    hashSet.add(C1216g.c.LOAD);
                    hashSet.add(C1216g.c.SHOW);
                    hashSet.add(C1216g.c.CLICK);
                    hashSet.add(C1216g.c.SHOW_ERROR);
                    hashSet.add(C1216g.c.DESTROY);
                    c1220k.m2907l().m2728a(nativeCrashReporter2, hashSet);
                }
            } catch (Throwable th2) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                c1220k.m2832E().m2148a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z);

    private native void updateAdInfo(String str);

    /* renamed from: a */
    private static boolean m2464a() {
        if (!f1947b) {
            f1947b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f1948c = true;
            } catch (Throwable th) {
                C1240o.m3202b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return f1948c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m2463a(java.io.File r16, com.applovin.impl.sdk.C1220k r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.m2463a(java.io.File, com.applovin.impl.sdk.k):void");
    }

    @Override // com.applovin.impl.sdk.C1216g.d
    /* renamed from: a */
    public void mo2465a(C1216g.b bVar) {
        String strM2739h = bVar.m2739h();
        if (bVar.m2740i() == C1216g.c.DESTROY) {
            this.f1950a.remove(strM2739h);
        } else if (this.f1950a.containsKey(strM2739h)) {
            JsonUtils.putString((JSONObject) this.f1950a.get(strM2739h), "operation", bVar.m2740i().toString());
        } else {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "ad_unit_id", bVar.m2732a());
            JsonUtils.putString(jSONObject, "ad_format", bVar.m2738g());
            JsonUtils.putString(jSONObject, "network_name", bVar.m2734c());
            JsonUtils.putString(jSONObject, "adapter_class", bVar.m2733b());
            JsonUtils.putString(jSONObject, "adapter_version", bVar.m2735d());
            JsonUtils.putString(jSONObject, "bcode", bVar.m2736e());
            JsonUtils.putString(jSONObject, "creative_id", bVar.m2737f());
            JsonUtils.putString(jSONObject, "operation", bVar.m2740i().toString());
            this.f1950a.put(strM2739h, jSONObject);
        }
        try {
            updateAdInfo(new JSONArray(this.f1950a.values()).toString());
        } catch (Throwable unused) {
        }
    }
}

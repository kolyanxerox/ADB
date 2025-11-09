package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.C3034d9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.applovin.impl.g4 */
/* loaded from: classes.dex */
public class C1035g4 {

    /* renamed from: a */
    private final C1220k f773a;

    /* renamed from: b */
    private final Context f774b = C1220k.m2824o();

    /* renamed from: c */
    private String f775c;

    public C1035g4(C1220k c1220k) {
        this.f773a = c1220k;
    }

    /* renamed from: f */
    public /* synthetic */ void m780f() throws IOException {
        if (this.f775c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f774b.getResources().openRawResource(C1333R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f775c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
            }
        } catch (Throwable th3) {
            this.f773a.m2847O();
            if (C1240o.m3200a()) {
                this.f773a.m2847O().m3212a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th3);
            }
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m781g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f774b);
        this.f773a.m2847O();
        if (C1240o.m3200a()) {
            C1240o c1240oM2847O = this.f773a.m2847O();
            StringBuilder sb = new StringBuilder("Init ");
            sb.append(m787d() ? "succeeded" : C3034d9.h.f8131t);
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo(sb, "ms", c1240oM2847O, "OpenMeasurementService");
        }
        m782h();
    }

    /* renamed from: h */
    private void m782h() {
        this.f773a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f773a, "OpenMeasurementService", new o00O0O(this, 0)), C0987b6.b.OTHER);
    }

    /* renamed from: a */
    public String m783a() {
        return this.f775c;
    }

    /* renamed from: b */
    public Partner m785b() {
        return Partner.createPartner((String) this.f773a.m2866a(C1268v4.f2772e0), AppLovinSdk.VERSION);
    }

    /* renamed from: c */
    public String m786c() {
        return Omid.getVersion();
    }

    /* renamed from: d */
    public boolean m787d() {
        return Omid.isActive();
    }

    /* renamed from: e */
    public boolean m788e() {
        String str = this.f773a.m2912o0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    /* renamed from: i */
    public void m789i() {
        if (((Boolean) this.f773a.m2866a(C1268v4.f2764d0)).booleanValue()) {
            this.f773a.m2847O();
            if (C1240o.m3200a()) {
                this.f773a.m2847O().m3211a("OpenMeasurementService", "Initializing Open Measurement SDK v" + m786c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new o00O0O(this, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m784a(java.lang.String r4, java.util.Map r5) {
        /*
            r3 = this;
            boolean r0 = r3.m788e()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            com.applovin.impl.sdk.k r0 = r3.f773a     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = com.applovin.impl.AbstractC1045h4.m924a(r0, r5)     // Catch: java.lang.Throwable -> L17
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r5 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r5, r4)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r5 = move-exception
            goto L21
        L19:
            r5 = r4
        L1a:
            java.lang.String r0 = r3.f775c     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r0, r5)     // Catch: java.lang.Throwable -> L17
            return r4
        L21:
            com.applovin.impl.sdk.k r0 = r3.f773a
            r0.m2847O()
            boolean r0 = com.applovin.impl.sdk.C1240o.m3200a()
            if (r0 == 0) goto L39
            com.applovin.impl.sdk.k r0 = r3.f773a
            com.applovin.impl.sdk.o r0 = r0.m2847O()
            java.lang.String r1 = "OpenMeasurementService"
            java.lang.String r2 = "Failed to inject JavaScript SDK into HTML"
            r0.m3212a(r1, r2, r5)
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1035g4.m784a(java.lang.String, java.util.Map):java.lang.String");
    }
}

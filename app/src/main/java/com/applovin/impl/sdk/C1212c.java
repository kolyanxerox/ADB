package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1268v4;
import com.applovin.impl.InterfaceC1135n4;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdType;
import com.ironsource.C3007ch;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c */
/* loaded from: classes.dex */
public class C1212c {

    /* renamed from: b */
    private static final File f2019b = new File(C1220k.m2824o().getFilesDir(), "al/persisted-ads");

    /* renamed from: a */
    private final C1220k f2020a;

    /* renamed from: com.applovin.impl.sdk.c$a */
    public static class a implements InterfaceC1135n4 {

        /* renamed from: a */
        private final String f2021a;

        /* renamed from: b */
        private final AppLovinAdType f2022b;

        /* renamed from: c */
        private final boolean f2023c;

        /* renamed from: d */
        private final long f2024d;

        /* renamed from: e */
        private final long f2025e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z, long j, long j2) {
            this.f2021a = str;
            this.f2022b = appLovinAdType;
            this.f2023c = z;
            this.f2024d = j;
            this.f2025e = j2;
        }

        /* renamed from: a */
        public boolean m2675a(Object obj) {
            return obj instanceof a;
        }

        /* renamed from: b */
        public long m2676b() {
            return this.f2025e;
        }

        /* renamed from: c */
        public long m2677c() {
            return this.f2024d;
        }

        /* renamed from: d */
        public String m2678d() {
            return this.f2021a + "_" + this.f2022b;
        }

        /* renamed from: e */
        public String m2679e() {
            return this.f2021a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.m2675a(this)) {
                return false;
            }
            String strM2679e = m2679e();
            String strM2679e2 = aVar.m2679e();
            if (strM2679e != null ? !strM2679e.equals(strM2679e2) : strM2679e2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeM2680f = m2680f();
            AppLovinAdType appLovinAdTypeM2680f2 = aVar.m2680f();
            return appLovinAdTypeM2680f != null ? appLovinAdTypeM2680f.equals(appLovinAdTypeM2680f2) : appLovinAdTypeM2680f2 == null;
        }

        /* renamed from: f */
        public AppLovinAdType m2680f() {
            return this.f2022b;
        }

        /* renamed from: g */
        public boolean m2681g() {
            return this.f2023c;
        }

        public int hashCode() {
            String strM2679e = m2679e();
            int iHashCode = strM2679e == null ? 43 : strM2679e.hashCode();
            AppLovinAdType appLovinAdTypeM2680f = m2680f();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeM2680f != null ? appLovinAdTypeM2680f.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + m2679e() + ", type=" + m2680f() + ", isAdServerAd=" + m2681g() + ", expiryTimeMillis=" + m2677c() + ", appLaunchTimestamp=" + m2676b() + ")";
        }

        /* renamed from: a */
        public static a m2672a(AbstractC1207b abstractC1207b) {
            return m2673a(abstractC1207b, 0L, 0L);
        }

        /* renamed from: a */
        public static a m2673a(AbstractC1207b abstractC1207b, long j, long j2) {
            if (abstractC1207b == null) {
                return null;
            }
            return new a(StringUtils.isValidString(abstractC1207b.getMediationServeId()) ? abstractC1207b.getMediationServeId() : UUID.randomUUID().toString(), abstractC1207b.getType(), abstractC1207b instanceof C1206a, SystemClock.elapsedRealtime() + j, j2);
        }

        /* renamed from: a */
        public static a m2674a(JSONObject jSONObject, C1220k c1220k) {
            String string = JsonUtils.getString(jSONObject, C3007ch.f7763x, "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j2 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j, j2);
        }

        @Override // com.applovin.impl.InterfaceC1135n4
        /* renamed from: a */
        public JSONObject mo1363a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, C3007ch.f7763x, this.f2021a);
            JsonUtils.putString(jSONObject, "type", this.f2022b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f2023c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f2024d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f2025e);
            return jSONObject;
        }
    }

    /* renamed from: com.applovin.impl.sdk.c$b */
    public interface b {
        /* renamed from: a */
        void mo0a(a aVar);
    }

    /* renamed from: com.applovin.impl.sdk.c$c */
    public interface c {
        /* renamed from: a */
        void mo1975a(AbstractC1207b abstractC1207b, String str);
    }

    public C1212c(C1220k c1220k) {
        this.f2020a = c1220k;
    }

    /* renamed from: a */
    public /* synthetic */ void m2662a(AbstractC1207b abstractC1207b, b bVar) {
        a aVarM2673a = a.m2673a(abstractC1207b, ((Long) this.f2020a.m2866a(C1268v4.f2723Y0)).longValue(), C1220k.m2823n());
        File fileM2661a = m2661a(aVarM2673a);
        if (fileM2661a == null) {
            m2665a("Could not persist incompatible ad", abstractC1207b, bVar);
            return;
        }
        try {
            JSONObject jSONObjectMo1363a = abstractC1207b.mo1363a();
            if (jSONObjectMo1363a == null) {
                m2665a("Could not serialize ad for persistence", abstractC1207b, bVar);
                return;
            }
            if (this.f2020a.m2837H().m3031a((InputStream) new ByteArrayInputStream(jSONObjectMo1363a.toString().getBytes("UTF-8")), fileM2661a, true)) {
                m2663a(aVarM2673a, abstractC1207b, bVar);
            } else {
                m2665a("Failed to write persisted ad to disk", abstractC1207b, bVar);
            }
        } catch (Throwable th) {
            m2665a("Ad could not be persisted", abstractC1207b, bVar);
            this.f2020a.m2832E().m2153a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    /* renamed from: b */
    public void m2670b(AbstractC1207b abstractC1207b, b bVar) {
        if (m2666b()) {
            this.f2020a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2020a, "persistAd", new OooO00o(this, abstractC1207b, bVar, 2)), C0987b6.b.CACHING);
        } else {
            m2665a("Ad Persistence directory could not be created", abstractC1207b, bVar);
        }
    }

    /* renamed from: b */
    private boolean m2666b() {
        File file = f2019b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    /* renamed from: b */
    public void m2671b(a aVar) {
        File fileM2661a = m2661a(aVar);
        if (fileM2661a != null) {
            fileM2661a.delete();
        }
    }

    /* renamed from: a */
    public void m2668a(a aVar, c cVar) {
        File fileM2661a = m2661a(aVar);
        if (fileM2661a != null && fileM2661a.exists()) {
            this.f2020a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2020a, "retrievePersistedAd", new OooOo0O.OooO0O0(this, fileM2661a, cVar, aVar, 11)), C0987b6.b.OTHER);
        } else {
            cVar.mo1975a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m2664a(File file, c cVar, a aVar) throws Throwable {
        AbstractC1207b abstractC1207bM1340a;
        String strM3038f = this.f2020a.m2837H().m3038f(file);
        if (strM3038f == null) {
            cVar.mo1975a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strM3038f, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.m2681g()) {
                abstractC1207bM1340a = C1206a.m2482a(jSONObjectJsonObjectFromJsonString, this.f2020a);
            } else {
                abstractC1207bM1340a = C1088l7.m1340a(jSONObjectJsonObjectFromJsonString, this.f2020a);
            }
            if (abstractC1207bM1340a == null) {
                cVar.mo1975a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                cVar.mo1975a(abstractC1207bM1340a, null);
            }
        } catch (Throwable th) {
            cVar.mo1975a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f2020a.m2832E().m2153a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    /* renamed from: a */
    private File m2661a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f2019b.getAbsolutePath() + "/" + aVar.m2678d());
    }

    /* renamed from: a */
    private void m2663a(a aVar, AbstractC1207b abstractC1207b, b bVar) {
        if (bVar == null) {
            return;
        }
        this.f2020a.m2847O();
        if (C1240o.m3200a()) {
            this.f2020a.m2847O().m3211a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar.mo0a(aVar);
        this.f2020a.m2897g().m705a(C0993c2.f477G, abstractC1207b);
    }

    /* renamed from: a */
    private void m2665a(String str, AbstractC1207b abstractC1207b, b bVar) {
        if (bVar == null) {
            return;
        }
        this.f2020a.m2847O();
        if (C1240o.m3200a()) {
            this.f2020a.m2847O().m3211a("AdPersistenceFileService", str);
        }
        bVar.mo0a(null);
        Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207b);
        CollectionUtils.putStringIfValid("error_message", str, mapM675a);
        this.f2020a.m2897g().m576d(C0993c2.f479H, mapM675a);
    }

    /* renamed from: a */
    public void m2669a(List list) {
        File[] fileArrListFiles = f2019b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).m2678d().equals(file.getName())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public void m2667a() {
        File[] fileArrListFiles;
        File file = f2019b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}

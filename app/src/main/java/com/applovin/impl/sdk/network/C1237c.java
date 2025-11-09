package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1222m;
import com.applovin.impl.sdk.C1240o;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.c */
/* loaded from: classes.dex */
public class C1237c extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final C1236b f2305g;

    /* renamed from: h */
    private final C1240o f2306h;

    /* renamed from: i */
    private AtomicBoolean f2307i;

    /* renamed from: j */
    private boolean f2308j;

    public C1237c(C1236b c1236b, C1220k c1220k) {
        super("PersistentPostbackQueueSaveTask", c1220k);
        this.f2307i = new AtomicBoolean();
        this.f2308j = false;
        this.f2305g = c1236b;
        this.f2306h = c1220k.m2847O();
    }

    /* renamed from: a */
    public List m3133a(int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        C1222m c1222mM2837H = this.f776a.m2837H();
        if (!c1222mM2837H.m3033b("persistent_postback_cache.json", C1220k.m2824o())) {
            C1240o.m3207h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileM3023a = c1222mM2837H.m3023a("persistent_postback_cache.json", C1220k.m2824o());
        String strM3038f = c1222mM2837H.m3038f(fileM3023a);
        if (TextUtils.isEmpty(strM3038f)) {
            C1240o.m3207h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONObject(strM3038f).getJSONArray("pb");
            if (C1240o.m3200a()) {
                this.f2306h.m3211a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f776a.m2866a(C1268v4.f2581G2);
            for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                try {
                    C1238d c1238d = new C1238d(jSONArray.getJSONObject(i2), this.f776a);
                    if (c1238d.m3136c() < num.intValue()) {
                        arrayList.add(c1238d);
                    } else {
                        C1240o.m3207h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + c1238d);
                    }
                } catch (Throwable th) {
                    C1240o.m3204c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f776a.m2832E().m2148a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (C1240o.m3200a()) {
                this.f2306h.m3211a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                C1240o.m3204c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                this.f776a.m2832E().m2148a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                if (((Boolean) this.f776a.m2866a(C1268v4.f2635N0)).booleanValue()) {
                    c1222mM2837H.m3028a(fileM3023a, "removeAfterDeserializationFail");
                }
            } catch (Throwable th4) {
                th = th4;
                z = true;
                if (z && ((Boolean) this.f776a.m2866a(C1268v4.f2635N0)).booleanValue()) {
                    c1222mM2837H.m3028a(fileM3023a, "removeAfterDeserializationFail");
                }
                throw th;
            }
        }
        this.f2308j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        m3132a(this.f2305g.m3130d());
    }

    /* renamed from: a */
    private void m3132a(List list) {
        if (!(this.f2308j && list.isEmpty()) && this.f2307i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1238d c1238d = (C1238d) it.next();
                try {
                    jSONArray.put(c1238d.m3150q());
                } catch (Throwable th) {
                    C1240o.m3204c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + c1238d, th);
                    this.f776a.m2832E().m2148a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                C1222m c1222mM2837H = this.f776a.m2837H();
                if (c1222mM2837H.m3031a((InputStream) byteArrayInputStream, c1222mM2837H.m3023a("persistent_postback_cache.json", C1220k.m2824o()), true)) {
                    if (C1240o.m3200a()) {
                        this.f2306h.m3211a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (C1240o.m3200a()) {
                    this.f2306h.m3214b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                C1240o.m3204c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f776a.m2832E().m2148a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f2307i.set(false);
        }
    }
}

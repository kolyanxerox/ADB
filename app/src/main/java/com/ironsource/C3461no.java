package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.C3412v;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.no */
/* loaded from: classes2.dex */
public final class C3461no {

    /* renamed from: a */
    private final ConcurrentHashMap<String, JSONObject> f10564a;

    public C3461no() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3461no m11031a(C3461no c3461no, ConcurrentHashMap concurrentHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = c3461no.f10564a;
        }
        return c3461no.m11033a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3461no) && kotlin.jvm.internal.OooOo.OooO00o(this.f10564a, ((C3461no) obj).f10564a);
    }

    public int hashCode() {
        return this.f10564a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f10564a + ')';
    }

    public C3461no(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkDataMap, "networkDataMap");
        this.f10564a = networkDataMap;
    }

    /* renamed from: a */
    public final C3461no m11033a(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkDataMap, "networkDataMap");
        return new C3461no(networkDataMap);
    }

    public /* synthetic */ C3461no(ConcurrentHashMap concurrentHashMap, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    /* renamed from: a */
    private final ConcurrentHashMap<String, JSONObject> m11032a() {
        return this.f10564a;
    }

    /* renamed from: a */
    public final void m11034a(AbstractAdapter adapter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f10564a.entrySet();
        kotlin.jvm.internal.OooOo.OooO0Oo(setEntrySet, "networkDataMap.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (C3367c.m10095a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            kotlin.jvm.internal.OooOo.OooO0Oo(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.OooOo.OooO0Oo(value, "it.value");
            adapter.setNetworkData(new C3412v((String) key, (JSONObject) value));
        }
    }

    /* renamed from: a */
    public final void m11035a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f10564a.entrySet();
        kotlin.jvm.internal.OooOo.OooO0Oo(setEntrySet, "networkDataMap.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (C3367c.m10096a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Map.Entry entry = (Map.Entry) obj2;
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            kotlin.jvm.internal.OooOo.OooO0OO(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            kotlin.jvm.internal.OooOo.OooO0Oo(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.OooOo.OooO0Oo(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new C3412v((String) key, (JSONObject) value));
        }
    }

    /* renamed from: a */
    public final void m11036a(C3412v networkData) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkData, "networkData");
        if (!this.f10564a.containsKey(networkData.m10697a())) {
            this.f10564a.put(networkData.m10697a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f10564a;
            String strM10697a = networkData.m10697a();
            JSONObject jSONObject = this.f10564a.get(networkData.m10697a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectDeepMergeJSONObjects = IronSourceUtils.deepMergeJSONObjects(jSONObject, networkData.allData());
            kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectDeepMergeJSONObjects, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(strM10697a, jSONObjectDeepMergeJSONObjects);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }
}

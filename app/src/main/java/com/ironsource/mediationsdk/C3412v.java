package com.ironsource.mediationsdk;

import com.ironsource.C3805wj;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0.Oooo000;
import o00O0o.OooOO0;
import o00O0o.o0OoOo0;
import o00O0oO.o0000O00;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v */
/* loaded from: classes2.dex */
public final class C3412v implements AdapterNetworkData {

    /* renamed from: a */
    private final String f10177a;

    /* renamed from: b */
    private final JSONObject f10178b;

    public C3412v(String networkName, JSONObject data) {
        OooOo.OooO0o0(networkName, "networkName");
        OooOo.OooO0o0(data, "data");
        this.f10177a = networkName;
        this.f10178b = new JSONObject(data.toString());
    }

    /* renamed from: a */
    public final String m10697a() {
        return this.f10177a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject allData() {
        return this.f10178b;
    }

    /* renamed from: b */
    public final void m10699b() {
        Iterator<String> itKeys = this.f10178b.keys();
        OooOo.OooO0Oo(itKeys, "networkData.keys()");
        C3805wj.m12898i().mo12605a(new C3899zb(EnumC2638ac.SET_NETWORK_DATA, IronSourceUtils.getMediationAdditionalData(false).put(IronSourceConstants.EVENTS_EXT1, androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder(), this.f10177a, " - ", OooOo00.OooOooo(o0OoOo0.Oooo0oo(o0OoOo0.Oooo0(itKeys)), ",", null, null, null, 62)))));
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String desiredKey, Class<T> valueType) {
        Object next;
        OooOo.OooO0o0(desiredKey, "desiredKey");
        OooOo.OooO0o0(valueType, "valueType");
        Iterator<String> itKeys = allData().keys();
        OooOo.OooO0Oo(itKeys, "allData()\n          .keys()");
        Iterator it = ((OooOO0) o0OoOo0.Oooo0(itKeys)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (o0000O00.Oooo000((String) next, desiredKey)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            Object objOpt = allData().opt(str);
            if (!valueType.isInstance(objOpt)) {
                objOpt = null;
            }
            if (objOpt != null) {
                return valueType.cast(objOpt);
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject networkDataByAdUnit(IronSource.AD_UNIT adUnit) {
        OooOo.OooO0o0(adUnit, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.f10178b.optJSONObject(adUnit.toString());
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.f10177a + ", networkData=" + this.f10178b + ')';
    }

    /* renamed from: a */
    private final void m10695a(Collection<? extends AbstractAdapter> collection) {
        ArrayList arrayListOooOoO = OooOo00.OooOoO(collection);
        ArrayList arrayList = new ArrayList();
        int size = arrayListOooOoO.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListOooOoO.get(i2);
            i2++;
            if (C3367c.m10095a(this.f10177a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((AbstractAdapter) obj2).setNetworkData(this);
        }
    }

    /* renamed from: a */
    public final void m10698a(Collection<? extends AbstractAdapter> adapters, Collection<? extends AdapterBaseWrapper> networkAdapters) {
        OooOo.OooO0o0(adapters, "adapters");
        OooOo.OooO0o0(networkAdapters, "networkAdapters");
        try {
            m10695a(adapters);
            m10696b(networkAdapters);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while setting network data: " + e.getMessage());
        }
    }

    /* renamed from: b */
    private final void m10696b(Collection<? extends AdapterBaseWrapper> collection) {
        ArrayList arrayListOooOoO = OooOo00.OooOoO(collection);
        ArrayList arrayList = new ArrayList();
        int size = arrayListOooOoO.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListOooOoO.get(i2);
            i2++;
            if (C3367c.m10096a(this.f10177a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Oooo000.OooOo0(arrayList, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(((AdapterBaseWrapper) obj2).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            if (obj3 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj3);
            }
        }
        int size4 = arrayList3.size();
        while (i < size4) {
            Object obj4 = arrayList3.get(i);
            i++;
            ((AdapterNetworkDataInterface) obj4).setNetworkData(this);
        }
    }
}

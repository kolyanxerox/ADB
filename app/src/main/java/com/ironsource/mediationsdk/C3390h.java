package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.h */
/* loaded from: classes2.dex */
public class C3390h {

    /* renamed from: c */
    public static final int f9810c = -1;

    /* renamed from: d */
    public static final int f9811d = 0;

    /* renamed from: a */
    private ConcurrentHashMap<String, ArrayList<a>> f9812a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f9813b;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C3390h(List<NetworkSettings> list, int i) {
        this.f9813b = i;
        for (NetworkSettings networkSettings : list) {
            this.f9812a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    /* renamed from: a */
    public String mo10287a(String str) {
        ArrayList<a> arrayList = this.f9812a.get(str);
        String string = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            string = "" + it.next().ordinal();
            while (it.hasNext()) {
                StringBuilder sbOooOo0O = OooOo.OooOo0O(OooOo.OooOoo0(string, ","));
                sbOooOo0O.append(it.next().ordinal());
                string = sbOooOo0O.toString();
            }
        }
        return string;
    }

    /* renamed from: a */
    public void m10288a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f9813b == 0) {
            return;
        }
        for (String str : this.f9812a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f9812a.get(str);
            if (this.f9813b != -1 && arrayList.size() == this.f9813b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}

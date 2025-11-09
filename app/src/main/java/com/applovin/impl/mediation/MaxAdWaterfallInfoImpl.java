package com.applovin.impl.mediation;

import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C1284x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a */
    private final AbstractC1266v2 f1217a;

    /* renamed from: b */
    private final String f1218b;

    /* renamed from: c */
    private final String f1219c;

    /* renamed from: d */
    private final List f1220d;

    /* renamed from: e */
    private final long f1221e;

    /* renamed from: f */
    private final C1284x2 f1222f;

    /* renamed from: g */
    private final List f1223g;

    /* renamed from: h */
    private final String f1224h;

    /* renamed from: i */
    private final String f1225i;

    public MaxAdWaterfallInfoImpl(AbstractC1266v2 abstractC1266v2, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(abstractC1266v2, abstractC1266v2.m3521S(), abstractC1266v2.m3522T(), j, list, abstractC1266v2.m3515M(), abstractC1266v2.m3520R(), str, abstractC1266v2.m3518P());
    }

    public String getEventId() {
        return this.f1225i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f1221e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f1217a;
    }

    public String getMCode() {
        return this.f1224h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f1218b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f1220d;
    }

    public List<String> getPostbackUrls() {
        return this.f1223g;
    }

    public C1284x2 getRequestParameters() {
        return this.f1222f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f1219c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f1218b + ", testName=" + this.f1219c + ", networkResponses=" + this.f1220d + ", latencyMillis=" + this.f1221e + '}';
    }

    public MaxAdWaterfallInfoImpl(AbstractC1266v2 abstractC1266v2, String str, String str2, long j, List<MaxNetworkResponseInfo> list, C1284x2 c1284x2, List<String> list2, String str3, String str4) {
        this.f1217a = abstractC1266v2;
        this.f1218b = str;
        this.f1219c = str2;
        this.f1221e = j;
        this.f1220d = list;
        this.f1222f = c1284x2;
        this.f1223g = list2;
        this.f1224h = str3;
        this.f1225i = str4;
    }
}

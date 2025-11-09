package com.ironsource.mediationsdk;

import com.ironsource.C3013cn;
import com.ironsource.C3353m5;
import com.ironsource.C3576r;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.m */
/* loaded from: classes2.dex */
public abstract class AbstractC3400m {

    /* renamed from: a */
    private HashSet<ImpressionDataListener> f9906a;

    /* renamed from: b */
    protected C3576r f9907b;

    /* renamed from: c */
    protected IronSourceSegment f9908c;

    /* renamed from: d */
    protected AdInfo f9909d;

    public AbstractC3400m(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        new HashSet();
        this.f9906a = hashSet;
        this.f9907b = new C3576r();
        this.f9908c = ironSourceSegment;
    }

    /* renamed from: a */
    public void m10386a(C3353m5 c3353m5, String str) {
        HashSet hashSet;
        if (c3353m5 == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData impressionDataM9983a = c3353m5.m9983a(str);
        if (impressionDataM9983a != null) {
            synchronized (this) {
                hashSet = (HashSet) this.f9906a.clone();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataM9983a);
                impressionDataListener.onImpressionSuccess(impressionDataM9983a);
            }
        }
    }

    /* renamed from: b */
    public void m10392b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f9906a.add(impressionDataListener);
        }
    }

    /* renamed from: c */
    public void m10393c() {
        synchronized (this) {
            this.f9906a.clear();
        }
    }

    /* renamed from: e */
    public String m10394e() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* renamed from: f */
    public void m10395f() {
        this.f9909d = null;
    }

    /* renamed from: a */
    public void m10387a(IronSource.AD_UNIT ad_unit) {
        this.f9907b.mo8948a(ad_unit, false);
    }

    /* renamed from: a */
    public void m10388a(IronSourceSegment ironSourceSegment) {
        this.f9908c = ironSourceSegment;
    }

    /* renamed from: a */
    public void m10389a(ImpressionData impressionData, C3013cn c3013cn) {
        if (impressionData != null) {
            this.f9909d = new AdInfo(impressionData, c3013cn);
        }
    }

    /* renamed from: a */
    public void m10390a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f9906a.remove(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void m10391a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f9907b.mo8948a(ad_unit, jSONObject != null ? jSONObject.optBoolean(C3368d.f9608f, false) : false);
    }
}

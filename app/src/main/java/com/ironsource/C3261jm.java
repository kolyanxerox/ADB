package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import org.json.JSONObject;

/* renamed from: com.ironsource.jm */
/* loaded from: classes2.dex */
public final class C3261jm implements ImpressionDataListener {

    /* renamed from: a */
    private final LevelPlayImpressionDataListener f9129a;

    public C3261jm(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f9129a = listener;
    }

    /* renamed from: a */
    public final LevelPlayImpressionDataListener m9520a() {
        return this.f9129a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3261jm) {
            return kotlin.jvm.internal.OooOo.OooO00o(this.f9129a, ((C3261jm) obj).f9129a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9129a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(ImpressionData impressionData) {
        kotlin.jvm.internal.OooOo.OooO0o0(impressionData, "impressionData");
        if (impressionData.getAllData() != null) {
            JSONObject allData = impressionData.getAllData();
            kotlin.jvm.internal.OooOo.OooO0Oo(allData, "impressionData.allData");
            this.f9129a.onImpressionSuccess(new LevelPlayImpressionData(allData));
        }
    }
}

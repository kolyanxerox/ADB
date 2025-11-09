package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes2.dex */
public final class h60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f19572OooO00o;

    public h60(Context context) {
        this.f19572OooO00o = context;
    }

    public final o00000oO.OooOOO OooO00o(boolean z) {
        try {
            GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z).build();
            TopicsManagerFutures topicsManagerFuturesFrom = TopicsManagerFutures.from(this.f19572OooO00o);
            return topicsManagerFuturesFrom != null ? topicsManagerFuturesFrom.getTopicsAsync(getTopicsRequestBuild) : ii0.Ooooo00(new IllegalStateException());
        } catch (Exception e) {
            return ii0.Ooooo00(e);
        }
    }
}

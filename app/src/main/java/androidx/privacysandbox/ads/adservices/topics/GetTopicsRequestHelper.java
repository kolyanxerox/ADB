package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.measurement.OooO00o;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class GetTopicsRequestHelper {
    public static final GetTopicsRequestHelper INSTANCE = new GetTopicsRequestHelper();

    private GetTopicsRequestHelper() {
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithRecordObservation$ads_adservices_release(GetTopicsRequest request) {
        OooOo.OooO0o0(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = OooO00o.OooOO0o().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.shouldRecordObservation()).build();
        OooOo.OooO0Oo(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithoutRecordObservation$ads_adservices_release(GetTopicsRequest request) {
        OooOo.OooO0o0(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = OooO00o.OooOO0o().setAdsSdkName(request.getAdsSdkName()).build();
        OooOo.OooO0Oo(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}

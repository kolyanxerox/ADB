package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.measurement.OooO00o;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext5Impl(Context context) {
        OooOo.OooO0o0(context, "context");
        Object systemService = context.getSystemService((Class<Object>) OooO00o.OooOo0());
        OooOo.OooO0Oo(systemService, "context.getSystemService…opicsManager::class.java)");
        super(OooO00o.OooOo00(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest request) {
        OooOo.OooO0o0(request, "request");
        return GetTopicsRequestHelper.INSTANCE.convertRequestWithRecordObservation$ads_adservices_release(request);
    }
}

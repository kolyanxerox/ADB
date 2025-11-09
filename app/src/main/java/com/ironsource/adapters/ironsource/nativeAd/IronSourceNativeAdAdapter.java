package com.ironsource.adapters.ironsource.nativeAd;

import OooOo0O.OooO0O0;
import android.app.Activity;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3034d9;
import com.ironsource.C3837xh;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private C3837xh nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter adapter) {
        super(adapter);
        OooOo.OooO0o0(adapter, "adapter");
    }

    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(config, "$config");
        OooOo.OooO0o0(listener, "$listener");
        try {
            C3837xh c3837xhM13063a = C3837xh.f12643j.m13063a();
            c3837xhM13063a.mo7929a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(c3837xhM13063a, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject jSONObjectPrepareLoadParams = this$0.prepareLoadParams(config, str);
            OooOo.OooO0Oo(activity, "activity");
            c3837xhM13063a.mo7928a(activity, jSONObjectPrepareLoadParams);
            this$0.nativeAd = c3837xhM13063a;
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "IronSourceAdapter loadNativeAd exception ");
            sbOooOOO0.append(e.getMessage());
            listener.onNativeAdLoadFailed(new IronSourceError(510, sbOooOOO0.toString()));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) throws JSONException {
        JSONObject loadParams = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(C3034d9.f7907r, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION).put("inAppBidding", true).put(getAdapter().ADM_KEY, C3368d.m10127b().m10129a(str));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        OooOo.OooO0Oo(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        OooOo.OooO0Oo(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject config) {
        OooOo.OooO0o0(config, "config");
        C3837xh c3837xh = this.nativeAd;
        if (c3837xh != null) {
            c3837xh.destroy();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject jSONObject) {
        OooOo.OooO0o0(config, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        OooOo.OooO0o0(config, "config");
        OooOo.OooO0o0(listener, "listener");
        getAdapter().initSDK(str, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(JSONObject config, JSONObject jSONObject, String str, NativeAdSmashListener listener) {
        OooOo.OooO0o0(config, "config");
        OooOo.OooO0o0(listener, "listener");
        postOnUIThread(new OooO0O0(this, config, listener, str, 25));
    }

    @Override // com.ironsource.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT adUnit, JSONObject jSONObject) {
        OooOo.OooO0o0(adUnit, "adUnit");
    }
}

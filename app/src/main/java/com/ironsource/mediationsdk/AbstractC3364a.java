package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.C3702tk;
import com.ironsource.InterfaceC2634a8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3364a<Listener extends AdapterAdListener> extends BaseAdAdapter<C3410u, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, InterfaceC2634a8 {

    /* renamed from: a */
    protected AbstractAdapter f9553a;

    /* renamed from: b */
    protected WeakReference<Listener> f9554b;

    public AbstractC3364a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        super(ad_unit, networkSettings, uuid);
        this.f9554b = new WeakReference<>(null);
        this.f9553a = abstractAdapter;
    }

    /* renamed from: a */
    public static AbstractC3364a<?> m10030a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return new C3416z(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return new C3403o(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return new C3393j(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return new C3409t(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
        return null;
    }

    /* renamed from: b */
    private void m10032b(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbOooOoO0 = OooOo.OooOoO0("Method '", str, "' is not supported for ");
        sbOooOoO0.append(getClass().getName());
        ironLog.error(m10034a(sbOooOoO0.toString()));
    }

    /* renamed from: a */
    public abstract void mo10036a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    /* renamed from: b */
    public abstract IronSource.AD_UNIT mo10038b();

    /* renamed from: c */
    public boolean mo10040c(JSONObject jSONObject) {
        m10032b("isAdAvailable");
        return false;
    }

    @Override // com.ironsource.InterfaceC2634a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        mo10037a(C3702tk.m12447a(adData.getConfiguration()), C3702tk.m12447a(adData.getAdUnitData()), biddingDataCallback);
    }

    /* renamed from: d */
    public void mo10041d(JSONObject jSONObject) {
        m10032b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(AdData adData) {
        mo10035a(C3702tk.m12447a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void disposeAd(AdData adData) {
        mo10039b(C3702tk.m12447a(adData.getConfiguration()));
    }

    /* renamed from: e */
    public void mo10042e(JSONObject jSONObject) {
        m10032b("onAdViewWillBind");
    }

    /* renamed from: f */
    public void mo10043f(JSONObject jSONObject) {
        m10032b("showAd");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return mo10040c(C3702tk.m12447a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        m10031a(adData, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(AdData adData) {
        mo10041d(C3702tk.m12447a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(AdData adData) {
        mo10042e(C3702tk.m12447a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public void releaseMemory() {
        IronLog.INTERNAL.verbose(m10033a());
        AbstractAdapter abstractAdapter = this.f9553a;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(mo10038b(), new JSONObject());
            this.f9553a = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Listener listener) {
        this.f9554b = new WeakReference<>(listener);
        mo10043f(C3702tk.m12447a(adData.getConfiguration()));
    }

    /* renamed from: a */
    public String m10033a() {
        return m10034a((String) null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(AdData adData, Activity activity, Listener listener) {
        m10031a(adData, listener);
    }

    /* renamed from: a */
    public String m10034a(String str) {
        String string = mo10038b().toString();
        return TextUtils.isEmpty(str) ? string : OooOo.OooOoo(string, " - ", str);
    }

    /* renamed from: b */
    public void mo10039b(JSONObject jSONObject) {
        m10032b("disposeAd");
    }

    /* renamed from: a */
    private void m10031a(AdData adData, Listener listener) {
        this.f9554b = new WeakReference<>(listener);
        mo10036a(C3702tk.m12447a(adData.getConfiguration()), C3702tk.m12447a(adData.getAdUnitData()), adData);
    }

    /* renamed from: a */
    public void mo10035a(JSONObject jSONObject) {
        m10032b("destroyAd");
    }

    /* renamed from: a */
    public void mo10037a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        m10032b("collectBiddingData");
    }
}

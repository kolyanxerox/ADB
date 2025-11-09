package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3359mb;
import com.ironsource.C3736uj;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC3692ta;
import com.ironsource.InterfaceC3733ug;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.C3388f;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3377h;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3378i;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3384o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* renamed from: com.ironsource.mediationsdk.demandOnly.f */
/* loaded from: classes2.dex */
public class C3375f implements InterfaceC3378i.b {

    /* renamed from: a */
    private final InterfaceC3692ta f9709a;

    /* renamed from: b */
    private final ConcurrentHashMap<String, C3376g> f9710b;

    /* renamed from: c */
    private final InterfaceC3733ug<ISDemandOnlyInterstitialListener> f9711c;

    public C3375f(List<NetworkSettings> list, C3736uj c3736uj, C3367c c3367c, InterfaceC3733ug<ISDemandOnlyInterstitialListener> interfaceC3733ug, String str, String str2, InterfaceC3692ta interfaceC3692ta) throws JSONException {
        String sessionId = IronSourceUtils.getSessionId();
        boolean zM12693j = c3736uj.m12693j();
        C3388f c3388f = new C3388f(c3736uj.m12690g(), sessionId);
        this.f9710b = new ConcurrentHashMap<>();
        this.f9709a = interfaceC3692ta;
        this.f9711c = interfaceC3733ug;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterM10112a = c3367c.m10112a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterM10112a != null) {
                    C3376g c3376g = new C3376g(str, str2, networkSettings, this.f9711c.mo12671a(networkSettings.getSubProviderId()), c3736uj.m12688e(), abstractAdapterM10112a, new C3387e(c3388f));
                    c3376g.m10243a(zM12693j);
                    this.f9710b.put(networkSettings.getSubProviderId(), c3376g);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: a */
    public ConcurrentHashMap<String, C3376g> m10183a() {
        return this.f9710b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3378i.b
    /* renamed from: b */
    public boolean mo10186b(String str) {
        C3376g c3376g = this.f9710b.get(str);
        if (c3376g != null) {
            return c3376g.mo10199a();
        }
        this.f9709a.mo12416a(EnumC2638ac.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3378i.b
    /* renamed from: a */
    public void mo10184a(InterfaceC3377h.d dVar) {
        String strMo10203c = dVar.mo10203c();
        String strMo10202b = dVar.mo10202b();
        try {
            C3376g c3376g = this.f9710b.get(strMo10203c);
            if (c3376g == null) {
                this.f9709a.mo12416a(EnumC2638ac.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, strMo10203c);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f9711c.mo12671a(strMo10203c).onInterstitialAdLoadFailed(strMo10203c, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(strMo10202b)) {
                c3376g.mo10201c();
            } else {
                c3376g.mo10197a(new InterfaceC3384o.a(IronSourceAES.decode(C3359mb.m10015b().m10017c(), strMo10202b)));
            }
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "loadInterstitial exception ");
            sbOooOOO0.append(e.getMessage());
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(sbOooOOO0.toString());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f9711c.mo12671a(strMo10203c).onInterstitialAdLoadFailed(strMo10203c, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3378i.b
    /* renamed from: a */
    public void mo10185a(String str) {
        try {
            C3376g c3376g = this.f9710b.get(str);
            if (c3376g != null) {
                c3376g.mo10200b();
                return;
            }
            this.f9709a.mo12416a(EnumC2638ac.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.f9711c.mo12671a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "showInterstitial exception ");
            sbOooOOO0.append(e.getMessage());
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", sbOooOOO0.toString());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f9711c.mo12671a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }
}

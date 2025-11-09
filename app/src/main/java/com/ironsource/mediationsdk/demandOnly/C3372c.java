package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C3359mb;
import com.ironsource.C3723u6;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC3692ta;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.C3388f;
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

/* renamed from: com.ironsource.mediationsdk.demandOnly.c */
/* loaded from: classes2.dex */
public class C3372c implements InterfaceC3378i.a {

    /* renamed from: a */
    private ConcurrentHashMap<String, C3373d> f9684a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private InterfaceC3692ta f9685b;

    public C3372c(List<NetworkSettings> list, C3723u6 c3723u6, String str, String str2, InterfaceC3692ta interfaceC3692ta) throws JSONException {
        String sessionId = IronSourceUtils.getSessionId();
        boolean zM12554k = c3723u6.m12554k();
        this.f9685b = interfaceC3692ta;
        C3387e c3387e = new C3387e(new C3388f(c3723u6.m12547d(), sessionId));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterM10112a = C3367c.m10097b().m10112a(networkSettings, networkSettings.getBannerSettings(), true);
                if (abstractAdapterM10112a != null) {
                    C3373d c3373d = new C3373d(str, str2, networkSettings, c3723u6.m12545b(), abstractAdapterM10112a, c3387e);
                    c3373d.m10243a(zM12554k);
                    this.f9684a.put(c3373d.m10253l(), c3373d);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3378i.a
    /* renamed from: a */
    public void mo10160a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C3373d c3373d = this.f9684a.get(str);
        if (c3373d != null) {
            c3373d.m10176a(iSDemandOnlyBannerLayout);
            return;
        }
        this.f9685b.mo12416a(EnumC2638ac.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().m11832a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3378i.a
    /* renamed from: a */
    public void mo10161a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C3373d c3373d = this.f9684a.get(str);
        if (c3373d != null) {
            c3373d.m10177a(iSDemandOnlyBannerLayout, new InterfaceC3384o.a(IronSourceAES.decode(C3359mb.m10015b().m10017c(), str2)));
            return;
        }
        this.f9685b.mo12416a(EnumC2638ac.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().m11832a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3378i.a
    /* renamed from: a */
    public synchronized void mo10162a(String str) {
        C3373d c3373d = this.f9684a.get(str);
        if (c3373d != null) {
            c3373d.m10181r();
            return;
        }
        this.f9685b.mo12416a(EnumC2638ac.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
        IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
    }
}

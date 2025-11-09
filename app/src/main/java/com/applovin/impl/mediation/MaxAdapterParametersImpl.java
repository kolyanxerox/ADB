package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C0986b5;
import com.applovin.impl.C1044h3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a */
    private String f1226a;

    /* renamed from: b */
    private Map f1227b;

    /* renamed from: c */
    private Bundle f1228c;

    /* renamed from: d */
    private Bundle f1229d;

    /* renamed from: e */
    private Boolean f1230e;

    /* renamed from: f */
    private Boolean f1231f;

    /* renamed from: g */
    private String f1232g;

    /* renamed from: h */
    private boolean f1233h;

    /* renamed from: i */
    private String f1234i;

    /* renamed from: j */
    private String f1235j;

    /* renamed from: k */
    private long f1236k;

    /* renamed from: l */
    private MaxAdFormat f1237l;

    private MaxAdapterParametersImpl() {
    }

    /* renamed from: a */
    public static MaxAdapterParametersImpl m1523a(AbstractC1266v2 abstractC1266v2) {
        MaxAdapterParametersImpl maxAdapterParametersImplM1522a = m1522a((C1044h3) abstractC1266v2);
        maxAdapterParametersImplM1522a.f1234i = abstractC1266v2.m3519Q();
        maxAdapterParametersImplM1522a.f1235j = abstractC1266v2.m3508E();
        maxAdapterParametersImplM1522a.f1236k = abstractC1266v2.m3507D();
        return maxAdapterParametersImplM1522a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f1237l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f1226a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f1236k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f1235j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f1232g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f1229d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f1227b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f1228c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f1234i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f1230e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f1231f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f1233h;
    }

    /* renamed from: a */
    public static MaxAdapterParametersImpl m1521a(C0986b5 c0986b5, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplM1522a = m1522a(c0986b5);
        maxAdapterParametersImplM1522a.f1226a = str;
        maxAdapterParametersImplM1522a.f1237l = maxAdFormat;
        return maxAdapterParametersImplM1522a;
    }

    /* renamed from: a */
    public static MaxAdapterParametersImpl m1522a(C1044h3 c1044h3) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f1226a = c1044h3.getAdUnitId();
        maxAdapterParametersImpl.f1230e = c1044h3.m917n();
        maxAdapterParametersImpl.f1231f = c1044h3.m918o();
        maxAdapterParametersImpl.f1232g = c1044h3.m904d();
        maxAdapterParametersImpl.f1227b = c1044h3.m913i();
        maxAdapterParametersImpl.f1228c = c1044h3.m915l();
        maxAdapterParametersImpl.f1229d = c1044h3.m908f();
        maxAdapterParametersImpl.f1233h = c1044h3.m919p();
        return maxAdapterParametersImpl;
    }
}

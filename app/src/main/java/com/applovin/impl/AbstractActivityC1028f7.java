package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* renamed from: com.applovin.impl.f7 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1028f7 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f748a;

    /* renamed from: b */
    private AbstractViewOnClickListenerC1152p2 f749b;

    /* renamed from: com.applovin.impl.f7$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            return i == d.SETTINGS.ordinal() ? AbstractActivityC1028f7.this.m756c() : AbstractActivityC1028f7.this.m751a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return i == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return i == d.SETTINGS.ordinal() ? new C1250t4("SETTINGS") : new C1250t4("GDPR APPLICABILITY");
        }
    }

    /* renamed from: com.applovin.impl.f7$b */
    public class b implements AbstractViewOnClickListenerC1152p2.a {

        /* renamed from: a */
        final /* synthetic */ C1220k f751a;

        public b(C1220k c1220k) {
            this.f751a = c1220k;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
        /* renamed from: a */
        public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
            if (c1053i2.m969b() == d.SETTINGS.ordinal()) {
                if (c1053i2.m968a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f751a.m2931y().m3280f() != null) {
                        AbstractC1048h7.m948a(this.f751a.m2931y().m3280f(), C1220k.m2824o(), this.f751a);
                        return;
                    } else {
                        AbstractC1078k7.m1195a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", AbstractActivityC1028f7.this);
                        return;
                    }
                }
                if (c1053i2.m968a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f751a.m2931y().m3282h() == null) {
                    return;
                }
                AbstractC1048h7.m948a(this.f751a.m2931y().m3282h(), C1220k.m2824o(), this.f751a);
            }
        }
    }

    /* renamed from: com.applovin.impl.f7$c */
    public enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* renamed from: com.applovin.impl.f7$d */
    public enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* renamed from: com.applovin.impl.f7$e */
    public enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public List m756c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(m753b());
        arrayList.add(m757d());
        return arrayList;
    }

    /* renamed from: d */
    private C1143o2 m757d() {
        C1143o2.b bVarM2003d = C1143o2.m1978a().m2003d("Terms of Service URL");
        if (this.f748a.m2931y().m3282h() != null) {
            bVarM2003d.m1990a(C1333R.drawable.applovin_ic_check_mark_bordered);
            bVarM2003d.m1996b(AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_checkmarkColor, this));
            bVarM2003d.m1994a(true);
        } else {
            bVarM2003d.m2001c(OfficeOpenXMLExtended.SECURITY_NONE);
            bVarM2003d.m1994a(false);
        }
        return bVarM2003d.m1995a();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f748a;
    }

    public void initialize(C1220k c1220k) {
        this.f748a = c1220k;
        a aVar = new a(this);
        this.f749b = aVar;
        aVar.m2059a(new b(c1220k));
        this.f749b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(C1333R.id.listView)).setAdapter((ListAdapter) this.f749b);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractViewOnClickListenerC1152p2 abstractViewOnClickListenerC1152p2 = this.f749b;
        if (abstractViewOnClickListenerC1152p2 != null) {
            abstractViewOnClickListenerC1152p2.m2059a((AbstractViewOnClickListenerC1152p2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List m751a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f748a.m2927w().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM3278d = this.f748a.m2931y().m3278d();
        boolean z = AbstractC1078k7.m1228c(this.f748a) && consentFlowUserGeographyM3278d != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(C1143o2.m1978a().m2003d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").m1995a());
        arrayList.add(m750a(consentFlowUserGeography, !z));
        arrayList.add(m754b(consentFlowUserGeographyM3278d, z));
        return arrayList;
    }

    /* renamed from: b */
    private C1143o2 m753b() {
        boolean z = this.f748a.m2931y().m3280f() != null;
        return C1143o2.m1978a().m2003d("Privacy Policy URL").m1990a(z ? C1333R.drawable.applovin_ic_check_mark_bordered : C1333R.drawable.applovin_ic_x_mark).m1996b(AbstractC1091m0.m1442a(z ? C1333R.color.applovin_sdk_checkmarkColor : C1333R.color.applovin_sdk_xmarkColor, this)).m1994a(true).m1995a();
    }

    /* renamed from: a */
    private C1143o2 m750a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return C1143o2.m1978a().m2003d("Consent Flow Geography").m2001c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").m1999b(z).m1995a();
    }

    /* renamed from: b */
    private C1143o2 m754b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return C1143o2.m1978a().m2003d("Debug User Geography").m2001c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : OfficeOpenXMLExtended.SECURITY_NONE).m1999b(z).m1995a();
    }
}

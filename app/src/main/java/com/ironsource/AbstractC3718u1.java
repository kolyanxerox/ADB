package com.ironsource;

import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ironsource.u1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3718u1 {

    /* renamed from: r */
    public static final a f12122r = new a(null);

    /* renamed from: s */
    public static final int f12123s = -1;

    /* renamed from: a */
    private final C3061e1 f12124a;

    /* renamed from: b */
    private final boolean f12125b;

    /* renamed from: c */
    private final String f12126c;

    /* renamed from: d */
    private final List<NetworkSettings> f12127d;

    /* renamed from: e */
    private final C3840xk f12128e;

    /* renamed from: f */
    private final C3477o5 f12129f;

    /* renamed from: g */
    private int f12130g;

    /* renamed from: h */
    private final int f12131h;

    /* renamed from: i */
    private boolean f12132i;

    /* renamed from: j */
    private final int f12133j;

    /* renamed from: k */
    private final int f12134k;

    /* renamed from: l */
    private final C3350m2 f12135l;

    /* renamed from: m */
    private final long f12136m;

    /* renamed from: n */
    private final boolean f12137n;

    /* renamed from: o */
    private final boolean f12138o;

    /* renamed from: p */
    private final boolean f12139p;

    /* renamed from: q */
    private boolean f12140q;

    /* renamed from: com.ironsource.u1$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final <AdFormatConfig, AdUnitData> AdUnitData m12526a(C3061e1 adProperties, C3122fm c3122fm, o00O0Oo.Oooo000 getAdFormatConfig, o00O0Oo.o00O0O createAdUnitData) {
            List<C2980bp> listM8726d;
            C3571qt c3571qtM11051d;
            kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
            kotlin.jvm.internal.OooOo.OooO0o0(getAdFormatConfig, "getAdFormatConfig");
            kotlin.jvm.internal.OooOo.OooO0o0(createAdUnitData, "createAdUnitData");
            Object objInvoke = getAdFormatConfig.invoke((c3122fm == null || (c3571qtM11051d = c3122fm.m11051d()) == null) ? null : c3571qtM11051d.m11635c());
            if (objInvoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.m8434a() + " configurations");
            }
            if (c3122fm == null || (listM8726d = c3122fm.m8726d(adProperties.m8439e(), adProperties.m8437c())) == null) {
                listM8726d = o00O0.oo000o.f31251OooOo0O;
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(listM8726d, 10));
            Iterator<T> it = listM8726d.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2980bp) it.next()).m7963f());
            }
            C3840xk c3840xkM13069b = C3840xk.m13069b();
            kotlin.jvm.internal.OooOo.OooO0Oo(c3840xkM13069b, "getInstance()");
            return (AdUnitData) createAdUnitData.invoke(new C3683t1(userIdForNetworks, arrayList, c3840xkM13069b), objInvoke);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3718u1(C3061e1 adProperties, boolean z, String str, List<? extends NetworkSettings> providerList, C3840xk publisherDataHolder, C3477o5 auctionSettings, int i, int i2, boolean z2, int i3, int i4, C3350m2 loadingData, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(providerList, "providerList");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherDataHolder, "publisherDataHolder");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(loadingData, "loadingData");
        this.f12124a = adProperties;
        this.f12125b = z;
        this.f12126c = str;
        this.f12127d = providerList;
        this.f12128e = publisherDataHolder;
        this.f12129f = auctionSettings;
        this.f12130g = i;
        this.f12131h = i2;
        this.f12132i = z2;
        this.f12133j = i3;
        this.f12134k = i4;
        this.f12135l = loadingData;
        this.f12136m = j;
        this.f12137n = z3;
        this.f12138o = z4;
        this.f12139p = z5;
        this.f12140q = z6;
    }

    /* renamed from: a */
    public final int m12504a() {
        return this.f12134k;
    }

    /* renamed from: b */
    public C3061e1 mo9364b() {
        return this.f12124a;
    }

    /* renamed from: b */
    public abstract JSONObject mo9365b(NetworkSettings networkSettings);

    /* renamed from: c */
    public abstract String mo9366c();

    /* renamed from: d */
    public final boolean m12509d() {
        return this.f12132i;
    }

    /* renamed from: e */
    public final C3477o5 m12510e() {
        return this.f12129f;
    }

    /* renamed from: f */
    public final long m12511f() {
        return this.f12136m;
    }

    /* renamed from: g */
    public final int m12512g() {
        return this.f12133j;
    }

    /* renamed from: h */
    public final int m12513h() {
        return this.f12131h;
    }

    /* renamed from: i */
    public final C3350m2 m12514i() {
        return this.f12135l;
    }

    /* renamed from: j */
    public abstract String mo9367j();

    /* renamed from: k */
    public final int m12515k() {
        return this.f12130g;
    }

    /* renamed from: l */
    public final String m12516l() {
        String placementName;
        Placement placementM8440f = mo9364b().m8440f();
        return (placementM8440f == null || (placementName = placementM8440f.getPlacementName()) == null) ? "" : placementName;
    }

    /* renamed from: m */
    public final List<NetworkSettings> m12517m() {
        return this.f12127d;
    }

    /* renamed from: n */
    public final boolean m12518n() {
        return this.f12137n;
    }

    /* renamed from: o */
    public final C3840xk m12519o() {
        return this.f12128e;
    }

    /* renamed from: p */
    public final boolean m12520p() {
        return this.f12139p;
    }

    /* renamed from: q */
    public final boolean m12521q() {
        return this.f12140q;
    }

    /* renamed from: r */
    public final String m12522r() {
        return this.f12126c;
    }

    /* renamed from: s */
    public final boolean m12523s() {
        return this.f12138o;
    }

    /* renamed from: t */
    public final boolean m12524t() {
        return this.f12129f.m11094g() > 0;
    }

    /* renamed from: u */
    public boolean mo10003u() {
        return this.f12125b;
    }

    /* renamed from: v */
    public final String m12525v() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", C3368d.f9626x, Integer.valueOf(this.f12130g), C3368d.f9627y, Boolean.valueOf(this.f12132i), C3368d.f9628z, Boolean.valueOf(this.f12140q));
    }

    public /* synthetic */ AbstractC3718u1(C3061e1 c3061e1, boolean z, String str, List list, C3840xk c3840xk, C3477o5 c3477o5, int i, int i2, boolean z2, int i3, int i4, C3350m2 c3350m2, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3061e1, z, str, list, c3840xk, c3477o5, i, i2, z2, i3, i4, c3350m2, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }

    /* renamed from: a */
    public AdData mo10002a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(mo9365b(providerSettings), mo9364b().m8434a(), this.f12126c);
        kotlin.jvm.internal.OooOo.OooO0Oo(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    /* renamed from: b */
    public final void m12508b(boolean z) {
        this.f12140q = z;
    }

    /* renamed from: a */
    public final NetworkSettings m12505a(String instanceName) {
        Object next;
        kotlin.jvm.internal.OooOo.OooO0o0(instanceName, "instanceName");
        Iterator<T> it = this.f12127d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                break;
            }
        }
        return (NetworkSettings) next;
    }

    /* renamed from: a */
    public final void m12506a(int i) {
        this.f12130g = i;
    }

    /* renamed from: a */
    public final void m12507a(boolean z) {
        this.f12132i = z;
    }
}

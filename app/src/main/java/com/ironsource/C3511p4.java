package com.ironsource;

import com.ironsource.C2963b8;
import com.ironsource.C3511p4;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.p4 */
/* loaded from: classes2.dex */
public final class C3511p4 {

    /* renamed from: a */
    private final C3719u2 f10726a;

    /* renamed from: b */
    private final AbstractC3718u1 f10727b;

    /* renamed from: c */
    private final Map<String, C3135g0> f10728c;

    /* renamed from: d */
    private final C3065e5 f10729d;

    /* renamed from: e */
    private final List<CallableC3861y7> f10730e;

    /* renamed from: f */
    private final boolean f10731f;

    /* renamed from: com.ironsource.p4$a */
    public static final class a extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ C2963b8 f10732a;

        /* renamed from: b */
        final /* synthetic */ C3511p4 f10733b;

        /* renamed from: c */
        final /* synthetic */ C2963b8.b f10734c;

        public a(C2963b8 c2963b8, C3511p4 c3511p4, C2963b8.b bVar) {
            this.f10732a = c2963b8;
            this.f10733b = c3511p4;
            this.f10734c = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            this.f10732a.m7885a(this.f10733b.m11266e(), this.f10734c, this.f10733b.f10727b.m12511f(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: com.ironsource.p4$b */
    public static final class b implements InterfaceC3895z7 {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3895z7
        /* renamed from: a */
        public void mo11270a(NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceM11249a;
            if (C3511p4.this.m11269h()) {
                adapterBaseInterfaceM11249a = null;
                BaseAdAdapter baseAdAdapterM11260b = C3511p4.this.m11260b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterM11260b != null) {
                    adapterBaseInterfaceM11249a = baseAdAdapterM11260b.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceM11249a = C3511p4.this.m11249a(networkSettings);
            }
            if (adapterBaseInterfaceM11249a != null) {
                C3511p4.this.f10726a.m9970e().m7910g().m9020a(C3511p4.this.m11254a(networkSettings, adapterBaseInterfaceM11249a));
            }
        }

        @Override // com.ironsource.InterfaceC3895z7
        /* renamed from: a */
        public void mo11271a(String str) {
            C3511p4.this.f10726a.m9970e().m7911h().m9918g(str);
        }
    }

    /* renamed from: com.ironsource.p4$c */
    public static final class c implements C2963b8.b {

        /* renamed from: b */
        final /* synthetic */ d f10737b;

        public c(d dVar) {
            this.f10737b = dVar;
        }

        /* renamed from: a */
        public static final void m11272a(C3511p4 this$0, long j, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            kotlin.jvm.internal.OooOo.OooO0o0(biddingDataList, "$biddingDataList");
            kotlin.jvm.internal.OooOo.OooO0o0(reachedTimeout, "$reachedTimeout");
            kotlin.jvm.internal.OooOo.OooO0o0(biddingDataListener, "$biddingDataListener");
            this$0.m11257a(j, biddingDataList, reachedTimeout, biddingDataListener);
        }

        @Override // com.ironsource.C2963b8.b
        public void onFailure(String error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C3511p4.this.f10726a.m13090a(new androidx.webkit.OooO00o(C3511p4.this, error, this.f10737b, 27));
        }

        /* renamed from: a */
        public static final void m11273a(C3511p4 this$0, String error, d biddingDataListener) {
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
            kotlin.jvm.internal.OooOo.OooO0o0(biddingDataListener, "$biddingDataListener");
            this$0.f10726a.m9970e().m7910g().m9019a(error);
            biddingDataListener.mo11275a(this$0, error);
        }

        @Override // com.ironsource.C2963b8.b
        /* renamed from: a */
        public void mo7886a(final List<? extends C2998c8> biddingDataList, final long j, final List<String> reachedTimeout) {
            kotlin.jvm.internal.OooOo.OooO0o0(biddingDataList, "biddingDataList");
            kotlin.jvm.internal.OooOo.OooO0o0(reachedTimeout, "reachedTimeout");
            C3719u2 c3719u2 = C3511p4.this.f10726a;
            final C3511p4 c3511p4 = C3511p4.this;
            final d dVar = this.f10737b;
            c3719u2.m13090a(new Runnable() { // from class: com.ironsource.o0Oo0oo
                @Override // java.lang.Runnable
                public final void run() {
                    List list = reachedTimeout;
                    C3511p4.c.m11272a(c3511p4, j, biddingDataList, list, dVar);
                }
            });
        }
    }

    /* renamed from: com.ironsource.p4$d */
    public interface d {
        /* renamed from: a */
        void mo11274a(C3511p4 c3511p4);

        /* renamed from: a */
        void mo11275a(C3511p4 c3511p4, String str);
    }

    public C3511p4(C3719u2 adTools, AbstractC3718u1 adUnitData) {
        StringBuilder sb;
        String providerName;
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        this.f10726a = adTools;
        this.f10727b = adUnitData;
        this.f10728c = m11253a();
        this.f10729d = new C3065e5(adUnitData);
        this.f10730e = new ArrayList();
        this.f10731f = adUnitData.m12510e().m11104q();
        b bVarM11261b = m11261b();
        C3270jv c3270jvM8441g = adUnitData.mo9364b().m8441g();
        for (NetworkSettings networkSettings : adUnitData.m12517m()) {
            if (c3270jvM8441g == null || c3270jvM8441g.m9544a(networkSettings, this.f10727b.mo9364b().m8434a())) {
                AdData adDataMo10002a = this.f10727b.mo10002a(networkSettings);
                if (networkSettings.isBidder(this.f10727b.mo9364b().m8434a())) {
                    Object objM11260b = this.f10731f ? m11260b(networkSettings.getProviderName()) : m11249a(networkSettings);
                    if (objM11260b instanceof InterfaceC2634a8) {
                        this.f10730e.add(new CallableC3861y7(networkSettings.getInstanceType(this.f10727b.mo9364b().m8434a()), networkSettings.getProviderInstanceName(), adDataMo10002a, (InterfaceC2634a8) objM11260b, bVarM11261b, networkSettings));
                    } else {
                        if (objM11260b == null) {
                            sb = new StringBuilder("prepareAuctionCandidates - could not load network adapter ");
                            providerName = networkSettings.getProviderName();
                        } else {
                            sb = new StringBuilder("network adapter ");
                            sb.append(networkSettings.getProviderName());
                            providerName = " does not implementing BiddingDataInterface";
                        }
                        sb.append(providerName);
                        this.f10726a.m9970e().m7911h().m9918g(sb.toString());
                    }
                } else {
                    this.f10729d.m8451a(networkSettings);
                }
            }
        }
    }

    /* renamed from: a */
    public final AdapterBaseInterface m11249a(NetworkSettings networkSettings) {
        return C3367c.m10097b().m10116b(networkSettings, this.f10727b.mo9364b().m8434a(), this.f10727b.mo9364b().m8436b());
    }

    /* renamed from: b */
    private final C2963b8.b m11259b(d dVar) {
        return new c(dVar);
    }

    /* renamed from: c */
    public final Map<String, C3135g0> m11264c() {
        return this.f10728c;
    }

    /* renamed from: d */
    public final C3065e5 m11265d() {
        return this.f10729d;
    }

    /* renamed from: e */
    public final List<CallableC3861y7> m11266e() {
        return this.f10730e;
    }

    /* renamed from: f */
    public final boolean m11267f() {
        return !this.f10730e.isEmpty();
    }

    /* renamed from: g */
    public final boolean m11268g() {
        return this.f10729d.m8455d();
    }

    /* renamed from: h */
    public final boolean m11269h() {
        return this.f10731f;
    }

    /* renamed from: b */
    public final BaseAdAdapter<?, ?> m11260b(String str) {
        C3135g0 c3135g0 = this.f10728c.get(str);
        if (c3135g0 != null) {
            return c3135g0.m8848b();
        }
        return null;
    }

    /* renamed from: b */
    private final b m11261b() {
        return new b();
    }

    /* renamed from: a */
    private final Map<String, C3135g0> m11253a() {
        List<NetworkSettings> listM12517m = this.f10727b.m12517m();
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(listM12517m, 10));
        if (iOooOOOO < 16) {
            iOooOOOO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO);
        Iterator<T> it = listM12517m.iterator();
        while (it.hasNext()) {
            C3135g0 c3135g0 = new C3135g0(this.f10726a, this.f10727b, (NetworkSettings) it.next());
            linkedHashMap.put(c3135g0.m8849c(), c3135g0);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final Map<String, Object> m11254a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                StringBuilder sb = new StringBuilder("getProviderEventData ");
                sb.append(networkSettings != null ? networkSettings.getProviderDefaultInstance() : null);
                logger.logException(ironSourceTag, sb.toString(), e);
                return map;
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f10727b.mo9364b().m8434a())) : null);
        return map;
    }

    /* renamed from: a */
    private final Map<String, Object> m11256a(String str) {
        AdapterBaseInterface adapterBaseInterfaceM11249a;
        NetworkSettings networkSettingsM12505a = this.f10727b.m12505a(str);
        if (this.f10731f) {
            BaseAdAdapter<?, ?> baseAdAdapterM11260b = m11260b(str);
            adapterBaseInterfaceM11249a = baseAdAdapterM11260b != null ? baseAdAdapterM11260b.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceM11249a = m11249a(networkSettingsM12505a);
        }
        return m11254a(networkSettingsM12505a, adapterBaseInterfaceM11249a);
    }

    /* renamed from: a */
    public final void m11257a(long j, List<? extends C2998c8> list, List<String> list2, d dVar) {
        this.f10726a.m9970e().m7910g().m9018a(j);
        for (C2998c8 c2998c8 : list) {
            String strM8103c = c2998c8.m8103c();
            kotlin.jvm.internal.OooOo.OooO0Oo(strM8103c, "biddingResponse.instanceName");
            Map<String, Object> mapM11256a = m11256a(strM8103c);
            if (c2998c8.m8101a() != null) {
                this.f10729d.m8450a(c2998c8);
                this.f10726a.m9970e().m7910g().m9021a(mapM11256a, c2998c8.m8105e());
            } else {
                this.f10726a.m9970e().m7910g().m9022a(mapM11256a, c2998c8.m8105e(), c2998c8.m8102b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f10726a.m9970e().m7910g().m9023b(m11256a(it.next()), j);
        }
        dVar.mo11274a(this);
    }

    /* renamed from: a */
    public final void m11263a(d biddingDataListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(biddingDataListener, "biddingDataListener");
        C2963b8 c2963b8 = new C2963b8();
        C2963b8.b bVarM11259b = m11259b(biddingDataListener);
        this.f10726a.m9970e().m7910g().m9017a();
        this.f10726a.m12531c((AbstractRunnableC3302ks) new a(c2963b8, this, bVarM11259b));
    }
}

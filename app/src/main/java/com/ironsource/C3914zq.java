package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ironsource.zq */
/* loaded from: classes2.dex */
public final class C3914zq {

    /* renamed from: a */
    private final C3719u2 f13040a;

    /* renamed from: b */
    private final List<C2980bp> f13041b;

    /* renamed from: c */
    private final AbstractC3718u1 f13042c;

    /* renamed from: d */
    private final IronSource.AD_UNIT f13043d;

    /* renamed from: com.ironsource.zq$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13044a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13044a = iArr;
        }
    }

    /* renamed from: com.ironsource.zq$b */
    public static final class b extends AbstractRunnableC3302ks {

        /* renamed from: b */
        final /* synthetic */ NetworkSettings f13046b;

        /* renamed from: c */
        final /* synthetic */ AdapterBaseInterface f13047c;

        /* renamed from: d */
        final /* synthetic */ AdData f13048d;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f13046b = networkSettings;
            this.f13047c = adapterBaseInterface;
            this.f13048d = adData;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            C3914zq c3914zq = C3914zq.this;
            NetworkSettings networkSettings = this.f13046b;
            AdapterBaseInterface networkAdapter = this.f13047c;
            kotlin.jvm.internal.OooOo.OooO0Oo(networkAdapter, "networkAdapter");
            c3914zq.m13421a(networkSettings, networkAdapter, this.f13048d);
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo9702a(Throwable t) {
            kotlin.jvm.internal.OooOo.OooO0o0(t, "t");
            C3914zq.this.f13040a.m9970e().m7911h().m9918g("initProvider - exception while calling networkAdapter.init with " + this.f13046b.getProviderName() + " - " + t);
        }
    }

    public C3914zq(C3719u2 adUnitTools, LevelPlay.AdFormat adFormat, List<C2980bp> providers, AbstractC3718u1 adUnitData) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(providers, "providers");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        this.f13040a = adUnitTools;
        this.f13041b = providers;
        this.f13042c = adUnitData;
        this.f13043d = m13419a(adFormat);
    }

    /* renamed from: a */
    public final void m13425a() {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f13040a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C2980bp> it = this.f13041b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsM7963f = it.next().m7963f();
            AdapterBaseInterface adapterBaseInterfaceM10116b = C3367c.m10097b().m10116b(networkSettingsM7963f, this.f13043d, uuidRandomUUID);
            if (m13424a(networkSettingsM7963f, adapterBaseInterfaceM10116b)) {
                C2986bv.m8032a(C2986bv.f7654a, new b(networkSettingsM7963f, adapterBaseInterfaceM10116b, this.f13042c.mo10002a(networkSettingsM7963f)), 0L, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m13421a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        m13423a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        m13423a("Done initializing provider %s on thread %s", networkSettings);
    }

    /* renamed from: a */
    private final void m13423a(String str, NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f13040a, String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2)), (String) null, 2, (Object) null));
    }

    /* renamed from: a */
    private final boolean m13424a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        C3719u2 c3719u2 = this.f13040a;
        IronSource.AD_UNIT ad_unit = this.f13043d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        kotlin.jvm.internal.OooOo.OooO0Oo(providerInstanceName, "providerSettings.providerInstanceName");
        return !c3719u2.m13095a(adapterBaseInterface, ad_unit, providerInstanceName) && (networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f13043d));
    }

    /* renamed from: a */
    private final IronSource.AD_UNIT m13419a(LevelPlay.AdFormat adFormat) {
        int i = a.f13044a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.AD_UNIT.BANNER;
        }
        if (i == 4) {
            return IronSource.AD_UNIT.NATIVE_AD;
        }
        throw new OooOOO0.OooO00o();
    }
}

package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2964b9;
import com.ironsource.C3461no;
import com.ironsource.C3551q9;
import com.ironsource.C3805wj;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c */
/* loaded from: classes2.dex */
public class C3367c {

    /* renamed from: k */
    private static final String f9587k = "IronSource";

    /* renamed from: l */
    private static final String f9588l = "com.ironsource.adapters";

    /* renamed from: m */
    private static final String f9589m = "aps";

    /* renamed from: n */
    private static final C3367c f9590n = new C3367c();

    /* renamed from: o */
    private static final Object f9591o = new Object();

    /* renamed from: c */
    private String f9594c;

    /* renamed from: d */
    private String f9595d;

    /* renamed from: e */
    private Boolean f9596e;

    /* renamed from: h */
    private final AtomicBoolean f9599h = new AtomicBoolean(false);

    /* renamed from: i */
    private C2964b9 f9600i = new C2964b9();

    /* renamed from: j */
    private final C3461no f9601j = new C3461no();

    /* renamed from: a */
    private final ConcurrentHashMap<String, AbstractAdapter> f9592a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f9593b = new ConcurrentHashMap<>();

    /* renamed from: f */
    private final ConcurrentHashMap<String, List<String>> f9597f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> f9598g = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9602a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f9602a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9602a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9602a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9602a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: c */
    private String m10106c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        StringBuilder sbOooOo = OooOo.OooOo(uuid != null ? uuid.toString() : "", "-");
        sbOooOo.append(ad_unit.toString());
        sbOooOo.append("-");
        sbOooOo.append(networkSettings.getProviderName());
        return sbOooOo.toString();
    }

    /* renamed from: a */
    public AbstractAdapter m10111a(NetworkSettings networkSettings) {
        return m10072a(m10098b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    /* renamed from: b */
    public AdapterBaseInterface m10116b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) throws JSONException {
        String strM10098b = networkSettings.isCustomNetwork() ? m10098b(networkSettings) : m10106c(networkSettings, ad_unit, uuid);
        if (this.f9593b.containsKey(strM10098b)) {
            return this.f9593b.get(strM10098b).getAdapterBaseInterface();
        }
        AdapterBaseInterface adapterBaseInterfaceM10073a = m10073a(strM10098b, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        return (adapterBaseInterfaceM10073a != null || networkSettings.isCustomNetwork()) ? adapterBaseInterfaceM10073a : m10076a(networkSettings, ad_unit, strM10098b);
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, List<String>> m10122d() {
        return this.f9597f;
    }

    /* renamed from: e */
    public ConcurrentHashMap<String, AdapterBaseWrapper> m10123e() {
        return this.f9593b;
    }

    /* renamed from: f */
    public void m10124f() {
        this.f9592a.clear();
        this.f9593b.clear();
    }

    /* renamed from: b */
    public static C3367c m10097b() {
        return f9590n;
    }

    /* renamed from: a */
    public AbstractAdapter m10112a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z) {
        String coreSDKVersion;
        String strM10098b = m10098b(networkSettings);
        String providerTypeForReflection = z ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f9591o) {
            try {
                if (this.f9592a.containsKey(strM10098b)) {
                    return this.f9592a.get(strM10098b);
                }
                AbstractAdapter abstractAdapterM10072a = m10072a(strM10098b, providerTypeForReflection);
                if (abstractAdapterM10072a == null) {
                    m10104b(strM10098b + " adapter was not loaded");
                    return null;
                }
                abstractAdapterM10072a.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
                try {
                    coreSDKVersion = abstractAdapterM10072a.getCoreSDKVersion();
                } catch (Throwable th) {
                    C3551q9.m11517d().m11519a(th);
                    String str = "error while retrieving coreSDKVersion " + abstractAdapterM10072a.getProviderName() + ": " + th.getLocalizedMessage();
                    m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                    IronLog.INTERNAL.error(str);
                    coreSDKVersion = "Unknown";
                }
                m10110c(strM10098b + " was allocated (adapter version: " + abstractAdapterM10072a.getVersion() + ", sdk version: " + coreSDKVersion + ")");
                m10107c(abstractAdapterM10072a);
                this.f9601j.m11034a(abstractAdapterM10072a);
                m10083a(abstractAdapterM10072a);
                this.f9600i.m7892a(abstractAdapterM10072a, networkSettings);
                m10100b(abstractAdapterM10072a);
                m10093a(jSONObject, abstractAdapterM10072a, providerTypeForReflection);
                this.f9592a.put(strM10098b, abstractAdapterM10072a);
                return abstractAdapterM10072a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    private AbstractAdapter m10072a(String str, String str2) throws JSONException, ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(m10080a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            m10104b(str3);
            return null;
        }
    }

    /* renamed from: b */
    private String m10098b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    /* renamed from: a */
    private AdapterBaseInterface m10073a(String str, String str2, NetworkSettings networkSettings) throws JSONException {
        String strM10080a;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            strM10080a = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            strM10080a = m10080a(str2);
        }
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(strM10080a).newInstance();
            IronLog.INTERNAL.info(strM10080a + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            m10090a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String strOooOO0 = OooOo.OooOO0("failed to load ", strM10080a);
                IronLog.INTERNAL.error(strOooOO0);
                m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, strOooOO0);
            }
            return null;
        }
    }

    /* renamed from: b */
    private JSONObject m10099b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        int i = a.f9602a[ad_unit.ordinal()];
        if (i == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    /* renamed from: b */
    private void m10100b(AbstractAdapter abstractAdapter) throws JSONException {
        Boolean bool = this.f9596e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("error while setting adapterDebug of ", th);
                sbOooOOO.append(abstractAdapter.getProviderName());
                sbOooOOO.append(": ");
                sbOooOOO.append(th.getLocalizedMessage());
                String string = sbOooOOO.toString();
                m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, string);
                m10110c(string);
            }
        }
    }

    /* renamed from: c */
    public ConcurrentHashMap<String, LevelPlayBaseAdapter> m10120c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f9593b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.f9593b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: c */
    private void m10107c(AbstractAdapter abstractAdapter) throws JSONException {
        if (abstractAdapter == null) {
            return;
        }
        for (String str : this.f9597f.keySet()) {
            List<String> list = this.f9597f.get(str);
            if (list != null) {
                m10089a(new OooO00o(abstractAdapter, str, list, 1), abstractAdapter.getProviderName());
            }
        }
    }

    /* renamed from: c */
    private void m10108c(AdapterBaseInterface adapterBaseInterface) throws JSONException {
        if (adapterBaseInterface == null) {
            return;
        }
        for (String str : this.f9597f.keySet()) {
            List<String> list = this.f9597f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                m10089a(new OooO0O0(adapterBaseInterface, str, list, 1), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* renamed from: a */
    private BaseAdAdapter<?, ?> m10074a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) throws JSONException {
        boolean zIsCustomNetwork = networkSettings.isCustomNetwork();
        if (zIsCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            m10109c(networkSettings);
            return null;
        }
        String strM10079a = m10079a(networkSettings, ad_unit, zIsCustomNetwork, m10078a(networkSettings, ad_unit, zIsCustomNetwork));
        try {
            return m10075a(strM10079a, networkSettings);
        } catch (Exception e) {
            if (zIsCustomNetwork) {
                m10088a(e, strM10079a);
            }
            return null;
        }
    }

    /* renamed from: c */
    private void m10109c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error(OooOo.OooOO0("Missing package definition for ", networkSettings.getProviderTypeForReflection()));
    }

    /* renamed from: b */
    public static /* synthetic */ void m10101b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* renamed from: a */
    public BaseAdAdapter<?, ?> m10113a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) throws JSONException {
        BaseAdAdapter<?, ?> baseAdAdapterM10074a = m10074a(networkSettings, ad_unit);
        if (baseAdAdapterM10074a != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterM10074a;
        }
        AbstractAdapter abstractAdapterM10111a = m10111a(networkSettings);
        if (abstractAdapterM10111a != null) {
            return AbstractC3364a.m10030a(abstractAdapterM10111a, networkSettings, ad_unit, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* renamed from: a */
    private BaseAdAdapter<?, ?> m10075a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    /* renamed from: b */
    private void m10102b(AdapterBaseInterface adapterBaseInterface) throws JSONException {
        Boolean bool = this.f9596e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "error while setting adapterDebug of ");
            sbOooOOO0.append(adapterBaseInterface.getClass().getSimpleName());
            sbOooOOO0.append(": ");
            sbOooOOO0.append(e.getLocalizedMessage());
            String string = sbOooOOO0.toString();
            m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, string);
            m10110c(string);
        }
    }

    @Nullable
    /* renamed from: a */
    private C3410u m10076a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, String str) throws JSONException {
        AbstractAdapter abstractAdapterM10112a = m10112a(networkSettings, m10099b(networkSettings, ad_unit), false);
        if (abstractAdapterM10112a != null) {
            C3410u c3410u = new C3410u(abstractAdapterM10112a);
            this.f9593b.put(str, new AdapterBaseWrapper(c3410u, networkSettings));
            return c3410u;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    /* renamed from: a */
    private String m10077a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return null;
        }
        int i = a.f9602a[ad_unit.ordinal()];
        if (i == 1) {
            return "Rewarded";
        }
        if (i == 2) {
            return "Interstitial";
        }
        if (i == 3) {
            return "Banner";
        }
        if (i != 4) {
            return null;
        }
        return "NativeAd";
    }

    /* renamed from: a */
    private String m10078a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, boolean z) {
        return z ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection();
    }

    /* renamed from: a */
    private String m10079a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, boolean z, String str) {
        if (!z) {
            return m10081a(str, ad_unit);
        }
        return networkSettings.getCustomNetworkPackage() + "." + str;
    }

    /* renamed from: c */
    private void m10110c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    /* renamed from: a */
    private static String m10080a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    /* renamed from: c */
    public void m10121c(String str, List<String> list) {
        synchronized (f9591o) {
            try {
                this.f9597f.put(str, list);
                if (!this.f9592a.isEmpty()) {
                    IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                    m10105b(str, list);
                }
                m10091a(str, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private String m10081a(String str, IronSource.AD_UNIT ad_unit) {
        StringBuilder sb = new StringBuilder("com.ironsource.adapters.");
        sb.append(StringUtils.toLowerCase(str));
        sb.append(".");
        sb.append(str);
        return OooOo.OooOOOo(sb, m10077a(ad_unit), "Adapter");
    }

    /* renamed from: b */
    public static /* synthetic */ void m10103b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* renamed from: b */
    public void m10117b(C3412v c3412v) throws JSONException {
        if (m10094a(c3412v)) {
            this.f9601j.m11036a(c3412v);
            c3412v.m10698a(this.f9592a.values(), this.f9593b.values());
            c3412v.m10699b();
            if (StringUtils.toLowerCase(c3412v.m10697a()).equals(f9589m)) {
                m10092a(c3412v.allData());
            }
        }
    }

    /* renamed from: b */
    private void m10104b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    /* renamed from: b */
    public void m10118b(String str, String str2) {
        this.f9594c = str;
        this.f9595d = str2;
    }

    /* renamed from: b */
    private void m10105b(String str, List<String> list) throws JSONException {
        for (AbstractAdapter abstractAdapter : this.f9592a.values()) {
            m10089a(new OooO00o(abstractAdapter, str, list, 0), abstractAdapter.getProviderName());
        }
    }

    /* renamed from: a */
    public ConcurrentHashMap<String, AbstractAdapter> m10114a() {
        return this.f9592a;
    }

    /* renamed from: a */
    private void m10082a(EnumC2638ac enumC2638ac, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            C3805wj.m12898i().mo12605a(new C3899zb(enumC2638ac, jSONObject));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: b */
    public void m10119b(boolean z) {
        synchronized (f9591o) {
            this.f9600i.m7895a(z);
            this.f9600i.m7894a(this.f9592a, this.f9593b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m10083a(AbstractAdapter abstractAdapter) throws JSONException {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f9589m) || this.f9598g.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.f9598g.keySet()) {
            try {
                JSONObject jSONObject = this.f9598g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e) {
                StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "error while setting aps data: ");
                sbOooOOO0.append(e.getLocalizedMessage());
                String string = sbOooOOO0.toString();
                m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, string);
                m10110c(string);
            }
        }
        this.f9598g.clear();
    }

    /* renamed from: a */
    public static /* synthetic */ void m10084a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m10085a(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
            m10104b("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f9592a.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.f9592a.values()) {
                    if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f9589m) && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f9593b.values()) {
                if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(f9589m)) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseInterface != null) {
                        ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                    return;
                }
            }
            synchronized (f9591o) {
                this.f9598g.put(ad_unit, jSONObject2);
            }
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "error while setting APSData: ");
            sbOooOOO0.append(e.getLocalizedMessage());
            String string = sbOooOOO0.toString();
            m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, string);
            m10104b(string);
        }
    }

    /* renamed from: a */
    private void m10086a(AdapterBaseInterface adapterBaseInterface) throws JSONException {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.f9598g.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.f9598g.keySet()) {
            try {
                JSONObject jSONObject = this.f9598g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e) {
                StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "error while setting aps data: ");
                sbOooOOO0.append(e.getLocalizedMessage());
                String string = sbOooOOO0.toString();
                m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, string);
                m10110c(string);
            }
        }
        this.f9598g.clear();
    }

    /* renamed from: a */
    public static /* synthetic */ void m10087a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* renamed from: a */
    private void m10088a(Exception exc, String str) throws JSONException {
        String strOooOO0 = OooOo.OooOO0("Failed to load adapter class: ", str);
        IronLog.INTERNAL.error(strOooOO0);
        EnumC2638ac enumC2638ac = EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        StringBuilder sbOooOo = OooOo.OooOo(strOooOO0, " - ");
        sbOooOo.append(exc.getMessage());
        m10082a(enumC2638ac, sbOooOo.toString());
    }

    /* renamed from: a */
    private void m10089a(Runnable runnable, String str) throws JSONException {
        try {
            runnable.run();
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th.getLocalizedMessage();
            m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            m10110c(str2);
        }
    }

    /* renamed from: a */
    private void m10090a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) throws JSONException {
        if (!networkSettings.isCustomNetwork()) {
            m10108c(adapterBaseInterface);
            m10086a(adapterBaseInterface);
        }
        this.f9600i.m7893a(adapterBaseInterface, networkSettings);
        m10102b(adapterBaseInterface);
        this.f9601j.m11035a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.f9593b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    /* renamed from: a */
    private void m10091a(String str, List<String> list) throws JSONException {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f9593b.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                m10089a(new OooO0O0(adapterBaseInterface, str, list, 0), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* renamed from: a */
    private void m10092a(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!next.equalsIgnoreCase(ad_unit.toString())) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!next.equalsIgnoreCase(ad_unit.toString())) {
                    ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                    if (next.equalsIgnoreCase(ad_unit.toString())) {
                    }
                }
            }
            m10085a(ad_unit, jSONObjectOptJSONObject);
        }
    }

    /* renamed from: a */
    private void m10093a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) throws JSONException {
        if (str.equalsIgnoreCase("IronSource") && this.f9599h.compareAndSet(false, true)) {
            m10110c(OooOo.OooOO0O("SDK5 earlyInit  <", str, ">"));
            try {
                abstractAdapter.earlyInit(this.f9594c, this.f9595d, jSONObject);
            } catch (Exception e) {
                StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "error while calling early init for ");
                sbOooOOO0.append(abstractAdapter.getProviderName());
                sbOooOOO0.append(": ");
                sbOooOOO0.append(e.getLocalizedMessage());
                String string = sbOooOOO0.toString();
                m10082a(EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, string);
                IronLog.INTERNAL.error(string);
            }
        }
    }

    /* renamed from: a */
    public void m10115a(boolean z) {
        synchronized (f9591o) {
            try {
                this.f9596e = Boolean.valueOf(z);
                Iterator<AbstractAdapter> it = this.f9592a.values().iterator();
                while (it.hasNext()) {
                    m10100b(it.next());
                }
                Iterator<AdapterBaseWrapper> it2 = this.f9593b.values().iterator();
                while (it2.hasNext()) {
                    m10102b(it2.next().getAdapterBaseInterface());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private boolean m10094a(C3412v c3412v) throws JSONException {
        EnumC2638ac enumC2638ac;
        String str;
        if (c3412v.allData().length() == 0) {
            enumC2638ac = EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR;
            str = "empty network data";
        } else {
            if (!TextUtils.isEmpty(c3412v.m10697a())) {
                return true;
            }
            enumC2638ac = EnumC2638ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR;
            str = "empty network key";
        }
        m10082a(enumC2638ac, str);
        m10104b(str);
        return false;
    }

    /* renamed from: a */
    public static boolean m10095a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: a */
    public static boolean m10096a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}

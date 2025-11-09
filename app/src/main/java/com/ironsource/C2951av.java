package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3724u7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.av */
/* loaded from: classes2.dex */
public class C2951av {

    /* renamed from: a */
    private static final Map<IronSource.AD_UNIT, C3473o1> f7562a = new HashMap();

    /* renamed from: com.ironsource.av$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7563a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7564b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f7564b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7564b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7564b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7564b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.AD_UNIT.values().length];
            f7563a = iArr2;
            try {
                iArr2[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7563a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7563a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7563a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: com.ironsource.av$b */
    public static class b {

        /* renamed from: a */
        private final IronSource.AD_UNIT f7565a;

        public b(IronSource.AD_UNIT ad_unit) {
            this.f7565a = ad_unit;
        }

        /* renamed from: b */
        private String m7847b() {
            IronSource.AD_UNIT ad_unit = this.f7565a;
            return ad_unit != null ? ad_unit.name() : "";
        }

        /* renamed from: a */
        public String m7848a() {
            return m7849a(null);
        }

        /* renamed from: a */
        public String m7849a(String str) {
            return m7850a(str, null);
        }

        /* renamed from: a */
        public String m7850a(String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(m7847b());
            sb.append(TextUtils.isEmpty(str2) ? "" : OooO0oO.OooOo.OooOO0(" - ", str2));
            String string = sb.toString();
            return TextUtils.isEmpty(str) ? string : OooO0oO.OooOo.OooOoo(string, " - ", str);
        }
    }

    /* renamed from: a */
    public static b m7837a(IronSource.AD_UNIT ad_unit) {
        return new b(ad_unit);
    }

    /* renamed from: b */
    public static int m7846b(IronSource.AD_UNIT ad_unit) {
        int i = a.f7563a[ad_unit.ordinal()];
        return (i != 1 ? i != 2 ? i != 3 ? i != 4 ? AbstractC3724u7.e.NOT_SUPPORTED : AbstractC3724u7.e.BANNER : AbstractC3724u7.e.NATIVE_AD : AbstractC3724u7.e.INTERSTITIAL : AbstractC3724u7.e.REWARDED_VIDEO).m12631a();
    }

    /* renamed from: a */
    public static IronSourceSegment m7838a() {
        return C3404p.m10470j().m10563q();
    }

    /* renamed from: a */
    private static C3473o1 m7839a(AbstractC3718u1 abstractC3718u1) {
        Map<IronSource.AD_UNIT, C3473o1> map = f7562a;
        if (map.containsKey(abstractC3718u1.mo9364b().m8434a())) {
            return map.get(abstractC3718u1.mo9364b().m8434a());
        }
        C3473o1 c3473o1 = new C3473o1();
        map.put(abstractC3718u1.mo9364b().m8434a(), c3473o1);
        return c3473o1;
    }

    /* renamed from: a */
    public static C3544q2 m7840a(AbstractC3718u1 abstractC3718u1, int i) {
        return m7839a(abstractC3718u1).m11068a(abstractC3718u1.mo9364b().m8437c(), abstractC3718u1.m12517m(), i);
    }

    /* renamed from: a */
    public static String m7841a(LevelPlay.AdFormat adFormat) {
        int i = a.f7564b[adFormat.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "nativeAd" : "banner" : "interstitial" : "rewarded";
    }

    /* renamed from: a */
    public static void m7842a(EnumC2638ac enumC2638ac, JSONObject jSONObject) {
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(enumC2638ac, C3702tk.m12448a(IronSourceUtils.getMediationAdditionalData(false), jSONObject)));
    }

    /* renamed from: a */
    public static void m7843a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        m7842a(EnumC2638ac.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    /* renamed from: a */
    public static void m7844a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        m7842a(EnumC2638ac.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    /* renamed from: a */
    public static boolean m7845a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }
}

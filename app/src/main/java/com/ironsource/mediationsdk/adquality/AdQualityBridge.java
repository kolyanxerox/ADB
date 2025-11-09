package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C3136g1;
import com.ironsource.C3288ke;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.RunnableC3323le;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AdQualityBridge {
    public static final Companion Companion = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return OooOo.OooO00o(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                logEvent$default(this, EnumC2638ac.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(EnumC2638ac enumC2638ac, Integer num, String str) throws JSONException {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            if (num != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                mediationAdditionalData.put("reason", str);
            }
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, C3365a.f9555a.m10051a().m10049b());
            C3495on.f10667s.m11213d().mo8698z().mo12605a(new C3899zb(enumC2638ac, mediationAdditionalData));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, EnumC2638ac enumC2638ac, Integer num, String str, int i, Object obj) throws JSONException {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            companion.logEvent(enumC2638ac, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String input, String input2) throws NumberFormatException {
            int length;
            if (TextUtils.isEmpty(input) || TextUtils.isEmpty(input2)) {
                return -1;
            }
            Pattern patternCompile = Pattern.compile("[^0-9.]");
            OooOo.OooO0Oo(patternCompile, "compile(...)");
            OooOo.OooO0o0(input, "input");
            String strReplaceAll = patternCompile.matcher(input).replaceAll("");
            OooOo.OooO0Oo(strReplaceAll, "replaceAll(...)");
            int i = 0;
            String[] strArr = (String[]) o000000.Ooooo0o(strReplaceAll, new String[]{"."}).toArray(new String[0]);
            Pattern patternCompile2 = Pattern.compile("[^0-9.]");
            OooOo.OooO0Oo(patternCompile2, "compile(...)");
            OooOo.OooO0o0(input2, "input");
            String strReplaceAll2 = patternCompile2.matcher(input2).replaceAll("");
            OooOo.OooO0Oo(strReplaceAll2, "replaceAll(...)");
            String[] strArr2 = (String[]) o000000.Ooooo0o(strReplaceAll2, new String[]{"."}).toArray(new String[0]);
            while (i < strArr.length && i < strArr2.length && OooOo.OooO00o(strArr[i], strArr2[i])) {
                i++;
            }
            if (i >= strArr.length || i >= strArr2.length) {
                length = strArr.length - strArr2.length;
            } else {
                int iIntValue = Integer.valueOf(strArr[i]).intValue();
                Integer numValueOf = Integer.valueOf(strArr2[i]);
                OooOo.OooO0Oo(numValueOf, "valueOf(vals2[i])");
                length = OooOo.OooO0oO(iIntValue, numValueOf.intValue());
            }
            return Integer.signum(length);
        }

        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            OooOo.OooO0Oo(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }
    }

    public AdQualityBridge(Context context, String appKey, String str, C3136g1 adQualityDataProvider, int i) throws JSONException {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(appKey, "appKey");
        OooOo.OooO0o0(adQualityDataProvider, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) throws JSONException {
                OooOo.OooO0o0(isAdQualityInitError, "isAdQualityInitError");
                OooOo.OooO0o0(message, "message");
                EnumC2638ac enumC2638ac = EnumC2638ac.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (isAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    enumC2638ac = EnumC2638ac.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(enumC2638ac, Integer.valueOf(isAdQualityInitError.getValue()), message);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: ".concat(message), 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, EnumC2638ac.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectM8853a = adQualityDataProvider.m8853a();
            if (jSONObjectM8853a.length() > 0) {
                deviceIdType.setMetaData(jSONObjectM8853a);
            }
        }
        Companion.logEvent$default(companion, EnumC2638ac.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i) {
        return i != 0 ? i != 2 ? i != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.VERBOSE;
    }

    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String strM9662a = C3288ke.m9661a().m9662a("is_coppa");
        return strM9662a != null && Boolean.parseBoolean(strM9662a);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(C3288ke.m9661a().m9662a(RunnableC3323le.f9325N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(EnumC2638ac enumC2638ac, Integer num, String str) throws JSONException {
        Companion.logEvent(enumC2638ac, num, str);
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(String userId) {
        OooOo.OooO0o0(userId, "userId");
        IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(IronSourceSegment segment) {
        OooOo.OooO0o0(segment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (segment.getSegmentName() != null) {
            builder.setSegmentName(segment.getSegmentName());
        }
        if (segment.getAge() > -1) {
            builder.setAge(segment.getAge());
        }
        if (segment.getGender() != null) {
            builder.setGender(segment.getGender());
        }
        if (segment.getLevel() > -1) {
            builder.setLevel(segment.getLevel());
        }
        if (segment.getIsPaying() != null) {
            builder.setIsPaying(segment.getIsPaying().get());
        }
        if (segment.getIapt() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.getIapt());
        }
        if (segment.getUcd() > 0) {
            builder.setUserCreationDate(segment.getUcd());
        }
        ArrayList<Pair<String, String>> segmentData = segment.getSegmentData();
        int size = segmentData.size();
        int i = 0;
        while (i < size) {
            Pair<String, String> pair = segmentData.get(i);
            i++;
            Pair<String, String> pair2 = pair;
            String key = (String) pair2.first;
            String str = (String) pair2.second;
            OooOo.OooO0Oo(key, "key");
            if (o0000O00.Oooo0OO(key, "custom_", false)) {
                builder.setCustomData(o000000.OoooOo0(key, "custom_"), str);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}

package com.ironsource.mediationsdk.utils;

import OooO0oO.OooOo;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public class ErrorBuilder {
    /* renamed from: a */
    private static IronSourceError m10693a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, OooOo.OooOoo0(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, OooOo.OooOoo0(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInitFailedError(String str) {
        StringBuilder sb = new StringBuilder("Init failed - ");
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        sb.append(str);
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, sb.toString());
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, OooOo.OooOO0O("", str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("Init Fail - ", str, " value ", str2, " is not valid");
        sbOooOOo0.append(!TextUtils.isEmpty(str3) ? OooOo.OooOO0(" - ", str3) : "");
        return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sbOooOOo0.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m10693a();
        }
        StringBuilder sbOooOoO0 = OooOo.OooOoO0("Mediation - ", str, " value is not valid ");
        sbOooOoO0.append(!TextUtils.isEmpty(str2) ? OooOo.OooOO0(" - ", str2) : "");
        return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sbOooOoO0.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return m10693a();
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_KEY_NOT_SET, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(510, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : OooOo.OooOO0("Load failed - ", str));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, OooOo.OooOoo0(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, OooOo.OooOO0O("", str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, OooOo.OooOO0O("", str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, OooOo.OooOO0O("", str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, OooOo.OooOO0O("", str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, OooOo.OooOoo0(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, OooOo.OooOoo(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION, OooO00o.OooOO0o("Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:", str, " and userId:", str2));
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, OooOo.OooOoo0(str, " unsupported banner size"));
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, TextUtils.isEmpty(str) ? OooOo.OooOoo0(str2, " init failed due to an unknown error") : OooOo.OooOoo(str2, " - ", str));
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String strOooOOOo = OooOo.OooOOOo(OooOo.OooOoO0("", str, " Load Fail"), TextUtils.isEmpty(str2) ? "" : OooOo.OooOO0(StringUtils.SPACE, str2), " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(510, OooOo.OooOoo0(strOooOOOo, str3));
    }
}

package com.google.android.gms.internal.ads;

import com.ironsource.C3551q9;
import com.ironsource.EnumC2638ac;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.unity3d.services.core.device.MimeTypes;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.w4 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2183w4 {
    public static int OooO(int i, int i2, int i3, int i4) {
        return rz0.oo000o(i) + i2 + i3 + i4;
    }

    public static final boolean OooO00o(int i) {
        return !o0000oO.o0OO00O.OooO00o();
    }

    public static final boolean OooO0O0(int i) {
        Boolean bool;
        if (o0000oO.o0OO00O.OooO00o()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                o0000oO.o0OO00O.f29623OooO00o.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int OooO0OO(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ String OooO0Oo(int i) {
        switch (i) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "read-from-disk-start";
            case 4:
                return "read-from-disk-end";
            case 5:
                return "client-signals-start";
            case 6:
                return "client-signals-end";
            case 7:
                return "service-connected";
            case 8:
                return "gms-signals-start";
            case 9:
                return "gms-signals-end";
            case 10:
                return "get-signals-sdkcore-start";
            case 11:
                return "get-signals-sdkcore-end";
            case 12:
                return "get-ad-dictionary-sdkcore-start";
            case 13:
                return "get-ad-dictionary-sdkcore-end";
            case 14:
                return "http-response-ready";
            case 15:
                return "normalize-ad-response-start";
            case 16:
                return "normalize-ad-response-end";
            case 17:
                return "binder-call-start";
            case 18:
                return "server-response-parse-start";
            case 19:
                return "rendering-start";
            case 20:
                return "public-api-callback";
            case 21:
                return "rendering-webview-creation-start";
            case 22:
                return "rendering-webview-creation-end";
            case 23:
                return "rendering-ad-component-creation-end";
            case 24:
                return "rendering-configure-webview-start";
            case 25:
                return "rendering-configure-webview-end";
            case 26:
                return "rendering-webview-load-html-start";
            case 27:
                return "rendering-webview-load-html-end";
            case 28:
                return "type2-fetch-start";
            case 29:
                return "type2-fetch-end";
            case 30:
                return "sod-validation-start";
            case 31:
                return "sod-validation-end";
            case 32:
                return "sod-cache-key-start";
            case 33:
                return "sod-cache-key-end";
            case 34:
                return "sod-read-and-remove-start";
            case 35:
                return "sod-read-and-remove-end";
            case 36:
                return "sod-decode-start";
            case 37:
                return "sod-decode-end";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String OooO0o(int i) {
        if (i == 1) {
            return "beginToRender";
        }
        if (i == 2) {
            return "definedByJavascript";
        }
        if (i == 3) {
            return "onePixel";
        }
        if (i == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static /* synthetic */ String OooO0o0(int i) {
        if (i == 1) {
            return "htmlDisplay";
        }
        if (i == 2) {
            return "nativeDisplay";
        }
        if (i == 3) {
            return MimeTypes.BASE_TYPE_VIDEO;
        }
        throw null;
    }

    public static /* synthetic */ int OooO0oO(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int OooO0oo(int i, int i2, int i3) {
        return rz0.oo000o(i) + i2 + i3;
    }

    public static int OooOO0(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static String OooOO0O(StringBuilder sb, String str) {
        sb.append(str.intern());
        return sb.toString();
    }

    public static String OooOO0o(StringBuilder sb, String str, String str2) {
        sb.append(str.intern());
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder OooOOO(String str, Throwable th) {
        C3551q9.m11517d().m11519a(th);
        return new StringBuilder(str);
    }

    public static StringBuilder OooOOO0(Exception exc, String str) {
        C3551q9.m11517d().m11519a(exc);
        return new StringBuilder(str);
    }

    public static oo00o.OooOO0O OooOOOO(String str, String str2, String str3) {
        return o00O0.o000OOo.OooO0O0(new AndroidWebKitError(str, str2, str3));
    }

    public static void OooOOOo(EnumC2638ac enumC2638ac, Set set) {
        set.add(Integer.valueOf(enumC2638ac.m4887b()));
    }

    public static void OooOOo(StringBuilder sb, String str, String str2, IronLog ironLog) {
        sb.append(str);
        sb.append(str2);
        ironLog.verbose(sb.toString());
    }

    public static void OooOOo0(String str, String str2, String str3, String str4) {
        Logger.m12266i(str4, str + str2 + str3);
    }

    public static void OooOOoo(oo00o.OooOO0O oooOO0O, o00O0Oo.Oooo000 oooo000) {
        oooo000.invoke(new oo00o.OooOOO0(oooOO0O));
    }

    public static int OooOo(int i, int i2, int i3, int i4) {
        return com.google.android.gms.internal.play_billing.o0O0000O.OooooO0(i) + i2 + i3 + i4;
    }

    public static int OooOo0(int i, int i2, int i3) {
        return com.google.android.gms.internal.measurement.oO000O0.OooOoOO(i) + i2 + i3;
    }

    public static void OooOo00(oo00o.OooOo oooOo, o00O0Oo.Oooo000 oooo000) {
        oooo000.invoke(new oo00o.OooOOO0(oooOo));
    }

    public static int OooOo0O(int i, int i2, int i3, int i4) {
        return com.google.android.gms.internal.measurement.oO000O0.OooOoOO(i) + i2 + i3 + i4;
    }

    public static int OooOo0o(int i, int i2, int i3) {
        return com.google.android.gms.internal.play_billing.o0O0000O.OooooO0(i) + i2 + i3;
    }

    public static int OooOoO(int i, int i2, int i3, int i4) {
        return com.google.crypto.tink.shaded.protobuf.OooOo00.OooOoO0(i) + i2 + i3 + i4;
    }

    public static int OooOoO0(int i, int i2, int i3) {
        return com.google.crypto.tink.shaded.protobuf.OooOo00.OooOo(i) + i2 + i3;
    }

    public static int OooOoOO(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) % i4;
    }

    public static /* synthetic */ String OooOoo(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }

    public static /* synthetic */ String OooOoo0(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }
}

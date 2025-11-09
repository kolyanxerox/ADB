package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.a9 */
/* loaded from: classes2.dex */
public class C2635a9 {

    /* renamed from: a */
    public static final String f3905a = "NETWORK_TYPE_WIFI";

    /* renamed from: b */
    public static final String f3906b = "NETWORK_TYPE_VPN";

    /* renamed from: c */
    public static final String f3907c = "NETWORK_TYPE_ETHERNET";

    /* renamed from: d */
    public static final String f3908d = "NETWORK_TYPE_UNKNOWN";

    /* renamed from: e */
    public static final String f3909e = "notReachable";

    /* renamed from: f */
    public static final String f3910f = "PHONE_TYPE_NONE";

    /* renamed from: g */
    public static final String f3911g = "NETWORK_TYPE_GPRS";

    /* renamed from: h */
    public static final String f3912h = "NETWORK_TYPE_EDGE";

    /* renamed from: i */
    public static final String f3913i = "NETWORK_TYPE_UMTS";

    /* renamed from: j */
    public static final String f3914j = "NETWORK_TYPE_CDMA";

    /* renamed from: k */
    public static final String f3915k = "NETWORK_TYPE_EVDO_0";

    /* renamed from: l */
    public static final String f3916l = "NETWORK_TYPE_EVDO_A";

    /* renamed from: m */
    public static final String f3917m = "NETWORK_TYPE_1xRTT";

    /* renamed from: n */
    public static final String f3918n = "NETWORK_TYPE_HSDPA";

    /* renamed from: o */
    public static final String f3919o = "NETWORK_TYPE_HSUPA";

    /* renamed from: p */
    public static final String f3920p = "NETWORK_TYPE_HSPA";

    /* renamed from: q */
    public static final String f3921q = "NETWORK_TYPE_IDEN";

    /* renamed from: r */
    public static final String f3922r = "NETWORK_TYPE_EVDO_B";

    /* renamed from: s */
    public static final String f3923s = "NETWORK_TYPE_LTE";

    /* renamed from: t */
    public static final String f3924t = "NETWORK_TYPE_EHRPD";

    /* renamed from: u */
    public static final String f3925u = "NETWORK_TYPE_HSPAP";

    /* renamed from: v */
    public static final String f3926v = "NETWORK_TYPE_GSM";

    /* renamed from: w */
    public static final String f3927w = "NETWORK_TYPE_TD_SCDMA";

    /* renamed from: x */
    public static final String f3928x = "NETWORK_TYPE_IWLAN";

    /* renamed from: y */
    public static final String f3929y = "NETWORK_TYPE_LTE_CA";

    /* renamed from: z */
    public static final String f3930z = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static Network m4793a(Context context) {
        if (context == null) {
            return null;
        }
        return m4794a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    /* renamed from: b */
    public static String m4798b(Context context) {
        return m4796a(m4793a(context), context);
    }

    /* renamed from: c */
    private static String m4800c(Context context) {
        String strM13299a = C3896z8.m13299a(context);
        return TextUtils.isEmpty(strM13299a) ? "none" : strM13299a;
    }

    /* renamed from: d */
    public static String m4801d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkM4794a = m4794a(connectivityManager);
            if (networkM4794a == null) {
                return f3909e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkM4794a);
                if (networkCapabilities == null) {
                    return f3908d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f3905a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return m4795a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th);
            }
        }
        return f3908d;
    }

    /* renamed from: e */
    public static boolean m4802e(Context context) {
        return m4799b(context, m4793a(context)).equals("vpn");
    }

    @Nullable
    /* renamed from: a */
    private static Network m4794a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private static String m4799b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network == null || context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                return networkCapabilities.hasTransport(1) ? C3896z8.f12930b : networkCapabilities.hasTransport(0) ? C3896z8.f12935g : networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(3) ? C3896z8.f12933e : networkCapabilities.hasTransport(5) ? C3896z8.f12936h : networkCapabilities.hasTransport(6) ? C3896z8.f12937i : networkCapabilities.hasTransport(2) ? C3896z8.f12932d : "";
            }
            return "";
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: a */
    private static String m4795a(int i) {
        switch (i) {
            case 0:
                return f3910f;
            case 1:
                return f3911g;
            case 2:
                return f3912h;
            case 3:
                return f3913i;
            case 4:
                return f3914j;
            case 5:
                return f3915k;
            case 6:
                return f3916l;
            case 7:
                return f3917m;
            case 8:
                return f3918n;
            case 9:
                return f3919o;
            case 10:
                return f3920p;
            case 11:
                return f3921q;
            case 12:
                return f3922r;
            case 13:
                return f3923s;
            case 14:
                return f3924t;
            case 15:
                return f3925u;
            case 16:
                return f3926v;
            case 17:
                return f3927w;
            case 18:
                return f3928x;
            case 19:
                return f3929y;
            case 20:
                return f3930z;
            default:
                return f3908d;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static String m4796a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return C3896z8.f12930b;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return C3896z8.f12929a;
                    }
                }
                return m4800c(context);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return "none";
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static JSONObject m4797a(Context context, Network network) throws JSONException {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(C3034d9.i.f8210v, m4802e(context));
                    return jSONObject;
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return jSONObject;
    }
}

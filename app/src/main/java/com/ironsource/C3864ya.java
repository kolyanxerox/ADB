package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ya */
/* loaded from: classes2.dex */
public class C3864ya {

    /* renamed from: a */
    private static final String f12740a = "ya";

    /* renamed from: a */
    public static JSONObject m13180a(Context context) throws JSONException {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.m12266i(f12740a, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.m12266i(f12740a, "add LAT");
                jSONObject.put(C3034d9.i.f8158M, Boolean.parseBoolean(limitAdTracking));
                return jSONObject;
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static JSONObject m13185b(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m13182a(jSONObject);
        m13191d(context, jSONObject);
        m13190c(jSONObject);
        m13186b(context, jSONObject);
        m13194g(context, jSONObject);
        m13192e(context, jSONObject);
        m13187b(jSONObject);
        m13193f(context, jSONObject);
        m13189c(context, jSONObject);
        m13181a(context, jSONObject);
        m13195h(context, jSONObject);
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m13188c(Context context) throws JSONException {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        C3898za c3898zaM13309b = C3898za.m13309b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strM13315d = c3898zaM13309b.m13315d();
            if (strM13315d != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8191k), SDKUtils.encodeString(strM13315d));
            }
            String strM13314c = c3898zaM13309b.m13314c();
            if (strM13314c != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8193l), SDKUtils.encodeString(strM13314c));
            }
            String strM13316e = c3898zaM13309b.m13316e();
            if (strM13316e != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8195m), SDKUtils.encodeString(strM13316e));
            }
            String strM13317f = c3898zaM13309b.m13317f();
            if (strM13317f != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8197n), strM13317f.replaceAll("[^0-9/.]", ""));
            }
            String strM13317f2 = c3898zaM13309b.m13317f();
            if (strM13317f2 != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8199o), SDKUtils.encodeString(strM13317f2));
            }
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8201p), String.valueOf(c3898zaM13309b.m13312a()));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8203q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (c3898zaM13309b.m13313b() != null && c3898zaM13309b.m13313b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8205r), SDKUtils.encodeString(c3898zaM13309b.m13313b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8212x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (m13184a(C3034d9.i.f8190j0)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8190j0), SDKUtils.encodeString(String.valueOf(interfaceC3767vfMo8686f.mo4855h(context))));
            }
            String strM7874g = C2959b4.m7874g(context);
            if (!TextUtils.isEmpty(strM7874g)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strM7874g));
            }
            String strValueOf = String.valueOf(interfaceC3767vfMo8686f.mo4854h());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8156K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(interfaceC3767vfMo8686f.mo4851f());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8160O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), C3126fq.m8739d(context));
            jSONObject.put("mcc", C3896z8.m13300b(context));
            jSONObject.put("mnc", C3896z8.m13301c(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8164S), C3896z8.m13304f(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8163R), SDKUtils.encodeString(C3896z8.m13305g(context)));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8167V), C2959b4.m7873f(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8169X), C2959b4.m7870d(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8168W), SDKUtils.encodeString(C2959b4.m7866b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), C3126fq.m8738c(context));
            String strM7872e = C2959b4.m7872e(context);
            if (!TextUtils.isEmpty(strM7872e)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8176c0), SDKUtils.encodeString(strM7872e));
            }
            jSONObject.put(C3034d9.i.f8178d0, SDKUtils.encodeString(String.valueOf(interfaceC3767vfMo8686f.mo4858j())));
            jSONObject.put(C3034d9.i.f8180e0, SDKUtils.encodeString(String.valueOf(interfaceC3767vfMo8686f.mo4872q())));
            String strMo4867n = interfaceC3767vfMo8686f.mo4867n(context);
            if (!TextUtils.isEmpty(strMo4867n)) {
                jSONObject.put("icc", strMo4867n);
            }
            String strMo4841b = interfaceC3767vfMo8686f.mo4841b();
            if (!TextUtils.isEmpty(strMo4841b)) {
                jSONObject.put("tz", SDKUtils.encodeString(strMo4841b));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    /* renamed from: d */
    private static void m13191d(Context context, JSONObject jSONObject) throws JSONException {
        try {
            String strM4798b = C2635a9.m4798b(context);
            String strM4801d = C2635a9.m4801d(context);
            if (!TextUtils.isEmpty(strM4801d)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8209u), SDKUtils.encodeString(strM4801d));
            }
            if (!TextUtils.isEmpty(strM4798b) && !strM4798b.equals("none")) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8208t), SDKUtils.encodeString(strM4798b));
            }
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8210v), C2635a9.m4802e(context));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: e */
    private static void m13192e(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8161P), C3898za.m13309b(context).m13311a(context));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: f */
    private static void m13193f(Context context, JSONObject jSONObject) throws JSONException {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        try {
            if (m13184a(C3034d9.i.f8192k0)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8192k0), interfaceC3767vfMo8686f.mo4829J(context));
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: g */
    private static void m13194g(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(C3451ne.f10452X0), C3495on.m11199U().mo8686f().mo4873q(context));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: h */
    private static void m13195h(Context context, JSONObject jSONObject) throws JSONException {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        try {
            if (m13184a(C3034d9.i.f8198n0)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8198n0), interfaceC3767vfMo8686f.mo4847d(context));
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    private static void m13181a(Context context, JSONObject jSONObject) throws JSONException {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        try {
            if (m13184a(C3034d9.i.f8196m0)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8196m0), interfaceC3767vfMo8686f.mo4845c(context));
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: b */
    private static void m13186b(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8170Y), C3495on.m11199U().mo8686f().mo4884y(context));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: c */
    private static void m13189c(Context context, JSONObject jSONObject) throws JSONException {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        try {
            if (m13184a(C3034d9.i.f8194l0)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8194l0), interfaceC3767vfMo8686f.mo4863l(context));
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    private static void m13182a(JSONObject jSONObject) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        try {
            m13183a(jSONObject, C3034d9.i.f8153H, String.valueOf(interfaceC3767vfMo8686f.mo4846d()));
            m13183a(jSONObject, C3034d9.i.f8154I, String.valueOf(interfaceC3767vfMo8686f.mo4860k()));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: b */
    private static void m13187b(JSONObject jSONObject) throws JSONException {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        try {
            if (m13184a(C3034d9.i.f8188i0)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8188i0), interfaceC3767vfMo8686f.mo4844c());
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: c */
    private static void m13190c(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8213y), SDKUtils.encodeString(String.valueOf(C3495on.m11199U().mo8686f().mo4868o())));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    private static void m13183a(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    private static boolean m13184a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }
}

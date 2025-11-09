package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.internal.C2492e;
import com.iab.omid.library.applovin.walking.C2517a;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.utils.c */
/* loaded from: classes2.dex */
public class C2507c {

    /* renamed from: a */
    private static WindowManager f3532a;

    /* renamed from: b */
    private static String[] f3533b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f3534c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.applovin.utils.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3535a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f3535a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.iab.omid.library.applovin.utils.c$b */
    public static class b {

        /* renamed from: a */
        final float f3536a;

        /* renamed from: b */
        final float f3537b;

        public b(float f, float f2) {
            this.f3536a = f;
            this.f3537b = f2;
        }
    }

    /* renamed from: a */
    public static float m4129a(int i) {
        return i / f3534c;
    }

    /* renamed from: b */
    public static void m4141b(JSONObject jSONObject) throws JSONException {
        b bVarM4130a = m4130a(jSONObject);
        try {
            jSONObject.put("width", bVarM4130a.f3536a);
            jSONObject.put("height", bVarM4130a.f3537b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m4145c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m4140a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!jSONArrayOptJSONArray.optString(i, "").equals(jSONArrayOptJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m4146d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m4147e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m4148f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f3533b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m4149g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m4150h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m4148f(jSONObject, jSONObject2) && m4149g(jSONObject, jSONObject2) && m4147e(jSONObject, jSONObject2) && m4146d(jSONObject, jSONObject2) && m4145c(jSONObject, jSONObject2) && m4144b(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    private static b m4130a(JSONObject jSONObject) {
        float fM4129a;
        float fM4129a2;
        if (f3532a != null) {
            Point point = new Point(0, 0);
            f3532a.getDefaultDisplay().getRealSize(point);
            fM4129a = m4129a(point.x);
            fM4129a2 = m4129a(point.y);
        } else {
            fM4129a = 0.0f;
            fM4129a2 = 0.0f;
        }
        return new b(fM4129a, fM4129a2);
    }

    /* renamed from: b */
    public static void m4142b(JSONObject jSONObject, Boolean bool) throws JSONException {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C2508d.m4152a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m4131a(int i, int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m4129a(i));
            jSONObject.put("y", m4129a(i2));
            jSONObject.put("width", m4129a(i3));
            jSONObject.put("height", m4129a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C2508d.m4152a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static void m4143b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C2508d.m4152a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m4132a(Context context) {
        if (context != null) {
            f3534c = context.getResources().getDisplayMetrics().density;
            f3532a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m4144b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m4140a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m4150h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m4133a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) throws JSONException {
        try {
            jSONObject.put("noOutputDevice", m4139a(outputDeviceStatus));
        } catch (JSONException e) {
            C2508d.m4152a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m4134a(JSONObject jSONObject, C2517a.a aVar) throws JSONException {
        C2492e c2492eM4216a = aVar.m4216a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListM4218b = aVar.m4218b();
        int size = arrayListM4218b.size();
        int i = 0;
        while (i < size) {
            String str = arrayListM4218b.get(i);
            i++;
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c2492eM4216a.m4047d());
            jSONObject.put("friendlyObstructionPurpose", c2492eM4216a.m4045b());
            jSONObject.put("friendlyObstructionReason", c2492eM4216a.m4044a());
        } catch (JSONException e) {
            C2508d.m4152a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m4135a(JSONObject jSONObject, Boolean bool) throws JSONException {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C2508d.m4152a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m4136a(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C2508d.m4152a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m4137a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C2508d.m4152a("JSONException during JSONObject.put for name [" + str + C3034d9.i.f8179e, e);
        }
    }

    /* renamed from: a */
    public static void m4138a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m4139a(OutputDeviceStatus outputDeviceStatus) {
        return a.f3535a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m4140a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}

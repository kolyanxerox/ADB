package com.iab.omid.library.ironsrc.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.OutputDeviceStatus;
import com.iab.omid.library.ironsrc.internal.C2543e;
import com.iab.omid.library.ironsrc.walking.C2568a;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.utils.c */
/* loaded from: classes2.dex */
public class C2558c {

    /* renamed from: a */
    private static WindowManager f3667a;

    /* renamed from: b */
    private static String[] f3668b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f3669c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.ironsrc.utils.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3670a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f3670a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.iab.omid.library.ironsrc.utils.c$b */
    public static class b {

        /* renamed from: a */
        final float f3671a;

        /* renamed from: b */
        final float f3672b;

        public b(float f, float f2) {
            this.f3671a = f;
            this.f3672b = f2;
        }
    }

    /* renamed from: a */
    public static float m4382a(int i) {
        return i / f3669c;
    }

    /* renamed from: b */
    public static void m4394b(JSONObject jSONObject) throws JSONException {
        b bVarM4383a = m4383a(jSONObject);
        try {
            jSONObject.put("width", bVarM4383a.f3671a);
            jSONObject.put("height", bVarM4383a.f3672b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m4398c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m4393a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m4399d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m4400e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m4401f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f3668b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m4402g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m4403h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m4401f(jSONObject, jSONObject2) && m4402g(jSONObject, jSONObject2) && m4400e(jSONObject, jSONObject2) && m4399d(jSONObject, jSONObject2) && m4398c(jSONObject, jSONObject2) && m4397b(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    private static b m4383a(JSONObject jSONObject) {
        float fM4382a;
        float fM4382a2;
        if (f3667a != null) {
            Point point = new Point(0, 0);
            f3667a.getDefaultDisplay().getRealSize(point);
            fM4382a = m4382a(point.x);
            fM4382a2 = m4382a(point.y);
        } else {
            fM4382a = 0.0f;
            fM4382a2 = 0.0f;
        }
        return new b(fM4382a, fM4382a2);
    }

    /* renamed from: b */
    public static void m4395b(JSONObject jSONObject, Boolean bool) throws JSONException {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C2559d.m4405a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m4384a(int i, int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m4382a(i));
            jSONObject.put("y", m4382a(i2));
            jSONObject.put("width", m4382a(i3));
            jSONObject.put("height", m4382a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C2559d.m4405a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static void m4396b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C2559d.m4405a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m4385a(Context context) {
        if (context != null) {
            f3669c = context.getResources().getDisplayMetrics().density;
            f3667a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m4397b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m4393a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m4403h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m4386a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) throws JSONException {
        try {
            jSONObject.put("noOutputDevice", m4392a(outputDeviceStatus));
        } catch (JSONException e) {
            C2559d.m4405a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m4387a(JSONObject jSONObject, C2568a.a aVar) throws JSONException {
        C2543e c2543eM4469a = aVar.m4469a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListM4471b = aVar.m4471b();
        int size = arrayListM4471b.size();
        int i = 0;
        while (i < size) {
            String str = arrayListM4471b.get(i);
            i++;
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c2543eM4469a.m4300d());
            jSONObject.put("friendlyObstructionPurpose", c2543eM4469a.m4298b());
            jSONObject.put("friendlyObstructionReason", c2543eM4469a.m4297a());
        } catch (JSONException e) {
            C2559d.m4405a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m4388a(JSONObject jSONObject, Boolean bool) throws JSONException {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C2559d.m4405a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m4389a(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C2559d.m4405a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m4390a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C2559d.m4405a("JSONException during JSONObject.put for name [" + str + C3034d9.i.f8179e, e);
        }
    }

    /* renamed from: a */
    public static void m4391a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
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
    private static boolean m4392a(OutputDeviceStatus outputDeviceStatus) {
        return a.f3670a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m4393a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}

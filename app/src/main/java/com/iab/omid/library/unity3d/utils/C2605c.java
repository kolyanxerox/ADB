package com.iab.omid.library.unity3d.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.OutputDeviceStatus;
import com.iab.omid.library.unity3d.internal.C2592e;
import com.iab.omid.library.unity3d.walking.C2614a;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.utils.c */
/* loaded from: classes2.dex */
public class C2605c {

    /* renamed from: a */
    private static WindowManager f3796a;

    /* renamed from: b */
    private static String[] f3797b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f3798c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.unity3d.utils.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3799a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f3799a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.iab.omid.library.unity3d.utils.c$b */
    public static class b {

        /* renamed from: a */
        final float f3800a;

        /* renamed from: b */
        final float f3801b;

        public b(float f, float f2) {
            this.f3800a = f;
            this.f3801b = f2;
        }
    }

    /* renamed from: a */
    public static float m4623a(int i) {
        return i / f3798c;
    }

    /* renamed from: b */
    public static void m4635b(JSONObject jSONObject) throws JSONException {
        b bVarM4624a = m4624a(jSONObject);
        try {
            jSONObject.put("width", bVarM4624a.f3800a);
            jSONObject.put("height", bVarM4624a.f3801b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m4638c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m4634a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m4639d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m4640e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m4641f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f3797b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m4642g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m4643h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m4641f(jSONObject, jSONObject2) && m4642g(jSONObject, jSONObject2) && m4640e(jSONObject, jSONObject2) && m4639d(jSONObject, jSONObject2) && m4638c(jSONObject, jSONObject2) && m4637b(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    private static b m4624a(JSONObject jSONObject) {
        float fM4623a;
        float fM4623a2;
        if (f3796a != null) {
            Point point = new Point(0, 0);
            f3796a.getDefaultDisplay().getRealSize(point);
            fM4623a = m4623a(point.x);
            fM4623a2 = m4623a(point.y);
        } else {
            fM4623a = 0.0f;
            fM4623a2 = 0.0f;
        }
        return new b(fM4623a, fM4623a2);
    }

    /* renamed from: b */
    public static void m4636b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C2606d.m4645a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m4625a(int i, int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m4623a(i));
            jSONObject.put("y", m4623a(i2));
            jSONObject.put("width", m4623a(i3));
            jSONObject.put("height", m4623a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C2606d.m4645a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* renamed from: b */
    private static boolean m4637b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m4634a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m4643h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m4626a(Context context) {
        if (context != null) {
            f3798c = context.getResources().getDisplayMetrics().density;
            f3796a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m4627a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) throws JSONException {
        try {
            jSONObject.put("noOutputDevice", m4633a(outputDeviceStatus));
        } catch (JSONException e) {
            C2606d.m4645a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m4628a(JSONObject jSONObject, C2614a.a aVar) throws JSONException {
        C2592e c2592eM4703a = aVar.m4703a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListM4705b = aVar.m4705b();
        int size = arrayListM4705b.size();
        int i = 0;
        while (i < size) {
            String str = arrayListM4705b.get(i);
            i++;
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c2592eM4703a.m4556d());
            jSONObject.put("friendlyObstructionPurpose", c2592eM4703a.m4554b());
            jSONObject.put("friendlyObstructionReason", c2592eM4703a.m4553a());
        } catch (JSONException e) {
            C2606d.m4645a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m4629a(JSONObject jSONObject, Boolean bool) throws JSONException {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C2606d.m4645a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m4630a(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C2606d.m4645a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m4631a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C2606d.m4645a("JSONException during JSONObject.put for name [" + str + C3034d9.i.f8179e, e);
        }
    }

    /* renamed from: a */
    public static void m4632a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
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
    private static boolean m4633a(OutputDeviceStatus outputDeviceStatus) {
        return a.f3799a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m4634a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}

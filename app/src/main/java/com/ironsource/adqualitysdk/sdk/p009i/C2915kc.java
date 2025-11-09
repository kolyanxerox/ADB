package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.kc */
/* loaded from: classes2.dex */
public final class C2915kc {

    /* renamed from: ｋ */
    private static int f7217 = 0;

    /* renamed from: ﾇ */
    private static int f7218 = 1;

    /* renamed from: ﻛ */
    private static char[] f7216 = {49311, 51258, 53730, 55983, 57968, 60173, 62676, 64925, 34118, 33948, 35863, 38355, 40578, 42587, 44885, 45255, 47516, 49493, 51756, 54245, 58540, 60541, 62780, 65279, 1978, 3897, 4303, 6546, 8514, 10759, 34682, 36806, 38402, 40264, 42448, 44170, 45897, 47646, 49879, 51625, 53368, 59173, 61408, 63217, 'x', 'y', 32518, 40222, 42795, 44960, 46692, 48437, 34284, 36066, 37733, 39480, 58091, 59795, 61506, 50963, 53200, 54917, 56582, 9222, 11471, 13153, 14882, 718, 2481, 4215, 26405, 28642, 30446, 32088, 17413, 19669, 21392};

    /* renamed from: ﻐ */
    private static long f7215 = 6625329886171302076L;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kc$b */
    public interface b<T> {
        /* renamed from: ｋ */
        T mo5209(JSONArray jSONArray, int i);
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kc$c */
    public interface c<T> {
        /* renamed from: ﻛ */
        T mo5208(JSONObject jSONObject, String str);
    }

    /* renamed from: ﻐ */
    public static JSONObject m7430(JSONObject jSONObject, boolean z) {
        int i = f7217 + 61;
        f7218 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!(!z)) {
                    f7218 = (f7217 + 9) % 128;
                    jSONObject2.remove(C2869ik.f6832);
                }
                f7217 = (f7218 + 99) % 128;
                return jSONObject2;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* renamed from: ﻛ */
    public static List<String> m7435(JSONArray jSONArray) {
        if (jSONArray == null) {
            f7217 = (f7218 + 121) % 128;
            return null;
        }
        List<String> listM7443 = m7443(jSONArray);
        f7217 = (f7218 + 83) % 128;
        return listM7443;
    }

    /* renamed from: ｋ */
    public static JSONObject m7441(JSONObject jSONObject) {
        f7217 = (f7218 + 57) % 128;
        JSONObject jSONObjectM7430 = m7430(jSONObject, false);
        int i = f7218 + 27;
        f7217 = i % 128;
        if (i % 2 == 0) {
            return jSONObjectM7430;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static void m7445(JSONObject jSONObject, JSONObject jSONObject2, boolean z) throws JSONException {
        if (jSONObject != null && jSONObject2 != null) {
            f7218 = (f7217 + 39) % 128;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (JSONException unused) {
                }
            }
            if (z) {
                int i = f7218 + 109;
                f7217 = i % 128;
                if (i % 2 != 0) {
                    jSONObject.remove(C2869ik.f6832);
                    throw null;
                }
                jSONObject.remove(C2869ik.f6832);
            }
        }
        f7217 = (f7218 + 75) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: JSONException -> 0x003e, TryCatch #0 {JSONException -> 0x003e, blocks: (B:4:0x000e, B:7:0x0015, B:11:0x0027, B:14:0x0035, B:20:0x0043, B:19:0x0040, B:21:0x0046, B:24:0x004b), top: B:28:0x000c }] */
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7447(org.json.JSONObject r7, int r8, java.util.List<java.lang.String> r9) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7217
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4b
            org.json.JSONArray r0 = r7.names()     // Catch: org.json.JSONException -> L3e
            if (r0 == 0) goto L4a
            r3 = r2
        L15:
            int r4 = r0.length()     // Catch: org.json.JSONException -> L3e
            if (r3 >= r4) goto L4a
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218
            int r4 = r4 + 17
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7217 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L46
            java.lang.String r4 = r0.optString(r3)     // Catch: org.json.JSONException -> L3e
            if (r9 == 0) goto L40
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218
            int r5 = r5 + 25
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7217 = r5
            boolean r5 = r9.contains(r4)     // Catch: org.json.JSONException -> L3e
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == r6) goto L40
            goto L43
        L3e:
            r7 = move-exception
            goto L4f
        L40:
            m7437(r7, r4, r8)     // Catch: org.json.JSONException -> L3e
        L43:
            int r3 = r3 + 1
            goto L15
        L46:
            r0.optString(r3)     // Catch: org.json.JSONException -> L3e
            throw r1
        L4a:
            return
        L4b:
            r7.names()     // Catch: org.json.JSONException -> L3e
            throw r1
        L4f:
            r8 = 48
            java.lang.String r9 = ""
            int r8 = android.text.TextUtils.indexOf(r9, r8, r2, r2)
            int r8 = r8 + 10
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r0 = r0 >> 16
            r1 = 49366(0xc0d6, float:6.9176E-41)
            r3 = 0
            int r5 = android.widget.ExpandableListView.getPackedPositionChild(r3)
            int r5 = r5 + r1
            char r1 = (char) r5
            java.lang.String r8 = m7434(r8, r0, r1)
            java.lang.String r8 = r8.intern()
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            int r0 = r0 + 20
            int r1 = android.view.View.resolveSize(r2, r2)
            int r1 = 9 - r1
            r3 = 34009(0x84d9, float:4.7657E-41)
            int r9 = android.text.TextUtils.getCapsMode(r9, r2, r2)
            int r9 = r9 + r3
            char r9 = (char) r9
            java.lang.String r9 = m7434(r0, r1, r9)
            java.lang.String r9 = r9.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7506(r8, r9, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2915kc.m7447(org.json.JSONObject, int, java.util.List):void");
    }

    /* renamed from: ﻛ */
    public static List<String> m7436(JSONObject jSONObject, String str, List<String> list) {
        f7218 = (f7217 + InterfaceC3173h3.d.b.f8823f) % 128;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return m7435(jSONArrayOptJSONArray);
        }
        int i = f7218 + 61;
        f7217 = i % 128;
        if (i % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[PHI: r3
  0x0038: PHI (r3v5 T) = (r3v4 T), (r3v6 T) binds: [B:14:0x0036, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.util.List<T> m7438(org.json.JSONArray r5, com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b<T> r6) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7217
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L40
            if (r5 == 0) goto L3f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L16:
            int r3 = r5.length()
            if (r2 >= r3) goto L3e
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7217
            int r3 = r3 + 1
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218 = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L32
            java.lang.Object r3 = r6.mo5209(r5, r2)
            r4 = 77
            int r4 = r4 / r1
            if (r3 == 0) goto L3b
            goto L38
        L32:
            java.lang.Object r3 = r6.mo5209(r5, r2)
            if (r3 == 0) goto L3b
        L38:
            r0.add(r3)
        L3b:
            int r2 = r2 + 1
            goto L16
        L3e:
            return r0
        L3f:
            return r1
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2915kc.m7438(org.json.JSONArray, com.ironsource.adqualitysdk.sdk.i.kc$b):java.util.List");
    }

    /* renamed from: ﻛ */
    private static void m7437(JSONObject jSONObject, String str, int i) throws JSONException {
        f7218 = (f7217 + 121) % 128;
        String strM7442 = m7442(jSONObject.opt(str), i);
        if (strM7442 != null) {
            if (strM7442.equals("")) {
                f7217 = (f7218 + 39) % 128;
                strM7442 = null;
            }
            jSONObject.put(str, strM7442);
        }
        int i2 = f7217 + 41;
        f7218 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    /* renamed from: ﾇ */
    public static <T> List<T> m7443(JSONArray jSONArray) {
        List<T> listM7438 = m7438(jSONArray, new b<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.kc.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
            /* renamed from: ｋ */
            public final T mo5209(JSONArray jSONArray2, int i) {
                return (T) jSONArray2.opt(i);
            }
        });
        int i = f7217 + 39;
        f7218 = i % 128;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
        }
        return listM7438;
    }

    /* renamed from: ﻐ */
    public static void m7433(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        f7217 = (f7218 + 33) % 128;
        m7445(jSONObject, jSONObject2, false);
        int i = f7218 + 41;
        f7217 = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    /* renamed from: ﾇ */
    private static void m7444(JSONObject jSONObject, int i) {
        int i2 = f7218 + InterfaceC3173h3.d.b.f8826i;
        f7217 = i2 % 128;
        int i3 = i2 % 2;
        m7447(jSONObject, i, null);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f7217 + 15;
        f7218 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private static void m7431(JSONArray jSONArray, int i) throws JSONException {
        f7217 = (f7218 + 31) % 128;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            f7218 = (f7217 + 47) % 128;
            m7432(jSONArray, i2, i);
        }
        int i3 = f7217 + 19;
        f7218 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m7442(java.lang.Object r5, int r6) throws org.json.JSONException {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7217 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L15
            boolean r0 = r5 instanceof org.json.JSONObject
            r3 = 33
            int r3 = r3 / r2
            if (r0 == 0) goto L1f
            goto L19
        L15:
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto L1f
        L19:
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            m7444(r5, r6)
            goto L7d
        L1f:
            boolean r0 = r5 instanceof org.json.JSONArray
            if (r0 == 0) goto L29
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            m7431(r5, r6)
            goto L7d
        L29:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L7d
            int r1 = r1 + 17
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218 = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L44
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.length()
            r1 = 36
            int r1 = r1 / r2
            if (r0 <= r6) goto L43
            goto L4c
        L43:
            return r5
        L44:
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.length()
            if (r0 <= r6) goto L7c
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r5.substring(r2, r6)
            r0.append(r5)
            int r5 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r5 = (byte) r5
            int r5 = r5 + 15
            java.lang.String r6 = ""
            int r6 = android.text.TextUtils.getOffsetAfter(r6, r2)
            int r6 = r6 + 30
            long r1 = android.os.Process.getElapsedCpuTime()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 34645(0x8755, float:4.8548E-41)
            int r2 = r2 - r1
            char r1 = (char) r2
            java.lang.String r5 = m7434(r5, r6, r1)
            java.lang.String r5 = com.google.android.gms.internal.ads.AbstractC2183w4.OooOO0O(r0, r5)
        L7c:
            return r5
        L7d:
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7217
            int r5 = r5 + 91
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2915kc.f7218 = r5
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2915kc.m7442(java.lang.Object, int):java.lang.String");
    }

    /* renamed from: ｋ */
    public static <T> Map<String, T> m7439(JSONObject jSONObject, c<T> cVar) {
        f7217 = (f7218 + 91) % 128;
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        f7218 = (f7217 + 39) % 128;
        while (!(!itKeys.hasNext())) {
            f7217 = (f7218 + 49) % 128;
            String next = itKeys.next();
            map.put(next, cVar.mo5208(jSONObject, next));
        }
        return map;
    }

    /* renamed from: ﻐ */
    private static void m7432(JSONArray jSONArray, int i, int i2) throws JSONException {
        String strM7442 = m7442(jSONArray.opt(i), i2);
        if (strM7442 != null) {
            int i3 = f7217 + 93;
            f7218 = i3 % 128;
            int i4 = i3 % 2;
            jSONArray.put(i, strM7442);
            if (i4 == 0) {
                throw null;
            }
            f7217 = (f7218 + 23) % 128;
        }
    }

    /* renamed from: ﻛ */
    private static String m7434(int i, int i2, char c2) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f7216[i2 + i3] ^ (i3 * f7215)) ^ c2);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ﾒ */
    public static Map<String, String> m7446(JSONObject jSONObject) {
        Map<String, String> mapM7439 = m7439(jSONObject, new c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.kc.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
            /* renamed from: ﻛ */
            public final /* synthetic */ String mo5208(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i = f7218 + 19;
        f7217 = i % 128;
        if (i % 2 == 0) {
            return mapM7439;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static JSONObject m7440(int i, int i2, long j, long j2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j > -1) {
                f7218 = (f7217 + 63) % 128;
                jSONObject.put(m7434((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 44 - TextUtils.getCapsMode("", 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), i);
                jSONObject.put(m7434(1 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0') + 46, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern(), i2);
                jSONObject.put(m7434(Color.green(0) + 1, 46 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 32627)).intern(), j);
                jSONObject.put(m7434(1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47, (char) (40298 - MotionEvent.axisFromString(""))).intern(), j2);
                return jSONObject;
            }
            jSONObject.put(m7434((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, 44 - ExpandableListView.getPackedPositionType(0L), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), -1);
            jSONObject.put(m7434(1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 45, (char) Color.red(0)).intern(), -1);
            jSONObject.put(m7434(1 - (ViewConfiguration.getFadingEdgeLength() >> 16), 46 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.resolveSizeAndState(0, 0, 0) + 32626)).intern(), -1);
            jSONObject.put(m7434(1 - Color.red(0), 48 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (40299 - ExpandableListView.getPackedPositionType(0L))).intern(), -1);
            f7217 = (f7218 + 19) % 128;
            return jSONObject;
        } catch (JSONException e) {
            C2921n.m7506(m7434(ImageFormat.getBitsPerPixel(0) + 10, TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49366)).intern(), m7434(29 - TextUtils.getOffsetAfter("", 0), 48 - View.MeasureSpec.getSize(0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42862)).intern(), e);
            return jSONObject;
        }
    }
}

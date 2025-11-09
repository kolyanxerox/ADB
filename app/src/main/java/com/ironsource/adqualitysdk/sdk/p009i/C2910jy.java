package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jy */
/* loaded from: classes2.dex */
public final class C2910jy {

    /* renamed from: ﮌ */
    private static int f7178 = 1;

    /* renamed from: ﮐ */
    private static int f7179;

    /* renamed from: ﱟ */
    private static short[] f7180;

    /* renamed from: ﱡ */
    private static int f7181;

    /* renamed from: ﺙ */
    private static byte[] f7182;

    /* renamed from: ﻏ */
    private static int f7183;

    /* renamed from: ﻐ */
    private static JSONObject f7184;

    /* renamed from: ﻛ */
    private static char[] f7185;

    /* renamed from: ｋ */
    private static JSONObject f7186;

    /* renamed from: ﾇ */
    private static char f7187;

    /* renamed from: ﾒ */
    private static int f7188;

    static {
        m7373();
        f7184 = null;
        int i = f7178 + 9;
        f7183 = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    /* renamed from: ﱟ */
    private static synchronized JSONObject m7367() {
        try {
            f7178 = (f7183 + 107) % 128;
            if (f7184 == null) {
                JSONObject jSONObject = new JSONObject();
                f7184 = jSONObject;
                try {
                    jSONObject.put(m7385((byte) ((-113) - TextUtils.getTrimmedLength("")), (short) (153 - AndroidCharacter.getMirror('0')), AndroidCharacter.getMirror('0') - 144, (-322500771) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 76068208).intern(), -1);
                    f7184.put(m7384((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8), "q", TextUtils.getOffsetAfter("", 0) + 1).intern(), -1);
                    f7178 = (f7183 + 5) % 128;
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7184;
    }

    /* renamed from: ﱡ */
    private static JSONObject m7368() {
        int i = f7178 + 29;
        f7183 = i % 128;
        if (i % 2 != 0) {
            C2915kc.m7441(m7369());
            throw null;
        }
        JSONObject jSONObjectM7441 = C2915kc.m7441(m7369());
        int i2 = f7178 + 113;
        f7183 = i2 % 128;
        if (i2 % 2 == 0) {
            return jSONObjectM7441;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    private static synchronized JSONObject m7369() {
        JSONObject jSONObject;
        int i = (f7183 + 67) % 128;
        f7178 = i;
        jSONObject = f7186;
        int i2 = i + InterfaceC3173h3.d.b.f8819b;
        f7183 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        return jSONObject;
    }

    /* renamed from: ﻐ */
    public static void m7372(JSONObject jSONObject) throws JSONException {
        f7183 = (f7178 + 85) % 128;
        try {
            jSONObject.put(m7384((byte) (8 - ExpandableListView.getPackedPositionType(0L)), "\u0001\u0002\u0003\u0004", TextUtils.getOffsetAfter("", 0) + 4).intern(), m7386());
            int i = f7178 + 7;
            f7183 = i % 128;
            if (i % 2 != 0) {
                int i2 = 60 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻛ */
    public static void m7373() {
        f7187 = (char) 6;
        f7185 = new char[]{'s', 'i', 'z', 'e', 'h', 'w', 'n', 'd', 'o', 'D', 'v', 'c', 'U', 't', 'l', 'E', 'r', ' ', 'g', 'p', 'a', 'y', 'M', 'f', 'm', 'x', 'b', 'j', ':', 'u', '{', '|', '}', '~', 127, 128};
        f7188 = 322500770;
        f7181 = 95;
        f7179 = 76068327;
        f7182 = new byte[]{-94, -47, 24, -23, -28, 24, -1, -63, 19, 22, -31, 16, -35, 66, -98, -23, -24, 23, 81, -72, -5, -27, -30, -23, 26, 3, -63, 19, 22, -31, 16, -35, 66, -92, -28, 16, -32, 11, 26, -23, 82, -99, 16, 84, -71, 14, -24, 11, 56, -87, -32, -42, 110, -40, 112, -52, -33, -91, -103, -6, -122, -91, 52, -127, -120, -91, -126, -119, -126, -67, 36, -15, 28, -60, 44, 28, 113, 99, -61, -65, -64, -58, 22, -119, 85, 21, -63, 17, -66, -53, 28, -125, 108, -65, 25, -66, -23, -60, -123, -35, 117, -123, 42, 74, 126, -40, 127, -40, -44, -116, 21, 67, -115, -46, 22, 48, -38, -46, 24, 62, 126, -38, -118, -41, -44, -123, 28, 53, -40, -126, -41, -78, -91, -66, -82, 82, -91, 102, 4, 93, -90, 5, 1, -99, -7, -91, 102, -118, 110, -91, 4, 18, -6, -91, 92, -78, 78, -62, 3, 4, -22, 12, 64, -84, -10, 81, -84, 4, -11, 0, 68, -74, -12, -2, 2, -18, -1, 72, -76, -12, 0, 0, -3, -2, 60, -85, -2, -8, -3, 40, -59, 108, 10, -120, 28, 111, 13, 26, 120, 105, 115, 39, 27, 37, 25, 27, 25, 10, 91, 118, 29, 109, 27, 33, 119, 114, 40, 112, -39, 97, 114, 113, 120, 37, 109, 40, -91, 72, 10, 25, -91, 74, 70, 100, -91, -16, -11, -110, -88, -124, -123, 31, -111, 22, -125, -91, -31, -31, 119, -90, -24, -106, -21, -15};
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0017  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7380(int r3, int r4) {
        /*
            r0 = 0
            if (r3 < 0) goto L2d
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2910jy.f7178
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2910jy.f7183 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L15
            r1 = 76
            int r1 = r1 / r0
            if (r4 < 0) goto L2d
            goto L17
        L15:
            if (r4 < 0) goto L2d
        L17:
            int r1 = m7376()
            if (r3 > r1) goto L2d
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2910jy.f7178
            int r3 = r3 + 91
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2910jy.f7183 = r3
            int r3 = m7370()
            if (r4 > r3) goto L2d
            r3 = 1
            return r3
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2910jy.m7380(int, int):boolean");
    }

    /* renamed from: ﾇ */
    public static String m7381() {
        f7183 = (f7178 + InterfaceC3173h3.d.b.f8826i) % 128;
        String str = Build.VERSION.RELEASE;
        f7178 = (f7183 + 51) % 128;
        return str;
    }

    /* renamed from: ﾒ */
    private static JSONObject m7386() {
        int i = f7178 + 39;
        f7183 = i % 128;
        if (i % 2 != 0) {
            C2915kc.m7441(m7367());
            throw null;
        }
        JSONObject jSONObjectM7441 = C2915kc.m7441(m7367());
        int i2 = f7183 + 71;
        f7178 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return jSONObjectM7441;
    }

    /* renamed from: ﻛ */
    public static synchronized void m7374(Activity activity) {
        try {
            f7183 = (f7178 + 17) % 128;
            if (activity != null) {
                m7382(activity.getApplicationContext());
            }
            int i = f7178 + 67;
            f7183 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ｋ */
    private static int m7376() {
        f7183 = (f7178 + 45) % 128;
        int iOptInt = m7386().optInt(m7385((byte) (TextUtils.lastIndexOf("", '0', 0, 0) - 112), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + InterfaceC3173h3.d.b.f8823f), (-95) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-322500771) - MotionEvent.axisFromString(""), (-76068208) - Color.argb(0, 0, 0, 0)).intern());
        int i = f7178 + InterfaceC3173h3.d.b.f8821d;
        f7183 = i % 128;
        if (i % 2 == 0) {
            return iOptInt;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x005d A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:68:0x0053, B:70:0x005d), top: B:93:0x0053, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:52:0x0003, B:58:0x0037, B:75:0x006c, B:87:0x00db, B:56:0x0014, B:60:0x0043, B:79:0x0078, B:65:0x004d, B:80:0x00ca, B:82:0x00d0, B:86:0x00da), top: B:92:0x0003, inners: #2 }] */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void m7382(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2910jy.m7382(android.content.Context):void");
    }

    /* renamed from: ﾒ */
    private static void m7387(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        f7178 = (f7183 + 11) % 128;
        try {
            JSONObject jSONObjectM7367 = m7367();
            jSONObjectM7367.put(m7385((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) - 113), (short) (KeyEvent.keyCodeFromString("") + InterfaceC3173h3.d.b.f8823f), (ViewConfiguration.getTouchSlop() >> 8) - 96, (-322500770) - (ViewConfiguration.getEdgeSlop() >> 16), (-76068208) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), i2);
            jSONObjectM7367.put(m7384((byte) (9 - (ViewConfiguration.getTouchSlop() >> 8)), "q", View.combineMeasuredStates(0, 0) + 1).intern(), i);
            f7178 = (f7183 + 115) % 128;
        } catch (Throwable th) {
            C2921n.m7506(m7384((byte) (41 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m7384((byte) (69 - (Process.myPid() >> 22)), "\u0010\u0011\u000e\n\u0011\f\u0001\u0004¹¹\u0000\u0007\u0017\f\u0005\u0006\u000f\u0004\u0000\t\f\u0005\u0002\u0003ª", 24 - ExpandableListView.getPackedPositionChild(0L)).intern(), th);
        }
    }

    /* renamed from: ﻛ */
    public static void m7375(Context context, JSONObject jSONObject) {
        String strIntern;
        boolean z;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m7385((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57), (short) (Color.red(0) + 92), View.resolveSizeAndState(0, 0, 0) - 96, TextUtils.getTrimmedLength("") - 322500721, (-76068230) - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m7385((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) - 63), (short) (59 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 96, Drawable.resolveOpacity(0, 0) - 322500713, ExpandableListView.getPackedPositionChild(0L) - 76068217).intern(), memoryInfo.availMem / 1048576);
            jSONObject.put(m7385((byte) ((-88) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) (MotionEvent.axisFromString("") + 32), (-96) - ((Process.getThreadPriority(0) + 20) >> 6), Color.alpha(0) - 322500709, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 76068218).intern(), memoryInfo.threshold / 1048576);
            if (memoryInfo.lowMemory) {
                int i = f7178 + 41;
                f7183 = i % 128;
                if (i % 2 != 0) {
                    strIntern = m7384((byte) (20 >> (PointF.length(0.0f, 1.0f) > 2.0f ? 1 : (PointF.length(0.0f, 1.0f) == 2.0f ? 0 : -1))), "¿¿\u0011\u0002", 5 / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
                    z = memoryInfo.lowMemory;
                } else {
                    strIntern = m7384((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 82), "¿¿\u0011\u0002", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3).intern();
                    z = memoryInfo.lowMemory;
                }
                jSONObject.put(strIntern, z);
            }
            jSONObject.put(m7385((byte) (ImageFormat.getBitsPerPixel(0) - 63), (short) (62 - View.MeasureSpec.getSize(0)), (-96) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 322500705, ExpandableListView.getPackedPositionChild(0L) - 76068217).intern(), memoryInfo.totalMem / 1048576);
            f7183 = (f7178 + 123) % 128;
        } catch (Throwable th) {
            String strIntern2 = m7384((byte) (TextUtils.getCapsMode("", 0, 0) + 41), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", TextUtils.lastIndexOf("", '0', 0, 0) + 12).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7385((byte) ((-47) - Color.red(0)), (short) (19 - Drawable.resolveOpacity(0, 0)), (-96) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-322500701) - TextUtils.indexOf("", "", 0, 0), (-76068259) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            sb.append(th.getLocalizedMessage());
            C2921n.m7509(strIntern2, sb.toString());
        }
    }

    /* renamed from: ﻐ */
    private static int m7370() {
        f7183 = (f7178 + 9) % 128;
        int iOptInt = m7386().optInt(m7384((byte) (8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "q", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        int i = f7183 + 19;
        f7178 = i % 128;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
        return iOptInt;
    }

    /* renamed from: ｋ */
    public static void m7377(Application application) {
        int i = f7183;
        int i2 = i + 107;
        f7178 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
            if (application == null) {
                return;
            }
        } else if (application == null) {
            return;
        }
        f7178 = (i + 37) % 128;
        m7382(application.getApplicationContext());
    }

    /* renamed from: ﻐ */
    public static void m7371(Context context, JSONObject jSONObject, boolean z) {
        f7183 = (f7178 + 15) % 128;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m7384((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 74), "\u0006\t¸¸\u0005\t\u0013\u0007\u0007\u0004\u000f\u0013", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11).intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m7384((byte) (120 - Color.red(0)), "\u0016\u0001\t\u0007Ý", TextUtils.getTrimmedLength("") + 5).intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                f7178 = (f7183 + 71) % 128;
                jSONObject.put(m7385((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 49), (short) (114 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 96, (-322500638) - Color.green(0), (-76068219) - ImageFormat.getBitsPerPixel(0)).intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    f7178 = (f7183 + 21) % 128;
                    jSONObject.put(m7384((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), "\u0019\u001b\u0013\u0019i", 5 - KeyEvent.normalizeMetaState(0)).intern(), networkInfo.getType());
                    jSONObject.put(m7385((byte) (69 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (83 - Color.green(0)), (-96) - KeyEvent.getDeadChar(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 322500634, (-76068218) - TextUtils.getCapsMode("", 0, 0)).intern(), networkInfo.getTypeName());
                    jSONObject.put(m7385((byte) (TextUtils.indexOf("", "", 0, 0) + 68), (short) ((-72) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.resolveSize(0, 0) - 96, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 322500630, (-76068218) - (Process.myPid() >> 22)).intern(), networkInfo.getSubtype());
                    jSONObject.put(m7385((byte) (TextUtils.lastIndexOf("", '0') - 102), (short) ((-2) - (ViewConfiguration.getPressedStateDuration() >> 16)), (-96) - (ViewConfiguration.getScrollBarSize() >> 8), (-322500625) - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 76068218).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m7384((byte) (120 - ExpandableListView.getPackedPositionType(0L)), "\u0019\u001b\u0007\t", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4).intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m7385((byte) (5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (KeyEvent.keyCodeFromString("") - 10), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 96, ((Process.getThreadPriority(0) + 20) >> 6) - 322500621, (-76068218) - TextUtils.getOffsetBefore("", 0)).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m7384((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1), "\u0019\u001bdd", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4).intern(), telephonyManager.getNetworkCountryIso());
                    if (z) {
                        f7178 = (f7183 + 113) % 128;
                        jSONObject.put(m7384((byte) (View.combineMeasuredStates(0, 0) + 77), "\u0019\u001b\u0002\u0006", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5).intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m7385((byte) (36 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) ((KeyEvent.getMaxKeyCode() >> 16) - 125), ((byte) KeyEvent.getModifierMetaStateMask()) - 95, TextUtils.getOffsetBefore("", 0) - 322500617, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 76068217).intern(), telephonyManager.getSimOperatorName());
                    }
                }
            }
        } catch (Throwable th) {
            C2921n.m7506(m7384((byte) (41 - View.resolveSize(0, 0)), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", 11 - Color.blue(0)).intern(), m7385((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 127), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) - 123), (-96) - ((Process.getThreadPriority(0) + 20) >> 6), (-322500613) - Color.red(0), (KeyEvent.getMaxKeyCode() >> 16) - 76068258).intern(), th);
        }
    }

    /* renamed from: ﾒ */
    public static void m7388(Context context, JSONObject jSONObject) {
        f7178 = (f7183 + 113) % 128;
        try {
            if (C2908jw.m7348(context, m7385((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 47), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 73), (-96) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-322500580) - (Process.myPid() >> 22), Color.red(0) - 76068230).intern())) {
                f7178 = (f7183 + 113) % 128;
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m7385((byte) (29 - ((Process.getThreadPriority(0) + 20) >> 6)), (short) ((-43) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 96, (Process.myPid() >> 22) - 322500544, (-76068208) - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())).getConnectionInfo();
                jSONObject.put(m7385((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 5), (short) (TextUtils.indexOf("", "", 0) - 79), (-95) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 322500540, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 76068208).intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    f7183 = (f7178 + InterfaceC3173h3.d.b.f8823f) % 128;
                    jSONObject.put(m7385((byte) (ImageFormat.getBitsPerPixel(0) + 56), (short) (70 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 96, (-322500536) - Color.blue(0), (-92845424) - Color.rgb(0, 0, 0)).intern(), connectionInfo.getRssi());
                    jSONObject.put(m7384((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 85), "\u000b\u001d\u0001\u0012", (KeyEvent.getMaxKeyCode() >> 16) + 4).intern(), connectionInfo.getLinkSpeed());
                }
            }
        } catch (Throwable th) {
            C2921n.m7506(m7384((byte) (41 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10).intern(), m7384((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 81), "\u0010\u0011\u000e\n\u0011\f\u0013\b\r\u0007\f\u0018\u0017\u000b\u0005\u0013\u0005\r\u0000\u0007\u0014\u000b\f\u000e\u000b\u000e\u0004\t\u0000\tÅ", 31 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), th);
        }
    }

    /* renamed from: ｋ */
    private static void m7378(DisplayMetrics displayMetrics) {
        int i = f7178 + 67;
        f7183 = i % 128;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
            if (displayMetrics == null) {
                return;
            }
        } else if (displayMetrics == null) {
            return;
        }
        m7387(displayMetrics.heightPixels, displayMetrics.widthPixels);
        f7183 = (f7178 + 85) % 128;
    }

    /* renamed from: ｋ */
    public static void m7379(JSONObject jSONObject) {
        int i = f7178 + 117;
        f7183 = i % 128;
        try {
            if (i % 2 == 0) {
                long totalRxBytes = TrafficStats.getTotalRxBytes();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (totalRxBytes != -1) {
                    long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                    jSONObject.put(m7384((byte) (87 - View.resolveSize(0, 0)), "\u000b\u0000\u0001\u0012", 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), Math.round((1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis)) * (totalRxBytes2 - totalRxBytes)));
                    jSONObject.put(m7384((byte) (117 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u000b\u0000\r\u001c", TextUtils.indexOf((CharSequence) "", '0', 0) + 5).intern(), totalRxBytes2);
                }
                f7183 = (f7178 + 27) % 128;
                return;
            }
            TrafficStats.getTotalRxBytes();
            System.currentTimeMillis();
            System.currentTimeMillis();
            throw null;
        } catch (Throwable th) {
            C2921n.m7506(m7384((byte) (Gravity.getAbsoluteGravity(0, 0) + 41), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10).intern(), m7385((byte) ((-87) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (short) ((-45) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 96, TextUtils.getOffsetBefore("", 0) - 322500673, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 76068258).intern(), th);
        }
    }

    /* renamed from: ﾇ */
    public static void m7383(JSONObject jSONObject) throws JSONException {
        int i = f7178 + 9;
        f7183 = i % 128;
        if (i % 2 == 0) {
            JSONObject jSONObjectM7368 = m7368();
            if (jSONObjectM7368 != null) {
                C2915kc.m7433(jSONObject, jSONObjectM7368);
            }
            int i2 = f7178 + 123;
            f7183 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        m7368();
        throw null;
    }

    /* renamed from: ﾒ */
    public static void m7389(Intent intent) {
        int intExtra;
        int intExtra2;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            try {
                if (intent.hasExtra(m7385((byte) ((Process.myPid() >> 22) + 77), (short) (TextUtils.getTrimmedLength("") + 46), View.resolveSize(0, 0) - 96, (-322500532) - Color.blue(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 76068216).intern())) {
                    intExtra = intent.getIntExtra(m7385((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 77), (short) (46 - Gravity.getAbsoluteGravity(0, 0)), View.MeasureSpec.getSize(0) - 96, (-322500532) - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0') - 76068214).intern(), -1);
                    f7178 = (f7183 + 89) % 128;
                } else {
                    intExtra = -1;
                }
                jSONObject.put(m7385((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 37), (-96) - Color.green(0), (-322500524) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-76068228) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), intExtra);
                if (!intent.hasExtra(m7384((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41), "\u000f\u0002\t\u0004\u0095", 5 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    intExtra2 = -1;
                } else {
                    f7183 = (f7178 + 15) % 128;
                    intExtra2 = intent.getIntExtra(m7384((byte) (View.getDefaultSize(0, 0) + 41), "\u000f\u0002\t\u0004\u0095", TextUtils.indexOf("", "") + 5).intern(), -1);
                }
                jSONObject.put(m7384((byte) (8 - ImageFormat.getBitsPerPixel(0)), "\u0019\u000e\u0010\b", Drawable.resolveOpacity(0, 0) + 4).intern(), Math.round((intExtra2 * 100.0f) / (intent.hasExtra(m7385((byte) (91 - TextUtils.indexOf("", "", 0)), (short) ((-70) - (ViewConfiguration.getTouchSlop() >> 8)), View.MeasureSpec.makeMeasureSpec(0, 0) + (-96), KeyEvent.keyCodeFromString("") + (-322500521), TextUtils.indexOf("", "") + (-76068212)).intern()) ? intent.getIntExtra(m7385((byte) (91 - Color.red(0)), (short) ((-70) - Color.green(0)), (-96) - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollBarSize() >> 8) - 322500521, (-76068213) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), -1) : -1)));
            } catch (Throwable th) {
                String strIntern = m7384((byte) (TextUtils.indexOf("", "") + 41), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", AndroidCharacter.getMirror('0') - '%').intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m7384((byte) (107 - TextUtils.lastIndexOf("", '0')), "\u0010\u0011\u000e\n\u0011\f\u0013\b\r\u0007\f\u0018\u000e\u001d\u0013\u000e\u000f\u0001\u000f\u0016\f\u000f\u0004\t\u0002\u000f\u0005\f\u000e\u0007\u000f\u001d\u0002\u0006\n\u0018\u008c", 37 - Color.blue(0)).intern());
                sb.append(th.getLocalizedMessage());
                C2921n.m7509(strIntern, sb.toString());
            }
        }
        m7390(jSONObject);
        f7183 = (f7178 + 115) % 128;
    }

    /* renamed from: ﾒ */
    private static synchronized void m7390(JSONObject jSONObject) {
        int i = f7178;
        f7186 = jSONObject;
        int i2 = i + 79;
        f7183 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
    }

    /* renamed from: ﾒ */
    private static String m7384(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f7185;
                char c = f7187;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ */
    private static String m7385(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f7181;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f7182;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f7188 + i2] + i4);
                    } else {
                        i5 = (short) (f7180[f7188 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f7188 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f7179);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f7182;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f7180;
                            int i8 = C2912k.f7203;
                            C2912k.f7203 = i8 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                        }
                        sb.append(C2912k.f7204);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}

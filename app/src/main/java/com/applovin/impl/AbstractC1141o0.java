package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC1141o0 {

    /* renamed from: a */
    private static final Map f1552a = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: b */
    private static final Map f1553b = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: c */
    private static final Map f1554c = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: d */
    private static final Map f1555d = new HashMap(2);

    /* renamed from: com.applovin.impl.o0$a */
    public static class a {

        /* renamed from: a */
        private int f1556a;

        /* renamed from: b */
        private int f1557b;

        /* renamed from: c */
        private int f1558c;

        /* renamed from: d */
        private int f1559d;

        public a(int i, int i2, int i3, int i4) {
            this.f1556a = i;
            this.f1557b = i2;
            this.f1558c = i3;
            this.f1559d = i4;
        }

        /* renamed from: a */
        public boolean m1959a(Object obj) {
            return obj instanceof a;
        }

        /* renamed from: b */
        public int m1960b() {
            return this.f1556a;
        }

        /* renamed from: c */
        public int m1961c() {
            return this.f1558c;
        }

        /* renamed from: d */
        public int m1962d() {
            return this.f1557b;
        }

        /* renamed from: e */
        public Map m1963e() {
            HashMap map = new HashMap();
            map.put("left", Integer.valueOf(this.f1556a));
            map.put("top", Integer.valueOf(this.f1557b));
            map.put("right", Integer.valueOf(this.f1558c));
            map.put("bottom", Integer.valueOf(this.f1559d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.m1959a(this) && m1960b() == aVar.m1960b() && m1962d() == aVar.m1962d() && m1961c() == aVar.m1961c() && m1958a() == aVar.m1958a();
        }

        public int hashCode() {
            return m1958a() + ((m1961c() + ((m1962d() + ((m1960b() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + m1960b() + ", top=" + m1962d() + ", right=" + m1961c() + ", bottom=" + m1958a() + ")";
        }

        /* renamed from: a */
        public int m1958a() {
            return this.f1559d;
        }

        /* renamed from: a */
        public static a m1957a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    /* renamed from: com.applovin.impl.o0$b */
    public static class b {

        /* renamed from: a */
        private int f1560a;

        /* renamed from: b */
        private int f1561b;

        /* renamed from: c */
        private int f1562c;

        /* renamed from: d */
        private int f1563d;

        /* renamed from: com.applovin.impl.o0$b$a */
        public static class a {

            /* renamed from: a */
            private int f1564a;

            /* renamed from: b */
            private int f1565b;

            /* renamed from: c */
            private int f1566c;

            /* renamed from: d */
            private int f1567d;

            /* renamed from: a */
            public a m1969a(int i) {
                this.f1566c = i;
                return this;
            }

            /* renamed from: b */
            public a m1971b(int i) {
                this.f1567d = i;
                return this;
            }

            /* renamed from: c */
            public a m1972c(int i) {
                this.f1564a = i;
                return this;
            }

            /* renamed from: d */
            public a m1973d(int i) {
                this.f1565b = i;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb.append(this.f1564a);
                sb.append(", topRight=");
                sb.append(this.f1565b);
                sb.append(", bottomLeft=");
                sb.append(this.f1566c);
                sb.append(", bottomRight=");
                return OooO0oO.OooOo.OooOOO(sb, this.f1567d, ")");
            }

            /* renamed from: a */
            public b m1970a() {
                return new b(this.f1564a, this.f1565b, this.f1566c, this.f1567d);
            }
        }

        public b(int i, int i2, int i3, int i4) {
            this.f1560a = i;
            this.f1561b = i2;
            this.f1562c = i3;
            this.f1563d = i4;
        }

        /* renamed from: a */
        public boolean m1965a(Object obj) {
            return obj instanceof b;
        }

        /* renamed from: b */
        public int m1966b() {
            return this.f1563d;
        }

        /* renamed from: c */
        public int m1967c() {
            return this.f1560a;
        }

        /* renamed from: d */
        public int m1968d() {
            return this.f1561b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.m1965a(this) && m1967c() == bVar.m1967c() && m1968d() == bVar.m1968d() && m1964a() == bVar.m1964a() && m1966b() == bVar.m1966b();
        }

        public int hashCode() {
            return m1966b() + ((m1964a() + ((m1968d() + ((m1967c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + m1967c() + ", topRight=" + m1968d() + ", bottomLeft=" + m1964a() + ", bottomRight=" + m1966b() + ")";
        }

        /* renamed from: a */
        public int m1964a() {
            return this.f1562c;
        }
    }

    /* renamed from: a */
    public static void m1935a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static Point m1938b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        C1220k c1220k = C1220k.f2089D0;
        boolean z = c1220k == null || ((Boolean) c1220k.m2866a(C1268v4.f2890s6)).booleanValue();
        if (!m1947c(context) || z) {
            Map map = f1555d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        WindowManager windowManagerM1241f = AbstractC1078k7.m1241f(context);
        if (windowManagerM1241f != null) {
            Display defaultDisplay = windowManagerM1241f.getDefaultDisplay();
            if (m1942b()) {
                Rect bounds = windowManagerM1241f.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f1555d.put(Integer.valueOf(orientation), point);
        return point;
    }

    /* renamed from: c */
    public static boolean m1947c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    /* renamed from: d */
    public static boolean m1948d() {
        return Build.VERSION.SDK_INT >= 34;
    }

    /* renamed from: e */
    public static boolean m1949e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m1950f() {
        return true;
    }

    /* renamed from: g */
    public static boolean m1951g() {
        return true;
    }

    /* renamed from: h */
    public static boolean m1952h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: i */
    public static boolean m1953i() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: j */
    public static boolean m1954j() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: k */
    public static boolean m1955k() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* renamed from: l */
    public static boolean m1956l() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: c */
    public static a m1943c(WindowInsets windowInsets, C1220k c1220k) {
        if (c1220k == null || !((Boolean) c1220k.m2866a(C1268v4.f2543B4)).booleanValue() || windowInsets == null || !m1942b()) {
            return null;
        }
        return a.m1957a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    /* renamed from: a */
    public static Point m1931a(Context context) {
        Display defaultDisplay = AbstractC1078k7.m1241f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: c */
    public static Map m1944c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f1553b.get(str);
    }

    /* renamed from: a */
    public static a m1932a(WindowInsets windowInsets, C1220k c1220k) {
        if (c1220k == null || !((Boolean) c1220k.m2866a(C1268v4.f2543B4)).booleanValue() || windowInsets == null || !m1942b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    /* renamed from: c */
    public static void m1945c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f1553b.put(str, aVar.m1963e());
    }

    /* renamed from: c */
    public static boolean m1946c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* renamed from: a */
    public static Map m1934a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f1552a.get(str);
    }

    /* renamed from: a */
    public static void m1936a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f1552a.put(str, aVar.m1963e());
    }

    /* renamed from: b */
    public static a m1939b(WindowInsets windowInsets, C1220k c1220k) {
        if (c1220k == null || !((Boolean) c1220k.m2866a(C1268v4.f2543B4)).booleanValue() || windowInsets == null || !m1942b()) {
            return null;
        }
        return a.m1957a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    /* renamed from: a */
    public static b m1933a(Context context, C1220k c1220k) {
        WindowManager windowManagerM1241f;
        if (((Boolean) c1220k.m2866a(C1268v4.f2702V3)).booleanValue() && m1956l() && (windowManagerM1241f = AbstractC1078k7.m1241f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerM1241f.getDefaultDisplay();
                return new b.a().m1972c(m1930a(0, defaultDisplay)).m1973d(m1930a(1, defaultDisplay)).m1969a(m1930a(3, defaultDisplay)).m1971b(m1930a(2, defaultDisplay)).m1970a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Map m1940b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f1554c.get(str);
    }

    /* renamed from: b */
    public static void m1941b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f1554c.put(str, aVar.m1963e());
    }

    /* renamed from: b */
    public static boolean m1942b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: a */
    private static int m1930a(int i, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m1937a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}

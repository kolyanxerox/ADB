package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.C3177h7;
import com.ironsource.C3551q9;
import com.ironsource.C3805wj;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC3033d8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.l */
/* loaded from: classes2.dex */
public class C3395l {

    /* renamed from: a */
    public static final String f9866a = "BANNER";

    /* renamed from: b */
    public static final String f9867b = "LARGE";

    /* renamed from: c */
    public static final String f9868c = "RECTANGLE";

    /* renamed from: d */
    public static final String f9869d = "LEADERBOARD";

    /* renamed from: e */
    public static final String f9870e = "SMART";

    /* renamed from: f */
    public static final String f9871f = "CUSTOM";

    /* renamed from: g */
    public static final String f9872g = "MEDIUM_RECTANGLE";

    /* renamed from: h */
    public static final String f9873h = "bannerAdSize";

    /* renamed from: i */
    public static final int f9874i = 0;

    /* renamed from: j */
    public static final int f9875j = 1;

    /* renamed from: k */
    public static final int f9876k = 2;

    /* renamed from: l */
    public static final int f9877l = 3;

    /* renamed from: m */
    public static final int f9878m = 4;

    /* renamed from: n */
    public static final int f9879n = 5;

    /* renamed from: o */
    public static final int f9880o = 6;

    /* renamed from: p */
    public static final int f9881p = -1;

    /* renamed from: q */
    public static final String f9882q = "Adaptive=true";

    /* renamed from: com.ironsource.mediationsdk.l$a */
    public interface a {
        /* renamed from: a */
        void m10371a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.l$b */
    public interface b {
        /* renamed from: a */
        void mo10372a();

        /* renamed from: a */
        void mo10373a(String str);
    }

    /* renamed from: a */
    public static int m10348a(int i) {
        int iM10350a = -1;
        try {
            iM10350a = m10350a(m10355a(C3367c.m10097b()), i);
            m10356a(i, iM10350a);
            IronLog.API.verbose("Maximal height - " + iM10350a + " for width - " + i);
            return iM10350a;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("Failed to get adaptive height: " + e.getMessage());
            return iM10350a;
        }
    }

    /* renamed from: b */
    public static int m10367b(int i) {
        if (C3404p.m10470j().m10485M()) {
            return m10348a(i);
        }
        IronLog.API.error("The mediation must be successfully initiated before calling this API");
        return -1;
    }

    /* renamed from: c */
    public static boolean m10370c(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    /* renamed from: a */
    private static int m10349a(Object obj, int i) {
        if (obj instanceof AbstractAdapter) {
            return ((AbstractAdapter) obj).getAdaptiveHeight(i);
        }
        if (obj instanceof LevelPlayBaseAdapter) {
            return ((LevelPlayBaseAdapter) obj).getAdaptiveHeight(i);
        }
        return -1;
    }

    /* renamed from: b */
    public static ISBannerSize m10368b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            m10353a(f9870e, 728, 90);
        }
        return m10353a(f9870e, 320, 50);
    }

    /* renamed from: a */
    private static int m10350a(Map<String, Object> map, int i) {
        int iMax = -1;
        for (Object obj : map.values()) {
            try {
                iMax = Math.max(iMax, m10349a(obj, i));
            } catch (Throwable th) {
                m10364a(obj, th);
            }
        }
        return iMax;
    }

    /* renamed from: b */
    public static void m10369b(IronSourceBannerLayout ironSourceBannerLayout) {
        ISBannerSize size;
        if (ironSourceBannerLayout == null || (size = ironSourceBannerLayout.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeM10368b = m10368b();
        iSBannerSizeM10368b.setContainerParams(size.containerParams);
        iSBannerSizeM10368b.setAdaptive(size.isAdaptive());
        ironSourceBannerLayout.setBannerSize(iSBannerSizeM10368b);
    }

    /* renamed from: a */
    public static long m10351a(long j, long j2) {
        return j2 - (new Date().getTime() - j);
    }

    /* renamed from: a */
    public static ISBannerSize m10352a() {
        return new ISBannerSize(f9869d, 728, 90);
    }

    /* renamed from: a */
    public static ISBannerSize m10353a(String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    /* renamed from: a */
    public static String m10354a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.containerParams.getWidth() + "x" + iSBannerSize.containerParams.getHeight() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    /* renamed from: a */
    private static Map<String, Object> m10355a(C3367c c3367c) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(c3367c.m10114a());
        concurrentHashMap.putAll(c3367c.m10120c());
        return concurrentHashMap;
    }

    /* renamed from: a */
    private static void m10356a(int i, int i2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i2 == -1) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i + ",h:" + i2);
            }
            C3805wj.m12898i().mo12605a(new C3899zb(EnumC2638ac.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    public static void m10357a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.m10026a();
        }
    }

    /* renamed from: a */
    private static void m10358a(IronSourceBannerLayout ironSourceBannerLayout, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getWidth());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getHeight());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ironSourceBannerLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        ironSourceBannerLayout.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.containerParams.getHeight() + " width - " + iSBannerSize.containerParams.getWidth());
        ironSourceBannerLayout.addView(relativeLayout, 0, layoutParams2);
    }

    /* renamed from: a */
    public static void m10359a(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
        m10360a(ironSourceBannerLayout, view, layoutParams, (InterfaceC3033d8) null);
    }

    /* renamed from: a */
    public static void m10360a(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams, InterfaceC3033d8 interfaceC3033d8) {
        if (ironSourceBannerLayout == null || view == null || layoutParams == null) {
            return;
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.applovin.impl.mediation.OooO0O0(ironSourceBannerLayout, view, ironSourceBannerLayout.getSize(), applicationContext, layoutParams, interfaceC3033d8, 4));
    }

    /* renamed from: a */
    public static /* synthetic */ void m10361a(IronSourceBannerLayout ironSourceBannerLayout, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, InterfaceC3033d8 interfaceC3033d8) {
        try {
            ironSourceBannerLayout.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    m10358a(ironSourceBannerLayout, view, context, iSBannerSize);
                } else {
                    ironSourceBannerLayout.addView(view, 0, layoutParams);
                }
            }
            if (interfaceC3033d8 != null) {
                interfaceC3033d8.mo8286a();
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    public static void m10362a(IronSourceBannerLayout ironSourceBannerLayout, C3177h7 c3177h7, b bVar) {
        String strConcat;
        if (m10370c(ironSourceBannerLayout)) {
            strConcat = null;
        } else {
            strConcat = "can't load banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
        }
        if (c3177h7 == null || TextUtils.isEmpty(c3177h7.getPlacementName())) {
            strConcat = "can't load banner - ".concat(c3177h7 == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(strConcat)) {
            bVar.mo10372a();
        } else {
            IronLog.INTERNAL.error(strConcat);
            bVar.mo10373a(strConcat);
        }
    }

    /* renamed from: a */
    public static void m10363a(IronSourceBannerLayout ironSourceBannerLayout, b bVar) {
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            bVar.mo10373a("can't destroy banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"));
        } else {
            bVar.mo10372a();
        }
    }

    /* renamed from: a */
    private static void m10364a(Object obj, Throwable th) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        C3551q9.m11517d().m11519a(th);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbOooOoO0 = OooOo.OooOoO0("Exception while calling getAdaptiveHeight for adapter - ", simpleName, ": ");
        sbOooOoO0.append(th.getMessage());
        ironLog.error(sbOooOoO0.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ac A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:60:0x0004, B:61:0x0011, B:91:0x0062, B:98:0x00a6, B:100:0x00ac, B:102:0x00b6, B:103:0x00d2, B:92:0x008b, B:97:0x00a3, B:93:0x0090, B:94:0x0095, B:95:0x009a, B:96:0x009f, B:63:0x0015, B:66:0x001f, B:69:0x0029, B:72:0x0033, B:75:0x003d, B:78:0x0047), top: B:108:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0051  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10365a(java.util.Map<java.lang.String, java.lang.Object> r8, com.ironsource.mediationsdk.ISBannerSize r9) {
        /*
            java.lang.String r0 = "ext1"
            if (r9 == 0) goto Le7
            java.lang.String r1 = r9.getDescription()     // Catch: java.lang.Exception -> Ld6
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> Ld6
            r3 = 2
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 5
            switch(r2) {
                case -387072689: goto L47;
                case 72205083: goto L3d;
                case 79011241: goto L33;
                case 446888797: goto L29;
                case 1951953708: goto L1f;
                case 1999208305: goto L15;
                default: goto L14;
            }     // Catch: java.lang.Exception -> Ld6
        L14:
            goto L51
        L15:
            java.lang.String r2 = "CUSTOM"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto L51
            r1 = r7
            goto L52
        L1f:
            java.lang.String r2 = "BANNER"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto L51
            r1 = 0
            goto L52
        L29:
            java.lang.String r2 = "LEADERBOARD"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto L51
            r1 = r6
            goto L52
        L33:
            java.lang.String r2 = "SMART"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto L51
            r1 = r5
            goto L52
        L3d:
            java.lang.String r2 = "LARGE"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto L51
            r1 = r4
            goto L52
        L47:
            java.lang.String r2 = "RECTANGLE"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto L51
            r1 = r3
            goto L52
        L51:
            r1 = -1
        L52:
            java.lang.String r2 = "bannerAdSize"
            if (r1 == 0) goto L9f
            if (r1 == r4) goto L9a
            if (r1 == r3) goto L95
            if (r1 == r6) goto L90
            if (r1 == r5) goto L8b
            if (r1 == r7) goto L61
            goto La6
        L61:
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Ld6
            r8.put(r2, r1)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r1 = "custom_banner_size"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r2.<init>()     // Catch: java.lang.Exception -> Ld6
            int r3 = r9.getWidth()     // Catch: java.lang.Exception -> Ld6
            r2.append(r3)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Exception -> Ld6
            int r3 = r9.getHeight()     // Catch: java.lang.Exception -> Ld6
            r2.append(r3)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Ld6
            r8.put(r1, r2)     // Catch: java.lang.Exception -> Ld6
            goto La6
        L8b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Ld6
            goto La3
        L90:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> Ld6
            goto La3
        L95:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Ld6
            goto La3
        L9a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld6
            goto La3
        L9f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Ld6
        La3:
            r8.put(r2, r1)     // Catch: java.lang.Exception -> Ld6
        La6:
            boolean r1 = r9.isAdaptive()     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto Le7
            java.lang.String r1 = m10354a(r9)     // Catch: java.lang.Exception -> Ld6
            boolean r2 = r8.containsKey(r0)     // Catch: java.lang.Exception -> Ld6
            if (r2 == 0) goto Ld2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r1.<init>()     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r8.get(r0)     // Catch: java.lang.Exception -> Ld6
            r1.append(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r2 = " , "
            r1.append(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r9 = m10354a(r9)     // Catch: java.lang.Exception -> Ld6
            r1.append(r9)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Ld6
        Ld2:
            r8.put(r0, r1)     // Catch: java.lang.Exception -> Ld6
            return
        Ld6:
            r8 = move-exception
            com.ironsource.q9 r9 = com.ironsource.C3551q9.m11517d()
            r9.m11519a(r8)
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r9.error(r8)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3395l.m10365a(java.util.Map, com.ironsource.mediationsdk.ISBannerSize):void");
    }

    /* renamed from: a */
    public static boolean m10366a(ISContainerParams iSContainerParams, int i, int i2) {
        if (iSContainerParams == null || iSContainerParams.getWidth() <= 0 || iSContainerParams.getHeight() <= 0) {
            IronLog.API.warning("Container size is invalid: Default banner size will be used.");
            return false;
        }
        if (iSContainerParams.getWidth() >= i && iSContainerParams.getHeight() >= i2) {
            return true;
        }
        IronLog.API.warning("Container size too small: Banner may not display correctly.");
        return true;
    }
}

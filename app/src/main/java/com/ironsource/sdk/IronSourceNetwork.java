package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3045dk;
import com.ironsource.C3112fc;
import com.ironsource.C3333lk;
import com.ironsource.C3454nh;
import com.ironsource.C3551q9;
import com.ironsource.C3699th;
import com.ironsource.C3734uh;
import com.ironsource.C3907zj;
import com.ironsource.InterfaceC3225ik;
import com.ironsource.InterfaceC3532pp;
import com.ironsource.sdk.controller.C3640e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceNetwork {

    /* renamed from: a */
    static final String f11357a = "IronSourceNetwork";

    /* renamed from: b */
    private static InterfaceC3225ik f11358b;

    /* renamed from: c */
    private static List<InterfaceC3532pp> f11359c = new ArrayList();

    /* renamed from: d */
    private static C3333lk f11360d;

    /* renamed from: a */
    private static synchronized void m11890a() throws Exception {
        if (f11358b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }

    public static synchronized void addInitListener(InterfaceC3532pp interfaceC3532pp) {
        C3333lk c3333lk = f11360d;
        if (c3333lk == null) {
            f11359c.add(interfaceC3532pp);
        } else if (c3333lk.m9819b()) {
            interfaceC3532pp.onSuccess();
        } else {
            interfaceC3532pp.onFail(f11360d.m9818a());
        }
    }

    public static synchronized void destroyAd(C3907zj c3907zj) throws Exception {
        m11890a();
        f11358b.mo8365b(c3907zj);
    }

    public static synchronized C3640e getControllerManager() {
        return f11358b.mo8343a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.m12264e(f11357a, "applicationKey is NULL");
            return;
        }
        if (f11358b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                m11891a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                Logger.m12264e(f11357a, "Failed to init event tracker: " + e.getMessage());
            }
            f11358b = C3045dk.m8328a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(C3907zj c3907zj) {
        InterfaceC3225ik interfaceC3225ik = f11358b;
        if (interfaceC3225ik == null) {
            return false;
        }
        return interfaceC3225ik.mo8360a(c3907zj);
    }

    public static synchronized void loadAd(C3907zj c3907zj, Map<String, String> map) throws Exception {
        m11890a();
        f11358b.mo8351a(c3907zj, map);
    }

    public static synchronized void loadAdView(Activity activity, C3907zj c3907zj, Map<String, String> map) throws Exception {
        m11890a();
        f11358b.mo8363b(activity, c3907zj, map);
    }

    public static void onPause(Activity activity) {
        InterfaceC3225ik interfaceC3225ik = f11358b;
        if (interfaceC3225ik == null) {
            return;
        }
        interfaceC3225ik.onPause(activity);
    }

    public static void onResume(Activity activity) {
        InterfaceC3225ik interfaceC3225ik = f11358b;
        if (interfaceC3225ik == null) {
            return;
        }
        interfaceC3225ik.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        InterfaceC3225ik interfaceC3225ik = f11358b;
        if (interfaceC3225ik == null) {
            return;
        }
        interfaceC3225ik.mo8344a(activity);
    }

    public static synchronized void showAd(Activity activity, C3907zj c3907zj, Map<String, String> map) throws Exception {
        m11890a();
        f11358b.mo8345a(activity, c3907zj, map);
    }

    public static synchronized void updateInitFailed(C3454nh c3454nh) {
        try {
            f11360d = new C3333lk(c3454nh);
            Iterator<InterfaceC3532pp> it = f11359c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c3454nh);
            }
            f11359c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void updateInitSucceeded() {
        try {
            f11360d = new C3333lk();
            Iterator<InterfaceC3532pp> it = f11359c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            f11359c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    private static void m11891a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            C3112fc c3112fcM12676a = C3734uh.m12676a(jSONObject);
            if (c3112fcM12676a.m8659a()) {
                C3699th.m12426a(c3112fcM12676a, C3734uh.m12678a(context, str, str2, map));
            }
        }
    }
}

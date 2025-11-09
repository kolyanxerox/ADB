package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.work.WorkRequest;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o00O00OO {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static volatile o00O00OO f26524OooO0oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f26525OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000Ooo.o00oO0o f26526OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f26527OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f26528OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f26529OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f26530OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public volatile o0000 f26531OooO0oO;

    public o00O00OO(Context context, Bundle bundle) throws ClassNotFoundException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o00oOoo(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f26525OooO00o = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f26526OooO0O0 = new o000Ooo.o00oO0o(this, 2);
        this.f26527OooO0OO = new ArrayList();
        try {
            if (OoooOOO.oO0000O.OooO0O0(context, OoooOOO.oO0000O.OooO00o(context)) != null) {
                try {
                    Class.forName(Constants.FID_CLASS, false, o00O00OO.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f26529OooO0o = null;
                    this.f26530OooO0o0 = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f26529OooO0o = "fa";
        OooO0OO(new o000OOo0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new oOO00O(this));
        }
    }

    public static o00O00OO OooO0o0(Context context, Bundle bundle) {
        Oooo00O.o000000O.OooO0oo(context);
        if (f26524OooO0oo == null) {
            synchronized (o00O00OO.class) {
                try {
                    if (f26524OooO0oo == null) {
                        f26524OooO0oo = new o00O00OO(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f26524OooO0oo;
    }

    public final Map OooO00o(String str, String str2, boolean z) {
        o00000O o00000o = new o00000O();
        OooO0OO(new o000O00O(this, str, str2, z, o00000o));
        Bundle bundleO000OO0O = o00000o.o000OO0O(5000L);
        if (bundleO000OO0O == null || bundleO000OO0O.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleO000OO0O.size());
        for (String str3 : bundleO000OO0O.keySet()) {
            Object obj = bundleO000OO0O.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int OooO0O0(String str) {
        o00000O o00000o = new o00000O();
        OooO0OO(new o000OOo0(this, str, o00000o));
        Integer num = (Integer) o00000O.o000O0O0(Integer.class, o00000o.o000OO0O(WorkRequest.MIN_BACKOFF_MILLIS));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void OooO0OO(o00O000o o00o000o) {
        this.f26525OooO00o.execute(o00o000o);
    }

    public final void OooO0Oo(Exception exc, boolean z, boolean z2) {
        this.f26530OooO0o0 |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            OooO0OO(new o000OOo0(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List OooO0o(String str, String str2) {
        o00000O o00000o = new o00000O();
        OooO0OO(new o000O0Oo(this, str, str2, o00000o));
        List list = (List) o00000O.o000O0O0(List.class, o00000o.o000OO0O(5000L));
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final long OooO0oO() {
        o00000O o00000o = new o00000O();
        OooO0OO(new o00O0000(this, o00000o, 2));
        Long l = (Long) o00000O.o000O0O0(Long.class, o00000o.o000OO0O(500L));
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.f26528OooO0Oo + 1;
        this.f26528OooO0Oo = i;
        return jNextLong + i;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.a7 */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1375a7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: OooO0oO */
    public Context f16927OooO0oO;

    /* renamed from: OooO00o */
    public final Object f16921OooO00o = new Object();

    /* renamed from: OooO0O0 */
    public final ConditionVariable f16922OooO0O0 = new ConditionVariable();

    /* renamed from: OooO0OO */
    public volatile boolean f16923OooO0OO = false;

    /* renamed from: OooO0Oo */
    public volatile boolean f16924OooO0Oo = false;

    /* renamed from: OooO0o0 */
    public SharedPreferences f16926OooO0o0 = null;

    /* renamed from: OooO0o */
    public Bundle f16925OooO0o = new Bundle();

    /* renamed from: OooO0oo */
    public JSONObject f16928OooO0oo = new JSONObject();

    /* renamed from: OooO */
    public boolean f16920OooO = false;

    /* renamed from: OooOO0 */
    public boolean f16929OooOO0 = false;

    public final Object OooO00o(C2148v6 c2148v6) {
        if (!this.f16922OooO0O0.block(5000L)) {
            synchronized (this.f16921OooO00o) {
                try {
                    if (!this.f16924OooO0Oo) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f16923OooO0OO || this.f16926OooO0o0 == null || this.f16929OooOO0) {
            synchronized (this.f16921OooO00o) {
                if (this.f16923OooO0OO && this.f16926OooO0o0 != null && !this.f16929OooOO0) {
                }
                return c2148v6.OooO0o();
            }
        }
        int i = c2148v6.f24856OooO00o;
        if (i != 2) {
            if (i == 1 && this.f16928OooO0oo.has(c2148v6.f24857OooO0O0)) {
                return c2148v6.OooO00o(this.f16928OooO0oo);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return c2148v6.OooO0O0(this.f16926OooO0o0);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f16925OooO0o;
        if (bundle == null) {
            return c2148v6.OooO0o();
        }
        switch (c2148v6.f24860OooO0o0) {
            case 0:
                String str = c2148v6.f24857OooO0O0;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) c2148v6.OooO0o();
            case 1:
                String str2 = c2148v6.f24857OooO0O0;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) c2148v6.OooO0o();
            case 2:
                String str3 = c2148v6.f24857OooO0O0;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) c2148v6.OooO0o();
            case 3:
                String str4 = c2148v6.f24857OooO0O0;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) c2148v6.OooO0o();
            default:
                String str5 = c2148v6.f24857OooO0O0;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) c2148v6.OooO0o();
        }
    }

    public final Object OooO0O0(C2148v6 c2148v6) {
        return (this.f16923OooO0OO || this.f16924OooO0Oo) ? OooO00o(c2148v6) : c2148v6.OooO0o();
    }

    public final void OooO0OO(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                StrictMode.setThreadPolicy(threadPolicy);
                this.f16928OooO0oo = new JSONObject(string);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            OooO0OO(sharedPreferences);
        }
    }
}

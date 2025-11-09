package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yk */
/* loaded from: classes2.dex */
public final class C2273yk {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f25930OooO00o = new HashMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f25931OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Context f25932OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C2249xx f25933OooO0Oo;

    public C2273yk(Context context, C2249xx c2249xx) {
        this.f25932OooO0OO = context;
        this.f25933OooO0Oo = c2249xx;
    }

    public final synchronized void OooO00o(String str) {
        try {
            if (this.f25930OooO00o.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f25932OooO0OO) : this.f25932OooO0OO.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC2236xk sharedPreferencesOnSharedPreferenceChangeListenerC2236xk = new SharedPreferencesOnSharedPreferenceChangeListenerC2236xk(this, str, 0);
            this.f25930OooO00o.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2236xk);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2236xk);
        } catch (Throwable th) {
            throw th;
        }
    }
}

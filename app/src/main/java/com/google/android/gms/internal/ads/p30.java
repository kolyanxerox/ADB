package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p30 {

    /* renamed from: OooO */
    public final String f23189OooO;

    /* renamed from: OooO00o */
    public final q30 f23190OooO00o;

    /* renamed from: OooO0O0 */
    public final z30 f23191OooO0O0;

    /* renamed from: OooO0OO */
    public final g30 f23192OooO0OO;

    /* renamed from: OooO0Oo */
    public final l30 f23193OooO0Oo;

    /* renamed from: OooO0o */
    public final x30 f23194OooO0o;

    /* renamed from: OooO0o0 */
    public final f30 f23195OooO0o0;

    /* renamed from: OooO0oO */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2236xk f23196OooO0oO;

    /* renamed from: OooO0oo */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2236xk f23197OooO0oo;

    /* renamed from: OooOO0 */
    public final Context f23198OooOO0;

    /* renamed from: OooOO0O */
    public final String f23199OooOO0O;

    /* renamed from: OooOOOo */
    public JSONObject f23203OooOOOo;

    /* renamed from: OooOOoo */
    public boolean f23206OooOOoo;
    public boolean OooOo0;

    /* renamed from: OooOo00 */
    public int f23208OooOo00;
    public final HashMap OooOO0o = new HashMap();

    /* renamed from: OooOOO0 */
    public final HashMap f23201OooOOO0 = new HashMap();

    /* renamed from: OooOOO */
    public final HashMap f23200OooOOO = new HashMap();

    /* renamed from: OooOOOO */
    public String f23202OooOOOO = JsonUtils.EMPTY_JSON;

    /* renamed from: OooOOo0 */
    public long f23205OooOOo0 = LocationRequestCompat.PASSIVE_INTERVAL;

    /* renamed from: OooOOo */
    public m30 f23204OooOOo = m30.f21043OooOo0O;

    /* renamed from: OooOo0O */
    public o30 f23209OooOo0O = o30.f22323OooOo0O;

    /* renamed from: OooOo0o */
    public long f23210OooOo0o = 0;

    /* renamed from: OooOo */
    public String f23207OooOo = "";

    public p30(q30 q30Var, z30 z30Var, g30 g30Var, Context context, VersionInfoParcel versionInfoParcel, l30 l30Var, x30 x30Var, SharedPreferencesOnSharedPreferenceChangeListenerC2236xk sharedPreferencesOnSharedPreferenceChangeListenerC2236xk, SharedPreferencesOnSharedPreferenceChangeListenerC2236xk sharedPreferencesOnSharedPreferenceChangeListenerC2236xk2, String str) {
        this.f23190OooO00o = q30Var;
        this.f23191OooO0O0 = z30Var;
        this.f23192OooO0OO = g30Var;
        this.f23195OooO0o0 = new f30(context);
        this.f23189OooO = versionInfoParcel.afmaVersion;
        this.f23199OooOO0O = str;
        this.f23193OooO0Oo = l30Var;
        this.f23194OooO0o = x30Var;
        this.f23196OooO0oO = sharedPreferencesOnSharedPreferenceChangeListenerC2236xk;
        this.f23197OooO0oo = sharedPreferencesOnSharedPreferenceChangeListenerC2236xk2;
        this.f23198OooOO0 = context;
        zzv.zzt().zzg(this);
    }

    public final void OooO() {
        String string;
        zzj zzjVarOooO0Oo = zzv.zzp().OooO0Oo();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f23206OooOOoo);
                jSONObject.put("gesture", this.f23204OooOOo);
                long j = this.f23205OooOOo0;
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                if (j > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.f23202OooOOOO);
                    jSONObject.put("networkExtrasExpirationSecs", this.f23205OooOOo0);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        zzjVarOooO0Oo.zzB(string);
    }

    public final synchronized C2274yl OooO00o(String str) {
        C2274yl c2274yl;
        try {
            c2274yl = new C2274yl();
            if (this.f23201OooOOO0.containsKey(str)) {
                c2274yl.zzc((i30) this.f23201OooOOO0.get(str));
            } else {
                if (!this.f23200OooOOO.containsKey(str)) {
                    this.f23200OooOOO.put(str, new ArrayList());
                }
                ((List) this.f23200OooOOO.get(str)).add(c2274yl);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2274yl;
    }

    public final synchronized void OooO0O0(String str, i30 i30Var) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue() && OooO0o()) {
            if (this.f23208OooOo00 >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0OO)).intValue()) {
                zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.OooOO0o.containsKey(str)) {
                this.OooOO0o.put(str, new ArrayList());
            }
            this.f23208OooOo00++;
            ((List) this.OooOO0o.get(str)).add(i30Var);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO)).booleanValue()) {
                String str2 = i30Var.f19917OooOo;
                this.f23201OooOOO0.put(str2, i30Var);
                if (this.f23200OooOOO.containsKey(str2)) {
                    List list = (List) this.f23200OooOOO.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2274yl) it.next()).zzc(i30Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void OooO0OO() throws JSONException {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue() && zzv.zzp().OooO0Oo().zzM()) {
                OooO0oo();
                return;
            }
            String strZzk = zzv.zzp().OooO0Oo().zzk();
            if (TextUtils.isEmpty(strZzk)) {
                return;
            }
            try {
                if (new JSONObject(strZzk).optBoolean("isTestMode", false)) {
                    OooO0oo();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void OooO0Oo(zzdl zzdlVar, o30 o30Var) {
        if (!OooO0o()) {
            try {
                zzdlVar.zze(af0.Oooo0O0(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue()) {
            this.f23209OooOo0O = o30Var;
            this.f23190OooO00o.OooO00o(zzdlVar, new C2079tb(this, 1), new C1709jb(this.f23194OooO0o, 3), new C2079tb(this, 0));
            return;
        } else {
            try {
                zzdlVar.zze(af0.Oooo0O0(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzo.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean OooO0o() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue()) {
            return this.f23206OooOOoo || zzv.zzt().zzl();
        }
        return this.f23206OooOOoo;
    }

    public final void OooO0o0(boolean z) {
        if (!this.OooOo0 && z) {
            OooO0oo();
        }
        OooOO0O(z, true);
    }

    public final synchronized JSONObject OooO0oO() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.OooOO0o.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (i30 i30Var : (List) entry.getValue()) {
                    if (i30Var.f19920OooOoO != h30.f19530OooOo0O) {
                        jSONArray.put(i30Var.OooO00o());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void OooO0oo() throws JSONException {
        this.OooOo0 = true;
        l30 l30Var = this.f23193OooO0Oo;
        l30Var.getClass();
        j30 j30Var = new j30(l30Var);
        d30 d30Var = l30Var.f20783OooO00o;
        d30Var.getClass();
        d30Var.f18145OooO0o0.addListener(new wp0(25, d30Var, j30Var), d30Var.f18148OooOO0);
        this.f23190OooO00o.f23498OooOo = this;
        this.f23191OooO0O0.f26075OooOoOO = this;
        this.f23192OooO0OO.f19207OooOooO = this;
        this.f23194OooO0o.f25504OooOoOO = this;
        C2148v6 c2148v6 = AbstractC1448c7.o0OOOooo;
        if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().OooO00o(c2148v6))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f23198OooOO0);
            List listAsList = Arrays.asList(((String) zzbe.zzc().OooO00o(c2148v6)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2236xk sharedPreferencesOnSharedPreferenceChangeListenerC2236xk = this.f23196OooO0oO;
            sharedPreferencesOnSharedPreferenceChangeListenerC2236xk.f25641OooO0OO = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2236xk);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2236xk.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        C2148v6 c2148v62 = AbstractC1448c7.o0OOo000;
        if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().OooO00o(c2148v62))) {
            SharedPreferences sharedPreferences = this.f23198OooOO0.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
            List listAsList2 = Arrays.asList(((String) zzbe.zzc().OooO00o(c2148v62)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2236xk sharedPreferencesOnSharedPreferenceChangeListenerC2236xk2 = this.f23197OooO0oo;
            sharedPreferencesOnSharedPreferenceChangeListenerC2236xk2.f25641OooO0OO = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2236xk2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2236xk2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strZzk = zzv.zzp().OooO0Oo().zzk();
        synchronized (this) {
            if (!TextUtils.isEmpty(strZzk)) {
                try {
                    JSONObject jSONObject = new JSONObject(strZzk);
                    OooOO0O(jSONObject.optBoolean("isTestMode", false), false);
                    OooOO0((m30) Enum.valueOf(m30.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f23202OooOOOO = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
                    this.f23205OooOOo0 = jSONObject.optLong("networkExtrasExpirationSecs", LocationRequestCompat.PASSIVE_INTERVAL);
                } catch (JSONException unused) {
                }
            }
        }
        this.f23207OooOo = zzv.zzp().OooO0Oo().zzl();
    }

    public final synchronized void OooOO0(m30 m30Var, boolean z) {
        try {
            if (this.f23204OooOOo != m30Var) {
                if (OooO0o()) {
                    OooOO0o();
                }
                this.f23204OooOOo = m30Var;
                if (OooO0o()) {
                    OooOOO0();
                }
                if (z) {
                    OooO();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:32:0x0001, B:35:0x0006, B:37:0x000a, B:39:0x001c, B:44:0x0029, B:49:0x0038, B:45:0x002d, B:47:0x0033), top: B:56:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void OooOO0O(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f23206OooOOoo     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f23206OooOOoo = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OOOOOo     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.a7 r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.OooO00o(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzv.zzt()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.OooOOO0()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.OooO0o()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.OooOO0o()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.OooO()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p30.OooOO0O(boolean, boolean):void");
    }

    public final synchronized void OooOO0o() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.f23204OooOOo.ordinal();
            if (iOrdinal == 1) {
                z30 z30Var = this.f23191OooO0O0;
                synchronized (z30Var) {
                    try {
                        if (z30Var.f26076OooOoo0) {
                            SensorManager sensorManager2 = z30Var.f26072OooOo0o;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(z30Var, z30Var.f26070OooOo);
                                zze.zza("Stopped listening for shake gestures.");
                            }
                            z30Var.f26076OooOoo0 = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            g30 g30Var = this.f23192OooO0OO;
            synchronized (g30Var) {
                try {
                    if (g30Var.f19208OooOooo && (sensorManager = g30Var.f19200OooOo0O) != null && (sensor = g30Var.f19201OooOo0o) != null) {
                        sensorManager.unregisterListener(g30Var, sensor);
                        g30Var.f19208OooOooo = false;
                        zze.zza("Stopped listening for flick gestures.");
                    }
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final synchronized void OooOOO0() {
        int iOrdinal = this.f23204OooOOo.ordinal();
        if (iOrdinal == 1) {
            this.f23191OooO0O0.OooO0O0();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f23192OooO0OO.OooO0O0();
        }
    }
}

package com.google.android.gms.ads.internal.util;

import Oooo0OO.oo000o;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.internal.ads.AbstractC1376a8;
import com.google.android.gms.internal.ads.AbstractC1413b8;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1849n3;
import com.google.android.gms.internal.ads.C1867nl;
import com.google.android.gms.internal.ads.C2163vl;
import com.ironsource.C3824x4;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o00000oO.OooOOO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzj implements zzg {

    /* renamed from: OooO */
    public String f16278OooO;

    /* renamed from: OooO0O0 */
    public boolean f16280OooO0O0;

    /* renamed from: OooO0Oo */
    public OooOOO f16282OooO0Oo;

    /* renamed from: OooO0o */
    public SharedPreferences f16283OooO0o;

    /* renamed from: OooO0oO */
    public SharedPreferences.Editor f16285OooO0oO;

    /* renamed from: OooOO0 */
    public String f16287OooOO0;

    /* renamed from: OooO00o */
    public final Object f16279OooO00o = new Object();

    /* renamed from: OooO0OO */
    public final ArrayList f16281OooO0OO = new ArrayList();

    /* renamed from: OooO0o0 */
    public C1849n3 f16284OooO0o0 = null;

    /* renamed from: OooO0oo */
    public boolean f16286OooO0oo = true;

    /* renamed from: OooOO0O */
    public boolean f16288OooOO0O = true;
    public String OooOO0o = C3824x4.f12571f;

    /* renamed from: OooOOO0 */
    public int f16290OooOOO0 = -1;

    /* renamed from: OooOOO */
    public C1867nl f16289OooOOO = new C1867nl("", 0);

    /* renamed from: OooOOOO */
    public long f16291OooOOOO = 0;

    /* renamed from: OooOOOo */
    public long f16292OooOOOo = 0;

    /* renamed from: OooOOo0 */
    public int f16294OooOOo0 = -1;

    /* renamed from: OooOOo */
    public int f16293OooOOo = 0;

    /* renamed from: OooOOoo */
    public Set f16295OooOOoo = Collections.EMPTY_SET;

    /* renamed from: OooOo00 */
    public JSONObject f16297OooOo00 = new JSONObject();
    public boolean OooOo0 = true;

    /* renamed from: OooOo0O */
    public boolean f16298OooOo0O = true;

    /* renamed from: OooOo0o */
    public String f16299OooOo0o = null;

    /* renamed from: OooOo */
    public String f16296OooOo = "";

    /* renamed from: OooOoO0 */
    public boolean f16301OooOoO0 = false;

    /* renamed from: OooOoO */
    public String f16300OooOoO = "";

    /* renamed from: OooOoOO */
    public String f16302OooOoOO = JsonUtils.EMPTY_JSON;

    /* renamed from: OooOoo0 */
    public int f16304OooOoo0 = -1;

    /* renamed from: OooOoo */
    public int f16303OooOoo = -1;

    /* renamed from: OooOooO */
    public long f16305OooOooO = 0;

    public final void OooO00o() throws ExecutionException, InterruptedException, TimeoutException {
        OooOOO oooOOO = this.f16282OooO0Oo;
        if (oooOOO == null || oooOOO.isDone()) {
            return;
        }
        try {
            this.f16282OooO0Oo.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void OooO0O0() {
        AbstractC2200wl.f25321OooO00o.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(int i) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                this.f16290OooOOO0 = i;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue()) {
            OooO00o();
            synchronized (this.f16279OooO00o) {
                try {
                    if (this.f16296OooOo.equals(str)) {
                        return;
                    }
                    this.f16296OooOo = str;
                    SharedPreferences.Editor editor = this.f16285OooO0oO;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f16285OooO0oO.apply();
                    }
                    OooO0O0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOooO)).booleanValue()) {
            OooO00o();
            synchronized (this.f16279OooO00o) {
                try {
                    if (this.f16302OooOoOO.equals(str)) {
                        return;
                    }
                    this.f16302OooOoOO = str;
                    SharedPreferences.Editor editor = this.f16285OooO0oO;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f16285OooO0oO.apply();
                    }
                    OooO0O0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (z == this.f16288OooOO0O) {
                    return;
                }
                this.f16288OooOO0O = z;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0Oo0)).longValue();
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.f16285OooO0oO.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2, boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f16297OooOo00.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                int i = 0;
                while (true) {
                    if (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject == null) {
                            return;
                        }
                        if (!str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                            i++;
                        } else if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z);
                    ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f16297OooOo00.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f16297OooOo00.toString());
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(int i) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16294OooOOo0 == i) {
                    return;
                }
                this.f16294OooOOo0 = i;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(int i) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16303OooOoo == i) {
                    return;
                }
                this.f16303OooOoo = i;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(long j) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16305OooOooO == j) {
                    return;
                }
                this.f16305OooOooO = j;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(@NonNull String str) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                this.OooOO0o = str;
                if (this.f16285OooO0oO != null) {
                    if (str.equals(C3824x4.f12571f)) {
                        this.f16285OooO0oO.remove(AndroidTcfDataSource.TCF_TCSTRING_KEY);
                    } else {
                        this.f16285OooO0oO.putString(AndroidTcfDataSource.TCF_TCSTRING_KEY, str);
                    }
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzK() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            z = this.OooOo0;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzL() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            z = this.f16298OooOo0O;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            z = this.f16301OooOoO0;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.f17776o00000O0)).booleanValue()) {
            return false;
        }
        OooO00o();
        synchronized (this.f16279OooO00o) {
            z = this.f16288OooOO0O;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                SharedPreferences sharedPreferences = this.f16283OooO0o;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f16283OooO0o.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f16288OooOO0O) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final C1849n3 zzP() {
        if (!this.f16280OooO0O0 || ((zzK() && zzL()) || !((Boolean) AbstractC1376a8.f16967OooO0O0.OooOOO()).booleanValue())) {
            return null;
        }
        synchronized (this.f16279OooO00o) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f16284OooO0o0 == null) {
                    this.f16284OooO0o0 = new C1849n3();
                }
                C1849n3 c1849n3 = this.f16284OooO0o0;
                synchronized (c1849n3.f21393OooOo) {
                    try {
                        if (c1849n3.f21394OooOo0O) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Content hash thread already started, quitting...");
                        } else {
                            c1849n3.f21394OooOo0O = true;
                            c1849n3.start();
                        }
                    } finally {
                    }
                }
                com.google.android.gms.ads.internal.util.client.zzo.zzi("start fetching content...");
                return this.f16284OooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            i = this.f16293OooOOo;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        return this.f16290OooOOO0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            i = this.f16294OooOOo0;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            j = this.f16291OooOOOO;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            j = this.f16292OooOOOo;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            j = this.f16305OooOooO;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final C1867nl zzg() throws ExecutionException, InterruptedException, TimeoutException {
        C1867nl c1867nl;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0Oooo0)).booleanValue() && this.f16289OooOOO.OooO00o()) {
                    ArrayList arrayList = this.f16281OooO0OO;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
                c1867nl = this.f16289OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1867nl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final C1867nl zzh() {
        C1867nl c1867nl;
        synchronized (this.f16279OooO00o) {
            c1867nl = this.f16289OooOOO;
        }
        return c1867nl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzi() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            str = this.f16300OooOoO;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            str = this.f16299OooOo0o;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            str = this.f16296OooOo;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            str = this.f16302OooOoOO;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final String zzm() throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        return this.OooOO0o;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzn() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        OooO00o();
        synchronized (this.f16279OooO00o) {
            jSONObject = this.f16297OooOo00;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(Runnable runnable) {
        this.f16281OooO0OO.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(final Context context) {
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16283OooO0o != null) {
                    return;
                }
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                final String str = AppLovinMediationProvider.ADMOB;
                this.f16282OooO0Oo = c2163vl.OooO00o(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                    public final /* synthetic */ Context zzb;
                    public final /* synthetic */ String zzc = AppLovinMediationProvider.ADMOB;

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzj zzjVar = this.zza;
                        Context context2 = this.zzb;
                        zzjVar.getClass();
                        SharedPreferences sharedPreferences = context2.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        try {
                            synchronized (zzjVar.f16279OooO00o) {
                                try {
                                    zzjVar.f16283OooO0o = sharedPreferences;
                                    zzjVar.f16285OooO0oO = editorEdit;
                                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                                    zzjVar.f16286OooO0oo = zzjVar.f16283OooO0o.getBoolean("use_https", zzjVar.f16286OooO0oo);
                                    zzjVar.OooOo0 = zzjVar.f16283OooO0o.getBoolean("content_url_opted_out", zzjVar.OooOo0);
                                    zzjVar.f16278OooO = zzjVar.f16283OooO0o.getString("content_url_hashes", zzjVar.f16278OooO);
                                    zzjVar.f16288OooOO0O = zzjVar.f16283OooO0o.getBoolean("gad_idless", zzjVar.f16288OooOO0O);
                                    zzjVar.f16298OooOo0O = zzjVar.f16283OooO0o.getBoolean("content_vertical_opted_out", zzjVar.f16298OooOo0O);
                                    zzjVar.f16287OooOO0 = zzjVar.f16283OooO0o.getString("content_vertical_hashes", zzjVar.f16287OooOO0);
                                    zzjVar.f16293OooOOo = zzjVar.f16283OooO0o.getInt("version_code", zzjVar.f16293OooOOo);
                                    if (((Boolean) AbstractC1413b8.f17438OooO0oO.OooOOO()).booleanValue() && com.google.android.gms.ads.internal.client.zzbe.zzc().f16929OooOO0) {
                                        zzjVar.f16289OooOOO = new C1867nl("", 0L);
                                    } else {
                                        zzjVar.f16289OooOOO = new C1867nl(zzjVar.f16283OooO0o.getString("app_settings_json", zzjVar.f16289OooOOO.f21508OooO0o0), zzjVar.f16283OooO0o.getLong("app_settings_last_update_ms", zzjVar.f16289OooOOO.f21507OooO0o));
                                    }
                                    zzjVar.f16291OooOOOO = zzjVar.f16283OooO0o.getLong("app_last_background_time_ms", zzjVar.f16291OooOOOO);
                                    zzjVar.f16294OooOOo0 = zzjVar.f16283OooO0o.getInt("request_in_session_count", zzjVar.f16294OooOOo0);
                                    zzjVar.f16292OooOOOo = zzjVar.f16283OooO0o.getLong("first_ad_req_time_ms", zzjVar.f16292OooOOOo);
                                    zzjVar.f16295OooOOoo = zzjVar.f16283OooO0o.getStringSet("never_pool_slots", zzjVar.f16295OooOOoo);
                                    zzjVar.f16299OooOo0o = zzjVar.f16283OooO0o.getString("display_cutout", zzjVar.f16299OooOo0o);
                                    zzjVar.f16304OooOoo0 = zzjVar.f16283OooO0o.getInt("app_measurement_npa", zzjVar.f16304OooOoo0);
                                    zzjVar.f16303OooOoo = zzjVar.f16283OooO0o.getInt("sd_app_measure_npa", zzjVar.f16303OooOoo);
                                    zzjVar.f16305OooOooO = zzjVar.f16283OooO0o.getLong("sd_app_measure_npa_ts", zzjVar.f16305OooOooO);
                                    zzjVar.f16296OooOo = zzjVar.f16283OooO0o.getString("inspector_info", zzjVar.f16296OooOo);
                                    zzjVar.f16301OooOoO0 = zzjVar.f16283OooO0o.getBoolean("linked_device", zzjVar.f16301OooOoO0);
                                    zzjVar.f16300OooOoO = zzjVar.f16283OooO0o.getString("linked_ad_unit", zzjVar.f16300OooOoO);
                                    zzjVar.f16302OooOoOO = zzjVar.f16283OooO0o.getString("inspector_ui_storage", zzjVar.f16302OooOoOO);
                                    zzjVar.OooOO0o = zzjVar.f16283OooO0o.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, zzjVar.OooOO0o);
                                    zzjVar.f16290OooOOO0 = zzjVar.f16283OooO0o.getInt("gad_has_consent_for_cookies", zzjVar.f16290OooOOO0);
                                    try {
                                        zzjVar.f16297OooOo00 = new JSONObject(zzjVar.f16283OooO0o.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
                                    } catch (JSONException e) {
                                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not convert native advanced settings to json object", e);
                                    }
                                    zzjVar.OooO0O0();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th2);
                            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
                        }
                    }
                });
                this.f16280OooO0O0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq() throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                this.f16297OooOo00 = new JSONObject();
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(long j) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16291OooOOOO == j) {
                    return;
                }
                this.f16291OooOOOO = j;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(String str) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str != null && !str.equals(this.f16289OooOOO.f21508OooO0o0)) {
                    this.f16289OooOOO = new C1867nl(str, jCurrentTimeMillis);
                    SharedPreferences.Editor editor = this.f16285OooO0oO;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f16285OooO0oO.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                        this.f16285OooO0oO.apply();
                    }
                    OooO0O0();
                    ArrayList arrayList = this.f16281OooO0OO;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                this.f16289OooOOO.f21507OooO0o = jCurrentTimeMillis;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(int i) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16293OooOOo == i) {
                    return;
                }
                this.f16293OooOOo = i;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.OooOo0 == z) {
                    return;
                }
                this.OooOo0 = z;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16298OooOo0O == z) {
                    return;
                }
                this.f16298OooOo0O = z;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue()) {
            OooO00o();
            synchronized (this.f16279OooO00o) {
                try {
                    if (this.f16300OooOoO.equals(str)) {
                        return;
                    }
                    this.f16300OooOoO = str;
                    SharedPreferences.Editor editor = this.f16285OooO0oO;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f16285OooO0oO.apply();
                    }
                    OooO0O0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue()) {
            OooO00o();
            synchronized (this.f16279OooO00o) {
                try {
                    if (this.f16301OooOoO0 == z) {
                        return;
                    }
                    this.f16301OooOoO0 = z;
                    SharedPreferences.Editor editor = this.f16285OooO0oO;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f16285OooO0oO.apply();
                    }
                    OooO0O0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (TextUtils.equals(this.f16299OooOo0o, str)) {
                    return;
                }
                this.f16299OooOo0o = str;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(long j) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o();
        synchronized (this.f16279OooO00o) {
            try {
                if (this.f16292OooOOOo == j) {
                    return;
                }
                this.f16292OooOOOo = j;
                SharedPreferences.Editor editor = this.f16285OooO0oO;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f16285OooO0oO.apply();
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

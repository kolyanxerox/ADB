package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.ads.uj0;
import com.google.android.gms.internal.ads.uk0;
import com.google.android.gms.internal.ads.vj0;
import com.google.android.gms.internal.ads.wj0;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzad {
    public static Bundle zza(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    @NonNull
    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("JSON parsing error", e);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i2 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i2 != 0) {
                List listOooO0Oo = ni0.OooO0O0(new uk0('/')).OooO0Oo(strOptString2);
                if (listOooO0Oo.size() > 2 || listOooO0Oo.isEmpty()) {
                    obj = null;
                } else {
                    if (listOooO0Oo.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listOooO0Oo.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listOooO0Oo.get(0), 0);
                        str2 = (String) listOooO0Oo.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i3 = i2 - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void zzc(Context context) throws IOException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            uj0 uj0VarOooO0o = uj0.OooO0o(context);
            vj0 vj0VarOooO0oO = vj0.OooO0oO(context);
            wj0 wj0VarOooO0oo = wj0.OooO0oo(context);
            uj0VarOooO0o.getClass();
            synchronized (uj0.class) {
                uj0VarOooO0o.OooO0Oo(false);
            }
            synchronized (uj0.class) {
                uj0VarOooO0o.OooO0Oo(true);
            }
            vj0VarOooO0oO.OooO0oo();
            wj0VarOooO0oo.OoooO0();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("clearStorageOnIdlessMode", e);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("clearStorageOnIdlessMode_scar", e2);
        }
    }
}

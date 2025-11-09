package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xk */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2236xk implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f25639OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f25640OooO0O0;

    /* renamed from: OooO0OO */
    public Object f25641OooO0OO;

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC2236xk(Object obj, String str, int i) {
        this.f25639OooO00o = i;
        this.f25641OooO0OO = obj;
        this.f25640OooO0O0 = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws JSONException {
        switch (this.f25639OooO00o) {
            case 0:
                synchronized (((C2273yk) this.f25641OooO0OO)) {
                    try {
                        ArrayList arrayList = ((C2273yk) this.f25641OooO0OO).f25931OooO0O0;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            C2199wk c2199wk = (C2199wk) obj;
                            String str2 = (String) this.f25640OooO0O0;
                            C2273yk c2273yk = c2199wk.f25319OooO00o;
                            Map map = c2199wk.f25320OooO0O0;
                            c2273yk.getClass();
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                C2249xx c2249xx = c2273yk.f25933OooO0Oo;
                                ((Oooo0OO.oo000o) ((Oooo0OO.o00Ooo) c2249xx.f25815OooOo0o)).getClass();
                                ((C1904ok) c2249xx.f25813OooOo).OooO00o(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                k20 k20Var = (k20) this.f25641OooO0OO;
                k20Var.f20424OooOO0.set(zzad.zzb(k20Var.f20417OooO0O0, (String) this.f25640OooO0O0));
                return;
            default:
                if (str != null && ((List) this.f25641OooO0OO).contains(str)) {
                    try {
                        Object obj2 = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) this.f25640OooO0O0;
                        if (obj2 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj2);
                        }
                        return;
                    } catch (JSONException e) {
                        zzv.zzp().OooO0oO("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e);
                        return;
                    }
                }
                return;
        }
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2236xk() {
        this.f25639OooO00o = 2;
        this.f25640OooO0O0 = new JSONObject();
    }
}

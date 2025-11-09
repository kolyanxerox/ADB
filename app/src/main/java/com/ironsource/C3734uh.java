package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.C3112fc;
import com.ironsource.C3419mh;
import com.ironsource.C3594rh;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.uh */
/* loaded from: classes2.dex */
public class C3734uh {
    /* renamed from: a */
    public static C3112fc m12676a(JSONObject jSONObject) {
        return new C3112fc.a(jSONObject.optString(C3037dc.f8263r)).m8676b().m8677b(jSONObject.optBoolean("enabled")).m8672a(new C3664sh()).m8673a(m12679a()).m8674a(false).m8675a();
    }

    /* renamed from: a */
    public static C3419mh.e m12677a(C3762va c3762va, C3419mh.e eVar) {
        return (c3762va == null || c3762va.m12763g() == null || c3762va.m12763g().get("rewarded") == null) ? eVar : Boolean.parseBoolean(c3762va.m12763g().get("rewarded")) ? C3419mh.e.RewardedVideo : C3419mh.e.Interstitial;
    }

    /* renamed from: a */
    public static C3594rh m12678a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C3594rh.b bVar = new C3594rh.b();
        if (map != null && map.containsKey("sessionid")) {
            bVar.m11727c(map.get("sessionid"));
        }
        bVar.m11723a(context);
        return bVar.m11728d(str).m11724a(str2).m11725a();
    }

    /* renamed from: a */
    private static ArrayList<Pair<String, String>> m12679a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", C3037dc.f8236L));
        arrayList.add(new Pair<>(C3037dc.f8237M, C3037dc.f8238N));
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m12680a(C3762va c3762va) {
        if (c3762va == null || c3762va.m12763g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(c3762va.m12763g().get("inAppBidding"));
    }
}

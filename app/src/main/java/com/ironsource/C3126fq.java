package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.fq */
/* loaded from: classes2.dex */
public class C3126fq {

    /* renamed from: a */
    public static final String f8594a = "com.google.market";

    /* renamed from: b */
    public static final String f8595b = "com.android.vending";

    /* renamed from: c */
    public static final String f8596c = "isInstalled";

    /* renamed from: d */
    private static final String f8597d = "fq";

    /* renamed from: e */
    private static final ArrayList<String> f8598e = new a();

    /* renamed from: com.ironsource.fq$a */
    public class a extends ArrayList<String> {
        public a() {
            add(C3126fq.f8594a);
            add(C3126fq.f8595b);
        }
    }

    /* renamed from: com.ironsource.fq$b */
    public class b extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ boolean f8599a;

        public b(boolean z) throws JSONException {
            this.f8599a = z;
            put("isInstalled", z);
        }
    }

    /* renamed from: com.ironsource.fq$c */
    public enum c {
        GOOGLE_PLAY(2, new String[]{C3126fq.f8595b}),
        GOOGLE_MARKET(4, new String[]{C3126fq.f8594a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});


        /* renamed from: h */
        private static final Map<String, c> f8605h = new HashMap();

        /* renamed from: a */
        private final int f8607a;

        /* renamed from: b */
        private final String[] f8608b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.m8745d()) {
                    f8605h.put(str, cVar);
                }
            }
        }

        c(int i, String[] strArr) {
            this.f8607a = i;
            this.f8608b = strArr;
        }

        /* renamed from: c */
        public int m8744c() {
            return this.f8607a;
        }

        /* renamed from: d */
        public String[] m8745d() {
            return this.f8608b;
        }

        /* renamed from: b */
        public static ArrayList<String> m8743b() {
            return new ArrayList<>(f8605h.keySet());
        }
    }

    /* renamed from: a */
    private static JSONObject m8734a(Context context) {
        return m8735a(context, f8598e);
    }

    /* renamed from: b */
    private static ArrayList<String> m8737b(Context context) {
        List<ApplicationInfo> listMo4869o = C3495on.m11199U().mo8686f().mo4869o(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : listMo4869o) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Integer m8738c(Context context) throws JSONException {
        JSONObject jSONObjectM8735a = m8735a(context, c.m8743b());
        int iPow = 0;
        for (c cVar : c.values()) {
            String[] strArrM8745d = cVar.m8745d();
            int length = strArrM8745d.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectM8735a.optJSONObject(strArrM8745d[i]);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (Math.pow(2.0d, r5.m8744c() - 1) + iPow);
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(iPow);
    }

    /* renamed from: d */
    public static boolean m8739d(Context context) {
        JSONObject jSONObjectM8734a = m8734a(context);
        Iterator<String> itKeys = jSONObjectM8734a.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObjectM8734a.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static JSONObject m8735a(Context context, ArrayList<String> arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> arrayListM8737b = m8737b(context);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                String str = arrayList.get(i);
                i++;
                String str2 = str;
                jSONObject.put(str2, m8736a(arrayListM8737b.contains(str2.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            Log.d(f8597d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m8736a(boolean z) throws JSONException {
        return new b(z);
    }
}

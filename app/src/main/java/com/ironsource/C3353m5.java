package com.ironsource;

import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.m5 */
/* loaded from: classes2.dex */
public class C3353m5 {

    /* renamed from: A */
    public static final String f9464A = "nurl";

    /* renamed from: o */
    public static final String f9465o = "adMarkup";

    /* renamed from: p */
    public static final String f9466p = "instance";

    /* renamed from: q */
    public static final String f9467q = "adData";

    /* renamed from: r */
    public static final String f9468r = "price";

    /* renamed from: s */
    public static final String f9469s = "serverData";

    /* renamed from: t */
    public static final String f9470t = "loadTimeout";

    /* renamed from: u */
    public static final String f9471u = "order";

    /* renamed from: v */
    public static final String f9472v = "show";

    /* renamed from: w */
    public static final String f9473w = "price";

    /* renamed from: x */
    public static final String f9474x = "notifications";

    /* renamed from: y */
    public static final String f9475y = "burl";

    /* renamed from: z */
    public static final String f9476z = "lurl";

    /* renamed from: a */
    private String f9477a;

    /* renamed from: b */
    private String f9478b;

    /* renamed from: c */
    private JSONObject f9479c;

    /* renamed from: d */
    private String f9480d;

    /* renamed from: e */
    private Integer f9481e;

    /* renamed from: f */
    private int f9482f;

    /* renamed from: g */
    private int f9483g;

    /* renamed from: h */
    private int f9484h;

    /* renamed from: i */
    private final List<String> f9485i;

    /* renamed from: j */
    private final List<String> f9486j;

    /* renamed from: k */
    private final List<String> f9487k;

    /* renamed from: l */
    private ImpressionData f9488l;

    /* renamed from: m */
    private C3013cn f9489m;

    /* renamed from: n */
    private boolean f9490n;

    public C3353m5(String str) {
        this.f9477a = null;
        this.f9478b = "";
        this.f9479c = null;
        this.f9480d = "";
        this.f9481e = null;
        this.f9482f = -1;
        this.f9483g = -1;
        this.f9484h = -1;
        this.f9485i = new ArrayList();
        this.f9486j = new ArrayList();
        this.f9487k = new ArrayList();
        this.f9488l = null;
        this.f9489m = null;
        this.f9490n = true;
        this.f9477a = str;
    }

    /* renamed from: a */
    public ImpressionData m9983a(String str) {
        ImpressionData impressionData = this.f9488l;
        if (impressionData == null) {
            return null;
        }
        ImpressionData impressionData2 = new ImpressionData(impressionData);
        impressionData2.replaceMacroForPlacementWithValue(C3368d.f9620r, str);
        return impressionData2;
    }

    /* renamed from: b */
    public List<String> m9985b() {
        return this.f9485i;
    }

    /* renamed from: c */
    public String m9986c() {
        return this.f9477a;
    }

    /* renamed from: d */
    public C3013cn m9987d() {
        return this.f9489m;
    }

    /* renamed from: e */
    public int m9988e() {
        return this.f9482f;
    }

    /* renamed from: f */
    public Integer m9989f() {
        return this.f9481e;
    }

    /* renamed from: g */
    public List<String> m9990g() {
        return this.f9486j;
    }

    /* renamed from: h */
    public List<String> m9991h() {
        return this.f9487k;
    }

    /* renamed from: i */
    public String m9992i() {
        return this.f9480d;
    }

    /* renamed from: j */
    public int m9993j() {
        return this.f9484h;
    }

    /* renamed from: k */
    public String m9994k() {
        return this.f9478b;
    }

    /* renamed from: l */
    public int m9995l() {
        return this.f9483g;
    }

    /* renamed from: m */
    public boolean m9996m() {
        return this.f9490n;
    }

    public C3353m5(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    /* renamed from: a */
    public JSONObject m9984a() {
        return this.f9479c;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0082 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:34:0x003f, B:36:0x0045, B:39:0x004f, B:41:0x0055, B:45:0x0068, B:46:0x006a, B:48:0x0082, B:49:0x0095, B:51:0x00b0, B:53:0x00ba, B:55:0x00c2, B:56:0x00d1, B:42:0x005a, B:44:0x0060), top: B:60:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:34:0x003f, B:36:0x0045, B:39:0x004f, B:41:0x0055, B:45:0x0068, B:46:0x006a, B:48:0x0082, B:49:0x0095, B:51:0x00b0, B:53:0x00ba, B:55:0x00c2, B:56:0x00d1, B:42:0x005a, B:44:0x0060), top: B:60:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:34:0x003f, B:36:0x0045, B:39:0x004f, B:41:0x0055, B:45:0x0068, B:46:0x006a, B:48:0x0082, B:49:0x0095, B:51:0x00b0, B:53:0x00ba, B:55:0x00c2, B:56:0x00d1, B:42:0x005a, B:44:0x0060), top: B:60:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3353m5(org.json.JSONObject r12, int r13, org.json.JSONObject r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3353m5.<init>(org.json.JSONObject, int, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private void m9981a(JSONObject jSONObject, int i) {
        this.f9482f = i;
        this.f9483g = i;
        this.f9484h = i;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(f9472v, i);
            this.f9483g = iOptInt;
            this.f9484h = jSONObject.optInt("price", iOptInt);
        }
    }

    /* renamed from: a */
    private void m9982a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C3702tk.m12451b(jSONObject.getJSONArray(str)));
        }
    }
}

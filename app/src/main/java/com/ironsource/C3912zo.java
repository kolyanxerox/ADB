package com.ironsource;

import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.zo */
/* loaded from: classes2.dex */
public final class C3912zo {

    /* renamed from: a */
    private final C3210i5 f13030a;

    /* renamed from: b */
    private final boolean f13031b;

    /* renamed from: com.ironsource.zo$a */
    public static final class a {

        /* renamed from: a */
        public static final a f13032a = new a();

        /* renamed from: b */
        public static final String f13033b = "adm";

        /* renamed from: c */
        public static final String f13034c = "isOneFlow";

        /* renamed from: d */
        public static final String f13035d = "isMultipleAdObjects";

        /* renamed from: e */
        public static final String f13036e = "adsInternalInfo";

        /* renamed from: f */
        public static final String f13037f = "success";

        /* renamed from: g */
        public static final String f13038g = "error";

        /* renamed from: h */
        public static final String f13039h = "data";

        private a() {
        }
    }

    public C3912zo() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public final HashMap<String, String> m13418a() {
        C3442n5 c3442n5M9264g;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f13031b));
        map.put("isMultipleAdObjects", C3401a.f9920g);
        List<C3437n0> listMo11062a = C3495on.f10667s.m11213d().mo8683G().mo11062a();
        String string = (listMo11062a != null ? new JSONObject().put("success", true).put("data", listMo11062a) : new JSONObject().put("success", false).put(a.f13038g, "Failed to get ad internal info")).toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f13036e, string);
        C3210i5 c3210i5 = this.f13030a;
        if (c3210i5 != null && (c3442n5M9264g = c3210i5.m9264g()) != null) {
            map.put("adm", c3442n5M9264g.m10948a());
            map.putAll(c3442n5M9264g.m10949b());
        }
        return map;
    }

    public C3912zo(C3210i5 c3210i5, boolean z) {
        this.f13030a = c3210i5;
        this.f13031b = z;
    }

    public /* synthetic */ C3912zo(C3210i5 c3210i5, boolean z, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? null : c3210i5, (i & 2) != 0 ? false : z);
    }
}

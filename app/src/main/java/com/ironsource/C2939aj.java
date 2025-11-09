package com.ironsource;

import android.content.Context;
import com.ironsource.C3571qt;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.aj */
/* loaded from: classes2.dex */
public class C2939aj {

    /* renamed from: a */
    public static final a f7536a = new a(null);

    /* renamed from: com.ironsource.aj$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        private final JSONObject m7807a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        /* renamed from: b */
        public final boolean m7808b(Context context) {
            kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
            C3108f8 c3108f8M7810d = m7810d(context);
            return c3108f8M7810d.m8651d().length() > 0 && c3108f8M7810d.m8652e().length() > 0;
        }

        /* renamed from: c */
        public final C3571qt m7809c(Context context) {
            kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
            C3108f8 c3108f8M7810d = m7810d(context);
            if (c3108f8M7810d.m8651d().length() <= 0 || c3108f8M7810d.m8652e().length() <= 0) {
                c3108f8M7810d = null;
            }
            if (c3108f8M7810d == null) {
                return null;
            }
            C3571qt c3571qt = new C3571qt(context, c3108f8M7810d.m8651d(), c3108f8M7810d.m8653f(), c3108f8M7810d.m8652e());
            c3571qt.m11634a(C3571qt.a.CACHE);
            return c3571qt;
        }

        /* renamed from: d */
        public final C3108f8 m7810d(Context context) {
            kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
            JSONObject jSONObjectM7807a = m7807a(context);
            String cachedAppKey = jSONObjectM7807a.optString("appKey");
            String cachedUserId = jSONObjectM7807a.optString("userId");
            String cachedSettings = jSONObjectM7807a.optString(C3571qt.f11099n);
            kotlin.jvm.internal.OooOo.OooO0Oo(cachedAppKey, "cachedAppKey");
            kotlin.jvm.internal.OooOo.OooO0Oo(cachedUserId, "cachedUserId");
            kotlin.jvm.internal.OooOo.OooO0Oo(cachedSettings, "cachedSettings");
            return new C3108f8(cachedAppKey, cachedUserId, cachedSettings);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: a */
    public static final boolean m7804a(Context context) {
        return f7536a.m7808b(context);
    }

    /* renamed from: b */
    public static final C3571qt m7805b(Context context) {
        return f7536a.m7809c(context);
    }

    /* renamed from: c */
    public static final C3108f8 m7806c(Context context) {
        return f7536a.m7810d(context);
    }
}

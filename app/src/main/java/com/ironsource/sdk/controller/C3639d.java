package com.ironsource.sdk.controller;

import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.ironsource.C3146gb;
import com.ironsource.C3198hs;
import com.ironsource.C3489oh;
import com.ironsource.C3551q9;
import com.ironsource.C3699th;
import com.ironsource.C3769vh;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.d */
/* loaded from: classes2.dex */
class C3639d {

    /* renamed from: h */
    static final String f11436h = "controllerSourceData";

    /* renamed from: i */
    private static final String f11437i = "next_";

    /* renamed from: j */
    private static final String f11438j = "fallback_";

    /* renamed from: k */
    private static final String f11439k = "controllerSourceCode";

    /* renamed from: a */
    private long f11440a;

    /* renamed from: b */
    private int f11441b;

    /* renamed from: c */
    private c f11442c;

    /* renamed from: d */
    private d f11443d = d.NONE;

    /* renamed from: e */
    private String f11444e;

    /* renamed from: f */
    private String f11445f;

    /* renamed from: g */
    private C3146gb f11446g;

    /* renamed from: com.ironsource.sdk.controller.d$a */
    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(C3034d9.a.f7923j, Integer.valueOf(C3639d.this.f11441b));
            putOpt(C3639d.f11439k, Integer.valueOf(C3639d.this.f11443d.m11957a()));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.d$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11448a;

        static {
            int[] iArr = new int[c.values().length];
            f11448a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11448a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11448a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.d$c */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d */
    public enum d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* renamed from: a */
        private int f11460a;

        d(int i) {
            this.f11460a = i;
        }

        /* renamed from: a */
        public int m11957a() {
            return this.f11460a;
        }
    }

    public C3639d(JSONObject jSONObject, String str, String str2, C3146gb c3146gb) {
        int iOptInt = jSONObject.optInt(C3034d9.a.f7923j, -1);
        this.f11441b = iOptInt;
        this.f11442c = m11937a(iOptInt);
        this.f11444e = str;
        this.f11445f = str2;
        this.f11446g = c3146gb;
    }

    /* renamed from: c */
    private void m11943c() {
        try {
            C3769vh c3769vhM11954g = m11954g();
            if (c3769vhM11954g.exists()) {
                C3769vh c3769vhM11946h = m11946h();
                if (c3769vhM11946h.exists()) {
                    c3769vhM11946h.delete();
                }
                IronSourceStorageUtils.renameFile(c3769vhM11954g.getPath(), c3769vhM11946h.getPath());
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: d */
    private void m11944d() {
        IronSourceStorageUtils.deleteFile(m11946h());
    }

    /* renamed from: e */
    private void m11945e() {
        IronSourceStorageUtils.deleteFile(m11954g());
    }

    /* renamed from: h */
    private C3769vh m11946h() {
        return new C3769vh(this.f11444e, "fallback_mobileController.html");
    }

    /* renamed from: i */
    private C3769vh m11947i() {
        return new C3769vh(this.f11444e, "next_mobileController.html");
    }

    /* renamed from: j */
    private boolean m11948j() {
        return m11946h().exists();
    }

    /* renamed from: l */
    private void m11949l() {
        C3489oh c3489ohM11155a = new C3489oh().m11155a(C3037dc.f8270y, Integer.valueOf(this.f11441b));
        if (this.f11440a > 0) {
            c3489ohM11155a.m11155a(C3037dc.f8226B, Long.valueOf(System.currentTimeMillis() - this.f11440a));
        }
        C3699th.m12428a(C3198hs.f8939x, c3489ohM11155a.m11156a());
    }

    /* renamed from: f */
    public JSONObject m11953f() throws JSONException {
        return new a();
    }

    /* renamed from: g */
    public C3769vh m11954g() {
        return new C3769vh(this.f11444e, C3034d9.f7895f);
    }

    /* renamed from: k */
    public boolean m11955k() {
        C3769vh c3769vh;
        int i = b.f11448a[this.f11442c.ordinal()];
        if (i == 1) {
            m11945e();
            c3769vh = new C3769vh(this.f11444e, SDKUtils.getFileName(this.f11445f));
        } else {
            if (i != 2) {
                if (i == 3) {
                    try {
                        C3769vh c3769vhM11954g = m11954g();
                        C3769vh c3769vhM11947i = m11947i();
                        if (!c3769vhM11947i.exists() && !c3769vhM11954g.exists()) {
                            m11939a(new C3769vh(this.f11444e, SDKUtils.getFileName(this.f11445f)));
                            return false;
                        }
                        if (!c3769vhM11947i.exists() && c3769vhM11954g.exists()) {
                            d dVar = d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f11443d = dVar;
                            m11938a(dVar);
                            m11939a(new C3769vh(this.f11444e, c3769vhM11947i.getName()));
                            return true;
                        }
                        m11943c();
                        if (m11942b()) {
                            d dVar2 = d.PREPARED_CONTROLLER_LOADED;
                            this.f11443d = dVar2;
                            m11938a(dVar2);
                            m11944d();
                            m11939a(new C3769vh(this.f11444e, c3769vhM11947i.getName()));
                            return true;
                        }
                        if (!m11940a()) {
                            m11939a(new C3769vh(this.f11444e, SDKUtils.getFileName(this.f11445f)));
                            return false;
                        }
                        d dVar3 = d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f11443d = dVar3;
                        m11938a(dVar3);
                        m11939a(new C3769vh(this.f11444e, c3769vhM11947i.getName()));
                        return true;
                    } catch (Exception e) {
                        C3551q9.m11517d().m11519a(e);
                    }
                }
                return false;
            }
            m11943c();
            c3769vh = new C3769vh(this.f11444e, SDKUtils.getFileName(this.f11445f));
        }
        m11939a(c3769vh);
        return false;
    }

    /* renamed from: m */
    public boolean m11956m() {
        return this.f11443d != d.NONE;
    }

    /* renamed from: a */
    private c m11937a(int i) {
        return i != 1 ? i != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    /* renamed from: b */
    private boolean m11942b() throws Exception {
        return IronSourceStorageUtils.renameFile(m11947i().getPath(), m11954g().getPath());
    }

    /* renamed from: a */
    public void m11950a(C3489oh c3489oh) {
        c3489oh.m11155a(C3037dc.f8270y, Integer.valueOf(this.f11441b));
        C3699th.m12428a(C3198hs.f8937v, c3489oh.m11156a());
        this.f11440a = System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m11938a(d dVar) {
        C3489oh c3489ohM11155a = new C3489oh().m11155a(C3037dc.f8270y, Integer.valueOf(this.f11441b)).m11155a(C3037dc.f8271z, Integer.valueOf(dVar.m11957a()));
        if (this.f11440a > 0) {
            c3489ohM11155a.m11155a(C3037dc.f8226B, Long.valueOf(System.currentTimeMillis() - this.f11440a));
        }
        C3699th.m12428a(C3198hs.f8938w, c3489ohM11155a.m11156a());
    }

    /* renamed from: a */
    private void m11939a(C3769vh c3769vh) {
        if (this.f11446g.m8940c()) {
            return;
        }
        this.f11446g.mo8937a(c3769vh, this.f11445f);
    }

    /* renamed from: a */
    public void m11951a(Runnable runnable) {
        if (m11956m()) {
            return;
        }
        if (this.f11442c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            m11944d();
        }
        d dVar = d.CONTROLLER_FROM_SERVER;
        this.f11443d = dVar;
        m11938a(dVar);
        runnable.run();
    }

    /* renamed from: a */
    public void m11952a(Runnable runnable, Runnable runnable2) {
        if (m11956m()) {
            return;
        }
        if (this.f11442c != c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !m11940a()) {
            m11949l();
            runnable2.run();
        } else {
            d dVar = d.FALLBACK_CONTROLLER_RECOVERY;
            this.f11443d = dVar;
            m11938a(dVar);
            runnable.run();
        }
    }

    /* renamed from: a */
    private boolean m11940a() {
        try {
            if (m11948j()) {
                return IronSourceStorageUtils.renameFile(m11946h().getPath(), m11954g().getPath());
            }
            return false;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return false;
        }
    }
}

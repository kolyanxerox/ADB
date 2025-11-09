package com.ironsource;

import android.app.Activity;
import com.ironsource.C3008ci;
import com.ironsource.C3034d9;
import com.ironsource.C3198hs;
import com.ironsource.C3419mh;
import com.ironsource.InterfaceC2973bi;
import com.ironsource.InterfaceC3843xn;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.C3640e;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.xh */
/* loaded from: classes2.dex */
public final class C3837xh implements InterfaceC2973bi {

    /* renamed from: j */
    public static final a f12643j = new a(null);

    /* renamed from: a */
    private final String f12644a;

    /* renamed from: b */
    private final InterfaceC3843xn f12645b;

    /* renamed from: c */
    private final InterfaceC3524ph f12646c;

    /* renamed from: d */
    private C3905zh f12647d;

    /* renamed from: e */
    private String f12648e;

    /* renamed from: f */
    private String f12649f;

    /* renamed from: g */
    private Long f12650g;

    /* renamed from: h */
    private InterfaceC2973bi.a f12651h;

    /* renamed from: i */
    private C3008ci f12652i;

    /* renamed from: com.ironsource.xh$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final C3837xh m13063a() {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "randomUUID().toString()");
            C3640e controllerManager = IronSourceNetwork.getControllerManager();
            kotlin.jvm.internal.OooOo.OooO0Oo(controllerManager, "controllerManager");
            return new C3837xh(string, new C3809wn(string, controllerManager, null, null, 12, null), new C3559qh());
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.xh$b */
    public static final class b implements InterfaceC3843xn.a {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3843xn.a
        /* renamed from: a */
        public void mo13064a() {
            InterfaceC2973bi.a aVarMo7927a = C3837xh.this.mo7927a();
            if (aVarMo7927a != null) {
                aVarMo7927a.onNativeAdShown();
            }
        }

        @Override // com.ironsource.InterfaceC3843xn.a
        /* renamed from: h */
        public void mo13067h() {
            InterfaceC2973bi.a aVarMo7927a = C3837xh.this.mo7927a();
            if (aVarMo7927a != null) {
                aVarMo7927a.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.InterfaceC3843xn.a
        /* renamed from: a */
        public void mo13065a(C3905zh adData) {
            kotlin.jvm.internal.OooOo.OooO0o0(adData, "adData");
            C3837xh.this.f12647d = adData;
            InterfaceC3524ph interfaceC3524ph = C3837xh.this.f12646c;
            C3198hs.a loadAdSuccess = C3198hs.f8927l;
            kotlin.jvm.internal.OooOo.OooO0Oo(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapM11156a = C3837xh.this.m13055c().m11156a();
            kotlin.jvm.internal.OooOo.OooO0Oo(mapM11156a, "baseEventParams().data");
            interfaceC3524ph.mo11409a(loadAdSuccess, mapM11156a);
            InterfaceC2973bi.a aVarMo7927a = C3837xh.this.mo7927a();
            if (aVarMo7927a != null) {
                aVarMo7927a.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.InterfaceC3843xn.a
        /* renamed from: a */
        public void mo13066a(String reason) {
            kotlin.jvm.internal.OooOo.OooO0o0(reason, "reason");
            C3489oh c3489ohM11155a = C3837xh.this.m13055c().m11155a(C3037dc.f8225A, reason);
            InterfaceC3524ph interfaceC3524ph = C3837xh.this.f12646c;
            C3198hs.a loadAdFailed = C3198hs.f8922g;
            kotlin.jvm.internal.OooOo.OooO0Oo(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapM11156a = c3489ohM11155a.m11156a();
            kotlin.jvm.internal.OooOo.OooO0Oo(mapM11156a, "eventParams.data");
            interfaceC3524ph.mo11409a(loadAdFailed, mapM11156a);
            InterfaceC2973bi.a aVarMo7927a = C3837xh.this.mo7927a();
            if (aVarMo7927a != null) {
                aVarMo7927a.onNativeAdLoadFailed(reason);
            }
        }
    }

    /* renamed from: com.ironsource.xh$c */
    public static final class c implements C3008ci.a {

        /* renamed from: com.ironsource.xh$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f12655a;

            static {
                int[] iArr = new int[C3008ci.b.values().length];
                try {
                    iArr[C3008ci.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f12655a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.C3008ci.a
        /* renamed from: a */
        public void mo8160a(C3008ci.b viewName) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(viewName, "viewName");
            if (a.f12655a[viewName.ordinal()] == 1) {
                C3837xh.this.f12645b.mo12945b();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.m8163b());
            InterfaceC3843xn interfaceC3843xn = C3837xh.this.f12645b;
            kotlin.jvm.internal.OooOo.OooO0Oo(clickParams, "clickParams");
            interfaceC3843xn.mo12944a(clickParams);
        }

        @Override // com.ironsource.C3008ci.a
        /* renamed from: a */
        public void mo8161a(C3920zw viewVisibilityParams) {
            kotlin.jvm.internal.OooOo.OooO0o0(viewVisibilityParams, "viewVisibilityParams");
            C3837xh.this.f12645b.mo12943a(viewVisibilityParams);
        }
    }

    public C3837xh(String id, InterfaceC3843xn controller, InterfaceC3524ph eventTracker) {
        kotlin.jvm.internal.OooOo.OooO0o0(id, "id");
        kotlin.jvm.internal.OooOo.OooO0o0(controller, "controller");
        kotlin.jvm.internal.OooOo.OooO0o0(eventTracker, "eventTracker");
        this.f12644a = id;
        this.f12645b = controller;
        this.f12646c = eventTracker;
        controller.mo12942a(m13058e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final C3489oh m13055c() {
        C3489oh c3489ohM11155a = new C3489oh().m11155a(C3037dc.f8269x, this.f12649f).m11155a(C3037dc.f8267v, this.f12648e).m11155a(C3037dc.f8268w, C3419mh.e.NativeAd.toString()).m11155a(C3037dc.f8233I, Long.valueOf(m13060i()));
        kotlin.jvm.internal.OooOo.OooO0Oo(c3489ohM11155a, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c3489ohM11155a;
    }

    /* renamed from: d */
    public static final C3837xh m13057d() {
        return f12643j.m13063a();
    }

    /* renamed from: e */
    private final b m13058e() {
        return new b();
    }

    /* renamed from: f */
    private final c m13059f() {
        return new c();
    }

    /* renamed from: i */
    private final long m13060i() {
        Long l = this.f12650g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    @Override // com.ironsource.InterfaceC2973bi
    /* renamed from: a */
    public InterfaceC2973bi.a mo7927a() {
        return this.f12651h;
    }

    @Override // com.ironsource.InterfaceC2973bi
    public void destroy() {
        C3008ci c3008ci = this.f12652i;
        if (c3008ci != null) {
            c3008ci.m8135a((C3008ci.a) null);
        }
        this.f12645b.destroy();
    }

    /* renamed from: g */
    public final String m13061g() {
        return this.f12648e;
    }

    /* renamed from: h */
    public final String m13062h() {
        return this.f12649f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3837xh(String str, InterfaceC3843xn interfaceC3843xn, InterfaceC3524ph interfaceC3524ph, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(str, "randomUUID().toString()");
        }
        this(str, interfaceC3843xn, interfaceC3524ph);
    }

    @Override // com.ironsource.InterfaceC2973bi
    /* renamed from: b */
    public C3905zh mo7931b() {
        return this.f12647d;
    }

    @Override // com.ironsource.InterfaceC2973bi
    /* renamed from: a */
    public void mo7928a(Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(loadParams, "loadParams");
        this.f12650g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f12648e = loadParams.optString("demandSourceName");
        this.f12649f = loadParams.optString("inAppBidding");
        InterfaceC3524ph interfaceC3524ph = this.f12646c;
        C3198hs.a loadAd = C3198hs.f8921f;
        kotlin.jvm.internal.OooOo.OooO0Oo(loadAd, "loadAd");
        HashMap<String, Object> mapM11156a = m13055c().m11156a();
        kotlin.jvm.internal.OooOo.OooO0Oo(mapM11156a, "baseEventParams().data");
        interfaceC3524ph.mo11409a(loadAd, mapM11156a);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(C3034d9.h.f8142y0, String.valueOf(this.f12650g));
        this.f12645b.mo12940a(activity, jSONObject);
    }

    @Override // com.ironsource.InterfaceC2973bi
    /* renamed from: a */
    public void mo7929a(InterfaceC2973bi.a aVar) {
        this.f12651h = aVar;
    }

    @Override // com.ironsource.InterfaceC2973bi
    /* renamed from: a */
    public void mo7930a(C3008ci viewHolder) {
        kotlin.jvm.internal.OooOo.OooO0o0(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapM11156a = m13055c().m11156a();
        kotlin.jvm.internal.OooOo.OooO0Oo(mapM11156a, "baseEventParams().data");
        linkedHashMap.putAll(mapM11156a);
        String string = viewHolder.m8159t().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(C3037dc.f8270y, string);
        InterfaceC3524ph interfaceC3524ph = this.f12646c;
        C3198hs.a registerAd = C3198hs.f8929n;
        kotlin.jvm.internal.OooOo.OooO0Oo(registerAd, "registerAd");
        interfaceC3524ph.mo11409a(registerAd, linkedHashMap);
        this.f12652i = viewHolder;
        viewHolder.m8135a(m13059f());
        this.f12645b.mo12941a(viewHolder);
    }
}

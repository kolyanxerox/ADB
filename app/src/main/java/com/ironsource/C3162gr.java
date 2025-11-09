package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.p001os.OutcomeReceiver;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.ironsource.gr */
/* loaded from: classes2.dex */
public final class C3162gr {

    /* renamed from: a */
    private final InterfaceC3903zf f8754a;

    /* renamed from: b */
    private final o00O0Oo.OooO0O0 f8755b;

    /* renamed from: c */
    private final InterfaceC3116fg f8756c;

    /* renamed from: d */
    private final Executor f8757d;

    /* renamed from: com.ironsource.gr$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.OooOo00 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f8758a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: com.ironsource.gr$b */
    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a */
        public void onError(Exception error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C3162gr.this.m9006a(error.getMessage());
        }

        public void onResult(Object obj) {
            C3162gr.this.m9009c();
        }
    }

    public C3162gr() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    private final Uri m9002a(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = this.f8756c.mo8686f();
        String connectionType = IronSourceUtils.getConnectionType(context);
        Uri uriBuild = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter(C3034d9.i.f8193l, Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(C3451ne.f10444T0, interfaceC3767vfMo8686f.mo4871p(context)).appendQueryParameter(C3451ne.f10424J0, interfaceC3767vfMo8686f.mo4826G(context)).appendQueryParameter("auid", interfaceC3767vfMo8686f.mo4879t(context)).appendQueryParameter("isFirstSession", String.valueOf(m9008b(context))).appendQueryParameter("coppa", m9007b()).appendQueryParameter(C3451ne.f10479h0, String.valueOf(C3206i1.m9248a())).appendQueryParameter(C3037dc.f8261p, "1").appendQueryParameter("timestamp", String.valueOf(((Number) this.f8755b.invoke()).longValue())).appendQueryParameter(C3034d9.i.f8212x, interfaceC3767vfMo8686f.mo4842b(context)).appendQueryParameter("deviceCarrier", interfaceC3767vfMo8686f.mo4859j(context)).appendQueryParameter(C3034d9.i.f8208t, connectionType).appendQueryParameter(C3896z8.f12930b, String.valueOf(o00O0oO.o0000O00.Oooo000(connectionType, C3896z8.f12930b))).build();
        kotlin.jvm.internal.OooOo.OooO0Oo(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    /* renamed from: b */
    private final String m9007b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapM13074c = C3840xk.m13069b().m13074c();
        List<String> list = concurrentHashMapM13074c != null ? concurrentHashMapM13074c.get(C3401a.f9915b) : null;
        String str = list != null ? (String) o00O0.OooOo00.OooOoOO(list) : null;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public final void m9009c() {
        this.f8754a.mo12605a(new C3899zb(EnumC2638ac.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    /* renamed from: d */
    private final void m9010d() {
        this.f8754a.mo12605a(new C3899zb(EnumC2638ac.REGISTER_TRIGGER, (JSONObject) null));
    }

    public C3162gr(InterfaceC3903zf eventManager, o00O0Oo.OooO0O0 getTimeFunction, InterfaceC3116fg serviceProvider, Executor executor) {
        kotlin.jvm.internal.OooOo.OooO0o0(eventManager, "eventManager");
        kotlin.jvm.internal.OooOo.OooO0o0(getTimeFunction, "getTimeFunction");
        kotlin.jvm.internal.OooOo.OooO0o0(serviceProvider, "serviceProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(executor, "executor");
        this.f8754a = eventManager;
        this.f8755b = getTimeFunction;
        this.f8756c = serviceProvider;
        this.f8757d = executor;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private final OutcomeReceiver m9003a() {
        return new b();
    }

    /* renamed from: b */
    private final boolean m9008b(Context context) {
        return IronSourceUtils.getFirstSession(context);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final void m9011c(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        m9010d();
        try {
            MeasurementManager measurementManagerM9249a = C3206i1.m9249a(context);
            if (measurementManagerM9249a == null) {
                m9006a("could not obtain measurement manager");
            } else {
                measurementManagerM9249a.registerTrigger(m9002a(context), this.f8757d, m9003a());
            }
        } catch (Exception e) {
            m9006a(e.getMessage());
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3162gr(InterfaceC3903zf interfaceC3903zf, o00O0Oo.OooO0O0 oooO0O0, InterfaceC3116fg interfaceC3116fg, Executor executor, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        interfaceC3903zf = (i & 1) != 0 ? C3495on.f10667s.m11213d().mo8698z() : interfaceC3903zf;
        oooO0O0 = (i & 2) != 0 ? a.f8758a : oooO0O0;
        interfaceC3116fg = (i & 4) != 0 ? C3495on.f10667s.m11213d() : interfaceC3116fg;
        if ((i & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            kotlin.jvm.internal.OooOo.OooO0Oo(executor, "newSingleThreadExecutor()");
        }
        this(interfaceC3903zf, oooO0O0, interfaceC3116fg, executor);
    }

    /* renamed from: a */
    public final void m9006a(String str) {
        this.f8754a.mo12605a(new C3899zb(EnumC2638ac.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}

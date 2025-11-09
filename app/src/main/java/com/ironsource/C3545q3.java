package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3034d9;
import com.ironsource.C3419mh;
import com.ironsource.InterfaceC3615s3;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import org.apache.tika.pipes.PipesConfigBase;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.q3 */
/* loaded from: classes2.dex */
public final class C3545q3 {

    /* renamed from: a */
    public static final b f10867a = new b(null);

    /* renamed from: b */
    private static final String f10868b = b.class.getName();

    /* renamed from: com.ironsource.q3$a */
    public static final class a {

        /* renamed from: a */
        private final String f10869a;

        /* renamed from: b */
        private final C3419mh.e f10870b;

        /* renamed from: c */
        private final String f10871c;

        /* renamed from: d */
        private final JSONObject f10872d;

        public a(String name, C3419mh.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
            kotlin.jvm.internal.OooOo.OooO0o0(productType, "productType");
            kotlin.jvm.internal.OooOo.OooO0o0(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.OooOo.OooO0o0(params, "params");
            this.f10869a = name;
            this.f10870b = productType;
            this.f10871c = demandSourceName;
            this.f10872d = params;
        }

        /* renamed from: a */
        public static /* synthetic */ a m11477a(a aVar, String str, C3419mh.e eVar, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f10869a;
            }
            if ((i & 2) != 0) {
                eVar = aVar.f10870b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f10871c;
            }
            if ((i & 8) != 0) {
                jSONObject = aVar.f10872d;
            }
            return aVar.m11478a(str, eVar, str2, jSONObject);
        }

        /* renamed from: b */
        public final C3419mh.e m11480b() {
            return this.f10870b;
        }

        /* renamed from: c */
        public final String m11481c() {
            return this.f10871c;
        }

        /* renamed from: d */
        public final JSONObject m11482d() {
            return this.f10872d;
        }

        /* renamed from: e */
        public final String m11483e() {
            return this.f10871c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.OooOo.OooO00o(this.f10869a, aVar.f10869a) && this.f10870b == aVar.f10870b && kotlin.jvm.internal.OooOo.OooO00o(this.f10871c, aVar.f10871c) && kotlin.jvm.internal.OooOo.OooO00o(this.f10872d.toString(), aVar.f10872d.toString());
        }

        /* renamed from: f */
        public final String m11484f() {
            return this.f10869a;
        }

        /* renamed from: g */
        public final JSONObject m11485g() {
            return this.f10872d;
        }

        /* renamed from: h */
        public final C3419mh.e m11486h() {
            return this.f10870b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        /* renamed from: i */
        public final JSONObject m11487i() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject(this.f10872d.toString()).put(C3034d9.h.f8117m, this.f10870b).put("demandSourceName", this.f10871c);
            kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        public String toString() {
            return "CallbackResult(name=" + this.f10869a + ", productType=" + this.f10870b + ", demandSourceName=" + this.f10871c + ", params=" + this.f10872d + ')';
        }

        /* renamed from: a */
        public final a m11478a(String name, C3419mh.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
            kotlin.jvm.internal.OooOo.OooO0o0(productType, "productType");
            kotlin.jvm.internal.OooOo.OooO0o0(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.OooOo.OooO0o0(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        /* renamed from: a */
        public final String m11479a() {
            return this.f10869a;
        }
    }

    /* renamed from: com.ironsource.q3$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    @o00O0OO0.OooO(m13471c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", m13472f = "AndroidSandboxJSHandler.kt", m13473l = {80}, m13474m = "invokeSuspend")
    /* renamed from: com.ironsource.q3$c */
    public static final class c extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

        /* renamed from: a */
        int f10873a;

        /* renamed from: c */
        final /* synthetic */ MeasurementManager f10875c;

        /* renamed from: d */
        final /* synthetic */ Uri f10876d;

        /* renamed from: e */
        final /* synthetic */ MotionEvent f10877e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.f10875c = measurementManager;
            this.f10876d = uri;
            this.f10877e = motionEvent;
        }

        @Override // o00O0Oo.o00O0O
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o00O0oOo.o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((c) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return C3545q3.this.new c(this.f10875c, this.f10876d, this.f10877e, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
            int i = this.f10873a;
            if (i == 0) {
                o00O0.o000OOo.OooOO0O(obj);
                C3545q3 c3545q3 = C3545q3.this;
                MeasurementManager measurementManager = this.f10875c;
                Uri uri = this.f10876d;
                kotlin.jvm.internal.OooOo.OooO0Oo(uri, "uri");
                MotionEvent motionEvent = this.f10877e;
                this.f10873a = 1;
                if (c3545q3.m11474a(measurementManager, uri, motionEvent, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00O0.o000OOo.OooOO0O(obj);
            }
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    @o00O0OO0.OooO(m13471c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", m13472f = "AndroidSandboxJSHandler.kt", m13473l = {PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS}, m13474m = "invokeSuspend")
    /* renamed from: com.ironsource.q3$d */
    public static final class d extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

        /* renamed from: a */
        int f10878a;

        /* renamed from: c */
        final /* synthetic */ MeasurementManager f10880c;

        /* renamed from: d */
        final /* synthetic */ Uri f10881d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.f10880c = measurementManager;
            this.f10881d = uri;
        }

        @Override // o00O0Oo.o00O0O
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o00O0oOo.o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((d) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return C3545q3.this.new d(this.f10880c, this.f10881d, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
            int i = this.f10878a;
            if (i == 0) {
                o00O0.o000OOo.OooOO0O(obj);
                C3545q3 c3545q3 = C3545q3.this;
                MeasurementManager measurementManager = this.f10880c;
                Uri uri = this.f10881d;
                kotlin.jvm.internal.OooOo.OooO0Oo(uri, "uri");
                this.f10878a = 1;
                if (c3545q3.m11474a(measurementManager, uri, null, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00O0.o000OOo.OooOO0O(obj);
            }
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    /* renamed from: a */
    private final a m11470a(InterfaceC3615s3.a.C4582a c4582a, MeasurementManager measurementManager) throws Throwable {
        Uri uri = Uri.parse(c4582a.getUrl());
        long jUptimeMillis = SystemClock.uptimeMillis();
        o00O0oOo.o0000OO0.OooOoO(o00O0O0O.OooOOO.f31358OooOo0O, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c4582a.m11813m(), c4582a.m11814n().m11820c(), c4582a.m11814n().m11821d(), c4582a.m11815o()), null));
        return m11471a(c4582a);
    }

    /* renamed from: a */
    private final a m11471a(InterfaceC3615s3.a aVar) throws JSONException {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC3615s3.a.C4582a ? C3069e9.f8387d : C3069e9.f8388e));
        String strMo11801c = aVar.mo11801c();
        C3419mh.e eVarMo11800b = aVar.mo11800b();
        String strMo11802d = aVar.mo11802d();
        kotlin.jvm.internal.OooOo.OooO0Oo(params, "params");
        return new a(strMo11801c, eVarMo11800b, strMo11802d, params);
    }

    /* renamed from: a */
    private final a m11472a(InterfaceC3615s3.a aVar, MeasurementManager measurementManager) throws Throwable {
        o00O0oOo.o0000OO0.OooOoO(o00O0O0O.OooOOO.f31358OooOo0O, new d(measurementManager, Uri.parse(aVar.getUrl()), null));
        return m11471a(aVar);
    }

    /* renamed from: a */
    private final a m11473a(InterfaceC3615s3 interfaceC3615s3, String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("reason", str).put("type", interfaceC3615s3 instanceof InterfaceC3615s3.a.C4582a ? C3069e9.f8387d : C3069e9.f8388e);
        String strMo11799a = interfaceC3615s3.mo11799a();
        C3419mh.e eVarMo11800b = interfaceC3615s3.mo11800b();
        String strMo11802d = interfaceC3615s3.mo11802d();
        JSONObject jSONObjectPut2 = new JSONObject().put("params", jSONObjectPut);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strMo11799a, eVarMo11800b, strMo11802d, jSONObjectPut2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public final Object m11474a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        o00O0O0O.OooOOOO oooOOOO = new o00O0O0O.OooOOOO(Oooo0o0.OooO.OooOOOO(oooO0OO));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C3580r3.m11707a(oooOOOO));
        Object objOooO00o = oooOOOO.OooO00o();
        return objOooO00o == o00O0O0o.OooOo00.f31365OooOo0O ? objOooO00o : oo00o.OooOo.f33195OooO00o;
    }

    /* renamed from: a */
    private final a m11469a(Context context, InterfaceC3615s3.a aVar) {
        MeasurementManager measurementManagerM9249a = C3206i1.m9249a(context);
        if (measurementManagerM9249a == null) {
            Logger.m12266i(f10868b, "could not obtain measurement manager");
            return m11473a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC3615s3.a.b) {
                return m11472a(aVar, measurementManagerM9249a);
            }
            if (aVar instanceof InterfaceC3615s3.a.C4582a) {
                return m11470a((InterfaceC3615s3.a.C4582a) aVar, measurementManagerM9249a);
            }
            throw new OooOOO0.OooO00o();
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "failed to handle attribution, message: ");
            sbOooOOO0.append(e.getMessage());
            return m11473a(aVar, sbOooOOO0.toString());
        }
    }

    /* renamed from: a */
    public final a m11476a(Context context, InterfaceC3615s3 message) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        if (message instanceof InterfaceC3615s3.a) {
            return m11469a(context, (InterfaceC3615s3.a) message);
        }
        throw new OooOOO0.OooO00o();
    }
}

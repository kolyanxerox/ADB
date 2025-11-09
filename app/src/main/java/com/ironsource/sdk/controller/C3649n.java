package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3419mh;
import com.ironsource.C3523pg;
import com.ironsource.C3551q9;
import com.ironsource.C3762va;
import com.ironsource.InterfaceC3761v9;
import com.ironsource.InterfaceC3795w9;
import com.ironsource.InterfaceC3829x9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.InterfaceC3641f;
import com.ironsource.sdk.controller.InterfaceC3647l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.n */
/* loaded from: classes2.dex */
public class C3649n implements InterfaceC3647l {

    /* renamed from: a */
    private final C3523pg f11575a;

    /* renamed from: b */
    private final String f11576b;

    /* renamed from: com.ironsource.sdk.controller.n$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3647l.a f11577a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3641f.c f11578b;

        public a(InterfaceC3647l.a aVar, InterfaceC3641f.c cVar) {
            this.f11577a = aVar;
            this.f11578b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (this.f11577a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", C3649n.this.f11576b);
                this.f11577a.mo11066a(new InterfaceC3641f.a(this.f11578b.m12023f(), jSONObject));
            } catch (JSONException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3829x9 f11580a;

        /* renamed from: b */
        final /* synthetic */ C3762va f11581b;

        public b(InterfaceC3829x9 interfaceC3829x9, C3762va c3762va) {
            this.f11580a = interfaceC3829x9;
            this.f11581b = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11580a.mo8349a(C3419mh.e.RewardedVideo, this.f11581b.m12764h(), C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3829x9 f11583a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f11584b;

        public c(InterfaceC3829x9 interfaceC3829x9, JSONObject jSONObject) {
            this.f11583a = interfaceC3829x9;
            this.f11584b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11583a.mo8375d(this.f11584b.optString("demandSourceName"), C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3795w9 f11586a;

        /* renamed from: b */
        final /* synthetic */ C3762va f11587b;

        public d(InterfaceC3795w9 interfaceC3795w9, C3762va c3762va) {
            this.f11586a = interfaceC3795w9;
            this.f11587b = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11586a.mo8349a(C3419mh.e.Interstitial, this.f11587b.m12764h(), C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3795w9 f11589a;

        /* renamed from: b */
        final /* synthetic */ String f11590b;

        public e(InterfaceC3795w9 interfaceC3795w9, String str) {
            this.f11589a = interfaceC3795w9;
            this.f11590b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11589a.mo8372c(this.f11590b, C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3795w9 f11592a;

        /* renamed from: b */
        final /* synthetic */ C3762va f11593b;

        public f(InterfaceC3795w9 interfaceC3795w9, C3762va c3762va) {
            this.f11592a = interfaceC3795w9;
            this.f11593b = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11592a.mo8372c(this.f11593b.m12764h(), C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3795w9 f11595a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f11596b;

        public g(InterfaceC3795w9 interfaceC3795w9, JSONObject jSONObject) {
            this.f11595a = interfaceC3795w9;
            this.f11596b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11595a.mo8367b(this.f11596b.optString("demandSourceName"), C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3795w9 f11598a;

        /* renamed from: b */
        final /* synthetic */ C3762va f11599b;

        public h(InterfaceC3795w9 interfaceC3795w9, C3762va c3762va) {
            this.f11598a = interfaceC3795w9;
            this.f11599b = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11598a.mo8367b(this.f11599b.m12764h(), C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$i */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3761v9 f11601a;

        /* renamed from: b */
        final /* synthetic */ Map f11602b;

        public i(InterfaceC3761v9 interfaceC3761v9, Map map) {
            this.f11601a = interfaceC3761v9;
            this.f11602b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11601a.mo8354a((String) this.f11602b.get("demandSourceName"), C3649n.this.f11576b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.n$j */
    public class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3761v9 f11604a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f11605b;

        public j(InterfaceC3761v9 interfaceC3761v9, JSONObject jSONObject) {
            this.f11604a = interfaceC3761v9;
            this.f11605b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11604a.mo8354a(this.f11605b.optString("demandSourceName"), C3649n.this.f11576b);
        }
    }

    public C3649n(String str, C3523pg c3523pg) {
        this.f11575a = c3523pg;
        this.f11576b = str;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo11998b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: d */
    public void mo12002d() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    public void destroy() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: e */
    public void mo12003e() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: f */
    public void mo12004f() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: g */
    public C3419mh.c mo12005g() {
        return C3419mh.c.Native;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11980a() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo11999b(C3762va c3762va) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11981a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo12000b(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9) {
        if (interfaceC3795w9 != null) {
            m12050a(new f(interfaceC3795w9, c3762va));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11982a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo12001b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11983a(InterfaceC3641f.c cVar, InterfaceC3647l.a aVar) {
        m12050a(new a(aVar, cVar));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11984a(C3762va c3762va) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11985a(C3762va c3762va, Map<String, String> map, InterfaceC3761v9 interfaceC3761v9) {
        if (interfaceC3761v9 != null) {
            m12050a(new i(interfaceC3761v9, map));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11986a(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9) {
        if (interfaceC3795w9 != null) {
            m12050a(new h(interfaceC3795w9, c3762va));
        }
    }

    /* renamed from: a */
    public void m12050a(Runnable runnable) {
        C3523pg c3523pg = this.f11575a;
        if (c3523pg != null) {
            c3523pg.m11402c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11989a(String str, InterfaceC3795w9 interfaceC3795w9) {
        if (interfaceC3795w9 != null) {
            m12050a(new e(interfaceC3795w9, str));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11990a(String str, String str2, C3762va c3762va, InterfaceC3761v9 interfaceC3761v9) {
        if (interfaceC3761v9 != null) {
            interfaceC3761v9.mo8349a(C3419mh.e.Banner, c3762va.m12764h(), this.f11576b);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11991a(String str, String str2, C3762va c3762va, InterfaceC3795w9 interfaceC3795w9) {
        if (interfaceC3795w9 != null) {
            m12050a(new d(interfaceC3795w9, c3762va));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11992a(String str, String str2, C3762va c3762va, InterfaceC3829x9 interfaceC3829x9) {
        if (interfaceC3829x9 != null) {
            m12050a(new b(interfaceC3829x9, c3762va));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11993a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11994a(JSONObject jSONObject, InterfaceC3761v9 interfaceC3761v9) {
        if (interfaceC3761v9 != null) {
            m12050a(new j(interfaceC3761v9, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11995a(JSONObject jSONObject, InterfaceC3795w9 interfaceC3795w9) {
        if (interfaceC3795w9 != null) {
            m12050a(new g(interfaceC3795w9, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11996a(JSONObject jSONObject, InterfaceC3829x9 interfaceC3829x9) {
        if (interfaceC3829x9 != null) {
            m12050a(new c(interfaceC3829x9, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public boolean mo11997a(String str) {
        return false;
    }
}

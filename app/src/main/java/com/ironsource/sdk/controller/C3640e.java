package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.C2636aa;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.ironsource.C3144g9;
import com.ironsource.C3146gb;
import com.ironsource.C3198hs;
import com.ironsource.C3309l0;
import com.ironsource.C3419mh;
import com.ironsource.C3454nh;
import com.ironsource.C3489oh;
import com.ironsource.C3495on;
import com.ironsource.C3523pg;
import com.ironsource.C3545q3;
import com.ironsource.C3551q9;
import com.ironsource.C3565qn;
import com.ironsource.C3600rn;
import com.ironsource.C3601ro;
import com.ironsource.C3620s8;
import com.ironsource.C3680sx;
import com.ironsource.C3699th;
import com.ironsource.C3734uh;
import com.ironsource.C3762va;
import com.ironsource.C3796wa;
import com.ironsource.C3832xc;
import com.ironsource.C3897z9;
import com.ironsource.EnumC2935af;
import com.ironsource.HandlerC3798wc;
import com.ironsource.InterfaceC3761v9;
import com.ironsource.InterfaceC3795w9;
import com.ironsource.InterfaceC3829x9;
import com.ironsource.InterfaceC3868ye;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.InterfaceC3641f;
import com.ironsource.sdk.controller.InterfaceC3647l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.e */
/* loaded from: classes2.dex */
public class C3640e implements InterfaceC3638c, InterfaceC3647l {

    /* renamed from: b */
    private InterfaceC3647l f11462b;

    /* renamed from: d */
    private CountDownTimer f11464d;

    /* renamed from: g */
    private final C3523pg f11467g;

    /* renamed from: h */
    private final C3680sx f11468h;

    /* renamed from: k */
    private final C3601ro f11471k;

    /* renamed from: a */
    private final String f11461a = "e";

    /* renamed from: c */
    private C3419mh.b f11463c = C3419mh.b.None;

    /* renamed from: e */
    private final C3620s8 f11465e = new C3620s8("NativeCommandExecutor");

    /* renamed from: f */
    private final C3620s8 f11466f = new C3620s8("ControllerCommandsExecutor");

    /* renamed from: i */
    private final Map<String, InterfaceC3647l.a> f11469i = new HashMap();

    /* renamed from: j */
    private final Map<String, InterfaceC3647l.b> f11470j = new HashMap();

    /* renamed from: com.ironsource.sdk.controller.e$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11472a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3795w9 f11473b;

        public a(JSONObject jSONObject, InterfaceC3795w9 interfaceC3795w9) {
            this.f11472a = jSONObject;
            this.f11473b = interfaceC3795w9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11995a(this.f11472a, this.f11473b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3762va f11475a;

        /* renamed from: b */
        final /* synthetic */ Map f11476b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3795w9 f11477c;

        public b(C3762va c3762va, Map map, InterfaceC3795w9 interfaceC3795w9) {
            this.f11475a = c3762va;
            this.f11476b = map;
            this.f11477c = interfaceC3795w9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11986a(this.f11475a, this.f11476b, this.f11477c);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11479a;

        /* renamed from: b */
        final /* synthetic */ String f11480b;

        /* renamed from: c */
        final /* synthetic */ C3762va f11481c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC3761v9 f11482d;

        public c(String str, String str2, C3762va c3762va, InterfaceC3761v9 interfaceC3761v9) {
            this.f11479a = str;
            this.f11480b = str2;
            this.f11481c = c3762va;
            this.f11482d = interfaceC3761v9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11990a(this.f11479a, this.f11480b, this.f11481c, this.f11482d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11484a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3761v9 f11485b;

        public d(JSONObject jSONObject, InterfaceC3761v9 interfaceC3761v9) {
            this.f11484a = jSONObject;
            this.f11485b = interfaceC3761v9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11994a(this.f11484a, this.f11485b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3762va f11487a;

        public e(C3762va c3762va) {
            this.f11487a = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11984a(this.f11487a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3762va f11489a;

        public f(C3762va c3762va) {
            this.f11489a = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11999b(this.f11489a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3762va f11491a;

        /* renamed from: b */
        final /* synthetic */ Map f11492b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3761v9 f11493c;

        public g(C3762va c3762va, Map map, InterfaceC3761v9 interfaceC3761v9) {
            this.f11491a = c3762va;
            this.f11492b = map;
            this.f11493c = interfaceC3761v9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11985a(this.f11491a, this.f11492b, this.f11493c);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3647l.a f11495a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3641f.c f11496b;

        public h(InterfaceC3647l.a aVar, InterfaceC3641f.c cVar) {
            this.f11495a = aVar;
            this.f11496b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                if (this.f11495a != null) {
                    C3640e.this.f11469i.put(this.f11496b.m12023f(), this.f11495a);
                }
                C3640e.this.f11462b.mo11983a(this.f11496b, this.f11495a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$i */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11498a;

        public i(JSONObject jSONObject) {
            this.f11498a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo12001b(this.f11498a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.destroy();
                C3640e.this.f11462b = null;
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$k */
    public class k extends CountDownTimer {
        public k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.m12266i(C3640e.this.f11461a, "Global Controller Timer Finish");
            C3640e.this.m11973d(C3034d9.c.f7957k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.m12266i(C3640e.this.f11461a, "Global Controller Timer Tick " + j);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$l */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3640e.this.mo11934c();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$m */
    public class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11503a;

        /* renamed from: b */
        final /* synthetic */ String f11504b;

        public m(String str, String str2) {
            this.f11503a = str;
            this.f11504b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3640e c3640e = C3640e.this;
                c3640e.f11462b = c3640e.m11968b(c3640e.f11468h.m12319b(), C3640e.this.f11468h.m12321d(), C3640e.this.f11468h.m12323f(), C3640e.this.f11468h.m12322e(), C3640e.this.f11468h.m12324g(), C3640e.this.f11468h.m12320c(), this.f11503a, this.f11504b);
                C3640e.this.f11462b.mo11980a();
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                C3640e.this.m11973d(Log.getStackTraceString(th));
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$n */
    public class n extends CountDownTimer {
        public n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.m12266i(C3640e.this.f11461a, "Recovered Controller | Global Controller Timer Finish");
            C3640e.this.m11973d(C3034d9.c.f7957k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.m12266i(C3640e.this.f11461a, "Recovered Controller | Global Controller Timer Tick " + j);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$o */
    public class o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11507a;

        /* renamed from: b */
        final /* synthetic */ String f11508b;

        /* renamed from: c */
        final /* synthetic */ C3762va f11509c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC3829x9 f11510d;

        public o(String str, String str2, C3762va c3762va, InterfaceC3829x9 interfaceC3829x9) {
            this.f11507a = str;
            this.f11508b = str2;
            this.f11509c = c3762va;
            this.f11510d = interfaceC3829x9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11992a(this.f11507a, this.f11508b, this.f11509c, this.f11510d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$p */
    public class p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11512a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3829x9 f11513b;

        public p(JSONObject jSONObject, InterfaceC3829x9 interfaceC3829x9) {
            this.f11512a = jSONObject;
            this.f11513b = interfaceC3829x9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11996a(this.f11512a, this.f11513b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$q */
    public class q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11515a;

        /* renamed from: b */
        final /* synthetic */ String f11516b;

        /* renamed from: c */
        final /* synthetic */ C3762va f11517c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC3795w9 f11518d;

        public q(String str, String str2, C3762va c3762va, InterfaceC3795w9 interfaceC3795w9) {
            this.f11515a = str;
            this.f11516b = str2;
            this.f11517c = c3762va;
            this.f11518d = interfaceC3795w9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11991a(this.f11515a, this.f11516b, this.f11517c, this.f11518d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$r */
    public class r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11520a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3795w9 f11521b;

        public r(String str, InterfaceC3795w9 interfaceC3795w9) {
            this.f11520a = str;
            this.f11521b = interfaceC3795w9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo11989a(this.f11520a, this.f11521b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$s */
    public class s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3762va f11523a;

        /* renamed from: b */
        final /* synthetic */ Map f11524b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3795w9 f11525c;

        public s(C3762va c3762va, Map map, InterfaceC3795w9 interfaceC3795w9) {
            this.f11523a = c3762va;
            this.f11524b = map;
            this.f11525c = interfaceC3795w9;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3699th.m12428a(C3198hs.f8925j, new C3489oh().m11155a(C3037dc.f8267v, this.f11523a.m12762f()).m11155a(C3037dc.f8268w, C3734uh.m12677a(this.f11523a, C3419mh.e.Interstitial)).m11155a(C3037dc.f8269x, Boolean.valueOf(C3734uh.m12680a(this.f11523a))).m11155a(C3037dc.f8233I, Long.valueOf(C3309l0.f9291a.m9729b(this.f11523a.m12764h()))).m11156a());
            if (C3640e.this.f11462b != null) {
                C3640e.this.f11462b.mo12000b(this.f11523a, this.f11524b, this.f11525c);
            }
        }
    }

    public C3640e(Context context, C3144g9 c3144g9, C3796wa c3796wa, C3523pg c3523pg, int i2, JSONObject jSONObject, String str, String str2, C3601ro c3601ro) {
        this.f11471k = c3601ro;
        this.f11467g = c3523pg;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C3146gb c3146gbM8931a = C3146gb.m8931a(networkStorageDir, c3523pg, jSONObject);
        this.f11468h = new C3680sx(context, c3144g9, c3796wa, i2, c3146gbM8931a, networkStorageDir);
        m11961a(context, c3144g9, c3796wa, i2, c3146gbM8931a, networkStorageDir, str, str2);
    }

    /* renamed from: h */
    private InterfaceC3647l.a m11975h() {
        return new InterfaceC3647l.a() { // from class: com.ironsource.sdk.controller.OooO0OO
            @Override // com.ironsource.sdk.controller.InterfaceC3647l.a
            /* renamed from: a */
            public final void mo11066a(InterfaceC3641f.a aVar) {
                this.f28607OooO00o.m11965a(aVar);
            }
        };
    }

    /* renamed from: i */
    private InterfaceC3647l.b m11976i() {
        return new InterfaceC3647l.b() { // from class: com.ironsource.sdk.controller.OooO0O0
            @Override // com.ironsource.sdk.controller.InterfaceC3647l.b
            /* renamed from: a */
            public final void mo11067a(C3565qn c3565qn) {
                this.f28606OooO00o.m11963a(c3565qn);
            }
        };
    }

    /* renamed from: k */
    private void m11977k() {
        Logger.m12266i(this.f11461a, "handleReadyState");
        this.f11463c = C3419mh.b.Ready;
        CountDownTimer countDownTimer = this.f11464d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m11979m();
        this.f11466f.m11888c();
        this.f11466f.m11885a();
        InterfaceC3647l interfaceC3647l = this.f11462b;
        if (interfaceC3647l != null) {
            interfaceC3647l.mo12003e();
        }
    }

    /* renamed from: l */
    private boolean m11978l() {
        return C3419mh.b.Ready.equals(this.f11463c);
    }

    /* renamed from: m */
    private void m11979m() {
        this.f11468h.m12317a(true);
        InterfaceC3647l interfaceC3647l = this.f11462b;
        if (interfaceC3647l != null) {
            interfaceC3647l.mo11993a(this.f11468h.m12325i());
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    public void destroy() {
        Logger.m12266i(this.f11461a, "destroy controller");
        CountDownTimer countDownTimer = this.f11464d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C3620s8 c3620s8 = this.f11466f;
        if (c3620s8 != null) {
            c3620s8.m11887b();
        }
        this.f11464d = null;
        m11969b(new j());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    @Deprecated
    /* renamed from: e */
    public void mo12003e() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: f */
    public void mo12004f() {
        InterfaceC3647l interfaceC3647l;
        if (!m11978l() || (interfaceC3647l = this.f11462b) == null) {
            return;
        }
        interfaceC3647l.mo12004f();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: g */
    public C3419mh.c mo12005g() {
        InterfaceC3647l interfaceC3647l = this.f11462b;
        return interfaceC3647l != null ? interfaceC3647l.mo12005g() : C3419mh.c.None;
    }

    /* renamed from: j */
    public InterfaceC3647l m12006j() {
        return this.f11462b;
    }

    /* renamed from: b */
    public C3657v m11968b(Context context, C3144g9 c3144g9, C3796wa c3796wa, int i2, C3146gb c3146gb, String str, String str2, String str3) throws Throwable {
        C3699th.m12427a(C3198hs.f8918c);
        C3657v c3657v = new C3657v(context, c3796wa, c3144g9, this, this.f11467g, i2, c3146gb, str, m11975h(), m11976i(), str2, str3);
        C3832xc c3832xc = new C3832xc(context, c3146gb, new HandlerC3798wc(this.f11467g.m11395a()), new C3600rn(c3146gb.m8935a()));
        c3657v.m12202a(new C3656u(context));
        c3657v.m12200a(new C3650o(context));
        c3657v.m12201a(new C3652q(context));
        c3657v.m12198a(new C3644i(context));
        c3657v.m12197a(new C3636a(context));
        c3657v.m12199a(new C3645j(c3146gb.m8935a(), c3832xc));
        c3657v.m12196a(new C3545q3());
        c3657v.m12194a(new C2636aa(context, new C3897z9()));
        return c3657v;
    }

    /* renamed from: e */
    private void m11974e(String str) {
        IronSourceNetwork.updateInitFailed(new C3454nh(1001, str));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3638c
    /* renamed from: c */
    public void mo11934c() {
        Logger.m12266i(this.f11461a, "handleControllerReady ");
        this.f11471k.m11746a(mo12005g());
        if (C3419mh.c.Web.equals(mo12005g())) {
            C3699th.m12428a(C3198hs.f8920e, new C3489oh().m11155a(C3037dc.f8270y, String.valueOf(this.f11468h.m12326l())).m11156a());
            IronSourceNetwork.updateInitSucceeded();
        }
        m11977k();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: d */
    public void mo12002d() {
        InterfaceC3647l interfaceC3647l;
        if (!m11978l() || (interfaceC3647l = this.f11462b) == null) {
            return;
        }
        interfaceC3647l.mo12002d();
    }

    /* renamed from: c */
    public /* synthetic */ void m11971c(Context context, C3144g9 c3144g9, C3796wa c3796wa, int i2, C3146gb c3146gb, String str, String str2, String str3) {
        C3657v c3657vM11968b;
        try {
            c3657vM11968b = m11968b(context, c3144g9, c3796wa, i2, c3146gb, str, str2, str3);
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f11462b = c3657vM11968b;
            c3657vM11968b.mo11980a();
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            C3551q9.m11517d().m11519a(th3);
            m11973d(Log.getStackTraceString(th3));
        }
    }

    /* renamed from: d */
    public void m11973d(String str) {
        C3699th.m12428a(C3198hs.f8919d, new C3489oh().m11155a(C3037dc.f8225A, str).m11156a());
        this.f11463c = C3419mh.b.Loading;
        this.f11462b = new C3649n(str, this.f11467g);
        this.f11465e.m11888c();
        this.f11465e.m11885a();
        C3523pg c3523pg = this.f11467g;
        if (c3523pg != null) {
            c3523pg.m11402c(new l());
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3638c
    /* renamed from: b */
    public void mo11932b() {
        Logger.m12266i(this.f11461a, "handleControllerLoaded");
        this.f11463c = C3419mh.b.Loaded;
        this.f11465e.m11888c();
        this.f11465e.m11885a();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11980a() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo11998b(Context context) {
        InterfaceC3647l interfaceC3647l;
        if (!m11978l() || (interfaceC3647l = this.f11462b) == null) {
            return;
        }
        interfaceC3647l.mo11998b(context);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3638c
    /* renamed from: c */
    public void mo11935c(String str) {
        C3699th.m12428a(C3198hs.f8940y, new C3489oh().m11155a(C3037dc.f8270y, str).m11156a());
        CountDownTimer countDownTimer = this.f11464d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m11973d(str);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11981a(Activity activity) {
        this.f11462b.mo11981a(activity);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo11999b(C3762va c3762va) {
        this.f11466f.m11886a(new f(c3762va));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11982a(Context context) {
        InterfaceC3647l interfaceC3647l;
        if (!m11978l() || (interfaceC3647l = this.f11462b) == null) {
            return;
        }
        interfaceC3647l.mo11982a(context);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo12000b(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9) {
        this.f11466f.m11886a(new s(c3762va, map, interfaceC3795w9));
    }

    /* renamed from: a */
    private void m11961a(final Context context, final C3144g9 c3144g9, final C3796wa c3796wa, final int i2, final C3146gb c3146gb, final String str, final String str2, final String str3) {
        int iMo11375c = C3495on.m11199U().mo8685d().mo11375c();
        if (iMo11375c > 0) {
            C3699th.m12428a(C3198hs.f8915B, new C3489oh().m11155a(C3037dc.f8270y, String.valueOf(iMo11375c)).m11156a());
        }
        m11966a(new Runnable() { // from class: com.ironsource.sdk.controller.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                this.f28598OooOo0O.m11971c(context, c3144g9, c3796wa, i2, c3146gb, str, str2, str3);
            }
        }, iMo11375c);
        this.f11464d = new k(200000L, 1000L).start();
    }

    /* renamed from: b */
    private void m11969b(Runnable runnable) {
        m11966a(runnable, 0L);
    }

    /* renamed from: a */
    private void m11962a(C3419mh.e eVar, C3762va c3762va, String str, String str2) {
        Logger.m12266i(this.f11461a, "recoverWebController for product: " + eVar.toString());
        C3489oh c3489oh = new C3489oh();
        c3489oh.m11155a(C3037dc.f8268w, eVar.toString());
        c3489oh.m11155a(C3037dc.f8267v, c3762va.m12762f());
        C3699th.m12428a(C3198hs.f8917b, c3489oh.m11156a());
        this.f11468h.m12328n();
        destroy();
        m11969b(new m(str, str2));
        this.f11464d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3638c
    /* renamed from: b */
    public void mo11933b(String str) {
        Logger.m12266i(this.f11461a, "handleControllerFailed ");
        C3489oh c3489oh = new C3489oh();
        c3489oh.m11155a(C3037dc.f8225A, str);
        c3489oh.m11155a(C3037dc.f8270y, String.valueOf(this.f11468h.m12326l()));
        C3699th.m12428a(C3198hs.f8930o, c3489oh.m11156a());
        this.f11468h.m12317a(false);
        m11974e(str);
        if (this.f11464d != null) {
            Logger.m12266i(this.f11461a, "cancel timer mControllerReadyTimer");
            this.f11464d.cancel();
        }
        m11973d(str);
    }

    /* renamed from: a */
    public /* synthetic */ void m11963a(C3565qn c3565qn) {
        InterfaceC3647l.b bVar = this.f11470j.get(c3565qn.m11594d());
        if (bVar != null) {
            bVar.mo11067a(c3565qn);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo12001b(JSONObject jSONObject) {
        this.f11466f.m11886a(new i(jSONObject));
    }

    /* renamed from: a */
    public /* synthetic */ void m11965a(InterfaceC3641f.a aVar) {
        InterfaceC3647l.a aVarRemove = this.f11469i.remove(aVar.m12012c());
        if (aVarRemove != null) {
            aVarRemove.mo11066a(aVar);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11983a(InterfaceC3641f.c cVar, InterfaceC3647l.a aVar) {
        this.f11466f.m11886a(new h(aVar, cVar));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11984a(C3762va c3762va) {
        this.f11466f.m11886a(new e(c3762va));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11985a(C3762va c3762va, Map<String, String> map, InterfaceC3761v9 interfaceC3761v9) {
        this.f11466f.m11886a(new g(c3762va, map, interfaceC3761v9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11986a(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9) {
        this.f11466f.m11886a(new b(c3762va, map, interfaceC3795w9));
    }

    @Override // com.ironsource.InterfaceC3005cf
    /* renamed from: a */
    public void mo8125a(InterfaceC3868ye interfaceC3868ye) {
        C3198hs.a aVar;
        C3489oh c3489oh;
        StringBuilder sb;
        EnumC2935af enumC2935afMo13199b = interfaceC3868ye.mo13199b();
        if (enumC2935afMo13199b == EnumC2935af.SendEvent) {
            aVar = C3198hs.f8914A;
            c3489oh = new C3489oh();
            sb = new StringBuilder();
        } else {
            if (enumC2935afMo13199b != EnumC2935af.NativeController) {
                return;
            }
            C3649n c3649n = new C3649n(interfaceC3868ye.mo13198a(), this.f11467g);
            this.f11462b = c3649n;
            this.f11471k.m11746a(c3649n.mo12005g());
            C3699th.m12428a(C3198hs.f8919d, new C3489oh().m11155a(C3037dc.f8225A, interfaceC3868ye.mo13198a() + " : strategy: " + enumC2935afMo13199b).m11156a());
            aVar = C3198hs.f8914A;
            c3489oh = new C3489oh();
            sb = new StringBuilder();
        }
        sb.append(interfaceC3868ye.mo13198a());
        sb.append(" : strategy: ");
        sb.append(enumC2935afMo13199b);
        C3699th.m12428a(aVar, c3489oh.m11155a(C3037dc.f8270y, sb.toString()).m11156a());
    }

    /* renamed from: a */
    public void m11987a(Runnable runnable) {
        this.f11465e.m11886a(runnable);
    }

    /* renamed from: a */
    private void m11966a(Runnable runnable, long j2) {
        C3523pg c3523pg = this.f11467g;
        if (c3523pg != null) {
            c3523pg.m11405d(runnable, j2);
        } else {
            Logger.m12264e(this.f11461a, "mThreadManager = null");
        }
    }

    /* renamed from: a */
    public void m11988a(String str, InterfaceC3647l.b bVar) {
        this.f11470j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11989a(String str, InterfaceC3795w9 interfaceC3795w9) {
        Logger.m12266i(this.f11461a, "load interstitial");
        this.f11466f.m11886a(new r(str, interfaceC3795w9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11990a(String str, String str2, C3762va c3762va, InterfaceC3761v9 interfaceC3761v9) {
        if (this.f11468h.m12318a(mo12005g(), this.f11463c)) {
            m11962a(C3419mh.e.Banner, c3762va, str, str2);
        }
        this.f11466f.m11886a(new c(str, str2, c3762va, interfaceC3761v9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11991a(String str, String str2, C3762va c3762va, InterfaceC3795w9 interfaceC3795w9) {
        if (this.f11468h.m12318a(mo12005g(), this.f11463c)) {
            m11962a(C3419mh.e.Interstitial, c3762va, str, str2);
        }
        this.f11466f.m11886a(new q(str, str2, c3762va, interfaceC3795w9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11992a(String str, String str2, C3762va c3762va, InterfaceC3829x9 interfaceC3829x9) {
        if (this.f11468h.m12318a(mo12005g(), this.f11463c)) {
            m11962a(C3419mh.e.RewardedVideo, c3762va, str, str2);
        }
        this.f11466f.m11886a(new o(str, str2, c3762va, interfaceC3829x9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11993a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11994a(JSONObject jSONObject, InterfaceC3761v9 interfaceC3761v9) {
        this.f11466f.m11886a(new d(jSONObject, interfaceC3761v9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11995a(JSONObject jSONObject, InterfaceC3795w9 interfaceC3795w9) {
        this.f11466f.m11886a(new a(jSONObject, interfaceC3795w9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11996a(JSONObject jSONObject, InterfaceC3829x9 interfaceC3829x9) {
        this.f11466f.m11886a(new p(jSONObject, interfaceC3829x9));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public boolean mo11997a(String str) {
        if (this.f11462b == null || !m11978l()) {
            return false;
        }
        return this.f11462b.mo11997a(str);
    }
}

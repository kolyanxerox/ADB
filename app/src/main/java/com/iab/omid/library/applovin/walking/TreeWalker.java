package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.internal.C2490c;
import com.iab.omid.library.applovin.internal.C2497j;
import com.iab.omid.library.applovin.processor.C2499b;
import com.iab.omid.library.applovin.processor.InterfaceC2498a;
import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.utils.C2510f;
import com.iab.omid.library.applovin.utils.C2512h;
import com.iab.omid.library.applovin.walking.C2517a;
import com.iab.omid.library.applovin.walking.async.C2520c;
import com.iab.omid.library.applovin.weakreference.C2526a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements InterfaceC2498a.a {

    /* renamed from: i */
    private static TreeWalker f3539i = new TreeWalker();

    /* renamed from: j */
    private static Handler f3540j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private static Handler f3541k = null;

    /* renamed from: l */
    private static final Runnable f3542l = new RunnableC2515b();

    /* renamed from: m */
    private static final Runnable f3543m = new RunnableC2516c();

    /* renamed from: b */
    private int f3545b;

    /* renamed from: h */
    private long f3551h;

    /* renamed from: a */
    private List<TreeWalkerTimeLogger> f3544a = new ArrayList();

    /* renamed from: c */
    private boolean f3546c = false;

    /* renamed from: d */
    private final List<C2526a> f3547d = new ArrayList();

    /* renamed from: f */
    private C2517a f3549f = new C2517a();

    /* renamed from: e */
    private C2499b f3548e = new C2499b();

    /* renamed from: g */
    private C2524b f3550g = new C2524b(new C2520c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.TreeWalker$a */
    public class RunnableC2514a implements Runnable {
        public RunnableC2514a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f3550g.m4233b();
        }
    }

    /* renamed from: com.iab.omid.library.applovin.walking.TreeWalker$b */
    public class RunnableC2515b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().m4195l();
        }
    }

    /* renamed from: com.iab.omid.library.applovin.walking.TreeWalker$c */
    public class RunnableC2516c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f3541k != null) {
                TreeWalker.f3541k.post(TreeWalker.f3542l);
                TreeWalker.f3541k.postDelayed(TreeWalker.f3543m, 200L);
            }
        }
    }

    /* renamed from: d */
    private void m4191d() {
        m4183a(C2510f.m4157b() - this.f3551h);
    }

    /* renamed from: e */
    private void m4192e() {
        this.f3545b = 0;
        this.f3547d.clear();
        this.f3546c = false;
        Iterator<C2480a> it = C2490c.m4029c().m4030a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().m3990g()) {
                this.f3546c = true;
                break;
            }
        }
        this.f3551h = C2510f.m4157b();
    }

    public static TreeWalker getInstance() {
        return f3539i;
    }

    /* renamed from: i */
    private void m4193i() {
        if (f3541k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f3541k = handler;
            handler.post(f3542l);
            f3541k.postDelayed(f3543m, 200L);
        }
    }

    /* renamed from: k */
    private void m4194k() {
        Handler handler = f3541k;
        if (handler != null) {
            handler.removeCallbacks(f3543m);
            f3541k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m4195l() throws JSONException {
        m4192e();
        m4196f();
        m4191d();
        C2497j.m4084b().m4085a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f3544a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f3544a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    /* renamed from: f */
    public void m4196f() throws JSONException {
        TreeWalker treeWalker;
        this.f3549f.m4214e();
        long jM4157b = C2510f.m4157b();
        InterfaceC2498a interfaceC2498aM4091a = this.f3548e.m4091a();
        if (this.f3549f.m4208b().size() > 0) {
            Iterator<String> it = this.f3549f.m4208b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectMo4088a = interfaceC2498aM4091a.mo4088a(null);
                m4185a(next, this.f3549f.m4204a(next), jSONObjectMo4088a);
                C2507c.m4141b(jSONObjectMo4088a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f3550g.m4232a(jSONObjectMo4088a, hashSet, jM4157b);
            }
        }
        if (this.f3549f.m4210c().size() > 0) {
            JSONObject jSONObjectMo4088a2 = interfaceC2498aM4091a.mo4088a(null);
            treeWalker = this;
            treeWalker.m4184a(null, interfaceC2498aM4091a, jSONObjectMo4088a2, EnumC2525c.PARENT_VIEW, false);
            C2507c.m4141b(jSONObjectMo4088a2);
            treeWalker.f3550g.m4234b(jSONObjectMo4088a2, treeWalker.f3549f.m4210c(), jM4157b);
            if (treeWalker.f3546c) {
                Iterator<C2480a> it2 = C2490c.m4029c().m4030a().iterator();
                while (it2.hasNext()) {
                    it2.next().m3984a(treeWalker.f3547d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f3550g.m4233b();
        }
        treeWalker.f3549f.m4205a();
    }

    /* renamed from: g */
    public void m4197g() {
        m4194k();
    }

    /* renamed from: h */
    public void m4198h() {
        m4193i();
    }

    /* renamed from: j */
    public void m4199j() {
        m4197g();
        this.f3544a.clear();
        f3540j.post(new RunnableC2514a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f3544a.contains(treeWalkerTimeLogger)) {
            this.f3544a.remove(treeWalkerTimeLogger);
        }
    }

    /* renamed from: a */
    private void m4183a(long j) {
        if (this.f3544a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f3544a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f3545b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f3545b, j);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m4189b(View view, JSONObject jSONObject) throws JSONException {
        String strM4209c = this.f3549f.m4209c(view);
        if (strM4209c == null) {
            return false;
        }
        C2507c.m4136a(jSONObject, strM4209c);
        C2507c.m4135a(jSONObject, Boolean.valueOf(this.f3549f.m4215e(view)));
        C2507c.m4142b(jSONObject, Boolean.valueOf(this.f3549f.m4211c(strM4209c)));
        this.f3549f.m4213d();
        return true;
    }

    /* renamed from: a */
    private void m4184a(View view, InterfaceC2498a interfaceC2498a, JSONObject jSONObject, EnumC2525c enumC2525c, boolean z) {
        interfaceC2498a.mo4089a(view, jSONObject, this, enumC2525c == EnumC2525c.PARENT_VIEW, z);
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC2498a.a
    /* renamed from: a */
    public void mo4090a(View view, InterfaceC2498a interfaceC2498a, JSONObject jSONObject, boolean z) throws JSONException {
        EnumC2525c enumC2525cM4212d;
        TreeWalker treeWalker;
        if (C2512h.m4177f(view) && (enumC2525cM4212d = this.f3549f.m4212d(view)) != EnumC2525c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo4088a = interfaceC2498a.mo4088a(view);
            C2507c.m4138a(jSONObject, jSONObjectMo4088a);
            if (m4189b(view, jSONObjectMo4088a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m4186a(view, jSONObjectMo4088a);
                if (this.f3546c && enumC2525cM4212d == EnumC2525c.OBSTRUCTION_VIEW && !z2) {
                    this.f3547d.add(new C2526a(view));
                }
                treeWalker = this;
                treeWalker.m4184a(view, interfaceC2498a, jSONObjectMo4088a, enumC2525cM4212d, z2);
            }
            treeWalker.f3545b++;
        }
    }

    /* renamed from: a */
    private void m4185a(String str, View view, JSONObject jSONObject) throws JSONException {
        InterfaceC2498a interfaceC2498aM4092b = this.f3548e.m4092b();
        String strM4207b = this.f3549f.m4207b(str);
        if (strM4207b != null) {
            JSONObject jSONObjectMo4088a = interfaceC2498aM4092b.mo4088a(view);
            C2507c.m4136a(jSONObjectMo4088a, str);
            C2507c.m4143b(jSONObjectMo4088a, strM4207b);
            C2507c.m4138a(jSONObject, jSONObjectMo4088a);
        }
    }

    /* renamed from: a */
    private boolean m4186a(View view, JSONObject jSONObject) throws JSONException {
        C2517a.a aVarM4206b = this.f3549f.m4206b(view);
        if (aVarM4206b == null) {
            return false;
        }
        C2507c.m4134a(jSONObject, aVarM4206b);
        return true;
    }
}

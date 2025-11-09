package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.internal.C2541c;
import com.iab.omid.library.ironsrc.internal.C2548j;
import com.iab.omid.library.ironsrc.processor.C2550b;
import com.iab.omid.library.ironsrc.processor.InterfaceC2549a;
import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2561f;
import com.iab.omid.library.ironsrc.utils.C2563h;
import com.iab.omid.library.ironsrc.walking.C2568a;
import com.iab.omid.library.ironsrc.walking.async.C2571c;
import com.iab.omid.library.ironsrc.weakreference.C2577a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements InterfaceC2549a.a {

    /* renamed from: i */
    private static TreeWalker f3674i = new TreeWalker();

    /* renamed from: j */
    private static Handler f3675j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private static Handler f3676k = null;

    /* renamed from: l */
    private static final Runnable f3677l = new RunnableC2566b();

    /* renamed from: m */
    private static final Runnable f3678m = new RunnableC2567c();

    /* renamed from: b */
    private int f3680b;

    /* renamed from: h */
    private long f3686h;

    /* renamed from: a */
    private List<TreeWalkerTimeLogger> f3679a = new ArrayList();

    /* renamed from: c */
    private boolean f3681c = false;

    /* renamed from: d */
    private final List<C2577a> f3682d = new ArrayList();

    /* renamed from: f */
    private C2568a f3684f = new C2568a();

    /* renamed from: e */
    private C2550b f3683e = new C2550b();

    /* renamed from: g */
    private C2575b f3685g = new C2575b(new C2571c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.TreeWalker$a */
    public class RunnableC2565a implements Runnable {
        public RunnableC2565a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f3685g.m4486b();
        }
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.TreeWalker$b */
    public class RunnableC2566b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().m4448l();
        }
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.TreeWalker$c */
    public class RunnableC2567c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f3676k != null) {
                TreeWalker.f3676k.post(TreeWalker.f3677l);
                TreeWalker.f3676k.postDelayed(TreeWalker.f3678m, 200L);
            }
        }
    }

    /* renamed from: d */
    private void m4444d() {
        m4436a(C2561f.m4410b() - this.f3686h);
    }

    /* renamed from: e */
    private void m4445e() {
        this.f3680b = 0;
        this.f3682d.clear();
        this.f3681c = false;
        Iterator<C2531a> it = C2541c.m4282c().m4283a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().m4243e()) {
                this.f3681c = true;
                break;
            }
        }
        this.f3686h = C2561f.m4410b();
    }

    public static TreeWalker getInstance() {
        return f3674i;
    }

    /* renamed from: i */
    private void m4446i() {
        if (f3676k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f3676k = handler;
            handler.post(f3677l);
            f3676k.postDelayed(f3678m, 200L);
        }
    }

    /* renamed from: k */
    private void m4447k() {
        Handler handler = f3676k;
        if (handler != null) {
            handler.removeCallbacks(f3678m);
            f3676k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m4448l() throws JSONException {
        m4445e();
        m4449f();
        m4444d();
        C2548j.m4337b().m4338a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f3679a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f3679a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    /* renamed from: f */
    public void m4449f() throws JSONException {
        TreeWalker treeWalker;
        this.f3684f.m4467e();
        long jM4410b = C2561f.m4410b();
        InterfaceC2549a interfaceC2549aM4344a = this.f3683e.m4344a();
        if (this.f3684f.m4461b().size() > 0) {
            Iterator<String> it = this.f3684f.m4461b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectMo4341a = interfaceC2549aM4344a.mo4341a(null);
                m4438a(next, this.f3684f.m4457a(next), jSONObjectMo4341a);
                C2558c.m4394b(jSONObjectMo4341a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f3685g.m4485a(jSONObjectMo4341a, hashSet, jM4410b);
            }
        }
        if (this.f3684f.m4463c().size() > 0) {
            JSONObject jSONObjectMo4341a2 = interfaceC2549aM4344a.mo4341a(null);
            treeWalker = this;
            treeWalker.m4437a(null, interfaceC2549aM4344a, jSONObjectMo4341a2, EnumC2576c.PARENT_VIEW, false);
            C2558c.m4394b(jSONObjectMo4341a2);
            treeWalker.f3685g.m4487b(jSONObjectMo4341a2, treeWalker.f3684f.m4463c(), jM4410b);
            if (treeWalker.f3681c) {
                Iterator<C2531a> it2 = C2541c.m4282c().m4283a().iterator();
                while (it2.hasNext()) {
                    it2.next().m4239a(treeWalker.f3682d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f3685g.m4486b();
        }
        treeWalker.f3684f.m4458a();
    }

    /* renamed from: g */
    public void m4450g() {
        m4447k();
    }

    /* renamed from: h */
    public void m4451h() {
        m4446i();
    }

    /* renamed from: j */
    public void m4452j() {
        m4450g();
        this.f3679a.clear();
        f3675j.post(new RunnableC2565a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f3679a.contains(treeWalkerTimeLogger)) {
            this.f3679a.remove(treeWalkerTimeLogger);
        }
    }

    /* renamed from: a */
    private void m4436a(long j) {
        if (this.f3679a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f3679a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f3680b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f3680b, j);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m4442b(View view, JSONObject jSONObject) throws JSONException {
        String strM4462c = this.f3684f.m4462c(view);
        if (strM4462c == null) {
            return false;
        }
        C2558c.m4389a(jSONObject, strM4462c);
        C2558c.m4388a(jSONObject, Boolean.valueOf(this.f3684f.m4468e(view)));
        C2558c.m4395b(jSONObject, Boolean.valueOf(this.f3684f.m4464c(strM4462c)));
        this.f3684f.m4466d();
        return true;
    }

    /* renamed from: a */
    private void m4437a(View view, InterfaceC2549a interfaceC2549a, JSONObject jSONObject, EnumC2576c enumC2576c, boolean z) {
        interfaceC2549a.mo4342a(view, jSONObject, this, enumC2576c == EnumC2576c.PARENT_VIEW, z);
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC2549a.a
    /* renamed from: a */
    public void mo4343a(View view, InterfaceC2549a interfaceC2549a, JSONObject jSONObject, boolean z) throws JSONException {
        EnumC2576c enumC2576cM4465d;
        TreeWalker treeWalker;
        if (C2563h.m4430f(view) && (enumC2576cM4465d = this.f3684f.m4465d(view)) != EnumC2576c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo4341a = interfaceC2549a.mo4341a(view);
            C2558c.m4391a(jSONObject, jSONObjectMo4341a);
            if (m4442b(view, jSONObjectMo4341a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m4439a(view, jSONObjectMo4341a);
                if (this.f3681c && enumC2576cM4465d == EnumC2576c.OBSTRUCTION_VIEW && !z2) {
                    this.f3682d.add(new C2577a(view));
                }
                treeWalker = this;
                treeWalker.m4437a(view, interfaceC2549a, jSONObjectMo4341a, enumC2576cM4465d, z2);
            }
            treeWalker.f3680b++;
        }
    }

    /* renamed from: a */
    private void m4438a(String str, View view, JSONObject jSONObject) throws JSONException {
        InterfaceC2549a interfaceC2549aM4345b = this.f3683e.m4345b();
        String strM4460b = this.f3684f.m4460b(str);
        if (strM4460b != null) {
            JSONObject jSONObjectMo4341a = interfaceC2549aM4345b.mo4341a(view);
            C2558c.m4389a(jSONObjectMo4341a, str);
            C2558c.m4396b(jSONObjectMo4341a, strM4460b);
            C2558c.m4391a(jSONObject, jSONObjectMo4341a);
        }
    }

    /* renamed from: a */
    private boolean m4439a(View view, JSONObject jSONObject) throws JSONException {
        C2568a.a aVarM4459b = this.f3684f.m4459b(view);
        if (aVarM4459b == null) {
            return false;
        }
        C2558c.m4387a(jSONObject, aVarM4459b);
        return true;
    }
}

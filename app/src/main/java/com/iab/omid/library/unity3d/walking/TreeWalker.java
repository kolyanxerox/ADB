package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.internal.C2590c;
import com.iab.omid.library.unity3d.processor.C2597b;
import com.iab.omid.library.unity3d.processor.InterfaceC2596a;
import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.utils.C2608f;
import com.iab.omid.library.unity3d.utils.C2610h;
import com.iab.omid.library.unity3d.walking.C2614a;
import com.iab.omid.library.unity3d.walking.async.C2617c;
import com.iab.omid.library.unity3d.weakreference.C2623a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements InterfaceC2596a.a {

    /* renamed from: i */
    private static TreeWalker f3803i = new TreeWalker();

    /* renamed from: j */
    private static Handler f3804j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private static Handler f3805k = null;

    /* renamed from: l */
    private static final Runnable f3806l = new RunnableC2612b();

    /* renamed from: m */
    private static final Runnable f3807m = new RunnableC2613c();

    /* renamed from: b */
    private int f3809b;

    /* renamed from: h */
    private long f3815h;

    /* renamed from: a */
    private List<TreeWalkerTimeLogger> f3808a = new ArrayList();

    /* renamed from: c */
    private boolean f3810c = false;

    /* renamed from: d */
    private final List<C2623a> f3811d = new ArrayList();

    /* renamed from: f */
    private C2614a f3813f = new C2614a();

    /* renamed from: e */
    private C2597b f3812e = new C2597b();

    /* renamed from: g */
    private C2621b f3814g = new C2621b(new C2617c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: com.iab.omid.library.unity3d.walking.TreeWalker$a */
    public class RunnableC2611a implements Runnable {
        public RunnableC2611a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f3814g.m4720b();
        }
    }

    /* renamed from: com.iab.omid.library.unity3d.walking.TreeWalker$b */
    public class RunnableC2612b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().m4683l();
        }
    }

    /* renamed from: com.iab.omid.library.unity3d.walking.TreeWalker$c */
    public class RunnableC2613c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f3805k != null) {
                TreeWalker.f3805k.post(TreeWalker.f3806l);
                TreeWalker.f3805k.postDelayed(TreeWalker.f3807m, 200L);
            }
        }
    }

    /* renamed from: d */
    private void m4679d() {
        m4671a(C2608f.m4649b() - this.f3815h);
    }

    /* renamed from: e */
    private void m4680e() {
        this.f3809b = 0;
        this.f3811d.clear();
        this.f3810c = false;
        Iterator<C2580a> it = C2590c.m4538c().m4539a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().m4499e()) {
                this.f3810c = true;
                break;
            }
        }
        this.f3815h = C2608f.m4649b();
    }

    public static TreeWalker getInstance() {
        return f3803i;
    }

    /* renamed from: i */
    private void m4681i() {
        if (f3805k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f3805k = handler;
            handler.post(f3806l);
            f3805k.postDelayed(f3807m, 200L);
        }
    }

    /* renamed from: k */
    private void m4682k() {
        Handler handler = f3805k;
        if (handler != null) {
            handler.removeCallbacks(f3807m);
            f3805k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m4683l() throws JSONException {
        m4680e();
        m4684f();
        m4679d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f3808a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f3808a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    /* renamed from: f */
    public void m4684f() throws JSONException {
        TreeWalker treeWalker;
        this.f3813f.m4701e();
        long jM4649b = C2608f.m4649b();
        InterfaceC2596a interfaceC2596aM4586a = this.f3812e.m4586a();
        if (this.f3813f.m4695b().size() > 0) {
            Iterator<String> it = this.f3813f.m4695b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectMo4583a = interfaceC2596aM4586a.mo4583a(null);
                m4673a(next, this.f3813f.m4692a(next), jSONObjectMo4583a);
                C2605c.m4635b(jSONObjectMo4583a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f3814g.m4719a(jSONObjectMo4583a, hashSet, jM4649b);
            }
        }
        if (this.f3813f.m4697c().size() > 0) {
            JSONObject jSONObjectMo4583a2 = interfaceC2596aM4586a.mo4583a(null);
            treeWalker = this;
            treeWalker.m4672a(null, interfaceC2596aM4586a, jSONObjectMo4583a2, EnumC2622c.PARENT_VIEW, false);
            C2605c.m4635b(jSONObjectMo4583a2);
            treeWalker.f3814g.m4721b(jSONObjectMo4583a2, treeWalker.f3813f.m4697c(), jM4649b);
            if (treeWalker.f3810c) {
                Iterator<C2580a> it2 = C2590c.m4538c().m4539a().iterator();
                while (it2.hasNext()) {
                    it2.next().m4495a(treeWalker.f3811d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f3814g.m4720b();
        }
        treeWalker.f3813f.m4693a();
    }

    /* renamed from: g */
    public void m4685g() {
        m4682k();
    }

    /* renamed from: h */
    public void m4686h() {
        m4681i();
    }

    /* renamed from: j */
    public void m4687j() {
        m4685g();
        this.f3808a.clear();
        f3804j.post(new RunnableC2611a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f3808a.contains(treeWalkerTimeLogger)) {
            this.f3808a.remove(treeWalkerTimeLogger);
        }
    }

    /* renamed from: a */
    private void m4671a(long j) {
        if (this.f3808a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f3808a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f3809b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f3809b, j);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m4677b(View view, JSONObject jSONObject) throws JSONException {
        String strM4698d = this.f3813f.m4698d(view);
        if (strM4698d == null) {
            return false;
        }
        C2605c.m4630a(jSONObject, strM4698d);
        C2605c.m4629a(jSONObject, Boolean.valueOf(this.f3813f.m4702f(view)));
        this.f3813f.m4699d();
        return true;
    }

    /* renamed from: a */
    private void m4672a(View view, InterfaceC2596a interfaceC2596a, JSONObject jSONObject, EnumC2622c enumC2622c, boolean z) {
        interfaceC2596a.mo4584a(view, jSONObject, this, enumC2622c == EnumC2622c.PARENT_VIEW, z);
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC2596a.a
    /* renamed from: a */
    public void mo4585a(View view, InterfaceC2596a interfaceC2596a, JSONObject jSONObject, boolean z) throws JSONException {
        EnumC2622c enumC2622cM4700e;
        TreeWalker treeWalker;
        if (C2610h.m4667d(view) && (enumC2622cM4700e = this.f3813f.m4700e(view)) != EnumC2622c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo4583a = interfaceC2596a.mo4583a(view);
            C2605c.m4632a(jSONObject, jSONObjectMo4583a);
            if (m4677b(view, jSONObjectMo4583a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m4674a(view, jSONObjectMo4583a);
                if (this.f3810c && enumC2622cM4700e == EnumC2622c.OBSTRUCTION_VIEW && !z2) {
                    this.f3811d.add(new C2623a(view));
                }
                treeWalker = this;
                treeWalker.m4672a(view, interfaceC2596a, jSONObjectMo4583a, enumC2622cM4700e, z2);
            }
            treeWalker.f3809b++;
        }
    }

    /* renamed from: a */
    private void m4673a(String str, View view, JSONObject jSONObject) throws JSONException {
        InterfaceC2596a interfaceC2596aM4587b = this.f3812e.m4587b();
        String strM4694b = this.f3813f.m4694b(str);
        if (strM4694b != null) {
            JSONObject jSONObjectMo4583a = interfaceC2596aM4587b.mo4583a(view);
            C2605c.m4630a(jSONObjectMo4583a, str);
            C2605c.m4636b(jSONObjectMo4583a, strM4694b);
            C2605c.m4632a(jSONObject, jSONObjectMo4583a);
        }
    }

    /* renamed from: a */
    private boolean m4674a(View view, JSONObject jSONObject) throws JSONException {
        C2614a.a aVarM4696c = this.f3813f.m4696c(view);
        if (aVarM4696c == null) {
            return false;
        }
        C2605c.m4628a(jSONObject, aVarM4696c);
        return true;
    }
}

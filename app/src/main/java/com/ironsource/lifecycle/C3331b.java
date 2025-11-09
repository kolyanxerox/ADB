package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC3772vk;
import com.ironsource.InterfaceC3737uk;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.FragmentC3330a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.lifecycle.b */
/* loaded from: classes2.dex */
public class C3331b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m */
    private static final C3331b f9374m = new C3331b();

    /* renamed from: n */
    private static AtomicBoolean f9375n = new AtomicBoolean(false);

    /* renamed from: o */
    static final long f9376o = 700;

    /* renamed from: g */
    private final Runnable f9383g;

    /* renamed from: h */
    private final Runnable f9384h;

    /* renamed from: i */
    private final Runnable f9385i;

    /* renamed from: j */
    private final Runnable f9386j;

    /* renamed from: k */
    private final Runnable f9387k;

    /* renamed from: a */
    private int f9377a = 0;

    /* renamed from: b */
    private int f9378b = 0;

    /* renamed from: c */
    private boolean f9379c = true;

    /* renamed from: d */
    private boolean f9380d = true;

    /* renamed from: e */
    private EnumC3772vk f9381e = EnumC3772vk.NONE;

    /* renamed from: f */
    private final List<InterfaceC3737uk> f9382f = new CopyOnWriteArrayList();

    /* renamed from: l */
    private final FragmentC3330a.a f9388l = new a();

    /* renamed from: com.ironsource.lifecycle.b$a */
    public class a implements FragmentC3330a.a {
        public a() {
        }

        @Override // com.ironsource.lifecycle.FragmentC3330a.a
        /* renamed from: a */
        public void mo9795a(Activity activity) {
            C3331b.this.m9811c(activity);
        }

        @Override // com.ironsource.lifecycle.FragmentC3330a.a
        /* renamed from: b */
        public void mo9796b(Activity activity) {
        }

        @Override // com.ironsource.lifecycle.FragmentC3330a.a
        public void onResume(Activity activity) {
            C3331b.this.m9808b(activity);
        }
    }

    public C3331b() {
        final int i = 0;
        this.f9383g = new Runnable(this) { // from class: com.ironsource.lifecycle.OooO00o

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C3331b f28490OooOo0o;

            {
                this.f28490OooOo0o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f28490OooOo0o.m9800f();
                        break;
                    case 1:
                        this.f28490OooOo0o.m9801g();
                        break;
                    case 2:
                        this.f28490OooOo0o.m9802h();
                        break;
                    case 3:
                        this.f28490OooOo0o.m9803i();
                        break;
                    default:
                        this.f28490OooOo0o.m9804j();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f9384h = new Runnable(this) { // from class: com.ironsource.lifecycle.OooO00o

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C3331b f28490OooOo0o;

            {
                this.f28490OooOo0o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f28490OooOo0o.m9800f();
                        break;
                    case 1:
                        this.f28490OooOo0o.m9801g();
                        break;
                    case 2:
                        this.f28490OooOo0o.m9802h();
                        break;
                    case 3:
                        this.f28490OooOo0o.m9803i();
                        break;
                    default:
                        this.f28490OooOo0o.m9804j();
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f9385i = new Runnable(this) { // from class: com.ironsource.lifecycle.OooO00o

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C3331b f28490OooOo0o;

            {
                this.f28490OooOo0o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f28490OooOo0o.m9800f();
                        break;
                    case 1:
                        this.f28490OooOo0o.m9801g();
                        break;
                    case 2:
                        this.f28490OooOo0o.m9802h();
                        break;
                    case 3:
                        this.f28490OooOo0o.m9803i();
                        break;
                    default:
                        this.f28490OooOo0o.m9804j();
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f9386j = new Runnable(this) { // from class: com.ironsource.lifecycle.OooO00o

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C3331b f28490OooOo0o;

            {
                this.f28490OooOo0o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f28490OooOo0o.m9800f();
                        break;
                    case 1:
                        this.f28490OooOo0o.m9801g();
                        break;
                    case 2:
                        this.f28490OooOo0o.m9802h();
                        break;
                    case 3:
                        this.f28490OooOo0o.m9803i();
                        break;
                    default:
                        this.f28490OooOo0o.m9804j();
                        break;
                }
            }
        };
        final int i5 = 4;
        this.f9387k = new Runnable(this) { // from class: com.ironsource.lifecycle.OooO00o

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C3331b f28490OooOo0o;

            {
                this.f28490OooOo0o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f28490OooOo0o.m9800f();
                        break;
                    case 1:
                        this.f28490OooOo0o.m9801g();
                        break;
                    case 2:
                        this.f28490OooOo0o.m9802h();
                        break;
                    case 3:
                        this.f28490OooOo0o.m9803i();
                        break;
                    default:
                        this.f28490OooOo0o.m9804j();
                        break;
                }
            }
        };
    }

    /* renamed from: a */
    private void m9797a() {
        if (this.f9378b == 0) {
            this.f9379c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f9384h);
            this.f9381e = EnumC3772vk.PAUSED;
        }
    }

    /* renamed from: b */
    private void m9798b() {
        if (this.f9377a == 0 && this.f9379c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f9385i);
            this.f9380d = true;
            this.f9381e = EnumC3772vk.STOPPED;
        }
    }

    /* renamed from: d */
    public static C3331b m9799d() {
        return f9374m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m9800f() {
        m9797a();
        m9798b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m9801g() {
        Iterator<InterfaceC3737uk> it = this.f9382f.iterator();
        while (it.hasNext()) {
            it.next().mo4893d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m9802h() {
        Iterator<InterfaceC3737uk> it = this.f9382f.iterator();
        while (it.hasNext()) {
            it.next().mo4891b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m9803i() {
        Iterator<InterfaceC3737uk> it = this.f9382f.iterator();
        while (it.hasNext()) {
            it.next().mo4890a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m9804j() {
        Iterator<InterfaceC3737uk> it = this.f9382f.iterator();
        while (it.hasNext()) {
            it.next().mo4892c();
        }
    }

    /* renamed from: c */
    public EnumC3772vk m9810c() {
        return this.f9381e;
    }

    /* renamed from: e */
    public boolean m9813e() {
        return this.f9381e == EnumC3772vk.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        FragmentC3330a.m9791b(activity);
        FragmentC3330a fragmentC3330aM9789a = FragmentC3330a.m9789a(activity);
        if (fragmentC3330aM9789a != null) {
            fragmentC3330aM9789a.m9794d(this.f9388l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m9805a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m9812d(activity);
    }

    /* renamed from: a */
    public void m9805a(Activity activity) {
        int i = this.f9378b - 1;
        this.f9378b = i;
        if (i == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f9383g, 700L);
        }
    }

    /* renamed from: b */
    public void m9808b(Activity activity) {
        int i = this.f9378b + 1;
        this.f9378b = i;
        if (i == 1) {
            if (!this.f9379c) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f9383g);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f9386j);
            this.f9379c = false;
            this.f9381e = EnumC3772vk.RESUMED;
        }
    }

    /* renamed from: c */
    public void m9811c(Activity activity) {
        int i = this.f9377a + 1;
        this.f9377a = i;
        if (i == 1 && this.f9380d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f9387k);
            this.f9380d = false;
            this.f9381e = EnumC3772vk.STARTED;
        }
    }

    /* renamed from: d */
    public void m9812d(Activity activity) {
        this.f9377a--;
        m9798b();
    }

    /* renamed from: a */
    public void m9806a(Context context) {
        Application application;
        if (!f9375n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: b */
    public void m9809b(InterfaceC3737uk interfaceC3737uk) {
        if (this.f9382f.contains(interfaceC3737uk)) {
            this.f9382f.remove(interfaceC3737uk);
        }
    }

    /* renamed from: a */
    public void m9807a(InterfaceC3737uk interfaceC3737uk) {
        if (!IronsourceLifecycleProvider.m9787a() || interfaceC3737uk == null || this.f9382f.contains(interfaceC3737uk)) {
            return;
        }
        this.f9382f.add(interfaceC3737uk);
    }
}

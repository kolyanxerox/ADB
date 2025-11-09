package com.ironsource;

import com.ironsource.InterfaceC3768vg;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.s5 */
/* loaded from: classes2.dex */
public class C3617s5 extends InterfaceC3768vg.a<ISDemandOnlyBannerListener> {

    /* renamed from: com.ironsource.s5$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11290a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f11291b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyBannerListener f11292c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f11290a = str;
            this.f11291b = ironSourceError;
            this.f11292c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3617s5.this.m12782a(this.f11290a, "onBannerAdLoadFailed() error = " + this.f11291b.getErrorMessage());
            this.f11292c.onBannerAdLoadFailed(this.f11290a, this.f11291b);
        }
    }

    /* renamed from: com.ironsource.s5$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11294a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f11295b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f11294a = str;
            this.f11295b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3617s5.this.m12782a(this.f11294a, "onBannerAdLoaded()");
            this.f11295b.onBannerAdLoaded(this.f11294a);
        }
    }

    /* renamed from: com.ironsource.s5$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11297a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f11298b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f11297a = str;
            this.f11298b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3617s5.this.m12782a(this.f11297a, "onBannerAdShown()");
            this.f11298b.onBannerAdShown(this.f11297a);
        }
    }

    /* renamed from: com.ironsource.s5$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11300a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f11301b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f11300a = str;
            this.f11301b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3617s5.this.m12782a(this.f11300a, "onBannerAdClicked()");
            this.f11301b.onBannerAdClicked(this.f11300a);
        }
    }

    /* renamed from: com.ironsource.s5$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11303a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f11304b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f11303a = str;
            this.f11304b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3617s5.this.m12782a(this.f11303a, "onBannerAdLeftApplication()");
            this.f11304b.onBannerAdLeftApplication(this.f11303a);
        }
    }

    /* renamed from: a */
    public void m11831a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM12780a = m12780a();
        m12781a(new d(str, iSDemandOnlyBannerListenerM12780a), iSDemandOnlyBannerListenerM12780a != null);
    }

    /* renamed from: b */
    public void m11833b(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM12780a = m12780a();
        m12781a(new e(str, iSDemandOnlyBannerListenerM12780a), iSDemandOnlyBannerListenerM12780a != null);
    }

    /* renamed from: c */
    public void m11834c(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM12780a = m12780a();
        m12781a(new b(str, iSDemandOnlyBannerListenerM12780a), iSDemandOnlyBannerListenerM12780a != null);
    }

    /* renamed from: d */
    public void m11835d(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM12780a = m12780a();
        m12781a(new c(str, iSDemandOnlyBannerListenerM12780a), iSDemandOnlyBannerListenerM12780a != null);
    }

    /* renamed from: a */
    public void m11832a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM12780a = m12780a();
        m12781a(new a(str, ironSourceError, iSDemandOnlyBannerListenerM12780a), iSDemandOnlyBannerListenerM12780a != null);
    }
}

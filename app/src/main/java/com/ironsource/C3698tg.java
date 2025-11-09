package com.ironsource;

import com.ironsource.InterfaceC3768vg;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.tg */
/* loaded from: classes2.dex */
public class C3698tg extends InterfaceC3768vg.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* renamed from: com.ironsource.tg$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12052a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f12053b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f12052a = str;
            this.f12053b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3698tg.this.m12782a(this.f12052a, "onInterstitialAdReady()");
            this.f12053b.onInterstitialAdReady(this.f12052a);
        }
    }

    /* renamed from: com.ironsource.tg$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12055a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f12056b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyInterstitialListener f12057c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f12055a = str;
            this.f12056b = ironSourceError;
            this.f12057c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3698tg.this.m12782a(this.f12055a, "onInterstitialAdLoadFailed() error = " + this.f12056b.getErrorMessage());
            this.f12057c.onInterstitialAdLoadFailed(this.f12055a, this.f12056b);
        }
    }

    /* renamed from: com.ironsource.tg$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12059a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f12060b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f12059a = str;
            this.f12060b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3698tg.this.m12782a(this.f12059a, "onInterstitialAdOpened()");
            this.f12060b.onInterstitialAdOpened(this.f12059a);
        }
    }

    /* renamed from: com.ironsource.tg$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12062a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f12063b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyInterstitialListener f12064c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f12062a = str;
            this.f12063b = ironSourceError;
            this.f12064c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3698tg.this.m12782a(this.f12062a, "onInterstitialAdShowFailed() error = " + this.f12063b.getErrorMessage());
            this.f12064c.onInterstitialAdShowFailed(this.f12062a, this.f12063b);
        }
    }

    /* renamed from: com.ironsource.tg$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12066a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f12067b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f12066a = str;
            this.f12067b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3698tg.this.m12782a(this.f12066a, "onInterstitialAdClicked()");
            this.f12067b.onInterstitialAdClicked(this.f12066a);
        }
    }

    /* renamed from: com.ironsource.tg$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12069a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f12070b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f12069a = str;
            this.f12070b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3698tg.this.m12782a(this.f12069a, "onInterstitialAdClosed()");
            this.f12070b.onInterstitialAdClosed(this.f12069a);
        }
    }

    public C3698tg() {
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM12780a = m12780a();
        m12781a(new e(str, iSDemandOnlyInterstitialListenerM12780a), iSDemandOnlyInterstitialListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM12780a = m12780a();
        m12781a(new f(str, iSDemandOnlyInterstitialListenerM12780a), iSDemandOnlyInterstitialListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM12780a = m12780a();
        m12781a(new b(str, ironSourceError, iSDemandOnlyInterstitialListenerM12780a), iSDemandOnlyInterstitialListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM12780a = m12780a();
        m12781a(new c(str, iSDemandOnlyInterstitialListenerM12780a), iSDemandOnlyInterstitialListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM12780a = m12780a();
        m12781a(new a(str, iSDemandOnlyInterstitialListenerM12780a), iSDemandOnlyInterstitialListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM12780a = m12780a();
        m12781a(new d(str, ironSourceError, iSDemandOnlyInterstitialListenerM12780a), iSDemandOnlyInterstitialListenerM12780a != null);
    }

    public C3698tg(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        m12783b(iSDemandOnlyInterstitialListener);
    }
}

package com.ironsource;

import com.ironsource.InterfaceC3768vg;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.wg */
/* loaded from: classes2.dex */
public class C3802wg extends InterfaceC3768vg.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* renamed from: com.ironsource.wg$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12456a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f12457b;

        public a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f12456a = str;
            this.f12457b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3802wg.this.m12782a(this.f12456a, "onRewardedVideoAdLoadSuccess()");
            this.f12457b.onRewardedVideoAdLoadSuccess(this.f12456a);
        }
    }

    /* renamed from: com.ironsource.wg$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12459a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f12460b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f12461c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f12459a = str;
            this.f12460b = ironSourceError;
            this.f12461c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3802wg.this.m12782a(this.f12459a, "onRewardedVideoAdLoadFailed() error = " + this.f12460b.getErrorMessage());
            this.f12461c.onRewardedVideoAdLoadFailed(this.f12459a, this.f12460b);
        }
    }

    /* renamed from: com.ironsource.wg$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12463a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f12464b;

        public c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f12463a = str;
            this.f12464b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3802wg.this.m12782a(this.f12463a, "onRewardedVideoAdOpened()");
            this.f12464b.onRewardedVideoAdOpened(this.f12463a);
        }
    }

    /* renamed from: com.ironsource.wg$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12466a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f12467b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f12468c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f12466a = str;
            this.f12467b = ironSourceError;
            this.f12468c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3802wg.this.m12782a(this.f12466a, "onRewardedVideoAdShowFailed() error = " + this.f12467b.getErrorMessage());
            this.f12468c.onRewardedVideoAdShowFailed(this.f12466a, this.f12467b);
        }
    }

    /* renamed from: com.ironsource.wg$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12470a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f12471b;

        public e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f12470a = str;
            this.f12471b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3802wg.this.m12782a(this.f12470a, "onRewardedVideoAdClicked()");
            this.f12471b.onRewardedVideoAdClicked(this.f12470a);
        }
    }

    /* renamed from: com.ironsource.wg$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12473a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f12474b;

        public f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f12473a = str;
            this.f12474b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3802wg.this.m12782a(this.f12473a, "onRewardedVideoAdRewarded()");
            this.f12474b.onRewardedVideoAdRewarded(this.f12473a);
        }
    }

    /* renamed from: com.ironsource.wg$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f12476a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f12477b;

        public g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f12476a = str;
            this.f12477b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3802wg.this.m12782a(this.f12476a, "onRewardedVideoAdClosed()");
            this.f12477b.onRewardedVideoAdClosed(this.f12476a);
        }
    }

    public C3802wg() {
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM12780a = m12780a();
        m12781a(new e(str, iSDemandOnlyRewardedVideoListenerM12780a), iSDemandOnlyRewardedVideoListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM12780a = m12780a();
        m12781a(new g(str, iSDemandOnlyRewardedVideoListenerM12780a), iSDemandOnlyRewardedVideoListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM12780a = m12780a();
        m12781a(new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerM12780a), iSDemandOnlyRewardedVideoListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM12780a = m12780a();
        m12781a(new a(str, iSDemandOnlyRewardedVideoListenerM12780a), iSDemandOnlyRewardedVideoListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM12780a = m12780a();
        m12781a(new c(str, iSDemandOnlyRewardedVideoListenerM12780a), iSDemandOnlyRewardedVideoListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM12780a = m12780a();
        m12781a(new f(str, iSDemandOnlyRewardedVideoListenerM12780a), iSDemandOnlyRewardedVideoListenerM12780a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM12780a = m12780a();
        m12781a(new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerM12780a), iSDemandOnlyRewardedVideoListenerM12780a != null);
    }

    public C3802wg(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        m12783b(iSDemandOnlyRewardedVideoListener);
    }
}

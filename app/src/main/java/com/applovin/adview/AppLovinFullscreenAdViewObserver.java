package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.AbstractC1265v1;
import com.applovin.impl.C1093m2;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a */
    private final Lifecycle f151a;

    /* renamed from: b */
    private C1093m2 f152b;

    /* renamed from: c */
    private final AtomicBoolean f153c = new AtomicBoolean(true);

    /* renamed from: d */
    private AbstractC1265v1 f154d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, C1093m2 c1093m2) {
        this.f151a = lifecycle;
        this.f152b = c1093m2;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f151a.removeObserver(this);
        C1093m2 c1093m2 = this.f152b;
        if (c1093m2 != null) {
            c1093m2.m1466a();
            this.f152b = null;
        }
        AbstractC1265v1 abstractC1265v1 = this.f154d;
        if (abstractC1265v1 != null) {
            abstractC1265v1.mo3462a("lifecycle_on_destroy");
            this.f154d.mo3485q();
            this.f154d = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        AbstractC1265v1 abstractC1265v1 = this.f154d;
        if (abstractC1265v1 != null) {
            abstractC1265v1.mo3486r();
            this.f154d.mo3489u();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        AbstractC1265v1 abstractC1265v1;
        if (this.f153c.getAndSet(false) || (abstractC1265v1 = this.f154d) == null) {
            return;
        }
        abstractC1265v1.mo3487s();
        this.f154d.mo3467b(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        AbstractC1265v1 abstractC1265v1 = this.f154d;
        if (abstractC1265v1 != null) {
            abstractC1265v1.m3488t();
        }
    }

    public void setPresenter(AbstractC1265v1 abstractC1265v1) {
        this.f154d = abstractC1265v1;
    }
}

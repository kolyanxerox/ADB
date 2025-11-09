package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C3617s5;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes2.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a */
    private View f9646a;

    /* renamed from: b */
    private ISBannerSize f9647b;

    /* renamed from: c */
    private String f9648c;

    /* renamed from: d */
    private Activity f9649d;

    /* renamed from: e */
    private boolean f9650e;

    /* renamed from: f */
    private C3617s5 f9651f;

    /* renamed from: com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout$a */
    public class RunnableC3369a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f9652a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f9653b;

        public RunnableC3369a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f9652a = view;
            this.f9653b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f9652a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f9652a);
            }
            ISDemandOnlyBannerLayout.this.f9646a = this.f9652a;
            ISDemandOnlyBannerLayout.this.addView(this.f9652a, 0, this.f9653b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f9650e = false;
        this.f9649d = activity;
        this.f9647b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f9651f = new C3617s5();
    }

    public Activity getActivity() {
        return this.f9649d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f9651f.m12780a();
    }

    public View getBannerView() {
        return this.f9646a;
    }

    public C3617s5 getListener() {
        return this.f9651f;
    }

    public String getPlacementName() {
        return this.f9648c;
    }

    public ISBannerSize getSize() {
        return this.f9647b;
    }

    public boolean isDestroyed() {
        return this.f9650e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f9651f.m12783b((C3617s5) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f9651f.m12783b((C3617s5) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f9648c = str;
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f9650e = false;
    }

    /* renamed from: a */
    public void m10155a() {
        this.f9650e = true;
        this.f9649d = null;
        this.f9647b = null;
        this.f9648c = null;
        this.f9646a = null;
        removeBannerListener();
    }

    /* renamed from: a */
    public void m10156a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC3369a(view, layoutParams));
    }
}

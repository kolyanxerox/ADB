package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.d8 */
/* loaded from: classes.dex */
public class C1009d8 {

    /* renamed from: a */
    private final C1240o f687a;

    /* renamed from: e */
    private final Runnable f691e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f692f;

    /* renamed from: g */
    private final WeakReference f693g;

    /* renamed from: h */
    private final long f694h;

    /* renamed from: k */
    private int f697k;

    /* renamed from: l */
    private float f698l;

    /* renamed from: m */
    private float f699m;

    /* renamed from: n */
    private long f700n;

    /* renamed from: b */
    private final Object f688b = new Object();

    /* renamed from: c */
    private final Rect f689c = new Rect();

    /* renamed from: i */
    private WeakReference f695i = new WeakReference(null);

    /* renamed from: j */
    private WeakReference f696j = new WeakReference(null);

    /* renamed from: o */
    private long f701o = Long.MIN_VALUE;

    /* renamed from: d */
    private final Handler f690d = new Handler(Looper.getMainLooper());

    /* renamed from: com.applovin.impl.d8$a */
    public interface a {
        void onLogVisibilityImpression();
    }

    public C1009d8(final View view, C1220k c1220k, a aVar) {
        this.f687a = c1220k.m2847O();
        this.f694h = ((Long) c1220k.m2866a(C1268v4.f2917w1)).longValue();
        this.f693g = new WeakReference(view);
        this.f691e = new OooO(6, this, new WeakReference(aVar));
        this.f692f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.Oooo0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f15601OooOo0O.m646a(view);
            }
        };
    }

    /* renamed from: a */
    public /* synthetic */ void m645a(WeakReference weakReference) {
        View view = (View) this.f693g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f696j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!m647a(viewGroup, view2)) {
            m644a();
            return;
        }
        if (C1240o.m3200a()) {
            this.f687a.m3211a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        m653b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    /* renamed from: c */
    private void m650c(View view) {
        View viewM433b = AbstractC0989b8.m433b((View) this.f693g.get());
        if (viewM433b == null) {
            viewM433b = AbstractC0989b8.m433b(view);
        }
        if (viewM433b == null) {
            if (C1240o.m3200a()) {
                this.f687a.m3211a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewM433b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f695i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f692f);
        } else if (C1240o.m3200a()) {
            this.f687a.m3218k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* renamed from: b */
    public void m653b() {
        synchronized (this.f688b) {
            this.f690d.removeMessages(0);
            m648b((View) this.f693g.get());
            this.f701o = Long.MIN_VALUE;
            this.f696j.clear();
        }
    }

    /* renamed from: b */
    private boolean m649b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f689c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f689c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f689c.width());
        if (jPxToDp < this.f697k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f698l) {
            return false;
        }
        return (((float) ((long) (this.f689c.height() * this.f689c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f699m;
    }

    /* renamed from: a */
    public /* synthetic */ boolean m646a(View view) {
        m644a();
        m648b(view);
        return true;
    }

    /* renamed from: a */
    public void m652a(AbstractC1014e3 abstractC1014e3) {
        View viewM101m0;
        if (abstractC1014e3 instanceof C1293y2) {
            viewM101m0 = abstractC1014e3.m3543y();
        } else if (!(abstractC1014e3 instanceof C0956a3)) {
            return;
        } else {
            viewM101m0 = ((C0956a3) abstractC1014e3).m101m0();
        }
        m651a(abstractC1014e3.m682e0(), abstractC1014e3.m684g0(), abstractC1014e3.m685h0(), abstractC1014e3.m686i0(), viewM101m0);
    }

    /* renamed from: b */
    private void m648b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f695i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f692f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f692f);
            } else if (C1240o.m3200a()) {
                this.f687a.m3211a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (C1240o.m3200a()) {
            this.f687a.m3211a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f695i.clear();
    }

    /* renamed from: a */
    public void m651a(int i, float f, float f2, long j, View view) {
        synchronized (this.f688b) {
            try {
                if (C1240o.m3200a()) {
                    this.f687a.m3211a("VisibilityTracker", "Tracking visibility for " + view);
                }
                m653b();
                WeakReference weakReference = new WeakReference(view);
                this.f696j = weakReference;
                this.f697k = i;
                this.f698l = f;
                this.f699m = f2;
                this.f700n = j;
                m650c((View) weakReference.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m644a() {
        this.f690d.postDelayed(this.f691e, this.f694h);
    }

    /* renamed from: a */
    private boolean m647a(View view, View view2) {
        if (m649b(view, view2)) {
            if (this.f701o == Long.MIN_VALUE) {
                this.f701o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f701o >= this.f700n) {
                return true;
            }
        }
        return false;
    }
}

package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.applovin.impl.c5 */
/* loaded from: classes.dex */
public class C0996c5 {

    /* renamed from: a */
    private final WeakHashMap f575a = new WeakHashMap();

    /* renamed from: b */
    private final Object f576b = new Object();

    /* renamed from: c */
    private final Handler f577c = new Handler();

    /* renamed from: d */
    private boolean f578d = false;

    /* renamed from: e */
    private final WeakReference f579e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f580f;

    /* renamed from: g */
    private a f581g;

    /* renamed from: com.applovin.impl.c5$a */
    public interface a {
        /* renamed from: a */
        void mo485a(int i, int i2);
    }

    public C0996c5(View view) {
        this.f579e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f580f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.OooOOO0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f15589OooOo0O.m478b();
            }
        };
        this.f580f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m478b() {
        m480d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m479c() {
        synchronized (this.f576b) {
            try {
                this.f578d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f575a.entrySet()) {
                    if (m477a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f581g;
                if (aVar != null) {
                    aVar.mo485a(iMin, iMax);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    private void m480d() {
        if (this.f578d) {
            return;
        }
        this.f578d = true;
        this.f577c.postDelayed(new o0OO00O(this, 5), 100L);
    }

    /* renamed from: a */
    public void m481a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f581g = null;
        View view = (View) this.f579e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f580f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f579e.clear();
        }
    }

    /* renamed from: b */
    public void m484b(View view) {
        synchronized (this.f576b) {
            this.f575a.remove(view);
        }
    }

    /* renamed from: a */
    public void m483a(a aVar) {
        this.f581g = aVar;
    }

    /* renamed from: a */
    public void m482a(View view, int i) {
        synchronized (this.f576b) {
            this.f575a.put(view, Integer.valueOf(i));
            m480d();
        }
    }

    /* renamed from: a */
    private boolean m477a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}

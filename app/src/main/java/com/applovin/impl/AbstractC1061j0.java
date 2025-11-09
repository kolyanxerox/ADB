package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import com.applovin.impl.sdk.C1240o;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC1061j0 extends AppLovinWebViewBase {

    /* renamed from: b */
    private static Boolean f921b;

    /* renamed from: a */
    private final AtomicReference f922a;

    public AbstractC1061j0(Context context) throws NoSuchMethodException, SecurityException {
        super(context);
        this.f922a = new AtomicReference();
        if (f921b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f921b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                C1240o.m3207h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f921b = Boolean.FALSE;
            }
        }
    }

    /* renamed from: a */
    public boolean m1031a() {
        return this.f922a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f922a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f922a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f922a.set(MotionEvent.obtain(motionEvent));
        if (f921b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}

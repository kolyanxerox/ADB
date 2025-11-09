package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.h0 */
/* loaded from: classes.dex */
public class C1041h0 {

    /* renamed from: a */
    private final C1220k f794a;

    /* renamed from: b */
    private final C1240o f795b;

    /* renamed from: c */
    private final long f796c;

    /* renamed from: d */
    private final long f797d;

    /* renamed from: e */
    private final int f798e;

    /* renamed from: f */
    private final int f799f;

    /* renamed from: g */
    private final int f800g;

    /* renamed from: h */
    private final int f801h;

    /* renamed from: i */
    private final int f802i;

    /* renamed from: k */
    private int f804k;

    /* renamed from: l */
    private int f805l;

    /* renamed from: m */
    private Integer f806m;

    /* renamed from: n */
    private volatile boolean f807n;

    /* renamed from: o */
    private volatile boolean f808o;

    /* renamed from: p */
    private Handler f809p;

    /* renamed from: q */
    private HandlerThread f810q;

    /* renamed from: s */
    private c f812s;

    /* renamed from: j */
    private WeakReference f803j = new WeakReference(null);

    /* renamed from: r */
    private final Runnable f811r = new o00Ooo(this, 2);

    /* renamed from: com.applovin.impl.h0$b */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        final /* synthetic */ d f814a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f815b;

        public b(d dVar, Bitmap bitmap) {
            this.f814a = dVar;
            this.f815b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.f814a.mo844a(this.f815b);
                return;
            }
            C1240o unused = C1041h0.this.f795b;
            if (C1240o.m3200a()) {
                C1041h0.this.f795b.m3214b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
            }
            this.f814a.mo845a(true);
        }
    }

    /* renamed from: com.applovin.impl.h0$c */
    public interface c {
        /* renamed from: a */
        void mo846a(int i, int i2);

        /* renamed from: a */
        void mo847a(int i, int i2, int i3);
    }

    /* renamed from: com.applovin.impl.h0$d */
    public interface d {
        /* renamed from: a */
        void mo844a(Bitmap bitmap);

        /* renamed from: a */
        void mo845a(boolean z);
    }

    public C1041h0(C1220k c1220k) {
        this.f794a = c1220k;
        this.f795b = c1220k.m2847O();
        this.f796c = ((Long) c1220k.m2866a(C1268v4.f2720X5)).longValue();
        this.f797d = ((Long) c1220k.m2866a(C1268v4.f2712W5)).longValue();
        this.f800g = ((Integer) c1220k.m2866a(C1268v4.f2728Y5)).intValue();
        this.f801h = ((Integer) c1220k.m2866a(C1268v4.f2736Z5)).intValue();
        this.f802i = ((Integer) c1220k.m2866a(C1268v4.f2744a6)).intValue();
        this.f798e = ((Integer) c1220k.m2866a(C1268v4.f2794g6)).intValue();
        this.f799f = ((Integer) c1220k.m2866a(C1268v4.f2802h6)).intValue();
    }

    /* renamed from: a */
    public static /* synthetic */ int m819a(C1041h0 c1041h0) {
        int i = c1041h0.f805l;
        c1041h0.f805l = i + 1;
        return i;
    }

    /* renamed from: f */
    public static /* synthetic */ int m832f(C1041h0 c1041h0) {
        int i = c1041h0.f804k;
        c1041h0.f804k = i + 1;
        return i;
    }

    /* renamed from: j */
    public void m840j() {
        this.f804k = 0;
        this.f806m = null;
    }

    /* renamed from: k */
    public void m841k() {
        if (this.f803j.get() != null) {
            if (C1240o.m3200a()) {
                this.f795b.m3211a("BlackViewDetector", "Stopped monitoring view: " + this.f803j.get());
            }
            this.f803j.clear();
        }
        Handler handler = this.f809p;
        if (handler != null) {
            handler.removeCallbacks(this.f811r);
            this.f809p = null;
        }
        if (this.f812s != null) {
            AppLovinSdkUtils.runOnUiThread(new o00Ooo(this, 1));
        }
    }

    /* renamed from: c */
    private void m826c() {
        if (this.f804k >= this.f799f && !this.f808o) {
            this.f808o = true;
            m836h();
        }
        if (this.f804k < this.f798e || this.f807n) {
            return;
        }
        this.f807n = true;
        m839i();
    }

    /* renamed from: d */
    public /* synthetic */ void m828d() {
        c cVar = this.f812s;
        if (cVar != null) {
            cVar.mo847a(this.f798e, this.f804k, this.f805l);
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m831e() {
        c cVar = this.f812s;
        if (cVar != null) {
            cVar.mo846a(this.f804k, this.f805l);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void m833f() {
        this.f812s = null;
    }

    /* renamed from: g */
    public void m835g() {
        if (this.f796c <= 0) {
            if (this.f804k == 1) {
                if (!this.f808o) {
                    this.f808o = true;
                    m836h();
                }
                if (!this.f807n) {
                    this.f807n = true;
                    m839i();
                }
            }
            m841k();
            return;
        }
        m826c();
        if (this.f809p == null) {
            if (C1240o.m3200a()) {
                this.f795b.m3218k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            m841k();
        } else if (this.f807n && this.f808o) {
            m841k();
        } else {
            this.f809p.postDelayed(this.f811r, this.f796c);
        }
    }

    /* renamed from: h */
    private void m836h() {
        View view = (View) this.f803j.get();
        if (C1240o.m3200a()) {
            this.f795b.m3218k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new o00Ooo(this, 3));
    }

    /* renamed from: i */
    private void m839i() {
        View view = (View) this.f803j.get();
        if (C1240o.m3200a()) {
            this.f795b.m3218k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new o00Ooo(this, 0));
    }

    /* renamed from: b */
    public void m843b() {
        m841k();
        HandlerThread handlerThread = this.f810q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f810q = null;
        }
    }

    /* renamed from: a */
    public void m842a(View view, c cVar) {
        if (((Boolean) this.f794a.m2866a(C1268v4.f2704V5)).booleanValue()) {
            View view2 = (View) this.f803j.get();
            if (view2 != null) {
                if (C1240o.m3200a()) {
                    this.f795b.m3218k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (C1240o.m3200a()) {
                this.f795b.m3211a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f810q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f810q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f794a.m2832E().m571a(C0993c2.f552y0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    m841k();
                }
                this.f812s = cVar;
                this.f803j = new WeakReference(view);
                m840j();
                this.f807n = false;
                this.f808o = false;
                Handler handler = new Handler(this.f810q.getLooper());
                this.f809p = handler;
                handler.postDelayed(this.f811r, this.f797d);
            } catch (Throwable th) {
                m841k();
                this.f794a.m2832E().m2148a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* renamed from: com.applovin.impl.h0$a */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.C1041h0.d
        /* renamed from: a */
        public void mo844a(Bitmap bitmap) {
            try {
                C1041h0.m819a(C1041h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = width / C1041h0.this.f800g;
                int i2 = height / C1041h0.this.f800g;
                int i3 = i / 2;
                for (int i4 = i2 / 2; i4 < height; i4 += i2) {
                    for (int i5 = i3; i5 < width; i5 += i) {
                        int pixel = bitmap.getPixel(i5, i4);
                        if (C1041h0.this.m823a(pixel)) {
                            bitmap.recycle();
                            C1041h0.this.m840j();
                            C1041h0.this.m835g();
                            return;
                        }
                        if (C1041h0.this.f806m == null) {
                            C1041h0.this.f806m = Integer.valueOf(pixel);
                        }
                    }
                }
                C1041h0.m832f(C1041h0.this);
                bitmap.recycle();
                C1041h0.this.m835g();
            } catch (Exception e) {
                C1041h0.this.f794a.m2832E().m2148a("BlackViewDetector", "onScreenshotCaptured", e);
                C1041h0.this.m841k();
            }
        }

        @Override // com.applovin.impl.C1041h0.d
        /* renamed from: a */
        public void mo845a(boolean z) {
            if (z) {
                C1041h0.this.m841k();
            } else {
                C1041h0.this.m835g();
            }
        }
    }

    /* renamed from: a */
    public void m821a() {
        ActivityManager.MemoryInfo memoryInfoM1162a;
        View view = (View) this.f803j.get();
        if (view == null) {
            if (C1240o.m3200a()) {
                this.f795b.m3218k("BlackViewDetector", "Monitored view no longer exists.");
            }
            m841k();
            return;
        }
        Long l = (Long) this.f794a.m2866a(C1268v4.f2778e6);
        if (l.longValue() > 0 && (memoryInfoM1162a = AbstractC1078k7.m1162a((ActivityManager) C1220k.m2824o().getSystemService("activity"))) != null && memoryInfoM1162a.availMem < l.longValue()) {
            if (C1240o.m3200a()) {
                this.f795b.m3218k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            this.f795b.m3211a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            m822a(view, new a());
            return;
        }
        if (C1240o.m3200a()) {
            this.f795b.m3218k("BlackViewDetector", OooO0oO.OooOo.OooO("Monitored view is not visible due to dimensions (width = ", measuredWidth, ", height = ", measuredHeight, ")"));
        }
        m840j();
        m835g();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m823a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.f806m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f806m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f806m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f802i
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f802i
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f802i
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.f801h
            if (r0 > r5) goto L5c
            if (r1 > r5) goto L5c
            if (r9 > r5) goto L5c
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            return r4
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1041h0.m823a(int):boolean");
    }

    /* renamed from: a */
    private void m822a(View view, d dVar) {
        if (AbstractC1141o0.m1952h()) {
            Activity activityM437a = this.f794a.m2893e().m437a();
            if (activityM437a == null) {
                if (C1240o.m3200a()) {
                    this.f795b.m3214b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.mo845a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, i + measuredWidth, i2 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityM437a.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (C1240o.m3200a()) {
                    this.f795b.m3214b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.mo845a(true);
                return;
            }
        }
        if (C1240o.m3200a()) {
            this.f795b.m3218k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.mo845a(true);
    }
}

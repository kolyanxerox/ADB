package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.ez */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC1549ez implements GestureDetector.OnGestureListener {

    /* renamed from: OooO00o */
    public final C1917oy f18709OooO00o;

    /* renamed from: OooO0O0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC1403az f18710OooO0O0;

    public GestureDetectorOnGestureListenerC1549ez(C1917oy c1917oy, ViewTreeObserverOnGlobalLayoutListenerC1403az viewTreeObserverOnGlobalLayoutListenerC1403az) {
        this.f18709OooO00o = c1917oy;
        this.f18710OooO0O0 = viewTreeObserverOnGlobalLayoutListenerC1403az;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.oy r0 = r5.f18709OooO00o     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            if (r0 != 0) goto L8
            goto L7b
        L8:
            float r0 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L2a
            float r2 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L2a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = -1
            r3 = 1148846080(0x447a0000, float:1000.0)
            r4 = 0
            if (r0 <= 0) goto L40
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L2c
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            goto L64
        L2a:
            r6 = move-exception
            goto L80
        L2c:
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 >= 0) goto L3e
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 2
            goto L64
        L3e:
            r6 = r1
            goto L64
        L40:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 <= 0) goto L53
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 8
            goto L64
        L53:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L3e
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 4
        L64:
            com.google.android.gms.internal.ads.oy r7 = r5.f18709OooO00o     // Catch: java.lang.Throwable -> L2a
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.ads.vy r8 = r7.OooOO0o     // Catch: java.lang.Throwable -> L7d
            int r8 = r8.zza()     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            if (r2 != r8) goto L7b
            com.google.android.gms.internal.ads.oy r7 = r5.f18709OooO00o     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.ads.az r8 = r5.f18710OooO0O0     // Catch: java.lang.Throwable -> L2a
            android.widget.FrameLayout r8 = r8.f17126OooOo     // Catch: java.lang.Throwable -> L2a
            r7.OooO0Oo(r8, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)
            return r1
        L7b:
            monitor-exit(r5)
            return r1
        L7d:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7d
            throw r6     // Catch: java.lang.Throwable -> L2a
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GestureDetectorOnGestureListenerC1549ez.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}

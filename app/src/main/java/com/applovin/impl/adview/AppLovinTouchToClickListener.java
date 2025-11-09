package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a */
    private final long f216a;

    /* renamed from: b */
    private final int f217b;

    /* renamed from: c */
    private final int f218c;

    /* renamed from: d */
    private final ClickRecognitionState f219d;

    /* renamed from: e */
    private long f220e;

    /* renamed from: f */
    private PointF f221f;

    /* renamed from: g */
    private boolean f222g;

    /* renamed from: h */
    private final Context f223h;

    /* renamed from: i */
    private final OnClickListener f224i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(C1220k c1220k, C1268v4 c1268v4, Context context, OnClickListener onClickListener) {
        this.f216a = ((Long) c1220k.m2866a(C1268v4.f2780f0)).longValue();
        this.f217b = ((Integer) c1220k.m2866a(C1268v4.f2788g0)).intValue();
        this.f218c = AppLovinSdkUtils.dpToPx(context, ((Integer) c1220k.m2866a(C1268v4.f2820k0)).intValue());
        this.f219d = ClickRecognitionState.values()[((Integer) c1220k.m2866a(c1268v4)).intValue()];
        this.f223h = context;
        this.f224i = onClickListener;
    }

    /* renamed from: a */
    private void m151a(View view, MotionEvent motionEvent) {
        this.f224i.onClick(view, motionEvent);
        this.f222g = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f222g && this.f219d == ClickRecognitionState.ACTION_POINTER_UP) {
                    m151a(view, motionEvent);
                }
            } else if (!this.f222g && this.f219d == ClickRecognitionState.ACTION_UP) {
                m151a(view, motionEvent);
            } else if (this.f219d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f220e;
                float fM150a = m150a(this.f221f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f222g) {
                    long j = this.f216a;
                    if ((j < 0 || jElapsedRealtime < j) && ((i = this.f217b) < 0 || fM150a < i)) {
                        m151a(view, motionEvent);
                    }
                }
            }
        } else if (this.f219d != ClickRecognitionState.ACTION_DOWN) {
            this.f220e = SystemClock.elapsedRealtime();
            this.f221f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f222g = false;
        } else if (m152a(motionEvent)) {
            m151a(view, motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    private float m150a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return m149a((float) Math.sqrt((f2 * f2) + (f * f)));
    }

    /* renamed from: a */
    private float m149a(float f) {
        return f / this.f223h.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private boolean m152a(MotionEvent motionEvent) {
        if (this.f218c <= 0) {
            return true;
        }
        Point pointM1938b = AbstractC1141o0.m1938b(this.f223h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.f218c;
        float f = i;
        return rawX >= f && rawY >= f && rawX <= ((float) (pointM1938b.x - i)) && rawY <= ((float) (pointM1938b.y - i));
    }
}

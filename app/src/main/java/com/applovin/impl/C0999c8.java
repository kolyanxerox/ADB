package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.c8 */
/* loaded from: classes.dex */
public class C0999c8 {

    /* renamed from: a */
    private final C1220k f589a;

    /* renamed from: b */
    private final C1240o f590b;

    /* renamed from: c */
    private final View f591c;

    public C0999c8(View view, C1220k c1220k) {
        this.f589a = c1220k;
        this.f590b = c1220k.m2847O();
        this.f591c = view;
    }

    /* renamed from: a */
    public long m495a(AbstractC1014e3 abstractC1014e3) {
        long j;
        if (C1240o.m3200a()) {
            this.f590b.m3211a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointM1938b = AbstractC1141o0.m1938b(this.f591c.getContext());
        if (this.f591c.isShown()) {
            j = 0;
        } else {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f591c.getAlpha() < abstractC1014e3.m681d0()) {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f591c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f591c.getParent() == null) {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f591c.getContext(), this.f591c.getWidth());
        if (iPxToDp < Math.min(abstractC1014e3.m687j0(), pointM1938b.x)) {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f591c.getContext(), this.f591c.getHeight());
        if (iPxToDp2 < abstractC1014e3.m683f0()) {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Rect rect = new Rect(0, 0, pointM1938b.x, pointM1938b.y);
        int[] iArr = {-1, -1};
        this.f591c.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], this.f591c.getWidth() + i, this.f591c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity activityM439b = this.f589a.m2893e().m439b();
        if (activityM439b != null && !AbstractC0989b8.m429a(this.f591c, activityM439b)) {
            if (C1240o.m3200a()) {
                this.f590b.m3214b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (C1240o.m3200a()) {
            this.f590b.m3211a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}

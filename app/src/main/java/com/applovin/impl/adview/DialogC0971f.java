package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.C1268v4;
import com.applovin.impl.InterfaceC1092m1;
import com.applovin.impl.adview.AbstractC0970e;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.f */
/* loaded from: classes.dex */
class DialogC0971f extends Dialog implements InterfaceC1092m1 {

    /* renamed from: a */
    private final Activity f305a;

    /* renamed from: b */
    private final C1220k f306b;

    /* renamed from: c */
    private final C1240o f307c;

    /* renamed from: d */
    private final C0967b f308d;

    /* renamed from: e */
    private final C1206a f309e;

    /* renamed from: f */
    private RelativeLayout f310f;

    /* renamed from: g */
    private AbstractC0970e f311g;

    /* renamed from: com.applovin.impl.adview.f$a */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            DialogC0971f.this.f311g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public DialogC0971f(C1206a c1206a, C0967b c0967b, Activity activity, C1220k c1220k) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (c1206a == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (c0967b == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f306b = c1220k;
        this.f307c = c1220k.m2847O();
        this.f305a = activity;
        this.f308d = c0967b;
        this.f309e = c1206a;
        requestWindowFeature(1);
        setCancelable(false);
    }

    /* renamed from: d */
    private void m285d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f308d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f305a);
        this.f310f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f310f.setBackgroundColor(-1157627904);
        this.f310f.addView(this.f308d);
        if (!this.f309e.m2492x1()) {
            m282a(this.f309e.m2487r1());
            m288g();
        }
        setContentView(this.f310f);
    }

    /* renamed from: e */
    public /* synthetic */ void m286e() {
        this.f310f.removeView(this.f308d);
        super.dismiss();
    }

    /* renamed from: f */
    public /* synthetic */ void m287f() {
        try {
            if (this.f311g == null) {
                m280a();
            }
            this.f311g.setVisibility(0);
            this.f311g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f311g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f307c.m3212a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            m280a();
        }
    }

    /* renamed from: g */
    private void m288g() {
        this.f305a.runOnUiThread(new OooOO0(this, 1));
    }

    /* renamed from: c */
    public C0967b m290c() {
        return this.f308d;
    }

    @Override // com.applovin.impl.InterfaceC1092m1
    public void dismiss(String str) {
        this.f305a.runOnUiThread(new OooOO0(this, 0));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f308d.m257a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m285d();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f305a.getWindow().getAttributes().flags, this.f305a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (C1240o.m3200a()) {
                this.f307c.m3214b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f307c.m3212a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    /* renamed from: a */
    private void m280a() {
        this.f308d.m257a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* renamed from: b */
    public /* synthetic */ void m283b(View view) {
        if (this.f311g.isClickable()) {
            this.f311g.performClick();
        }
    }

    /* renamed from: a */
    private void m282a(AbstractC0970e.a aVar) {
        if (this.f311g != null) {
            if (C1240o.m3200a()) {
                this.f307c.m3218k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        AbstractC0970e abstractC0970eM274a = AbstractC0970e.m274a(aVar, this.f305a);
        this.f311g = abstractC0970eM274a;
        abstractC0970eM274a.setVisibility(8);
        final int i = 0;
        this.f311g.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.OooO

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ DialogC0971f f15606OooOo0o;

            {
                this.f15606OooOo0o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f15606OooOo0o.m281a(view);
                        break;
                    default:
                        this.f15606OooOo0o.m283b(view);
                        break;
                }
            }
        });
        this.f311g.setClickable(false);
        int iM278a = m278a(((Integer) this.f306b.m2866a(C1268v4.f2925x1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM278a, iM278a);
        layoutParams.addRule(10);
        C1220k c1220k = this.f306b;
        C1268v4 c1268v4 = C1268v4.f2532A1;
        layoutParams.addRule(((Boolean) c1220k.m2866a(c1268v4)).booleanValue() ? 9 : 11);
        this.f311g.mo275a(iM278a);
        int iM278a2 = m278a(((Integer) this.f306b.m2866a(C1268v4.f2941z1)).intValue());
        int iM278a3 = m278a(((Integer) this.f306b.m2866a(C1268v4.f2933y1)).intValue());
        layoutParams.setMargins(iM278a3, iM278a2, iM278a3, 0);
        this.f310f.addView(this.f311g, layoutParams);
        this.f311g.bringToFront();
        int iM278a4 = m278a(((Integer) this.f306b.m2866a(C1268v4.f2540B1)).intValue());
        View view = new View(this.f305a);
        view.setBackgroundColor(0);
        int i2 = iM278a + iM278a4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f306b.m2866a(c1268v4)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iM278a3 - m278a(5), iM278a2 - m278a(5), iM278a3 - m278a(5), 0);
        final int i3 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.OooO

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ DialogC0971f f15606OooOo0o;

            {
                this.f15606OooOo0o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.f15606OooOo0o.m281a(view2);
                        break;
                    default:
                        this.f15606OooOo0o.m283b(view2);
                        break;
                }
            }
        });
        this.f310f.addView(view, layoutParams2);
        view.bringToFront();
    }

    /* renamed from: b */
    public C1206a m289b() {
        return this.f309e;
    }

    /* renamed from: a */
    public /* synthetic */ void m281a(View view) {
        m280a();
    }

    /* renamed from: a */
    private int m278a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f305a, i);
    }
}

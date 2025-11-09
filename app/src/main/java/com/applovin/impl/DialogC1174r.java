package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.r */
/* loaded from: classes.dex */
public class DialogC1174r extends Dialog {

    /* renamed from: a */
    private ViewGroup f1831a;

    /* renamed from: b */
    private AppLovinSdkUtils.Size f1832b;

    /* renamed from: c */
    private Activity f1833c;

    /* renamed from: d */
    private RelativeLayout f1834d;

    public DialogC1174r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f1831a = viewGroup;
        this.f1832b = size;
        this.f1833c = activity;
        requestWindowFeature(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m2283a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m2284b(View view) {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f1834d.removeView(this.f1831a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f1833c, this.f1832b.getWidth()), AppLovinSdkUtils.dpToPx(this.f1833c, this.f1832b.getHeight()));
        layoutParams.addRule(13);
        this.f1831a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f1833c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f1833c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f1833c.getResources().getDrawable(C1333R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.o000O000

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ DialogC1174r f15749OooOo0o;

            {
                this.f15749OooOo0o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f15749OooOo0o.m2283a(view);
                        break;
                    default:
                        this.f15749OooOo0o.m2284b(view);
                        break;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f1833c);
        this.f1834d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f1834d.setBackgroundColor(Integer.MIN_VALUE);
        this.f1834d.addView(imageButton);
        this.f1834d.addView(this.f1831a);
        final int i2 = 1;
        this.f1834d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.o000O000

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ DialogC1174r f15749OooOo0o;

            {
                this.f15749OooOo0o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f15749OooOo0o.m2283a(view);
                        break;
                    default:
                        this.f15749OooOo0o.m2284b(view);
                        break;
                }
            }
        });
        setContentView(this.f1834d);
    }
}

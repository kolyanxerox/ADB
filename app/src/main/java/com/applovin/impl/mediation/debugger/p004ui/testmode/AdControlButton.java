package com.applovin.impl.mediation.debugger.p004ui.testmode;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.AbstractC1091m0;
import com.applovin.impl.C0952a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C1333R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private final GradientDrawable f1384a;

    /* renamed from: b */
    private final Button f1385b;

    /* renamed from: c */
    private final C0952a f1386c;

    /* renamed from: d */
    private EnumC1124b f1387d;

    /* renamed from: e */
    private MaxAdFormat f1388e;

    /* renamed from: f */
    private InterfaceC1123a f1389f;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$a */
    public interface InterfaceC1123a {
        void onClick(AdControlButton adControlButton);
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$b */
    public enum EnumC1124b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private int m1714a(EnumC1124b enumC1124b) {
        return EnumC1124b.LOAD == enumC1124b ? AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_brand_color, getContext()) : EnumC1124b.LOADING == enumC1124b ? AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_brand_color, getContext()) : AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    /* renamed from: b */
    private String m1716b(EnumC1124b enumC1124b) {
        return EnumC1124b.LOAD == enumC1124b ? "Load" : EnumC1124b.LOADING == enumC1124b ? "" : "Show";
    }

    /* renamed from: c */
    private void m1717c(EnumC1124b enumC1124b) {
        if (EnumC1124b.LOADING == enumC1124b) {
            setEnabled(false);
            this.f1386c.m64a();
        } else {
            setEnabled(true);
            this.f1386c.m65b();
        }
        this.f1385b.setText(m1716b(enumC1124b));
        this.f1384a.setColor(m1714a(enumC1124b));
    }

    public EnumC1124b getControlState() {
        return this.f1387d;
    }

    public MaxAdFormat getFormat() {
        return this.f1388e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC1123a interfaceC1123a = this.f1389f;
        if (interfaceC1123a != null) {
            interfaceC1123a.onClick(this);
        }
    }

    public void setControlState(EnumC1124b enumC1124b) {
        if (this.f1387d != enumC1124b) {
            m1717c(enumC1124b);
        }
        this.f1387d = enumC1124b;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f1388e = maxAdFormat;
    }

    public void setOnClickListener(InterfaceC1123a interfaceC1123a) {
        this.f1389f = interfaceC1123a;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f1384a = gradientDrawable;
        Button button = new Button(getContext());
        this.f1385b = button;
        C0952a c0952a = new C0952a(getContext(), 20, R.attr.progressBarStyleSmall);
        this.f1386c = c0952a;
        EnumC1124b enumC1124b = EnumC1124b.LOAD;
        this.f1387d = enumC1124b;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        m1715a();
        c0952a.setColor(-1);
        addView(c0952a, new FrameLayout.LayoutParams(-1, -1, 17));
        m1717c(enumC1124b);
    }

    /* renamed from: a */
    private void m1715a() {
        this.f1385b.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}

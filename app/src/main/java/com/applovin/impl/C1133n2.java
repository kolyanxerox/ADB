package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.applovin.impl.n2 */
/* loaded from: classes.dex */
public class C1133n2 {

    /* renamed from: a */
    public TextView f1516a;

    /* renamed from: b */
    public TextView f1517b;

    /* renamed from: c */
    public ImageView f1518c;

    /* renamed from: d */
    public ImageView f1519d;

    /* renamed from: e */
    private C1143o2 f1520e;

    /* renamed from: f */
    private int f1521f;

    /* renamed from: a */
    public void m1887a(int i) {
        this.f1521f = i;
    }

    /* renamed from: b */
    public C1143o2 m1889b() {
        return this.f1520e;
    }

    /* renamed from: a */
    public int m1886a() {
        return this.f1521f;
    }

    /* renamed from: a */
    public void m1888a(C1143o2 c1143o2) {
        this.f1520e = c1143o2;
        this.f1516a.setText(c1143o2.mo137k());
        this.f1516a.setTextColor(c1143o2.m1987l());
        if (this.f1517b != null) {
            if (!TextUtils.isEmpty(c1143o2.mo1983f())) {
                this.f1517b.setTypeface(null, 0);
                this.f1517b.setVisibility(0);
                this.f1517b.setText(c1143o2.mo1983f());
                this.f1517b.setTextColor(c1143o2.mo1439g());
                if (c1143o2.mo1989p()) {
                    this.f1517b.setTypeface(null, 1);
                }
            } else {
                this.f1517b.setVisibility(8);
            }
        }
        if (this.f1518c != null) {
            if (c1143o2.mo1984h() > 0) {
                this.f1518c.setImageResource(c1143o2.mo1984h());
                this.f1518c.setColorFilter(c1143o2.m1985i());
                this.f1518c.setVisibility(0);
            } else {
                this.f1518c.setVisibility(8);
            }
        }
        if (this.f1519d != null) {
            if (c1143o2.mo135d() > 0) {
                this.f1519d.setImageResource(c1143o2.mo135d());
                this.f1519d.setColorFilter(c1143o2.mo136e());
                this.f1519d.setVisibility(0);
                return;
            }
            this.f1519d.setVisibility(8);
        }
    }
}

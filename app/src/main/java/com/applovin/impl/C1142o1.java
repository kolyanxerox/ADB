package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.C1143o2;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.o1 */
/* loaded from: classes.dex */
public class C1142o1 extends C1143o2 {

    /* renamed from: n */
    private final C1151p1 f1568n;

    /* renamed from: o */
    private final Context f1569o;

    public C1142o1(C1151p1 c1151p1, Context context) {
        super(C1143o2.c.DETAIL);
        this.f1568n = c1151p1;
        this.f1569o = context;
        this.f1572c = m1977r();
        this.f1573d = m1976q();
    }

    /* renamed from: q */
    private SpannedString m1976q() {
        return new SpannedString("Displayed " + AbstractC1078k7.m1168a(this.f1568n.m2054b(), true));
    }

    /* renamed from: r */
    private SpannedString m1977r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f1568n.m2055c());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f1568n.m2056d());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: d */
    public int mo135d() {
        return mo1440o() ? C1333R.drawable.applovin_ic_disclosure_arrow : super.mo1984h();
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: e */
    public int mo136e() {
        return AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_disclosureButtonColor, this.f1569o);
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: o */
    public boolean mo1440o() {
        return true;
    }
}

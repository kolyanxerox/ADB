package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.C0984b3;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.w3 */
/* loaded from: classes.dex */
public class C1276w3 extends C1143o2 {

    /* renamed from: n */
    private final C0984b3 f2995n;

    /* renamed from: o */
    private final Context f2996o;

    public C1276w3(C0984b3 c0984b3, Context context) {
        super(C1143o2.c.DETAIL);
        this.f2995n = c0984b3;
        this.f2996o = context;
        this.f1572c = m3601t();
        this.f1573d = m3600s();
    }

    /* renamed from: q */
    private SpannedString m3599q() {
        if (!this.f2995n.m338A()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
        }
        if (TextUtils.isEmpty(this.f2995n.m351c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f2995n.m351c(), ViewCompat.MEASURED_STATE_MASK));
        if (this.f2995n.m339B()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_orangeColor, this.f2996o)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f2995n.m359k(), ViewCompat.MEASURED_STATE_MASK));
        }
        if (!this.f2995n.m340C()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: s */
    private SpannedString m3600s() {
        if (!mo1440o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) m3602u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) m3599q());
        if (this.f2995n.m365q() == C0984b3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        } else if (this.f2995n.m365q() == C0984b3.a.INCOMPLETE_INTEGRATION && this.f2995n.m343F()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: t */
    private SpannedString m3601t() {
        return StringUtils.createSpannedString(this.f2995n.m355g(), mo1440o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    /* renamed from: u */
    private SpannedString m3602u() {
        if (!this.f2995n.m344G()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
        }
        if (!StringUtils.isValidString(this.f2995n.m364p())) {
            return StringUtils.createListItemDetailSpannedString(this.f2995n.m338A() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f2995n.m364p(), ViewCompat.MEASURED_STATE_MASK));
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
        return AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_disclosureButtonColor, this.f2996o);
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: h */
    public int mo1984h() {
        int iM356h = this.f2995n.m356h();
        return iM356h > 0 ? iM356h : C1333R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: o */
    public boolean mo1440o() {
        return this.f2995n.m365q() != C0984b3.a.MISSING;
    }

    /* renamed from: r */
    public C0984b3 m3603r() {
        return this.f2995n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f1572c) + ", detailText=" + ((Object) this.f1573d) + ", network=" + this.f2995n + "}";
    }
}

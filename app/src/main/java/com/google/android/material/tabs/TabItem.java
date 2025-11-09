package com.google.android.material.tabs;

import Ooooo00.OooOo;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;

/* loaded from: classes2.dex */
public class TabItem extends View {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f27821OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final CharSequence f27822OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Drawable f27823OooOo0o;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, OooOo.f14997OoooOo0);
        this.f27822OooOo0O = tintTypedArrayObtainStyledAttributes.getText(2);
        this.f27823OooOo0o = tintTypedArrayObtainStyledAttributes.getDrawable(0);
        this.f27821OooOo = tintTypedArrayObtainStyledAttributes.getResourceId(1, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}

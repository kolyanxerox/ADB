package o00000O0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* loaded from: classes2.dex */
public final class o00Oo0 extends ArrayAdapter {

    /* renamed from: OooOo */
    public final /* synthetic */ MaterialAutoCompleteTextView f29202OooOo;

    /* renamed from: OooOo0O */
    public ColorStateList f29203OooOo0O;

    /* renamed from: OooOo0o */
    public ColorStateList f29204OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f29202OooOo = materialAutoCompleteTextView;
        OooO00o();
    }

    public final void OooO00o() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f29202OooOo;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.f27873OooOoo0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f29204OooOo0o = colorStateList;
        if (materialAutoCompleteTextView.f27872OooOoOO != 0 && materialAutoCompleteTextView.f27873OooOoo0 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.compositeColors(materialAutoCompleteTextView.f27873OooOoo0.getColorForState(iArr3, 0), materialAutoCompleteTextView.f27872OooOoOO), ColorUtils.compositeColors(materialAutoCompleteTextView.f27873OooOoo0.getColorForState(iArr2, 0), materialAutoCompleteTextView.f27872OooOoOO), materialAutoCompleteTextView.f27872OooOoOO});
        }
        this.f29203OooOo0O = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f29202OooOo;
            Drawable rippleDrawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.f27872OooOoOO != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f27872OooOoOO);
                if (this.f29204OooOo0o != null) {
                    DrawableCompat.setTintList(colorDrawable, this.f29203OooOo0O);
                    rippleDrawable = new RippleDrawable(this.f29204OooOo0o, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            ViewCompat.setBackground(textView, rippleDrawable);
        }
        return view2;
    }
}

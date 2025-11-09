package Ooooooo;

import OooO00o.OooO00o;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import com.google.android.material.card.MaterialCardView;
import o000000.OooO0o;
import o000000.OooOOO0;
import o000000.OooOo;
import o000000.OooOo00;
import o000000.Oooo000;

/* renamed from: Ooooooo.b */
/* loaded from: classes2.dex */
public final class C0004b {
    public static final ColorDrawable OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public static final double f15128OooOo00 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: OooO, reason: collision with root package name */
    public Drawable f15129OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final MaterialCardView f15130OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f15132OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f15133OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f15134OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f15135OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f15136OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f15137OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public Drawable f15138OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public ColorStateList f15139OooOO0O;
    public ColorStateList OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public ColorStateList f15140OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public Oooo000 f15141OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public RippleDrawable f15142OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public LayerDrawable f15143OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public OooOOO0 f15145OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public boolean f15146OooOOoo;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Rect f15131OooO0O0 = new Rect();

    /* renamed from: OooOOo, reason: collision with root package name */
    public boolean f15144OooOOo = false;

    static {
        OooOo0 = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C0004b(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.f15130OooO00o = materialCardView;
        OooOOO0 oooOOO0 = new OooOOO0(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.f15132OooO0OO = oooOOO0;
        oooOOO0.OooOO0O(materialCardView.getContext());
        oooOOO0.OooOOOo();
        OooOo oooOoOooO0o = oooOOO0.f29048OooOo0O.f29028OooO00o.OooO0o();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, Ooooo00.OooOo.f14958OooO0oo, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            oooOoOooO0o.OooO0OO(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f15133OooO0Oo = new OooOOO0();
        OooO0oO(oooOoOooO0o.OooO00o());
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float OooO0O0(OooO00o oooO00o, float f) {
        if (oooO00o instanceof OooOo00) {
            return (float) ((1.0d - f15128OooOo00) * f);
        }
        if (oooO00o instanceof OooO0o) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO() {
        /*
            r6 = this;
            com.google.android.material.card.MaterialCardView r0 = r6.f15130OooO00o
            boolean r1 = r0.getPreventCornerOverlap()
            if (r1 == 0) goto L1a
            o000000.OooOOO0 r1 = r6.f15132OooO0OO
            o000000.OooOO0O r2 = r1.f29048OooOo0O
            o000000.Oooo000 r2 = r2.f29028OooO00o
            android.graphics.RectF r1 = r1.OooO0oO()
            boolean r1 = r2.OooO0o0(r1)
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r2 = 0
            if (r1 != 0) goto L27
            boolean r1 = r6.OooO0oo()
            if (r1 == 0) goto L25
            goto L27
        L25:
            r1 = r2
            goto L2b
        L27:
            float r1 = r6.OooO00o()
        L2b:
            boolean r3 = r0.getPreventCornerOverlap()
            if (r3 == 0) goto L43
            boolean r3 = r0.getUseCompatPadding()
            if (r3 == 0) goto L43
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = Ooooooo.C0004b.f15128OooOo00
            double r2 = r2 - r4
            float r4 = r0.getCardViewRadius()
            double r4 = (double) r4
            double r2 = r2 * r4
            float r2 = (float) r2
        L43:
            float r1 = r1 - r2
            int r1 = (int) r1
            android.graphics.Rect r2 = r6.f15131OooO0O0
            int r3 = r2.left
            int r3 = r3 + r1
            int r4 = r2.top
            int r4 = r4 + r1
            int r5 = r2.right
            int r5 = r5 + r1
            int r2 = r2.bottom
            int r2 = r2 + r1
            r0.OooO0o(r3, r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ooooooo.C0004b.OooO():void");
    }

    public final float OooO00o() {
        OooO00o oooO00o = this.f15141OooOOO0.f29084OooO00o;
        OooOOO0 oooOOO0 = this.f15132OooO0OO;
        return Math.max(Math.max(OooO0O0(oooO00o, oooOOO0.OooO()), OooO0O0(this.f15141OooOOO0.f29085OooO0O0, oooOOO0.f29048OooOo0O.f29028OooO00o.f29088OooO0o.OooO00o(oooOOO0.OooO0oO()))), Math.max(OooO0O0(this.f15141OooOOO0.f29086OooO0OO, oooOOO0.f29048OooOo0O.f29028OooO00o.f29090OooO0oO.OooO00o(oooOOO0.OooO0oO())), OooO0O0(this.f15141OooOOO0.f29087OooO0Oo, oooOOO0.f29048OooOo0O.f29028OooO00o.f29091OooO0oo.OooO00o(oooOOO0.OooO0oO()))));
    }

    public final LayerDrawable OooO0OO() {
        if (this.f15142OooOOOO == null) {
            int[] iArr = o0O0O00.OooO00o.f32822OooO00o;
            this.f15145OooOOo0 = new OooOOO0(this.f15141OooOOO0);
            this.f15142OooOOOO = new RippleDrawable(this.f15139OooOO0O, null, this.f15145OooOOo0);
        }
        if (this.f15143OooOOOo == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f15142OooOOOO, this.f15133OooO0Oo, this.f15138OooOO0});
            this.f15143OooOOOo = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f15143OooOOOo;
    }

    public final C0003a OooO0Oo(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f15130OooO00o.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (OooO0oo() ? OooO00o() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (OooO0oo() ? OooO00o() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C0003a(drawable, iCeil, i, iCeil, i);
    }

    public final void OooO0o(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f15138OooOO0 = drawableMutate;
            DrawableCompat.setTintList(drawableMutate, this.OooOO0o);
            boolean z = this.f15130OooO00o.f27464OooOo;
            Drawable drawable2 = this.f15138OooOO0;
            if (drawable2 != null) {
                drawable2.setAlpha(z ? 255 : 0);
            }
        } else {
            this.f15138OooOO0 = OooOo0;
        }
        LayerDrawable layerDrawable = this.f15143OooOOOo;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f15138OooOO0);
        }
    }

    public final void OooO0o0(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f15143OooOOOo != null) {
            MaterialCardView materialCardView = this.f15130OooO00o;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (OooO0oo() ? OooO00o() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (OooO0oo() ? OooO00o() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f15136OooO0oO;
            int i6 = (i5 & GravityCompat.END) == 8388613 ? ((i - this.f15135OooO0o0) - this.f15134OooO0o) - iCeil2 : this.f15135OooO0o0;
            int i7 = (i5 & 80) == 80 ? this.f15135OooO0o0 : ((i2 - this.f15135OooO0o0) - this.f15134OooO0o) - iCeil;
            int i8 = (i5 & GravityCompat.END) == 8388613 ? this.f15135OooO0o0 : ((i - this.f15135OooO0o0) - this.f15134OooO0o) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.f15135OooO0o0) - this.f15134OooO0o) - iCeil : this.f15135OooO0o0;
            if (ViewCompat.getLayoutDirection(materialCardView) == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.f15143OooOOOo.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    public final void OooO0oO(Oooo000 oooo000) {
        this.f15141OooOOO0 = oooo000;
        OooOOO0 oooOOO0 = this.f15132OooO0OO;
        oooOOO0.setShapeAppearanceModel(oooo000);
        oooOOO0.f29068OoooO00 = !oooOOO0.f29048OooOo0O.f29028OooO00o.OooO0o0(oooOOO0.OooO0oO());
        OooOOO0 oooOOO02 = this.f15133OooO0Oo;
        if (oooOOO02 != null) {
            oooOOO02.setShapeAppearanceModel(oooo000);
        }
        OooOOO0 oooOOO03 = this.f15145OooOOo0;
        if (oooOOO03 != null) {
            oooOOO03.setShapeAppearanceModel(oooo000);
        }
    }

    public final boolean OooO0oo() {
        MaterialCardView materialCardView = this.f15130OooO00o;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        OooOOO0 oooOOO0 = this.f15132OooO0OO;
        return oooOOO0.f29048OooOo0O.f29028OooO00o.OooO0o0(oooOOO0.OooO0oO()) && materialCardView.getUseCompatPadding();
    }

    public final void OooOO0() {
        boolean z = this.f15144OooOOo;
        MaterialCardView materialCardView = this.f15130OooO00o;
        if (!z) {
            materialCardView.setBackgroundInternal(OooO0Oo(this.f15132OooO0OO));
        }
        materialCardView.setForeground(OooO0Oo(this.f15129OooO));
    }
}

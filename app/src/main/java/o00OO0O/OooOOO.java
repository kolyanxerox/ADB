package o00oO0O;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import o000000.OooOOO0;

/* loaded from: classes2.dex */
public final class OooOOO extends ViewOutlineProvider {

    /* renamed from: OooO00o */
    public final Rect f32705OooO00o = new Rect();

    /* renamed from: OooO0O0 */
    public final /* synthetic */ ShapeableImageView f32706OooO0O0;

    public OooOOO(ShapeableImageView shapeableImageView) {
        this.f32706OooO0O0 = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f32706OooO0O0;
        if (shapeableImageView.f27662OooOooO == null) {
            return;
        }
        if (shapeableImageView.f27660OooOoo == null) {
            shapeableImageView.f27660OooOoo = new OooOOO0(shapeableImageView.f27662OooOooO);
        }
        RectF rectF = shapeableImageView.f27656OooOo0o;
        Rect rect = this.f32705OooO00o;
        rectF.round(rect);
        shapeableImageView.f27660OooOoo.setBounds(rect);
        shapeableImageView.f27660OooOoo.getOutline(outline);
    }
}

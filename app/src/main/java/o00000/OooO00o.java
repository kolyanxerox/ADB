package o00000;

import OoooOOO.o0O00000;
import Ooooo0o.oo0o0O0;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class OooO00o extends o0O00000 {

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ int f28969Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooO00o(int i) {
        super(10);
        this.f28969Oooo00O = i;
    }

    @Override // OoooOOO.o0O00000
    public final void OooOO0o(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fCos;
        float fCos2;
        switch (this.f28969Oooo00O) {
            case 0:
                RectF rectFOooO0oO = o0O00000.OooO0oO(tabLayout, view);
                RectF rectFOooO0oO2 = o0O00000.OooO0oO(tabLayout, view2);
                if (rectFOooO0oO.left < rectFOooO0oO2.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    fCos2 = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    float fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                    fCos2 = fSin;
                }
                drawable.setBounds(oo0o0O0.OooO0OO(fCos2, (int) rectFOooO0oO.left, (int) rectFOooO0oO2.left), drawable.getBounds().top, oo0o0O0.OooO0OO(fCos, (int) rectFOooO0oO.right, (int) rectFOooO0oO2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFOooO0oO3 = o0O00000.OooO0oO(tabLayout, view);
                float fOooO0O0 = f < 0.5f ? oo0o0O0.OooO0O0(1.0f, 0.0f, 0.0f, 0.5f, f) : oo0o0O0.OooO0O0(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFOooO0oO3.left, drawable.getBounds().top, (int) rectFOooO0oO3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fOooO0O0 * 255.0f));
                break;
        }
    }
}

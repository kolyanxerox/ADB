package o00000OO;

import OooooO0.o00000O;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import o0OOO0o.OooO0OO;

/* loaded from: classes2.dex */
public final class OooO00o implements View.OnLayoutChangeListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f29241OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f29242OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f29241OooOo0O = i;
        this.f29242OooOo0o = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Resources.NotFoundException {
        o00000O o00000o;
        switch (this.f29241OooOo0O) {
            case 0:
                OooO0O0 oooO0O0 = (OooO0O0) this.f29242OooOo0o;
                oooO0O0.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                oooO0O0.f29253OooooO0 = iArr[0];
                view.getWindowVisibleDisplayFrame(oooO0O0.f29247OoooOOo);
                break;
            default:
                OooO0OO oooO0OO = (OooO0OO) this.f29242OooOo0o;
                ImageView imageView = oooO0OO.f32963Oooo00o;
                if (imageView.getVisibility() == 0 && (o00000o = oooO0OO.f32977OoooOo0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    o00000o.setBounds(rect);
                    o00000o.OooO0o(imageView, null);
                    break;
                }
                break;
        }
    }
}

package ooOO;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class o0OoOo0 extends ViewOutlineProvider {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Chip f33291OooO00o;

    public o0OoOo0(Chip chip) {
        this.f33291OooO00o = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        o00Ooo o00ooo2 = this.f33291OooO00o.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}

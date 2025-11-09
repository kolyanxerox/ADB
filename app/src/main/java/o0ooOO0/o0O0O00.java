package o0ooOO0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class o0O0O00 extends oo0o0Oo.OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f33135OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f33136OooO0O0;

    public /* synthetic */ o0O0O00(Object obj, int i) {
        this.f33135OooO00o = i;
        this.f33136OooO0O0 = obj;
    }

    @Override // oo0o0Oo.OooOO0O
    public final void OooO00o(int i) {
        switch (this.f33135OooO00o) {
            case 0:
                o000000 o000000Var = (o000000) this.f33136OooO0O0;
                o000000Var.f33091OooO0Oo = true;
                o000OOo o000ooo2 = (o000OOo) o000000Var.f33093OooO0o0.get();
                if (o000ooo2 != null) {
                    o000ooo2.OooO00o();
                    break;
                }
                break;
        }
    }

    @Override // oo0o0Oo.OooOO0O
    public final void OooO0O0(Typeface typeface, boolean z) {
        switch (this.f33135OooO00o) {
            case 0:
                if (!z) {
                    o000000 o000000Var = (o000000) this.f33136OooO0O0;
                    o000000Var.f33091OooO0Oo = true;
                    o000OOo o000ooo2 = (o000OOo) o000000Var.f33093OooO0o0.get();
                    if (o000ooo2 != null) {
                        o000ooo2.OooO00o();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f33136OooO0O0;
                ooOO.o00Ooo o00ooo2 = chip.f27496OooOo0O;
                chip.setText(o00ooo2.f33266o0000OO0 ? o00ooo2.f33238OoooOoO : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    private final void OooO0OO(int i) {
    }
}

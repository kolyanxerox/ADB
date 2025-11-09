package o0ooOO0;

import OooooOo.oOOO00o0;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes2.dex */
public final class o00000OO implements o0000 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f33097OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ boolean f33098OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f33099OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oOOO00o0 f33100OooOoO0;

    public o00000OO(boolean z, boolean z2, boolean z3, oOOO00o0 oooo00o0) {
        this.f33098OooOo0O = z;
        this.f33099OooOo0o = z2;
        this.f33097OooOo = z3;
        this.f33100OooOoO0 = oooo00o0;
    }

    @Override // o0ooOO0.o0000
    public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, o0000O00 o0000o00) {
        if (this.f33098OooOo0O) {
            o0000o00.f33104OooO0Oo = windowInsetsCompat.getSystemWindowInsetBottom() + o0000o00.f33104OooO0Oo;
        }
        boolean zOooO0Oo = o0000oo.OooO0Oo(view);
        if (this.f33099OooOo0o) {
            if (zOooO0Oo) {
                o0000o00.f33103OooO0OO = windowInsetsCompat.getSystemWindowInsetLeft() + o0000o00.f33103OooO0OO;
            } else {
                o0000o00.f33101OooO00o = windowInsetsCompat.getSystemWindowInsetLeft() + o0000o00.f33101OooO00o;
            }
        }
        if (this.f33097OooOo) {
            if (zOooO0Oo) {
                o0000o00.f33101OooO00o = windowInsetsCompat.getSystemWindowInsetRight() + o0000o00.f33101OooO00o;
            } else {
                o0000o00.f33103OooO0OO = windowInsetsCompat.getSystemWindowInsetRight() + o0000o00.f33103OooO0OO;
            }
        }
        ViewCompat.setPaddingRelative(view, o0000o00.f33101OooO00o, o0000o00.f33102OooO0O0, o0000o00.f33103OooO0OO, o0000o00.f33104OooO0Oo);
        this.f33100OooOoO0.OooO00o(view, windowInsetsCompat, o0000o00);
        return windowInsetsCompat;
    }
}

package Oooooo;

import OooOooo.o000O00O;
import Oooo.OooOOO;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o */
    public boolean f15084OooO00o;

    /* renamed from: OooO0O0 */
    public int f15085OooO0O0;

    /* renamed from: OooO0OO */
    public Object f15086OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f15087OooO0Oo;

    public o0OOO0o(o0OOO0o o0ooo0o, o000O00O[] o000o00oArr, boolean z, int i) {
        this.f15087OooO0Oo = o0ooo0o;
        this.f15086OooO0OO = o000o00oArr;
        boolean z2 = false;
        if (o000o00oArr != null && z) {
            z2 = true;
        }
        this.f15084OooO00o = z2;
        this.f15085OooO0O0 = i;
    }

    public void OooO00o(int i) {
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f15087OooO0Oo;
        WeakReference weakReference = bottomSheetBehavior.f27417OoooO0O;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f15085OooO0O0 = i;
        if (this.f15084OooO00o) {
            return;
        }
        ViewCompat.postOnAnimation((View) bottomSheetBehavior.f27417OoooO0O.get(), (OooOOO) this.f15086OooO0OO);
        this.f15084OooO00o = true;
    }

    public o0OOO0o(BottomSheetBehavior bottomSheetBehavior) {
        this.f15087OooO0Oo = bottomSheetBehavior;
        this.f15086OooO0OO = new OooOOO(this, 11);
    }
}

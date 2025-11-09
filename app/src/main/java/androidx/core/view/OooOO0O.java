package androidx.core.view;

import android.view.View;
import androidx.core.view.SoftwareKeyboardControllerCompat;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15254OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f15255OooOo0o;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f15254OooOo0O = i;
        this.f15255OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15254OooOo0O) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.lambda$show$0((View) this.f15255OooOo0o);
                break;
            default:
                ((o00O0Oo.OooO0O0) this.f15255OooOo0o).invoke();
                break;
        }
    }
}

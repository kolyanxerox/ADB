package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 */
/* loaded from: classes.dex */
public final class C0029x8c7c000a extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final C0029x8c7c000a INSTANCE = new C0029x8c7c000a();

    public C0029x8c7c000a() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final View invoke(View it) {
        OooOo.OooO0o0(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}

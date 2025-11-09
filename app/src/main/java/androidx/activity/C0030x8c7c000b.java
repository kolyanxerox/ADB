package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 */
/* loaded from: classes.dex */
public final class C0030x8c7c000b extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final C0030x8c7c000b INSTANCE = new C0030x8c7c000b();

    public C0030x8c7c000b() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final OnBackPressedDispatcherOwner invoke(View it) {
        OooOo.OooO0o0(it, "it");
        Object tag = it.getTag(C0026R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}

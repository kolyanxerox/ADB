package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import o00O0o.o0OoOo0;

/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        OooOo.OooO0o0(view, "<this>");
        return (OnBackPressedDispatcherOwner) o0OoOo0.Oooo0OO(o0OoOo0.Oooo0oO(o0OoOo0.Oooo0o0(C0029x8c7c000a.INSTANCE, view), C0030x8c7c000b.INSTANCE));
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        OooOo.OooO0o0(view, "<this>");
        OooOo.OooO0o0(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C0026R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}

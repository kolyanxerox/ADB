package androidx.core.view;

import android.view.ViewParent;

/* loaded from: classes.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends kotlin.jvm.internal.OooOo00 implements o00O0Oo.Oooo000 {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // o00O0Oo.Oooo000
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}

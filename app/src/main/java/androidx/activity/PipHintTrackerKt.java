package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import o00O0O0o.OooOo00;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    public static final Object trackPipAnimationHintView(final Activity activity, View view, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        Object objCollect = o0o0000.OooO0oo(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new o0O000Oo() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            @Override // o00O0ooo.o0O000Oo
            public final Object emit(Rect rect, o00O0O0O.OooO0OO oooO0OO2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return OooOo.f33195OooO00o;
            }
        }, oooO0OO);
        return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}

package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.ironsource.w6 */
/* loaded from: classes2.dex */
public final class C3792w6 extends FrameLayout {

    /* renamed from: a */
    private final InterfaceC3852xw f12440a;

    /* renamed from: com.ironsource.w6$a */
    public static final class a implements InterfaceC3852xw {
        public a() {
        }

        /* renamed from: a */
        public static final void m12840a(View this_apply) {
            kotlin.jvm.internal.OooOo.OooO0o0(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* renamed from: b */
        public static final void m12843b(C3719u2 adTools, long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "$adTools");
            adTools.m9970e().m7911h().m9906a(true, j);
        }

        /* renamed from: c */
        public static final void m12844c(C3719u2 adTools, long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "$adTools");
            adTools.m13101d(new o00000OO(adTools, j, 3));
        }

        /* renamed from: d */
        public static final void m12845d(C3719u2 adTools, long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "$adTools");
            adTools.m9970e().m7911h().m9898a(j);
        }

        @Override // com.ironsource.InterfaceC3852xw
        /* renamed from: a */
        public void mo12846a(View view, FrameLayout.LayoutParams layoutParams, C3719u2 adTools) {
            kotlin.jvm.internal.OooOo.OooO0o0(view, "view");
            kotlin.jvm.internal.OooOo.OooO0o0(layoutParams, "layoutParams");
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
            View childAt = C3792w6.this.getChildAt(0);
            long jMo11377e = C3495on.f10667s.m11213d().mo8685d().mo11377e();
            if (jMo11377e <= 0) {
                C3792w6.this.removeView(childAt);
                C3792w6.this.addView(view, layoutParams);
                adTools.m13101d(new o00000OO(adTools, jMo11377e, 0));
                return;
            }
            adTools.m13101d(new o00000OO(adTools, jMo11377e, 1));
            view.setAlpha(0.0f);
            C3792w6.this.addView(view, layoutParams);
            if (childAt != null) {
                childAt.animate().alpha(0.0f).setDuration(jMo11377e).withStartAction(new OooO0o(childAt, 12)).withEndAction(new androidx.webkit.OooO00o(C3792w6.this, childAt, childAt, 28)).start();
            }
            view.animate().alpha(1.0f).setDuration(jMo11377e).withEndAction(new o00000OO(adTools, jMo11377e, 2)).start();
        }

        /* renamed from: a */
        public static final void m12841a(C3719u2 adTools, long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "$adTools");
            adTools.m9970e().m7911h().m9906a(false, j);
        }

        /* renamed from: a */
        public static final void m12842a(C3792w6 this$0, View view, View this_apply) {
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            kotlin.jvm.internal.OooOo.OooO0o0(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3792w6(Context context) {
        super(context);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.f12440a = new a();
    }

    public final InterfaceC3852xw getViewBinder() {
        return this.f12440a;
    }
}

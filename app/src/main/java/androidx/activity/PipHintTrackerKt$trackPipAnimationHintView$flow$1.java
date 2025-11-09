package androidx.activity;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import oo00o.OooOo;

@o00O0OO0.OooO(m13471c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", m13472f = "PipHintTracker.kt", m13473l = {85}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1 */
    public static final class C00241 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ ViewOnAttachStateChangeListenerC0025x7c5261f5 $attachStateChangeListener;
        final /* synthetic */ View.OnLayoutChangeListener $layoutChangeListener;
        final /* synthetic */ ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
        final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00241(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0025x7c5261f5 viewOnAttachStateChangeListenerC0025x7c5261f5) {
            super(0);
            this.$view = view;
            this.$scrollChangeListener = onScrollChangedListener;
            this.$layoutChangeListener = onLayoutChangeListener;
            this.$attachStateChangeListener = viewOnAttachStateChangeListenerC0025x7c5261f5;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13481invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13481invoke() {
            this.$view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
            this.$view.removeOnLayoutChangeListener(this.$layoutChangeListener);
            this.$view.removeOnAttachStateChangeListener(this.$attachStateChangeListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(o00oOoo o00oooo, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        ((o0O0ooO) o00oooo).OooO(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(o00oOoo o00oooo, View view) {
        ((o0O0ooO) o00oooo).OooO(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view));
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, oooO0OO);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View$OnAttachStateChangeListener, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            final o00oOoo o00oooo = (o00oOoo) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.OooOO0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(o00oooo, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.OooOO0O
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(o00oooo, view);
                }
            };
            ?? r5 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    ((o0O0ooO) o00oooo).OooO(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view));
                    view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (Api19Impl.INSTANCE.isAttachedToWindow(this.$view)) {
                ((o0O0ooO) o00oooo).OooO(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r5);
            C00241 c00241 = new C00241(this.$view, onScrollChangedListener, onLayoutChangeListener, r5);
            this.label = 1;
            if (o00O0O0O.OooO00o(o00oooo, c00241, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o00oOoo o00oooo, o00O0O0O.OooO0OO oooO0OO) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}

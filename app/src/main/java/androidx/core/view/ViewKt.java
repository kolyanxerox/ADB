package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import o00O0.o00Oo0;
import o00O0o.o0OoOo0;

/* loaded from: classes.dex */
public final class ViewKt {

    /* renamed from: androidx.core.view.ViewKt$doOnAttach$1 */
    public static final class ViewOnAttachStateChangeListenerC02591 implements View.OnAttachStateChangeListener {
        final /* synthetic */ o00O0Oo.Oooo000 $action;
        final /* synthetic */ View $this_doOnAttach;

        public ViewOnAttachStateChangeListenerC02591(View view, o00O0Oo.Oooo000 oooo000) {
            view = view;
            oooo000 = oooo000;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            oooo000.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.ViewKt$doOnDetach$1 */
    public static final class ViewOnAttachStateChangeListenerC02601 implements View.OnAttachStateChangeListener {
        final /* synthetic */ o00O0Oo.Oooo000 $action;
        final /* synthetic */ View $this_doOnDetach;

        public ViewOnAttachStateChangeListenerC02601(View view, o00O0Oo.Oooo000 oooo000) {
            view = view;
            oooo000 = oooo000;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            oooo000.invoke(view);
        }
    }

    /* renamed from: androidx.core.view.ViewKt$doOnNextLayout$1 */
    public static final class ViewOnLayoutChangeListenerC02611 implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC02611() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            oooo000.invoke(view);
        }
    }

    /* renamed from: androidx.core.view.ViewKt$doOnPreDraw$1 */
    public static final class RunnableC02621 implements Runnable {
        final /* synthetic */ View $this_doOnPreDraw;

        public RunnableC02621(View view) {
            view = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oooo000.invoke(view);
        }
    }

    public static final void doOnAttach(View view, o00O0Oo.Oooo000 oooo000) {
        if (view.isAttachedToWindow()) {
            oooo000.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnAttach.1
                final /* synthetic */ o00O0Oo.Oooo000 $action;
                final /* synthetic */ View $this_doOnAttach;

                public ViewOnAttachStateChangeListenerC02591(View view2, o00O0Oo.Oooo000 oooo0002) {
                    view = view2;
                    oooo000 = oooo0002;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    oooo000.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static final void doOnDetach(View view, o00O0Oo.Oooo000 oooo000) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnDetach.1
                final /* synthetic */ o00O0Oo.Oooo000 $action;
                final /* synthetic */ View $this_doOnDetach;

                public ViewOnAttachStateChangeListenerC02601(View view2, o00O0Oo.Oooo000 oooo0002) {
                    view = view2;
                    oooo000 = oooo0002;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    oooo000.invoke(view2);
                }
            });
        } else {
            oooo0002.invoke(view2);
        }
    }

    public static final void doOnLayout(View view, final o00O0Oo.Oooo000 oooo000) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view2.removeOnLayoutChangeListener(this);
                    oooo000.invoke(view2);
                }
            });
        } else {
            oooo000.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, o00O0Oo.Oooo000 oooo000) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt.doOnNextLayout.1
            public ViewOnLayoutChangeListenerC02611() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view2.removeOnLayoutChangeListener(this);
                oooo000.invoke(view2);
            }
        });
    }

    public static final OneShotPreDrawListener doOnPreDraw(View view, o00O0Oo.Oooo000 oooo000) {
        return OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt.doOnPreDraw.1
            final /* synthetic */ View $this_doOnPreDraw;

            public RunnableC02621(View view2) {
                view = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                oooo000.invoke(view);
            }
        });
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final o00O0o.Oooo000 getAllViews(View view) {
        return new o00Oo0(new ViewKt$allViews$1(view, null));
    }

    public static final o00O0o.Oooo000 getAncestors(View view) {
        return o0OoOo0.Oooo0o0(ViewKt$ancestors$1.INSTANCE, view.getParent());
    }

    public static final int getMarginBottom(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        return view.getVisibility() == 0;
    }

    public static final Runnable postDelayed(View view, long j, final o00O0Oo.OooO0O0 oooO0O0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                oooO0O0.invoke();
            }
        };
        view.postDelayed(runnable, j);
        return runnable;
    }

    public static final Runnable postOnAnimationDelayed(View view, long j, o00O0Oo.OooO0O0 oooO0O0) {
        OooOO0O oooOO0O = new OooOO0O(oooO0O0, 1);
        view.postOnAnimationDelayed(oooOO0O, j);
        return oooOO0O;
    }

    public static final void setGone(View view, boolean z) {
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z) {
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setPadding(View view, int i) {
        view.setPadding(i, i, i, i);
    }

    public static final void setVisible(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void updateLayoutParams(View view, o00O0Oo.Oooo000 oooo000) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        oooo000.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, o00O0Oo.Oooo000 oooo000) {
        view.getLayoutParams();
        kotlin.jvm.internal.OooOo.OooOO0O();
        throw null;
    }

    public static final void updatePadding(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    public static final void updatePaddingRelative(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }
}

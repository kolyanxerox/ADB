package o0ooOO0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal f33079OooO00o = new ThreadLocal();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal f33080OooO0O0 = new ThreadLocal();

    public static void OooO00o(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        OooO0OO(viewGroup, view, rect);
    }

    public static void OooO0O0(View view, ViewGroup viewGroup, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            OooO0O0((View) parent, viewGroup, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    public static void OooO0OO(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal threadLocal = f33079OooO00o;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        OooO0O0(view, viewGroup, matrix);
        ThreadLocal threadLocal2 = f33080OooO0O0;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}

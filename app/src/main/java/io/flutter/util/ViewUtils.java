package io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import o000o00o.o00000O0;
import o00O00o0.OooO00o;

/* loaded from: classes3.dex */
public final class ViewUtils {

    public interface DisplayUpdater {
        void updateDisplayMetrics(float f, float f2, float f3);
    }

    public interface ViewVisitor {
        boolean run(@NonNull View view);
    }

    public static void calculateMaximumDisplayMetrics(@Nullable Context context, @NonNull DisplayUpdater displayUpdater) {
        Activity activity = getActivity(context);
        if (activity != null) {
            WindowMetrics windowMetricsComputeMaximumWindowMetrics = WindowMetricsCalculator.getOrCreate().computeMaximumWindowMetrics(activity);
            displayUpdater.updateDisplayMetrics(windowMetricsComputeMaximumWindowMetrics.getBounds().width(), windowMetricsComputeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean childHasFocus(@Nullable View view) {
        return traverseHierarchy(view, new o00000O0(5));
    }

    @Nullable
    public static Activity getActivity(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean hasChildViewOfType(@Nullable View view, Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new OooO00o(clsArr));
    }

    public static /* synthetic */ boolean lambda$hasChildViewOfType$1(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean traverseHierarchy(@Nullable View view, @NonNull ViewVisitor viewVisitor) {
        if (view != null) {
            if (viewVisitor.run(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (traverseHierarchy(viewGroup.getChildAt(i), viewVisitor)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

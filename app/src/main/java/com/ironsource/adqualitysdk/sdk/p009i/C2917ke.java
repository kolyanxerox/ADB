package com.ironsource.adqualitysdk.sdk.p009i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ke */
/* loaded from: classes2.dex */
public final class C2917ke {

    /* renamed from: ｋ */
    private static Rect f7222 = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﻐ */
    public static <E extends View> void m7461(Activity activity, Class<E> cls, int i, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        if (i != -1) {
            View viewFindViewById = activity.findViewById(i);
            if (cls.isInstance(viewFindViewById)) {
                list3.add(viewFindViewById);
                if (z) {
                    return;
                }
            }
            m7469(viewFindViewById, cls, str, z, z2, list, list2, list3);
            if (list3.size() > 0 && z) {
                return;
            }
        }
        View viewFindViewById2 = activity.findViewById(R.id.content);
        if (viewFindViewById2 != null) {
            m7464(viewFindViewById2, cls, str, z, z2, list, list2, list3);
        }
    }

    /* renamed from: ﻛ */
    public static <E extends View> E m7462(Activity activity, Class<E> cls, int i, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        m7461(activity, cls, i, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* renamed from: ｋ */
    public static <E extends View> void m7469(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        List list4 = list3;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (m7472(childAt, cls, str, list, list2)) {
                    list4.add(childAt);
                    if (z) {
                        return;
                    }
                    if (z2) {
                        m7469(childAt, cls, str, z, z2, list, list2, list4);
                    }
                } else {
                    m7469(childAt, cls, str, z, z2, list, list2, list4);
                    if (list3 != null && list3.size() > 0 && z) {
                        return;
                    }
                }
                i++;
                list4 = list3;
            }
        }
    }

    /* renamed from: ﾇ */
    public static View m7471(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    /* renamed from: ﾒ */
    public static <E extends View> void m7474(Activity activity, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        m7461(activity, cls, -1, null, false, z, list, list2, list3);
    }

    /* renamed from: ﾇ */
    public static <E extends View> boolean m7472(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m7467(list) || list.contains(Integer.valueOf(view.getId()))) && !m7470(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* renamed from: ﾒ */
    public static Activity m7473(View view) {
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            View viewFindViewById = view.findViewById(R.id.content);
            if (viewFindViewById != null && (viewFindViewById.getContext() instanceof Activity)) {
                return (Activity) viewFindViewById.getContext();
            }
        }
        return null;
    }

    /* renamed from: ﻛ */
    private static <E extends View> void m7464(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        while (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            view = (View) view.getParent();
        }
        m7469(view, cls, str, z, z2, list, list2, list3);
    }

    /* renamed from: ﻛ */
    public static <E extends View> E m7463(View view, Class<E> cls, boolean z) {
        ArrayList arrayList = new ArrayList();
        m7465(view, cls, true, z, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* renamed from: ｋ */
    private static boolean m7470(List<String> list, View view) {
        return list != null && list.contains(view.getClass().getName());
    }

    /* renamed from: ｋ */
    public static View m7468(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* renamed from: ﻛ */
    public static <E extends View> void m7465(View view, Class<E> cls, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        m7469(view, cls, null, z, z2, list, list2, list3);
    }

    /* renamed from: ﻛ */
    private static boolean m7467(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: ﻛ */
    public static boolean m7466(View view) {
        view.getHitRect(f7222);
        return view.getGlobalVisibleRect(f7222);
    }
}

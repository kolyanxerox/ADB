package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zh0 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f26178OooO0o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final zh0 f26170OooO0oO = new zh0();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final Handler f26171OooO0oo = new Handler(Looper.getMainLooper());

    /* renamed from: OooO, reason: collision with root package name */
    public static Handler f26169OooO = null;

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final RunnableC2105u0 f26172OooOO0 = new RunnableC2105u0(6);

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final RunnableC2105u0 f26173OooOO0O = new RunnableC2105u0(7);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f26174OooO00o = new ArrayList();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f26175OooO0O0 = new ArrayList();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1643hi f26177OooO0Oo = new C1643hi();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1548ey f26176OooO0OO = new C1548ey(24);

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C1548ey f26179OooO0o0 = new C1548ey(new bi0(0));

    public static void OooO0O0() {
        if (f26169OooO == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f26169OooO = handler;
            handler.post(f26172OooOO0);
            f26169OooO.postDelayed(f26173OooOO0O, 200L);
        }
    }

    public final void OooO00o(View view, p80 p80Var, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        int i;
        if (xh0.OooOOOO(view) == null) {
            C1643hi c1643hi = this.f26177OooO0Oo;
            char c = ((HashSet) c1643hi.f19787OooOo0o).contains(view) ? (char) 1 : c1643hi.f19785OooOo ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectOooO0O0 = p80Var.OooO0O0(view);
            wh0.OooO0O0(jSONObject, jSONObjectOooO0O0);
            HashMap map = (HashMap) c1643hi.f19789OooOoO0;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    jSONObjectOooO0O0.put("adSessionId", obj);
                } catch (JSONException e) {
                    ze0.OooOOO(e, "Error with setting ad session id");
                }
                WeakHashMap weakHashMap = (WeakHashMap) c1643hi.f19788OooOoO;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    jSONObjectOooO0O0.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException e2) {
                    ze0.OooOOO(e2, "Error with setting has window focus");
                }
                boolean zContains = ((HashSet) c1643hi.f19794OooOooo).contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectOooO0O0.put("isPipActive", objValueOf);
                    } catch (JSONException e3) {
                        ze0.OooOOO(e3, "Error with setting is picture-in-picture active");
                    }
                }
                c1643hi.f19785OooOo = true;
                return;
            }
            HashMap map2 = (HashMap) c1643hi.f19786OooOo0O;
            yh0 yh0Var = (yh0) map2.get(view);
            if (yh0Var != null) {
                map2.remove(view);
            }
            if (yh0Var != null) {
                lh0 lh0Var = yh0Var.f25913OooO00o;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = yh0Var.f25914OooO0O0;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put((String) arrayList.get(i2));
                }
                try {
                    jSONObjectOooO0O0.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectOooO0O0.put("friendlyObstructionClass", lh0Var.f20889OooO0O0);
                    jSONObjectOooO0O0.put("friendlyObstructionPurpose", lh0Var.f20890OooO0OO);
                    jSONObjectOooO0O0.put("friendlyObstructionReason", lh0Var.f20891OooO0Oo);
                } catch (JSONException e4) {
                    ze0.OooOOO(e4, "Error with setting friendly obstruction");
                }
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z || z2;
            boolean z5 = c == 1;
            p80Var.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z5) {
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        OooO00o(viewGroup.getChildAt(i3), p80Var, jSONObjectOooO0O0, z4);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(map3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i5 = 0;
                while (i5 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i5));
                    int size3 = arrayList4.size();
                    int i6 = 0;
                    while (true) {
                        i = i5 + 1;
                        if (i6 < size3) {
                            OooO00o((View) arrayList4.get(i6), p80Var, jSONObjectOooO0O0, z4);
                            i6++;
                        }
                    }
                    i5 = i;
                }
            }
        }
    }
}

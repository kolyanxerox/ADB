package com.iab.omid.library.ironsrc.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.processor.InterfaceC2549a;
import com.iab.omid.library.ironsrc.utils.C2558c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.processor.d */
/* loaded from: classes2.dex */
public class C2552d implements InterfaceC2549a {

    /* renamed from: a */
    private final int[] f3648a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m4348b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC2549a.a aVar, boolean z) {
        HashMap map = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ArrayList arrayList3 = (ArrayList) map.get((Float) obj);
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                aVar.mo4343a((View) obj2, this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC2549a
    /* renamed from: a */
    public JSONObject mo4341a(View view) {
        if (view == null) {
            return C2558c.m4384a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f3648a);
        int[] iArr = this.f3648a;
        return C2558c.m4384a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC2549a
    /* renamed from: a */
    public void mo4342a(View view, JSONObject jSONObject, InterfaceC2549a.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m4348b(viewGroup, jSONObject, aVar, z2);
            } else {
                m4347a(viewGroup, jSONObject, aVar, z2);
            }
        }
    }

    /* renamed from: a */
    private void m4347a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC2549a.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo4343a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}

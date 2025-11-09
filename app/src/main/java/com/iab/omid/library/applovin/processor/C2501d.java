package com.iab.omid.library.applovin.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.processor.InterfaceC2498a;
import com.iab.omid.library.applovin.utils.C2507c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.processor.d */
/* loaded from: classes2.dex */
public class C2501d implements InterfaceC2498a {

    /* renamed from: a */
    private final int[] f3513a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m4095b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC2498a.a aVar, boolean z) {
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
                aVar.mo4090a((View) obj2, this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC2498a
    /* renamed from: a */
    public JSONObject mo4088a(View view) {
        if (view == null) {
            return C2507c.m4131a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f3513a);
        int[] iArr = this.f3513a;
        return C2507c.m4131a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC2498a
    /* renamed from: a */
    public void mo4089a(View view, JSONObject jSONObject, InterfaceC2498a.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m4095b(viewGroup, jSONObject, aVar, z2);
            } else {
                m4094a(viewGroup, jSONObject, aVar, z2);
            }
        }
    }

    /* renamed from: a */
    private void m4094a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC2498a.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo4090a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}

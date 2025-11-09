package com.iab.omid.library.applovin.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.internal.C2490c;
import com.iab.omid.library.applovin.processor.InterfaceC2498a;
import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.utils.C2509e;
import com.iab.omid.library.applovin.utils.C2512h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.processor.c */
/* loaded from: classes2.dex */
public class C2500c implements InterfaceC2498a {

    /* renamed from: a */
    private final InterfaceC2498a f3512a;

    public C2500c(InterfaceC2498a interfaceC2498a) {
        this.f3512a = interfaceC2498a;
    }

    @NonNull
    /* renamed from: a */
    public ArrayList<View> m4093a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C2490c c2490cM4029c = C2490c.m4029c();
        if (c2490cM4029c != null) {
            Collection<C2480a> collectionM4030a = c2490cM4029c.m4030a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM4030a.size() * 2) + 3);
            Iterator<C2480a> it = collectionM4030a.iterator();
            while (it.hasNext()) {
                View viewM3988e = it.next().m3988e();
                if (viewM3988e != null && C2512h.m4178g(viewM3988e) && (rootView = viewM3988e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM4175d = C2512h.m4175d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C2512h.m4175d(arrayList.get(size - 1)) > fM4175d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC2498a
    /* renamed from: a */
    public JSONObject mo4088a(View view) throws JSONException {
        JSONObject jSONObjectM4131a = C2507c.m4131a(0, 0, 0, 0);
        C2507c.m4133a(jSONObjectM4131a, C2509e.m4154a());
        return jSONObjectM4131a;
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC2498a
    /* renamed from: a */
    public void mo4089a(View view, JSONObject jSONObject, InterfaceC2498a.a aVar, boolean z, boolean z2) {
        ArrayList<View> arrayListM4093a = m4093a();
        int size = arrayListM4093a.size();
        int i = 0;
        while (i < size) {
            View view2 = arrayListM4093a.get(i);
            i++;
            aVar.mo4090a(view2, this.f3512a, jSONObject, z2);
        }
    }
}

package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.internal.C2541c;
import com.iab.omid.library.ironsrc.processor.InterfaceC2549a;
import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2560e;
import com.iab.omid.library.ironsrc.utils.C2563h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.processor.c */
/* loaded from: classes2.dex */
public class C2551c implements InterfaceC2549a {

    /* renamed from: a */
    private final InterfaceC2549a f3647a;

    public C2551c(InterfaceC2549a interfaceC2549a) {
        this.f3647a = interfaceC2549a;
    }

    @NonNull
    /* renamed from: a */
    public ArrayList<View> m4346a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C2541c c2541cM4282c = C2541c.m4282c();
        if (c2541cM4282c != null) {
            Collection<C2531a> collectionM4283a = c2541cM4282c.m4283a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM4283a.size() * 2) + 3);
            Iterator<C2531a> it = collectionM4283a.iterator();
            while (it.hasNext()) {
                View viewM4241c = it.next().m4241c();
                if (viewM4241c != null && C2563h.m4431g(viewM4241c) && (rootView = viewM4241c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM4428d = C2563h.m4428d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C2563h.m4428d(arrayList.get(size - 1)) > fM4428d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC2549a
    /* renamed from: a */
    public JSONObject mo4341a(View view) throws JSONException {
        JSONObject jSONObjectM4384a = C2558c.m4384a(0, 0, 0, 0);
        C2558c.m4386a(jSONObjectM4384a, C2560e.m4407a());
        return jSONObjectM4384a;
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC2549a
    /* renamed from: a */
    public void mo4342a(View view, JSONObject jSONObject, InterfaceC2549a.a aVar, boolean z, boolean z2) {
        ArrayList<View> arrayListM4346a = m4346a();
        int size = arrayListM4346a.size();
        int i = 0;
        while (i < size) {
            View view2 = arrayListM4346a.get(i);
            i++;
            aVar.mo4343a(view2, this.f3647a, jSONObject, z2);
        }
    }
}

package com.iab.omid.library.unity3d.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.internal.C2590c;
import com.iab.omid.library.unity3d.processor.InterfaceC2596a;
import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.utils.C2607e;
import com.iab.omid.library.unity3d.utils.C2610h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.processor.c */
/* loaded from: classes2.dex */
public class C2598c implements InterfaceC2596a {

    /* renamed from: a */
    private final InterfaceC2596a f3776a;

    public C2598c(InterfaceC2596a interfaceC2596a) {
        this.f3776a = interfaceC2596a;
    }

    @NonNull
    /* renamed from: a */
    public ArrayList<View> m4588a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C2590c c2590cM4538c = C2590c.m4538c();
        if (c2590cM4538c != null) {
            Collection<C2580a> collectionM4539a = c2590cM4538c.m4539a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM4539a.size() * 2) + 3);
            Iterator<C2580a> it = collectionM4539a.iterator();
            while (it.hasNext()) {
                View viewM4497c = it.next().m4497c();
                if (viewM4497c != null && C2610h.m4668e(viewM4497c) && (rootView = viewM4497c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM4666c = C2610h.m4666c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C2610h.m4666c(arrayList.get(size - 1)) > fM4666c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC2596a
    /* renamed from: a */
    public JSONObject mo4583a(View view) throws JSONException {
        JSONObject jSONObjectM4625a = C2605c.m4625a(0, 0, 0, 0);
        C2605c.m4627a(jSONObjectM4625a, C2607e.m4646a());
        return jSONObjectM4625a;
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC2596a
    /* renamed from: a */
    public void mo4584a(View view, JSONObject jSONObject, InterfaceC2596a.a aVar, boolean z, boolean z2) {
        ArrayList<View> arrayListM4588a = m4588a();
        int size = arrayListM4588a.size();
        int i = 0;
        while (i < size) {
            View view2 = arrayListM4588a.get(i);
            i++;
            aVar.mo4585a(view2, this.f3776a, jSONObject, z2);
        }
    }
}

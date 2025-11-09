package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;

/* renamed from: com.ironsource.pn */
/* loaded from: classes2.dex */
public final class C3530pn {
    /* renamed from: a */
    public final void m11434a(Map<String, String> map, boolean z) {
        if (z && TextUtils.isEmpty(C3404p.m10470j().m10558n()) && map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.doesClassExist(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    C3404p.m10470j().setMediationType(str);
                    return;
                }
            }
        }
    }
}

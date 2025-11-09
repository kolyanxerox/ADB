package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1221l;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.applovin.impl.g1 */
/* loaded from: classes.dex */
public abstract class AbstractC1032g1 {

    /* renamed from: com.applovin.impl.g1$a */
    public class a implements OnSuccessListener {
        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            C1221l.m2954a(new C1221l.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    /* renamed from: a */
    public static void m773a(Context context) {
        new Thread(new o0OO00O(context, 7)).start();
    }

    /* renamed from: b */
    public static /* synthetic */ void m774b(Context context) {
        C1221l.m2955a(AbstractC1263v.m3411b(context));
        if (AbstractC1078k7.m1203a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }
}

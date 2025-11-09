package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;

/* renamed from: com.ironsource.sa */
/* loaded from: classes2.dex */
public interface InterfaceC3622sa {

    /* renamed from: com.ironsource.sa$a */
    public interface a {
        /* renamed from: a */
        ISDemandOnlyBannerLayout mo10491a(Activity activity, ISBannerSize iSBannerSize);

        /* renamed from: a */
        void mo10503a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str);

        /* renamed from: a */
        void mo10504a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2);

        /* renamed from: c */
        void mo10544c(String str);
    }

    /* renamed from: com.ironsource.sa$b */
    public interface b {
        /* renamed from: a */
        void mo10505a(Activity activity, String str);

        /* renamed from: a */
        void mo10514a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        /* renamed from: b */
        void mo10534b(Activity activity, String str, String str2);

        /* renamed from: b */
        void mo10539b(String str);

        /* renamed from: e */
        boolean mo10549e(String str);
    }

    /* renamed from: com.ironsource.sa$c */
    public interface c {
        /* renamed from: a */
        void mo10506a(Activity activity, String str, String str2);

        /* renamed from: a */
        void mo10515a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        /* renamed from: a */
        void mo10522a(String str);

        /* renamed from: b */
        void mo10533b(Activity activity, String str);

        /* renamed from: f */
        boolean mo10551f(String str);
    }

    /* renamed from: a */
    String mo10496a(Context context);

    /* renamed from: a */
    void mo10508a(Context context, String str, IronSource.AD_UNIT... ad_unitArr);
}

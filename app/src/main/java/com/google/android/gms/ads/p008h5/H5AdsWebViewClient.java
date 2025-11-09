package com.google.android.gms.ads.p008h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.AbstractC1453cc;
import com.google.android.gms.internal.ads.C1821mc;
import com.google.android.gms.internal.ads.ii0;

@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public final class H5AdsWebViewClient extends AbstractC1453cc {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C1821mc f15947OooO00o;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.f15947OooO00o = new C1821mc(context, webView);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc
    public final WebViewClient OooO00o() {
        return this.f15947OooO00o;
    }

    public void clearAdObjects() {
        this.f15947OooO00o.f21197OooO0O0.clearAdObjects();
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.f15947OooO00o.f21196OooO00o;
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        C1821mc c1821mc = this.f15947OooO00o;
        c1821mc.getClass();
        ii0.OoooOoo("Delegate cannot be itself.", webViewClient != c1821mc);
        c1821mc.f21196OooO00o = webViewClient;
    }
}

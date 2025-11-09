package androidx.webkit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.webkit.WebViewCompat;
import com.applovin.impl.AbstractC0980b;
import com.applovin.impl.AbstractC0995c4;
import com.applovin.impl.AbstractC1003d2;
import com.applovin.impl.AbstractC1048h7;
import com.applovin.impl.AbstractC1089l8;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1265v1;
import com.applovin.impl.C0958a5;
import com.applovin.impl.C0986b5;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1012e1;
import com.applovin.impl.C1059i8;
import com.applovin.impl.C1136n5;
import com.applovin.impl.C1170q4;
import com.applovin.impl.C1255u0;
import com.applovin.impl.C1291y0;
import com.applovin.impl.C1302z2;
import com.applovin.impl.EnumC1050i;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.network.C1236b;
import com.applovin.impl.sdk.network.C1238d;
import com.applovin.impl.sdk.network.C1239e;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinPostbackListener;
import com.ironsource.C2997c7;
import com.ironsource.C3010ck;
import com.ironsource.C3030d5;
import com.ironsource.C3042dh;
import com.ironsource.C3159go;
import com.ironsource.C3192hm;
import com.ironsource.C3423ml;
import com.ironsource.C3511p4;
import com.ironsource.C3792w6;
import com.ironsource.C3808wm;
import com.ironsource.C3907zj;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f15323OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15324OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f15325OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f15326OooOoO0;

    public /* synthetic */ OooO00o(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        this.f15324OooOo0O = 29;
        this.f15326OooOoO0 = context;
        this.f15325OooOo0o = levelPlayInitRequest;
        this.f15323OooOo = levelPlayInitListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15324OooOo0O) {
            case 0:
                WebViewCompat.lambda$startUpWebView$3((WebViewStartUpConfig) this.f15325OooOo0o, (WebViewCompat.WebViewStartUpCallback) this.f15323OooOo, (Context) this.f15326OooOoO0);
                break;
            case 1:
                ((C0962a) this.f15325OooOo0o).m166a((String) this.f15323OooOo, (String) this.f15326OooOoO0);
                break;
            case 2:
                ((AbstractC0995c4) this.f15325OooOo0o).m458a((View) this.f15323OooOo, (List) this.f15326OooOoO0);
                break;
            case 3:
                ((AbstractC0995c4) this.f15325OooOo0o).m460a((String) this.f15323OooOo, (Runnable) this.f15326OooOoO0);
                break;
            case 4:
                ((AbstractC1003d2) this.f15325OooOo0o).m565b((C0993c2) this.f15323OooOo, (List) this.f15326OooOoO0);
                break;
            case 5:
                ((C1012e1) this.f15325OooOo0o).m665a((AbstractC1207b) this.f15323OooOo, (CustomTabsSession) this.f15326OooOoO0);
                break;
            case 6:
                ((C1012e1) this.f15325OooOo0o).m667a((List) this.f15323OooOo, (CustomTabsSession) this.f15326OooOoO0);
                break;
            case 7:
                AbstractC1048h7.m945a((C1220k) this.f15325OooOo0o, (String) this.f15323OooOo, (AbstractC1207b) this.f15326OooOoO0);
                break;
            case 8:
                ((C1059i8) this.f15325OooOo0o).m1015b((C1239e) this.f15323OooOo, (AppLovinPostbackListener) this.f15326OooOoO0);
                break;
            case 9:
                AbstractC1089l8.m1420a((WebView) this.f15325OooOo0o, (String) this.f15323OooOo, (C1170q4) this.f15326OooOoO0);
                break;
            case 10:
                ((MaxAdViewImpl) this.f15325OooOo0o).m1578a((AbstractC1118a.a) this.f15323OooOo, (EnumC1050i) this.f15326OooOoO0);
                break;
            case 11:
                ((MaxFullscreenAdImpl.C1111b) this.f15325OooOo0o).m1648a((C1302z2) this.f15323OooOo, (MaxAd) this.f15326OooOoO0);
                break;
            case 12:
                ((MaxFullscreenAdImpl.C1111b) this.f15325OooOo0o).m1651a((String) this.f15323OooOo, (MaxError) this.f15326OooOoO0);
                break;
            case 13:
                ((C1136n5) this.f15325OooOo0o).m1896b((C0986b5) this.f15323OooOo, (C0958a5.a) this.f15326OooOoO0);
                break;
            case 14:
                AbstractC1168q2.m2175a((MaxAdReviewListener) this.f15325OooOo0o, (String) this.f15323OooOo, (MaxAd) this.f15326OooOoO0);
                break;
            case 15:
                ((C1170q4) this.f15325OooOo0o).m2264b((Executor) this.f15323OooOo, (C1170q4.b) this.f15326OooOoO0);
                break;
            case 16:
                ((C1236b) this.f15325OooOo0o).m3120b((C1238d) this.f15323OooOo, (AppLovinPostbackListener) this.f15326OooOoO0);
                break;
            case 17:
                ImageViewUtils.m3258a((C1220k) this.f15325OooOo0o, (Bitmap) this.f15323OooOo, (ImageView) this.f15326OooOoO0);
                break;
            case 18:
                ((AbstractC1265v1) this.f15325OooOo0o).m3430a((AbstractC0980b) this.f15323OooOo, (C1170q4) this.f15326OooOoO0);
                break;
            case 19:
                ((C1291y0) this.f15325OooOo0o).m3692a((C1255u0) this.f15323OooOo, (Activity) this.f15326OooOoO0);
                break;
            case 20:
                C2997c7.m8098a((C2997c7) this.f15325OooOo0o, (C3907zj) this.f15323OooOo, (C3042dh) this.f15326OooOoO0);
                break;
            case 21:
                C3010ck.m8172a((InitRequest) this.f15325OooOo0o, (Context) this.f15326OooOoO0, (InitListener) this.f15323OooOo);
                break;
            case 22:
                C3030d5.m8278a((C3030d5) this.f15325OooOo0o, (ImpressionDataListener) this.f15323OooOo, (ImpressionData) this.f15326OooOoO0);
                break;
            case 23:
                C3159go.m8995a((C3159go) this.f15325OooOo0o, (AdapterNativeAdData) this.f15323OooOo, (AdapterNativeAdViewBinder) this.f15326OooOoO0);
                break;
            case 24:
                C3192hm.m9171a((C3192hm) this.f15325OooOo0o, (LevelPlayAdError) this.f15323OooOo, (LevelPlayAdInfo) this.f15326OooOoO0);
                break;
            case 25:
                C3192hm.m9166a((Activity) this.f15325OooOo0o, (C3192hm) this.f15323OooOo, (String) this.f15326OooOoO0);
                break;
            case 26:
                C3423ml.m10831a((LevelPlayAdInfo) this.f15325OooOo0o, (LevelPlayAdError) this.f15323OooOo, (C3423ml) this.f15326OooOoO0);
                break;
            case 27:
                C3511p4.c.m11273a((C3511p4) this.f15325OooOo0o, (String) this.f15323OooOo, (C3511p4.d) this.f15326OooOoO0);
                break;
            case 28:
                C3792w6.a.m12842a((C3792w6) this.f15325OooOo0o, (View) this.f15323OooOo, (View) this.f15326OooOoO0);
                break;
            default:
                C3808wm.m12914b((Context) this.f15326OooOoO0, (LevelPlayInitRequest) this.f15325OooOo0o, (LevelPlayInitListener) this.f15323OooOo);
                break;
        }
    }

    public /* synthetic */ OooO00o(InitRequest initRequest, Context context, InitListener initListener) {
        this.f15324OooOo0O = 21;
        this.f15325OooOo0o = initRequest;
        this.f15326OooOoO0 = context;
        this.f15323OooOo = initListener;
    }

    public /* synthetic */ OooO00o(Object obj, Object obj2, Object obj3, int i) {
        this.f15324OooOo0O = i;
        this.f15325OooOo0o = obj;
        this.f15323OooOo = obj2;
        this.f15326OooOoO0 = obj3;
    }
}

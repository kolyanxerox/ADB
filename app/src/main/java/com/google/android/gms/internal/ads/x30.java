package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class x30 extends zzdt {

    /* renamed from: OooOo, reason: collision with root package name */
    public final WeakReference f25499OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final HashMap f25500OooOo0O = new HashMap();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Context f25501OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C2163vl f25502OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final q30 f25503OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public p30 f25504OooOoOO;

    public x30(Context context, WeakReference weakReference, q30 q30Var, C2163vl c2163vl) {
        this.f25501OooOo0o = context;
        this.f25499OooOo = weakReference;
        this.f25503OooOoO0 = q30Var;
        this.f25502OooOoO = c2163vl;
    }

    public static AdRequest o000O0oO() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    public static String o000O0oo(Object obj) {
        ResponseInfo responseInfo;
        zzdy zzdyVarZzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdyVarZzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzdyVarZzc.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final synchronized void o000O(String str, String str2) {
        try {
            C2274yl c2274ylOooO00o = this.f25504OooOoOO.OooO00o(str);
            w30 w30Var = new w30(this, str2, 0);
            c2274ylOooO00o.addListener(new wp0(0, c2274ylOooO00o, w30Var), this.f25502OooOoO);
        } catch (NullPointerException e) {
            zzv.zzp().OooO0oo("OutOfContextTester.setAdAsOutOfContext", e);
            this.f25503OooOoO0.OooO0O0(str2);
        }
    }

    public final synchronized void o000O0O0(String str, Object obj, String str2) {
        this.f25500OooOo0O.put(str, obj);
        o000O(o000O0oo(obj), str2);
    }

    public final Context o000O0o0() {
        Context context = (Context) this.f25499OooOo.get();
        return context == null ? this.f25501OooOo0o : context;
    }

    public final synchronized void o000OO00(String str, String str2) {
        try {
            C2274yl c2274ylOooO00o = this.f25504OooOoOO.OooO00o(str);
            w30 w30Var = new w30(this, str2, 1);
            c2274ylOooO00o.addListener(new wp0(0, c2274ylOooO00o, w30Var), this.f25502OooOoO);
        } catch (NullPointerException e) {
            zzv.zzp().OooO0oo("OutOfContextTester.setAdAsShown", e);
            this.f25503OooOoO0.OooO0O0(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, Oooo0o.OooO0O0 oooO0O0, Oooo0o.OooO0O0 oooO0O02) {
        Context context = (Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        ViewGroup viewGroup = (ViewGroup) Oooo0o.OooO0OO.o000O0oO(oooO0O02);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f25500OooOo0O;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            y30.OooO0O0(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            y30.OooO0O0(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            y30.OooO0O0(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesOooO0O0 = zzv.zzp().OooO0O0();
            linearLayout2.addView(y30.OooO00o(context, resourcesOooO0O0 == null ? "Headline" : resourcesOooO0O0.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String headline = nativeAd.getHeadline();
            if (headline == null) {
                headline = "";
            }
            View viewOooO00o = y30.OooO00o(context, headline, android.R.style.TextAppearance.Medium, ViewCompat.MEASURED_STATE_MASK, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewOooO00o);
            linearLayout2.addView(viewOooO00o);
            linearLayout2.addView(y30.OooO00o(context, resourcesOooO0O0 == null ? "Body" : resourcesOooO0O0.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String body = nativeAd.getBody();
            if (body == null) {
                body = "";
            }
            View viewOooO00o2 = y30.OooO00o(context, body, android.R.style.TextAppearance.Medium, ViewCompat.MEASURED_STATE_MASK, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewOooO00o2);
            linearLayout2.addView(viewOooO00o2);
            linearLayout2.addView(y30.OooO00o(context, resourcesOooO0O0 == null ? "Media View" : resourcesOooO0O0.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}

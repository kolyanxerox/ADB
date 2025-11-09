package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0OO.oo000o;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1817m8;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1663i1;
import com.google.android.gms.internal.ads.C1699j1;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.hg0;
import com.google.android.gms.internal.ads.k20;
import com.google.android.gms.internal.ads.xd0;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class TaggingLibraryJsInterface {

    /* renamed from: OooO, reason: collision with root package name */
    public final hg0 f16474OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f16475OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final WebView f16476OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1663i1 f16477OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final xd0 f16478OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final k20 f16479OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f16480OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f16481OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final C2163vl f16482OooO0oo = AbstractC2200wl.f25325OooO0o;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final zzo f16483OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final zzf f16484OooOO0O;
    public final zzj OooOO0o;

    public TaggingLibraryJsInterface(WebView webView, C1663i1 c1663i1, k20 k20Var, hg0 hg0Var, xd0 xd0Var, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.f16476OooO0O0 = webView;
        Context context = webView.getContext();
        this.f16475OooO00o = context;
        this.f16477OooO0OO = c1663i1;
        this.f16479OooO0o = k20Var;
        AbstractC1448c7.OooO00o(context);
        this.f16480OooO0o0 = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0O0)).intValue();
        this.f16481OooO0oO = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OooOo)).booleanValue();
        this.f16474OooO = hg0Var;
        this.f16478OooO0Oo = xd0Var;
        this.f16483OooOO0 = zzoVar;
        this.f16484OooOO0O = zzfVar;
        this.OooOO0o = zzjVar;
    }

    @NonNull
    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(@NonNull String str) {
        try {
            ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzd = this.f16477OooO0OO.f19893OooO0O0.zzd(this.f16475OooO00o, str, this.f16476OooO0O0);
            if (!this.f16481OooO0oO) {
                return strZzd;
            }
            ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
            zzaa.zzd(this.f16479OooO0o, null, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzd;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("TaggingLibraryJsInterface.getClickSignals", e);
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(@NonNull final String str, int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) AbstractC2200wl.f25321OooO00o.OooO0O0(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i, this.f16480OooO0o0), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @NonNull
    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.zzq();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbu zzbuVar = new zzbu(this, string);
        if (((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue()) {
            this.f16483OooOO0.zzg(this.f16476OooO0O0, zzbuVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0OO)).booleanValue()) {
            this.f16482OooO0oo.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface taggingLibraryJsInterface = this.zza;
                    Bundle bundle2 = bundle;
                    QueryInfoGenerationCallback queryInfoGenerationCallback = zzbuVar;
                    taggingLibraryJsInterface.getClass();
                    com.google.android.gms.ads.internal.util.zzaa zzaaVarZzr = com.google.android.gms.ads.internal.zzv.zzr();
                    Context context = taggingLibraryJsInterface.f16475OooO00o;
                    CookieManager cookieManagerZza = zzaaVarZzr.zza(context);
                    bundle2.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(taggingLibraryJsInterface.f16476OooO0O0) : false);
                    QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle2).build(), queryInfoGenerationCallback);
                }
            });
            return string;
        }
        QueryInfo.generate(this.f16475OooO00o, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbuVar);
        return string;
    }

    @NonNull
    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzh = this.f16477OooO0OO.f19893OooO0O0.zzh(this.f16475OooO00o, this.f16476OooO0O0, null);
            if (!this.f16481OooO0oO) {
                return strZzh;
            }
            ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
            zzaa.zzd(this.f16479OooO0o, null, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzh;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("TaggingLibraryJsInterface.getViewSignals", e);
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) AbstractC2200wl.f25321OooO00o.OooO0O0(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i, this.f16480OooO0o0), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void recordClick(@NonNull final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0o0)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC2200wl.f25321OooO00o.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                xd0 xd0Var;
                TaggingLibraryJsInterface taggingLibraryJsInterface = this.zza;
                String str2 = str;
                taggingLibraryJsInterface.getClass();
                Uri uriOooO00o = Uri.parse(str2);
                try {
                    boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0o000oO)).booleanValue();
                    WebView webView = taggingLibraryJsInterface.f16476OooO0O0;
                    Context context = taggingLibraryJsInterface.f16475OooO00o;
                    uriOooO00o = (!zBooleanValue || (xd0Var = taggingLibraryJsInterface.f16478OooO0Oo) == null) ? taggingLibraryJsInterface.f16477OooO0OO.OooO00o(uriOooO00o, context, webView, null) : xd0Var.OooO00o(uriOooO00o, context, webView, null);
                } catch (C1699j1 e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to append the click signal to URL: ", e);
                    com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("TaggingLibraryJsInterface.recordClick", e);
                }
                taggingLibraryJsInterface.f16474OooO.OooO0O0(uriOooO00o.toString(), null, null);
            }
        });
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(@NonNull String str) throws JSONException {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i4 = 1;
                if (i5 != 1) {
                    i4 = 2;
                    if (i5 != 2) {
                        i4 = 3;
                        if (i5 != 3) {
                            i4 = -1;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.f16477OooO0OO.f19893OooO0O0.zzk(MotionEvent.obtain(0L, i3, i4, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}

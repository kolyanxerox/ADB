package com.google.android.gms.ads.internal;

import OooO0oO.OooOo;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.internal.ads.AbstractC2149v7;
import com.google.android.gms.internal.ads.C1663i1;
import com.google.android.gms.internal.ads.C1699j1;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class zzr extends AsyncTask {

    /* renamed from: OooO00o */
    public final /* synthetic */ zzu f16346OooO00o;

    public /* synthetic */ zzr(zzu zzuVar) {
        this.f16346OooO00o = zzuVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzu zzuVar = this.f16346OooO00o;
        try {
            zzuVar.f16359OooOoo = (C1663i1) zzuVar.f16353OooOo.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (TimeoutException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e3);
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) AbstractC2149v7.f24870OooO0Oo.OooOOO());
        zzs zzsVar = zzuVar.f16356OooOoO;
        builder.appendQueryParameter(AppLovinEventParameters.SEARCH_QUERY, zzsVar.zzd());
        builder.appendQueryParameter("pubId", zzsVar.zzc());
        builder.appendQueryParameter("mappver", zzsVar.zza());
        Map mapZze = zzsVar.zze();
        for (String str : mapZze.keySet()) {
            builder.appendQueryParameter(str, (String) mapZze.get(str));
        }
        Uri uriBuild = builder.build();
        C1663i1 c1663i1 = zzuVar.f16359OooOoo;
        if (c1663i1 != null) {
            try {
                uriBuild = C1663i1.OooO0Oo(uriBuild, c1663i1.f19893OooO0O0.zzf(zzuVar.f16357OooOoO0));
            } catch (C1699j1 e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", e4);
            }
        }
        return OooOo.OooOoo(zzuVar.zzq(), "#", uriBuild.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f16346OooO00o.f16358OooOoOO;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}

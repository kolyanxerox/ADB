package com.google.android.gms.ads.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.internal.ads.C1699j1;
import com.google.android.gms.internal.ads.af0;

/* loaded from: classes2.dex */
final class zzo extends WebViewClient {

    /* renamed from: OooO00o */
    public final /* synthetic */ zzu f16343OooO00o;

    public zzo(zzu zzuVar) {
        this.f16343OooO00o = zzuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzu zzuVar = this.f16343OooO00o;
        zzbl zzblVar = zzuVar.f16360OooOoo0;
        if (zzblVar != null) {
            try {
                zzblVar.zzf(af0.Oooo0O0(1, null, null));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzbl zzblVar2 = zzuVar.f16360OooOoo0;
        if (zzblVar2 != null) {
            try {
                zzblVar2.zze(0);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzu zzuVar = this.f16343OooO00o;
        int iZzx = 0;
        if (str.startsWith(zzuVar.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbl zzblVar = zzuVar.f16360OooOoo0;
            if (zzblVar != null) {
                try {
                    zzblVar.zzf(af0.Oooo0O0(3, null, null));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            zzbl zzblVar2 = zzuVar.f16360OooOoo0;
            if (zzblVar2 != null) {
                try {
                    zzblVar2.zze(3);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
            zzuVar.o000O0O0(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzbl zzblVar3 = zzuVar.f16360OooOoo0;
            if (zzblVar3 != null) {
                try {
                    zzblVar3.zzf(af0.Oooo0O0(1, null, null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzbl zzblVar4 = zzuVar.f16360OooOoo0;
            if (zzblVar4 != null) {
                try {
                    zzblVar4.zze(0);
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
            zzuVar.o000O0O0(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzbl zzblVar5 = zzuVar.f16360OooOoo0;
            if (zzblVar5 != null) {
                try {
                    zzblVar5.zzi();
                } catch (RemoteException e5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                }
            }
            zzuVar.getClass();
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    zzbc.zzb();
                    iZzx = com.google.android.gms.ads.internal.util.client.zzf.zzx(zzuVar.f16357OooOoO0, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            zzuVar.o000O0O0(iZzx);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzbl zzblVar6 = zzuVar.f16360OooOoo0;
        if (zzblVar6 != null) {
            try {
                zzblVar6.zzc();
                zzuVar.f16360OooOoo0.zzh();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        if (zzuVar.f16359OooOoo != null) {
            Uri uriOooO00o = Uri.parse(str);
            try {
                uriOooO00o = zzuVar.f16359OooOoo.OooO00o(uriOooO00o, zzuVar.f16357OooOoO0, null, null);
            } catch (C1699j1 e7) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", e7);
            }
            str = uriOooO00o.toString();
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzuVar.f16357OooOoO0.startActivity(intent);
        return true;
    }
}

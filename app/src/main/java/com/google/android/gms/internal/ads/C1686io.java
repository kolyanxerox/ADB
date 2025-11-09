package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.internal.ads.io */
/* loaded from: classes2.dex */
public final class C1686io extends WebChromeClient {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2129uo f20075OooO00o;

    public C1686io(C2129uo c2129uo) {
        this.f20075OooO00o = c2129uo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context OooO0O0(WebView webView) {
        if (!(webView instanceof InterfaceC1722jo)) {
            return webView.getContext();
        }
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) webView;
        Activity activityZzi = interfaceC1722jo.zzi();
        return activityZzi != null ? activityZzi : interfaceC1722jo.getContext();
    }

    public final boolean OooO00o(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzb zzbVar;
        C2129uo c2129uo = this.f20075OooO00o;
        if (c2129uo != null) {
            try {
                AbstractC1870no abstractC1870no = c2129uo.f24671OooOo0O.f25037Oooo0;
                if (abstractC1870no != null && (zzbVar = abstractC1870no.f21548OoooO0) != null && zzbVar != null && !zzbVar.zzc()) {
                    zzbVar.zzb("window." + str + "('" + str3 + "')");
                    return false;
                }
            } catch (WindowManager.BadTokenException e) {
                zzo.zzk("Fail to display Dialog.", e);
                return true;
            }
        }
        zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(context);
        builderZzL.setTitle(str2);
        if (!z) {
            builderZzL.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC1612go(jsResult, 1)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC1612go(jsResult, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC1575fo(jsResult, 0)).create().show();
            return true;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str3);
        EditText editText = new EditText(context);
        editText.setText(str4);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builderZzL.setView(linearLayout).setPositiveButton(R.string.ok, new u50(2, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC2010rg(jsPromptResult, 1)).setOnCancelListener(new DialogInterfaceOnCancelListenerC1575fo(jsPromptResult, 1)).create().show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC1722jo)) {
            zzo.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzm zzmVarZzL = ((InterfaceC1722jo) webView).zzL();
        if (zzmVarZzL == null) {
            zzo.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzmVarZzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String strOooOOO = OooO0oO.OooOo.OooOOO(androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("JS: ", strMessage, " (", strSourceId, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER), consoleMessage.lineNumber(), ")");
        if (strOooOOO.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AbstractC1649ho.f19833OooO00o[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzo.zzg(strOooOOO);
        } else if (i == 2) {
            zzo.zzj(strOooOOO);
        } else if (i == 3 || i == 4 || i != 5) {
            zzo.zzi(strOooOOO);
        } else {
            zzo.zze(strOooOOO);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        AbstractC1870no abstractC1870no = this.f20075OooO00o.f24671OooOo0O.f25037Oooo0;
        if (abstractC1870no != null) {
            webView2.setWebViewClient(abstractC1870no);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L29
            com.google.android.gms.ads.internal.zzv.zzq()
            com.google.android.gms.internal.ads.uo r0 = r3.f20075OooO00o
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = com.google.android.gms.ads.internal.util.zzs.zzB(r1, r2)
            r2 = 1
            if (r1 != 0) goto L23
            com.google.android.gms.ads.internal.zzv.zzq()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzB(r0, r1)
            if (r0 == 0) goto L25
        L23:
            r0 = r2
            goto L26
        L25:
            r0 = 0
        L26:
            r5.invoke(r4, r0, r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1686io.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzm zzmVarZzL = this.f20075OooO00o.f24671OooOo0O.zzL();
        if (zzmVarZzL == null) {
            zzo.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzmVarZzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return OooO00o(OooO0O0(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return OooO00o(OooO0O0(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return OooO00o(OooO0O0(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return OooO00o(OooO0O0(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzm zzmVarZzL = this.f20075OooO00o.f24671OooOo0O.zzL();
        if (zzmVarZzL == null) {
            zzo.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzmVarZzL.zzC(view, customViewCallback);
            zzmVarZzL.zzA(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}

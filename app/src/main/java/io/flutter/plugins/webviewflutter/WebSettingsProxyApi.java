package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class WebSettingsProxyApi extends PigeonApiWebSettings {

    /* renamed from: io.flutter.plugins.webviewflutter.WebSettingsProxyApi$1 */
    public static /* synthetic */ class C45131 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode;

        static {
            int[] iArr = new int[MixedContentMode.values().length];
            $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode = iArr;
            try {
                iArr[MixedContentMode.ALWAYS_ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode[MixedContentMode.COMPATIBILITY_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode[MixedContentMode.NEVER_ALLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebSettingsProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    @NonNull
    public String getUserAgentString(@NonNull WebSettings webSettings) {
        return webSettings.getUserAgentString();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setAllowContentAccess(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setAllowContentAccess(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setAllowFileAccess(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setAllowFileAccess(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setBuiltInZoomControls(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setBuiltInZoomControls(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setDisplayZoomControls(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setDisplayZoomControls(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setDomStorageEnabled(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setDomStorageEnabled(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setGeolocationEnabled(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setGeolocationEnabled(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setJavaScriptCanOpenWindowsAutomatically(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setJavaScriptCanOpenWindowsAutomatically(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setJavaScriptEnabled(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setJavaScriptEnabled(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setLoadWithOverviewMode(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setLoadWithOverviewMode(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setMediaPlaybackRequiresUserGesture(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setMediaPlaybackRequiresUserGesture(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setMixedContentMode(@NonNull WebSettings webSettings, @NonNull MixedContentMode mixedContentMode) {
        int i = C45131.$SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode[mixedContentMode.ordinal()];
        if (i == 1) {
            webSettings.setMixedContentMode(0);
        } else if (i == 2) {
            webSettings.setMixedContentMode(2);
        } else {
            if (i != 3) {
                return;
            }
            webSettings.setMixedContentMode(1);
        }
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setSupportMultipleWindows(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setSupportMultipleWindows(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setSupportZoom(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setSupportZoom(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setTextZoom(@NonNull WebSettings webSettings, long j) {
        webSettings.setTextZoom((int) j);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setUseWideViewPort(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setUseWideViewPort(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setUserAgentString(@NonNull WebSettings webSettings, @Nullable String str) {
        webSettings.setUserAgentString(str);
    }
}

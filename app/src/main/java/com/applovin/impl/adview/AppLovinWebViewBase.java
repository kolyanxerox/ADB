package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* loaded from: classes.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(AbstractC1207b abstractC1207b) {
        Boolean boolM310m;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        int iM2640w0 = abstractC1207b.m2640w0();
        if (iM2640w0 >= 0) {
            setLayerType(iM2640w0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(abstractC1207b.m2548M());
        if (abstractC1207b.m2552P0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C0978m c0978mM2642x0 = abstractC1207b.m2642x0();
        if (c0978mM2642x0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateM299b = c0978mM2642x0.m299b();
            if (pluginStateM299b != null) {
                settings.setPluginState(pluginStateM299b);
            }
            Boolean boolM302e = c0978mM2642x0.m302e();
            if (boolM302e != null) {
                settings.setAllowFileAccess(boolM302e.booleanValue());
            }
            Boolean boolM306i = c0978mM2642x0.m306i();
            if (boolM306i != null) {
                settings.setLoadWithOverviewMode(boolM306i.booleanValue());
            }
            Boolean boolM314q = c0978mM2642x0.m314q();
            if (boolM314q != null) {
                settings.setUseWideViewPort(boolM314q.booleanValue());
            }
            Boolean boolM301d = c0978mM2642x0.m301d();
            if (boolM301d != null) {
                settings.setAllowContentAccess(boolM301d.booleanValue());
            }
            Boolean boolM313p = c0978mM2642x0.m313p();
            if (boolM313p != null) {
                settings.setBuiltInZoomControls(boolM313p.booleanValue());
            }
            Boolean boolM305h = c0978mM2642x0.m305h();
            if (boolM305h != null) {
                settings.setDisplayZoomControls(boolM305h.booleanValue());
            }
            Boolean boolM309l = c0978mM2642x0.m309l();
            if (boolM309l != null) {
                settings.setSaveFormData(boolM309l.booleanValue());
            }
            Boolean boolM300c = c0978mM2642x0.m300c();
            if (boolM300c != null) {
                settings.setGeolocationEnabled(boolM300c.booleanValue());
            }
            Boolean boolM307j = c0978mM2642x0.m307j();
            if (boolM307j != null) {
                settings.setNeedInitialFocus(boolM307j.booleanValue());
            }
            Boolean boolM303f = c0978mM2642x0.m303f();
            if (boolM303f != null) {
                settings.setAllowFileAccessFromFileURLs(boolM303f.booleanValue());
            }
            Boolean boolM304g = c0978mM2642x0.m304g();
            if (boolM304g != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolM304g.booleanValue());
            }
            Boolean boolM312o = c0978mM2642x0.m312o();
            if (boolM312o != null) {
                settings.setLoadsImagesAutomatically(boolM312o.booleanValue());
            }
            Boolean boolM311n = c0978mM2642x0.m311n();
            if (boolM311n != null) {
                settings.setBlockNetworkImage(boolM311n.booleanValue());
            }
            if (AbstractC1141o0.m1949e()) {
                Integer numM298a = c0978mM2642x0.m298a();
                if (numM298a != null) {
                    settings.setMixedContentMode(numM298a.intValue());
                }
                if (AbstractC1141o0.m1950f()) {
                    Boolean boolM308k = c0978mM2642x0.m308k();
                    if (boolM308k != null) {
                        settings.setOffscreenPreRaster(boolM308k.booleanValue());
                    }
                    if (!AbstractC1141o0.m1955k() || (boolM310m = c0978mM2642x0.m310m()) == null) {
                        return;
                    }
                    settings.setAlgorithmicDarkeningAllowed(boolM310m.booleanValue());
                }
            }
        }
    }
}

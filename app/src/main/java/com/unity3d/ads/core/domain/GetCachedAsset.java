package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooOOO;
import o00O0oO.o000000;
import o00O0oOo.o0000OO0;
import oo00o.OooOO0O;

/* loaded from: classes3.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context, CacheWebViewAssets cacheWebViewAssets) {
        OooOo.OooO0o0(cacheRepository, "cacheRepository");
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) throws IOException {
        String strOooooOO = o000000.OooooOO(String.valueOf(uri.getPath()), "/");
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strOooooOO);
            OooOo.OooO0Oo(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strOooooOO), null, inputStreamOpen);
        } catch (Exception unused) {
            return null;
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        File file;
        Object objOooO0O0;
        String string = uri.toString();
        OooOo.OooO0Oo(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new GetCachedAsset$getCachedAsset$result$1(this, o000000.Oooooo0(string, "/"), null));
        if ((cacheResult instanceof CacheResult.Success) && (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) != null) {
            try {
                objOooO0O0 = new FileInputStream(file);
            } catch (Throwable th) {
                objOooO0O0 = o000OOo.OooO0O0(th);
            }
            if (objOooO0O0 instanceof OooOO0O) {
                objOooO0O0 = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objOooO0O0;
            if (fileInputStream != null) {
                String filePath = file.getAbsolutePath();
                OooOo.OooO0Oo(filePath, "filePath");
                String strGuessMimeType = StringExtensionsKt.guessMimeType(filePath);
                if (strGuessMimeType != null && !o000000.OoooOO0(strGuessMimeType)) {
                    return new WebResourceResponse(strGuessMimeType, null, fileInputStream);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object objOooO0O0;
        String strGuessMimeType;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        String string = uri.toString();
        OooOo.OooO0Oo(string, "uri.toString()");
        int iOoooO0O = o000000.OoooO0O(string, "?", 0, 6);
        if (iOoooO0O != -1) {
            string = string.substring(0, iOoooO0O);
            OooOo.OooO0Oo(string, "substring(...)");
        }
        sb.append(o000000.Oooooo0(string, "/"));
        String string2 = sb.toString();
        File file = this.cacheWebViewAssets.getCached().get(string2);
        if (file != null) {
            try {
                objOooO0O0 = new FileInputStream(file);
            } catch (Throwable th) {
                objOooO0O0 = o000OOo.OooO0O0(th);
            }
            if (objOooO0O0 instanceof OooOO0O) {
                objOooO0O0 = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objOooO0O0;
            if (fileInputStream != null && (strGuessMimeType = StringExtensionsKt.guessMimeType(string2)) != null && !o000000.OoooOO0(strGuessMimeType)) {
                return new WebResourceResponse(strGuessMimeType, null, fileInputStream);
            }
        }
        return null;
    }

    public final WebResourceResponse invoke(Uri uri, String webviewType) {
        OooOo.OooO0o0(uri, "uri");
        OooOo.OooO0o0(webviewType, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}

package androidx.webkit;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebStorage;
import androidx.webkit.internal.WebStorageAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WebStorageCompat {
    private WebStorageCompat() {
    }

    public static void deleteBrowsingData(WebStorage webStorage, Executor executor, Runnable runnable) {
        if (!WebViewFeatureInternal.DELETE_BROWSING_DATA.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webStorage).deleteBrowsingData(executor, runnable);
    }

    public static String deleteBrowsingDataForSite(WebStorage webStorage, String str, Executor executor, Runnable runnable) {
        if (WebViewFeatureInternal.DELETE_BROWSING_DATA.isSupportedByWebView()) {
            return getAdapter(webStorage).deleteBrowsingDataForSite(str, executor, runnable);
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebStorageAdapter getAdapter(WebStorage webStorage) {
        return WebViewGlueCommunicator.getCompatConverter().convertWebStorage(webStorage);
    }

    public static /* synthetic */ void lambda$deleteBrowsingData$0(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static /* synthetic */ void lambda$deleteBrowsingDataForSite$1(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static void deleteBrowsingData(WebStorage webStorage, Runnable runnable) {
        deleteBrowsingData(webStorage, new androidx.arch.core.executor.OooO00o(4), runnable);
    }

    public static String deleteBrowsingDataForSite(WebStorage webStorage, String str, Runnable runnable) {
        return deleteBrowsingDataForSite(webStorage, str, new androidx.arch.core.executor.OooO00o(3), runnable);
    }
}

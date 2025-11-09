package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class DownloadListenerProxyApi extends PigeonApiDownloadListener {

    public static class DownloadListenerImpl implements DownloadListener {
        private final DownloadListenerProxyApi api;

        public DownloadListenerImpl(@NonNull DownloadListenerProxyApi downloadListenerProxyApi) {
            this.api = downloadListenerProxyApi;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onDownloadStart$0(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onDownloadStart$1(String str, String str2, String str3, String str4, long j) {
            this.api.onDownloadStart(this, str, str2, str3, str4, j, new OooOO0(2));
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(@NonNull final String str, @NonNull final String str2, @NonNull final String str3, @NonNull final String str4, final long j) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.OooOOO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28793OooOo0O.lambda$onDownloadStart$1(str, str2, str3, str4, j);
                }
            });
        }
    }

    public DownloadListenerProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    @NonNull
    public DownloadListener pigeon_defaultConstructor() {
        return new DownloadListenerImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}

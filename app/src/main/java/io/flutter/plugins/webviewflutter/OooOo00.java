package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiAndroidMessage;
import io.flutter.plugins.webviewflutter.PigeonApiCertificate;
import io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback;
import io.flutter.plugins.webviewflutter.PigeonApiDownloadListener;
import io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback;
import io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewFeature;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements BasicMessageChannel.MessageHandler {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28805OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f28806OooO0O0;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f28805OooO00o = i;
        this.f28806OooO0O0 = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f28805OooO00o) {
            case 0:
                PigeonApiAndroidMessage.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiAndroidMessage) this.f28806OooO0O0, obj, reply);
                break;
            case 1:
                PigeonApiCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiCertificate) this.f28806OooO0O0, obj, reply);
                break;
            case 2:
                PigeonApiCustomViewCallback.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiCustomViewCallback) this.f28806OooO0O0, obj, reply);
                break;
            case 3:
                PigeonApiDownloadListener.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiDownloadListener) this.f28806OooO0O0, obj, reply);
                break;
            case 4:
                PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiGeolocationPermissionsCallback) this.f28806OooO0O0, obj, reply);
                break;
            case 5:
                PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiJavaScriptChannel) this.f28806OooO0O0, obj, reply);
                break;
            case 6:
                PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiWebSettingsCompat) this.f28806OooO0O0, obj, reply);
                break;
            default:
                PigeonApiWebViewFeature.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiWebViewFeature) this.f28806OooO0O0, obj, reply);
                break;
        }
    }
}

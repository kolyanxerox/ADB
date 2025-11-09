package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.o0OO0O0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PigeonApiWebChromeClient {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebChromeClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebChromeClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsPrompt(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnShowFileChooser(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnConsoleMessage(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsAlert(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsConfirm(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiWebChromeClient pigeonApiWebChromeClient) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebChromeClient == null || (pigeonRegistrar = pigeonApiWebChromeClient.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebChromeClient != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0Oo0oo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, reply);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebChromeClient != null) {
                final int i2 = 1;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0Oo0oo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, reply);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebChromeClient != null) {
                final int i3 = 2;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0Oo0oo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, reply);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebChromeClient != null) {
                final int i4 = 3;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0Oo0oo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, reply);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebChromeClient != null) {
                final int i5 = 4;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0Oo0oo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, reply);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebChromeClient == null) {
                basicMessageChannel6.setMessageHandler(null);
            } else {
                final int i6 = 5;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0Oo0oo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, reply);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, reply);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebChromeClient(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    public static /* synthetic */ void OooO0Oo(o00O0Oo.Oooo000 oooo000, Object obj) {
        onJsConfirm$lambda$9(oooo000, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", obj);
    }

    public static final void onConsoleMessage$lambda$7(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onGeolocationPermissionsHidePrompt$lambda$6(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onGeolocationPermissionsShowPrompt$lambda$5(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onHideCustomView$lambda$4(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onJsAlert$lambda$8(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    private static final void onJsConfirm$lambda$9(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
            return;
        }
        if (list.get(0) == null) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("null-error", "Flutter api returned null value for non-null return value.", ""), oooo000);
            return;
        }
        Object obj4 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        oooo000.invoke(new oo00o.OooOOO0((Boolean) obj4));
    }

    public static final void onJsPrompt$lambda$10(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            oooo000.invoke(new oo00o.OooOOO0((String) list.get(0)));
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onPermissionRequest$lambda$2(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onProgressChanged$lambda$0(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onShowCustomView$lambda$3(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Object obj2 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
    }

    public static final void onShowFileChooser$lambda$1(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
        if (!(obj instanceof List)) {
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), oooo000);
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), oooo000);
            return;
        }
        if (list.get(0) == null) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("null-error", "Flutter api returned null value for non-null return value.", ""), oooo000);
            return;
        }
        Object obj4 = list.get(0);
        kotlin.jvm.internal.OooOo.OooO0OO(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        oooo000.invoke(new oo00o.OooOOO0((List) obj4));
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public final void onConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, ConsoleMessage messageArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(messageArg, "messageArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, messageArg), new OooO0O0(27, callback));
        }
    }

    public final void onGeolocationPermissionsHidePrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", getPigeonRegistrar().getCodec()).send(o0OO0O0.OooOO0o(pigeon_instanceArg), new o0OOO0o(0, callback));
        }
    }

    public final void onGeolocationPermissionsShowPrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, String originArg, GeolocationPermissions.Callback callbackArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(originArg, "originArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callbackArg, "callbackArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, originArg, callbackArg), new OooO0O0(28, callback));
        }
    }

    public final void onHideCustomView(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", getPigeonRegistrar().getCodec()).send(o0OO0O0.OooOO0o(pigeon_instanceArg), new OooO0O0(20, callback));
        }
    }

    public final void onJsAlert(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewArg, "webViewArg");
        kotlin.jvm.internal.OooOo.OooO0o0(urlArg, "urlArg");
        kotlin.jvm.internal.OooOo.OooO0o0(messageArg, "messageArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, webViewArg, urlArg, messageArg), new OooO0O0(23, callback));
        }
    }

    public final void onJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewArg, "webViewArg");
        kotlin.jvm.internal.OooOo.OooO0o0(urlArg, "urlArg");
        kotlin.jvm.internal.OooOo.OooO0o0(messageArg, "messageArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, webViewArg, urlArg, messageArg), new o000000(1, callback));
        }
    }

    public final void onJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewArg, "webViewArg");
        kotlin.jvm.internal.OooOo.OooO0o0(urlArg, "urlArg");
        kotlin.jvm.internal.OooOo.OooO0o0(messageArg, "messageArg");
        kotlin.jvm.internal.OooOo.OooO0o0(defaultValueArg, "defaultValueArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, webViewArg, urlArg, messageArg, defaultValueArg), new OooO0O0(22, callback));
        }
    }

    public final void onPermissionRequest(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, PermissionRequest requestArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(requestArg, "requestArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, requestArg), new OooO0O0(25, callback));
        }
    }

    public final void onProgressChanged(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, long j, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewArg, "webViewArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, webViewArg, Long.valueOf(j)), new OooO0O0(21, callback));
        }
    }

    public final void onShowCustomView(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, View viewArg, WebChromeClient.CustomViewCallback callbackArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(viewArg, "viewArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callbackArg, "callbackArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, viewArg, callbackArg), new OooO0O0(26, callback));
        }
    }

    public final void onShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, WebChromeClient.FileChooserParams paramsArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewArg, "webViewArg");
        kotlin.jvm.internal.OooOo.OooO0o0(paramsArg, "paramsArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(pigeon_instanceArg, webViewArg, paramsArg), new OooO0O0(24, callback));
        }
    }

    public abstract WebChromeClientProxyApi.WebChromeClientImpl pigeon_defaultConstructor();

    public final void pigeon_newInstance(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, callback);
        } else {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""), callback);
        }
    }

    public abstract void setSynchronousReturnValueForOnConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnJsAlert(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);
}

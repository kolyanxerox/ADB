package io.flutter.plugins.webviewflutter;

import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.o0OO0O0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PigeonApiCookieManager {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiCookieManager.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiCookieManager.instance(), ((Long) obj2).longValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.OooOo.OooO0OO(obj4, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiCookieManager.setCookie(cookieManager, str, (String) obj4);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$6$lambda$5(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            pigeonApiCookieManager.removeAllCookies((CookieManager) obj2, new Oooo000(reply, 0));
        }

        public static final oo00o.OooOo setUpMessageHandlers$lambda$6$lambda$5$lambda$4(BasicMessageChannel.Reply reply, oo00o.OooOOO0 oooOOO0) {
            Throwable thOooO00o = oo00o.OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                Object obj = oooOOO0.f33191OooOo0O;
                if (obj instanceof oo00o.OooOO0O) {
                    obj = null;
                }
                reply.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapResult((Boolean) obj));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUpMessageHandlers$lambda$8$lambda$7(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.OooOo.OooO0OO(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiCookieManager.setAcceptThirdPartyCookies(cookieManager, webView, ((Boolean) obj4).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiCookieManager pigeonApiCookieManager) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            if (pigeonApiCookieManager == null || (pigeonRegistrar = pigeonApiCookieManager.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", androidWebkitLibraryPigeonCodec);
            if (pigeonApiCookieManager != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.Oooo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, reply);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, reply);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, reply);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", androidWebkitLibraryPigeonCodec);
            if (pigeonApiCookieManager != null) {
                final int i2 = 1;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.Oooo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, reply);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, reply);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, reply);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", androidWebkitLibraryPigeonCodec);
            if (pigeonApiCookieManager != null) {
                final int i3 = 2;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.Oooo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, reply);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, reply);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, reply);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", androidWebkitLibraryPigeonCodec);
            if (pigeonApiCookieManager == null) {
                basicMessageChannel4.setMessageHandler(null);
            } else {
                final int i4 = 3;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.Oooo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, reply);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, reply);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, reply);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, reply);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiCookieManager(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    public static final void pigeon_newInstance$lambda$0(o00O0Oo.Oooo000 oooo000, String str, Object obj) {
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

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public abstract CookieManager instance();

    public final void pigeon_newInstance(CookieManager pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(o0OO0O0.OooOO0o(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new OooO0O0(5, callback));
        }
    }

    public abstract void removeAllCookies(CookieManager cookieManager, o00O0Oo.Oooo000 oooo000);

    public abstract void setAcceptThirdPartyCookies(CookieManager cookieManager, WebView webView, boolean z);

    public abstract void setCookie(CookieManager cookieManager, String str, String str2);
}

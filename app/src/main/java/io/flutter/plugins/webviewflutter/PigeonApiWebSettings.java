package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.o0OO0O0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PigeonApiWebSettings {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDomStorageEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setMediaPlaybackRequiresUserGesture(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$13$lambda$12(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportZoom(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$15$lambda$14(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setLoadWithOverviewMode(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$17$lambda$16(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setUseWideViewPort(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$19$lambda$18(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDisplayZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$21$lambda$20(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setBuiltInZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$23$lambda$22(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowFileAccess(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$25$lambda$24(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowContentAccess(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$27$lambda$26(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setGeolocationEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$29$lambda$28(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebSettings.setTextZoom(webSettings, ((Long) obj3).longValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptCanOpenWindowsAutomatically(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$31$lambda$30(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                listWrapError = o0OO0O0.OooOO0o(pigeonApiWebSettings.getUserAgentString((WebSettings) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$33$lambda$32(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
            try {
                pigeonApiWebSettings.setMixedContentMode(webSettings, (MixedContentMode) obj3);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportMultipleWindows(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                pigeonApiWebSettings.setUserAgentString((WebSettings) obj2, (String) list.get(1));
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiWebSettings pigeonApiWebSettings) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebSettings == null || (pigeonRegistrar = pigeonApiWebSettings.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i2 = 15;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i3 = 16;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i4 = 1;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i5 = 2;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i6 = 3;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i7 = 4;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i8 = 5;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i9 = 6;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i10 = 7;
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i11 = 8;
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i12 = 9;
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i13 = 10;
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i13) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i14 = 11;
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i14) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i15 = 12;
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i15) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings != null) {
                final int i16 = 13;
                basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i16) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettings == null) {
                basicMessageChannel17.setMessageHandler(null);
            } else {
                final int i17 = 14;
                basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0OO00O
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i17) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, reply);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, reply);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, reply);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, reply);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, reply);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, reply);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, reply);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, reply);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, reply);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, reply);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, reply);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, reply);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, reply);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, reply);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, reply);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, reply);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, reply);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebSettings(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract String getUserAgentString(WebSettings webSettings);

    public final void pigeon_newInstance(WebSettings pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(o0OO0O0.OooOO0o(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new o0OOO0o(5, callback));
        }
    }

    public abstract void setAllowContentAccess(WebSettings webSettings, boolean z);

    public abstract void setAllowFileAccess(WebSettings webSettings, boolean z);

    public abstract void setBuiltInZoomControls(WebSettings webSettings, boolean z);

    public abstract void setDisplayZoomControls(WebSettings webSettings, boolean z);

    public abstract void setDomStorageEnabled(WebSettings webSettings, boolean z);

    public abstract void setGeolocationEnabled(WebSettings webSettings, boolean z);

    public abstract void setJavaScriptCanOpenWindowsAutomatically(WebSettings webSettings, boolean z);

    public abstract void setJavaScriptEnabled(WebSettings webSettings, boolean z);

    public abstract void setLoadWithOverviewMode(WebSettings webSettings, boolean z);

    public abstract void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z);

    public abstract void setMixedContentMode(WebSettings webSettings, MixedContentMode mixedContentMode);

    public abstract void setSupportMultipleWindows(WebSettings webSettings, boolean z);

    public abstract void setSupportZoom(WebSettings webSettings, boolean z);

    public abstract void setTextZoom(WebSettings webSettings, long j);

    public abstract void setUseWideViewPort(WebSettings webSettings, boolean z);

    public abstract void setUserAgentString(WebSettings webSettings, String str);
}

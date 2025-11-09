package io.flutter.plugins.webviewflutter;

import android.view.View;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.o0OO0O0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiView;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PigeonApiView {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiView pigeonApiView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            kotlin.jvm.internal.OooOo.OooO0OO(obj4, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiView.scrollTo(view, jLongValue, ((Long) obj4).longValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiView pigeonApiView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
            try {
                pigeonApiView.setOverScrollMode(view, (OverScrollMode) obj3);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiView pigeonApiView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            kotlin.jvm.internal.OooOo.OooO0OO(obj4, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiView.scrollBy(view, jLongValue, ((Long) obj4).longValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiView pigeonApiView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.view.View");
            try {
                listWrapError = o0OO0O0.OooOO0o(pigeonApiView.getScrollPosition((View) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiView pigeonApiView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiView.setVerticalScrollBarEnabled(view, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiView pigeonApiView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiView.setHorizontalScrollBarEnabled(view, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiView pigeonApiView) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            if (pigeonApiView == null || (pigeonRegistrar = pigeonApiView.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", androidWebkitLibraryPigeonCodec);
            if (pigeonApiView != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0ooOOo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiView, obj, reply);
                                break;
                            case 1:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiView, obj, reply);
                                break;
                            case 2:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiView, obj, reply);
                                break;
                            case 3:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiView, obj, reply);
                                break;
                            case 4:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiView, obj, reply);
                                break;
                            default:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiView, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", androidWebkitLibraryPigeonCodec);
            if (pigeonApiView != null) {
                final int i2 = 1;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0ooOOo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiView, obj, reply);
                                break;
                            case 1:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiView, obj, reply);
                                break;
                            case 2:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiView, obj, reply);
                                break;
                            case 3:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiView, obj, reply);
                                break;
                            case 4:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiView, obj, reply);
                                break;
                            default:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiView, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", androidWebkitLibraryPigeonCodec);
            if (pigeonApiView != null) {
                final int i3 = 2;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0ooOOo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiView, obj, reply);
                                break;
                            case 1:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiView, obj, reply);
                                break;
                            case 2:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiView, obj, reply);
                                break;
                            case 3:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiView, obj, reply);
                                break;
                            case 4:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiView, obj, reply);
                                break;
                            default:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiView, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", androidWebkitLibraryPigeonCodec);
            if (pigeonApiView != null) {
                final int i4 = 3;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0ooOOo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiView, obj, reply);
                                break;
                            case 1:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiView, obj, reply);
                                break;
                            case 2:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiView, obj, reply);
                                break;
                            case 3:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiView, obj, reply);
                                break;
                            case 4:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiView, obj, reply);
                                break;
                            default:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiView, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", androidWebkitLibraryPigeonCodec);
            if (pigeonApiView != null) {
                final int i5 = 4;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0ooOOo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiView, obj, reply);
                                break;
                            case 1:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiView, obj, reply);
                                break;
                            case 2:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiView, obj, reply);
                                break;
                            case 3:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiView, obj, reply);
                                break;
                            case 4:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiView, obj, reply);
                                break;
                            default:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiView, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", androidWebkitLibraryPigeonCodec);
            if (pigeonApiView == null) {
                basicMessageChannel6.setMessageHandler(null);
            } else {
                final int i6 = 5;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o0ooOOo
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiView, obj, reply);
                                break;
                            case 1:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiView, obj, reply);
                                break;
                            case 2:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiView, obj, reply);
                                break;
                            case 3:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiView, obj, reply);
                                break;
                            case 4:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiView, obj, reply);
                                break;
                            default:
                                PigeonApiView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiView, obj, reply);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiView(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract WebViewPoint getScrollPosition(View view);

    public final void pigeon_newInstance(View pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(o0OO0O0.OooOO0o(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new OooO0O0(19, callback));
        }
    }

    public abstract void scrollBy(View view, long j, long j2);

    public abstract void scrollTo(View view, long j, long j2);

    public abstract void setHorizontalScrollBarEnabled(View view, boolean z);

    public abstract void setOverScrollMode(View view, OverScrollMode overScrollMode);

    public abstract void setVerticalScrollBarEnabled(View view, boolean z);
}

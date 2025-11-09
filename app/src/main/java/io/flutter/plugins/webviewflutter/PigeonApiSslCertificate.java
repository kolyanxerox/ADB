package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.o0OO0O0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.PigeonApiSslCertificate;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PigeonApiSslCertificate {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiSslCertificate pigeonApiSslCertificate, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listWrapError = o0OO0O0.OooOO0o(pigeonApiSslCertificate.getIssuedBy((SslCertificate) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiSslCertificate pigeonApiSslCertificate, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listWrapError = o0OO0O0.OooOO0o(pigeonApiSslCertificate.getIssuedTo((SslCertificate) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiSslCertificate pigeonApiSslCertificate, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listWrapError = o0OO0O0.OooOO0o(pigeonApiSslCertificate.getValidNotAfterMsSinceEpoch((SslCertificate) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiSslCertificate pigeonApiSslCertificate, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listWrapError = o0OO0O0.OooOO0o(pigeonApiSslCertificate.getValidNotBeforeMsSinceEpoch((SslCertificate) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiSslCertificate pigeonApiSslCertificate, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.OooOo.OooO0o0(reply, "reply");
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.OooOo.OooO0OO(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listWrapError = o0OO0O0.OooOO0o(pigeonApiSslCertificate.getX509Certificate((SslCertificate) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiSslCertificate pigeonApiSslCertificate) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            if (pigeonApiSslCertificate == null || (pigeonRegistrar = pigeonApiSslCertificate.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", androidWebkitLibraryPigeonCodec);
            if (pigeonApiSslCertificate != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o00Oo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 1:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 2:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 3:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiSslCertificate, obj, reply);
                                break;
                            default:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiSslCertificate, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", androidWebkitLibraryPigeonCodec);
            if (pigeonApiSslCertificate != null) {
                final int i2 = 1;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o00Oo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 1:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 2:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 3:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiSslCertificate, obj, reply);
                                break;
                            default:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiSslCertificate, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", androidWebkitLibraryPigeonCodec);
            if (pigeonApiSslCertificate != null) {
                final int i3 = 2;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o00Oo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 1:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 2:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 3:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiSslCertificate, obj, reply);
                                break;
                            default:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiSslCertificate, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", androidWebkitLibraryPigeonCodec);
            if (pigeonApiSslCertificate != null) {
                final int i4 = 3;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o00Oo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 1:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 2:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 3:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiSslCertificate, obj, reply);
                                break;
                            default:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiSslCertificate, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", androidWebkitLibraryPigeonCodec);
            if (pigeonApiSslCertificate == null) {
                basicMessageChannel5.setMessageHandler(null);
            } else {
                final int i5 = 4;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o00Oo0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 1:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 2:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiSslCertificate, obj, reply);
                                break;
                            case 3:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiSslCertificate, obj, reply);
                                break;
                            default:
                                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiSslCertificate, obj, reply);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiSslCertificate(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract SslCertificate.DName getIssuedBy(SslCertificate sslCertificate);

    public abstract SslCertificate.DName getIssuedTo(SslCertificate sslCertificate);

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public abstract Long getValidNotAfterMsSinceEpoch(SslCertificate sslCertificate);

    public abstract Long getValidNotBeforeMsSinceEpoch(SslCertificate sslCertificate);

    public abstract X509Certificate getX509Certificate(SslCertificate sslCertificate);

    public final void pigeon_newInstance(SslCertificate pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(o0OO0O0.OooOO0o(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new OooO0O0(15, callback));
        }
    }
}

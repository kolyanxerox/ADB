package io.flutter.plugins.firebase.firebaseremoteconfig;

import com.google.android.gms.internal.measurement.o0OOO0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import oo00o.OooO0OO;
import oo00o.OooOO0O;
import oo00o.OooOOO0;

/* loaded from: classes3.dex */
public interface FirebaseRemoteConfigHostApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final OooO0OO codec$delegate = o0OOO0.OooO0oo(new com.ironsource.mediationsdk.OooO0OO(2));

        private Companion() {
        }

        public static final GeneratedAndroidFirebaseRemoteConfigPigeonCodec codec_delegate$lambda$0() {
            return new GeneratedAndroidFirebaseRemoteConfigPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, firebaseRemoteConfigHostApi, str);
        }

        public static final void setUp$lambda$12$lambda$11(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
            firebaseRemoteConfigHostApi.setConfigSettings((String) obj2, (RemoteConfigPigeonSettings) obj3, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 15));
        }

        public static final oo00o.OooOo setUp$lambda$12$lambda$11$lambda$10(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$15$lambda$14(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            firebaseRemoteConfigHostApi.setDefaults((String) obj2, (Map) obj3, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 11));
        }

        public static final oo00o.OooOo setUp$lambda$15$lambda$14$lambda$13(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$18$lambda$17(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.ensureInitialized((String) obj2, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 14));
        }

        public static final oo00o.OooOo setUp$lambda$18$lambda$17$lambda$16(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$21$lambda$20(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            firebaseRemoteConfigHostApi.setCustomSignals((String) obj2, (Map) obj3, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 17));
        }

        public static final oo00o.OooOo setUp$lambda$21$lambda$20$lambda$19(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$24$lambda$23(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.getAll((String) obj2, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 16));
        }

        public static final oo00o.OooOo setUp$lambda$24$lambda$23$lambda$22(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                Object obj = oooOOO0.f33191OooOo0O;
                if (obj instanceof OooOO0O) {
                    obj = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Map) obj));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$27$lambda$26(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.getProperties((String) obj2, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 13));
        }

        public static final oo00o.OooOo setUp$lambda$27$lambda$26$lambda$25(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                Object obj = oooOOO0.f33191OooOo0O;
                if (obj instanceof OooOO0O) {
                    obj = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Map) obj));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$3$lambda$2(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.fetch((String) obj2, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 18));
        }

        public static final oo00o.OooOo setUp$lambda$3$lambda$2$lambda$1(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$6$lambda$5(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.fetchAndActivate((String) obj2, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 12));
        }

        public static final oo00o.OooOo setUp$lambda$6$lambda$5$lambda$4(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                Object obj = oooOOO0.f33191OooOo0O;
                if (obj instanceof OooOO0O) {
                    obj = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Boolean) obj));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$9$lambda$8(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.activate((String) obj2, new io.flutter.plugins.firebase.analytics.OooO0O0(reply, 19));
        }

        public static final oo00o.OooOo setUp$lambda$9$lambda$8$lambda$7(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                Object obj = oooOOO0.f33191OooOo0O;
                if (obj instanceof OooOO0O) {
                    obj = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Boolean) obj));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) codec$delegate.getValue();
        }

        public final void setUp(BinaryMessenger binaryMessenger, FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi) {
            OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, firebaseRemoteConfigHostApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, String messageChannelSuffix) {
            OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            OooOo.OooO0o0(messageChannelSuffix, "messageChannelSuffix");
            String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.fetch", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.fetchAndActivate", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i2 = 1;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.activate", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i3 = 2;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setConfigSettings", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i4 = 3;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setDefaults", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i5 = 4;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.ensureInitialized", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i6 = 5;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setCustomSignals", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i7 = 6;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.getAll", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi != null) {
                final int i8 = 7;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.getProperties", strConcat), getCodec());
            if (firebaseRemoteConfigHostApi == null) {
                basicMessageChannel9.setMessageHandler(null);
            } else {
                final int i9 = 8;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                            default:
                                FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(firebaseRemoteConfigHostApi, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    void activate(String str, Oooo000 oooo000);

    void ensureInitialized(String str, Oooo000 oooo000);

    void fetch(String str, Oooo000 oooo000);

    void fetchAndActivate(String str, Oooo000 oooo000);

    void getAll(String str, Oooo000 oooo000);

    void getProperties(String str, Oooo000 oooo000);

    void setConfigSettings(String str, RemoteConfigPigeonSettings remoteConfigPigeonSettings, Oooo000 oooo000);

    void setCustomSignals(String str, Map<String, ? extends Object> map, Oooo000 oooo000);

    void setDefaults(String str, Map<String, ? extends Object> map, Oooo000 oooo000);
}

package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.internal.measurement.o0OOO0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import oo00o.OooOO0O;
import oo00o.OooOOO0;

/* loaded from: classes3.dex */
public interface FirebaseAnalyticsHostApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final oo00o.OooO0OO codec$delegate = o0OOO0.OooO0oo(new com.ironsource.mediationsdk.OooO0OO(1));

        private Companion() {
        }

        public static final GeneratedAndroidFirebaseAnalyticsPigeonCodec codec_delegate$lambda$0() {
            return new GeneratedAndroidFirebaseAnalyticsPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, firebaseAnalyticsHostApi, str);
        }

        public static final void setUp$lambda$12$lambda$11(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            firebaseAnalyticsHostApi.setAnalyticsCollectionEnabled(((Boolean) obj2).booleanValue(), new OooO0O0(reply, 4));
        }

        public static final oo00o.OooOo setUp$lambda$12$lambda$11$lambda$10(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$15$lambda$14(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            firebaseAnalyticsHostApi.resetAnalyticsData(new OooO0O0(reply, 2));
        }

        public static final oo00o.OooOo setUp$lambda$15$lambda$14$lambda$13(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$18$lambda$17(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.Long");
            firebaseAnalyticsHostApi.setSessionTimeoutDuration(((Long) obj2).longValue(), new OooO0O0(reply, 10));
        }

        public static final oo00o.OooOo setUp$lambda$18$lambda$17$lambda$16(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$21$lambda$20(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
            firebaseAnalyticsHostApi.setConsent((Map) obj2, new OooO0O0(reply, 7));
        }

        public static final oo00o.OooOo setUp$lambda$21$lambda$20$lambda$19(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$24$lambda$23(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            firebaseAnalyticsHostApi.setDefaultEventParameters((Map) ((List) obj).get(0), new OooO0O0(reply, 3));
        }

        public static final oo00o.OooOo setUp$lambda$24$lambda$23$lambda$22(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$27$lambda$26(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            firebaseAnalyticsHostApi.getAppInstanceId(new OooO0O0(reply, 9));
        }

        public static final oo00o.OooOo setUp$lambda$27$lambda$26$lambda$25(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                Object obj = oooOOO0.f33191OooOo0O;
                if (obj instanceof OooOO0O) {
                    obj = null;
                }
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult((String) obj));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$3$lambda$2(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            firebaseAnalyticsHostApi.logEvent((Map) obj2, new OooO0O0(reply, 5));
        }

        public static final oo00o.OooOo setUp$lambda$3$lambda$2$lambda$1(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$30$lambda$29(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            firebaseAnalyticsHostApi.getSessionId(new OooO0O0(reply, 0));
        }

        public static final oo00o.OooOo setUp$lambda$30$lambda$29$lambda$28(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                Object obj = oooOOO0.f33191OooOo0O;
                if (obj instanceof OooOO0O) {
                    obj = null;
                }
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult((Long) obj));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$33$lambda$32(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            firebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement((Map) obj2, new OooO0O0(reply, 1));
        }

        public static final oo00o.OooOo setUp$lambda$33$lambda$32$lambda$31(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$6$lambda$5(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            firebaseAnalyticsHostApi.setUserId((String) ((List) obj).get(0), new OooO0O0(reply, 8));
        }

        public static final oo00o.OooOo setUp$lambda$6$lambda$5$lambda$4(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public static final void setUp$lambda$9$lambda$8(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseAnalyticsHostApi.setUserProperty((String) obj2, (String) list.get(1), new OooO0O0(reply, 6));
        }

        public static final oo00o.OooOo setUp$lambda$9$lambda$8$lambda$7(BasicMessageChannel.Reply reply, OooOOO0 oooOOO0) {
            Throwable thOooO00o = OooOOO0.OooO00o(oooOOO0.f33191OooOo0O);
            if (thOooO00o != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thOooO00o));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) codec$delegate.getValue();
        }

        public final void setUp(BinaryMessenger binaryMessenger, FirebaseAnalyticsHostApi firebaseAnalyticsHostApi) {
            OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, firebaseAnalyticsHostApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, String messageChannelSuffix) {
            OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            OooOo.OooO0o0(messageChannelSuffix, "messageChannelSuffix");
            String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i2 = 3;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i3 = 4;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i4 = 5;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i5 = 6;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i6 = 7;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i7 = 8;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i8 = 9;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i9 = 10;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId", strConcat), getCodec());
            if (firebaseAnalyticsHostApi != null) {
                final int i10 = 1;
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement", strConcat), getCodec());
            if (firebaseAnalyticsHostApi == null) {
                basicMessageChannel11.setMessageHandler(null);
            } else {
                final int i11 = 2;
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.OooO00o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 1:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 2:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 3:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 4:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 5:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 6:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 7:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 8:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            case 9:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(firebaseAnalyticsHostApi, obj, reply);
                                break;
                            default:
                                FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(firebaseAnalyticsHostApi, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    void getAppInstanceId(Oooo000 oooo000);

    void getSessionId(Oooo000 oooo000);

    void initiateOnDeviceConversionMeasurement(Map<String, String> map, Oooo000 oooo000);

    void logEvent(Map<String, ? extends Object> map, Oooo000 oooo000);

    void resetAnalyticsData(Oooo000 oooo000);

    void setAnalyticsCollectionEnabled(boolean z, Oooo000 oooo000);

    void setConsent(Map<String, Boolean> map, Oooo000 oooo000);

    void setDefaultEventParameters(Map<String, ? extends Object> map, Oooo000 oooo000);

    void setSessionTimeoutDuration(long j, Oooo000 oooo000);

    void setUserId(String str, Oooo000 oooo000);

    void setUserProperty(String str, String str2, Oooo000 oooo000);
}

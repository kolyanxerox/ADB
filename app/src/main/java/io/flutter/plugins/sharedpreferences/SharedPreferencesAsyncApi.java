package io.flutter.plugins.sharedpreferences;

import com.google.android.gms.internal.measurement.o0OO0O0;
import com.google.android.gms.internal.measurement.o0OOO0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import oo00o.OooO0OO;

/* loaded from: classes3.dex */
public interface SharedPreferencesAsyncApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final OooO0OO codec$delegate = o0OOO0.OooO0oo(new com.ironsource.mediationsdk.OooO0OO(3));

        private Companion() {
        }

        public static final MessagesAsyncPigeonCodec codec_delegate$lambda$0() {
            return new MessagesAsyncPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, sharedPreferencesAsyncApi, str);
        }

        public static final void setUp$lambda$10$lambda$9(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            OooOo.OooO0OO(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setEncodedStringList(str, str2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$12$lambda$11(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List<String> list2 = (List) obj3;
            Object obj4 = list.get(2);
            OooOo.OooO0OO(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDeprecatedStringList(str, list2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$14$lambda$13(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getString(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$16$lambda$15(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getBool(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$18$lambda$17(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getDouble(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$2$lambda$1(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            OooOo.OooO0OO(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setBool(str, zBooleanValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$20$lambda$19(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getInt(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$22$lambda$21(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getPlatformEncodedStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$24$lambda$23(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$26$lambda$25(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.clear(list2, (SharedPreferencesPigeonOptions) obj2);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$28$lambda$27(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getAll(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$30$lambda$29(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = o0OO0O0.OooOO0o(sharedPreferencesAsyncApi.getKeys(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$4$lambda$3(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            OooOo.OooO0OO(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setString(str, str2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$6$lambda$5(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            OooOo.OooO0OO(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setInt(str, jLongValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public static final void setUp$lambda$8$lambda$7(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            OooOo.OooO0o0(reply, "reply");
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            OooOo.OooO0OO(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDouble(str, dDoubleValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) codec$delegate.getValue();
        }

        public final void setUp(BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
            OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, sharedPreferencesAsyncApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String messageChannelSuffix) {
            OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            OooOo.OooO0o0(messageChannelSuffix, "messageChannelSuffix");
            String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i2 = 11;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i3 = 12;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i4 = 13;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i5 = 14;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i6 = 1;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i7 = 2;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i8 = 3;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i9 = 4;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i10 = 5;
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i11 = 6;
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i12 = 7;
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i13 = 8;
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i13) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i14 = 9;
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i14) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, OooO0oO.OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi == null) {
                basicMessageChannel15.setMessageHandler(null);
            } else {
                final int i15 = 10;
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.OooO0O0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i15) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getPlatformEncodedStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    StringListResult getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setBool(String str, boolean z, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDeprecatedStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDouble(String str, double d, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setEncodedStringList(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setInt(String str, long j, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);
}

package io.flutter.plugins.sharedpreferences;

import OooO0oO.OooOo;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.sharedpreferences.Messages;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Messages {

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            return super.readValueOfType(b, byteBuffer);
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    public interface SharedPreferencesApi {
        @NonNull
        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, sharedPreferencesApi.remove((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$1(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setBool((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$2(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setString((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$3(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setInt((String) arrayList2.get(0), (Long) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$4(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$5(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setEncodedStringList((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$6(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setDeprecatedStringList((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$7(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.clear((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setUp$8(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.getAll((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable SharedPreferencesApi sharedPreferencesApi) {
            setUp(binaryMessenger, "", sharedPreferencesApi);
        }

        @NonNull
        Boolean clear(@NonNull String str, @Nullable List<String> list);

        @NonNull
        Map<String, Object> getAll(@NonNull String str, @Nullable List<String> list);

        @NonNull
        Boolean remove(@NonNull String str);

        @NonNull
        Boolean setBool(@NonNull String str, @NonNull Boolean bool);

        @NonNull
        Boolean setDeprecatedStringList(@NonNull String str, @NonNull List<String> list);

        @NonNull
        Boolean setDouble(@NonNull String str, @NonNull Double d);

        @NonNull
        Boolean setEncodedStringList(@NonNull String str, @NonNull String str2);

        @NonNull
        Boolean setInt(@NonNull String str, @NonNull Long l);

        @NonNull
        Boolean setString(@NonNull String str, @NonNull String str2);

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable final SharedPreferencesApi sharedPreferencesApi) {
            String strConcat = str.isEmpty() ? "" : ".".concat(str);
            BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i2 = 1;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i2) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i3 = 2;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i3) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i4 = 3;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i5 = 4;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i6 = 5;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i7 = 6;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                final int i8 = 7;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, OooOo.OooOO0("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi == null) {
                basicMessageChannel9.setMessageHandler(null);
            } else {
                final int i9 = 8;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: io.flutter.plugins.sharedpreferences.OooO00o

                    /* renamed from: OooO0O0, reason: collision with root package name */
                    public final /* synthetic */ Messages.SharedPreferencesApi f28778OooO0O0;

                    {
                        this.f28778OooO0O0 = sharedPreferencesApi;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                Messages.SharedPreferencesApi.lambda$setUp$0(this.f28778OooO0O0, obj, reply);
                                break;
                            case 1:
                                Messages.SharedPreferencesApi.lambda$setUp$1(this.f28778OooO0O0, obj, reply);
                                break;
                            case 2:
                                Messages.SharedPreferencesApi.lambda$setUp$2(this.f28778OooO0O0, obj, reply);
                                break;
                            case 3:
                                Messages.SharedPreferencesApi.lambda$setUp$3(this.f28778OooO0O0, obj, reply);
                                break;
                            case 4:
                                Messages.SharedPreferencesApi.lambda$setUp$4(this.f28778OooO0O0, obj, reply);
                                break;
                            case 5:
                                Messages.SharedPreferencesApi.lambda$setUp$5(this.f28778OooO0O0, obj, reply);
                                break;
                            case 6:
                                Messages.SharedPreferencesApi.lambda$setUp$6(this.f28778OooO0O0, obj, reply);
                                break;
                            case 7:
                                Messages.SharedPreferencesApi.lambda$setUp$7(this.f28778OooO0O0, obj, reply);
                                break;
                            default:
                                Messages.SharedPreferencesApi.lambda$setUp$8(this.f28778OooO0O0, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}

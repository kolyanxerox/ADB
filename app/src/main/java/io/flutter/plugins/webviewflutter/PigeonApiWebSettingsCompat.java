package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import androidx.webkit.WebSettingsCompat;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.o0OO0O0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PigeonApiWebSettingsCompat {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebSettingsCompat pigeonApiWebSettingsCompat, Object obj, BasicMessageChannel.Reply reply) {
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
                pigeonApiWebSettingsCompat.setPaymentRequestEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = o0OO0O0.OooOO0o(null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, PigeonApiWebSettingsCompat pigeonApiWebSettingsCompat) {
            MessageCodec<Object> androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.OooOo.OooO0o0(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebSettingsCompat == null || (pigeonRegistrar = pigeonApiWebSettingsCompat.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", androidWebkitLibraryPigeonCodec);
            if (pigeonApiWebSettingsCompat != null) {
                basicMessageChannel.setMessageHandler(new OooOo00(pigeonApiWebSettingsCompat, 6));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebSettingsCompat(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public final void pigeon_newInstance(WebSettingsCompat pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, callback);
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(o0OO0O0.OooOO0o(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new o0OOO0o(6, callback));
        }
    }

    public abstract void setPaymentRequestEnabled(WebSettings webSettings, boolean z);
}

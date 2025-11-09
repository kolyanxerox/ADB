package io.flutter.plugins.webviewflutter;

import androidx.webkit.WebResourceErrorCompat;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PigeonApiWebResourceErrorCompat {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public PigeonApiWebResourceErrorCompat(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract String description(WebResourceErrorCompat webResourceErrorCompat);

    public abstract long errorCode(WebResourceErrorCompat webResourceErrorCompat);

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public final void pigeon_newInstance(WebResourceErrorCompat pigeon_instanceArg, o00O0Oo.Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            AbstractC2183w4.OooOOoo(AbstractC2183w4.OooOOOO("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
            return;
        }
        if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, callback);
            return;
        }
        long jAddHostCreatedInstance = getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg);
        long jErrorCode = errorCode(pigeon_instanceArg);
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(o00O0.OooOo.OooOOo(Long.valueOf(jAddHostCreatedInstance), Long.valueOf(jErrorCode), description(pigeon_instanceArg)), new o0OOO0o(2, callback));
    }
}

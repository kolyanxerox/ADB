package io.flutter.plugins.webviewflutter;

import android.util.Log;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.List;

/* loaded from: classes3.dex */
final class AndroidWebkitLibraryPigeonUtils {
    public static final AndroidWebkitLibraryPigeonUtils INSTANCE = new AndroidWebkitLibraryPigeonUtils();

    private AndroidWebkitLibraryPigeonUtils() {
    }

    public final AndroidWebKitError createConnectionError(String channelName) {
        kotlin.jvm.internal.OooOo.OooO0o0(channelName, "channelName");
        return new AndroidWebKitError("channel-error", OooO0oO.OooOo.OooOO0O("Unable to establish connection on channel: '", channelName, "'."), "");
    }

    public final List<Object> wrapError(Throwable exception) {
        kotlin.jvm.internal.OooOo.OooO0o0(exception, "exception");
        if (exception instanceof AndroidWebKitError) {
            AndroidWebKitError androidWebKitError = (AndroidWebKitError) exception;
            return o00O0.OooOo.OooOOo(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
        }
        return o00O0.OooOo.OooOOo(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }

    public final List<Object> wrapResult(Object obj) {
        return o0OO0O0.OooOO0o(obj);
    }
}

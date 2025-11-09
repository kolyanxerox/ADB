package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.List;
import o00O0.OooOo;

/* loaded from: classes3.dex */
public final class MessagesAsync_gKt {
    public static final List<Object> wrapError(Throwable th) {
        if (th instanceof SharedPreferencesError) {
            SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) th;
            return OooOo.OooOOo(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
        }
        return OooOo.OooOOo(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    private static final List<Object> wrapResult(Object obj) {
        return o0OO0O0.OooOO0o(obj);
    }
}

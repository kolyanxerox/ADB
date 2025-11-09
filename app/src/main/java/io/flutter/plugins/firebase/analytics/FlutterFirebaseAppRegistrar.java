package io.flutter.plugins.firebase.analytics;

import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o0000oo0.o00Oo0;

@Keep
/* loaded from: classes3.dex */
public final class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o00Oo0> getComponents() {
        return o0OO0O0.OooOO0o(OooO00o.OooO00o.OooO0Oo(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}

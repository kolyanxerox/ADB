package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import o0000oo0.o00Oo0;

@Keep
/* loaded from: classes3.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o00Oo0> getComponents() {
        return Collections.singletonList(OooO00o.OooO00o.OooO0Oo(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}

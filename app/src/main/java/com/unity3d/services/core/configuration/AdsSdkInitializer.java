package com.unity3d.services.core.configuration;

import OoooOOo.oOO0O00O;
import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.List;
import o00O0.oo000o;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AdsSdkInitializer implements Initializer<OooOo> {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ OooOo create(Context context) {
        create2(context);
        return OooOo.f33195OooO00o;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return oo000o.f31251OooOo0O;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.OooOo.OooO0OO(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        try {
            oOO0O00O.OooO00o(context);
        } catch (Throwable unused) {
        }
    }
}

package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3045dk;
import com.ironsource.InterfaceC3267js;

@Deprecated
/* loaded from: classes2.dex */
public class SSAFactory {
    public static InterfaceC3267js getPublisherInstance(Activity activity) throws Exception {
        return C3045dk.m8333b((Context) activity);
    }

    public static InterfaceC3267js getPublisherTestInstance(Activity activity, int i) throws Exception {
        return C3045dk.m8327a(activity, i);
    }
}

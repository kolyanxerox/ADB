package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.C3034d9;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes2.dex */
public class InterstitialActivity extends ControllerActivity {

    /* renamed from: r */
    private static final String f11388r = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m12266i(f11388r, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.m12266i(f11388r, C3034d9.h.f8132t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.m12266i(f11388r, C3034d9.h.f8134u0);
    }
}

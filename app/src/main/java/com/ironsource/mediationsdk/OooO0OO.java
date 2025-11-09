package com.ironsource.mediationsdk;

import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0OO implements o00O0Oo.OooO0O0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28499OooOo0O;

    public /* synthetic */ OooO0OO(int i) {
        this.f28499OooOo0O = i;
    }

    @Override // o00O0Oo.OooO0O0
    public final Object invoke() {
        switch (this.f28499OooOo0O) {
            case 0:
                return Long.valueOf(System.currentTimeMillis());
            case 1:
                return FirebaseAnalyticsHostApi.Companion.codec_delegate$lambda$0();
            case 2:
                return FirebaseRemoteConfigHostApi.Companion.codec_delegate$lambda$0();
            case 3:
                return SharedPreferencesAsyncApi.Companion.codec_delegate$lambda$0();
            default:
                return 33554432;
        }
    }
}

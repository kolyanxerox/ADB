package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o000O0O0;
import com.google.android.gms.internal.measurement.o00O00OO;

/* loaded from: classes2.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o00O00OO o00o00ooOooO0o0 = o00O00OO.OooO0o0(this, null);
        Intent intent = getIntent();
        o00o00ooOooO0o0.getClass();
        o00o00ooOooO0o0.OooO0OO(new o000O0O0(o00o00ooOooO0o0, intent, 2));
        finish();
    }
}

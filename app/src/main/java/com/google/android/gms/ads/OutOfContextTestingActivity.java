package com.google.android.gms.ads;

import Oooo0o.OooO0OO;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.internal.ads.BinderC2082te;

/* loaded from: classes2.dex */
public final class OutOfContextTestingActivity extends Activity {

    @NonNull
    public static final String AD_UNIT_KEY = "adUnit";

    @NonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdu zzduVarZzh = zzbc.zza().zzh(this, new BinderC2082te());
        if (zzduVarZzh == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzduVarZzh.zze(stringExtra, new OooO0OO(this), new OooO0OO(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}

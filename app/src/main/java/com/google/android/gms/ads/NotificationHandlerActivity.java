package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.InterfaceC1605gh;

/* loaded from: classes2.dex */
public final class NotificationHandlerActivity extends Activity {

    @NonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            InterfaceC1605gh interfaceC1605ghZzo = zzbc.zza().zzo(this, new BinderC2082te());
            if (interfaceC1605ghZzo == null) {
                zzo.zzg("OfflineUtils is null");
            } else {
                interfaceC1605ghZzo.OooOOo(getIntent());
            }
        } catch (RemoteException e) {
            zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}

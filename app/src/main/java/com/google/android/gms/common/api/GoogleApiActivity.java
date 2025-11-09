package com.google.android.gms.common.api;

import OooO0oO.OooOo;
import OooOooo.o000O0;
import OooOooo.o000Oo0;
import Oooo00O.o000000O;
import OoooO0.OooOO0O;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.OooO0o;

@KeepName
/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f16681OooOo0o = 0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f16682OooOo0O = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f16682OooOo0O = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                OooO0o oooO0oOooO0o0 = OooO0o.OooO0o0(this);
                if (i2 == -1) {
                    OooOO0O oooOO0O = oooO0oOooO0o0.f16711Oooo00o;
                    oooOO0O.sendMessage(oooOO0O.obtainMessage(3));
                } else if (i2 == 0) {
                    oooO0oOooO0o0.OooO0o(new o000Oo0(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f16682OooOo0O = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f16682OooOo0O = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f16682OooOo0O = bundle.getInt("resolution");
        }
        if (this.f16682OooOo0O != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                o000000O.OooO0oo(num);
                o000O0.f13666OooO0Oo.OooO0o0(this, num.intValue(), this);
                this.f16682OooOo0O = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e) {
                e = e;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f16682OooOo0O = 1;
            } catch (ActivityNotFoundException e3) {
                e = e3;
                if (extras.getBoolean("notify_manager", true)) {
                    OooO0o.OooO0o0(this).OooO0o(new o000Oo0(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strOooOO0O = OooOo.OooOO0O("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strOooOO0O = strOooOO0O.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strOooOO0O, e);
                }
                googleApiActivity.f16682OooOo0O = 1;
                finish();
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f16682OooOo0O);
        super.onSaveInstanceState(bundle);
    }
}

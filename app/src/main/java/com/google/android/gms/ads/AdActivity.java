package com.google.android.gms.ads;

import Oooo0o.OooO0OO;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.InterfaceC1863nh;

/* loaded from: classes2.dex */
public final class AdActivity extends Activity {

    @NonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    /* renamed from: OooOo0O, reason: collision with root package name */
    public InterfaceC1863nh f15875OooOo0O;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzh(i, i2, intent);
            }
        } catch (Exception e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                if (!interfaceC1863nh.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            InterfaceC1863nh interfaceC1863nh2 = this.f15875OooOo0O;
            if (interfaceC1863nh2 != null) {
                interfaceC1863nh2.zzi();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzk(new OooO0OO(configuration));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC1863nh interfaceC1863nhZzq = zzbc.zza().zzq(this);
        this.f15875OooOo0O = interfaceC1863nhZzq;
        if (interfaceC1863nhZzq == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC1863nhZzq.zzl(bundle);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzm();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzo();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzq();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzr();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzs(bundle);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzt();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzu();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
            if (interfaceC1863nh != null) {
                interfaceC1863nh.zzv();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
        if (interfaceC1863nh != null) {
            try {
                interfaceC1863nh.zzx();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
        if (interfaceC1863nh != null) {
            try {
                interfaceC1863nh.zzx();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        InterfaceC1863nh interfaceC1863nh = this.f15875OooOo0O;
        if (interfaceC1863nh != null) {
            try {
                interfaceC1863nh.zzx();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}

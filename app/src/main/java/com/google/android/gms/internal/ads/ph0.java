package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class ph0 extends BroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23347OooO00o;

    public /* synthetic */ ph0(int i) {
        this.f23347OooO00o = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f23347OooO00o) {
            case 0:
                boolean zEquals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                qh0 qh0Var = qh0.f23613OooO0Oo;
                if (!zEquals) {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        qh0Var.OooO00o(false, qh0Var.f23616OooO0OO);
                        qh0Var.f23615OooO0O0 = false;
                        break;
                    }
                } else {
                    qh0Var.OooO00o(true, qh0Var.f23616OooO0OO);
                    qh0Var.f23615OooO0O0 = true;
                    break;
                }
                break;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra != 0) {
                        if (intExtra == 1) {
                            af0.f17027OooO = 2;
                            break;
                        }
                    } else {
                        af0.f17027OooO = 1;
                        break;
                    }
                }
                break;
        }
    }
}

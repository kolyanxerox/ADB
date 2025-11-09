package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C2635a9;
import com.ironsource.C3551q9;
import com.ironsource.InterfaceC3522pf;
import com.ironsource.InterfaceC3557qf;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BroadcastReceiverStrategy implements InterfaceC3522pf {

    /* renamed from: a */
    private final InterfaceC3557qf f11849a;

    /* renamed from: b */
    private BroadcastReceiver f11850b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strM4798b = C2635a9.m4798b(context);
            if (strM4798b.equals("none")) {
                BroadcastReceiverStrategy.this.f11849a.mo11554a();
            } else {
                BroadcastReceiverStrategy.this.f11849a.mo11555a(strM4798b, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC3557qf interfaceC3557qf) {
        this.f11849a = interfaceC3557qf;
    }

    @Override // com.ironsource.InterfaceC3522pf
    /* renamed from: b */
    public void mo9863b(Context context) {
        try {
            context.registerReceiver(this.f11850b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3522pf
    /* renamed from: c */
    public JSONObject mo9864c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC3522pf
    /* renamed from: a */
    public void mo9861a() {
        this.f11850b = null;
    }

    @Override // com.ironsource.InterfaceC3522pf
    /* renamed from: a */
    public void mo9862a(Context context) {
        try {
            context.unregisterReceiver(this.f11850b);
        } catch (IllegalArgumentException e) {
            C3551q9.m11517d().m11519a(e);
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }
}

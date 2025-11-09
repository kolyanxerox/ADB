package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import OooOOO.OooO0OO;
import OooOOo0.OooOo;
import OooOOo0.o0Oo0oo;
import OooOo0o.OooO;
import OooOo0o.OooOOOO;
import OooOo0o.Oooo0;
import OooOoOO.o000;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f15872OooO00o = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o0Oo0oo.OooO0O0(context);
        if (queryParameter == null) {
            throw new NullPointerException("Null backendName");
        }
        OooO0OO oooO0OOOooO0O0 = o000.OooO0O0(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        Oooo0 oooo0 = o0Oo0oo.OooO00o().f13526OooO0Oo;
        OooOo oooOo = new OooOo(queryParameter, bArrDecode, oooO0OOOooO0O0);
        OooO oooO = new OooO(0);
        oooo0.getClass();
        oooo0.f13636OooO0o0.execute(new OooOOOO(oooo0, oooOo, i, oooO, 0));
    }
}

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.ng */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC1862ng implements DialogInterface.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f21486OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1900og f21487OooOo0o;

    public /* synthetic */ DialogInterfaceOnClickListenerC1862ng(C1900og c1900og, int i) {
        this.f21486OooOo0O = i;
        this.f21487OooOo0o = c1900og;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        switch (this.f21486OooOo0O) {
            case 0:
                C1900og c1900og = this.f21487OooOo0o;
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra(C3034d9.h.f8063D0, c1900og.f22987OooOoOO);
                data.putExtra("eventLocation", c1900og.f22991OooOooo);
                data.putExtra("description", c1900og.f22990OooOooO);
                long j = c1900og.f22989OooOoo0;
                if (j > -1) {
                    data.putExtra("beginTime", j);
                }
                long j2 = c1900og.f22988OooOoo;
                if (j2 > -1) {
                    data.putExtra("endTime", j2);
                }
                data.setFlags(268435456);
                zzv.zzq();
                zzs.zzT(c1900og.f22985OooOoO, data);
                break;
            default:
                this.f21487OooOo0o.OooOOO0("Operation denied by user.");
                break;
        }
    }
}

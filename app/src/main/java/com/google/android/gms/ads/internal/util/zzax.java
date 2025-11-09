package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class zzax implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f16210OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Context f16211OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f16212OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f16213OooOoO0;

    public zzax(Context context, String str, boolean z, boolean z2) {
        this.f16211OooOo0O = context;
        this.f16212OooOo0o = str;
        this.f16210OooOo = z;
        this.f16213OooOoO0 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzq();
        Context context = this.f16211OooOo0O;
        AlertDialog.Builder builderZzL = zzs.zzL(context);
        builderZzL.setMessage(this.f16212OooOo0o);
        if (this.f16210OooOo) {
            builderZzL.setTitle("Error");
        } else {
            builderZzL.setTitle("Info");
        }
        if (this.f16213OooOoO0) {
            builderZzL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzL.setPositiveButton("Learn More", new zzaw(context));
            builderZzL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzL.create().show();
    }
}

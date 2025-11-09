package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes2.dex */
final class zzaw implements DialogInterface.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Context f16209OooOo0O;

    public zzaw(Context context) {
        this.f16209OooOo0O = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(this.f16209OooOo0O, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

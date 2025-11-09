package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.go */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC1612go implements DialogInterface.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19391OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ JsResult f19392OooOo0o;

    public /* synthetic */ DialogInterfaceOnClickListenerC1612go(JsResult jsResult, int i) {
        this.f19391OooOo0O = i;
        this.f19392OooOo0o = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f19391OooOo0O) {
            case 0:
                this.f19392OooOo0o.cancel();
                break;
            default:
                this.f19392OooOo0o.confirm();
                break;
        }
    }
}

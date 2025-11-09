package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.rg */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2010rg implements DialogInterface.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23852OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f23853OooOo0o;

    public /* synthetic */ DialogInterfaceOnClickListenerC2010rg(Object obj, int i) {
        this.f23852OooOo0O = i;
        this.f23853OooOo0o = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        switch (this.f23852OooOo0O) {
            case 0:
                ((C2047sg) this.f23853OooOo0o).OooOOO0("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.f23853OooOo0o).cancel();
                break;
        }
    }
}

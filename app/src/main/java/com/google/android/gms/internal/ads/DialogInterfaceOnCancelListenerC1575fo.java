package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import com.google.android.gms.ads.internal.overlay.zzm;

/* renamed from: com.google.android.gms.internal.ads.fo */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC1575fo implements DialogInterface.OnCancelListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18985OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f18986OooOo0o;

    public /* synthetic */ DialogInterfaceOnCancelListenerC1575fo(Object obj, int i) {
        this.f18985OooOo0O = i;
        this.f18986OooOo0o = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18985OooOo0O) {
            case 0:
                ((JsResult) this.f18986OooOo0o).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f18986OooOo0o).cancel();
                break;
            default:
                zzm zzmVar = (zzm) this.f18986OooOo0o;
                if (zzmVar != null) {
                    zzmVar.zzb();
                    break;
                }
                break;
        }
    }
}

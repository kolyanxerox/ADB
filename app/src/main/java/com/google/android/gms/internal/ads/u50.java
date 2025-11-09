package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class u50 implements DialogInterface.OnClickListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f24562OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24563OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f24564OooOo0o;

    public /* synthetic */ u50(int i, Object obj, Object obj2) {
        this.f24563OooOo0O = i;
        this.f24564OooOo0o = obj;
        this.f24562OooOo = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f24563OooOo0O) {
            case 0:
                x50 x50Var = (x50) this.f24564OooOo0o;
                x50Var.f25513OooOoOO.OooO00o(x50Var.f25515OooOoo0);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                x50Var.o000O(x50Var.f25515OooOoo0, "rtsdc", map);
                zzm zzmVar = (zzm) this.f24562OooOo;
                if (zzmVar != null) {
                    zzmVar.zzb();
                    break;
                }
                break;
            case 1:
                x50 x50Var2 = (x50) this.f24564OooOo0o;
                x50Var2.f25513OooOoOO.OooO00o(x50Var2.f25515OooOoo0);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                x50Var2.o000O(x50Var2.f25515OooOoo0, "dialog_click", map2);
                zzm zzmVar2 = (zzm) this.f24562OooOo;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                    break;
                }
                break;
            default:
                ((JsPromptResult) this.f24564OooOo0o).confirm(((EditText) this.f24562OooOo).getText().toString());
                break;
        }
    }
}

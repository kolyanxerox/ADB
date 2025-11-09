package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class v50 implements DialogInterface.OnCancelListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ zzm f24848OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24849OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ x50 f24850OooOo0o;

    public /* synthetic */ v50(x50 x50Var, zzm zzmVar, int i) {
        this.f24849OooOo0O = i;
        this.f24850OooOo0o = x50Var;
        this.f24848OooOo = zzmVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f24849OooOo0O) {
            case 0:
                x50 x50Var = this.f24850OooOo0o;
                x50Var.f25513OooOoOO.OooO00o(x50Var.f25515OooOoo0);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                x50Var.o000O(x50Var.f25515OooOoo0, "rtsdc", map);
                zzm zzmVar = this.f24848OooOo;
                if (zzmVar != null) {
                    zzmVar.zzb();
                    break;
                }
                break;
            default:
                x50 x50Var2 = this.f24850OooOo0o;
                x50Var2.f25513OooOoOO.OooO00o(x50Var2.f25515OooOoo0);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                x50Var2.o000O(x50Var2.f25515OooOoo0, "dialog_click", map2);
                zzm zzmVar2 = this.f24848OooOo;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                    break;
                }
                break;
        }
    }
}

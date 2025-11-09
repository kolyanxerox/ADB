package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class t50 implements DialogInterface.OnClickListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f24240OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24241OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f24242OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f24243OooOoO0;

    public t50(C2047sg c2047sg, String str, String str2) {
        this.f24241OooOo0O = 2;
        this.f24242OooOo0o = str;
        this.f24240OooOo = str2;
        this.f24243OooOoO0 = c2047sg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException, Resources.NotFoundException {
        switch (this.f24241OooOo0O) {
            case 0:
                x50 x50Var = (x50) this.f24242OooOo0o;
                x50Var.getClass();
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                x50Var.o000O(x50Var.f25515OooOoo0, "rtsdc", map);
                zzaa zzaaVarZzr = zzv.zzr();
                Activity activity = (Activity) this.f24240OooOo;
                activity.startActivity(zzaaVarZzr.zzf(activity));
                x50Var.o000OO00();
                zzm zzmVar = (zzm) this.f24243OooOoO0;
                if (zzmVar != null) {
                    zzmVar.zzb();
                    break;
                }
                break;
            case 1:
                x50 x50Var2 = (x50) this.f24242OooOo0o;
                x50Var2.getClass();
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "confirm");
                x50Var2.o000O(x50Var2.f25515OooOoo0, "dialog_click", map2);
                x50Var2.o0OoO0o((Activity) this.f24240OooOo, (zzm) this.f24243OooOoO0);
                break;
            default:
                C2047sg c2047sg = (C2047sg) this.f24243OooOoO0;
                DownloadManager downloadManager = (DownloadManager) c2047sg.f24082OooOoO0.getSystemService("download");
                try {
                    String str = (String) this.f24242OooOo0o;
                    String str2 = (String) this.f24240OooOo;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    zzv.zzq();
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    c2047sg.OooOOO0("Could not store picture.");
                }
        }
    }

    public /* synthetic */ t50(x50 x50Var, Activity activity, zzm zzmVar, int i) {
        this.f24241OooOo0O = i;
        this.f24242OooOo0o = x50Var;
        this.f24240OooOo = activity;
        this.f24243OooOoO0 = zzmVar;
    }
}

package Oooo00O;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes2.dex */
public final class o00Oo0 implements DialogInterface.OnClickListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f13823OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13824OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Intent f13825OooOo0o;

    public /* synthetic */ o00Oo0(Intent intent, Object obj, int i) {
        this.f13824OooOo0O = i;
        this.f13825OooOo0o = intent;
        this.f13823OooOo = obj;
    }

    public final void OooO00o() {
        switch (this.f13824OooOo0O) {
            case 0:
                Intent intent = this.f13825OooOo0o;
                if (intent != null) {
                    ((GoogleApiActivity) this.f13823OooOo).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f13825OooOo0o;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.OooOO0O) this.f13823OooOo).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                OooO00o();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}

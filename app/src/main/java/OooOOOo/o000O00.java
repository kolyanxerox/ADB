package OooOooo;

import Oooo00O.o000000O;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class o000O00 extends DialogFragment {

    /* renamed from: OooOo, reason: collision with root package name */
    public AlertDialog f13667OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public AlertDialog f13668OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public DialogInterface.OnCancelListener f13669OooOo0o;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13669OooOo0o;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f13668OooOo0O;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f13667OooOo == null) {
            Activity activity = getActivity();
            o000000O.OooO0oo(activity);
            this.f13667OooOo = new AlertDialog.Builder(activity).create();
        }
        return this.f13667OooOo;
    }
}

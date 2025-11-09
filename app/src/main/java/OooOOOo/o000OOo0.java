package OooOooo;

import Oooo00O.o000000O;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes2.dex */
public class o000OOo0 extends DialogFragment {

    /* renamed from: OooOo, reason: collision with root package name */
    public AlertDialog f13677OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public AlertDialog f13678OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public DialogInterface.OnCancelListener f13679OooOo0o;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13679OooOo0o;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f13678OooOo0O;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f13677OooOo == null) {
            Context context = getContext();
            o000000O.OooO0oo(context);
            this.f13677OooOo = new AlertDialog.Builder(context).create();
        }
        return this.f13677OooOo;
    }
}

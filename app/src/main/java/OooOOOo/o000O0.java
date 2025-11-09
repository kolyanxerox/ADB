package OooOooo;

import OooO0OO.OooO00o;
import OooO0oO.OooOo;
import Oooo00O.o000000O;
import Oooo00O.o00O0O;
import Oooo00O.o00Oo0;
import Oooo0OO.o00oO0o;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.OooOO0O;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes2.dex */
public final class o000O0 extends o000O0Oo {

    /* renamed from: OooO0OO */
    public static final Object f13665OooO0OO = new Object();

    /* renamed from: OooO0Oo */
    public static final o000O0 f13666OooO0Oo = new o000O0();

    public static AlertDialog OooO0o(Activity activity, int i, o00Oo0 o00oo0, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(o00O0O.OooO0O0(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.github.superadb.R.string.common_google_play_services_enable_button) : resources.getString(com.github.superadb.R.string.common_google_play_services_update_button) : resources.getString(com.github.superadb.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, o00oo0);
        }
        String strOooO0OO = o00O0O.OooO0OO(activity, i);
        if (strOooO0OO != null) {
            builder.setTitle(strOooO0OO);
        }
        Log.w("GoogleApiAvailability", OooOo.OooO0o(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void OooO0oO(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                o000OOo0 o000ooo02 = new o000OOo0();
                o000000O.OooO(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                o000ooo02.f13678OooOo0O = alertDialog;
                if (onCancelListener != null) {
                    o000ooo02.f13679OooOo0o = onCancelListener;
                }
                o000ooo02.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        o000O00 o000o002 = new o000O00();
        o000000O.OooO(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        o000o002.f13668OooOo0O = alertDialog;
        if (onCancelListener != null) {
            o000o002.f13669OooOo0o = onCancelListener;
        }
        o000o002.show(fragmentManager, str);
    }

    public final void OooO(Activity activity, OooOO0O oooOO0O, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogOooO0o = OooO0o(activity, i, new o00Oo0(super.OooO0O0(activity, "d", i), oooOO0O, 1), onCancelListener);
        if (alertDialogOooO0o == null) {
            return;
        }
        OooO0oO(activity, alertDialogOooO0o, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void OooO0o0(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogOooO0o = OooO0o(googleApiActivity, i, new o00Oo0(super.OooO0O0(googleApiActivity, "d", i), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogOooO0o == null) {
            return;
        }
        OooO0oO(googleApiActivity, alertDialogOooO0o, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void OooO0oo(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        Log.w("GoogleApiAvailability", OooOo.OooO0oO(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new o00(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strOooO0o0 = i == 6 ? o00O0O.OooO0o0(context, "common_google_play_services_resolution_required_title") : o00O0O.OooO0OO(context, i);
        if (strOooO0o0 == null) {
            strOooO0o0 = context.getResources().getString(com.github.superadb.R.string.common_google_play_services_notification_ticker);
        }
        String strOooO0Oo = (i == 6 || i == 19) ? o00O0O.OooO0Oo(context, "common_google_play_services_resolution_required_text", o00O0O.OooO00o(context)) : o00O0O.OooO0O0(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        o000000O.OooO0oo(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strOooO0o0).setStyle(new NotificationCompat.BigTextStyle().bigText(strOooO0Oo));
        if (o00oO0o.OooOO0o(context)) {
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (o00oO0o.OooOOO0(context)) {
                style.addAction(com.github.superadb.R.drawable.common_full_open_on_phone, resources.getString(com.github.superadb.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(R.drawable.stat_sys_warning).setTicker(resources.getString(com.github.superadb.R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strOooO0Oo);
        }
        if (o00oO0o.OooO0oo()) {
            o000000O.OooOO0(o00oO0o.OooO0oo());
            synchronized (f13665OooO0OO) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.github.superadb.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(OooO00o.OooO0oo(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            style.setChannelId("com.google.android.gms.availability");
        }
        Notification notificationBuild = style.build();
        if (i == 1 || i == 2 || i == 3) {
            o000O.f13660OooO00o.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationBuild);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class x50 extends AbstractBinderC1568fh {

    /* renamed from: OooOooO */
    public static final /* synthetic */ int f25508OooOooO = 0;

    /* renamed from: OooOo */
    public final Context f25509OooOo;

    /* renamed from: OooOo0o */
    public final HashMap f25510OooOo0o;

    /* renamed from: OooOoO */
    public final zzu f25511OooOoO;

    /* renamed from: OooOoO0 */
    public final h20 f25512OooOoO0;

    /* renamed from: OooOoOO */
    public final s50 f25513OooOoOO;

    /* renamed from: OooOoo */
    public String f25514OooOoo;

    /* renamed from: OooOoo0 */
    public String f25515OooOoo0;

    public x50(Context context, s50 s50Var, zzu zzuVar, h20 h20Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f25510OooOo0o = new HashMap();
        this.f25509OooOo = context;
        this.f25512OooOoO0 = h20Var;
        this.f25511OooOoO = zzuVar;
        this.f25513OooOoOO = s50Var;
    }

    public static void o000O0O0(Context context, h20 h20Var, s50 s50Var, String str, String str2, Map map) {
        String strGenerateUrl;
        String str3 = true != zzv.zzp().OooO00o(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (h20Var != null) {
            C1548ey c1548eyOooO00o = h20Var.OooO00o();
            c1548eyOooO00o.OooO0oO("gqi", str);
            c1548eyOooO00o.OooO0oO("action", str2);
            c1548eyOooO00o.OooO0oO("device_connectivity", str3);
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            c1548eyOooO00o.OooO0oO("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                c1548eyOooO00o.OooO0oO((String) entry.getKey(), (String) entry.getValue());
            }
            strGenerateUrl = ((h20) c1548eyOooO00o.f18706OooOo).f19525OooO00o.f20420OooO0o.generateUrl((ConcurrentHashMap) c1548eyOooO00o.f18708OooOo0o);
        } else {
            strGenerateUrl = "";
        }
        String str4 = strGenerateUrl;
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        O0O0 o0o0 = new O0O0(System.currentTimeMillis(), str, str4, 2);
        s50Var.getClass();
        s50Var.OooO0O0(new C1548ey(12, s50Var, o0o0));
    }

    public static final PendingIntent o000O0oO(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return PendingIntent.getService(context, 0, yj0.OooO00o(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return PendingIntent.getActivity(context, 0, yj0.OooO00o(intent, 201326592), 201326592);
    }

    public static String o000O0oo(int i, String str) {
        Resources resourcesOooO0O0 = zzv.zzp().OooO0O0();
        if (resourcesOooO0O0 != null) {
            try {
                return resourcesOooO0O0.getString(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void OooOOo(Intent intent) {
        s50 s50Var = this.f25513OooOoOO;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            C1978ql c1978qlZzp = zzv.zzp();
            Context context = this.f25509OooOo;
            boolean zOooO00o = c1978qlZzp.OooO00o(context);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zOooO00o ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            o000O(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = s50Var.getWritableDatabase();
                if (c == 1) {
                    s50Var.f24005OooO0O0.execute(new o000oOoO(writableDatabase, stringExtra2, this.f25511OooOoO, 6));
                } else {
                    writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                }
            } catch (SQLiteException e) {
                zzo.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void OooOOo0(Oooo0o.OooO0O0 oooO0O0) throws Resources.NotFoundException {
        r50 r50Var = (r50) ((y50) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
        Activity activity = r50Var.f23750OooO00o;
        this.f25515OooOoo0 = r50Var.f23752OooO0OO;
        this.f25514OooOoo = r50Var.f23753OooO0Oo;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO00o)).booleanValue();
        zzm zzmVar = r50Var.f23751OooO0O0;
        if (zBooleanValue) {
            o0OoO0o(activity, zzmVar);
            return;
        }
        o000O(this.f25515OooOoo0, "dialog_impression", mn0.f21307OooOoo0);
        zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(activity);
        builderZzL.setTitle(o000O0oo(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(o000O0oo(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(o000O0oo(R.string.offline_opt_in_confirm, "OK"), new t50(this, activity, zzmVar, 1)).setNegativeButton(o000O0oo(R.string.offline_opt_in_decline, "No thanks"), new u50(1, this, zzmVar)).setOnCancelListener(new v50(this, zzmVar, 1));
        builderZzL.create().show();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void Oooo0O0(Oooo0o.OooO0O0 oooO0O0, zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        p50 p50Var = (p50) this.f25510OooOo0o.get(this.f25515OooOoo0);
        String str5 = p50Var == null ? "" : p50Var.f23223OooO00o;
        zzv.zzr().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentO000O0oO = o000O0oO(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentO000O0oO2 = o000O0oO(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str5)) {
            builder.setContentTitle(o000O0oo(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(o000O0oo(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str5));
        }
        builder.setAutoCancel(true).setDeleteIntent(pendingIntentO000O0oO2).setContentIntent(pendingIntentO000O0oO).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0)).intValue());
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0O0O)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        o000O(str3, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void Oooooo(String[] strArr, int[] iArr, Oooo0o.OooO0O0 oooO0O0) throws Resources.NotFoundException {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                r50 r50Var = (r50) ((y50) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
                Activity activity = r50Var.f23750OooO00o;
                HashMap map = new HashMap();
                int i2 = iArr[i];
                zzm zzmVar = r50Var.f23751OooO0O0;
                if (i2 == 0) {
                    map.put("dialog_action", "confirm");
                    o000OO00();
                    o000OO0o(activity, zzmVar);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVar != null) {
                        zzmVar.zzb();
                    }
                }
                o000O(this.f25515OooOoo0, "asnpdc", map);
                return;
            }
        }
    }

    public final void o000O(String str, String str2, Map map) {
        o000O0O0(this.f25509OooOo, this.f25512OooOoO0, this.f25513OooOoOO, str, str2, map);
    }

    public final void o000O0o0(String str, C2065sy c2065sy) {
        InterfaceC1707j9 interfaceC1707j9;
        String strOooOOOo = c2065sy.OooOOOo();
        String strOooO0O0 = c2065sy.OooO0O0();
        String string = "";
        if (TextUtils.isEmpty(strOooOOOo)) {
            strOooOOOo = strOooO0O0 != null ? strOooO0O0 : "";
        }
        InterfaceC1707j9 interfaceC1707j9OooOO0O = c2065sy.OooOO0O();
        if (interfaceC1707j9OooOO0O != null) {
            try {
                string = interfaceC1707j9OooOO0O.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (c2065sy) {
            interfaceC1707j9 = c2065sy.f24195OooOOoo;
        }
        Drawable drawable = null;
        if (interfaceC1707j9 != null) {
            try {
                Oooo0o.OooO0O0 oooO0O0Zzf = interfaceC1707j9.zzf();
                if (oooO0O0Zzf != null) {
                    drawable = (Drawable) Oooo0o.OooO0OO.o000O0oO(oooO0O0Zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f25510OooOo0o.put(str, new p50(strOooOOOo, string, drawable));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o000OO00() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f25509OooOo
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: android.os.RemoteException -> L21
            com.google.android.gms.ads.internal.util.zzbr r1 = com.google.android.gms.ads.internal.util.zzs.zzA(r0)     // Catch: android.os.RemoteException -> L21
            Oooo0o.OooO0OO r2 = new Oooo0o.OooO0OO     // Catch: android.os.RemoteException -> L21
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L21
            com.google.android.gms.ads.internal.offline.buffering.zza r3 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L21
            java.lang.String r4 = r7.f25514OooOoo     // Catch: android.os.RemoteException -> L21
            java.lang.String r5 = r7.f25515OooOoo0     // Catch: android.os.RemoteException -> L21
            java.util.HashMap r6 = r7.f25510OooOo0o     // Catch: android.os.RemoteException -> L21
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L21
            com.google.android.gms.internal.ads.p50 r6 = (com.google.android.gms.internal.ads.p50) r6     // Catch: android.os.RemoteException -> L21
            if (r6 != 0) goto L23
            java.lang.String r6 = ""
            goto L25
        L21:
            r0 = move-exception
            goto L3e
        L23:
            java.lang.String r6 = r6.f23224OooO0O0     // Catch: android.os.RemoteException -> L21
        L25:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L21
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L21
            if (r2 != 0) goto L44
            Oooo0o.OooO0OO r3 = new Oooo0o.OooO0OO     // Catch: android.os.RemoteException -> L3c
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L3c
            java.lang.String r0 = r7.f25514OooOoo     // Catch: android.os.RemoteException -> L3c
            java.lang.String r4 = r7.f25515OooOoo0     // Catch: android.os.RemoteException -> L3c
            boolean r2 = r1.zzf(r3, r0, r4)     // Catch: android.os.RemoteException -> L3c
            goto L44
        L3c:
            r0 = move-exception
            goto L3f
        L3e:
            r2 = 0
        L3f:
            java.lang.String r1 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
        L44:
            if (r2 != 0) goto L56
            com.google.android.gms.internal.ads.s50 r0 = r7.f25513OooOoOO
            java.lang.String r1 = r7.f25515OooOoo0
            r0.OooO00o(r1)
            java.lang.String r0 = r7.f25515OooOoo0
            com.google.android.gms.internal.ads.mn0 r1 = com.google.android.gms.internal.ads.mn0.f21307OooOoo0
            java.lang.String r2 = "offline_notification_worker_not_scheduled"
            r7.o000O(r0, r2, r1)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x50.o000OO00():void");
    }

    public final void o000OO0o(Activity activity, zzm zzmVar) throws Resources.NotFoundException {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        zzv.zzq();
        AlertDialog.Builder onCancelListener = zzs.zzL(activity).setOnCancelListener(new DialogInterfaceOnCancelListenerC1575fo(zzmVar, 2));
        int i = R.layout.offline_ads_dialog;
        Resources resourcesOooO0O0 = zzv.zzp().OooO0O0();
        if (resourcesOooO0O0 == null) {
            layout = null;
        } else {
            try {
                layout = resourcesOooO0O0.getLayout(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(o000O0oo(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                HashMap map = this.f25510OooOo0o;
                p50 p50Var = (p50) map.get(this.f25515OooOoo0);
                String str = p50Var == null ? "" : p50Var.f23223OooO00o;
                if (!TextUtils.isEmpty(str)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(str);
                }
                p50 p50Var2 = (p50) map.get(this.f25515OooOoo0);
                Drawable drawable = p50Var2 != null ? p50Var2.f23225OooO0OO : null;
                if (drawable != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(o000O0oo(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new w50(alertDialogCreate, timer, zzmVar), 3000L);
    }

    public final void o0OoO0o(Activity activity, zzm zzmVar) throws Resources.NotFoundException {
        zzv.zzq();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            o000OO00();
            o000OO0o(activity, zzmVar);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        mn0 mn0Var = mn0.f21307OooOoo0;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            o000O(this.f25515OooOoo0, "asnpdi", mn0Var);
            return;
        }
        zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(activity);
        builderZzL.setTitle(o000O0oo(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(o000O0oo(R.string.notifications_permission_confirm, "Allow"), new t50(this, activity, zzmVar, 0)).setNegativeButton(o000O0oo(R.string.notifications_permission_decline, "Don't allow"), new u50(0, this, zzmVar)).setOnCancelListener(new v50(this, zzmVar, 0));
        builderZzL.create().show();
        o000O(this.f25515OooOoo0, "rtsdi", mn0Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void zzh() {
        this.f25513OooOoOO.OooO0O0(new p80(this.f25511OooOoO, 19));
    }
}

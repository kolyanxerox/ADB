package o000oo00;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.applovin.shadow.okio.OooO00o;
import com.github.superadb.R;
import com.ironsource.InterfaceC3771vj;
import com.nextaix.common.helper.MdnsForegroundService;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public HashMap f31099OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f31100OooO0O0;

    public static void OooO0Oo(ContextWrapper contextWrapper, String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        if (str.equals("StopPair")) {
            ((NotificationManager) contextWrapper.getSystemService(NotificationManager.class)).cancel(2001);
            return;
        }
        int i = ("PairingSuccess".equals(str) || "PairingFailed".equals(str)) ? InterfaceC3771vj.b.f12380b : 2001;
        NotificationCompat.Builder visibility = new NotificationCompat.Builder(contextWrapper, "pairing_input_channel").setContentTitle(str2).setContentText(str3).setSmallIcon(R.mipmap.ic_launcher).setOngoing(false).setAutoCancel(false).setPriority(1).setCategory(NotificationCompat.CATEGORY_SYSTEM).setVisibility(1);
        NotificationManager notificationManager = (NotificationManager) contextWrapper.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.notify(i, visibility.build());
        }
    }

    public final void OooO00o(MdnsForegroundService mdnsForegroundService) {
        if (this.f31100OooO0O0) {
            return;
        }
        this.f31100OooO0O0 = true;
        if (Build.VERSION.SDK_INT >= 26) {
            String str = (String) this.f31099OooO00o.get("channelTitle");
            if (str == null || str.isEmpty()) {
                str = "Discover wireless pairing";
            }
            String str2 = (String) this.f31099OooO00o.get("channelDescription");
            if (str2 == null || str2.isEmpty()) {
                str2 = "Foreground service notification for automatic wireless pairing discovery";
            }
            NotificationChannel notificationChannelOooO0OO = OooO00o.OooO0OO(str);
            notificationChannelOooO0OO.setDescription(str2);
            notificationChannelOooO0OO.setShowBadge(false);
            notificationChannelOooO0OO.enableVibration(false);
            notificationChannelOooO0OO.setSound(null, null);
            NotificationManager notificationManager = (NotificationManager) mdnsForegroundService.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelOooO0OO);
            }
        }
    }

    public final String OooO0O0(String str) {
        return (String) this.f31099OooO00o.get(str);
    }

    public final void OooO0OO(Context context) {
        RemoteInput remoteInputBuild = new RemoteInput.Builder("key_text_reply").setLabel(OooO0O0("notificationPairHintText")).build();
        Intent intent = new Intent(context, (Class<?>) MdnsForegroundService.class);
        intent.setAction("com.nextaix.androidtoolbox.PAIR_INPUT");
        if (Build.VERSION.SDK_INT >= 26) {
            PendingIntent foregroundService = PendingIntent.getForegroundService(context, 0, intent, 167772160);
            NotificationCompat.Action actionBuild = new NotificationCompat.Action.Builder(R.mipmap.ic_launcher, OooO0O0("notificationPairButtonText"), foregroundService).addRemoteInput(remoteInputBuild).build();
            String strOooO0O0 = OooO0O0("notificationPairTitle");
            NotificationCompat.Builder builderAddAction = new NotificationCompat.Builder(context, "pairing_input_channel").setContentTitle(strOooO0O0).setContentText(OooO0O0("notificationPairDescription")).setSmallIcon(R.mipmap.ic_launcher).setContentIntent(foregroundService).setOngoing(true).setAutoCancel(false).setPriority(1).setCategory(NotificationCompat.CATEGORY_SYSTEM).setVisibility(1).addAction(actionBuild);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(2001, builderAddAction.build());
            }
        }
    }
}

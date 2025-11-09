package com.nextaix.common.helper;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.github.superadb.R;
import io.flutter.plugin.common.MethodChannel;
import o000oo00.Oooo000;
import o000oo00.o000oOoO;
import o000oo00.o0OOO0o;
import o000oo00.o0ooOOo;
import o000oo00.oo000o;

/* loaded from: classes2.dex */
public class MdnsForegroundService extends Service {

    /* renamed from: OooOo */
    public final Handler f28610OooOo = new Handler(Looper.getMainLooper());

    /* renamed from: OooOo0O */
    public Oooo000 f28611OooOo0O;

    /* renamed from: OooOo0o */
    public Oooo000 f28612OooOo0o;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        o0OOO0o o0ooo0o = o0ooOOo.f31103OooO00o;
        o0ooo0o.OooO00o(this);
        Notification notificationBuild = new NotificationCompat.Builder(this, "pairing_input_channel").setContentTitle(o0ooo0o.OooO0O0("notificationPairTitle")).setContentText(o0ooo0o.OooO0O0("notificationPairSearching")).setSmallIcon(R.mipmap.ic_launcher).setOngoing(true).setAutoCancel(false).setPriority(1).setCategory(NotificationCompat.CATEGORY_SERVICE).setVisibility(1).build();
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(2001, notificationBuild, -1);
        } else {
            startForeground(2001, notificationBuild);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        stopForeground(true);
        if (Build.VERSION.SDK_INT >= 30) {
            Oooo000 oooo000 = this.f28611OooOo0O;
            if (oooo000 != null) {
                oooo000.OooO0OO();
            }
            Oooo000 oooo0002 = this.f28612OooOo0o;
            if (oooo0002 != null) {
                oooo0002.OooO0OO();
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("type");
        if (stringExtra != null && stringExtra.equals("Searching")) {
            o0OOO0o o0ooo0o = o0ooOOo.f31103OooO00o;
            o0OOO0o.OooO0Oo(this, "Searching", o0ooo0o.OooO0O0("notificationPairTitle"), o0ooo0o.OooO0O0("notificationPairSearching"));
            if (Build.VERSION.SDK_INT >= 30) {
                Oooo000 oooo000 = new Oooo000(this, "_adb-tls-connect._tcp", new oo000o(this, 0));
                this.f28611OooOo0O = oooo000;
                oooo000.OooO0O0();
                Oooo000 oooo0002 = new Oooo000(this, "_adb-tls-pairing._tcp", new oo000o(this, 1));
                this.f28612OooOo0o = oooo0002;
                oooo0002.OooO0O0();
            }
        }
        if (action == null || !action.equals("com.nextaix.androidtoolbox.PAIR_INPUT")) {
            return 2;
        }
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            String string = resultsFromIntent.getCharSequence("key_text_reply").toString();
            MethodChannel methodChannel = o000oOoO.f31097OooO0O0.f31098OooO00o;
            if (methodChannel != null) {
                methodChannel.invokeMethod("onJsonReceived", "{\"pairCode\":\"" + string + "\"}");
            }
        }
        ((NotificationManager) getSystemService(NotificationManager.class)).cancel(2001);
        return 2;
    }
}

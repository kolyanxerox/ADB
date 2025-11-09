package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static String f28665OooO00o = "";

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(intent, "intent");
        ComponentName componentName = Build.VERSION.SDK_INT >= 33 ? (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (componentName != null) {
            String strFlattenToString = componentName.flattenToString();
            OooOo.OooO0Oo(strFlattenToString, "flattenToString(...)");
            f28665OooO00o = strFlattenToString;
        }
    }
}

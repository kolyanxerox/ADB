package OoooO00;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.internal.zabx;

/* loaded from: classes2.dex */
public abstract class OooOOOO extends ContextCompat {
    public static void OooO00o(Context context, zabx zabxVar, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(zabxVar, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(zabxVar, intentFilter);
        }
    }
}

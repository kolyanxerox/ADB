package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import java.util.Locale;

@TargetApi(28)
/* loaded from: classes2.dex */
public class zzx extends zzv {
    public static final /* synthetic */ WindowInsets OooO00o(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzv.zzp().OooO0Oo().zzj() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                zzj zzjVarOooO0Oo = com.google.android.gms.ads.internal.zzv.zzp().OooO0Oo();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    Locale locale = Locale.US;
                    String str = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                zzjVarOooO0Oo.zzy(strConcat);
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().OooO0Oo().zzy("");
            }
        }
        OooO0O0(activity, false);
        return view.onApplyWindowInsets(windowInsets);
    }

    public static final void OooO0O0(Activity activity, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzk(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.f17769o000)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().OooO0Oo().zzj() == null && !activity.isInMultiWindowMode()) {
            OooO0O0(activity, true);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.OooO00o(activity, view, windowInsets);
                }
            });
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* loaded from: classes2.dex */
public abstract class yj0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ClipData f25929OooO00o = ClipData.newIntent("", new Intent());

    public static Intent OooO00o(Intent intent, int i) {
        ii0.OoooOoo("Must set component on Intent.", intent.getComponent() != null);
        if (OooO0O0(0, 1)) {
            ii0.OoooOoo("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !OooO0O0(i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        } else {
            ii0.OoooOoo("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", OooO0O0(i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        }
        Intent intent2 = new Intent(intent);
        if (!OooO0O0(i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!OooO0O0(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!OooO0O0(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!OooO0O0(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!OooO0O0(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f25929OooO00o);
            }
        }
        return intent2;
    }

    public static boolean OooO0O0(int i, int i2) {
        return (i & i2) == i2;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: com.google.android.gms.internal.ads.ps */
/* loaded from: classes2.dex */
public abstract class AbstractC1948ps {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final String f23419OooO00o = Integer.toString(0, 36);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final String f23420OooO0O0 = Integer.toString(1, 36);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final String f23421OooO0OO = Integer.toString(2, 36);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f23422OooO0Oo = Integer.toString(3, 36);

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final String f23423OooO0o0 = Integer.toString(4, 36);

    public static Bundle OooO00o(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f23419OooO00o, spanned.getSpanStart(obj));
        bundle2.putInt(f23420OooO0O0, spanned.getSpanEnd(obj));
        bundle2.putInt(f23421OooO0OO, spanned.getSpanFlags(obj));
        bundle2.putInt(f23422OooO0Oo, i);
        if (bundle != null) {
            bundle2.putBundle(f23423OooO0o0, bundle);
        }
        return bundle2;
    }
}

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.zzau;

@VisibleForTesting
/* loaded from: classes2.dex */
final class zzh extends RelativeLayout {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zzau f16121OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f16122OooOo0o;

    public zzh(Context context, String str, String str2, String str3) {
        super(context);
        zzau zzauVar = new zzau(context, str);
        this.f16121OooOo0O = zzauVar;
        zzauVar.zzo(str2);
        zzauVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f16122OooOo0o) {
            return false;
        }
        this.f16121OooOo0O.zzm(motionEvent);
        return false;
    }
}

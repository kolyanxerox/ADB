package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.AbstractC1448c7;

/* loaded from: classes2.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ImageButton f16159OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final zzag f16160OooOo0o;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzu(android.content.Context r6, com.google.android.gms.ads.internal.overlay.zzt r7, @androidx.annotation.Nullable com.google.android.gms.ads.internal.overlay.zzag r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzu.<init>(android.content.Context, com.google.android.gms.ads.internal.overlay.zzt, com.google.android.gms.ads.internal.overlay.zzag):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzag zzagVar = this.f16160OooOo0o;
        if (zzagVar != null) {
            zzagVar.zzj();
        }
    }

    public final void zzb(boolean z) {
        ImageButton imageButton = this.f16159OooOo0O;
        if (!z) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17801o0000oOo)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }
}

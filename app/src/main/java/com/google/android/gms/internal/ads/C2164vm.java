package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: com.google.android.gms.internal.ads.vm */
/* loaded from: classes2.dex */
public final class C2164vm implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: OooO00o */
    public final AudioManager f24996OooO00o;

    /* renamed from: OooO0O0 */
    public final AbstractC1684im f24997OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f24998OooO0OO;

    /* renamed from: OooO0Oo */
    public boolean f24999OooO0Oo;

    /* renamed from: OooO0o */
    public float f25000OooO0o = 1.0f;

    /* renamed from: OooO0o0 */
    public boolean f25001OooO0o0;

    public C2164vm(Context context, AbstractC1684im abstractC1684im) {
        this.f24996OooO00o = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f24997OooO0O0 = abstractC1684im;
    }

    public final void OooO00o() {
        boolean z = this.f24999OooO0Oo;
        AbstractC1684im abstractC1684im = this.f24997OooO0O0;
        AudioManager audioManager = this.f24996OooO00o;
        if (!z || this.f25001OooO0o0 || this.f25000OooO0o <= 0.0f) {
            if (this.f24998OooO0OO) {
                if (audioManager != null) {
                    this.f24998OooO0OO = audioManager.abandonAudioFocus(this) == 0;
                }
                abstractC1684im.zzn();
                return;
            }
            return;
        }
        if (this.f24998OooO0OO) {
            return;
        }
        if (audioManager != null) {
            this.f24998OooO0OO = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        abstractC1684im.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f24998OooO0OO = i > 0;
        this.f24997OooO0O0.zzn();
    }
}

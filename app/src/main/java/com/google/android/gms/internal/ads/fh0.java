package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fh0 extends ContentObserver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18948OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AudioManager f18949OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public float f18950OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final oh0 f18951OooO0Oo;

    public fh0(Handler handler, Context context, oh0 oh0Var) {
        super(handler);
        this.f18948OooO00o = context;
        this.f18949OooO0O0 = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f18951OooO0Oo = oh0Var;
    }

    public final float OooO00o() {
        AudioManager audioManager = this.f18949OooO0O0;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
        }
        return f;
    }

    public final void OooO0O0() {
        float f = this.f18950OooO0OO;
        oh0 oh0Var = this.f18951OooO0Oo;
        oh0Var.f22995OooO00o = f;
        if (oh0Var.f22997OooO0OO == null) {
            oh0Var.f22997OooO0OO = ih0.f20045OooO0OO;
        }
        Iterator it = Collections.unmodifiableCollection(oh0Var.f22997OooO0OO.f20047OooO0O0).iterator();
        while (it.hasNext()) {
            sh0 sh0Var = ((yg0) it.next()).f25909OooO0Oo;
            ze0.OooOooo(sh0Var.OooO00o(), "setDeviceVolume", Float.valueOf(f), sh0Var.f24087OooO00o);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fOooO00o = OooO00o();
        if (fOooO00o != this.f18950OooO0OO) {
            this.f18950OooO0OO = fOooO00o;
            OooO0O0();
        }
    }
}

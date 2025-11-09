package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class j31 extends ii0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f20172OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f20173OooOo0o;

    public j31(String str, int i) {
        this.f20173OooOo0o = i;
        switch (i) {
            case 1:
                this.f20172OooOo = Logger.getLogger(str);
                break;
            default:
                this.f20172OooOo = str;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void OooOOO(String str) {
        switch (this.f20173OooOo0o) {
            case 0:
                String str2 = (String) this.f20172OooOo;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb.append(str2);
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb.append(str);
                Log.d("isoparser", sb.toString());
                break;
            default:
                ((Logger) this.f20172OooOo).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}

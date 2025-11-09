package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.wz0;
import java.util.Map;

/* loaded from: classes2.dex */
public class CsiUrlBuilder {

    /* renamed from: OooO00o */
    public final String f16649OooO00o = (String) wz0.f25458OooOo00.OooOOO();

    @NonNull
    public String generateUrl(@NonNull Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f16649OooO00o).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}

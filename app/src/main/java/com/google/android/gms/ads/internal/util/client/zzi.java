package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzi implements zzk {
    public final /* synthetic */ String zza;

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter) throws IOException {
        Object obj = zzl.f16178OooO0O0;
        jsonWriter.name("params").beginObject();
        String str = this.zza;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}

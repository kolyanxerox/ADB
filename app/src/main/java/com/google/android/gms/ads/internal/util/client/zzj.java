package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzj implements zzk {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzj(int i, Map map) {
        this.zza = i;
        this.zzb = map;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter) throws IOException {
        int i = this.zza;
        Map map = this.zzb;
        Object obj = zzl.f16178OooO0O0;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzl.OooO0O0(jsonWriter, map);
        jsonWriter.endObject();
    }
}

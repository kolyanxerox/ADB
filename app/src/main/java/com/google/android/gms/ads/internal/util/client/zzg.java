package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import com.ironsource.C3034d9;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzg implements zzk {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;
    public final /* synthetic */ byte[] zzd;

    public /* synthetic */ zzg(String str, String str2, Map map, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = map;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter) throws IOException {
        String str = this.zza;
        String str2 = this.zzb;
        Map map = this.zzc;
        byte[] bArr = this.zzd;
        Object obj = zzl.f16178OooO0O0;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzl.OooO0O0(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(C3034d9.h.f8065E0).value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}

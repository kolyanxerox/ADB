package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.AbstractC1817m8;
import com.google.android.gms.internal.ads.oOo0o00;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbu extends QueryInfoGenerationCallback {

    /* renamed from: OooO00o */
    public final /* synthetic */ String f16583OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ TaggingLibraryJsInterface f16584OooO0O0;

    public zzbu(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f16583OooO00o = str;
        this.f16584OooO0O0 = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean zBooleanValue = ((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue();
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f16584OooO0O0;
        String strConcat = zBooleanValue ? ",\"as\":".concat(taggingLibraryJsInterface.f16484OooOO0O.zza().toString()) : "";
        Locale locale = Locale.getDefault();
        oOo0o00 ooo0o00 = AbstractC1817m8.f21131OooO0OO;
        final String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f16583OooO00o, str, Long.valueOf(((Boolean) ooo0o00.OooOOO()).booleanValue() ? ((Long) AbstractC1817m8.f21133OooO0o.OooOOO()).longValue() : 0L), strConcat);
        if (((Boolean) ooo0o00.OooOOO()).booleanValue()) {
            try {
                taggingLibraryJsInterface.f16482OooO0oo.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.f16584OooO0O0.f16476OooO0O0.evaluateJavascript(str2, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().OooO0oO("TaggingLibraryJsInterface.getQueryInfo.onFailure", e);
            }
        } else {
            taggingLibraryJsInterface.f16476OooO0O0.evaluateJavascript(str2, null);
        }
        if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue() && ((Boolean) AbstractC1817m8.f21130OooO0O0.OooOOO()).booleanValue()) {
            taggingLibraryJsInterface.OooOO0o.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) throws JSONException {
        final String str;
        String str2 = this.f16583OooO00o;
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f16584OooO0O0;
        zzf zzfVar = taggingLibraryJsInterface.f16484OooOO0O;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue() ? ((Long) AbstractC1817m8.f21133OooO0o.OooOOO()).longValue() : 0L);
            if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue()) {
                jSONObject.put("as", zzfVar.zza());
            }
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, queryInfo.getQuery(), Long.valueOf(((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue() ? ((Long) AbstractC1817m8.f21133OooO0o.OooOOO()).longValue() : 0L), ((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue() ? ",\"as\":".concat(zzfVar.zza().toString()) : "");
        }
        if (((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue()) {
            try {
                taggingLibraryJsInterface.f16482OooO0oo.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.f16584OooO0O0.f16476OooO0O0.evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().OooO0oO("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e);
            }
        } else {
            taggingLibraryJsInterface.f16476OooO0O0.evaluateJavascript(str, null);
        }
        if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue() && ((Boolean) AbstractC1817m8.f21130OooO0O0.OooOOO()).booleanValue()) {
            taggingLibraryJsInterface.OooOO0o.zzb();
        }
    }
}

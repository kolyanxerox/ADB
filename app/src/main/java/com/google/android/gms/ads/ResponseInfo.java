package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ResponseInfo {

    /* renamed from: OooO00o */
    public final zzdy f15916OooO00o;

    /* renamed from: OooO0O0 */
    public final ArrayList f15917OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO */
    public final AdapterResponseInfo f15918OooO0OO;

    public ResponseInfo(zzdy zzdyVar) {
        this.f15916OooO00o = zzdyVar;
        if (zzdyVar != null) {
            try {
                List listZzj = zzdyVar.zzj();
                if (listZzj != null) {
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo adapterResponseInfoZza = AdapterResponseInfo.zza((zzw) it.next());
                        if (adapterResponseInfoZza != null) {
                            this.f15917OooO0O0.add(adapterResponseInfoZza);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzo.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdy zzdyVar2 = this.f15916OooO00o;
        if (zzdyVar2 == null) {
            return;
        }
        try {
            zzw zzwVarZzf = zzdyVar2.zzf();
            if (zzwVarZzf != null) {
                this.f15918OooO0OO = AdapterResponseInfo.zza(zzwVarZzf);
            }
        } catch (RemoteException e2) {
            zzo.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    @Nullable
    public static ResponseInfo zza(@Nullable zzdy zzdyVar) {
        if (zzdyVar != null) {
            return new ResponseInfo(zzdyVar);
        }
        return null;
    }

    @NonNull
    public static ResponseInfo zzb(@Nullable zzdy zzdyVar) {
        return new ResponseInfo(zzdyVar);
    }

    @NonNull
    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.f15917OooO0O0;
    }

    @Nullable
    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.f15918OooO0OO;
    }

    @Nullable
    public String getMediationAdapterClassName() {
        try {
            zzdy zzdyVar = this.f15916OooO00o;
            if (zzdyVar != null) {
                return zzdyVar.zzg();
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @NonNull
    public Bundle getResponseExtras() {
        try {
            zzdy zzdyVar = this.f15916OooO00o;
            if (zzdyVar != null) {
                return zzdyVar.zze();
            }
        } catch (RemoteException e) {
            zzo.zzh("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    @Nullable
    public String getResponseId() {
        try {
            zzdy zzdyVar = this.f15916OooO00o;
            if (zzdyVar != null) {
                return zzdyVar.zzi();
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @NonNull
    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Nullable
    @VisibleForTesting
    public final zzdy zzc() {
        return this.f15916OooO00o;
    }

    @NonNull
    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f15917OooO0O0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((AdapterResponseInfo) obj).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.f15918OooO0OO;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzbc.zzb().zzi(responseExtras));
        }
        return jSONObject;
    }
}
